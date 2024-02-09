package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class y7 extends g7 {

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f5715b = Logger.getLogger(y7.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f5716c = ac.w();

    /* renamed from: a  reason: collision with root package name */
    b8 f5717a;

    private static class a extends y7 {

        /* renamed from: d  reason: collision with root package name */
        private final byte[] f5718d;

        /* renamed from: e  reason: collision with root package name */
        private final int f5719e;

        /* renamed from: f  reason: collision with root package name */
        private final int f5720f;

        /* renamed from: g  reason: collision with root package name */
        private int f5721g;

        a(byte[] bArr, int i10, int i11) {
            super();
            Objects.requireNonNull(bArr, "buffer");
            if ((i11 | 0 | (bArr.length - i11)) >= 0) {
                this.f5718d = bArr;
                this.f5719e = 0;
                this.f5721g = 0;
                this.f5720f = i11;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i11)}));
        }

        private final void E0(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.f5718d, this.f5721g, i11);
                this.f5721g += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f5721g), Integer.valueOf(this.f5720f), Integer.valueOf(i11)}), e10);
            }
        }

        public final void L(int i10) {
            if (i10 >= 0) {
                Y(i10);
            } else {
                R((long) i10);
            }
        }

        public final void O(int i10, int i11) {
            Z(i10, 0);
            L(i11);
        }

        public final void P(int i10, long j10) {
            Z(i10, 0);
            R(j10);
        }

        public final void Q(int i10, f7 f7Var) {
            Z(1, 3);
            f0(2, i10);
            p(3, f7Var);
            Z(1, 4);
        }

        public final void R(long j10) {
            if (!y7.f5716c || b() < 10) {
                while ((j10 & -128) != 0) {
                    byte[] bArr = this.f5718d;
                    int i10 = this.f5721g;
                    this.f5721g = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f5718d;
                    int i11 = this.f5721g;
                    this.f5721g = i11 + 1;
                    bArr2[i11] = (byte) ((int) j10);
                } catch (IndexOutOfBoundsException e10) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f5721g), Integer.valueOf(this.f5720f), 1}), e10);
                }
            } else {
                while ((j10 & -128) != 0) {
                    byte[] bArr3 = this.f5718d;
                    int i12 = this.f5721g;
                    this.f5721g = i12 + 1;
                    ac.m(bArr3, (long) i12, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr4 = this.f5718d;
                int i13 = this.f5721g;
                this.f5721g = i13 + 1;
                ac.m(bArr4, (long) i13, (byte) ((int) j10));
            }
        }

        public final void Y(int i10) {
            while ((i10 & -128) != 0) {
                byte[] bArr = this.f5718d;
                int i11 = this.f5721g;
                this.f5721g = i11 + 1;
                bArr[i11] = (byte) ((i10 & 127) | 128);
                i10 >>>= 7;
            }
            try {
                byte[] bArr2 = this.f5718d;
                int i12 = this.f5721g;
                this.f5721g = i12 + 1;
                bArr2[i12] = (byte) i10;
            } catch (IndexOutOfBoundsException e10) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f5721g), Integer.valueOf(this.f5720f), 1}), e10);
            }
        }

        public final void Z(int i10, int i11) {
            Y((i10 << 3) | i11);
        }

        public final void a(byte[] bArr, int i10, int i11) {
            E0(bArr, i10, i11);
        }

        public final int b() {
            return this.f5720f - this.f5721g;
        }

        public final void f0(int i10, int i11) {
            Z(i10, 0);
            Y(i11);
        }

        public final void l(byte b10) {
            try {
                byte[] bArr = this.f5718d;
                int i10 = this.f5721g;
                this.f5721g = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f5721g), Integer.valueOf(this.f5720f), 1}), e10);
            }
        }

        public final void m(int i10) {
            try {
                byte[] bArr = this.f5718d;
                int i11 = this.f5721g;
                int i12 = i11 + 1;
                this.f5721g = i12;
                bArr[i11] = (byte) i10;
                int i13 = i12 + 1;
                this.f5721g = i13;
                bArr[i12] = (byte) (i10 >> 8);
                int i14 = i13 + 1;
                this.f5721g = i14;
                bArr[i13] = (byte) (i10 >> 16);
                this.f5721g = i14 + 1;
                bArr[i14] = (byte) (i10 >>> 24);
            } catch (IndexOutOfBoundsException e10) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f5721g), Integer.valueOf(this.f5720f), 1}), e10);
            }
        }

        public final void n(int i10, int i11) {
            Z(i10, 5);
            m(i11);
        }

        public final void o(int i10, long j10) {
            Z(i10, 1);
            u(j10);
        }

        public final void p(int i10, f7 f7Var) {
            Z(i10, 2);
            v(f7Var);
        }

        public final void q(int i10, da daVar) {
            Z(1, 3);
            f0(2, i10);
            Z(3, 2);
            w(daVar);
            Z(1, 4);
        }

        /* access modifiers changed from: package-private */
        public final void r(int i10, da daVar, va vaVar) {
            Z(i10, 2);
            Y(((w6) daVar).a(vaVar));
            vaVar.h(daVar, this.f5717a);
        }

        public final void s(int i10, String str) {
            Z(i10, 2);
            x(str);
        }

        public final void t(int i10, boolean z9) {
            Z(i10, 0);
            l(z9 ? (byte) 1 : 0);
        }

        public final void u(long j10) {
            try {
                byte[] bArr = this.f5718d;
                int i10 = this.f5721g;
                int i11 = i10 + 1;
                this.f5721g = i11;
                bArr[i10] = (byte) ((int) j10);
                int i12 = i11 + 1;
                this.f5721g = i12;
                bArr[i11] = (byte) ((int) (j10 >> 8));
                int i13 = i12 + 1;
                this.f5721g = i13;
                bArr[i12] = (byte) ((int) (j10 >> 16));
                int i14 = i13 + 1;
                this.f5721g = i14;
                bArr[i13] = (byte) ((int) (j10 >> 24));
                int i15 = i14 + 1;
                this.f5721g = i15;
                bArr[i14] = (byte) ((int) (j10 >> 32));
                int i16 = i15 + 1;
                this.f5721g = i16;
                bArr[i15] = (byte) ((int) (j10 >> 40));
                int i17 = i16 + 1;
                this.f5721g = i17;
                bArr[i16] = (byte) ((int) (j10 >> 48));
                this.f5721g = i17 + 1;
                bArr[i17] = (byte) ((int) (j10 >> 56));
            } catch (IndexOutOfBoundsException e10) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f5721g), Integer.valueOf(this.f5720f), 1}), e10);
            }
        }

        public final void v(f7 f7Var) {
            Y(f7Var.A());
            f7Var.y(this);
        }

        public final void w(da daVar) {
            Y(daVar.d());
            daVar.k(this);
        }

        public final void x(String str) {
            int i10 = this.f5721g;
            try {
                int z02 = y7.z0(str.length() * 3);
                int z03 = y7.z0(str.length());
                if (z03 == z02) {
                    int i11 = i10 + z03;
                    this.f5721g = i11;
                    int b10 = bc.b(str, this.f5718d, i11, b());
                    this.f5721g = i10;
                    Y((b10 - i10) - z03);
                    this.f5721g = b10;
                    return;
                }
                Y(bc.a(str));
                this.f5721g = bc.b(str, this.f5718d, this.f5721g, b());
            } catch (ec e10) {
                this.f5721g = i10;
                y(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new b(e11);
            }
        }
    }

    public static class b extends IOException {
        b(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        b(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private y7() {
    }

    public static int A(int i10, da daVar) {
        return (z0(8) << 1) + A0(2, i10) + z0(24) + X(daVar);
    }

    public static int A0(int i10, int i11) {
        return z0(i10 << 3) + z0(i11);
    }

    @Deprecated
    static int B(int i10, da daVar, va vaVar) {
        return (z0(i10 << 3) << 1) + ((w6) daVar).a(vaVar);
    }

    public static int C(int i10, String str) {
        return z0(i10 << 3) + G(str);
    }

    public static int D(int i10, boolean z9) {
        return z0(i10 << 3) + 1;
    }

    private static int D0(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static int E(f7 f7Var) {
        int A = f7Var.A();
        return z0(A) + A;
    }

    @Deprecated
    public static int F(da daVar) {
        return daVar.d();
    }

    public static int G(String str) {
        int i10;
        try {
            i10 = bc.a(str);
        } catch (ec unused) {
            i10 = str.getBytes(r8.f5562b).length;
        }
        return z0(i10) + i10;
    }

    public static y7 H(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int T(int i10, long j10) {
        return z0(i10 << 3) + 8;
    }

    public static int U(int i10, f7 f7Var) {
        int z02 = z0(i10 << 3);
        int A = f7Var.A();
        return z02 + z0(A) + A;
    }

    static int V(int i10, da daVar, va vaVar) {
        return z0(i10 << 3) + i(daVar, vaVar);
    }

    public static int W(long j10) {
        return 8;
    }

    public static int X(da daVar) {
        int d10 = daVar.d();
        return z0(d10) + d10;
    }

    public static int b0(int i10) {
        return k0(i10);
    }

    public static int c(double d10) {
        return 8;
    }

    public static int c0(int i10, long j10) {
        return z0(i10 << 3) + r0(j10);
    }

    public static int d(float f10) {
        return 4;
    }

    public static int d0(int i10, f7 f7Var) {
        return (z0(8) << 1) + A0(2, i10) + U(3, f7Var);
    }

    public static int e(int i10, double d10) {
        return z0(i10 << 3) + 8;
    }

    public static int e0(long j10) {
        return r0(j10);
    }

    public static int f(int i10, float f10) {
        return z0(i10 << 3) + 4;
    }

    public static int g(int i10, g9 g9Var) {
        return (z0(8) << 1) + A0(2, i10) + z(3, g9Var);
    }

    public static int g0(int i10) {
        return 4;
    }

    public static int h(g9 g9Var) {
        int b10 = g9Var.b();
        return z0(b10) + b10;
    }

    public static int h0(int i10, int i11) {
        return z0(i10 << 3) + k0(i11);
    }

    static int i(da daVar, va vaVar) {
        int a10 = ((w6) daVar).a(vaVar);
        return z0(a10) + a10;
    }

    public static int i0(int i10, long j10) {
        return z0(i10 << 3) + 8;
    }

    public static int j(boolean z9) {
        return 1;
    }

    public static int j0(long j10) {
        return 8;
    }

    public static int k(byte[] bArr) {
        int length = bArr.length;
        return z0(length) + length;
    }

    public static int k0(int i10) {
        if (i10 >= 0) {
            return z0(i10);
        }
        return 10;
    }

    public static int l0(int i10, int i11) {
        return z0(i10 << 3) + 4;
    }

    public static int m0(int i10, long j10) {
        return z0(i10 << 3) + r0(y0(j10));
    }

    public static int n0(long j10) {
        return r0(y0(j10));
    }

    public static int o0(int i10) {
        return 4;
    }

    public static int p0(int i10, int i11) {
        return z0(i10 << 3) + k0(i11);
    }

    public static int q0(int i10, long j10) {
        return z0(i10 << 3) + r0(j10);
    }

    public static int r0(long j10) {
        int i10;
        if ((-128 & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if ((-34359738368L & j10) != 0) {
            i10 = 6;
            j10 >>>= 28;
        } else {
            i10 = 2;
        }
        if ((-2097152 & j10) != 0) {
            i10 += 2;
            j10 >>>= 14;
        }
        return (j10 & -16384) != 0 ? i10 + 1 : i10;
    }

    public static int s0(int i10) {
        return z0(D0(i10));
    }

    public static int t0(int i10, int i11) {
        return z0(i10 << 3) + 4;
    }

    public static int w0(int i10) {
        return z0(i10 << 3);
    }

    public static int x0(int i10, int i11) {
        return z0(i10 << 3) + z0(D0(i11));
    }

    private static long y0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int z(int i10, g9 g9Var) {
        int z02 = z0(i10 << 3);
        int b10 = g9Var.b();
        return z02 + z0(b10) + b10;
    }

    public static int z0(int i10) {
        if ((i10 & -128) == 0) {
            return 1;
        }
        if ((i10 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i10) == 0) {
            return 3;
        }
        return (i10 & -268435456) == 0 ? 4 : 5;
    }

    public final void B0(int i10) {
        Y(D0(i10));
    }

    public final void C0(int i10, int i11) {
        f0(i10, D0(i11));
    }

    public final void I() {
        if (b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void J(double d10) {
        u(Double.doubleToRawLongBits(d10));
    }

    public final void K(float f10) {
        m(Float.floatToRawIntBits(f10));
    }

    public abstract void L(int i10);

    public final void M(int i10, double d10) {
        o(i10, Double.doubleToRawLongBits(d10));
    }

    public final void N(int i10, float f10) {
        n(i10, Float.floatToRawIntBits(f10));
    }

    public abstract void O(int i10, int i11);

    public abstract void P(int i10, long j10);

    public abstract void Q(int i10, f7 f7Var);

    public abstract void R(long j10);

    public final void S(boolean z9) {
        l(z9 ? (byte) 1 : 0);
    }

    public abstract void Y(int i10);

    public abstract void Z(int i10, int i11);

    public abstract int b();

    public abstract void f0(int i10, int i11);

    public abstract void l(byte b10);

    public abstract void m(int i10);

    public abstract void n(int i10, int i11);

    public abstract void o(int i10, long j10);

    public abstract void p(int i10, f7 f7Var);

    public abstract void q(int i10, da daVar);

    /* access modifiers changed from: package-private */
    public abstract void r(int i10, da daVar, va vaVar);

    public abstract void s(int i10, String str);

    public abstract void t(int i10, boolean z9);

    public abstract void u(long j10);

    public final void u0(int i10, long j10) {
        P(i10, y0(j10));
    }

    public abstract void v(f7 f7Var);

    public final void v0(long j10) {
        R(y0(j10));
    }

    public abstract void w(da daVar);

    public abstract void x(String str);

    /* access modifiers changed from: package-private */
    public final void y(String str, ec ecVar) {
        f5715b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", ecVar);
        byte[] bytes = str.getBytes(r8.f5562b);
        try {
            Y(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new b(e10);
        }
    }
}
