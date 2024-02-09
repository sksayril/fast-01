package p;

public class h<E> implements Cloneable {

    /* renamed from: q  reason: collision with root package name */
    private static final Object f11744q = new Object();

    /* renamed from: m  reason: collision with root package name */
    private boolean f11745m;

    /* renamed from: n  reason: collision with root package name */
    private int[] f11746n;

    /* renamed from: o  reason: collision with root package name */
    private Object[] f11747o;

    /* renamed from: p  reason: collision with root package name */
    private int f11748p;

    public h() {
        this(10);
    }

    public h(int i10) {
        this.f11745m = false;
        if (i10 == 0) {
            this.f11746n = c.f11706a;
            this.f11747o = c.f11708c;
            return;
        }
        int e10 = c.e(i10);
        this.f11746n = new int[e10];
        this.f11747o = new Object[e10];
    }

    private void f() {
        int i10 = this.f11748p;
        int[] iArr = this.f11746n;
        Object[] objArr = this.f11747o;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f11744q) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f11745m = false;
        this.f11748p = i11;
    }

    public void b(int i10, E e10) {
        int i11 = this.f11748p;
        if (i11 == 0 || i10 > this.f11746n[i11 - 1]) {
            if (this.f11745m && i11 >= this.f11746n.length) {
                f();
            }
            int i12 = this.f11748p;
            if (i12 >= this.f11746n.length) {
                int e11 = c.e(i12 + 1);
                int[] iArr = new int[e11];
                Object[] objArr = new Object[e11];
                int[] iArr2 = this.f11746n;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f11747o;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f11746n = iArr;
                this.f11747o = objArr;
            }
            this.f11746n[i12] = i10;
            this.f11747o[i12] = e10;
            this.f11748p = i12 + 1;
            return;
        }
        n(i10, e10);
    }

    public void d() {
        int i10 = this.f11748p;
        Object[] objArr = this.f11747o;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f11748p = 0;
        this.f11745m = false;
    }

    /* renamed from: e */
    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f11746n = (int[]) this.f11746n.clone();
            hVar.f11747o = (Object[]) this.f11747o.clone();
            return hVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public E h(int i10) {
        return i(i10, (Object) null);
    }

    public E i(int i10, E e10) {
        int a10 = c.a(this.f11746n, this.f11748p, i10);
        if (a10 >= 0) {
            E[] eArr = this.f11747o;
            if (eArr[a10] != f11744q) {
                return eArr[a10];
            }
        }
        return e10;
    }

    public int k(int i10) {
        if (this.f11745m) {
            f();
        }
        return this.f11746n[i10];
    }

    public void n(int i10, E e10) {
        int a10 = c.a(this.f11746n, this.f11748p, i10);
        if (a10 >= 0) {
            this.f11747o[a10] = e10;
            return;
        }
        int i11 = ~a10;
        int i12 = this.f11748p;
        if (i11 < i12) {
            Object[] objArr = this.f11747o;
            if (objArr[i11] == f11744q) {
                this.f11746n[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (this.f11745m && i12 >= this.f11746n.length) {
            f();
            i11 = ~c.a(this.f11746n, this.f11748p, i10);
        }
        int i13 = this.f11748p;
        if (i13 >= this.f11746n.length) {
            int e11 = c.e(i13 + 1);
            int[] iArr = new int[e11];
            Object[] objArr2 = new Object[e11];
            int[] iArr2 = this.f11746n;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f11747o;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f11746n = iArr;
            this.f11747o = objArr2;
        }
        int i14 = this.f11748p;
        if (i14 - i11 != 0) {
            int[] iArr3 = this.f11746n;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr4 = this.f11747o;
            System.arraycopy(objArr4, i11, objArr4, i15, this.f11748p - i11);
        }
        this.f11746n[i11] = i10;
        this.f11747o[i11] = e10;
        this.f11748p++;
    }

    public int p() {
        if (this.f11745m) {
            f();
        }
        return this.f11748p;
    }

    public E q(int i10) {
        if (this.f11745m) {
            f();
        }
        return this.f11747o[i10];
    }

    public String toString() {
        if (p() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f11748p * 28);
        sb.append('{');
        for (int i10 = 0; i10 < this.f11748p; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            sb.append(k(i10));
            sb.append('=');
            Object q9 = q(i10);
            if (q9 != this) {
                sb.append(q9);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
