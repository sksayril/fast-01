package g6;

import h6.j;
import j6.a;
import java.util.ArrayList;
import java.util.Map;
import o5.c;
import o5.e;
import o5.l;
import o5.n;
import o5.o;
import o5.p;

public final class b implements l {

    /* renamed from: a  reason: collision with root package name */
    private static final n[] f8949a = new n[0];

    private static n[] a(c cVar, Map<e, ?> map, boolean z9) {
        ArrayList arrayList = new ArrayList();
        j6.b b10 = a.b(cVar, map, z9);
        for (p[] next : b10.b()) {
            u5.e i10 = j.i(b10.a(), next[4], next[5], next[6], next[7], g(next), b(next));
            n nVar = new n(i10.i(), i10.e(), next, o5.a.PDF_417);
            nVar.h(o.ERROR_CORRECTION_LEVEL, i10.b());
            c cVar2 = (c) i10.d();
            if (cVar2 != null) {
                nVar.h(o.PDF417_EXTRA_METADATA, cVar2);
            }
            o oVar = o.SYMBOLOGY_IDENTIFIER;
            nVar.h(oVar, "]L" + i10.h());
            arrayList.add(nVar);
        }
        return (n[]) arrayList.toArray(f8949a);
    }

    private static int b(p[] pVarArr) {
        return Math.max(Math.max(f(pVarArr[0], pVarArr[4]), (f(pVarArr[6], pVarArr[2]) * 17) / 18), Math.max(f(pVarArr[1], pVarArr[5]), (f(pVarArr[7], pVarArr[3]) * 17) / 18));
    }

    private static int f(p pVar, p pVar2) {
        if (pVar == null || pVar2 == null) {
            return 0;
        }
        return (int) Math.abs(pVar.c() - pVar2.c());
    }

    private static int g(p[] pVarArr) {
        return Math.min(Math.min(h(pVarArr[0], pVarArr[4]), (h(pVarArr[6], pVarArr[2]) * 17) / 18), Math.min(h(pVarArr[1], pVarArr[5]), (h(pVarArr[7], pVarArr[3]) * 17) / 18));
    }

    private static int h(p pVar, p pVar2) {
        if (pVar == null || pVar2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(pVar.c() - pVar2.c());
    }

    public void c() {
    }

    public n d(c cVar, Map<e, ?> map) {
        n[] a10 = a(cVar, map, false);
        if (a10.length != 0 && a10[0] != null) {
            return a10[0];
        }
        throw o5.j.a();
    }

    public n e(c cVar) {
        return d(cVar, (Map<e, ?>) null);
    }
}
