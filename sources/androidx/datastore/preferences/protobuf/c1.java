package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class c1 {

    /* renamed from: c  reason: collision with root package name */
    private static final c1 f1892c = new c1();

    /* renamed from: a  reason: collision with root package name */
    private final h1 f1893a = new j0();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap<Class<?>, g1<?>> f1894b = new ConcurrentHashMap();

    private c1() {
    }

    public static c1 a() {
        return f1892c;
    }

    public <T> void b(T t9, f1 f1Var, p pVar) {
        e(t9).b(t9, f1Var, pVar);
    }

    public g1<?> c(Class<?> cls, g1<?> g1Var) {
        a0.b(cls, "messageType");
        a0.b(g1Var, "schema");
        return this.f1894b.putIfAbsent(cls, g1Var);
    }

    public <T> g1<T> d(Class<T> cls) {
        a0.b(cls, "messageType");
        g1<T> g1Var = (g1) this.f1894b.get(cls);
        if (g1Var != null) {
            return g1Var;
        }
        g1<T> a10 = this.f1893a.a(cls);
        g1<?> c10 = c(cls, a10);
        return c10 != null ? c10 : a10;
    }

    public <T> g1<T> e(T t9) {
        return d(t9.getClass());
    }
}
