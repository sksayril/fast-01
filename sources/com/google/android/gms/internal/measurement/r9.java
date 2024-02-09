package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class r9 extends z6<Long> implements z8, oa, RandomAccess {

    /* renamed from: p  reason: collision with root package name */
    private static final r9 f5567p = new r9(new long[0], 0, false);

    /* renamed from: n  reason: collision with root package name */
    private long[] f5568n;

    /* renamed from: o  reason: collision with root package name */
    private int f5569o;

    r9() {
        this(new long[10], 0, true);
    }

    private r9(long[] jArr, int i10, boolean z9) {
        super(z9);
        this.f5568n = jArr;
        this.f5569o = i10;
    }

    public static r9 f() {
        return f5567p;
    }

    private final String g(int i10) {
        int i11 = this.f5569o;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void i(int i10) {
        if (i10 < 0 || i10 >= this.f5569o) {
            throw new IndexOutOfBoundsException(g(i10));
        }
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f5569o)) {
            throw new IndexOutOfBoundsException(g(i10));
        }
        long[] jArr = this.f5568n;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[(((i11 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f5568n, i10, jArr2, i10 + 1, this.f5569o - i10);
            this.f5568n = jArr2;
        }
        this.f5568n[i10] = longValue;
        this.f5569o++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        c();
        r8.e(collection);
        if (!(collection instanceof r9)) {
            return super.addAll(collection);
        }
        r9 r9Var = (r9) collection;
        int i10 = r9Var.f5569o;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f5569o;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f5568n;
            if (i12 > jArr.length) {
                this.f5568n = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(r9Var.f5568n, 0, this.f5568n, this.f5569o, r9Var.f5569o);
            this.f5569o = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(long j10) {
        c();
        int i10 = this.f5569o;
        long[] jArr = this.f5568n;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[(((i10 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f5568n = jArr2;
        }
        long[] jArr3 = this.f5568n;
        int i11 = this.f5569o;
        this.f5569o = i11 + 1;
        jArr3[i11] = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9)) {
            return super.equals(obj);
        }
        r9 r9Var = (r9) obj;
        if (this.f5569o != r9Var.f5569o) {
            return false;
        }
        long[] jArr = r9Var.f5568n;
        for (int i10 = 0; i10 < this.f5569o; i10++) {
            if (this.f5568n[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        return Long.valueOf(j(i10));
    }

    /* renamed from: h */
    public final z8 e(int i10) {
        if (i10 >= this.f5569o) {
            return new r9(Arrays.copyOf(this.f5568n, i10), this.f5569o, true);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f5569o; i11++) {
            i10 = (i10 * 31) + r8.b(this.f5568n[i11]);
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f5568n[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    public final long j(int i10) {
        i(i10);
        return this.f5568n[i10];
    }

    public final /* synthetic */ Object remove(int i10) {
        c();
        i(i10);
        long[] jArr = this.f5568n;
        long j10 = jArr[i10];
        int i11 = this.f5569o;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f5569o--;
        this.modCount++;
        return Long.valueOf(j10);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i10, int i11) {
        c();
        if (i11 >= i10) {
            long[] jArr = this.f5568n;
            System.arraycopy(jArr, i11, jArr, i10, this.f5569o - i11);
            this.f5569o -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        c();
        i(i10);
        long[] jArr = this.f5568n;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    public final int size() {
        return this.f5569o;
    }
}
