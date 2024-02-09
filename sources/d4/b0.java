package d4;

import d4.g0;
import java.util.Objects;

final class b0 extends g0 {

    /* renamed from: a  reason: collision with root package name */
    private final g0.a f7949a;

    /* renamed from: b  reason: collision with root package name */
    private final g0.c f7950b;

    /* renamed from: c  reason: collision with root package name */
    private final g0.b f7951c;

    b0(g0.a aVar, g0.c cVar, g0.b bVar) {
        Objects.requireNonNull(aVar, "Null appData");
        this.f7949a = aVar;
        Objects.requireNonNull(cVar, "Null osData");
        this.f7950b = cVar;
        Objects.requireNonNull(bVar, "Null deviceData");
        this.f7951c = bVar;
    }

    public g0.a a() {
        return this.f7949a;
    }

    public g0.b c() {
        return this.f7951c;
    }

    public g0.c d() {
        return this.f7950b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f7949a.equals(g0Var.a()) && this.f7950b.equals(g0Var.d()) && this.f7951c.equals(g0Var.c());
    }

    public int hashCode() {
        return ((((this.f7949a.hashCode() ^ 1000003) * 1000003) ^ this.f7950b.hashCode()) * 1000003) ^ this.f7951c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f7949a + ", osData=" + this.f7950b + ", deviceData=" + this.f7951c + "}";
    }
}
