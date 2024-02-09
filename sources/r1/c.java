package r1;

public final class c<T> implements b<T> {

    /* renamed from: b  reason: collision with root package name */
    private static final c<Object> f12075b = new c<>((Object) null);

    /* renamed from: a  reason: collision with root package name */
    private final T f12076a;

    private c(T t9) {
        this.f12076a = t9;
    }

    public static <T> b<T> a(T t9) {
        return new c(d.c(t9, "instance cannot be null"));
    }

    public T get() {
        return this.f12076a;
    }
}
