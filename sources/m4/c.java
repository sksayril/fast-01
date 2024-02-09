package m4;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f11201a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, Object> f11202b;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f11203a;

        /* renamed from: b  reason: collision with root package name */
        private Map<Class<?>, Object> f11204b = null;

        b(String str) {
            this.f11203a = str;
        }

        public c a() {
            return new c(this.f11203a, this.f11204b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f11204b)));
        }

        public <T extends Annotation> b b(T t9) {
            if (this.f11204b == null) {
                this.f11204b = new HashMap();
            }
            this.f11204b.put(t9.annotationType(), t9);
            return this;
        }
    }

    private c(String str, Map<Class<?>, Object> map) {
        this.f11201a = str;
        this.f11202b = map;
    }

    public static b a(String str) {
        return new b(str);
    }

    public static c d(String str) {
        return new c(str, Collections.emptyMap());
    }

    public String b() {
        return this.f11201a;
    }

    public <T extends Annotation> T c(Class<T> cls) {
        return (Annotation) this.f11202b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f11201a.equals(cVar.f11201a) && this.f11202b.equals(cVar.f11202b);
    }

    public int hashCode() {
        return (this.f11201a.hashCode() * 31) + this.f11202b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f11201a + ", properties=" + this.f11202b.values() + "}";
    }
}
