package u5;

import o5.j;

public final class f extends j {
    public b c(b bVar, int i10, int i11, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24, float f25) {
        b bVar2 = bVar;
        int i12 = i10;
        int i13 = i11;
        return d(bVar, i10, i11, l.b(f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24, f25));
    }

    public b d(b bVar, int i10, int i11, l lVar) {
        if (i10 <= 0 || i11 <= 0) {
            throw j.a();
        }
        b bVar2 = new b(i10, i11);
        int i12 = i10 * 2;
        float[] fArr = new float[i12];
        for (int i13 = 0; i13 < i11; i13++) {
            float f10 = ((float) i13) + 0.5f;
            for (int i14 = 0; i14 < i12; i14 += 2) {
                fArr[i14] = ((float) (i14 / 2)) + 0.5f;
                fArr[i14 + 1] = f10;
            }
            lVar.f(fArr);
            j.a(bVar, fArr);
            int i15 = 0;
            while (i15 < i12) {
                try {
                    if (bVar.h((int) fArr[i15], (int) fArr[i15 + 1])) {
                        bVar2.u(i15 / 2, i13);
                    }
                    i15 += 2;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw j.a();
                }
            }
        }
        return bVar2;
    }
}
