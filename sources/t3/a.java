package t3;

final class a extends o {

    /* renamed from: a  reason: collision with root package name */
    private final long f12399a;

    /* renamed from: b  reason: collision with root package name */
    private final long f12400b;

    /* renamed from: c  reason: collision with root package name */
    private final long f12401c;

    a(long j10, long j11, long j12) {
        this.f12399a = j10;
        this.f12400b = j11;
        this.f12401c = j12;
    }

    public long b() {
        return this.f12400b;
    }

    public long c() {
        return this.f12399a;
    }

    public long d() {
        return this.f12401c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f12399a == oVar.c() && this.f12400b == oVar.b() && this.f12401c == oVar.d();
    }

    public int hashCode() {
        long j10 = this.f12399a;
        long j11 = this.f12400b;
        long j12 = this.f12401c;
        return ((int) ((j12 >>> 32) ^ j12)) ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f12399a + ", elapsedRealtime=" + this.f12400b + ", uptimeMillis=" + this.f12401c + "}";
    }
}
