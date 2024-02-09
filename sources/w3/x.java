package w3;

import s4.b;

public class x<T> implements b<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f12943c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile Object f12944a = f12943c;

    /* renamed from: b  reason: collision with root package name */
    private volatile b<T> f12945b;

    public x(b<T> bVar) {
        this.f12945b = bVar;
    }

    public T get() {
        T t9 = this.f12944a;
        T t10 = f12943c;
        if (t9 == t10) {
            synchronized (this) {
                t9 = this.f12944a;
                if (t9 == t10) {
                    t9 = this.f12945b.get();
                    this.f12944a = t9;
                    this.f12945b = null;
                }
            }
        }
        return t9;
    }
}
