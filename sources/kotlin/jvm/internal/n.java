package kotlin.jvm.internal;

public final class n implements d {

    /* renamed from: m  reason: collision with root package name */
    private final Class<?> f11074m;

    /* renamed from: n  reason: collision with root package name */
    private final String f11075n;

    public n(Class<?> cls, String str) {
        l.e(cls, "jClass");
        l.e(str, "moduleName");
        this.f11074m = cls;
        this.f11075n = str;
    }

    public Class<?> a() {
        return this.f11074m;
    }

    public boolean equals(Object obj) {
        return (obj instanceof n) && l.a(a(), ((n) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString() + " (Kotlin reflection is not available)";
    }
}
