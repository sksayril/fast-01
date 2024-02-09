package c6;

import java.util.Arrays;
import java.util.Map;
import o5.d;
import o5.e;
import o5.f;
import o5.j;
import o5.n;
import o5.o;
import o5.p;
import u5.a;

public final class c extends k {

    /* renamed from: e  reason: collision with root package name */
    static final int[] f3815e = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 168, 162, 138, 42};

    /* renamed from: a  reason: collision with root package name */
    private final boolean f3816a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3817b;

    /* renamed from: c  reason: collision with root package name */
    private final StringBuilder f3818c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f3819d;

    public c() {
        this(false);
    }

    public c(boolean z9) {
        this(z9, false);
    }

    public c(boolean z9, boolean z10) {
        this.f3816a = z9;
        this.f3817b = z10;
        this.f3818c = new StringBuilder(20);
        this.f3819d = new int[9];
    }

    private static String i(CharSequence charSequence) {
        int i10;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i11 = 0;
        while (i11 < length) {
            char charAt = charSequence.charAt(i11);
            if (charAt == '+' || charAt == '$' || charAt == '%' || charAt == '/') {
                i11++;
                char charAt2 = charSequence.charAt(i11);
                if (charAt != '$') {
                    if (charAt != '%') {
                        if (charAt != '+') {
                            if (charAt == '/') {
                                if (charAt2 >= 'A' && charAt2 <= 'O') {
                                    i10 = charAt2 - ' ';
                                } else if (charAt2 == 'Z') {
                                    charAt = ':';
                                } else {
                                    throw f.a();
                                }
                            }
                        } else if (charAt2 < 'A' || charAt2 > 'Z') {
                            throw f.a();
                        } else {
                            i10 = charAt2 + ' ';
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
                        i10 = charAt2 - '&';
                    } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                        i10 = charAt2 - 11;
                    } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                        i10 = charAt2 + 16;
                    } else if (charAt2 >= 'P' && charAt2 <= 'T') {
                        i10 = charAt2 + '+';
                    } else if (charAt2 != 'U') {
                        if (charAt2 == 'V') {
                            charAt = '@';
                        } else if (charAt2 == 'W') {
                            charAt = '`';
                        } else if (charAt2 == 'X' || charAt2 == 'Y' || charAt2 == 'Z') {
                            charAt = 127;
                        } else {
                            throw f.a();
                        }
                    }
                    charAt = 0;
                } else if (charAt2 < 'A' || charAt2 > 'Z') {
                    throw f.a();
                } else {
                    i10 = charAt2 - '@';
                }
                charAt = (char) i10;
            }
            sb.append(charAt);
            i11++;
        }
        return sb.toString();
    }

    private static int[] j(a aVar, int[] iArr) {
        int k10 = aVar.k();
        int h10 = aVar.h(0);
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
                } else if (l(iArr) != 148 || !aVar.n(Math.max(0, i10 - ((h10 - i10) / 2)), i10, false)) {
                    i10 += iArr[0] + iArr[1];
                    int i12 = i11 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i12);
                    iArr[i12] = 0;
                    iArr[i11] = 0;
                    i11--;
                } else {
                    return new int[]{i10, h10};
                }
                iArr[i11] = 1;
                z9 = !z9;
            }
            h10++;
        }
        throw j.a();
    }

    private static char k(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = f3815e;
            if (i11 < iArr.length) {
                if (iArr[i11] == i10) {
                    return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i11);
                }
                i11++;
            } else if (i10 == 148) {
                return '*';
            } else {
                throw j.a();
            }
        }
    }

    private static int l(int[] iArr) {
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            int i11 = Integer.MAX_VALUE;
            for (int i12 : iArr) {
                if (i12 < i11 && i12 > i10) {
                    i11 = i12;
                }
            }
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < length; i16++) {
                int i17 = iArr[i16];
                if (i17 > i11) {
                    i14 |= 1 << ((length - 1) - i16);
                    i13++;
                    i15 += i17;
                }
            }
            if (i13 == 3) {
                for (int i18 = 0; i18 < length && i13 > 0; i18++) {
                    int i19 = iArr[i18];
                    if (i19 > i11) {
                        i13--;
                        if (i19 * 2 >= i15) {
                            return -1;
                        }
                    }
                }
                return i14;
            } else if (i13 <= 3) {
                return -1;
            } else {
                i10 = i11;
            }
        }
    }

    public n a(int i10, a aVar, Map<e, ?> map) {
        int[] iArr = this.f3819d;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.f3818c;
        sb.setLength(0);
        int[] j10 = j(aVar, iArr);
        int h10 = aVar.h(j10[1]);
        int k10 = aVar.k();
        while (true) {
            k.g(aVar, h10, iArr);
            int l10 = l(iArr);
            if (l10 >= 0) {
                char k11 = k(l10);
                sb.append(k11);
                int i11 = h10;
                for (int i12 : iArr) {
                    i11 += i12;
                }
                int h11 = aVar.h(i11);
                if (k11 == '*') {
                    sb.setLength(sb.length() - 1);
                    int i13 = 0;
                    for (int i14 : iArr) {
                        i13 += i14;
                    }
                    int i15 = (h11 - h10) - i13;
                    if (h11 == k10 || i15 * 2 >= i13) {
                        if (this.f3816a) {
                            int length = sb.length() - 1;
                            int i16 = 0;
                            for (int i17 = 0; i17 < length; i17++) {
                                i16 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f3818c.charAt(i17));
                            }
                            if (sb.charAt(length) == "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i16 % 43)) {
                                sb.setLength(length);
                            } else {
                                throw d.a();
                            }
                        }
                        if (sb.length() != 0) {
                            float f10 = (float) i10;
                            n nVar = new n(this.f3817b ? i(sb) : sb.toString(), (byte[]) null, new p[]{new p(((float) (j10[1] + j10[0])) / 2.0f, f10), new p(((float) h10) + (((float) i13) / 2.0f), f10)}, o5.a.CODE_39);
                            nVar.h(o.SYMBOLOGY_IDENTIFIER, "]A0");
                            return nVar;
                        }
                        throw j.a();
                    }
                    throw j.a();
                }
                h10 = h11;
            } else {
                throw j.a();
            }
        }
    }
}
