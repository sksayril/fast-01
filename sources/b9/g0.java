package b9;

import g9.j;
import g9.o;
import g9.p;
import j8.b;
import j8.d;
import j8.e;
import j8.g;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.m;
import r8.l;

public abstract class g0 extends j8.a implements e {

    /* renamed from: n  reason: collision with root package name */
    public static final a f3452n = new a((g) null);

    public static final class a extends b<e, g0> {

        /* renamed from: b9.g0$a$a  reason: collision with other inner class name */
        static final class C0071a extends m implements l<g.b, g0> {

            /* renamed from: m  reason: collision with root package name */
            public static final C0071a f3453m = new C0071a();

            C0071a() {
                super(1);
            }

            /* renamed from: b */
            public final g0 invoke(g.b bVar) {
                if (bVar instanceof g0) {
                    return (g0) bVar;
                }
                return null;
            }
        }

        private a() {
            super(e.f10860l, C0071a.f3453m);
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public g0() {
        super(e.f10860l);
    }

    public final <T> d<T> G(d<? super T> dVar) {
        return new j(this, dVar);
    }

    public abstract void I(j8.g gVar, Runnable runnable);

    public boolean J(j8.g gVar) {
        return true;
    }

    public g0 K(int i10) {
        p.a(i10);
        return new o(this, i10);
    }

    public <E extends g.b> E a(g.c<E> cVar) {
        return e.a.a(this, cVar);
    }

    public final void m(d<?> dVar) {
        kotlin.jvm.internal.l.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((j) dVar).r();
    }

    public j8.g r(g.c<?> cVar) {
        return e.a.b(this, cVar);
    }

    public String toString() {
        return n0.a(this) + '@' + n0.b(this);
    }
}
