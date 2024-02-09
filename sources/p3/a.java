package p3;

final class a<T> extends g<T> {

    /* renamed from: m  reason: collision with root package name */
    static final a<Object> f11857m = new a<>();

    private a() {
    }

    static <T> g<T> e() {
        return f11857m;
    }

    public T b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public boolean c() {
        return false;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
