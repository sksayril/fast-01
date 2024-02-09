package j8;

import j8.e;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import r8.p;

public interface g {

    public static final class a {

        /* renamed from: j8.g$a$a  reason: collision with other inner class name */
        static final class C0164a extends m implements p<g, b, g> {

            /* renamed from: m  reason: collision with root package name */
            public static final C0164a f10862m = new C0164a();

            C0164a() {
                super(2);
            }

            /* renamed from: b */
            public final g invoke(g gVar, b bVar) {
                c cVar;
                l.e(gVar, "acc");
                l.e(bVar, "element");
                g r9 = gVar.r(bVar.getKey());
                h hVar = h.f10863m;
                if (r9 == hVar) {
                    return bVar;
                }
                e.b bVar2 = e.f10860l;
                e eVar = (e) r9.a(bVar2);
                if (eVar == null) {
                    cVar = new c(r9, bVar);
                } else {
                    g r10 = r9.r(bVar2);
                    if (r10 == hVar) {
                        return new c(bVar, eVar);
                    }
                    cVar = new c(new c(r10, bVar), eVar);
                }
                return cVar;
            }
        }

        public static g a(g gVar, g gVar2) {
            l.e(gVar2, "context");
            return gVar2 == h.f10863m ? gVar : (g) gVar2.k(gVar, C0164a.f10862m);
        }
    }

    public interface b extends g {

        public static final class a {
            public static <R> R a(b bVar, R r9, p<? super R, ? super b, ? extends R> pVar) {
                l.e(pVar, "operation");
                return pVar.invoke(r9, bVar);
            }

            public static <E extends b> E b(b bVar, c<E> cVar) {
                l.e(cVar, "key");
                if (!l.a(bVar.getKey(), cVar)) {
                    return null;
                }
                l.c(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static g c(b bVar, c<?> cVar) {
                l.e(cVar, "key");
                return l.a(bVar.getKey(), cVar) ? h.f10863m : bVar;
            }

            public static g d(b bVar, g gVar) {
                l.e(gVar, "context");
                return a.a(bVar, gVar);
            }
        }

        <E extends b> E a(c<E> cVar);

        c<?> getKey();
    }

    public interface c<E extends b> {
    }

    <E extends b> E a(c<E> cVar);

    <R> R k(R r9, p<? super R, ? super b, ? extends R> pVar);

    g r(c<?> cVar);

    g t(g gVar);
}
