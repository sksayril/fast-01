package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class d7 extends z6<Boolean> implements oa, RandomAccess {

    /* renamed from: p  reason: collision with root package name */
    private static final d7 f5188p = new d7(new boolean[0], 0, false);

    /* renamed from: n  reason: collision with root package name */
    private boolean[] f5189n;

    /* renamed from: o  reason: collision with root package name */
    private int f5190o;

    d7() {
        this(new boolean[10], 0, true);
    }

    private d7(boolean[] zArr, int i10, boolean z9) {
        super(z9);
        this.f5189n = zArr;
        this.f5190o = i10;
    }

    private final String f(int i10) {
        int i11 = this.f5190o;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void g(int i10) {
        if (i10 < 0 || i10 >= this.f5190o) {
            throw new IndexOutOfBoundsException(f(i10));
        }
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f5190o)) {
            throw new IndexOutOfBoundsException(f(i10));
        }
        boolean[] zArr = this.f5189n;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[(((i11 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f5189n, i10, zArr2, i10 + 1, this.f5190o - i10);
            this.f5189n = zArr2;
        }
        this.f5189n[i10] = booleanValue;
        this.f5190o++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        d(((Boolean) obj).booleanValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Boolean> collection) {
        c();
        r8.e(collection);
        if (!(collection instanceof d7)) {
            return super.addAll(collection);
        }
        d7 d7Var = (d7) collection;
        int i10 = d7Var.f5190o;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f5190o;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f5189n;
            if (i12 > zArr.length) {
                this.f5189n = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(d7Var.f5189n, 0, this.f5189n, this.f5190o, d7Var.f5190o);
            this.f5190o = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(boolean z9) {
        c();
        int i10 = this.f5190o;
        boolean[] zArr = this.f5189n;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[(((i10 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f5189n = zArr2;
        }
        boolean[] zArr3 = this.f5189n;
        int i11 = this.f5190o;
        this.f5190o = i11 + 1;
        zArr3[i11] = z9;
    }

    public final /* synthetic */ y8 e(int i10) {
        if (i10 >= this.f5190o) {
            return new d7(Arrays.copyOf(this.f5189n, i10), this.f5190o, true);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7)) {
            return super.equals(obj);
        }
        d7 d7Var = (d7) obj;
        if (this.f5190o != d7Var.f5190o) {
            return false;
        }
        boolean[] zArr = d7Var.f5189n;
        for (int i10 = 0; i10 < this.f5190o; i10++) {
            if (this.f5189n[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        g(i10);
        return Boolean.valueOf(this.f5189n[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f5190o; i11++) {
            i10 = (i10 * 31) + r8.c(this.f5189n[i11]);
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f5189n[i10] == booleanValue) {
                return i10;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i10) {
        c();
        g(i10);
        boolean[] zArr = this.f5189n;
        boolean z9 = zArr[i10];
        int i11 = this.f5190o;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f5190o--;
        this.modCount++;
        return Boolean.valueOf(z9);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i10, int i11) {
        c();
        if (i11 >= i10) {
            boolean[] zArr = this.f5189n;
            System.arraycopy(zArr, i11, zArr, i10, this.f5190o - i11);
            this.f5190o -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c();
        g(i10);
        boolean[] zArr = this.f5189n;
        boolean z9 = zArr[i10];
        zArr[i10] = booleanValue;
        return Boolean.valueOf(z9);
    }

    public final int size() {
        return this.f5190o;
    }
}
