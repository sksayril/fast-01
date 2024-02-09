package androidx.core.util;

public class g<T> extends f<T> {

    /* renamed from: c  reason: collision with root package name */
    private final Object f1675c = new Object();

    public g(int i10) {
        super(i10);
    }

    public boolean a(T t9) {
        boolean a10;
        synchronized (this.f1675c) {
            a10 = super.a(t9);
        }
        return a10;
    }

    public T b() {
        T b10;
        synchronized (this.f1675c) {
            b10 = super.b();
        }
        return b10;
    }
}
