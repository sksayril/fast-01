package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class o8 extends z6<Float> implements oa, RandomAccess {

    /* renamed from: p  reason: collision with root package name */
    private static final o8 f5491p = new o8(new float[0], 0, false);

    /* renamed from: n  reason: collision with root package name */
    private float[] f5492n;

    /* renamed from: o  reason: collision with root package name */
    private int f5493o;

    o8() {
        this(new float[10], 0, true);
    }

    private o8(float[] fArr, int i10, boolean z9) {
        super(z9);
        this.f5492n = fArr;
        this.f5493o = i10;
    }

    private final String f(int i10) {
        int i11 = this.f5493o;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void g(int i10) {
        if (i10 < 0 || i10 >= this.f5493o) {
            throw new IndexOutOfBoundsException(f(i10));
        }
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        float floatValue = ((Float) obj).floatValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f5493o)) {
            throw new IndexOutOfBoundsException(f(i10));
        }
        float[] fArr = this.f5492n;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[(((i11 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f5492n, i10, fArr2, i10 + 1, this.f5493o - i10);
            this.f5492n = fArr2;
        }
        this.f5492n[i10] = floatValue;
        this.f5493o++;
        this.modCount++;
    }

    public final /* synthetic */ boolean add(Object obj) {
        d(((Float) obj).floatValue());
        return true;
    }

    public final boolean addAll(Collection<? extends Float> collection) {
        c();
        r8.e(collection);
        if (!(collection instanceof o8)) {
            return super.addAll(collection);
        }
        o8 o8Var = (o8) collection;
        int i10 = o8Var.f5493o;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f5493o;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            float[] fArr = this.f5492n;
            if (i12 > fArr.length) {
                this.f5492n = Arrays.copyOf(fArr, i12);
            }
            System.arraycopy(o8Var.f5492n, 0, this.f5492n, this.f5493o, o8Var.f5493o);
            this.f5493o = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(float f10) {
        c();
        int i10 = this.f5493o;
        float[] fArr = this.f5492n;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[(((i10 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f5492n = fArr2;
        }
        float[] fArr3 = this.f5492n;
        int i11 = this.f5493o;
        this.f5493o = i11 + 1;
        fArr3[i11] = f10;
    }

    public final /* synthetic */ y8 e(int i10) {
        if (i10 >= this.f5493o) {
            return new o8(Arrays.copyOf(this.f5492n, i10), this.f5493o, true);
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8)) {
            return super.equals(obj);
        }
        o8 o8Var = (o8) obj;
        if (this.f5493o != o8Var.f5493o) {
            return false;
        }
        float[] fArr = o8Var.f5492n;
        for (int i10 = 0; i10 < this.f5493o; i10++) {
            if (Float.floatToIntBits(this.f5492n[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        g(i10);
        return Float.valueOf(this.f5492n[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f5493o; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f5492n[i11]);
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f5492n[i10] == floatValue) {
                return i10;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i10) {
        c();
        g(i10);
        float[] fArr = this.f5492n;
        float f10 = fArr[i10];
        int i11 = this.f5493o;
        if (i10 < i11 - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (i11 - i10) - 1);
        }
        this.f5493o--;
        this.modCount++;
        return Float.valueOf(f10);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i10, int i11) {
        c();
        if (i11 >= i10) {
            float[] fArr = this.f5492n;
            System.arraycopy(fArr, i11, fArr, i10, this.f5493o - i11);
            this.f5493o -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        c();
        g(i10);
        float[] fArr = this.f5492n;
        float f10 = fArr[i10];
        fArr[i10] = floatValue;
        return Float.valueOf(f10);
    }

    public final int size() {
        return this.f5493o;
    }
}
