package d4;

import d4.f0;
import java.util.Objects;

final class q extends f0.e.d.a.b.C0114d {

    /* renamed from: a  reason: collision with root package name */
    private final String f8118a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8119b;

    /* renamed from: c  reason: collision with root package name */
    private final long f8120c;

    static final class b extends f0.e.d.a.b.C0114d.C0115a {

        /* renamed from: a  reason: collision with root package name */
        private String f8121a;

        /* renamed from: b  reason: collision with root package name */
        private String f8122b;

        /* renamed from: c  reason: collision with root package name */
        private Long f8123c;

        b() {
        }

        public f0.e.d.a.b.C0114d a() {
            String str = "";
            if (this.f8121a == null) {
                str = str + " name";
            }
            if (this.f8122b == null) {
                str = str + " code";
            }
            if (this.f8123c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new q(this.f8121a, this.f8122b, this.f8123c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f0.e.d.a.b.C0114d.C0115a b(long j10) {
            this.f8123c = Long.valueOf(j10);
            return this;
        }

        public f0.e.d.a.b.C0114d.C0115a c(String str) {
            Objects.requireNonNull(str, "Null code");
            this.f8122b = str;
            return this;
        }

        public f0.e.d.a.b.C0114d.C0115a d(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f8121a = str;
            return this;
        }
    }

    private q(String str, String str2, long j10) {
        this.f8118a = str;
        this.f8119b = str2;
        this.f8120c = j10;
    }

    public long b() {
        return this.f8120c;
    }

    public String c() {
        return this.f8119b;
    }

    public String d() {
        return this.f8118a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a.b.C0114d)) {
            return false;
        }
        f0.e.d.a.b.C0114d dVar = (f0.e.d.a.b.C0114d) obj;
        return this.f8118a.equals(dVar.d()) && this.f8119b.equals(dVar.c()) && this.f8120c == dVar.b();
    }

    public int hashCode() {
        long j10 = this.f8120c;
        return ((((this.f8118a.hashCode() ^ 1000003) * 1000003) ^ this.f8119b.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f8118a + ", code=" + this.f8119b + ", address=" + this.f8120c + "}";
    }
}
