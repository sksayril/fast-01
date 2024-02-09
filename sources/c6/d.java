package c6;

import java.util.Arrays;
import java.util.Map;
import o5.e;
import o5.j;
import o5.n;
import o5.o;
import o5.p;
import u5.a;

public final class d extends k {

    /* renamed from: c  reason: collision with root package name */
    private static final char[] f3820c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* renamed from: d  reason: collision with root package name */
    static final int[] f3821d;

    /* renamed from: e  reason: collision with root package name */
    static final int f3822e;

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f3823a = new StringBuilder(20);

    /* renamed from: b  reason: collision with root package name */
    private final int[] f3824b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f3821d = iArr;
        f3822e = iArr[47];
    }

    private static void i(CharSequence charSequence) {
        int length = charSequence.length();
        j(charSequence, length - 2, 20);
        j(charSequence, length - 1, 15);
    }

    private static void j(CharSequence charSequence, int i10, int i11) {
        int i12 = 0;
        int i13 = 1;
        for (int i14 = i10 - 1; i14 >= 0; i14--) {
            i12 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i14)) * i13;
            i13++;
            if (i13 > i11) {
                i13 = 1;
            }
        }
        if (charSequence.charAt(i10) != f3820c[i12 % 47]) {
            throw o5.d.a();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        r4 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String k(java.lang.CharSequence r9) {
        /*
            int r0 = r9.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r2 = 0
            r3 = 0
        L_0x000b:
            if (r3 >= r0) goto L_0x00b0
            char r4 = r9.charAt(r3)
            r5 = 97
            if (r4 < r5) goto L_0x00a9
            r5 = 100
            if (r4 > r5) goto L_0x00a9
            int r5 = r0 + -1
            if (r3 >= r5) goto L_0x00a4
            int r3 = r3 + 1
            char r5 = r9.charAt(r3)
            r6 = 79
            r7 = 90
            r8 = 65
            switch(r4) {
                case 97: goto L_0x0097;
                case 98: goto L_0x004e;
                case 99: goto L_0x003c;
                case 100: goto L_0x002f;
                default: goto L_0x002c;
            }
        L_0x002c:
            r4 = 0
            goto L_0x00a9
        L_0x002f:
            if (r5 < r8) goto L_0x0037
            if (r5 > r7) goto L_0x0037
            int r5 = r5 + 32
            goto L_0x009d
        L_0x0037:
            o5.f r9 = o5.f.a()
            throw r9
        L_0x003c:
            if (r5 < r8) goto L_0x0043
            if (r5 > r6) goto L_0x0043
            int r5 = r5 + -32
            goto L_0x009d
        L_0x0043:
            if (r5 != r7) goto L_0x0049
            r4 = 58
            goto L_0x00a9
        L_0x0049:
            o5.f r9 = o5.f.a()
            throw r9
        L_0x004e:
            if (r5 < r8) goto L_0x0057
            r4 = 69
            if (r5 > r4) goto L_0x0057
            int r5 = r5 + -38
            goto L_0x009d
        L_0x0057:
            r4 = 70
            if (r5 < r4) goto L_0x0062
            r4 = 74
            if (r5 > r4) goto L_0x0062
            int r5 = r5 + -11
            goto L_0x009d
        L_0x0062:
            r4 = 75
            if (r5 < r4) goto L_0x006b
            if (r5 > r6) goto L_0x006b
            int r5 = r5 + 16
            goto L_0x009d
        L_0x006b:
            r4 = 80
            if (r5 < r4) goto L_0x0076
            r4 = 84
            if (r5 > r4) goto L_0x0076
            int r5 = r5 + 43
            goto L_0x009d
        L_0x0076:
            r4 = 85
            if (r5 != r4) goto L_0x007b
            goto L_0x002c
        L_0x007b:
            r4 = 86
            if (r5 != r4) goto L_0x0082
            r4 = 64
            goto L_0x00a9
        L_0x0082:
            r4 = 87
            if (r5 != r4) goto L_0x0089
            r4 = 96
            goto L_0x00a9
        L_0x0089:
            r4 = 88
            if (r5 < r4) goto L_0x0092
            if (r5 > r7) goto L_0x0092
            r4 = 127(0x7f, float:1.78E-43)
            goto L_0x00a9
        L_0x0092:
            o5.f r9 = o5.f.a()
            throw r9
        L_0x0097:
            if (r5 < r8) goto L_0x009f
            if (r5 > r7) goto L_0x009f
            int r5 = r5 + -64
        L_0x009d:
            char r4 = (char) r5
            goto L_0x00a9
        L_0x009f:
            o5.f r9 = o5.f.a()
            throw r9
        L_0x00a4:
            o5.f r9 = o5.f.a()
            throw r9
        L_0x00a9:
            r1.append(r4)
            int r3 = r3 + 1
            goto L_0x000b
        L_0x00b0:
            java.lang.String r9 = r1.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.d.k(java.lang.CharSequence):java.lang.String");
    }

    private int[] l(a aVar) {
        int k10 = aVar.k();
        int h10 = aVar.h(0);
        Arrays.fill(this.f3824b, 0);
        int[] iArr = this.f3824b;
        int length = iArr.length;
        int i10 = h10;
        boolean z9 = false;
        int i11 = 0;
        while (h10 < k10) {
            if (aVar.e(h10) != z9) {
                iArr[i11] = iArr[i11] + 1;
            } else {
                if (i11 != length - 1) {
                    i11++;
                } else if (n(iArr) == f3822e) {
                    return new int[]{i10, h10};
                } else {
                    i10 += iArr[0] + iArr[1];
                    int i12 = i11 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i12);
                    iArr[i12] = 0;
                    iArr[i11] = 0;
                    i11--;
                }
                iArr[i11] = 1;
                z9 = !z9;
            }
            h10++;
        }
        throw j.a();
    }

    private static char m(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = f3821d;
            if (i11 >= iArr.length) {
                throw j.a();
            } else if (iArr[i11] == i10) {
                return f3820c[i11];
            } else {
                i11++;
            }
        }
    }

    private static int n(int[] iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            int round = Math.round((((float) iArr[i13]) * 9.0f) / ((float) i10));
            if (round < 1 || round > 4) {
                return -1;
            }
            if ((i13 & 1) == 0) {
                for (int i14 = 0; i14 < round; i14++) {
                    i12 = (i12 << 1) | 1;
                }
            } else {
                i12 <<= round;
            }
        }
        return i12;
    }

    public n a(int i10, a aVar, Map<e, ?> map) {
        int[] l10 = l(aVar);
        int h10 = aVar.h(l10[1]);
        int k10 = aVar.k();
        int[] iArr = this.f3824b;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f3823a;
        sb.setLength(0);
        while (true) {
            k.g(aVar, h10, iArr);
            int n10 = n(iArr);
            if (n10 >= 0) {
                char m10 = m(n10);
                sb.append(m10);
                int i11 = h10;
                for (int i12 : iArr) {
                    i11 += i12;
                }
                int h11 = aVar.h(i11);
                if (m10 == '*') {
                    sb.deleteCharAt(sb.length() - 1);
                    int i13 = 0;
                    for (int i14 : iArr) {
                        i13 += i14;
                    }
                    if (h11 == k10 || !aVar.e(h11)) {
                        throw j.a();
                    } else if (sb.length() >= 2) {
                        i(sb);
                        sb.setLength(sb.length() - 2);
                        float f10 = (float) i10;
                        n nVar = new n(k(sb), (byte[]) null, new p[]{new p(((float) (l10[1] + l10[0])) / 2.0f, f10), new p(((float) h10) + (((float) i13) / 2.0f), f10)}, o5.a.CODE_93);
                        nVar.h(o.SYMBOLOGY_IDENTIFIER, "]G0");
                        return nVar;
                    } else {
                        throw j.a();
                    }
                } else {
                    h10 = h11;
                }
            } else {
                throw j.a();
            }
        }
    }
}
