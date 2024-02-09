package androidx.core.util;

public class d<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public final F f1671a;

    /* renamed from: b  reason: collision with root package name */
    public final S f1672b;

    public d(F f10, S s9) {
        this.f1671a = f10;
        this.f1672b = s9;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return c.a(dVar.f1671a, this.f1671a) && c.a(dVar.f1672b, this.f1672b);
    }

    public int hashCode() {
        F f10 = this.f1671a;
        int i10 = 0;
        int hashCode = f10 == null ? 0 : f10.hashCode();
        S s9 = this.f1672b;
        if (s9 != null) {
            i10 = s9.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return "Pair{" + this.f1671a + " " + this.f1672b + "}";
    }
}
