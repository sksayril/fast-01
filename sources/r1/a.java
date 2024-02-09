package r1;

public final class a<T> implements f8.a<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f12072c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile f8.a<T> f12073a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f12074b = f12072c;

    private a(f8.a<T> aVar) {
        this.f12073a = aVar;
    }

    public static <P extends f8.a<T>, T> f8.a<T> a(P p10) {
        d.b(p10);
        return p10 instanceof a ? p10 : new a(p10);
    }

    public static Object b(Object obj, Object obj2) {
        if (!(obj != f12072c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public T get() {
        T t9 = this.f12074b;
        T t10 = f12072c;
        if (t9 == t10) {
            synchronized (this) {
                t9 = this.f12074b;
                if (t9 == t10) {
                    t9 = this.f12073a.get();
                    this.f12074b = b(this.f12074b, t9);
                    this.f12073a = null;
                }
            }
        }
        return t9;
    }
}
