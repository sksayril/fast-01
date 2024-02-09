package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class z extends c<Integer> implements a0.g, RandomAccess, a1 {

    /* renamed from: p  reason: collision with root package name */
    private static final z f2137p;

    /* renamed from: n  reason: collision with root package name */
    private int[] f2138n;

    /* renamed from: o  reason: collision with root package name */
    private int f2139o;

    static {
        z zVar = new z(new int[0], 0);
        f2137p = zVar;
        zVar.m();
    }

    z() {
        this(new int[10], 0);
    }

    private z(int[] iArr, int i10) {
        this.f2138n = iArr;
        this.f2139o = i10;
    }

    private void i(int i10, int i11) {
        int i12;
        c();
        if (i10 < 0 || i10 > (i12 = this.f2139o)) {
            throw new IndexOutOfBoundsException(y(i10));
        }
        int[] iArr = this.f2138n;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[(((i12 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f2138n, i10, iArr2, i10 + 1, this.f2139o - i10);
            this.f2138n = iArr2;
        }
        this.f2138n[i10] = i11;
        this.f2139o++;
        this.modCount++;
    }

    private void k(int i10) {
        if (i10 < 0 || i10 >= this.f2139o) {
            throw new IndexOutOfBoundsException(y(i10));
        }
    }

    private String y(int i10) {
        return "Index:" + i10 + ", Size:" + this.f2139o;
    }

    /* renamed from: A */
    public Integer remove(int i10) {
        c();
        k(i10);
        int[] iArr = this.f2138n;
        int i11 = iArr[i10];
        int i12 = this.f2139o;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f2139o--;
        this.modCount++;
        return Integer.valueOf(i11);
    }

    /* renamed from: B */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(C(i10, num.intValue()));
    }

    public int C(int i10, int i11) {
        c();
        k(i10);
        int[] iArr = this.f2138n;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    public boolean addAll(Collection<? extends Integer> collection) {
        c();
        a0.a(collection);
        if (!(collection instanceof z)) {
            return super.addAll(collection);
        }
        z zVar = (z) collection;
        int i10 = zVar.f2139o;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f2139o;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f2138n;
            if (i12 > iArr.length) {
                this.f2138n = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(zVar.f2138n, 0, this.f2138n, this.f2139o, zVar.f2139o);
            this.f2139o = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: d */
    public void add(int i10, Integer num) {
        i(i10, num.intValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return super.equals(obj);
        }
        z zVar = (z) obj;
        if (this.f2139o != zVar.f2139o) {
            return false;
        }
        int[] iArr = zVar.f2138n;
        for (int i10 = 0; i10 < this.f2139o; i10++) {
            if (this.f2138n[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean add(Integer num) {
        g(num.intValue());
        return true;
    }

    public void g(int i10) {
        c();
        int i11 = this.f2139o;
        int[] iArr = this.f2138n;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[(((i11 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f2138n = iArr2;
        }
        int[] iArr3 = this.f2138n;
        int i12 = this.f2139o;
        this.f2139o = i12 + 1;
        iArr3[i12] = i10;
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f2139o; i11++) {
            i10 = (i10 * 31) + this.f2138n[i11];
        }
        return i10;
    }

    /* renamed from: l */
    public Integer get(int i10) {
        return Integer.valueOf(o(i10));
    }

    public int o(int i10) {
        k(i10);
        return this.f2138n[i10];
    }

    public boolean remove(Object obj) {
        c();
        for (int i10 = 0; i10 < this.f2139o; i10++) {
            if (obj.equals(Integer.valueOf(this.f2138n[i10]))) {
                int[] iArr = this.f2138n;
                System.arraycopy(iArr, i10 + 1, iArr, i10, (this.f2139o - i10) - 1);
                this.f2139o--;
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
            int[] iArr = this.f2138n;
            System.arraycopy(iArr, i11, iArr, i10, this.f2139o - i11);
            this.f2139o -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f2139o;
    }

    /* renamed from: z */
    public a0.g q(int i10) {
        if (i10 >= this.f2139o) {
            return new z(Arrays.copyOf(this.f2138n, i10), this.f2139o);
        }
        throw new IllegalArgumentException();
    }
}
