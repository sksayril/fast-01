package o1;

final class h extends n {

    /* renamed from: a  reason: collision with root package name */
    private final long f11576a;

    h(long j10) {
        this.f11576a = j10;
    }

    public long c() {
        return this.f11576a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof n) && this.f11576a == ((n) obj).c();
    }

    public int hashCode() {
        long j10 = this.f11576a;
        return 1000003 ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f11576a + "}";
    }
}
