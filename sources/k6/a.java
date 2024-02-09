package k6;

import com.google.zxing.qrcode.decoder.e;
import com.google.zxing.qrcode.decoder.i;
import java.util.List;
import java.util.Map;
import o5.c;
import o5.j;
import o5.l;
import o5.n;
import o5.o;
import o5.p;
import u5.b;
import u5.g;

public class a implements l {

    /* renamed from: b  reason: collision with root package name */
    private static final p[] f10970b = new p[0];

    /* renamed from: a  reason: collision with root package name */
    private final e f10971a = new e();

    private static b a(b bVar) {
        int[] q9 = bVar.q();
        int[] i10 = bVar.i();
        if (q9 == null || i10 == null) {
            throw j.a();
        }
        float b10 = b(q9, bVar);
        int i11 = q9[1];
        int i12 = i10[1];
        int i13 = q9[0];
        int i14 = i10[0];
        if (i13 >= i14 || i11 >= i12) {
            throw j.a();
        }
        int i15 = i12 - i11;
        if (i15 == i14 - i13 || (i14 = i13 + i15) < bVar.r()) {
            int round = Math.round(((float) ((i14 - i13) + 1)) / b10);
            int round2 = Math.round(((float) (i15 + 1)) / b10);
            if (round <= 0 || round2 <= 0) {
                throw j.a();
            } else if (round2 == round) {
                int i16 = (int) (b10 / 2.0f);
                int i17 = i11 + i16;
                int i18 = i13 + i16;
                int i19 = (((int) (((float) (round - 1)) * b10)) + i18) - i14;
                if (i19 > 0) {
                    if (i19 <= i16) {
                        i18 -= i19;
                    } else {
                        throw j.a();
                    }
                }
                int i20 = (((int) (((float) (round2 - 1)) * b10)) + i17) - i12;
                if (i20 > 0) {
                    if (i20 <= i16) {
                        i17 -= i20;
                    } else {
                        throw j.a();
                    }
                }
                b bVar2 = new b(round, round2);
                for (int i21 = 0; i21 < round2; i21++) {
                    int i22 = ((int) (((float) i21) * b10)) + i17;
                    for (int i23 = 0; i23 < round; i23++) {
                        if (bVar.h(((int) (((float) i23) * b10)) + i18, i22)) {
                            bVar2.u(i23, i21);
                        }
                    }
                }
                return bVar2;
            } else {
                throw j.a();
            }
        } else {
            throw j.a();
        }
    }

    private static float b(int[] iArr, b bVar) {
        int n10 = bVar.n();
        int r9 = bVar.r();
        int i10 = iArr[0];
        boolean z9 = true;
        int i11 = iArr[1];
        int i12 = 0;
        while (i10 < r9 && i11 < n10) {
            if (z9 != bVar.h(i10, i11)) {
                i12++;
                if (i12 == 5) {
                    break;
                }
                z9 = !z9;
            }
            i10++;
            i11++;
        }
        if (i10 != r9 && i11 != n10) {
            return ((float) (i10 - iArr[0])) / 7.0f;
        }
        throw j.a();
    }

    public void c() {
    }

    public final n d(c cVar, Map<o5.e, ?> map) {
        p[] pVarArr;
        u5.e eVar;
        if (map == null || !map.containsKey(o5.e.PURE_BARCODE)) {
            g e10 = new l6.c(cVar.a()).e(map);
            u5.e c10 = this.f10971a.c(e10.a(), map);
            pVarArr = e10.b();
            eVar = c10;
        } else {
            eVar = this.f10971a.c(a(cVar.a()), map);
            pVarArr = f10970b;
        }
        if (eVar.d() instanceof i) {
            ((i) eVar.d()).a(pVarArr);
        }
        n nVar = new n(eVar.i(), eVar.e(), pVarArr, o5.a.QR_CODE);
        List<byte[]> a10 = eVar.a();
        if (a10 != null) {
            nVar.h(o.BYTE_SEGMENTS, a10);
        }
        String b10 = eVar.b();
        if (b10 != null) {
            nVar.h(o.ERROR_CORRECTION_LEVEL, b10);
        }
        if (eVar.j()) {
            nVar.h(o.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(eVar.g()));
            nVar.h(o.STRUCTURED_APPEND_PARITY, Integer.valueOf(eVar.f()));
        }
        o oVar = o.SYMBOLOGY_IDENTIFIER;
        nVar.h(oVar, "]Q" + eVar.h());
        return nVar;
    }

    public n e(c cVar) {
        return d(cVar, (Map<o5.e, ?>) null);
    }
}
