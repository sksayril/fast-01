package w1;

import java.util.Objects;
import java.util.Set;
import w1.f;

final class c extends f.b {

    /* renamed from: a  reason: collision with root package name */
    private final long f12757a;

    /* renamed from: b  reason: collision with root package name */
    private final long f12758b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<f.c> f12759c;

    static final class b extends f.b.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f12760a;

        /* renamed from: b  reason: collision with root package name */
        private Long f12761b;

        /* renamed from: c  reason: collision with root package name */
        private Set<f.c> f12762c;

        b() {
        }

        public f.b a() {
            String str = "";
            if (this.f12760a == null) {
                str = str + " delta";
            }
            if (this.f12761b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f12762c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new c(this.f12760a.longValue(), this.f12761b.longValue(), this.f12762c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f.b.a b(long j10) {
            this.f12760a = Long.valueOf(j10);
            return this;
        }

        public f.b.a c(Set<f.c> set) {
            Objects.requireNonNull(set, "Null flags");
            this.f12762c = set;
            return this;
        }

        public f.b.a d(long j10) {
            this.f12761b = Long.valueOf(j10);
            return this;
        }
    }

    private c(long j10, long j11, Set<f.c> set) {
        this.f12757a = j10;
        this.f12758b = j11;
        this.f12759c = set;
    }

    /* access modifiers changed from: package-private */
    public long b() {
        return this.f12757a;
    }

    /* access modifiers changed from: package-private */
    public Set<f.c> c() {
        return this.f12759c;
    }

    /* access modifiers changed from: package-private */
    public long d() {
        return this.f12758b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.b)) {
            return false;
        }
        f.b bVar = (f.b) obj;
        return this.f12757a == bVar.b() && this.f12758b == bVar.d() && this.f12759c.equals(bVar.c());
    }

    public int hashCode() {
        long j10 = this.f12757a;
        long j11 = this.f12758b;
        return this.f12759c.hashCode() ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f12757a + ", maxAllowedDelay=" + this.f12758b + ", flags=" + this.f12759c + "}";
    }
}
