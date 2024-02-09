package n1;

import java.util.Objects;

final class a<T> extends c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f11286a;

    /* renamed from: b  reason: collision with root package name */
    private final T f11287b;

    /* renamed from: c  reason: collision with root package name */
    private final d f11288c;

    a(Integer num, T t9, d dVar) {
        this.f11286a = num;
        Objects.requireNonNull(t9, "Null payload");
        this.f11287b = t9;
        Objects.requireNonNull(dVar, "Null priority");
        this.f11288c = dVar;
    }

    public Integer a() {
        return this.f11286a;
    }

    public T b() {
        return this.f11287b;
    }

    public d c() {
        return this.f11288c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Integer num = this.f11286a;
        if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
            return this.f11287b.equals(cVar.b()) && this.f11288c.equals(cVar.c());
        }
    }

    public int hashCode() {
        Integer num = this.f11286a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f11287b.hashCode()) * 1000003) ^ this.f11288c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f11286a + ", payload=" + this.f11287b + ", priority=" + this.f11288c + "}";
    }
}
