package j8;

import g8.m;
import g8.s;
import r8.l;
import r8.p;

public final class f {
    public static final <T> void a(l<? super d<? super T>, ? extends Object> lVar, d<? super T> dVar) {
        kotlin.jvm.internal.l.e(lVar, "<this>");
        kotlin.jvm.internal.l.e(dVar, "completion");
        d c10 = c.c(c.a(lVar, dVar));
        m.a aVar = m.f8970m;
        c10.resumeWith(m.a(s.f8976a));
    }

    public static final <R, T> void b(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r9, d<? super T> dVar) {
        kotlin.jvm.internal.l.e(pVar, "<this>");
        kotlin.jvm.internal.l.e(dVar, "completion");
        d c10 = c.c(c.b(pVar, r9, dVar));
        m.a aVar = m.f8970m;
        c10.resumeWith(m.a(s.f8976a));
    }
}
