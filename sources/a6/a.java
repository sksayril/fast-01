package a6;

import b6.c;
import java.util.Map;
import o5.e;
import o5.j;
import o5.l;
import o5.n;
import o5.o;
import o5.p;
import u5.b;

public final class a implements l {

    /* renamed from: b  reason: collision with root package name */
    private static final p[] f14b = new p[0];

    /* renamed from: a  reason: collision with root package name */
    private final c f15a = new c();

    private static b a(b bVar) {
        int[] k10 = bVar.k();
        if (k10 != null) {
            int i10 = k10[0];
            int i11 = k10[1];
            int i12 = k10[2];
            int i13 = k10[3];
            b bVar2 = new b(30, 33);
            for (int i14 = 0; i14 < 33; i14++) {
                int min = Math.min((((i14 * i13) + (i13 / 2)) / 33) + i11, i13 - 1);
                for (int i15 = 0; i15 < 30; i15++) {
                    if (bVar.h(Math.min((((i15 * i12) + (i12 / 2)) + (((i14 & 1) * i12) / 2)) / 30, i12 - 1) + i10, min)) {
                        bVar2.u(i15, i14);
                    }
                }
            }
            return bVar2;
        }
        throw j.a();
    }

    public void c() {
    }

    public n d(o5.c cVar, Map<e, ?> map) {
        u5.e b10 = this.f15a.b(a(cVar.a()), map);
        n nVar = new n(b10.i(), b10.e(), f14b, o5.a.MAXICODE);
        String b11 = b10.b();
        if (b11 != null) {
            nVar.h(o.ERROR_CORRECTION_LEVEL, b11);
        }
        return nVar;
    }

    public n e(o5.c cVar) {
        return d(cVar, (Map<e, ?>) null);
    }
}
