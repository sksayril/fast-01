package j8;

import j8.g;
import j8.g.b;
import r8.l;

public abstract class b<B extends g.b, E extends B> implements g.c<E> {

    /* renamed from: m  reason: collision with root package name */
    private final l<g.b, E> f10855m;

    /* renamed from: n  reason: collision with root package name */
    private final g.c<?> f10856n;

    public b(g.c<B> cVar, l<? super g.b, ? extends E> lVar) {
        kotlin.jvm.internal.l.e(cVar, "baseKey");
        kotlin.jvm.internal.l.e(lVar, "safeCast");
        this.f10855m = lVar;
        this.f10856n = cVar instanceof b ? ((b) cVar).f10856n : cVar;
    }

    public final boolean a(g.c<?> cVar) {
        kotlin.jvm.internal.l.e(cVar, "key");
        return cVar == this || this.f10856n == cVar;
    }

    public final E b(g.b bVar) {
        kotlin.jvm.internal.l.e(bVar, "element");
        return (g.b) this.f10855m.invoke(bVar);
    }
}
