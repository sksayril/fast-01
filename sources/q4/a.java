package q4;

import w3.e0;

public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<T> f11985a;

    /* renamed from: b  reason: collision with root package name */
    private final T f11986b;

    public a(Class<T> cls, T t9) {
        this.f11985a = (Class) e0.b(cls);
        this.f11986b = e0.b(t9);
    }

    public T a() {
        return this.f11986b;
    }

    public Class<T> b() {
        return this.f11985a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", new Object[]{this.f11985a, this.f11986b});
    }
}
