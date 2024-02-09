package c6;

import java.util.EnumMap;
import java.util.Map;
import o5.j;
import o5.n;
import o5.o;
import o5.p;
import u5.a;

final class m {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f3840a = new int[4];

    /* renamed from: b  reason: collision with root package name */
    private final StringBuilder f3841b = new StringBuilder();

    m() {
    }

    private int a(a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f3840a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int k10 = aVar.k();
        int i10 = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 2 && i10 < k10; i12++) {
            int k11 = p.k(aVar, iArr2, i10, p.f3852h);
            sb.append((char) ((k11 % 10) + 48));
            for (int i13 : iArr2) {
                i10 += i13;
            }
            if (k11 >= 10) {
                i11 |= 1 << (1 - i12);
            }
            if (i12 != 1) {
                i10 = aVar.i(aVar.h(i10));
            }
        }
        if (sb.length() != 2) {
            throw j.a();
        } else if (Integer.parseInt(sb.toString()) % 4 == i11) {
            return i10;
        } else {
            throw j.a();
        }
    }

    private static Map<o, Object> c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(o.class);
        enumMap.put(o.ISSUE_NUMBER, Integer.valueOf(str));
        return enumMap;
    }

    /* access modifiers changed from: package-private */
    public n b(int i10, a aVar, int[] iArr) {
        StringBuilder sb = this.f3841b;
        sb.setLength(0);
        int a10 = a(aVar, iArr, sb);
        String sb2 = sb.toString();
        Map<o, Object> c10 = c(sb2);
        float f10 = (float) i10;
        n nVar = new n(sb2, (byte[]) null, new p[]{new p(((float) (iArr[0] + iArr[1])) / 2.0f, f10), new p((float) a10, f10)}, o5.a.UPC_EAN_EXTENSION);
        if (c10 != null) {
            nVar.g(c10);
        }
        return nVar;
    }
}
