package r4;

import java.util.List;
import java.util.Objects;

final class a extends l {

    /* renamed from: a  reason: collision with root package name */
    private final String f12085a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f12086b;

    a(String str, List<String> list) {
        Objects.requireNonNull(str, "Null userAgent");
        this.f12085a = str;
        Objects.requireNonNull(list, "Null usedDates");
        this.f12086b = list;
    }

    public List<String> b() {
        return this.f12086b;
    }

    public String c() {
        return this.f12085a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f12085a.equals(lVar.c()) && this.f12086b.equals(lVar.b());
    }

    public int hashCode() {
        return ((this.f12085a.hashCode() ^ 1000003) * 1000003) ^ this.f12086b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f12085a + ", usedDates=" + this.f12086b + "}";
    }
}
