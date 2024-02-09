package b9;

import j8.d;
import j8.e;
import j8.g;
import j8.h;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import r8.p;

public final class f0 {

    static final class a extends m implements p<g, g.b, g> {

        /* renamed from: m  reason: collision with root package name */
        public static final a f3446m = new a();

        a() {
            super(2);
        }

        /* renamed from: b */
        public final g invoke(g gVar, g.b bVar) {
            return bVar instanceof e0 ? gVar.t(((e0) bVar).l()) : gVar.t(bVar);
        }
    }

    static final class b extends m implements p<g, g.b, g> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ u<g> f3447m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ boolean f3448n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(u<g> uVar, boolean z9) {
            super(2);
            this.f3447m = uVar;
            this.f3448n = z9;
        }

        /* renamed from: b */
        public final g invoke(g gVar, g.b bVar) {
            if (!(bVar instanceof e0)) {
                return gVar.t(bVar);
            }
            g.b a10 = ((g) this.f3447m.f11078m).a(bVar.getKey());
            if (a10 == null) {
                e0 e0Var = (e0) bVar;
                if (this.f3448n) {
                    e0Var = e0Var.l();
                }
                return gVar.t(e0Var);
            }
            u<g> uVar = this.f3447m;
            uVar.f11078m = ((g) uVar.f11078m).r(bVar.getKey());
            return gVar.t(((e0) bVar).q(a10));
        }
    }

    static final class c extends m implements p<Boolean, g.b, Boolean> {

        /* renamed from: m  reason: collision with root package name */
        public static final c f3449m = new c();

        c() {
            super(2);
        }

        public final Boolean b(boolean z9, g.b bVar) {
            return Boolean.valueOf(z9 || (bVar instanceof e0));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((Boolean) obj).booleanValue(), (g.b) obj2);
        }
    }

    private static final g a(g gVar, g gVar2, boolean z9) {
        boolean c10 = c(gVar);
        boolean c11 = c(gVar2);
        if (!c10 && !c11) {
            return gVar.t(gVar2);
        }
        u uVar = new u();
        uVar.f11078m = gVar2;
        h hVar = h.f10863m;
        g gVar3 = (g) gVar.k(hVar, new b(uVar, z9));
        if (c11) {
            uVar.f11078m = ((g) uVar.f11078m).k(hVar, a.f3446m);
        }
        return gVar3.t((g) uVar.f11078m);
    }

    public static final String b(g gVar) {
        return null;
    }

    private static final boolean c(g gVar) {
        return ((Boolean) gVar.k(Boolean.FALSE, c.f3449m)).booleanValue();
    }

    public static final g d(j0 j0Var, g gVar) {
        g a10 = a(j0Var.e(), gVar, true);
        return (a10 == x0.a() || a10.a(e.f10860l) != null) ? a10 : a10.t(x0.a());
    }

    public static final g e(g gVar, g gVar2) {
        return !c(gVar2) ? gVar.t(gVar2) : a(gVar, gVar2, false);
    }

    public static final o2<?> f(kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof t0) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof o2) {
                return (o2) eVar;
            }
        }
        return null;
    }

    public static final o2<?> g(d<?> dVar, g gVar, Object obj) {
        if (!(dVar instanceof kotlin.coroutines.jvm.internal.e)) {
            return null;
        }
        if (!(gVar.a(p2.f3482m) != null)) {
            return null;
        }
        o2<?> f10 = f((kotlin.coroutines.jvm.internal.e) dVar);
        if (f10 != null) {
            f10.N0(gVar, obj);
        }
        return f10;
    }
}
