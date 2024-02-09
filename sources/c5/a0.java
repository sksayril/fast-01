package c5;

import kotlin.jvm.internal.l;

public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    private final j f3638a;

    /* renamed from: b  reason: collision with root package name */
    private final f0 f3639b;

    /* renamed from: c  reason: collision with root package name */
    private final b f3640c;

    public a0(j jVar, f0 f0Var, b bVar) {
        l.e(jVar, "eventType");
        l.e(f0Var, "sessionData");
        l.e(bVar, "applicationInfo");
        this.f3638a = jVar;
        this.f3639b = f0Var;
        this.f3640c = bVar;
    }

    public final b a() {
        return this.f3640c;
    }

    public final j b() {
        return this.f3638a;
    }

    public final f0 c() {
        return this.f3639b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f3638a == a0Var.f3638a && l.a(this.f3639b, a0Var.f3639b) && l.a(this.f3640c, a0Var.f3640c);
    }

    public int hashCode() {
        return (((this.f3638a.hashCode() * 31) + this.f3639b.hashCode()) * 31) + this.f3640c.hashCode();
    }

    public String toString() {
        return "SessionEvent(eventType=" + this.f3638a + ", sessionData=" + this.f3639b + ", applicationInfo=" + this.f3640c + ')';
    }
}
