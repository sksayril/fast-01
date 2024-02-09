package w3;

import java.lang.annotation.Annotation;

public final class f0<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<? extends Annotation> f12892a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<T> f12893b;

    private @interface a {
    }

    public f0(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f12892a = cls;
        this.f12893b = cls2;
    }

    public static <T> f0<T> a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new f0<>(cls, cls2);
    }

    public static <T> f0<T> b(Class<T> cls) {
        return new f0<>(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f0.class != obj.getClass()) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (!this.f12893b.equals(f0Var.f12893b)) {
            return false;
        }
        return this.f12892a.equals(f0Var.f12892a);
    }

    public int hashCode() {
        return (this.f12893b.hashCode() * 31) + this.f12892a.hashCode();
    }

    public String toString() {
        if (this.f12892a == a.class) {
            return this.f12893b.getName();
        }
        return "@" + this.f12892a.getName() + " " + this.f12893b.getName();
    }
}
