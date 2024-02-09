package q5;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import o5.f;
import u5.e;
import w5.d;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f11987b = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f11988c = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f11989d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f11990e = {"FLG(n)", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f11991f = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: g  reason: collision with root package name */
    private static final Charset f11992g = StandardCharsets.ISO_8859_1;

    /* renamed from: a  reason: collision with root package name */
    private p5.a f11993a;

    /* renamed from: q5.a$a  reason: collision with other inner class name */
    static /* synthetic */ class C0204a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f11994a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                q5.a$c[] r0 = q5.a.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11994a = r0
                q5.a$c r1 = q5.a.c.UPPER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11994a     // Catch:{ NoSuchFieldError -> 0x001d }
                q5.a$c r1 = q5.a.c.LOWER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11994a     // Catch:{ NoSuchFieldError -> 0x0028 }
                q5.a$c r1 = q5.a.c.MIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f11994a     // Catch:{ NoSuchFieldError -> 0x0033 }
                q5.a$c r1 = q5.a.c.PUNCT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f11994a     // Catch:{ NoSuchFieldError -> 0x003e }
                q5.a$c r1 = q5.a.c.DIGIT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q5.a.C0204a.<clinit>():void");
        }
    }

    static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final boolean[] f11995a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final int f11996b;

        b(boolean[] zArr, int i10) {
            this.f11995a = zArr;
            this.f11996b = i10;
        }
    }

    private enum c {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    static byte[] a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = h(zArr, i10 * 8);
        }
        return bArr;
    }

    private b b(boolean[] zArr) {
        w5.a aVar;
        int i10 = 8;
        if (this.f11993a.d() <= 2) {
            i10 = 6;
            aVar = w5.a.f12976j;
        } else if (this.f11993a.d() <= 8) {
            aVar = w5.a.f12980n;
        } else if (this.f11993a.d() <= 22) {
            i10 = 10;
            aVar = w5.a.f12975i;
        } else {
            i10 = 12;
            aVar = w5.a.f12974h;
        }
        int c10 = this.f11993a.c();
        int length = zArr.length / i10;
        if (length >= c10) {
            int length2 = zArr.length % i10;
            int[] iArr = new int[length];
            int i11 = 0;
            while (i11 < length) {
                iArr[i11] = i(zArr, length2, i10);
                i11++;
                length2 += i10;
            }
            try {
                w5.c cVar = new w5.c(aVar);
                int i12 = length - c10;
                cVar.a(iArr, i12);
                int i13 = (1 << i10) - 1;
                int i14 = 0;
                for (int i15 = 0; i15 < c10; i15++) {
                    int i16 = iArr[i15];
                    if (i16 == 0 || i16 == i13) {
                        throw f.a();
                    }
                    if (i16 == 1 || i16 == i13 - 1) {
                        i14++;
                    }
                }
                boolean[] zArr2 = new boolean[((c10 * i10) - i14)];
                int i17 = 0;
                for (int i18 = 0; i18 < c10; i18++) {
                    int i19 = iArr[i18];
                    if (i19 == 1 || i19 == i13 - 1) {
                        Arrays.fill(zArr2, i17, (i17 + i10) - 1, i19 > 1);
                        i17 += i10 - 1;
                    } else {
                        int i20 = i10 - 1;
                        while (i20 >= 0) {
                            int i21 = i17 + 1;
                            zArr2[i17] = ((1 << i20) & i19) != 0;
                            i20--;
                            i17 = i21;
                        }
                    }
                }
                return new b(zArr2, (i12 * 100) / length);
            } catch (d e10) {
                throw f.b(e10);
            }
        } else {
            throw f.a();
        }
    }

    private boolean[] d(u5.b bVar) {
        u5.b bVar2 = bVar;
        boolean e10 = this.f11993a.e();
        int d10 = this.f11993a.d();
        int i10 = (e10 ? 11 : 14) + (d10 * 4);
        int[] iArr = new int[i10];
        boolean[] zArr = new boolean[j(d10, e10)];
        int i11 = 2;
        if (e10) {
            for (int i12 = 0; i12 < i10; i12++) {
                iArr[i12] = i12;
            }
        } else {
            int i13 = i10 / 2;
            int i14 = ((i10 + 1) + (((i13 - 1) / 15) * 2)) / 2;
            for (int i15 = 0; i15 < i13; i15++) {
                int i16 = (i15 / 15) + i15;
                iArr[(i13 - i15) - 1] = (i14 - i16) - 1;
                iArr[i13 + i15] = i16 + i14 + 1;
            }
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < d10) {
            int i19 = ((d10 - i17) * 4) + (e10 ? 9 : 12);
            int i20 = i17 * 2;
            int i21 = (i10 - 1) - i20;
            int i22 = 0;
            while (i22 < i19) {
                int i23 = i22 * 2;
                int i24 = 0;
                while (i24 < i11) {
                    int i25 = i20 + i24;
                    int i26 = i20 + i22;
                    zArr[i18 + i23 + i24] = bVar2.h(iArr[i25], iArr[i26]);
                    int i27 = iArr[i26];
                    int i28 = i21 - i24;
                    zArr[(i19 * 2) + i18 + i23 + i24] = bVar2.h(i27, iArr[i28]);
                    int i29 = i21 - i22;
                    zArr[(i19 * 4) + i18 + i23 + i24] = bVar2.h(iArr[i28], iArr[i29]);
                    zArr[(i19 * 6) + i18 + i23 + i24] = bVar2.h(iArr[i29], iArr[i25]);
                    i24++;
                    d10 = d10;
                    e10 = e10;
                    i11 = 2;
                }
                boolean z9 = e10;
                int i30 = d10;
                i22++;
                i11 = 2;
            }
            boolean z10 = e10;
            int i31 = d10;
            i18 += i19 * 8;
            i17++;
            i11 = 2;
        }
        return zArr;
    }

    private static String e(c cVar, int i10) {
        int i11 = C0204a.f11994a[cVar.ordinal()];
        if (i11 == 1) {
            return f11987b[i10];
        }
        if (i11 == 2) {
            return f11988c[i10];
        }
        if (i11 == 3) {
            return f11989d[i10];
        }
        if (i11 == 4) {
            return f11990e[i10];
        }
        if (i11 == 5) {
            return f11991f[i10];
        }
        throw new IllegalStateException("Bad table");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b6, code lost:
        throw o5.f.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String f(boolean[] r14) {
        /*
            int r0 = r14.length
            q5.a$c r1 = q5.a.c.UPPER
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r14.length
            r4 = 5
            int r3 = r3 - r4
            r5 = 4
            int r3 = r3 / r5
            r2.<init>(r3)
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            java.nio.charset.Charset r6 = f11992g
            r7 = 0
            r8 = r6
            r9 = 0
            r6 = r1
        L_0x0018:
            if (r9 >= r0) goto L_0x0105
            q5.a$c r10 = q5.a.c.BINARY
            r11 = 11
            if (r1 != r10) goto L_0x0056
            int r1 = r0 - r9
            if (r1 >= r4) goto L_0x0026
            goto L_0x0105
        L_0x0026:
            int r1 = i(r14, r9, r4)
            int r9 = r9 + 5
            if (r1 != 0) goto L_0x003c
            int r1 = r0 - r9
            if (r1 >= r11) goto L_0x0034
            goto L_0x0105
        L_0x0034:
            int r1 = i(r14, r9, r11)
            int r1 = r1 + 31
            int r9 = r9 + 11
        L_0x003c:
            r10 = 0
        L_0x003d:
            if (r10 >= r1) goto L_0x0054
            int r11 = r0 - r9
            r12 = 8
            if (r11 >= r12) goto L_0x0047
            r9 = r0
            goto L_0x0054
        L_0x0047:
            int r11 = i(r14, r9, r12)
            byte r11 = (byte) r11
            r3.write(r11)
            int r9 = r9 + 8
            int r10 = r10 + 1
            goto L_0x003d
        L_0x0054:
            r1 = r6
            goto L_0x0018
        L_0x0056:
            q5.a$c r10 = q5.a.c.DIGIT
            if (r1 != r10) goto L_0x005c
            r10 = 4
            goto L_0x005d
        L_0x005c:
            r10 = 5
        L_0x005d:
            int r12 = r0 - r9
            if (r12 >= r10) goto L_0x0063
            goto L_0x0105
        L_0x0063:
            int r12 = i(r14, r9, r10)
            int r9 = r9 + r10
            java.lang.String r10 = e(r1, r12)
            java.lang.String r12 = "FLG(n)"
            boolean r12 = r12.equals(r10)
            if (r12 == 0) goto L_0x00d9
            int r1 = r0 - r9
            r10 = 3
            if (r1 >= r10) goto L_0x007b
            goto L_0x0105
        L_0x007b:
            int r1 = i(r14, r9, r10)
            int r9 = r9 + 3
            java.lang.String r10 = r8.name()     // Catch:{ UnsupportedEncodingException -> 0x00d2 }
            java.lang.String r10 = r3.toString(r10)     // Catch:{ UnsupportedEncodingException -> 0x00d2 }
            r2.append(r10)     // Catch:{ UnsupportedEncodingException -> 0x00d2 }
            r3.reset()
            if (r1 == 0) goto L_0x00cc
            r10 = 7
            if (r1 == r10) goto L_0x00c7
            int r10 = r0 - r9
            int r12 = r1 * 4
            if (r10 >= r12) goto L_0x009b
            goto L_0x0054
        L_0x009b:
            r8 = 0
        L_0x009c:
            int r10 = r1 + -1
            if (r1 <= 0) goto L_0x00b7
            int r1 = i(r14, r9, r5)
            int r9 = r9 + 4
            r12 = 2
            if (r1 < r12) goto L_0x00b2
            if (r1 > r11) goto L_0x00b2
            int r8 = r8 * 10
            int r1 = r1 + -2
            int r8 = r8 + r1
            r1 = r10
            goto L_0x009c
        L_0x00b2:
            o5.f r14 = o5.f.a()
            throw r14
        L_0x00b7:
            u5.d r1 = u5.d.getCharacterSetECIByValue(r8)
            if (r1 == 0) goto L_0x00c2
            java.nio.charset.Charset r8 = r1.getCharset()
            goto L_0x0054
        L_0x00c2:
            o5.f r14 = o5.f.a()
            throw r14
        L_0x00c7:
            o5.f r14 = o5.f.a()
            throw r14
        L_0x00cc:
            r1 = 29
            r2.append(r1)
            goto L_0x0054
        L_0x00d2:
            r14 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r14)
            throw r0
        L_0x00d9:
            java.lang.String r11 = "CTRL_"
            boolean r11 = r10.startsWith(r11)
            if (r11 == 0) goto L_0x00f9
            char r6 = r10.charAt(r4)
            q5.a$c r6 = g(r6)
            r11 = 6
            char r10 = r10.charAt(r11)
            r11 = 76
            if (r10 != r11) goto L_0x00f4
            goto L_0x0054
        L_0x00f4:
            r13 = r6
            r6 = r1
            r1 = r13
            goto L_0x0018
        L_0x00f9:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.US_ASCII
            byte[] r1 = r10.getBytes(r1)
            int r10 = r1.length
            r3.write(r1, r7, r10)
            goto L_0x0054
        L_0x0105:
            java.lang.String r14 = r8.name()     // Catch:{ UnsupportedEncodingException -> 0x0115 }
            java.lang.String r14 = r3.toString(r14)     // Catch:{ UnsupportedEncodingException -> 0x0115 }
            r2.append(r14)     // Catch:{ UnsupportedEncodingException -> 0x0115 }
            java.lang.String r14 = r2.toString()
            return r14
        L_0x0115:
            r14 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.a.f(boolean[]):java.lang.String");
    }

    private static c g(char c10) {
        return c10 != 'B' ? c10 != 'D' ? c10 != 'P' ? c10 != 'L' ? c10 != 'M' ? c.UPPER : c.MIXED : c.LOWER : c.PUNCT : c.DIGIT : c.BINARY;
    }

    private static byte h(boolean[] zArr, int i10) {
        int length = zArr.length - i10;
        return (byte) (length >= 8 ? i(zArr, i10, 8) : i(zArr, i10, length) << (8 - length));
    }

    private static int i(boolean[] zArr, int i10, int i11) {
        int i12 = 0;
        for (int i13 = i10; i13 < i10 + i11; i13++) {
            i12 <<= 1;
            if (zArr[i13]) {
                i12 |= 1;
            }
        }
        return i12;
    }

    private static int j(int i10, boolean z9) {
        return ((z9 ? 88 : 112) + (i10 * 16)) * i10;
    }

    public e c(p5.a aVar) {
        this.f11993a = aVar;
        b b10 = b(d(aVar.a()));
        e eVar = new e(a(b10.f11995a), f(b10.f11995a), (List<byte[]>) null, String.format("%d%%", new Object[]{Integer.valueOf(b10.f11996b)}));
        eVar.m(b10.f11995a.length);
        return eVar;
    }
}
