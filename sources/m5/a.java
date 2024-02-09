package m5;

import h5.b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    final Class<? super T> f11205a;

    /* renamed from: b  reason: collision with root package name */
    final Type f11206b;

    /* renamed from: c  reason: collision with root package name */
    final int f11207c;

    protected a() {
        Type d10 = d(getClass());
        this.f11206b = d10;
        this.f11205a = b.k(d10);
        this.f11207c = d10.hashCode();
    }

    a(Type type) {
        Type b10 = b.b((Type) h5.a.b(type));
        this.f11206b = b10;
        this.f11205a = b.k(b10);
        this.f11207c = b10.hashCode();
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls);
    }

    public static a<?> b(Type type) {
        return new a<>(type);
    }

    static Type d(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return b.b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final Class<? super T> c() {
        return this.f11205a;
    }

    public final Type e() {
        return this.f11206b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b.f(this.f11206b, ((a) obj).f11206b);
    }

    public final int hashCode() {
        return this.f11207c;
    }

    public final String toString() {
        return b.u(this.f11206b);
    }
}
