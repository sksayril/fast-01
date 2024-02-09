package c6;

import java.util.EnumMap;
import java.util.Map;
import o5.j;
import o5.o;
import o5.p;
import u5.a;

final class n {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f3842c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: a  reason: collision with root package name */
    private final int[] f3843a = new int[4];

    /* renamed from: b  reason: collision with root package name */
    private final StringBuilder f3844b = new StringBuilder();

    n() {
    }

    private int a(a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f3843a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int k10 = aVar.k();
        int i10 = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 5 && i10 < k10; i12++) {
            int k11 = p.k(aVar, iArr2, i10, p.f3852h);
            sb.append((char) ((k11 % 10) + 48));
            for (int i13 : iArr2) {
                i10 += i13;
            }
            if (k11 >= 10) {
                i11 |= 1 << (4 - i12);
            }
            if (i12 != 4) {
                i10 = aVar.i(aVar.h(i10));
            }
        }
        if (sb.length() == 5) {
            if (d(sb.toString()) == c(i11)) {
                return i10;
            }
            throw j.a();
        }
        throw j.a();
    }

    private static int c(int i10) {
        for (int i11 = 0; i11 < 10; i11++) {
            if (i10 == f3842c[i11]) {
                return i11;
            }
        }
        throw j.a();
    }

    private static int d(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        for (int i11 = length - 2; i11 >= 0; i11 -= 2) {
            i10 += charSequence.charAt(i11) - '0';
        }
        int i12 = i10 * 3;
        for (int i13 = length - 1; i13 >= 0; i13 -= 2) {
            i12 += charSequence.charAt(i13) - '0';
        }
        return (i12 * 3) % 10;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        if (r5.equals("90000") == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String e(java.lang.String r5) {
        /*
            r0 = 0
            char r1 = r5.charAt(r0)
            r2 = 48
            java.lang.String r3 = ""
            r4 = 1
            if (r1 == r2) goto L_0x004d
            r2 = 53
            if (r1 == r2) goto L_0x004a
            r2 = 57
            if (r1 == r2) goto L_0x0015
            goto L_0x004f
        L_0x0015:
            r1 = -1
            int r2 = r5.hashCode()
            switch(r2) {
                case 54118329: goto L_0x0035;
                case 54395376: goto L_0x002a;
                case 54395377: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            r0 = -1
            goto L_0x003e
        L_0x001f:
            java.lang.String r0 = "99991"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0028
            goto L_0x001d
        L_0x0028:
            r0 = 2
            goto L_0x003e
        L_0x002a:
            java.lang.String r0 = "99990"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0033
            goto L_0x001d
        L_0x0033:
            r0 = 1
            goto L_0x003e
        L_0x0035:
            java.lang.String r2 = "90000"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x003e
            goto L_0x001d
        L_0x003e:
            switch(r0) {
                case 0: goto L_0x0048;
                case 1: goto L_0x0045;
                case 2: goto L_0x0042;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x004f
        L_0x0042:
            java.lang.String r5 = "0.00"
            return r5
        L_0x0045:
            java.lang.String r5 = "Used"
            return r5
        L_0x0048:
            r5 = 0
            return r5
        L_0x004a:
            java.lang.String r3 = "$"
            goto L_0x004f
        L_0x004d:
            java.lang.String r3 = "£"
        L_0x004f:
            java.lang.String r5 = r5.substring(r4)
            int r5 = java.lang.Integer.parseInt(r5)
            int r0 = r5 / 100
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r5 = r5 % 100
            r1 = 10
            if (r5 >= r1) goto L_0x0075
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "0"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            goto L_0x0079
        L_0x0075:
            java.lang.String r5 = java.lang.String.valueOf(r5)
        L_0x0079:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r0)
            r0 = 46
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.n.e(java.lang.String):java.lang.String");
    }

    private static Map<o, Object> f(String str) {
        String e10;
        if (str.length() != 5 || (e10 = e(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(o.class);
        enumMap.put(o.SUGGESTED_PRICE, e10);
        return enumMap;
    }

    /* access modifiers changed from: package-private */
    public o5.n b(int i10, a aVar, int[] iArr) {
        StringBuilder sb = this.f3844b;
        sb.setLength(0);
        int a10 = a(aVar, iArr, sb);
        String sb2 = sb.toString();
        Map<o, Object> f10 = f(sb2);
        float f11 = (float) i10;
        o5.n nVar = new o5.n(sb2, (byte[]) null, new p[]{new p(((float) (iArr[0] + iArr[1])) / 2.0f, f11), new p((float) a10, f11)}, o5.a.UPC_EAN_EXTENSION);
        if (f10 != null) {
            nVar.g(f10);
        }
        return nVar;
    }
}
