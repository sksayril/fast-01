package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class m extends c<Double> implements a0.b, RandomAccess, a1 {

    /* renamed from: p  reason: collision with root package name */
    private static final m f2030p;

    /* renamed from: n  reason: collision with root package name */
    private double[] f2031n;

    /* renamed from: o  reason: collision with root package name */
    private int f2032o;

    static {
        m mVar = new m(new double[0], 0);
        f2030p = mVar;
        mVar.m();
    }

    m() {
        this(new double[10], 0);
    }

    private m(double[] dArr, int i10) {
        this.f2031n = dArr;
        this.f2032o = i10;
    }

    private void i(int i10, double d10) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f2032o)) {
            throw new IndexOutOfBoundsException(y(i10));
        }
        double[] dArr = this.f2031n;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[(((i11 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f2031n, i10, dArr2, i10 + 1, this.f2032o - i10);
            this.f2031n = dArr2;
        }
        this.f2031n[i10] = d10;
        this.f2032o++;
        this.modCount++;
    }

    private void k(int i10) {
        if (i10 < 0 || i10 >= this.f2032o) {
            throw new IndexOutOfBoundsException(y(i10));
        }
    }

    private String y(int i10) {
        return "Index:" + i10 + ", Size:" + this.f2032o;
    }

    /* renamed from: A */
    public Double remove(int i10) {
        c();
        k(i10);
        double[] dArr = this.f2031n;
        double d10 = dArr[i10];
        int i11 = this.f2032o;
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f2032o--;
        this.modCount++;
        return Double.valueOf(d10);
    }

    /* renamed from: B */
    public Double set(int i10, Double d10) {
        return Double.valueOf(C(i10, d10.doubleValue()));
    }

    public double C(int i10, double d10) {
        c();
        k(i10);
        double[] dArr = this.f2031n;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    public boolean addAll(Collection<? extends Double> collection) {
        c();
        a0.a(collection);
        if (!(collection instanceof m)) {
            return super.addAll(collection);
        }
        m mVar = (m) collection;
        int i10 = mVar.f2032o;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f2032o;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            double[] dArr = this.f2031n;
            if (i12 > dArr.length) {
                this.f2031n = Arrays.copyOf(dArr, i12);
            }
            System.arraycopy(mVar.f2031n, 0, this.f2031n, this.f2032o, mVar.f2032o);
            this.f2032o = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: d */
    public void add(int i10, Double d10) {
        i(i10, d10.doubleValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return super.equals(obj);
        }
        m mVar = (m) obj;
        if (this.f2032o != mVar.f2032o) {
            return false;
        }
        double[] dArr = mVar.f2031n;
        for (int i10 = 0; i10 < this.f2032o; i10++) {
            if (Double.doubleToLongBits(this.f2031n[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean add(Double d10) {
        g(d10.doubleValue());
        return true;
    }

    public void g(double d10) {
        c();
        int i10 = this.f2032o;
        double[] dArr = this.f2031n;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[(((i10 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f2031n = dArr2;
        }
        double[] dArr3 = this.f2031n;
        int i11 = this.f2032o;
        this.f2032o = i11 + 1;
        dArr3[i11] = d10;
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f2032o; i11++) {
            i10 = (i10 * 31) + a0.f(Double.doubleToLongBits(this.f2031n[i11]));
        }
        return i10;
    }

    /* renamed from: l */
    public Double get(int i10) {
        return Double.valueOf(o(i10));
    }

    public double o(int i10) {
        k(i10);
        return this.f2031n[i10];
    }

    public boolean remove(Object obj) {
        c();
        for (int i10 = 0; i10 < this.f2032o; i10++) {
            if (obj.equals(Double.valueOf(this.f2031n[i10]))) {
                double[] dArr = this.f2031n;
                System.arraycopy(dArr, i10 + 1, dArr, i10, (this.f2032o - i10) - 1);
                this.f2032o--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i10, int i11) {
        c();
        if (i11 >= i10) {
            double[] dArr = this.f2031n;
            System.arraycopy(dArr, i11, dArr, i10, this.f2032o - i11);
            this.f2032o -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f2032o;
    }

    /* renamed from: z */
    public a0.b q(int i10) {
        if (i10 >= this.f2032o) {
            return new m(Arrays.copyOf(this.f2031n, i10), this.f2032o);
        }
        throw new IllegalArgumentException();
    }
}
