package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.s1;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class k extends g {

    /* renamed from: c  reason: collision with root package name */
    private static final Logger f2000c = Logger.getLogger(k.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f2001d = r1.C();

    /* renamed from: a  reason: collision with root package name */
    l f2002a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2003b;

    private static abstract class b extends k {

        /* renamed from: e  reason: collision with root package name */
        final byte[] f2004e;

        /* renamed from: f  reason: collision with root package name */
        final int f2005f;

        /* renamed from: g  reason: collision with root package name */
        int f2006g;

        /* renamed from: h  reason: collision with root package name */
        int f2007h;

        b(int i10) {
            super();
            if (i10 >= 0) {
                byte[] bArr = new byte[Math.max(i10, 20)];
                this.f2004e = bArr;
                this.f2005f = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        /* access modifiers changed from: package-private */
        public final void b1(byte b10) {
            byte[] bArr = this.f2004e;
            int i10 = this.f2006g;
            this.f2006g = i10 + 1;
            bArr[i10] = b10;
            this.f2007h++;
        }

        /* access modifiers changed from: package-private */
        public final void c1(int i10) {
            byte[] bArr = this.f2004e;
            int i11 = this.f2006g;
            int i12 = i11 + 1;
            this.f2006g = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i12 + 1;
            this.f2006g = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i13 + 1;
            this.f2006g = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f2006g = i14 + 1;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
            this.f2007h += 4;
        }

        /* access modifiers changed from: package-private */
        public final void d1(long j10) {
            byte[] bArr = this.f2004e;
            int i10 = this.f2006g;
            int i11 = i10 + 1;
            this.f2006g = i11;
            bArr[i10] = (byte) ((int) (j10 & 255));
            int i12 = i11 + 1;
            this.f2006g = i12;
            bArr[i11] = (byte) ((int) ((j10 >> 8) & 255));
            int i13 = i12 + 1;
            this.f2006g = i13;
            bArr[i12] = (byte) ((int) ((j10 >> 16) & 255));
            int i14 = i13 + 1;
            this.f2006g = i14;
            bArr[i13] = (byte) ((int) (255 & (j10 >> 24)));
            int i15 = i14 + 1;
            this.f2006g = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i15 + 1;
            this.f2006g = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i16 + 1;
            this.f2006g = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f2006g = i17 + 1;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            this.f2007h += 8;
        }

        /* access modifiers changed from: package-private */
        public final void e1(int i10) {
            if (i10 >= 0) {
                g1(i10);
            } else {
                h1((long) i10);
            }
        }

        /* access modifiers changed from: package-private */
        public final void f1(int i10, int i11) {
            g1(t1.c(i10, i11));
        }

        /* access modifiers changed from: package-private */
        public final void g1(int i10) {
            if (k.f2001d) {
                long j10 = (long) this.f2006g;
                while ((i10 & -128) != 0) {
                    byte[] bArr = this.f2004e;
                    int i11 = this.f2006g;
                    this.f2006g = i11 + 1;
                    r1.H(bArr, (long) i11, (byte) ((i10 & 127) | 128));
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.f2004e;
                int i12 = this.f2006g;
                this.f2006g = i12 + 1;
                r1.H(bArr2, (long) i12, (byte) i10);
                this.f2007h += (int) (((long) this.f2006g) - j10);
                return;
            }
            while ((i10 & -128) != 0) {
                byte[] bArr3 = this.f2004e;
                int i13 = this.f2006g;
                this.f2006g = i13 + 1;
                bArr3[i13] = (byte) ((i10 & 127) | 128);
                this.f2007h++;
                i10 >>>= 7;
            }
            byte[] bArr4 = this.f2004e;
            int i14 = this.f2006g;
            this.f2006g = i14 + 1;
            bArr4[i14] = (byte) i10;
            this.f2007h++;
        }

        /* access modifiers changed from: package-private */
        public final void h1(long j10) {
            if (k.f2001d) {
                long j11 = (long) this.f2006g;
                while ((j10 & -128) != 0) {
                    byte[] bArr = this.f2004e;
                    int i10 = this.f2006g;
                    this.f2006g = i10 + 1;
                    r1.H(bArr, (long) i10, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.f2004e;
                int i11 = this.f2006g;
                this.f2006g = i11 + 1;
                r1.H(bArr2, (long) i11, (byte) ((int) j10));
                this.f2007h += (int) (((long) this.f2006g) - j11);
                return;
            }
            while ((j10 & -128) != 0) {
                byte[] bArr3 = this.f2004e;
                int i12 = this.f2006g;
                this.f2006g = i12 + 1;
                bArr3[i12] = (byte) ((((int) j10) & 127) | 128);
                this.f2007h++;
                j10 >>>= 7;
            }
            byte[] bArr4 = this.f2004e;
            int i13 = this.f2006g;
            this.f2006g = i13 + 1;
            bArr4[i13] = (byte) ((int) j10);
            this.f2007h++;
        }

        public final int i0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    private static class c extends k {

        /* renamed from: e  reason: collision with root package name */
        private final byte[] f2008e;

        /* renamed from: f  reason: collision with root package name */
        private final int f2009f;

        /* renamed from: g  reason: collision with root package name */
        private final int f2010g;

        /* renamed from: h  reason: collision with root package name */
        private int f2011h;

        c(byte[] bArr, int i10, int i11) {
            super();
            Objects.requireNonNull(bArr, "buffer");
            int i12 = i10 + i11;
            if ((i10 | i11 | (bArr.length - i12)) >= 0) {
                this.f2008e = bArr;
                this.f2009f = i10;
                this.f2011h = i10;
                this.f2010g = i12;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)}));
        }

        public final void E0(int i10, int i11) {
            W0(i10, 0);
            F0(i11);
        }

        public final void F0(int i10) {
            if (i10 >= 0) {
                Y0(i10);
            } else {
                a1((long) i10);
            }
        }

        /* access modifiers changed from: package-private */
        public final void I0(int i10, r0 r0Var, g1 g1Var) {
            W0(i10, 2);
            Y0(((a) r0Var).m(g1Var));
            g1Var.c(r0Var, this.f2002a);
        }

        public final void J0(r0 r0Var) {
            Y0(r0Var.b());
            r0Var.f(this);
        }

        public final void K0(int i10, r0 r0Var) {
            W0(1, 3);
            X0(2, i10);
            c1(3, r0Var);
            W0(1, 4);
        }

        public final void L0(int i10, h hVar) {
            W0(1, 3);
            X0(2, i10);
            o0(3, hVar);
            W0(1, 4);
        }

        public final void U0(int i10, String str) {
            W0(i10, 2);
            V0(str);
        }

        public final void V0(String str) {
            int f10;
            int i10 = this.f2011h;
            try {
                int X = k.X(str.length() * 3);
                int X2 = k.X(str.length());
                if (X2 == X) {
                    int i11 = i10 + X2;
                    this.f2011h = i11;
                    f10 = s1.f(str, this.f2008e, i11, i0());
                    this.f2011h = i10;
                    Y0((f10 - i10) - X2);
                } else {
                    Y0(s1.g(str));
                    f10 = s1.f(str, this.f2008e, this.f2011h, i0());
                }
                this.f2011h = f10;
            } catch (s1.d e10) {
                this.f2011h = i10;
                d0(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new d(e11);
            }
        }

        public final void W0(int i10, int i11) {
            Y0(t1.c(i10, i11));
        }

        public final void X0(int i10, int i11) {
            W0(i10, 0);
            Y0(i11);
        }

        public final void Y0(int i10) {
            if (!k.f2001d || d.c() || i0() < 5) {
                while ((i10 & -128) != 0) {
                    byte[] bArr = this.f2008e;
                    int i11 = this.f2011h;
                    this.f2011h = i11 + 1;
                    bArr[i11] = (byte) ((i10 & 127) | 128);
                    i10 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f2008e;
                    int i12 = this.f2011h;
                    this.f2011h = i12 + 1;
                    bArr2[i12] = (byte) i10;
                } catch (IndexOutOfBoundsException e10) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f2011h), Integer.valueOf(this.f2010g), 1}), e10);
                }
            } else if ((i10 & -128) == 0) {
                byte[] bArr3 = this.f2008e;
                int i13 = this.f2011h;
                this.f2011h = i13 + 1;
                r1.H(bArr3, (long) i13, (byte) i10);
            } else {
                byte[] bArr4 = this.f2008e;
                int i14 = this.f2011h;
                this.f2011h = i14 + 1;
                r1.H(bArr4, (long) i14, (byte) (i10 | 128));
                int i15 = i10 >>> 7;
                if ((i15 & -128) == 0) {
                    byte[] bArr5 = this.f2008e;
                    int i16 = this.f2011h;
                    this.f2011h = i16 + 1;
                    r1.H(bArr5, (long) i16, (byte) i15);
                    return;
                }
                byte[] bArr6 = this.f2008e;
                int i17 = this.f2011h;
                this.f2011h = i17 + 1;
                r1.H(bArr6, (long) i17, (byte) (i15 | 128));
                int i18 = i15 >>> 7;
                if ((i18 & -128) == 0) {
                    byte[] bArr7 = this.f2008e;
                    int i19 = this.f2011h;
                    this.f2011h = i19 + 1;
                    r1.H(bArr7, (long) i19, (byte) i18);
                    return;
                }
                byte[] bArr8 = this.f2008e;
                int i20 = this.f2011h;
                this.f2011h = i20 + 1;
                r1.H(bArr8, (long) i20, (byte) (i18 | 128));
                int i21 = i18 >>> 7;
                if ((i21 & -128) == 0) {
                    byte[] bArr9 = this.f2008e;
                    int i22 = this.f2011h;
                    this.f2011h = i22 + 1;
                    r1.H(bArr9, (long) i22, (byte) i21);
                    return;
                }
                byte[] bArr10 = this.f2008e;
                int i23 = this.f2011h;
                this.f2011h = i23 + 1;
                r1.H(bArr10, (long) i23, (byte) (i21 | 128));
                byte[] bArr11 = this.f2008e;
                int i24 = this.f2011h;
                this.f2011h = i24 + 1;
                r1.H(bArr11, (long) i24, (byte) (i21 >>> 7));
            }
        }

        public final void Z0(int i10, long j10) {
            W0(i10, 0);
            a1(j10);
        }

        public final void a(byte[] bArr, int i10, int i11) {
            b1(bArr, i10, i11);
        }

        public final void a1(long j10) {
            if (!k.f2001d || i0() < 10) {
                while ((j10 & -128) != 0) {
                    byte[] bArr = this.f2008e;
                    int i10 = this.f2011h;
                    this.f2011h = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) & 127) | 128);
                    j10 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f2008e;
                    int i11 = this.f2011h;
                    this.f2011h = i11 + 1;
                    bArr2[i11] = (byte) ((int) j10);
                } catch (IndexOutOfBoundsException e10) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f2011h), Integer.valueOf(this.f2010g), 1}), e10);
                }
            } else {
                while ((j10 & -128) != 0) {
                    byte[] bArr3 = this.f2008e;
                    int i12 = this.f2011h;
                    this.f2011h = i12 + 1;
                    r1.H(bArr3, (long) i12, (byte) ((((int) j10) & 127) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr4 = this.f2008e;
                int i13 = this.f2011h;
                this.f2011h = i13 + 1;
                r1.H(bArr4, (long) i13, (byte) ((int) j10));
            }
        }

        public final void b1(byte[] bArr, int i10, int i11) {
            try {
                System.arraycopy(bArr, i10, this.f2008e, this.f2011h, i11);
                this.f2011h += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f2011h), Integer.valueOf(this.f2010g), Integer.valueOf(i11)}), e10);
            }
        }

        public void c0() {
        }

        public final void c1(int i10, r0 r0Var) {
            W0(i10, 2);
            J0(r0Var);
        }

        public final int i0() {
            return this.f2010g - this.f2011h;
        }

        public final void j0(byte b10) {
            try {
                byte[] bArr = this.f2008e;
                int i10 = this.f2011h;
                this.f2011h = i10 + 1;
                bArr[i10] = b10;
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f2011h), Integer.valueOf(this.f2010g), 1}), e10);
            }
        }

        public final void k0(int i10, boolean z9) {
            W0(i10, 0);
            j0(z9 ? (byte) 1 : 0);
        }

        public final void n0(byte[] bArr, int i10, int i11) {
            Y0(i11);
            b1(bArr, i10, i11);
        }

        public final void o0(int i10, h hVar) {
            W0(i10, 2);
            p0(hVar);
        }

        public final void p0(h hVar) {
            Y0(hVar.size());
            hVar.N(this);
        }

        public final void u0(int i10, int i11) {
            W0(i10, 5);
            v0(i11);
        }

        public final void v0(int i10) {
            try {
                byte[] bArr = this.f2008e;
                int i11 = this.f2011h;
                int i12 = i11 + 1;
                this.f2011h = i12;
                bArr[i11] = (byte) (i10 & 255);
                int i13 = i12 + 1;
                this.f2011h = i13;
                bArr[i12] = (byte) ((i10 >> 8) & 255);
                int i14 = i13 + 1;
                this.f2011h = i14;
                bArr[i13] = (byte) ((i10 >> 16) & 255);
                this.f2011h = i14 + 1;
                bArr[i14] = (byte) ((i10 >> 24) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f2011h), Integer.valueOf(this.f2010g), 1}), e10);
            }
        }

        public final void w0(int i10, long j10) {
            W0(i10, 1);
            x0(j10);
        }

        public final void x0(long j10) {
            try {
                byte[] bArr = this.f2008e;
                int i10 = this.f2011h;
                int i11 = i10 + 1;
                this.f2011h = i11;
                bArr[i10] = (byte) (((int) j10) & 255);
                int i12 = i11 + 1;
                this.f2011h = i12;
                bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
                int i13 = i12 + 1;
                this.f2011h = i13;
                bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
                int i14 = i13 + 1;
                this.f2011h = i14;
                bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
                int i15 = i14 + 1;
                this.f2011h = i15;
                bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
                int i16 = i15 + 1;
                this.f2011h = i16;
                bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
                int i17 = i16 + 1;
                this.f2011h = i17;
                bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
                this.f2011h = i17 + 1;
                bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e10) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f2011h), Integer.valueOf(this.f2010g), 1}), e10);
            }
        }
    }

    public static class d extends IOException {
        d(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        d(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private static final class e extends b {

        /* renamed from: i  reason: collision with root package name */
        private final OutputStream f2012i;

        e(OutputStream outputStream, int i10) {
            super(i10);
            Objects.requireNonNull(outputStream, "out");
            this.f2012i = outputStream;
        }

        private void i1() {
            this.f2012i.write(this.f2004e, 0, this.f2006g);
            this.f2006g = 0;
        }

        private void j1(int i10) {
            if (this.f2005f - this.f2006g < i10) {
                i1();
            }
        }

        public void E0(int i10, int i11) {
            j1(20);
            f1(i10, 0);
            e1(i11);
        }

        public void F0(int i10) {
            if (i10 >= 0) {
                Y0(i10);
            } else {
                a1((long) i10);
            }
        }

        /* access modifiers changed from: package-private */
        public void I0(int i10, r0 r0Var, g1 g1Var) {
            W0(i10, 2);
            m1(r0Var, g1Var);
        }

        public void J0(r0 r0Var) {
            Y0(r0Var.b());
            r0Var.f(this);
        }

        public void K0(int i10, r0 r0Var) {
            W0(1, 3);
            X0(2, i10);
            l1(3, r0Var);
            W0(1, 4);
        }

        public void L0(int i10, h hVar) {
            W0(1, 3);
            X0(2, i10);
            o0(3, hVar);
            W0(1, 4);
        }

        public void U0(int i10, String str) {
            W0(i10, 2);
            V0(str);
        }

        public void V0(String str) {
            int i10;
            int i11;
            try {
                int length = str.length() * 3;
                int X = k.X(length);
                int i12 = X + length;
                int i13 = this.f2005f;
                if (i12 > i13) {
                    byte[] bArr = new byte[length];
                    int f10 = s1.f(str, bArr, 0, length);
                    Y0(f10);
                    a(bArr, 0, f10);
                    return;
                }
                if (i12 > i13 - this.f2006g) {
                    i1();
                }
                int X2 = k.X(str.length());
                i10 = this.f2006g;
                if (X2 == X) {
                    int i14 = i10 + X2;
                    this.f2006g = i14;
                    int f11 = s1.f(str, this.f2004e, i14, this.f2005f - i14);
                    this.f2006g = i10;
                    i11 = (f11 - i10) - X2;
                    g1(i11);
                    this.f2006g = f11;
                } else {
                    i11 = s1.g(str);
                    g1(i11);
                    this.f2006g = s1.f(str, this.f2004e, this.f2006g, i11);
                }
                this.f2007h += i11;
            } catch (s1.d e10) {
                this.f2007h -= this.f2006g - i10;
                this.f2006g = i10;
                throw e10;
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new d(e11);
            } catch (s1.d e12) {
                d0(str, e12);
            }
        }

        public void W0(int i10, int i11) {
            Y0(t1.c(i10, i11));
        }

        public void X0(int i10, int i11) {
            j1(20);
            f1(i10, 0);
            g1(i11);
        }

        public void Y0(int i10) {
            j1(5);
            g1(i10);
        }

        public void Z0(int i10, long j10) {
            j1(20);
            f1(i10, 0);
            h1(j10);
        }

        public void a(byte[] bArr, int i10, int i11) {
            k1(bArr, i10, i11);
        }

        public void a1(long j10) {
            j1(10);
            h1(j10);
        }

        public void c0() {
            if (this.f2006g > 0) {
                i1();
            }
        }

        public void j0(byte b10) {
            if (this.f2006g == this.f2005f) {
                i1();
            }
            b1(b10);
        }

        public void k0(int i10, boolean z9) {
            j1(11);
            f1(i10, 0);
            b1(z9 ? (byte) 1 : 0);
        }

        public void k1(byte[] bArr, int i10, int i11) {
            int i12 = this.f2005f;
            int i13 = this.f2006g;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.f2004e, i13, i11);
                this.f2006g += i11;
            } else {
                int i14 = i12 - i13;
                System.arraycopy(bArr, i10, this.f2004e, i13, i14);
                int i15 = i10 + i14;
                i11 -= i14;
                this.f2006g = this.f2005f;
                this.f2007h += i14;
                i1();
                if (i11 <= this.f2005f) {
                    System.arraycopy(bArr, i15, this.f2004e, 0, i11);
                    this.f2006g = i11;
                } else {
                    this.f2012i.write(bArr, i15, i11);
                }
            }
            this.f2007h += i11;
        }

        public void l1(int i10, r0 r0Var) {
            W0(i10, 2);
            J0(r0Var);
        }

        /* access modifiers changed from: package-private */
        public void m1(r0 r0Var, g1 g1Var) {
            Y0(((a) r0Var).m(g1Var));
            g1Var.c(r0Var, this.f2002a);
        }

        public void n0(byte[] bArr, int i10, int i11) {
            Y0(i11);
            k1(bArr, i10, i11);
        }

        public void o0(int i10, h hVar) {
            W0(i10, 2);
            p0(hVar);
        }

        public void p0(h hVar) {
            Y0(hVar.size());
            hVar.N(this);
        }

        public void u0(int i10, int i11) {
            j1(14);
            f1(i10, 5);
            c1(i11);
        }

        public void v0(int i10) {
            j1(4);
            c1(i10);
        }

        public void w0(int i10, long j10) {
            j1(18);
            f1(i10, 1);
            d1(j10);
        }

        public void x0(long j10) {
            j1(8);
            d1(j10);
        }
    }

    private k() {
    }

    public static int A(int i10, e0 e0Var) {
        return V(i10) + B(e0Var);
    }

    public static int B(e0 e0Var) {
        return C(e0Var.b());
    }

    static int C(int i10) {
        return X(i10) + i10;
    }

    public static int D(int i10, r0 r0Var) {
        return (V(1) * 2) + W(2, i10) + E(3, r0Var);
    }

    public static int E(int i10, r0 r0Var) {
        return V(i10) + G(r0Var);
    }

    static int F(int i10, r0 r0Var, g1 g1Var) {
        return V(i10) + H(r0Var, g1Var);
    }

    public static int G(r0 r0Var) {
        return C(r0Var.b());
    }

    static int H(r0 r0Var, g1 g1Var) {
        return C(((a) r0Var).m(g1Var));
    }

    static int I(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int J(int i10, h hVar) {
        return (V(1) * 2) + W(2, i10) + g(3, hVar);
    }

    @Deprecated
    public static int K(int i10) {
        return X(i10);
    }

    public static int L(int i10, int i11) {
        return V(i10) + M(i11);
    }

    public static int M(int i10) {
        return 4;
    }

    public static int N(int i10, long j10) {
        return V(i10) + O(j10);
    }

    public static int O(long j10) {
        return 8;
    }

    public static int P(int i10, int i11) {
        return V(i10) + Q(i11);
    }

    public static int Q(int i10) {
        return X(a0(i10));
    }

    public static int R(int i10, long j10) {
        return V(i10) + S(j10);
    }

    public static int S(long j10) {
        return Z(b0(j10));
    }

    public static int T(int i10, String str) {
        return V(i10) + U(str);
    }

    public static int U(String str) {
        int i10;
        try {
            i10 = s1.g(str);
        } catch (s1.d unused) {
            i10 = str.getBytes(a0.f1884a).length;
        }
        return C(i10);
    }

    public static int V(int i10) {
        return X(t1.c(i10, 0));
    }

    public static int W(int i10, int i11) {
        return V(i10) + X(i11);
    }

    public static int X(int i10) {
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

    public static int Y(int i10, long j10) {
        return V(i10) + Z(j10);
    }

    public static int Z(long j10) {
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

    public static int a0(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long b0(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int d(int i10, boolean z9) {
        return V(i10) + e(z9);
    }

    public static int e(boolean z9) {
        return 1;
    }

    public static int f(byte[] bArr) {
        return C(bArr.length);
    }

    public static k f0(OutputStream outputStream, int i10) {
        return new e(outputStream, i10);
    }

    public static int g(int i10, h hVar) {
        return V(i10) + h(hVar);
    }

    public static k g0(byte[] bArr) {
        return h0(bArr, 0, bArr.length);
    }

    public static int h(h hVar) {
        return C(hVar.size());
    }

    public static k h0(byte[] bArr, int i10, int i11) {
        return new c(bArr, i10, i11);
    }

    public static int i(int i10, double d10) {
        return V(i10) + j(d10);
    }

    public static int j(double d10) {
        return 8;
    }

    public static int k(int i10, int i11) {
        return V(i10) + l(i11);
    }

    public static int l(int i10) {
        return w(i10);
    }

    public static int m(int i10, int i11) {
        return V(i10) + n(i11);
    }

    public static int n(int i10) {
        return 4;
    }

    public static int o(int i10, long j10) {
        return V(i10) + p(j10);
    }

    public static int p(long j10) {
        return 8;
    }

    public static int q(int i10, float f10) {
        return V(i10) + r(f10);
    }

    public static int r(float f10) {
        return 4;
    }

    @Deprecated
    static int s(int i10, r0 r0Var, g1 g1Var) {
        return (V(i10) * 2) + u(r0Var, g1Var);
    }

    @Deprecated
    public static int t(r0 r0Var) {
        return r0Var.b();
    }

    @Deprecated
    static int u(r0 r0Var, g1 g1Var) {
        return ((a) r0Var).m(g1Var);
    }

    public static int v(int i10, int i11) {
        return V(i10) + w(i11);
    }

    public static int w(int i10) {
        if (i10 >= 0) {
            return X(i10);
        }
        return 10;
    }

    public static int x(int i10, long j10) {
        return V(i10) + y(j10);
    }

    public static int y(long j10) {
        return Z(j10);
    }

    public static int z(int i10, e0 e0Var) {
        return (V(1) * 2) + W(2, i10) + A(3, e0Var);
    }

    @Deprecated
    public final void A0(int i10, r0 r0Var) {
        W0(i10, 3);
        C0(r0Var);
        W0(i10, 4);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public final void B0(int i10, r0 r0Var, g1 g1Var) {
        W0(i10, 3);
        D0(r0Var, g1Var);
        W0(i10, 4);
    }

    @Deprecated
    public final void C0(r0 r0Var) {
        r0Var.f(this);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public final void D0(r0 r0Var, g1 g1Var) {
        g1Var.c(r0Var, this.f2002a);
    }

    public abstract void E0(int i10, int i11);

    public abstract void F0(int i10);

    public final void G0(int i10, long j10) {
        Z0(i10, j10);
    }

    public final void H0(long j10) {
        a1(j10);
    }

    /* access modifiers changed from: package-private */
    public abstract void I0(int i10, r0 r0Var, g1 g1Var);

    public abstract void J0(r0 r0Var);

    public abstract void K0(int i10, r0 r0Var);

    public abstract void L0(int i10, h hVar);

    public final void M0(int i10, int i11) {
        u0(i10, i11);
    }

    public final void N0(int i10) {
        v0(i10);
    }

    public final void O0(int i10, long j10) {
        w0(i10, j10);
    }

    public final void P0(long j10) {
        x0(j10);
    }

    public final void Q0(int i10, int i11) {
        X0(i10, a0(i11));
    }

    public final void R0(int i10) {
        Y0(a0(i10));
    }

    public final void S0(int i10, long j10) {
        Z0(i10, b0(j10));
    }

    public final void T0(long j10) {
        a1(b0(j10));
    }

    public abstract void U0(int i10, String str);

    public abstract void V0(String str);

    public abstract void W0(int i10, int i11);

    public abstract void X0(int i10, int i11);

    public abstract void Y0(int i10);

    public abstract void Z0(int i10, long j10);

    public abstract void a(byte[] bArr, int i10, int i11);

    public abstract void a1(long j10);

    public final void c() {
        if (i0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void c0();

    /* access modifiers changed from: package-private */
    public final void d0(String str, s1.d dVar) {
        f2000c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", dVar);
        byte[] bytes = str.getBytes(a0.f1884a);
        try {
            Y0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new d(e10);
        } catch (d e11) {
            throw e11;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean e0() {
        return this.f2003b;
    }

    public abstract int i0();

    public abstract void j0(byte b10);

    public abstract void k0(int i10, boolean z9);

    public final void l0(boolean z9) {
        j0(z9 ? (byte) 1 : 0);
    }

    public final void m0(byte[] bArr) {
        n0(bArr, 0, bArr.length);
    }

    /* access modifiers changed from: package-private */
    public abstract void n0(byte[] bArr, int i10, int i11);

    public abstract void o0(int i10, h hVar);

    public abstract void p0(h hVar);

    public final void q0(int i10, double d10) {
        w0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void r0(double d10) {
        x0(Double.doubleToRawLongBits(d10));
    }

    public final void s0(int i10, int i11) {
        E0(i10, i11);
    }

    public final void t0(int i10) {
        F0(i10);
    }

    public abstract void u0(int i10, int i11);

    public abstract void v0(int i10);

    public abstract void w0(int i10, long j10);

    public abstract void x0(long j10);

    public final void y0(int i10, float f10) {
        u0(i10, Float.floatToRawIntBits(f10));
    }

    public final void z0(float f10) {
        v0(Float.floatToRawIntBits(f10));
    }
}
