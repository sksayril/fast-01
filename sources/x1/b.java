package x1;

import java.util.Objects;
import p1.i;
import p1.p;

final class b extends k {

    /* renamed from: a  reason: collision with root package name */
    private final long f13064a;

    /* renamed from: b  reason: collision with root package name */
    private final p f13065b;

    /* renamed from: c  reason: collision with root package name */
    private final i f13066c;

    b(long j10, p pVar, i iVar) {
        this.f13064a = j10;
        Objects.requireNonNull(pVar, "Null transportContext");
        this.f13065b = pVar;
        Objects.requireNonNull(iVar, "Null event");
        this.f13066c = iVar;
    }

    public i b() {
        return this.f13066c;
    }

    public long c() {
        return this.f13064a;
    }

    public p d() {
        return this.f13065b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f13064a == kVar.c() && this.f13065b.equals(kVar.d()) && this.f13066c.equals(kVar.b());
    }

    public int hashCode() {
        long j10 = this.f13064a;
        return this.f13066c.hashCode() ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f13065b.hashCode()) * 1000003);
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f13064a + ", transportContext=" + this.f13065b + ", event=" + this.f13066c + "}";
    }
}
