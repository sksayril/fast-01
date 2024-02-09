package c6;

import java.util.Arrays;
import java.util.Map;
import o5.d;
import o5.e;
import o5.f;
import o5.j;
import o5.m;
import o5.n;
import o5.o;
import o5.q;
import u5.a;

public abstract class p extends k {

    /* renamed from: d  reason: collision with root package name */
    static final int[] f3848d = {1, 1, 1};

    /* renamed from: e  reason: collision with root package name */
    static final int[] f3849e = {1, 1, 1, 1, 1};

    /* renamed from: f  reason: collision with root package name */
    static final int[] f3850f = {1, 1, 1, 1, 1, 1};

    /* renamed from: g  reason: collision with root package name */
    static final int[][] f3851g;

    /* renamed from: h  reason: collision with root package name */
    static final int[][] f3852h;

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f3853a = new StringBuilder(20);

    /* renamed from: b  reason: collision with root package name */
    private final o f3854b = new o();

    /* renamed from: c  reason: collision with root package name */
    private final g f3855c = new g();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f3851g = iArr;
        int[][] iArr2 = new int[20][];
        f3852h = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i10 = 10; i10 < 20; i10++) {
            int[] iArr3 = f3851g[i10 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i11 = 0; i11 < iArr3.length; i11++) {
                iArr4[i11] = iArr3[(iArr3.length - i11) - 1];
            }
            f3852h[i10] = iArr4;
        }
    }

    protected p() {
    }

    static boolean j(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i10 = length - 1;
        return s(charSequence.subSequence(0, i10)) == Character.digit(charSequence.charAt(i10), 10);
    }

    static int k(a aVar, int[] iArr, int i10, int[][] iArr2) {
        k.g(aVar, i10, iArr);
        int length = iArr2.length;
        float f10 = 0.48f;
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            float f11 = k.f(iArr, iArr2[i12], 0.7f);
            if (f11 < f10) {
                i11 = i12;
                f10 = f11;
            }
        }
        if (i11 >= 0) {
            return i11;
        }
        throw j.a();
    }

    static int[] o(a aVar, int i10, boolean z9, int[] iArr) {
        return p(aVar, i10, z9, iArr, new int[iArr.length]);
    }

    private static int[] p(a aVar, int i10, boolean z9, int[] iArr, int[] iArr2) {
        int k10 = aVar.k();
        int i11 = z9 ? aVar.i(i10) : aVar.h(i10);
        int length = iArr.length;
        boolean z10 = z9;
        int i12 = 0;
        int i13 = i11;
        while (i11 < k10) {
            if (aVar.e(i11) != z10) {
                iArr2[i12] = iArr2[i12] + 1;
            } else {
                if (i12 != length - 1) {
                    i12++;
                } else if (k.f(iArr2, iArr, 0.7f) < 0.48f) {
                    return new int[]{i13, i11};
                } else {
                    i13 += iArr2[0] + iArr2[1];
                    int i14 = i12 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i14);
                    iArr2[i14] = 0;
                    iArr2[i12] = 0;
                    i12--;
                }
                iArr2[i12] = 1;
                z10 = !z10;
            }
            i11++;
        }
        throw j.a();
    }

    static int[] q(a aVar) {
        int[] iArr = new int[f3848d.length];
        int[] iArr2 = null;
        boolean z9 = false;
        int i10 = 0;
        while (!z9) {
            int[] iArr3 = f3848d;
            Arrays.fill(iArr, 0, iArr3.length, 0);
            iArr2 = p(aVar, i10, false, iArr3, iArr);
            int i11 = iArr2[0];
            int i12 = iArr2[1];
            int i13 = i11 - (i12 - i11);
            if (i13 >= 0) {
                z9 = aVar.n(i13, i11, false);
            }
            i10 = i12;
        }
        return iArr2;
    }

    static int s(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        for (int i11 = length - 1; i11 >= 0; i11 -= 2) {
            int charAt = charSequence.charAt(i11) - '0';
            if (charAt < 0 || charAt > 9) {
                throw f.a();
            }
            i10 += charAt;
        }
        int i12 = i10 * 3;
        for (int i13 = length - 2; i13 >= 0; i13 -= 2) {
            int charAt2 = charSequence.charAt(i13) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw f.a();
            }
            i12 += charAt2;
        }
        return (1000 - i12) % 10;
    }

    public n a(int i10, a aVar, Map<e, ?> map) {
        return n(i10, aVar, q(aVar), map);
    }

    /* access modifiers changed from: package-private */
    public boolean i(String str) {
        return j(str);
    }

    /* access modifiers changed from: package-private */
    public int[] l(a aVar, int i10) {
        return o(aVar, i10, false, f3848d);
    }

    /* access modifiers changed from: protected */
    public abstract int m(a aVar, int[] iArr, StringBuilder sb);

    public n n(int i10, a aVar, int[] iArr, Map<e, ?> map) {
        int i11;
        String c10;
        int[] iArr2 = null;
        q qVar = map == null ? null : (q) map.get(e.NEED_RESULT_POINT_CALLBACK);
        boolean z9 = true;
        int i12 = 0;
        if (qVar != null) {
            qVar.a(new o5.p(((float) (iArr[0] + iArr[1])) / 2.0f, (float) i10));
        }
        StringBuilder sb = this.f3853a;
        sb.setLength(0);
        int m10 = m(aVar, iArr, sb);
        if (qVar != null) {
            qVar.a(new o5.p((float) m10, (float) i10));
        }
        int[] l10 = l(aVar, m10);
        if (qVar != null) {
            qVar.a(new o5.p(((float) (l10[0] + l10[1])) / 2.0f, (float) i10));
        }
        int i13 = l10[1];
        int i14 = (i13 - l10[0]) + i13;
        if (i14 >= aVar.k() || !aVar.n(i13, i14, false)) {
            throw j.a();
        }
        String sb2 = sb.toString();
        if (sb2.length() < 8) {
            throw f.a();
        } else if (i(sb2)) {
            o5.a r9 = r();
            float f10 = (float) i10;
            n nVar = new n(sb2, (byte[]) null, new o5.p[]{new o5.p(((float) (iArr[1] + iArr[0])) / 2.0f, f10), new o5.p(((float) (l10[1] + l10[0])) / 2.0f, f10)}, r9);
            try {
                n a10 = this.f3854b.a(i10, aVar, l10[1]);
                nVar.h(o.UPC_EAN_EXTENSION, a10.f());
                nVar.g(a10.d());
                nVar.a(a10.e());
                i11 = a10.f().length();
            } catch (m unused) {
                i11 = 0;
            }
            if (map != null) {
                iArr2 = (int[]) map.get(e.ALLOWED_EAN_EXTENSIONS);
            }
            if (iArr2 != null) {
                int length = iArr2.length;
                int i15 = 0;
                while (true) {
                    if (i15 >= length) {
                        z9 = false;
                        break;
                    } else if (i11 == iArr2[i15]) {
                        break;
                    } else {
                        i15++;
                    }
                }
                if (!z9) {
                    throw j.a();
                }
            }
            if ((r9 == o5.a.EAN_13 || r9 == o5.a.UPC_A) && (c10 = this.f3855c.c(sb2)) != null) {
                nVar.h(o.POSSIBLE_COUNTRY, c10);
            }
            if (r9 == o5.a.EAN_8) {
                i12 = 4;
            }
            o oVar = o.SYMBOLOGY_IDENTIFIER;
            nVar.h(oVar, "]E" + i12);
            return nVar;
        } else {
            throw d.a();
        }
    }

    /* access modifiers changed from: package-private */
    public abstract o5.a r();
}
