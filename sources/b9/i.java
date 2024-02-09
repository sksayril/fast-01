package b9;

import g8.s;
import g9.d0;
import g9.l0;
import h9.a;
import h9.b;
import j8.d;
import j8.e;
import j8.g;
import j8.h;
import kotlin.jvm.internal.l;
import r8.p;

final /* synthetic */ class i {
    public static final <T> q0<T> a(j0 j0Var, g gVar, l0 l0Var, p<? super j0, ? super d<? super T>, ? extends Object> pVar) {
        g d10 = f0.d(j0Var, gVar);
        r0 a2Var = l0Var.isLazy() ? new a2(d10, pVar) : new r0(d10, true);
        a2Var.L0(l0Var, a2Var, pVar);
        return a2Var;
    }

    public static /* synthetic */ q0 b(j0 j0Var, g gVar, l0 l0Var, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = h.f10863m;
        }
        if ((i10 & 2) != 0) {
            l0Var = l0.DEFAULT;
        }
        return g.a(j0Var, gVar, l0Var, pVar);
    }

    public static final r1 c(j0 j0Var, g gVar, l0 l0Var, p<? super j0, ? super d<? super s>, ? extends Object> pVar) {
        g d10 = f0.d(j0Var, gVar);
        a b2Var = l0Var.isLazy() ? new b2(d10, pVar) : new i2(d10, true);
        b2Var.L0(l0Var, b2Var, pVar);
        return b2Var;
    }

    public static /* synthetic */ r1 d(j0 j0Var, g gVar, l0 l0Var, p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = h.f10863m;
        }
        if ((i10 & 2) != 0) {
            l0Var = l0.DEFAULT;
        }
        return g.c(j0Var, gVar, l0Var, pVar);
    }

    /* JADX INFO: finally extract failed */
    public static final <T> Object e(g gVar, p<? super j0, ? super d<? super T>, ? extends Object> pVar, d<? super T> dVar) {
        Object obj;
        g context = dVar.getContext();
        g e10 = f0.e(context, gVar);
        v1.f(e10);
        if (e10 == context) {
            d0 d0Var = new d0(e10, dVar);
            obj = b.c(d0Var, d0Var, pVar);
        } else {
            e.b bVar = e.f10860l;
            if (l.a(e10.a(bVar), context.a(bVar))) {
                o2 o2Var = new o2(e10, dVar);
                g context2 = o2Var.getContext();
                Object c10 = l0.c(context2, (Object) null);
                try {
                    Object c11 = b.c(o2Var, o2Var, pVar);
                    l0.a(context2, c10);
                    obj = c11;
                } catch (Throwable th) {
                    l0.a(context2, c10);
                    throw th;
                }
            } else {
                t0 t0Var = new t0(e10, dVar);
                a.e(pVar, t0Var, t0Var, (r8.l) null, 4, (Object) null);
                obj = t0Var.M0();
            }
        }
        if (obj == d.d()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return obj;
    }
}
