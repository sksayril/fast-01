package c6;

import u5.a;

public final class f extends p {

    /* renamed from: i  reason: collision with root package name */
    private final int[] f3827i = new int[4];

    /* access modifiers changed from: protected */
    public int m(a aVar, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.f3827i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int k10 = aVar.k();
        int i10 = iArr[1];
        for (int i11 = 0; i11 < 4 && i10 < k10; i11++) {
            sb.append((char) (p.k(aVar, iArr2, i10, p.f3851g) + 48));
            for (int i12 : iArr2) {
                i10 += i12;
            }
        }
        int i13 = p.o(aVar, i10, true, p.f3849e)[1];
        for (int i14 = 0; i14 < 4 && i13 < k10; i14++) {
            sb.append((char) (p.k(aVar, iArr2, i13, p.f3851g) + 48));
            for (int i15 : iArr2) {
                i13 += i15;
            }
        }
        return i13;
    }

    /* access modifiers changed from: package-private */
    public o5.a r() {
        return o5.a.EAN_8;
    }
}
