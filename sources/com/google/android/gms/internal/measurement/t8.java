package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class t8 extends z6<Integer> implements w8, oa, RandomAccess {

    /* renamed from: p  reason: collision with root package name */
    private static final t8 f5621p = new t8(new int[0], 0, false);

    /* renamed from: n  reason: collision with root package name */
    private int[] f5622n;

    /* renamed from: o  reason: collision with root package name */
    private int f5623o;

    t8() {
        this(new int[10], 0, true);
    }

    private t8(int[] iArr, int i10, boolean z9) {
        super(z9);
        this.f5622n = iArr;
        this.f5623o = i10;
    }

    public static t8 f() {
        return f5621p;
    }

    private final String i(int i10) {
        int i11 = this.f5623o;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void k(int i10) {
        if (i10 < 0 || i10 >= this.f5623o) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f5623o)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        int[] iArr = this.f5622n;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[(((i11 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f5622n, i10, iArr2, i10 + 1, this.f5623o - i10);
            this.f5622n = iArr2;
        }
        this.f5622n[i10] = intValue;
        this.f5623o++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        g(((Integer) obj).intValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        c();
        r8.e(collection);
        if (!(collection instanceof t8)) {
            return super.addAll(collection);
        }
        t8 t8Var = (t8) collection;
        int i10 = t8Var.f5623o;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f5623o;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f5622n;
            if (i12 > iArr.length) {
                this.f5622n = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(t8Var.f5622n, 0, this.f5622n, this.f5623o, t8Var.f5623o);
            this.f5623o = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i10) {
        k(i10);
        return this.f5622n[i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8)) {
            return super.equals(obj);
        }
        t8 t8Var = (t8) obj;
        if (this.f5623o != t8Var.f5623o) {
            return false;
        }
        int[] iArr = t8Var.f5622n;
        for (int i10 = 0; i10 < this.f5623o; i10++) {
            if (this.f5622n[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i10) {
        c();
        int i11 = this.f5623o;
        int[] iArr = this.f5622n;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[(((i11 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f5622n = iArr2;
        }
        int[] iArr3 = this.f5622n;
        int i12 = this.f5623o;
        this.f5623o = i12 + 1;
        iArr3[i12] = i10;
    }

    public final /* synthetic */ Object get(int i10) {
        return Integer.valueOf(d(i10));
    }

    /* renamed from: h */
    public final w8 e(int i10) {
        if (i10 >= this.f5623o) {
            return new t8(Arrays.copyOf(this.f5622n, i10), this.f5623o, true);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f5623o; i11++) {
            i10 = (i10 * 31) + this.f5622n[i11];
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f5622n[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i10) {
        c();
        k(i10);
        int[] iArr = this.f5622n;
        int i11 = iArr[i10];
        int i12 = this.f5623o;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f5623o--;
        this.modCount++;
        return Integer.valueOf(i11);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i10, int i11) {
        c();
        if (i11 >= i10) {
            int[] iArr = this.f5622n;
            System.arraycopy(iArr, i11, iArr, i10, this.f5623o - i11);
            this.f5623o -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        c();
        k(i10);
        int[] iArr = this.f5622n;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    public final int size() {
        return this.f5623o;
    }
}
