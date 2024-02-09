package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.u1;
import java.util.Arrays;

public final class o1 {

    /* renamed from: f  reason: collision with root package name */
    private static final o1 f2037f = new o1(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    private int f2038a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f2039b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f2040c;

    /* renamed from: d  reason: collision with root package name */
    private int f2041d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2042e;

    private o1() {
        this(0, new int[8], new Object[8], true);
    }

    private o1(int i10, int[] iArr, Object[] objArr, boolean z9) {
        this.f2041d = -1;
        this.f2038a = i10;
        this.f2039b = iArr;
        this.f2040c = objArr;
        this.f2042e = z9;
    }

    private void b() {
        int i10 = this.f2038a;
        int[] iArr = this.f2039b;
        if (i10 == iArr.length) {
            int i11 = i10 + (i10 < 4 ? 8 : i10 >> 1);
            this.f2039b = Arrays.copyOf(iArr, i11);
            this.f2040c = Arrays.copyOf(this.f2040c, i11);
        }
    }

    private static boolean c(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    public static o1 e() {
        return f2037f;
    }

    private static int h(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    private static int i(Object[] objArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + objArr[i12].hashCode();
        }
        return i11;
    }

    static o1 k(o1 o1Var, o1 o1Var2) {
        int i10 = o1Var.f2038a + o1Var2.f2038a;
        int[] copyOf = Arrays.copyOf(o1Var.f2039b, i10);
        System.arraycopy(o1Var2.f2039b, 0, copyOf, o1Var.f2038a, o1Var2.f2038a);
        Object[] copyOf2 = Arrays.copyOf(o1Var.f2040c, i10);
        System.arraycopy(o1Var2.f2040c, 0, copyOf2, o1Var.f2038a, o1Var2.f2038a);
        return new o1(i10, copyOf, copyOf2, true);
    }

    static o1 l() {
        return new o1();
    }

    private static void p(int i10, Object obj, u1 u1Var) {
        int a10 = t1.a(i10);
        int b10 = t1.b(i10);
        if (b10 == 0) {
            u1Var.c(a10, ((Long) obj).longValue());
        } else if (b10 == 1) {
            u1Var.w(a10, ((Long) obj).longValue());
        } else if (b10 == 2) {
            u1Var.l(a10, (h) obj);
        } else if (b10 != 3) {
            if (b10 == 5) {
                u1Var.m(a10, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(b0.d());
        } else if (u1Var.x() == u1.a.ASCENDING) {
            u1Var.h(a10);
            ((o1) obj).q(u1Var);
            u1Var.D(a10);
        } else {
            u1Var.D(a10);
            ((o1) obj).q(u1Var);
            u1Var.h(a10);
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (!this.f2042e) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        int i10 = this.f2038a;
        return i10 == o1Var.f2038a && c(this.f2039b, o1Var.f2039b, i10) && d(this.f2040c, o1Var.f2040c, this.f2038a);
    }

    public int f() {
        int i10;
        int i11 = this.f2041d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f2038a; i13++) {
            int i14 = this.f2039b[i13];
            int a10 = t1.a(i14);
            int b10 = t1.b(i14);
            if (b10 == 0) {
                i10 = k.Y(a10, ((Long) this.f2040c[i13]).longValue());
            } else if (b10 == 1) {
                i10 = k.o(a10, ((Long) this.f2040c[i13]).longValue());
            } else if (b10 == 2) {
                i10 = k.g(a10, (h) this.f2040c[i13]);
            } else if (b10 == 3) {
                i10 = (k.V(a10) * 2) + ((o1) this.f2040c[i13]).f();
            } else if (b10 == 5) {
                i10 = k.m(a10, ((Integer) this.f2040c[i13]).intValue());
            } else {
                throw new IllegalStateException(b0.d());
            }
            i12 += i10;
        }
        this.f2041d = i12;
        return i12;
    }

    public int g() {
        int i10 = this.f2041d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f2038a; i12++) {
            i11 += k.J(t1.a(this.f2039b[i12]), (h) this.f2040c[i12]);
        }
        this.f2041d = i11;
        return i11;
    }

    public int hashCode() {
        int i10 = this.f2038a;
        return ((((527 + i10) * 31) + h(this.f2039b, i10)) * 31) + i(this.f2040c, this.f2038a);
    }

    public void j() {
        this.f2042e = false;
    }

    /* access modifiers changed from: package-private */
    public final void m(StringBuilder sb, int i10) {
        for (int i11 = 0; i11 < this.f2038a; i11++) {
            t0.c(sb, i10, String.valueOf(t1.a(this.f2039b[i11])), this.f2040c[i11]);
        }
    }

    /* access modifiers changed from: package-private */
    public void n(int i10, Object obj) {
        a();
        b();
        int[] iArr = this.f2039b;
        int i11 = this.f2038a;
        iArr[i11] = i10;
        this.f2040c[i11] = obj;
        this.f2038a = i11 + 1;
    }

    /* access modifiers changed from: package-private */
    public void o(u1 u1Var) {
        if (u1Var.x() == u1.a.DESCENDING) {
            for (int i10 = this.f2038a - 1; i10 >= 0; i10--) {
                u1Var.f(t1.a(this.f2039b[i10]), this.f2040c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f2038a; i11++) {
            u1Var.f(t1.a(this.f2039b[i11]), this.f2040c[i11]);
        }
    }

    public void q(u1 u1Var) {
        if (this.f2038a != 0) {
            if (u1Var.x() == u1.a.ASCENDING) {
                for (int i10 = 0; i10 < this.f2038a; i10++) {
                    p(this.f2039b[i10], this.f2040c[i10], u1Var);
                }
                return;
            }
            for (int i11 = this.f2038a - 1; i11 >= 0; i11--) {
                p(this.f2039b[i11], this.f2040c[i11], u1Var);
            }
        }
    }
}
