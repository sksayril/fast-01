package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class w extends c<Float> implements a0.f, RandomAccess, a1 {

    /* renamed from: p  reason: collision with root package name */
    private static final w f2120p;

    /* renamed from: n  reason: collision with root package name */
    private float[] f2121n;

    /* renamed from: o  reason: collision with root package name */
    private int f2122o;

    static {
        w wVar = new w(new float[0], 0);
        f2120p = wVar;
        wVar.m();
    }

    w() {
        this(new float[10], 0);
    }

    private w(float[] fArr, int i10) {
        this.f2121n = fArr;
        this.f2122o = i10;
    }

    private void i(int i10, float f10) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f2122o)) {
            throw new IndexOutOfBoundsException(y(i10));
        }
        float[] fArr = this.f2121n;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[(((i11 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f2121n, i10, fArr2, i10 + 1, this.f2122o - i10);
            this.f2121n = fArr2;
        }
        this.f2121n[i10] = f10;
        this.f2122o++;
        this.modCount++;
    }

    private void k(int i10) {
        if (i10 < 0 || i10 >= this.f2122o) {
            throw new IndexOutOfBoundsException(y(i10));
        }
    }

    private String y(int i10) {
        return "Index:" + i10 + ", Size:" + this.f2122o;
    }

    /* renamed from: A */
    public Float remove(int i10) {
        c();
        k(i10);
        float[] fArr = this.f2121n;
        float f10 = fArr[i10];
        int i11 = this.f2122o;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f2122o--;
        this.modCount++;
        return Float.valueOf(f10);
    }

    /* renamed from: B */
    public Float set(int i10, Float f10) {
        return Float.valueOf(C(i10, f10.floatValue()));
    }

    public float C(int i10, float f10) {
        c();
        k(i10);
        float[] fArr = this.f2121n;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    public boolean addAll(Collection<? extends Float> collection) {
        c();
        a0.a(collection);
        if (!(collection instanceof w)) {
            return super.addAll(collection);
        }
        w wVar = (w) collection;
        int i10 = wVar.f2122o;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f2122o;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f2121n;
            if (i12 > fArr.length) {
                this.f2121n = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(wVar.f2121n, 0, this.f2121n, this.f2122o, wVar.f2122o);
            this.f2122o = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: d */
    public void add(int i10, Float f10) {
        i(i10, f10.floatValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return super.equals(obj);
        }
        w wVar = (w) obj;
        if (this.f2122o != wVar.f2122o) {
            return false;
        }
        float[] fArr = wVar.f2121n;
        for (int i10 = 0; i10 < this.f2122o; i10++) {
            if (Float.floatToIntBits(this.f2121n[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean add(Float f10) {
        g(f10.floatValue());
        return true;
    }

    public void g(float f10) {
        c();
        int i10 = this.f2122o;
        float[] fArr = this.f2121n;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[(((i10 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f2121n = fArr2;
        }
        float[] fArr3 = this.f2121n;
        int i11 = this.f2122o;
        this.f2122o = i11 + 1;
        fArr3[i11] = f10;
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f2122o; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f2121n[i11]);
        }
        return i10;
    }

    /* renamed from: l */
    public Float get(int i10) {
        return Float.valueOf(o(i10));
    }

    public float o(int i10) {
        k(i10);
        return this.f2121n[i10];
    }

    public boolean remove(Object obj) {
        c();
        for (int i10 = 0; i10 < this.f2122o; i10++) {
            if (obj.equals(Float.valueOf(this.f2121n[i10]))) {
                float[] fArr = this.f2121n;
                System.arraycopy(fArr, i10 + 1, fArr, i10, (this.f2122o - i10) - 1);
                this.f2122o--;
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
            float[] fArr = this.f2121n;
            System.arraycopy(fArr, i11, fArr, i10, this.f2122o - i11);
            this.f2122o -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f2122o;
    }

    /* renamed from: z */
    public a0.f q(int i10) {
        if (i10 >= this.f2122o) {
            return new w(Arrays.copyOf(this.f2121n, i10), this.f2122o);
        }
        throw new IllegalArgumentException();
    }
}
