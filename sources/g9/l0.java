package g9;

import b9.l2;
import j8.g;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import r8.p;

public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    public static final h0 f9003a = new h0("NO_THREAD_ELEMENTS");

    /* renamed from: b  reason: collision with root package name */
    private static final p<Object, g.b, Object> f9004b = a.f9007m;

    /* renamed from: c  reason: collision with root package name */
    private static final p<l2<?>, g.b, l2<?>> f9005c = b.f9008m;

    /* renamed from: d  reason: collision with root package name */
    private static final p<p0, g.b, p0> f9006d = c.f9009m;

    static final class a extends m implements p<Object, g.b, Object> {

        /* renamed from: m  reason: collision with root package name */
        public static final a f9007m = new a();

        a() {
            super(2);
        }

        /* renamed from: b */
        public final Object invoke(Object obj, g.b bVar) {
            if (!(bVar instanceof l2)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    static final class b extends m implements p<l2<?>, g.b, l2<?>> {

        /* renamed from: m  reason: collision with root package name */
        public static final b f9008m = new b();

        b() {
            super(2);
        }

        /* renamed from: b */
        public final l2<?> invoke(l2<?> l2Var, g.b bVar) {
            if (l2Var != null) {
                return l2Var;
            }
            if (bVar instanceof l2) {
                return (l2) bVar;
            }
            return null;
        }
    }

    static final class c extends m implements p<p0, g.b, p0> {

        /* renamed from: m  reason: collision with root package name */
        public static final c f9009m = new c();

        c() {
            super(2);
        }

        /* renamed from: b */
        public final p0 invoke(p0 p0Var, g.b bVar) {
            if (bVar instanceof l2) {
                l2 l2Var = (l2) bVar;
                p0Var.a(l2Var, l2Var.D(p0Var.f9021a));
            }
            return p0Var;
        }
    }

    public static final void a(g gVar, Object obj) {
        if (obj != f9003a) {
            if (obj instanceof p0) {
                ((p0) obj).b(gVar);
                return;
            }
            Object k10 = gVar.k(null, f9005c);
            l.c(k10, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((l2) k10).z(gVar, obj);
        }
    }

    public static final Object b(g gVar) {
        Object k10 = gVar.k(0, f9004b);
        l.b(k10);
        return k10;
    }

    public static final Object c(g gVar, Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        if (obj == 0) {
            return f9003a;
        }
        if (obj instanceof Integer) {
            return gVar.k(new p0(gVar, ((Number) obj).intValue()), f9006d);
        }
        l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((l2) obj).D(gVar);
    }
}
