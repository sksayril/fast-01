package h9;

import g8.m;
import g8.n;
import g8.s;
import g9.k;
import j8.d;
import r8.l;
import r8.p;

public final class a {
    private static final void a(d<?> dVar, Throwable th) {
        m.a aVar = m.f8970m;
        dVar.resumeWith(m.a(n.a(th)));
        throw th;
    }

    public static final void b(d<? super s> dVar, d<?> dVar2) {
        try {
            d c10 = c.c(dVar);
            m.a aVar = m.f8970m;
            k.c(c10, m.a(s.f8976a), (l) null, 2, (Object) null);
        } catch (Throwable th) {
            a(dVar2, th);
        }
    }

    public static final <T> void c(l<? super d<? super T>, ? extends Object> lVar, d<? super T> dVar) {
        try {
            d c10 = c.c(c.a(lVar, dVar));
            m.a aVar = m.f8970m;
            k.c(c10, m.a(s.f8976a), (l) null, 2, (Object) null);
        } catch (Throwable th) {
            a(dVar, th);
        }
    }

    public static final <R, T> void d(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r9, d<? super T> dVar, l<? super Throwable, s> lVar) {
        try {
            d c10 = c.c(c.b(pVar, r9, dVar));
            m.a aVar = m.f8970m;
            k.b(c10, m.a(s.f8976a), lVar);
        } catch (Throwable th) {
            a(dVar, th);
        }
    }

    public static /* synthetic */ void e(p pVar, Object obj, d dVar, l lVar, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            lVar = null;
        }
        d(pVar, obj, dVar, lVar);
    }
}
