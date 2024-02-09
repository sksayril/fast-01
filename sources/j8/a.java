package j8;

import j8.g;
import kotlin.jvm.internal.l;
import r8.p;

public abstract class a implements g.b {

    /* renamed from: m  reason: collision with root package name */
    private final g.c<?> f10854m;

    public a(g.c<?> cVar) {
        l.e(cVar, "key");
        this.f10854m = cVar;
    }

    public <E extends g.b> E a(g.c<E> cVar) {
        return g.b.a.b(this, cVar);
    }

    public g.c<?> getKey() {
        return this.f10854m;
    }

    public <R> R k(R r9, p<? super R, ? super g.b, ? extends R> pVar) {
        return g.b.a.a(this, r9, pVar);
    }

    public g r(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    public g t(g gVar) {
        return g.b.a.d(this, gVar);
    }
}
