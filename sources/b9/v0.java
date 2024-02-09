package b9;

import g8.m;
import g8.n;
import g8.s;
import g9.j;
import g9.l0;
import j8.d;
import j8.g;
import kotlin.jvm.internal.l;

public final class v0 {
    public static final <T> void a(u0<? super T> u0Var, int i10) {
        d<? super T> b10 = u0Var.b();
        boolean z9 = i10 == 4;
        if (z9 || !(b10 instanceof j) || b(i10) != b(u0Var.f3492o)) {
            d(u0Var, b10, z9);
            return;
        }
        g0 g0Var = ((j) b10).f8995p;
        g context = b10.getContext();
        if (g0Var.J(context)) {
            g0Var.I(context, u0Var);
        } else {
            e(u0Var);
        }
    }

    public static final boolean b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean c(int i10) {
        return i10 == 2;
    }

    public static final <T> void d(u0<? super T> u0Var, d<? super T> dVar, boolean z9) {
        Object obj;
        Object k10 = u0Var.k();
        Throwable c10 = u0Var.c(k10);
        if (c10 != null) {
            m.a aVar = m.f8970m;
            obj = n.a(c10);
        } else {
            m.a aVar2 = m.f8970m;
            obj = u0Var.g(k10);
        }
        Object a10 = m.a(obj);
        if (z9) {
            l.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            j jVar = (j) dVar;
            d<T> dVar2 = jVar.f8996q;
            Object obj2 = jVar.f8998s;
            g context = dVar2.getContext();
            Object c11 = l0.c(context, obj2);
            o2<?> g10 = c11 != l0.f9003a ? f0.g(dVar2, context, c11) : null;
            try {
                jVar.f8996q.resumeWith(a10);
                s sVar = s.f8976a;
            } finally {
                if (g10 == null || g10.M0()) {
                    l0.a(context, c11);
                }
            }
        } else {
            dVar.resumeWith(a10);
        }
    }

    private static final void e(u0<?> u0Var) {
        b1 b10 = m2.f3468a.b();
        if (b10.S()) {
            b10.O(u0Var);
            return;
        }
        b10.Q(true);
        try {
            d(u0Var, u0Var.b(), true);
            do {
            } while (b10.V());
        } catch (Throwable th) {
            b10.L(true);
            throw th;
        }
        b10.L(true);
    }
}
