package p;

public class d<E> implements Cloneable {

    /* renamed from: q  reason: collision with root package name */
    private static final Object f11709q = new Object();

    /* renamed from: m  reason: collision with root package name */
    private boolean f11710m;

    /* renamed from: n  reason: collision with root package name */
    private long[] f11711n;

    /* renamed from: o  reason: collision with root package name */
    private Object[] f11712o;

    /* renamed from: p  reason: collision with root package name */
    private int f11713p;

    public d() {
        this(10);
    }

    public d(int i10) {
        this.f11710m = false;
        if (i10 == 0) {
            this.f11711n = c.f11707b;
            this.f11712o = c.f11708c;
            return;
        }
        int f10 = c.f(i10);
        this.f11711n = new long[f10];
        this.f11712o = new Object[f10];
    }

    private void f() {
        int i10 = this.f11713p;
        long[] jArr = this.f11711n;
        Object[] objArr = this.f11712o;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f11709q) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f11710m = false;
        this.f11713p = i11;
    }

    public void b(long j10, E e10) {
        int i10 = this.f11713p;
        if (i10 == 0 || j10 > this.f11711n[i10 - 1]) {
            if (this.f11710m && i10 >= this.f11711n.length) {
                f();
            }
            int i11 = this.f11713p;
            if (i11 >= this.f11711n.length) {
                int f10 = c.f(i11 + 1);
                long[] jArr = new long[f10];
                Object[] objArr = new Object[f10];
                long[] jArr2 = this.f11711n;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f11712o;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f11711n = jArr;
                this.f11712o = objArr;
            }
            this.f11711n[i11] = j10;
            this.f11712o[i11] = e10;
            this.f11713p = i11 + 1;
            return;
        }
        p(j10, e10);
    }

    public void d() {
        int i10 = this.f11713p;
        Object[] objArr = this.f11712o;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f11713p = 0;
        this.f11710m = false;
    }

    /* renamed from: e */
    public d<E> clone() {
        try {
            d<E> dVar = (d) super.clone();
            dVar.f11711n = (long[]) this.f11711n.clone();
            dVar.f11712o = (Object[]) this.f11712o.clone();
            return dVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public E h(long j10) {
        return i(j10, (Object) null);
    }

    public E i(long j10, E e10) {
        int b10 = c.b(this.f11711n, this.f11713p, j10);
        if (b10 >= 0) {
            E[] eArr = this.f11712o;
            if (eArr[b10] != f11709q) {
                return eArr[b10];
            }
        }
        return e10;
    }

    public int k(long j10) {
        if (this.f11710m) {
            f();
        }
        return c.b(this.f11711n, this.f11713p, j10);
    }

    public long n(int i10) {
        if (this.f11710m) {
            f();
        }
        return this.f11711n[i10];
    }

    public void p(long j10, E e10) {
        int b10 = c.b(this.f11711n, this.f11713p, j10);
        if (b10 >= 0) {
            this.f11712o[b10] = e10;
            return;
        }
        int i10 = ~b10;
        int i11 = this.f11713p;
        if (i10 < i11) {
            Object[] objArr = this.f11712o;
            if (objArr[i10] == f11709q) {
                this.f11711n[i10] = j10;
                objArr[i10] = e10;
                return;
            }
        }
        if (this.f11710m && i11 >= this.f11711n.length) {
            f();
            i10 = ~c.b(this.f11711n, this.f11713p, j10);
        }
        int i12 = this.f11713p;
        if (i12 >= this.f11711n.length) {
            int f10 = c.f(i12 + 1);
            long[] jArr = new long[f10];
            Object[] objArr2 = new Object[f10];
            long[] jArr2 = this.f11711n;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f11712o;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f11711n = jArr;
            this.f11712o = objArr2;
        }
        int i13 = this.f11713p;
        if (i13 - i10 != 0) {
            long[] jArr3 = this.f11711n;
            int i14 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i14, i13 - i10);
            Object[] objArr4 = this.f11712o;
            System.arraycopy(objArr4, i10, objArr4, i14, this.f11713p - i10);
        }
        this.f11711n[i10] = j10;
        this.f11712o[i10] = e10;
        this.f11713p++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f11712o;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void q(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f11711n
            int r1 = r2.f11713p
            int r3 = p.c.b(r0, r1, r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f11712o
            r0 = r4[r3]
            java.lang.Object r1 = f11709q
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f11710m = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.d.q(long):void");
    }

    public void r(int i10) {
        Object[] objArr = this.f11712o;
        Object obj = objArr[i10];
        Object obj2 = f11709q;
        if (obj != obj2) {
            objArr[i10] = obj2;
            this.f11710m = true;
        }
    }

    public int s() {
        if (this.f11710m) {
            f();
        }
        return this.f11713p;
    }

    public E t(int i10) {
        if (this.f11710m) {
            f();
        }
        return this.f11712o[i10];
    }

    public String toString() {
        if (s() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f11713p * 28);
        sb.append('{');
        for (int i10 = 0; i10 < this.f11713p; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            sb.append(n(i10));
            sb.append('=');
            Object t9 = t(i10);
            if (t9 != this) {
                sb.append(t9);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
