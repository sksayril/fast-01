package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class a8 extends z6<Double> implements oa, RandomAccess {

    /* renamed from: p  reason: collision with root package name */
    private static final a8 f5083p = new a8(new double[0], 0, false);

    /* renamed from: n  reason: collision with root package name */
    private double[] f5084n;

    /* renamed from: o  reason: collision with root package name */
    private int f5085o;

    a8() {
        this(new double[10], 0, true);
    }

    private a8(double[] dArr, int i10, boolean z9) {
        super(z9);
        this.f5084n = dArr;
        this.f5085o = i10;
    }

    private final String f(int i10) {
        int i11 = this.f5085o;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void g(int i10) {
        if (i10 < 0 || i10 >= this.f5085o) {
            throw new IndexOutOfBoundsException(f(i10));
        }
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        double doubleValue = ((Double) obj).doubleValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f5085o)) {
            throw new IndexOutOfBoundsException(f(i10));
        }
        double[] dArr = this.f5084n;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[(((i11 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f5084n, i10, dArr2, i10 + 1, this.f5085o - i10);
            this.f5084n = dArr2;
        }
        this.f5084n[i10] = doubleValue;
        this.f5085o++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        d(((Double) obj).doubleValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Double> collection) {
        c();
        r8.e(collection);
        if (!(collection instanceof a8)) {
            return super.addAll(collection);
        }
        a8 a8Var = (a8) collection;
        int i10 = a8Var.f5085o;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f5085o;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f5084n;
            if (i12 > dArr.length) {
                this.f5084n = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(a8Var.f5084n, 0, this.f5084n, this.f5085o, a8Var.f5085o);
            this.f5085o = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(double d10) {
        c();
        int i10 = this.f5085o;
        double[] dArr = this.f5084n;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[(((i10 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f5084n = dArr2;
        }
        double[] dArr3 = this.f5084n;
        int i11 = this.f5085o;
        this.f5085o = i11 + 1;
        dArr3[i11] = d10;
    }

    public final /* synthetic */ y8 e(int i10) {
        if (i10 >= this.f5085o) {
            return new a8(Arrays.copyOf(this.f5084n, i10), this.f5085o, true);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8)) {
            return super.equals(obj);
        }
        a8 a8Var = (a8) obj;
        if (this.f5085o != a8Var.f5085o) {
            return false;
        }
        double[] dArr = a8Var.f5084n;
        for (int i10 = 0; i10 < this.f5085o; i10++) {
            if (Double.doubleToLongBits(this.f5084n[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        g(i10);
        return Double.valueOf(this.f5084n[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f5085o; i11++) {
            i10 = (i10 * 31) + r8.b(Double.doubleToLongBits(this.f5084n[i11]));
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f5084n[i10] == doubleValue) {
                return i10;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i10) {
        c();
        g(i10);
        double[] dArr = this.f5084n;
        double d10 = dArr[i10];
        int i11 = this.f5085o;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f5085o--;
        this.modCount++;
        return Double.valueOf(d10);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i10, int i11) {
        c();
        if (i11 >= i10) {
            double[] dArr = this.f5084n;
            System.arraycopy(dArr, i11, dArr, i10, this.f5085o - i11);
            this.f5085o -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        c();
        g(i10);
        double[] dArr = this.f5084n;
        double d10 = dArr[i10];
        dArr[i10] = doubleValue;
        return Double.valueOf(d10);
    }

    public final int size() {
        return this.f5085o;
    }
}
