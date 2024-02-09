package androidx.datastore.preferences.protobuf;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    int f1941a;

    /* renamed from: b  reason: collision with root package name */
    int f1942b;

    /* renamed from: c  reason: collision with root package name */
    int f1943c;

    /* renamed from: d  reason: collision with root package name */
    j f1944d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1945e;

    private static final class b extends i {

        /* renamed from: f  reason: collision with root package name */
        private final byte[] f1946f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f1947g;

        /* renamed from: h  reason: collision with root package name */
        private int f1948h;

        /* renamed from: i  reason: collision with root package name */
        private int f1949i;

        /* renamed from: j  reason: collision with root package name */
        private int f1950j;

        /* renamed from: k  reason: collision with root package name */
        private int f1951k;

        /* renamed from: l  reason: collision with root package name */
        private int f1952l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f1953m;

        /* renamed from: n  reason: collision with root package name */
        private int f1954n;

        private b(byte[] bArr, int i10, int i11, boolean z9) {
            super();
            this.f1954n = Integer.MAX_VALUE;
            this.f1946f = bArr;
            this.f1948h = i11 + i10;
            this.f1950j = i10;
            this.f1951k = i10;
            this.f1947g = z9;
        }

        private void M() {
            int i10 = this.f1948h + this.f1949i;
            this.f1948h = i10;
            int i11 = i10 - this.f1951k;
            int i12 = this.f1954n;
            if (i11 > i12) {
                int i13 = i11 - i12;
                this.f1949i = i13;
                this.f1948h = i10 - i13;
                return;
            }
            this.f1949i = 0;
        }

        private void P() {
            if (this.f1948h - this.f1950j >= 10) {
                Q();
            } else {
                R();
            }
        }

        private void Q() {
            int i10 = 0;
            while (i10 < 10) {
                byte[] bArr = this.f1946f;
                int i11 = this.f1950j;
                this.f1950j = i11 + 1;
                if (bArr[i11] < 0) {
                    i10++;
                } else {
                    return;
                }
            }
            throw b0.e();
        }

        private void R() {
            int i10 = 0;
            while (i10 < 10) {
                if (F() < 0) {
                    i10++;
                } else {
                    return;
                }
            }
            throw b0.e();
        }

        public String A() {
            int J = J();
            if (J > 0) {
                int i10 = this.f1948h;
                int i11 = this.f1950j;
                if (J <= i10 - i11) {
                    String e10 = s1.e(this.f1946f, i11, J);
                    this.f1950j += J;
                    return e10;
                }
            }
            if (J == 0) {
                return "";
            }
            if (J <= 0) {
                throw b0.f();
            }
            throw b0.k();
        }

        public int B() {
            if (e()) {
                this.f1952l = 0;
                return 0;
            }
            int J = J();
            this.f1952l = J;
            if (t1.a(J) != 0) {
                return this.f1952l;
            }
            throw b0.b();
        }

        public int C() {
            return J();
        }

        public long D() {
            return K();
        }

        public boolean E(int i10) {
            int b10 = t1.b(i10);
            if (b10 == 0) {
                P();
                return true;
            } else if (b10 == 1) {
                O(8);
                return true;
            } else if (b10 == 2) {
                O(J());
                return true;
            } else if (b10 == 3) {
                N();
                a(t1.c(t1.a(i10), 4));
                return true;
            } else if (b10 == 4) {
                return false;
            } else {
                if (b10 == 5) {
                    O(4);
                    return true;
                }
                throw b0.d();
            }
        }

        public byte F() {
            int i10 = this.f1950j;
            if (i10 != this.f1948h) {
                byte[] bArr = this.f1946f;
                this.f1950j = i10 + 1;
                return bArr[i10];
            }
            throw b0.k();
        }

        public byte[] G(int i10) {
            if (i10 > 0) {
                int i11 = this.f1948h;
                int i12 = this.f1950j;
                if (i10 <= i11 - i12) {
                    int i13 = i10 + i12;
                    this.f1950j = i13;
                    return Arrays.copyOfRange(this.f1946f, i12, i13);
                }
            }
            if (i10 > 0) {
                throw b0.k();
            } else if (i10 == 0) {
                return a0.f1886c;
            } else {
                throw b0.f();
            }
        }

        public int H() {
            int i10 = this.f1950j;
            if (this.f1948h - i10 >= 4) {
                byte[] bArr = this.f1946f;
                this.f1950j = i10 + 4;
                return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
            }
            throw b0.k();
        }

        public long I() {
            int i10 = this.f1950j;
            if (this.f1948h - i10 >= 8) {
                byte[] bArr = this.f1946f;
                this.f1950j = i10 + 8;
                return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
            }
            throw b0.k();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int J() {
            /*
                r5 = this;
                int r0 = r5.f1950j
                int r1 = r5.f1948h
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f1946f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f1950j = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.L()
                int r1 = (int) r0
                return r1
            L_0x0070:
                r5.f1950j = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.i.b.J():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long K() {
            /*
                r11 = this;
                int r0 = r11.f1950j
                int r1 = r11.f1948h
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f1946f
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f1950j = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.L()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f1950j = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.i.b.K():long");
        }

        /* access modifiers changed from: package-private */
        public long L() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte F = F();
                j10 |= ((long) (F & Byte.MAX_VALUE)) << i10;
                if ((F & 128) == 0) {
                    return j10;
                }
            }
            throw b0.e();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public void N() {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.B()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.E(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.i.b.N():void");
        }

        public void O(int i10) {
            if (i10 >= 0) {
                int i11 = this.f1948h;
                int i12 = this.f1950j;
                if (i10 <= i11 - i12) {
                    this.f1950j = i12 + i10;
                    return;
                }
            }
            if (i10 < 0) {
                throw b0.f();
            }
            throw b0.k();
        }

        public void a(int i10) {
            if (this.f1952l != i10) {
                throw b0.a();
            }
        }

        public int d() {
            return this.f1950j - this.f1951k;
        }

        public boolean e() {
            return this.f1950j == this.f1948h;
        }

        public void k(int i10) {
            this.f1954n = i10;
            M();
        }

        public int l(int i10) {
            if (i10 >= 0) {
                int d10 = i10 + d();
                int i11 = this.f1954n;
                if (d10 <= i11) {
                    this.f1954n = d10;
                    M();
                    return i11;
                }
                throw b0.k();
            }
            throw b0.f();
        }

        public boolean m() {
            return K() != 0;
        }

        public h n() {
            int J = J();
            if (J > 0) {
                int i10 = this.f1948h;
                int i11 = this.f1950j;
                if (J <= i10 - i11) {
                    h k10 = (!this.f1947g || !this.f1953m) ? h.k(this.f1946f, i11, J) : h.M(this.f1946f, i11, J);
                    this.f1950j += J;
                    return k10;
                }
            }
            return J == 0 ? h.f1926n : h.L(G(J));
        }

        public double o() {
            return Double.longBitsToDouble(I());
        }

        public int p() {
            return J();
        }

        public int q() {
            return H();
        }

        public long r() {
            return I();
        }

        public float s() {
            return Float.intBitsToFloat(H());
        }

        public int t() {
            return J();
        }

        public long u() {
            return K();
        }

        public int v() {
            return H();
        }

        public long w() {
            return I();
        }

        public int x() {
            return i.b(J());
        }

        public long y() {
            return i.c(K());
        }

        public String z() {
            int J = J();
            if (J > 0) {
                int i10 = this.f1948h;
                int i11 = this.f1950j;
                if (J <= i10 - i11) {
                    String str = new String(this.f1946f, i11, J, a0.f1884a);
                    this.f1950j += J;
                    return str;
                }
            }
            if (J == 0) {
                return "";
            }
            if (J < 0) {
                throw b0.f();
            }
            throw b0.k();
        }
    }

    private static final class c extends i {

        /* renamed from: f  reason: collision with root package name */
        private final InputStream f1955f;

        /* renamed from: g  reason: collision with root package name */
        private final byte[] f1956g;

        /* renamed from: h  reason: collision with root package name */
        private int f1957h;

        /* renamed from: i  reason: collision with root package name */
        private int f1958i;

        /* renamed from: j  reason: collision with root package name */
        private int f1959j;

        /* renamed from: k  reason: collision with root package name */
        private int f1960k;

        /* renamed from: l  reason: collision with root package name */
        private int f1961l;

        /* renamed from: m  reason: collision with root package name */
        private int f1962m;

        /* renamed from: n  reason: collision with root package name */
        private a f1963n;

        private interface a {
            void a();
        }

        private c(InputStream inputStream, int i10) {
            super();
            this.f1962m = Integer.MAX_VALUE;
            this.f1963n = null;
            a0.b(inputStream, "input");
            this.f1955f = inputStream;
            this.f1956g = new byte[i10];
            this.f1957h = 0;
            this.f1959j = 0;
            this.f1961l = 0;
        }

        private h F(int i10) {
            byte[] I = I(i10);
            if (I != null) {
                return h.i(I);
            }
            int i11 = this.f1959j;
            int i12 = this.f1957h;
            int i13 = i12 - i11;
            this.f1961l += i12;
            this.f1959j = 0;
            this.f1957h = 0;
            List<byte[]> J = J(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f1956g, i11, bArr, 0, i13);
            for (byte[] next : J) {
                System.arraycopy(next, 0, bArr, i13, next.length);
                i13 += next.length;
            }
            return h.L(bArr);
        }

        private byte[] H(int i10, boolean z9) {
            byte[] I = I(i10);
            if (I != null) {
                return z9 ? (byte[]) I.clone() : I;
            }
            int i11 = this.f1959j;
            int i12 = this.f1957h;
            int i13 = i12 - i11;
            this.f1961l += i12;
            this.f1959j = 0;
            this.f1957h = 0;
            List<byte[]> J = J(i10 - i13);
            byte[] bArr = new byte[i10];
            System.arraycopy(this.f1956g, i11, bArr, 0, i13);
            for (byte[] next : J) {
                System.arraycopy(next, 0, bArr, i13, next.length);
                i13 += next.length;
            }
            return bArr;
        }

        private byte[] I(int i10) {
            if (i10 == 0) {
                return a0.f1886c;
            }
            if (i10 >= 0) {
                int i11 = this.f1961l;
                int i12 = this.f1959j;
                int i13 = i11 + i12 + i10;
                if (i13 - this.f1943c <= 0) {
                    int i14 = this.f1962m;
                    if (i13 <= i14) {
                        int i15 = this.f1957h - i12;
                        int i16 = i10 - i15;
                        if (i16 >= 4096 && i16 > this.f1955f.available()) {
                            return null;
                        }
                        byte[] bArr = new byte[i10];
                        System.arraycopy(this.f1956g, this.f1959j, bArr, 0, i15);
                        this.f1961l += this.f1957h;
                        this.f1959j = 0;
                        this.f1957h = 0;
                        while (i15 < i10) {
                            int read = this.f1955f.read(bArr, i15, i10 - i15);
                            if (read != -1) {
                                this.f1961l += read;
                                i15 += read;
                            } else {
                                throw b0.k();
                            }
                        }
                        return bArr;
                    }
                    S((i14 - i11) - i12);
                    throw b0.k();
                }
                throw b0.j();
            }
            throw b0.f();
        }

        private List<byte[]> J(int i10) {
            ArrayList arrayList = new ArrayList();
            while (i10 > 0) {
                int min = Math.min(i10, 4096);
                byte[] bArr = new byte[min];
                int i11 = 0;
                while (i11 < min) {
                    int read = this.f1955f.read(bArr, i11, min - i11);
                    if (read != -1) {
                        this.f1961l += read;
                        i11 += read;
                    } else {
                        throw b0.k();
                    }
                }
                i10 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void P() {
            int i10 = this.f1957h + this.f1958i;
            this.f1957h = i10;
            int i11 = this.f1961l + i10;
            int i12 = this.f1962m;
            if (i11 > i12) {
                int i13 = i11 - i12;
                this.f1958i = i13;
                this.f1957h = i10 - i13;
                return;
            }
            this.f1958i = 0;
        }

        private void Q(int i10) {
            if (X(i10)) {
                return;
            }
            if (i10 > (this.f1943c - this.f1961l) - this.f1959j) {
                throw b0.j();
            }
            throw b0.k();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
            throw new java.lang.IllegalStateException(r8.f1955f.getClass() + "#skip returned invalid result: " + r0 + "\nThe InputStream implementation is buggy.");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void T(int r9) {
            /*
                r8 = this;
                if (r9 < 0) goto L_0x0094
                int r0 = r8.f1961l
                int r1 = r8.f1959j
                int r2 = r0 + r1
                int r2 = r2 + r9
                int r3 = r8.f1962m
                if (r2 > r3) goto L_0x008a
                androidx.datastore.preferences.protobuf.i$c$a r2 = r8.f1963n
                r3 = 0
                if (r2 != 0) goto L_0x006f
                int r0 = r0 + r1
                r8.f1961l = r0
                int r0 = r8.f1957h
                int r0 = r0 - r1
                r8.f1957h = r3
                r8.f1959j = r3
                r3 = r0
            L_0x001d:
                if (r3 >= r9) goto L_0x0067
                int r0 = r9 - r3
                java.io.InputStream r1 = r8.f1955f     // Catch:{ all -> 0x005d }
                long r4 = (long) r0     // Catch:{ all -> 0x005d }
                long r0 = r1.skip(r4)     // Catch:{ all -> 0x005d }
                r6 = 0
                int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r2 < 0) goto L_0x0038
                int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r6 > 0) goto L_0x0038
                if (r2 != 0) goto L_0x0035
                goto L_0x0067
            L_0x0035:
                int r1 = (int) r0     // Catch:{ all -> 0x005d }
                int r3 = r3 + r1
                goto L_0x001d
            L_0x0038:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005d }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
                r2.<init>()     // Catch:{ all -> 0x005d }
                java.io.InputStream r4 = r8.f1955f     // Catch:{ all -> 0x005d }
                java.lang.Class r4 = r4.getClass()     // Catch:{ all -> 0x005d }
                r2.append(r4)     // Catch:{ all -> 0x005d }
                java.lang.String r4 = "#skip returned invalid result: "
                r2.append(r4)     // Catch:{ all -> 0x005d }
                r2.append(r0)     // Catch:{ all -> 0x005d }
                java.lang.String r0 = "\nThe InputStream implementation is buggy."
                r2.append(r0)     // Catch:{ all -> 0x005d }
                java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x005d }
                r9.<init>(r0)     // Catch:{ all -> 0x005d }
                throw r9     // Catch:{ all -> 0x005d }
            L_0x005d:
                r9 = move-exception
                int r0 = r8.f1961l
                int r0 = r0 + r3
                r8.f1961l = r0
                r8.P()
                throw r9
            L_0x0067:
                int r0 = r8.f1961l
                int r0 = r0 + r3
                r8.f1961l = r0
                r8.P()
            L_0x006f:
                if (r3 >= r9) goto L_0x0089
                int r0 = r8.f1957h
                int r1 = r8.f1959j
                int r1 = r0 - r1
                r8.f1959j = r0
                r0 = 1
            L_0x007a:
                r8.Q(r0)
                int r2 = r9 - r1
                int r3 = r8.f1957h
                if (r2 <= r3) goto L_0x0087
                int r1 = r1 + r3
                r8.f1959j = r3
                goto L_0x007a
            L_0x0087:
                r8.f1959j = r2
            L_0x0089:
                return
            L_0x008a:
                int r3 = r3 - r0
                int r3 = r3 - r1
                r8.S(r3)
                androidx.datastore.preferences.protobuf.b0 r9 = androidx.datastore.preferences.protobuf.b0.k()
                throw r9
            L_0x0094:
                androidx.datastore.preferences.protobuf.b0 r9 = androidx.datastore.preferences.protobuf.b0.f()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.i.c.T(int):void");
        }

        private void U() {
            if (this.f1957h - this.f1959j >= 10) {
                V();
            } else {
                W();
            }
        }

        private void V() {
            int i10 = 0;
            while (i10 < 10) {
                byte[] bArr = this.f1956g;
                int i11 = this.f1959j;
                this.f1959j = i11 + 1;
                if (bArr[i11] < 0) {
                    i10++;
                } else {
                    return;
                }
            }
            throw b0.e();
        }

        private void W() {
            int i10 = 0;
            while (i10 < 10) {
                if (G() < 0) {
                    i10++;
                } else {
                    return;
                }
            }
            throw b0.e();
        }

        private boolean X(int i10) {
            int i11 = this.f1959j;
            if (i11 + i10 > this.f1957h) {
                int i12 = this.f1943c;
                int i13 = this.f1961l;
                if (i10 > (i12 - i13) - i11 || i13 + i11 + i10 > this.f1962m) {
                    return false;
                }
                a aVar = this.f1963n;
                if (aVar != null) {
                    aVar.a();
                }
                int i14 = this.f1959j;
                if (i14 > 0) {
                    int i15 = this.f1957h;
                    if (i15 > i14) {
                        byte[] bArr = this.f1956g;
                        System.arraycopy(bArr, i14, bArr, 0, i15 - i14);
                    }
                    this.f1961l += i14;
                    this.f1957h -= i14;
                    this.f1959j = 0;
                }
                InputStream inputStream = this.f1955f;
                byte[] bArr2 = this.f1956g;
                int i16 = this.f1957h;
                int read = inputStream.read(bArr2, i16, Math.min(bArr2.length - i16, (this.f1943c - this.f1961l) - i16));
                if (read == 0 || read < -1 || read > this.f1956g.length) {
                    throw new IllegalStateException(this.f1955f.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read <= 0) {
                    return false;
                } else {
                    this.f1957h += read;
                    P();
                    if (this.f1957h >= i10) {
                        return true;
                    }
                    return X(i10);
                }
            } else {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
        }

        public String A() {
            byte[] bArr;
            int M = M();
            int i10 = this.f1959j;
            int i11 = this.f1957h;
            if (M <= i11 - i10 && M > 0) {
                bArr = this.f1956g;
                this.f1959j = i10 + M;
            } else if (M == 0) {
                return "";
            } else {
                if (M <= i11) {
                    Q(M);
                    bArr = this.f1956g;
                    this.f1959j = M + 0;
                } else {
                    bArr = H(M, false);
                }
                i10 = 0;
            }
            return s1.e(bArr, i10, M);
        }

        public int B() {
            if (e()) {
                this.f1960k = 0;
                return 0;
            }
            int M = M();
            this.f1960k = M;
            if (t1.a(M) != 0) {
                return this.f1960k;
            }
            throw b0.b();
        }

        public int C() {
            return M();
        }

        public long D() {
            return N();
        }

        public boolean E(int i10) {
            int b10 = t1.b(i10);
            if (b10 == 0) {
                U();
                return true;
            } else if (b10 == 1) {
                S(8);
                return true;
            } else if (b10 == 2) {
                S(M());
                return true;
            } else if (b10 == 3) {
                R();
                a(t1.c(t1.a(i10), 4));
                return true;
            } else if (b10 == 4) {
                return false;
            } else {
                if (b10 == 5) {
                    S(4);
                    return true;
                }
                throw b0.d();
            }
        }

        public byte G() {
            if (this.f1959j == this.f1957h) {
                Q(1);
            }
            byte[] bArr = this.f1956g;
            int i10 = this.f1959j;
            this.f1959j = i10 + 1;
            return bArr[i10];
        }

        public int K() {
            int i10 = this.f1959j;
            if (this.f1957h - i10 < 4) {
                Q(4);
                i10 = this.f1959j;
            }
            byte[] bArr = this.f1956g;
            this.f1959j = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }

        public long L() {
            int i10 = this.f1959j;
            if (this.f1957h - i10 < 8) {
                Q(8);
                i10 = this.f1959j;
            }
            byte[] bArr = this.f1956g;
            this.f1959j = i10 + 8;
            return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int M() {
            /*
                r5 = this;
                int r0 = r5.f1959j
                int r1 = r5.f1957h
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f1956g
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f1959j = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.O()
                int r1 = (int) r0
                return r1
            L_0x0070:
                r5.f1959j = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.i.c.M():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long N() {
            /*
                r11 = this;
                int r0 = r11.f1959j
                int r1 = r11.f1957h
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f1956g
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f1959j = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.O()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f1959j = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.i.c.N():long");
        }

        /* access modifiers changed from: package-private */
        public long O() {
            long j10 = 0;
            for (int i10 = 0; i10 < 64; i10 += 7) {
                byte G = G();
                j10 |= ((long) (G & Byte.MAX_VALUE)) << i10;
                if ((G & 128) == 0) {
                    return j10;
                }
            }
            throw b0.e();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        public void R() {
            /*
                r1 = this;
            L_0x0000:
                int r0 = r1.B()
                if (r0 == 0) goto L_0x000c
                boolean r0 = r1.E(r0)
                if (r0 != 0) goto L_0x0000
            L_0x000c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.i.c.R():void");
        }

        public void S(int i10) {
            int i11 = this.f1957h;
            int i12 = this.f1959j;
            if (i10 > i11 - i12 || i10 < 0) {
                T(i10);
            } else {
                this.f1959j = i12 + i10;
            }
        }

        public void a(int i10) {
            if (this.f1960k != i10) {
                throw b0.a();
            }
        }

        public int d() {
            return this.f1961l + this.f1959j;
        }

        public boolean e() {
            return this.f1959j == this.f1957h && !X(1);
        }

        public void k(int i10) {
            this.f1962m = i10;
            P();
        }

        public int l(int i10) {
            if (i10 >= 0) {
                int i11 = i10 + this.f1961l + this.f1959j;
                int i12 = this.f1962m;
                if (i11 <= i12) {
                    this.f1962m = i11;
                    P();
                    return i12;
                }
                throw b0.k();
            }
            throw b0.f();
        }

        public boolean m() {
            return N() != 0;
        }

        public h n() {
            int M = M();
            int i10 = this.f1957h;
            int i11 = this.f1959j;
            if (M > i10 - i11 || M <= 0) {
                return M == 0 ? h.f1926n : F(M);
            }
            h k10 = h.k(this.f1956g, i11, M);
            this.f1959j += M;
            return k10;
        }

        public double o() {
            return Double.longBitsToDouble(L());
        }

        public int p() {
            return M();
        }

        public int q() {
            return K();
        }

        public long r() {
            return L();
        }

        public float s() {
            return Float.intBitsToFloat(K());
        }

        public int t() {
            return M();
        }

        public long u() {
            return N();
        }

        public int v() {
            return K();
        }

        public long w() {
            return L();
        }

        public int x() {
            return i.b(M());
        }

        public long y() {
            return i.c(N());
        }

        public String z() {
            int M = M();
            if (M > 0) {
                int i10 = this.f1957h;
                int i11 = this.f1959j;
                if (M <= i10 - i11) {
                    String str = new String(this.f1956g, i11, M, a0.f1884a);
                    this.f1959j += M;
                    return str;
                }
            }
            if (M == 0) {
                return "";
            }
            if (M > this.f1957h) {
                return new String(H(M, false), a0.f1884a);
            }
            Q(M);
            String str2 = new String(this.f1956g, this.f1959j, M, a0.f1884a);
            this.f1959j += M;
            return str2;
        }
    }

    private i() {
        this.f1942b = 100;
        this.f1943c = Integer.MAX_VALUE;
        this.f1945e = false;
    }

    public static int b(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static i f(InputStream inputStream) {
        return g(inputStream, 4096);
    }

    public static i g(InputStream inputStream, int i10) {
        if (i10 > 0) {
            return inputStream == null ? h(a0.f1886c) : new c(inputStream, i10);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static i h(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static i i(byte[] bArr, int i10, int i11) {
        return j(bArr, i10, i11, false);
    }

    static i j(byte[] bArr, int i10, int i11, boolean z9) {
        b bVar = new b(bArr, i10, i11, z9);
        try {
            bVar.l(i11);
            return bVar;
        } catch (b0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract String A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract boolean E(int i10);

    public abstract void a(int i10);

    public abstract int d();

    public abstract boolean e();

    public abstract void k(int i10);

    public abstract int l(int i10);

    public abstract boolean m();

    public abstract h n();

    public abstract double o();

    public abstract int p();

    public abstract int q();

    public abstract long r();

    public abstract float s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract long y();

    public abstract String z();
}
