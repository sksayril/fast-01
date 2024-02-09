package h9;

import b9.z;
import b9.z1;
import g8.m;
import g8.n;
import g9.d0;
import g9.l0;
import j8.d;
import j8.g;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.y;
import r8.l;
import r8.p;

public final class b {
    public static final <T> void a(l<? super d<? super T>, ? extends Object> lVar, d<? super T> dVar) {
        Object obj;
        g context;
        Object c10;
        d<? super T> a10 = h.a(dVar);
        try {
            context = dVar.getContext();
            c10 = l0.c(context, (Object) null);
            obj = ((l) y.b(lVar, 1)).invoke(a10);
            l0.a(context, c10);
            if (obj != d.d()) {
                m.a aVar = m.f8970m;
                a10.resumeWith(m.a(obj));
            }
        } catch (Throwable th) {
            m.a aVar2 = m.f8970m;
            obj = n.a(th);
        }
    }

    public static final <R, T> void b(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r9, d<? super T> dVar) {
        Object obj;
        g context;
        Object c10;
        d<? super T> a10 = h.a(dVar);
        try {
            context = dVar.getContext();
            c10 = l0.c(context, (Object) null);
            obj = ((p) y.b(pVar, 2)).invoke(r9, a10);
            l0.a(context, c10);
            if (obj != d.d()) {
                m.a aVar = m.f8970m;
                a10.resumeWith(m.a(obj));
            }
        } catch (Throwable th) {
            m.a aVar2 = m.f8970m;
            obj = n.a(th);
        }
    }

    public static final <T, R> Object c(d0<? super T> d0Var, R r9, p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        Object obj;
        Object l02;
        try {
            obj = ((p) y.b(pVar, 2)).invoke(r9, d0Var);
        } catch (Throwable th) {
            obj = new z(th, false, 2, (kotlin.jvm.internal.g) null);
        }
        if (obj == d.d() || (l02 = d0Var.l0(obj)) == z1.f3522b) {
            return d.d();
        }
        if (!(l02 instanceof z)) {
            return z1.h(l02);
        }
        throw ((z) l02).f3519a;
    }
}
