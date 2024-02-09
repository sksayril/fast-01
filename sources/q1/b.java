package q1;

import java.util.Objects;
import q1.g;

final class b extends g {

    /* renamed from: a  reason: collision with root package name */
    private final g.a f11962a;

    /* renamed from: b  reason: collision with root package name */
    private final long f11963b;

    b(g.a aVar, long j10) {
        Objects.requireNonNull(aVar, "Null status");
        this.f11962a = aVar;
        this.f11963b = j10;
    }

    public long b() {
        return this.f11963b;
    }

    public g.a c() {
        return this.f11962a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f11962a.equals(gVar.c()) && this.f11963b == gVar.b();
    }

    public int hashCode() {
        long j10 = this.f11963b;
        return ((this.f11962a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f11962a + ", nextRequestWaitMillis=" + this.f11963b + "}";
    }
}
