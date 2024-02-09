package c6;

import o5.j;
import u5.a;

public final class e extends p {

    /* renamed from: j  reason: collision with root package name */
    static final int[] f3825j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: i  reason: collision with root package name */
    private final int[] f3826i = new int[4];

    private static void t(StringBuilder sb, int i10) {
        for (int i11 = 0; i11 < 10; i11++) {
            if (i10 == f3825j[i11]) {
                sb.insert(0, (char) (i11 + 48));
                return;
            }
        }
        throw j.a();
    }

    /* access modifiers changed from: protected */
    public int m(a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f3826i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int k10 = aVar.k();
        int i10 = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 6 && i10 < k10; i12++) {
            int k11 = p.k(aVar, iArr2, i10, p.f3852h);
            sb.append((char) ((k11 % 10) + 48));
            for (int i13 : iArr2) {
                i10 += i13;
            }
            if (k11 >= 10) {
                i11 |= 1 << (5 - i12);
            }
        }
        t(sb, i11);
        int i14 = p.o(aVar, i10, true, p.f3849e)[1];
        for (int i15 = 0; i15 < 6 && i14 < k10; i15++) {
            sb.append((char) (p.k(aVar, iArr2, i14, p.f3851g) + 48));
            for (int i16 : iArr2) {
                i14 += i16;
            }
        }
        return i14;
    }

    /* access modifiers changed from: package-private */
    public o5.a r() {
        return o5.a.EAN_13;
    }
}
