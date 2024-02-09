package x5;

import java.util.List;
import java.util.Map;
import o5.c;
import o5.e;
import o5.j;
import o5.l;
import o5.n;
import o5.o;
import o5.p;
import u5.b;
import u5.g;
import y5.d;

public final class a implements l {

    /* renamed from: b  reason: collision with root package name */
    private static final p[] f13198b = new p[0];

    /* renamed from: a  reason: collision with root package name */
    private final d f13199a = new d();

    private static b a(b bVar) {
        int[] q9 = bVar.q();
        int[] i10 = bVar.i();
        if (q9 == null || i10 == null) {
            throw j.a();
        }
        int b10 = b(q9, bVar);
        int i11 = q9[1];
        int i12 = i10[1];
        int i13 = q9[0];
        int i14 = ((i10[0] - i13) + 1) / b10;
        int i15 = ((i12 - i11) + 1) / b10;
        if (i14 <= 0 || i15 <= 0) {
            throw j.a();
        }
        int i16 = b10 / 2;
        int i17 = i11 + i16;
        int i18 = i13 + i16;
        b bVar2 = new b(i14, i15);
        for (int i19 = 0; i19 < i15; i19++) {
            int i20 = (i19 * b10) + i17;
            for (int i21 = 0; i21 < i14; i21++) {
                if (bVar.h((i21 * b10) + i18, i20)) {
                    bVar2.u(i21, i19);
                }
            }
        }
        return bVar2;
    }

    private static int b(int[] iArr, b bVar) {
        int r9 = bVar.r();
        int i10 = iArr[0];
        int i11 = iArr[1];
        while (i10 < r9 && bVar.h(i10, i11)) {
            i10++;
        }
        if (i10 != r9) {
            int i12 = i10 - iArr[0];
            if (i12 != 0) {
                return i12;
            }
            throw j.a();
        }
        throw j.a();
    }

    public void c() {
    }

    public n d(c cVar, Map<e, ?> map) {
        p[] pVarArr;
        u5.e eVar;
        if (map == null || !map.containsKey(e.PURE_BARCODE)) {
            g b10 = new z5.a(cVar.a()).b();
            u5.e b11 = this.f13199a.b(b10.a());
            pVarArr = b10.b();
            eVar = b11;
        } else {
            eVar = this.f13199a.b(a(cVar.a()));
            pVarArr = f13198b;
        }
        n nVar = new n(eVar.i(), eVar.e(), pVarArr, o5.a.DATA_MATRIX);
        List<byte[]> a10 = eVar.a();
        if (a10 != null) {
            nVar.h(o.BYTE_SEGMENTS, a10);
        }
        String b12 = eVar.b();
        if (b12 != null) {
            nVar.h(o.ERROR_CORRECTION_LEVEL, b12);
        }
        o oVar = o.SYMBOLOGY_IDENTIFIER;
        nVar.h(oVar, "]d" + eVar.h());
        return nVar;
    }

    public n e(c cVar) {
        return d(cVar, (Map<e, ?>) null);
    }
}
