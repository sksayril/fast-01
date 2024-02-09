package u5;

import java.lang.reflect.Array;
import o5.b;
import o5.h;

public final class k extends i {

    /* renamed from: e  reason: collision with root package name */
    private b f12508e;

    public k(h hVar) {
        super(hVar);
    }

    private static int[][] i(byte[] bArr, int i10, int i11, int i12, int i13) {
        int i14 = i10;
        int i15 = i11;
        int i16 = 8;
        int i17 = i13 - 8;
        int i18 = i12 - 8;
        int[] iArr = new int[2];
        iArr[1] = i14;
        iArr[0] = i15;
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, iArr);
        int i19 = 0;
        while (i19 < i15) {
            int i20 = i19 << 3;
            if (i20 > i17) {
                i20 = i17;
            }
            int i21 = 0;
            while (i21 < i14) {
                int i22 = i21 << 3;
                if (i22 > i18) {
                    i22 = i18;
                }
                int i23 = (i20 * i12) + i22;
                byte b10 = 255;
                int i24 = 0;
                int i25 = 0;
                byte b11 = 0;
                while (i24 < i16) {
                    byte b12 = b11;
                    int i26 = 0;
                    while (i26 < i16) {
                        byte b13 = bArr[i23 + i26] & 255;
                        i25 += b13;
                        if (b13 < b10) {
                            b10 = b13;
                        }
                        if (b13 > b12) {
                            b12 = b13;
                        }
                        i26++;
                        i16 = 8;
                    }
                    if (b12 - b10 <= 24) {
                        i24++;
                        i23 += i12;
                        b11 = b12;
                        i16 = 8;
                    }
                    while (true) {
                        i24++;
                        i23 += i12;
                        if (i24 >= 8) {
                            break;
                        }
                        int i27 = 0;
                        for (int i28 = 8; i27 < i28; i28 = 8) {
                            i25 += bArr[i23 + i27] & 255;
                            i27++;
                        }
                    }
                    i24++;
                    i23 += i12;
                    b11 = b12;
                    i16 = 8;
                }
                int i29 = i25 >> 6;
                if (b11 - b10 <= 24) {
                    i29 = b10 / 2;
                    if (i19 > 0 && i21 > 0) {
                        int i30 = i19 - 1;
                        int i31 = i21 - 1;
                        int i32 = ((iArr2[i30][i21] + (iArr2[i19][i31] * 2)) + iArr2[i30][i31]) / 4;
                        if (b10 < i32) {
                            i29 = i32;
                        }
                        iArr2[i19][i21] = i29;
                        i21++;
                        i16 = 8;
                    }
                }
                iArr2[i19][i21] = i29;
                i21++;
                i16 = 8;
            }
            i19++;
            i16 = 8;
        }
        return iArr2;
    }

    private static void j(byte[] bArr, int i10, int i11, int i12, int i13, int[][] iArr, b bVar) {
        int i14 = i10;
        int i15 = i11;
        int i16 = i13 - 8;
        int i17 = i12 - 8;
        for (int i18 = 0; i18 < i15; i18++) {
            int i19 = i18 << 3;
            int i20 = i19 > i16 ? i16 : i19;
            int k10 = k(i18, i15 - 3);
            for (int i21 = 0; i21 < i14; i21++) {
                int i22 = i21 << 3;
                int i23 = i22 > i17 ? i17 : i22;
                int k11 = k(i21, i14 - 3);
                int i24 = 0;
                for (int i25 = -2; i25 <= 2; i25++) {
                    int[] iArr2 = iArr[k10 + i25];
                    i24 += iArr2[k11 - 2] + iArr2[k11 - 1] + iArr2[k11] + iArr2[k11 + 1] + iArr2[2 + k11];
                }
                l(bArr, i23, i20, i24 / 25, i12, bVar);
            }
        }
    }

    private static int k(int i10, int i11) {
        if (i10 < 2) {
            return 2;
        }
        return Math.min(i10, i11);
    }

    private static void l(byte[] bArr, int i10, int i11, int i12, int i13, b bVar) {
        int i14 = (i11 * i13) + i10;
        int i15 = 0;
        while (i15 < 8) {
            for (int i16 = 0; i16 < 8; i16++) {
                if ((bArr[i14 + i16] & 255) <= i12) {
                    bVar.u(i10 + i16, i11 + i15);
                }
            }
            i15++;
            i14 += i13;
        }
    }

    public b a(h hVar) {
        return new k(hVar);
    }

    public b b() {
        b bVar;
        b bVar2 = this.f12508e;
        if (bVar2 != null) {
            return bVar2;
        }
        h e10 = e();
        int d10 = e10.d();
        int a10 = e10.a();
        if (d10 < 40 || a10 < 40) {
            bVar = super.b();
        } else {
            byte[] b10 = e10.b();
            int i10 = d10 >> 3;
            if ((d10 & 7) != 0) {
                i10++;
            }
            int i11 = i10;
            int i12 = a10 >> 3;
            if ((a10 & 7) != 0) {
                i12++;
            }
            int i13 = i12;
            int[][] i14 = i(b10, i11, i13, d10, a10);
            bVar = new b(d10, a10);
            j(b10, i11, i13, d10, a10, i14, bVar);
        }
        this.f12508e = bVar;
        return this.f12508e;
    }
}
