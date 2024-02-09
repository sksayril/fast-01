package w1;

import java.util.Map;
import java.util.Objects;
import n1.d;
import w1.f;
import z1.a;

final class b extends f {

    /* renamed from: a  reason: collision with root package name */
    private final a f12755a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<d, f.b> f12756b;

    b(a aVar, Map<d, f.b> map) {
        Objects.requireNonNull(aVar, "Null clock");
        this.f12755a = aVar;
        Objects.requireNonNull(map, "Null values");
        this.f12756b = map;
    }

    /* access modifiers changed from: package-private */
    public a e() {
        return this.f12755a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f12755a.equals(fVar.e()) && this.f12756b.equals(fVar.h());
    }

    /* access modifiers changed from: package-private */
    public Map<d, f.b> h() {
        return this.f12756b;
    }

    public int hashCode() {
        return ((this.f12755a.hashCode() ^ 1000003) * 1000003) ^ this.f12756b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f12755a + ", values=" + this.f12756b + "}";
    }
}
