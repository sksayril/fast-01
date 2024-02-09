package h5;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Type, com.google.gson.g<?>> f9305a;

    /* renamed from: b  reason: collision with root package name */
    private final k5.b f9306b = k5.b.a();

    class a implements i<T> {
        a() {
        }

        public T a() {
            return new ConcurrentHashMap();
        }
    }

    class b implements i<T> {
        b() {
        }

        public T a() {
            return new TreeMap();
        }
    }

    /* renamed from: h5.c$c  reason: collision with other inner class name */
    class C0144c implements i<T> {
        C0144c() {
        }

        public T a() {
            return new LinkedHashMap();
        }
    }

    class d implements i<T> {
        d() {
        }

        public T a() {
            return new h();
        }
    }

    class e implements i<T> {

        /* renamed from: a  reason: collision with root package name */
        private final m f9311a = m.b();

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f9312b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Type f9313c;

        e(Class cls, Type type) {
            this.f9312b = cls;
            this.f9313c = type;
        }

        public T a() {
            try {
                return this.f9311a.c(this.f9312b);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to invoke no-args constructor for " + this.f9313c + ". Registering an InstanceCreator with Gson for this type may fix this problem.", e10);
            }
        }
    }

    class f implements i<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.gson.g f9315a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Type f9316b;

        f(com.google.gson.g gVar, Type type) {
            this.f9315a = gVar;
            this.f9316b = type;
        }

        public T a() {
            return this.f9315a.a(this.f9316b);
        }
    }

    class g implements i<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.google.gson.g f9318a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Type f9319b;

        g(com.google.gson.g gVar, Type type) {
            this.f9318a = gVar;
            this.f9319b = type;
        }

        public T a() {
            return this.f9318a.a(this.f9319b);
        }
    }

    class h implements i<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Constructor f9321a;

        h(Constructor constructor) {
            this.f9321a = constructor;
        }

        public T a() {
            try {
                return this.f9321a.newInstance((Object[]) null);
            } catch (InstantiationException e10) {
                throw new RuntimeException("Failed to invoke " + this.f9321a + " with no args", e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Failed to invoke " + this.f9321a + " with no args", e11.getTargetException());
            } catch (IllegalAccessException e12) {
                throw new AssertionError(e12);
            }
        }
    }

    class i implements i<T> {
        i() {
        }

        public T a() {
            return new TreeSet();
        }
    }

    class j implements i<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Type f9324a;

        j(Type type) {
            this.f9324a = type;
        }

        public T a() {
            Type type = this.f9324a;
            if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                if (type2 instanceof Class) {
                    return EnumSet.noneOf((Class) type2);
                }
                throw new com.google.gson.l("Invalid EnumSet type: " + this.f9324a.toString());
            }
            throw new com.google.gson.l("Invalid EnumSet type: " + this.f9324a.toString());
        }
    }

    class k implements i<T> {
        k() {
        }

        public T a() {
            return new LinkedHashSet();
        }
    }

    class l implements i<T> {
        l() {
        }

        public T a() {
            return new ArrayDeque();
        }
    }

    class m implements i<T> {
        m() {
        }

        public T a() {
            return new ArrayList();
        }
    }

    class n implements i<T> {
        n() {
        }

        public T a() {
            return new ConcurrentSkipListMap();
        }
    }

    public c(Map<Type, com.google.gson.g<?>> map) {
        this.f9305a = map;
    }

    private <T> i<T> b(Class<? super T> cls) {
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f9306b.b(declaredConstructor);
            }
            return new h(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private <T> i<T> c(Type type, Class<? super T> cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new i() : EnumSet.class.isAssignableFrom(cls) ? new j(type) : Set.class.isAssignableFrom(cls) ? new k() : Queue.class.isAssignableFrom(cls) ? new l() : new m();
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new n() : ConcurrentMap.class.isAssignableFrom(cls) ? new a() : SortedMap.class.isAssignableFrom(cls) ? new b() : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(m5.a.b(((ParameterizedType) type).getActualTypeArguments()[0]).c())) ? new d() : new C0144c();
        }
        return null;
    }

    private <T> i<T> d(Type type, Class<? super T> cls) {
        return new e(cls, type);
    }

    public <T> i<T> a(m5.a<T> aVar) {
        Type e10 = aVar.e();
        Class<? super T> c10 = aVar.c();
        com.google.gson.g gVar = this.f9305a.get(e10);
        if (gVar != null) {
            return new f(gVar, e10);
        }
        com.google.gson.g gVar2 = this.f9305a.get(c10);
        if (gVar2 != null) {
            return new g(gVar2, e10);
        }
        i<T> b10 = b(c10);
        if (b10 != null) {
            return b10;
        }
        i<T> c11 = c(e10, c10);
        return c11 != null ? c11 : d(e10, c10);
    }

    public String toString() {
        return this.f9305a.toString();
    }
}
