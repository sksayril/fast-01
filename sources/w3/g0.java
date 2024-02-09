package w3;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import q4.c;
import s4.b;

final class g0 implements e {

    /* renamed from: a  reason: collision with root package name */
    private final Set<f0<?>> f12897a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<f0<?>> f12898b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<f0<?>> f12899c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<f0<?>> f12900d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<f0<?>> f12901e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<Class<?>> f12902f;

    /* renamed from: g  reason: collision with root package name */
    private final e f12903g;

    private static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final Set<Class<?>> f12904a;

        /* renamed from: b  reason: collision with root package name */
        private final c f12905b;

        public a(Set<Class<?>> set, c cVar) {
            this.f12904a = set;
            this.f12905b = cVar;
        }

        public void b(q4.a<?> aVar) {
            if (this.f12904a.contains(aVar.b())) {
                this.f12905b.b(aVar);
            } else {
                throw new t(String.format("Attempting to publish an undeclared event %s.", new Object[]{aVar}));
            }
        }
    }

    g0(c<?> cVar, e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (r next : cVar.g()) {
            if (next.e()) {
                boolean g10 = next.g();
                f0<?> c10 = next.c();
                if (g10) {
                    hashSet4.add(c10);
                } else {
                    hashSet.add(c10);
                }
            } else if (next.d()) {
                hashSet3.add(next.c());
            } else {
                boolean g11 = next.g();
                f0<?> c11 = next.c();
                if (g11) {
                    hashSet5.add(c11);
                } else {
                    hashSet2.add(c11);
                }
            }
        }
        if (!cVar.k().isEmpty()) {
            hashSet.add(f0.b(c.class));
        }
        this.f12897a = Collections.unmodifiableSet(hashSet);
        this.f12898b = Collections.unmodifiableSet(hashSet2);
        this.f12899c = Collections.unmodifiableSet(hashSet3);
        this.f12900d = Collections.unmodifiableSet(hashSet4);
        this.f12901e = Collections.unmodifiableSet(hashSet5);
        this.f12902f = cVar.k();
        this.f12903g = eVar;
    }

    public <T> T a(Class<T> cls) {
        if (this.f12897a.contains(f0.b(cls))) {
            T a10 = this.f12903g.a(cls);
            return !cls.equals(c.class) ? a10 : new a(this.f12902f, (c) a10);
        }
        throw new t(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    public <T> s4.a<T> b(f0<T> f0Var) {
        if (this.f12899c.contains(f0Var)) {
            return this.f12903g.b(f0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Deferred<%s>.", new Object[]{f0Var}));
    }

    public /* synthetic */ Set c(Class cls) {
        return d.e(this, cls);
    }

    public <T> b<Set<T>> d(f0<T> f0Var) {
        if (this.f12901e.contains(f0Var)) {
            return this.f12903g.d(f0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{f0Var}));
    }

    public <T> b<T> e(Class<T> cls) {
        return h(f0.b(cls));
    }

    public <T> Set<T> f(f0<T> f0Var) {
        if (this.f12900d.contains(f0Var)) {
            return this.f12903g.f(f0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{f0Var}));
    }

    public <T> T g(f0<T> f0Var) {
        if (this.f12897a.contains(f0Var)) {
            return this.f12903g.g(f0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency %s.", new Object[]{f0Var}));
    }

    public <T> b<T> h(f0<T> f0Var) {
        if (this.f12898b.contains(f0Var)) {
            return this.f12903g.h(f0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{f0Var}));
    }

    public <T> s4.a<T> i(Class<T> cls) {
        return b(f0.b(cls));
    }
}
