package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class f extends c<Boolean> implements a0.a, RandomAccess, a1 {

    /* renamed from: p  reason: collision with root package name */
    private static final f f1920p;

    /* renamed from: n  reason: collision with root package name */
    private boolean[] f1921n;

    /* renamed from: o  reason: collision with root package name */
    private int f1922o;

    static {
        f fVar = new f(new boolean[0], 0);
        f1920p = fVar;
        fVar.m();
    }

    f() {
        this(new boolean[10], 0);
    }

    private f(boolean[] zArr, int i10) {
        this.f1921n = zArr;
        this.f1922o = i10;
    }

    private void g(int i10, boolean z9) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f1922o)) {
            throw new IndexOutOfBoundsException(y(i10));
        }
        boolean[] zArr = this.f1921n;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[(((i11 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f1921n, i10, zArr2, i10 + 1, this.f1922o - i10);
            this.f1921n = zArr2;
        }
        this.f1921n[i10] = z9;
        this.f1922o++;
        this.modCount++;
    }

    private void k(int i10) {
        if (i10 < 0 || i10 >= this.f1922o) {
            throw new IndexOutOfBoundsException(y(i10));
        }
    }

    private String y(int i10) {
        return "Index:" + i10 + ", Size:" + this.f1922o;
    }

    /* renamed from: A */
    public Boolean remove(int i10) {
        c();
        k(i10);
        boolean[] zArr = this.f1921n;
        boolean z9 = zArr[i10];
        int i11 = this.f1922o;
        if (i10 < i11 - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (i11 - i10) - 1);
        }
        this.f1922o--;
        this.modCount++;
        return Boolean.valueOf(z9);
    }

    /* renamed from: B */
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(C(i10, bool.booleanValue()));
    }

    public boolean C(int i10, boolean z9) {
        c();
        k(i10);
        boolean[] zArr = this.f1921n;
        boolean z10 = zArr[i10];
        zArr[i10] = z9;
        return z10;
    }

    public boolean addAll(Collection<? extends Boolean> collection) {
        c();
        a0.a(collection);
        if (!(collection instanceof f)) {
            return super.addAll(collection);
        }
        f fVar = (f) collection;
        int i10 = fVar.f1922o;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f1922o;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            boolean[] zArr = this.f1921n;
            if (i12 > zArr.length) {
                this.f1921n = Arrays.copyOf(zArr, i12);
            }
            System.arraycopy(fVar.f1921n, 0, this.f1921n, this.f1922o, fVar.f1922o);
            this.f1922o = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: d */
    public void add(int i10, Boolean bool) {
        g(i10, bool.booleanValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return super.equals(obj);
        }
        f fVar = (f) obj;
        if (this.f1922o != fVar.f1922o) {
            return false;
        }
        boolean[] zArr = fVar.f1921n;
        for (int i10 = 0; i10 < this.f1922o; i10++) {
            if (this.f1921n[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean add(Boolean bool) {
        i(bool.booleanValue());
        return true;
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f1922o; i11++) {
            i10 = (i10 * 31) + a0.c(this.f1921n[i11]);
        }
        return i10;
    }

    public void i(boolean z9) {
        c();
        int i10 = this.f1922o;
        boolean[] zArr = this.f1921n;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[(((i10 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f1921n = zArr2;
        }
        boolean[] zArr3 = this.f1921n;
        int i11 = this.f1922o;
        this.f1922o = i11 + 1;
        zArr3[i11] = z9;
    }

    /* renamed from: l */
    public Boolean get(int i10) {
        return Boolean.valueOf(o(i10));
    }

    public boolean o(int i10) {
        k(i10);
        return this.f1921n[i10];
    }

    public boolean remove(Object obj) {
        c();
        for (int i10 = 0; i10 < this.f1922o; i10++) {
            if (obj.equals(Boolean.valueOf(this.f1921n[i10]))) {
                boolean[] zArr = this.f1921n;
                System.arraycopy(zArr, i10 + 1, zArr, i10, (this.f1922o - i10) - 1);
                this.f1922o--;
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
            boolean[] zArr = this.f1921n;
            System.arraycopy(zArr, i11, zArr, i10, this.f1922o - i11);
            this.f1922o -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f1922o;
    }

    /* renamed from: z */
    public a0.a q(int i10) {
        if (i10 >= this.f1922o) {
            return new f(Arrays.copyOf(this.f1921n, i10), this.f1922o);
        }
        throw new IllegalArgumentException();
    }
}
