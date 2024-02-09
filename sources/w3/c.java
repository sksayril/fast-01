package w3;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final String f12872a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<f0<? super T>> f12873b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<r> f12874c;

    /* renamed from: d  reason: collision with root package name */
    private final int f12875d;

    /* renamed from: e  reason: collision with root package name */
    private final int f12876e;

    /* renamed from: f  reason: collision with root package name */
    private final h<T> f12877f;

    /* renamed from: g  reason: collision with root package name */
    private final Set<Class<?>> f12878g;

    public static class b<T> {

        /* renamed from: a  reason: collision with root package name */
        private String f12879a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<f0<? super T>> f12880b;

        /* renamed from: c  reason: collision with root package name */
        private final Set<r> f12881c;

        /* renamed from: d  reason: collision with root package name */
        private int f12882d;

        /* renamed from: e  reason: collision with root package name */
        private int f12883e;

        /* renamed from: f  reason: collision with root package name */
        private h<T> f12884f;

        /* renamed from: g  reason: collision with root package name */
        private final Set<Class<?>> f12885g;

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            this.f12879a = null;
            HashSet hashSet = new HashSet();
            this.f12880b = hashSet;
            this.f12881c = new HashSet();
            this.f12882d = 0;
            this.f12883e = 0;
            this.f12885g = new HashSet();
            e0.c(cls, "Null interface");
            hashSet.add(f0.b(cls));
            for (Class<? super T> cls2 : clsArr) {
                e0.c(cls2, "Null interface");
                this.f12880b.add(f0.b(cls2));
            }
        }

        @SafeVarargs
        private b(f0<T> f0Var, f0<? super T>... f0VarArr) {
            this.f12879a = null;
            HashSet hashSet = new HashSet();
            this.f12880b = hashSet;
            this.f12881c = new HashSet();
            this.f12882d = 0;
            this.f12883e = 0;
            this.f12885g = new HashSet();
            e0.c(f0Var, "Null interface");
            hashSet.add(f0Var);
            for (f0<? super T> c10 : f0VarArr) {
                e0.c(c10, "Null interface");
            }
            Collections.addAll(this.f12880b, f0VarArr);
        }

        /* access modifiers changed from: private */
        public b<T> f() {
            this.f12883e = 1;
            return this;
        }

        private b<T> h(int i10) {
            e0.d(this.f12882d == 0, "Instantiation type has already been set.");
            this.f12882d = i10;
            return this;
        }

        private void i(f0<?> f0Var) {
            e0.a(!this.f12880b.contains(f0Var), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(r rVar) {
            e0.c(rVar, "Null dependency");
            i(rVar.c());
            this.f12881c.add(rVar);
            return this;
        }

        public c<T> c() {
            e0.d(this.f12884f != null, "Missing required property: factory.");
            return new c(this.f12879a, new HashSet(this.f12880b), new HashSet(this.f12881c), this.f12882d, this.f12883e, this.f12884f, this.f12885g);
        }

        public b<T> d() {
            return h(2);
        }

        public b<T> e(h<T> hVar) {
            this.f12884f = (h) e0.c(hVar, "Null factory");
            return this;
        }

        public b<T> g(String str) {
            this.f12879a = str;
            return this;
        }
    }

    private c(String str, Set<f0<? super T>> set, Set<r> set2, int i10, int i11, h<T> hVar, Set<Class<?>> set3) {
        this.f12872a = str;
        this.f12873b = Collections.unmodifiableSet(set);
        this.f12874c = Collections.unmodifiableSet(set2);
        this.f12875d = i10;
        this.f12876e = i11;
        this.f12877f = hVar;
        this.f12878g = Collections.unmodifiableSet(set3);
    }

    public static <T> b<T> c(Class<T> cls) {
        return new b<>((Class) cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> d(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>((Class) cls, (Class[]) clsArr);
    }

    public static <T> b<T> e(f0<T> f0Var) {
        return new b<>((f0) f0Var, new f0[0]);
    }

    @SafeVarargs
    public static <T> b<T> f(f0<T> f0Var, f0<? super T>... f0VarArr) {
        return new b<>((f0) f0Var, (f0[]) f0VarArr);
    }

    public static <T> c<T> l(T t9, Class<T> cls) {
        return m(cls).e(new a(t9)).c();
    }

    public static <T> b<T> m(Class<T> cls) {
        return c(cls).f();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object q(Object obj, e eVar) {
        return obj;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object r(Object obj, e eVar) {
        return obj;
    }

    @SafeVarargs
    public static <T> c<T> s(T t9, Class<T> cls, Class<? super T>... clsArr) {
        return d(cls, clsArr).e(new b(t9)).c();
    }

    public Set<r> g() {
        return this.f12874c;
    }

    public h<T> h() {
        return this.f12877f;
    }

    public String i() {
        return this.f12872a;
    }

    public Set<f0<? super T>> j() {
        return this.f12873b;
    }

    public Set<Class<?>> k() {
        return this.f12878g;
    }

    public boolean n() {
        return this.f12875d == 1;
    }

    public boolean o() {
        return this.f12875d == 2;
    }

    public boolean p() {
        return this.f12876e == 0;
    }

    public c<T> t(h<T> hVar) {
        return new c(this.f12872a, this.f12873b, this.f12874c, this.f12875d, this.f12876e, hVar, this.f12878g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f12873b.toArray()) + ">{" + this.f12875d + ", type=" + this.f12876e + ", deps=" + Arrays.toString(this.f12874c.toArray()) + "}";
    }
}
