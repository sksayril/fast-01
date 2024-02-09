package b9;

import j8.d;
import j8.e;
import j8.g;
import r8.p;

final /* synthetic */ class h {
    public static final <T> T a(g gVar, p<? super j0, ? super d<? super T>, ? extends Object> pVar) {
        b1 b1Var;
        k1 k1Var;
        Thread currentThread = Thread.currentThread();
        e eVar = (e) gVar.a(e.f10860l);
        if (eVar == null) {
            b1Var = m2.f3468a.b();
            k1Var = k1.f3460m;
            gVar = gVar.t(b1Var);
        } else {
            b1 b1Var2 = null;
            b1 b1Var3 = eVar instanceof b1 ? (b1) eVar : null;
            if (b1Var3 != null) {
                if (b1Var3.W()) {
                    b1Var2 = b1Var3;
                }
                if (b1Var2 != null) {
                    b1Var = b1Var2;
                    k1Var = k1.f3460m;
                }
            }
            b1Var = m2.f3468a.a();
            k1Var = k1.f3460m;
        }
        e eVar2 = new e(f0.d(k1Var, gVar), currentThread, b1Var);
        eVar2.L0(l0.DEFAULT, eVar2, pVar);
        return eVar2.M0();
    }

    public static /* synthetic */ Object b(g gVar, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = j8.h.f10863m;
        }
        return g.e(gVar, pVar);
    }
}
