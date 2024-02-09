package j8;

import j8.g;
import kotlin.jvm.internal.l;

public interface e extends g.b {

    /* renamed from: l  reason: collision with root package name */
    public static final b f10860l = b.f10861m;

    public static final class a {
        public static <E extends g.b> E a(e eVar, g.c<E> cVar) {
            l.e(cVar, "key");
            if (cVar instanceof b) {
                b bVar = (b) cVar;
                if (!bVar.a(eVar.getKey())) {
                    return null;
                }
                E b10 = bVar.b(eVar);
                if (b10 instanceof g.b) {
                    return b10;
                }
                return null;
            } else if (e.f10860l != cVar) {
                return null;
            } else {
                l.c(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return eVar;
            }
        }

        public static g b(e eVar, g.c<?> cVar) {
            l.e(cVar, "key");
            if (!(cVar instanceof b)) {
                return e.f10860l == cVar ? h.f10863m : eVar;
            }
            b bVar = (b) cVar;
            return (!bVar.a(eVar.getKey()) || bVar.b(eVar) == null) ? eVar : h.f10863m;
        }
    }

    public static final class b implements g.c<e> {

        /* renamed from: m  reason: collision with root package name */
        static final /* synthetic */ b f10861m = new b();

        private b() {
        }
    }

    <T> d<T> G(d<? super T> dVar);

    void m(d<?> dVar);
}
