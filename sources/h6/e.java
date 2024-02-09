package h6;

import g6.c;
import java.math.BigInteger;
import java.util.Arrays;
import o5.f;
import u5.h;

final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f9398a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f9399b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* renamed from: c  reason: collision with root package name */
    private static final BigInteger[] f9400c;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9401a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                h6.e$b[] r0 = h6.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f9401a = r0
                h6.e$b r1 = h6.e.b.ALPHA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f9401a     // Catch:{ NoSuchFieldError -> 0x001d }
                h6.e$b r1 = h6.e.b.LOWER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f9401a     // Catch:{ NoSuchFieldError -> 0x0028 }
                h6.e$b r1 = h6.e.b.MIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f9401a     // Catch:{ NoSuchFieldError -> 0x0033 }
                h6.e$b r1 = h6.e.b.PUNCT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f9401a     // Catch:{ NoSuchFieldError -> 0x003e }
                h6.e$b r1 = h6.e.b.ALPHA_SHIFT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f9401a     // Catch:{ NoSuchFieldError -> 0x0049 }
                h6.e$b r1 = h6.e.b.PUNCT_SHIFT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: h6.e.a.<clinit>():void");
        }
    }

    private enum b {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f9400c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900);
        bigIntegerArr[1] = valueOf;
        int i10 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f9400c;
            if (i10 < bigIntegerArr2.length) {
                bigIntegerArr2[i10] = bigIntegerArr2[i10 - 1].multiply(valueOf);
                i10++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(int r11, int[] r12, int r13, u5.h r14) {
        /*
            r0 = 1
            r1 = 0
            r2 = 0
        L_0x0003:
            r3 = r12[r1]
            if (r13 >= r3) goto L_0x008d
            if (r2 != 0) goto L_0x008d
        L_0x0009:
            r3 = r12[r1]
            r4 = 927(0x39f, float:1.299E-42)
            if (r13 >= r3) goto L_0x001c
            r3 = r12[r13]
            if (r3 != r4) goto L_0x001c
            int r13 = r13 + 1
            r3 = r12[r13]
            r14.f(r3)
            int r13 = r13 + r0
            goto L_0x0009
        L_0x001c:
            r3 = r12[r1]
            if (r13 >= r3) goto L_0x008a
            r3 = r12[r13]
            r5 = 900(0x384, float:1.261E-42)
            if (r3 < r5) goto L_0x0028
            goto L_0x008a
        L_0x0028:
            r6 = 0
            r3 = 0
        L_0x002b:
            r8 = 900(0x384, double:4.447E-321)
            long r6 = r6 * r8
            int r8 = r13 + 1
            r13 = r12[r13]
            long r9 = (long) r13
            long r6 = r6 + r9
            int r3 = r3 + r0
            r13 = 5
            if (r3 >= r13) goto L_0x0044
            r9 = r12[r1]
            if (r8 >= r9) goto L_0x0044
            r9 = r12[r8]
            if (r9 < r5) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r13 = r8
            goto L_0x002b
        L_0x0044:
            if (r3 != r13) goto L_0x0064
            r13 = 924(0x39c, float:1.295E-42)
            if (r11 == r13) goto L_0x0052
            r13 = r12[r1]
            if (r8 >= r13) goto L_0x0064
            r13 = r12[r8]
            if (r13 >= r5) goto L_0x0064
        L_0x0052:
            r13 = 0
        L_0x0053:
            r3 = 6
            if (r13 >= r3) goto L_0x0087
            int r3 = 5 - r13
            int r3 = r3 * 8
            long r3 = r6 >> r3
            int r4 = (int) r3
            byte r3 = (byte) r4
            r14.a(r3)
            int r13 = r13 + 1
            goto L_0x0053
        L_0x0064:
            int r8 = r8 - r3
        L_0x0065:
            r13 = r12[r1]
            if (r8 >= r13) goto L_0x0087
            if (r2 != 0) goto L_0x0087
            int r13 = r8 + 1
            r3 = r12[r8]
            if (r3 >= r5) goto L_0x0077
            byte r3 = (byte) r3
            r14.a(r3)
            r8 = r13
            goto L_0x0065
        L_0x0077:
            if (r3 != r4) goto L_0x0082
            int r3 = r13 + 1
            r13 = r12[r13]
            r14.f(r13)
            r8 = r3
            goto L_0x0065
        L_0x0082:
            int r13 = r13 + -1
            r8 = r13
            r2 = 1
            goto L_0x0065
        L_0x0087:
            r13 = r8
            goto L_0x0003
        L_0x008a:
            r2 = 1
            goto L_0x0003
        L_0x008d:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: h6.e.a(int, int[], int, u5.h):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        r1 = a(r1, r5, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        r1 = g(r5, r3, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static u5.e b(int[] r5, java.lang.String r6) {
        /*
            u5.h r0 = new u5.h
            int r1 = r5.length
            int r1 = r1 * 2
            r0.<init>(r1)
            r1 = 1
            int r1 = g(r5, r1, r0)
            g6.c r2 = new g6.c
            r2.<init>()
        L_0x0012:
            r3 = 0
            r3 = r5[r3]
            if (r1 >= r3) goto L_0x0059
            int r3 = r1 + 1
            r1 = r5[r1]
            r4 = 913(0x391, float:1.28E-42)
            if (r1 == r4) goto L_0x0050
            switch(r1) {
                case 900: goto L_0x004b;
                case 901: goto L_0x0046;
                case 902: goto L_0x0041;
                default: goto L_0x0022;
            }
        L_0x0022:
            switch(r1) {
                case 922: goto L_0x003c;
                case 923: goto L_0x003c;
                case 924: goto L_0x0046;
                case 925: goto L_0x0038;
                case 926: goto L_0x0035;
                case 927: goto L_0x002d;
                case 928: goto L_0x0028;
                default: goto L_0x0025;
            }
        L_0x0025:
            int r3 = r3 + -1
            goto L_0x004b
        L_0x0028:
            int r1 = d(r5, r3, r2)
            goto L_0x0012
        L_0x002d:
            int r1 = r3 + 1
            r3 = r5[r3]
            r0.f(r3)
            goto L_0x0012
        L_0x0035:
            int r3 = r3 + 2
            goto L_0x003a
        L_0x0038:
            int r3 = r3 + 1
        L_0x003a:
            r1 = r3
            goto L_0x0012
        L_0x003c:
            o5.f r5 = o5.f.a()
            throw r5
        L_0x0041:
            int r1 = f(r5, r3, r0)
            goto L_0x0012
        L_0x0046:
            int r1 = a(r1, r5, r3, r0)
            goto L_0x0012
        L_0x004b:
            int r1 = g(r5, r3, r0)
            goto L_0x0012
        L_0x0050:
            int r1 = r3 + 1
            r3 = r5[r3]
            char r3 = (char) r3
            r0.b(r3)
            goto L_0x0012
        L_0x0059:
            boolean r5 = r0.h()
            if (r5 == 0) goto L_0x006b
            java.lang.String r5 = r2.a()
            if (r5 == 0) goto L_0x0066
            goto L_0x006b
        L_0x0066:
            o5.f r5 = o5.f.a()
            throw r5
        L_0x006b:
            u5.e r5 = new u5.e
            java.lang.String r0 = r0.toString()
            r1 = 0
            r5.<init>(r1, r0, r1, r6)
            r5.n(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h6.e.b(int[], java.lang.String):u5.e");
    }

    private static String c(int[] iArr, int i10) {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i11 = 0; i11 < i10; i11++) {
            bigInteger = bigInteger.add(f9400c[(i10 - i11) - 1].multiply(BigInteger.valueOf((long) iArr[i11])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw f.a();
    }

    static int d(int[] iArr, int i10, c cVar) {
        if (i10 + 2 <= iArr[0]) {
            int[] iArr2 = new int[2];
            int i11 = 0;
            while (i11 < 2) {
                iArr2[i11] = iArr[i10];
                i11++;
                i10++;
            }
            String c10 = c(iArr2, 2);
            if (c10.isEmpty()) {
                cVar.k(0);
            } else {
                try {
                    cVar.k(Integer.parseInt(c10));
                } catch (NumberFormatException unused) {
                    throw f.a();
                }
            }
            StringBuilder sb = new StringBuilder();
            while (r9 < iArr[0] && r9 < iArr.length && iArr[r9] != 922 && iArr[r9] != 923) {
                sb.append(String.format("%03d", new Object[]{Integer.valueOf(iArr[r9])}));
                i10 = r9 + 1;
            }
            if (sb.length() != 0) {
                cVar.e(sb.toString());
                int i12 = iArr[r9] == 923 ? r9 + 1 : -1;
                while (r9 < iArr[0]) {
                    int i13 = iArr[r9];
                    if (i13 == 922) {
                        r9++;
                        cVar.h(true);
                    } else if (i13 == 923) {
                        int i14 = r9 + 1;
                        switch (iArr[i14]) {
                            case 0:
                                h hVar = new h();
                                r9 = g(iArr, i14 + 1, hVar);
                                cVar.f(hVar.toString());
                                break;
                            case 1:
                                h hVar2 = new h();
                                r9 = f(iArr, i14 + 1, hVar2);
                                cVar.j(Integer.parseInt(hVar2.toString()));
                                break;
                            case 2:
                                h hVar3 = new h();
                                r9 = f(iArr, i14 + 1, hVar3);
                                cVar.m(Long.parseLong(hVar3.toString()));
                                break;
                            case 3:
                                h hVar4 = new h();
                                r9 = g(iArr, i14 + 1, hVar4);
                                cVar.l(hVar4.toString());
                                break;
                            case 4:
                                h hVar5 = new h();
                                r9 = g(iArr, i14 + 1, hVar5);
                                cVar.c(hVar5.toString());
                                break;
                            case 5:
                                h hVar6 = new h();
                                r9 = f(iArr, i14 + 1, hVar6);
                                cVar.g(Long.parseLong(hVar6.toString()));
                                break;
                            case 6:
                                h hVar7 = new h();
                                r9 = f(iArr, i14 + 1, hVar7);
                                cVar.d(Integer.parseInt(hVar7.toString()));
                                break;
                            default:
                                throw f.a();
                        }
                    } else {
                        throw f.a();
                    }
                }
                if (i12 != -1) {
                    int i15 = r9 - i12;
                    if (cVar.b()) {
                        i15--;
                    }
                    cVar.i(Arrays.copyOfRange(iArr, i12, i15 + i12));
                }
                return r9;
            }
            throw f.a();
        }
        throw f.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        r7 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0023, code lost:
        r7 = r4;
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ba, code lost:
        r7 = (char) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00bb, code lost:
        r14 = r4;
        r4 = r3;
        r3 = r7;
        r7 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c8, code lost:
        r4 = h6.e.b.PUNCT_SHIFT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ca, code lost:
        r9 = 0;
        r14 = r4;
        r4 = r3;
        r3 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0025, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00dc, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00e1, code lost:
        r7 = r4;
        r4 = r3;
        r3 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e4, code lost:
        if (r3 == 0) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e6, code lost:
        r0.b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00e9, code lost:
        r6 = r6 + 1;
        r3 = r4;
        r4 = r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static h6.e.b e(int[] r15, int[] r16, int r17, u5.h r18, h6.e.b r19) {
        /*
            r0 = r18
            r1 = 0
            r5 = r17
            r2 = r19
            r3 = r2
            r4 = r3
            r6 = 0
        L_0x000a:
            if (r6 >= r5) goto L_0x00ef
            r7 = r15[r6]
            int[] r8 = h6.e.a.f9401a
            int r9 = r3.ordinal()
            r8 = r8[r9]
            r9 = 32
            r10 = 29
            r11 = 26
            r12 = 913(0x391, float:1.28E-42)
            r13 = 900(0x384, float:1.261E-42)
            switch(r8) {
                case 1: goto L_0x00b6;
                case 2: goto L_0x0095;
                case 3: goto L_0x0071;
                case 4: goto L_0x0057;
                case 5: goto L_0x0041;
                case 6: goto L_0x0028;
                default: goto L_0x0023;
            }
        L_0x0023:
            r7 = r4
            r4 = r3
        L_0x0025:
            r3 = 0
            goto L_0x00e4
        L_0x0028:
            if (r7 >= r10) goto L_0x002f
            char[] r3 = f9398a
            char r3 = r3[r7]
            goto L_0x0046
        L_0x002f:
            if (r7 == r10) goto L_0x003e
            if (r7 == r13) goto L_0x003e
            if (r7 == r12) goto L_0x0036
            goto L_0x003c
        L_0x0036:
            r3 = r16[r6]
            char r3 = (char) r3
            r0.b(r3)
        L_0x003c:
            r7 = r4
            goto L_0x0025
        L_0x003e:
            h6.e$b r3 = h6.e.b.ALPHA
            goto L_0x0023
        L_0x0041:
            if (r7 >= r11) goto L_0x0049
            int r7 = r7 + 65
            char r3 = (char) r7
        L_0x0046:
            r7 = r4
            goto L_0x00e4
        L_0x0049:
            if (r7 == r11) goto L_0x0054
            if (r7 == r13) goto L_0x0050
            r3 = r4
            goto L_0x00dc
        L_0x0050:
            h6.e$b r3 = h6.e.b.ALPHA
            goto L_0x00dc
        L_0x0054:
            r3 = r4
            goto L_0x00e1
        L_0x0057:
            if (r7 >= r10) goto L_0x005f
            char[] r8 = f9398a
            char r7 = r8[r7]
            goto L_0x00bb
        L_0x005f:
            if (r7 == r10) goto L_0x006d
            if (r7 == r13) goto L_0x006d
            if (r7 == r12) goto L_0x0066
            goto L_0x0023
        L_0x0066:
            r7 = r16[r6]
            char r7 = (char) r7
            r0.b(r7)
            goto L_0x0023
        L_0x006d:
            h6.e$b r2 = h6.e.b.ALPHA
            r3 = r2
            goto L_0x0023
        L_0x0071:
            r8 = 25
            if (r7 >= r8) goto L_0x007a
            char[] r8 = f9399b
            char r7 = r8[r7]
            goto L_0x00bb
        L_0x007a:
            if (r7 == r13) goto L_0x0092
            if (r7 == r12) goto L_0x008b
            switch(r7) {
                case 25: goto L_0x0086;
                case 26: goto L_0x00e1;
                case 27: goto L_0x0083;
                case 28: goto L_0x0092;
                case 29: goto L_0x00c8;
                default: goto L_0x0081;
            }
        L_0x0081:
            goto L_0x00dc
        L_0x0083:
            h6.e$b r2 = h6.e.b.LOWER
            goto L_0x0088
        L_0x0086:
            h6.e$b r2 = h6.e.b.PUNCT
        L_0x0088:
            r3 = r2
            goto L_0x00dc
        L_0x008b:
            r7 = r16[r6]
            char r7 = (char) r7
            r0.b(r7)
            goto L_0x00dc
        L_0x0092:
            h6.e$b r2 = h6.e.b.ALPHA
            goto L_0x0088
        L_0x0095:
            if (r7 >= r11) goto L_0x009a
            int r7 = r7 + 97
            goto L_0x00ba
        L_0x009a:
            if (r7 == r13) goto L_0x00b3
            if (r7 == r12) goto L_0x00ac
            switch(r7) {
                case 26: goto L_0x00e1;
                case 27: goto L_0x00a9;
                case 28: goto L_0x00a5;
                case 29: goto L_0x00a2;
                default: goto L_0x00a1;
            }
        L_0x00a1:
            goto L_0x00dc
        L_0x00a2:
            h6.e$b r4 = h6.e.b.PUNCT_SHIFT
            goto L_0x00ca
        L_0x00a5:
            h6.e$b r2 = h6.e.b.MIXED
        L_0x00a7:
            r3 = r2
            goto L_0x00dc
        L_0x00a9:
            h6.e$b r4 = h6.e.b.ALPHA_SHIFT
            goto L_0x00ca
        L_0x00ac:
            r7 = r16[r6]
            char r7 = (char) r7
            r0.b(r7)
            goto L_0x00dc
        L_0x00b3:
            h6.e$b r2 = h6.e.b.ALPHA
            goto L_0x00a7
        L_0x00b6:
            if (r7 >= r11) goto L_0x00c0
            int r7 = r7 + 65
        L_0x00ba:
            char r7 = (char) r7
        L_0x00bb:
            r14 = r4
            r4 = r3
            r3 = r7
            r7 = r14
            goto L_0x00e4
        L_0x00c0:
            if (r7 == r13) goto L_0x00de
            if (r7 == r12) goto L_0x00d6
            switch(r7) {
                case 26: goto L_0x00e1;
                case 27: goto L_0x00d2;
                case 28: goto L_0x00cf;
                case 29: goto L_0x00c8;
                default: goto L_0x00c7;
            }
        L_0x00c7:
            goto L_0x00dc
        L_0x00c8:
            h6.e$b r4 = h6.e.b.PUNCT_SHIFT
        L_0x00ca:
            r9 = 0
            r14 = r4
            r4 = r3
            r3 = r14
            goto L_0x00e1
        L_0x00cf:
            h6.e$b r2 = h6.e.b.MIXED
            goto L_0x00d4
        L_0x00d2:
            h6.e$b r2 = h6.e.b.LOWER
        L_0x00d4:
            r3 = r2
            goto L_0x00dc
        L_0x00d6:
            r7 = r16[r6]
            char r7 = (char) r7
            r0.b(r7)
        L_0x00dc:
            r9 = 0
            goto L_0x00e1
        L_0x00de:
            h6.e$b r2 = h6.e.b.ALPHA
            goto L_0x00d4
        L_0x00e1:
            r7 = r4
            r4 = r3
            r3 = r9
        L_0x00e4:
            if (r3 == 0) goto L_0x00e9
            r0.b(r3)
        L_0x00e9:
            int r6 = r6 + 1
            r3 = r4
            r4 = r7
            goto L_0x000a
        L_0x00ef:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h6.e.e(int[], int[], int, u5.h, h6.e$b):h6.e$b");
    }

    private static int f(int[] iArr, int i10, h hVar) {
        int[] iArr2 = new int[15];
        boolean z9 = false;
        int i11 = 0;
        while (i10 < iArr[0] && !z9) {
            int i12 = i10 + 1;
            int i13 = iArr[i10];
            if (i12 == iArr[0]) {
                z9 = true;
            }
            if (i13 < 900) {
                iArr2[i11] = i13;
                i11++;
            } else {
                if (!(i13 == 900 || i13 == 901 || i13 == 927 || i13 == 928)) {
                    switch (i13) {
                        case 922:
                        case 923:
                        case 924:
                            break;
                    }
                }
                i12--;
                z9 = true;
            }
            if ((i11 % 15 == 0 || i13 == 902 || z9) && i11 > 0) {
                hVar.d(c(iArr2, i11));
                i11 = 0;
            }
            i10 = i12;
        }
        return i10;
    }

    private static int g(int[] iArr, int i10, h hVar) {
        int[] iArr2 = new int[((iArr[0] - i10) * 2)];
        int[] iArr3 = new int[((iArr[0] - i10) * 2)];
        b bVar = b.ALPHA;
        boolean z9 = false;
        int i11 = 0;
        while (i10 < iArr[0] && !z9) {
            int i12 = i10 + 1;
            int i13 = iArr[i10];
            if (i13 < 900) {
                iArr2[i11] = i13 / 30;
                iArr2[i11 + 1] = i13 % 30;
                i11 += 2;
            } else if (i13 == 913) {
                iArr2[i11] = 913;
                i10 = i12 + 1;
                iArr3[i11] = iArr[i12];
                i11++;
            } else if (i13 != 927) {
                if (i13 != 928) {
                    switch (i13) {
                        case 900:
                            iArr2[i11] = 900;
                            i11++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i13) {
                                case 922:
                                case 923:
                                case 924:
                                    break;
                            }
                    }
                }
                i12--;
                z9 = true;
            } else {
                b e10 = e(iArr2, iArr3, i11, hVar, bVar);
                int i14 = i12 + 1;
                hVar.f(iArr[i12]);
                i11 = 0;
                int[] iArr4 = new int[((iArr[0] - i14) * 2)];
                bVar = e10;
                i10 = i14;
                iArr2 = new int[((iArr[0] - i14) * 2)];
                iArr3 = iArr4;
            }
            i10 = i12;
            continue;
        }
        e(iArr2, iArr3, i11, hVar, bVar);
        return i10;
    }
}
