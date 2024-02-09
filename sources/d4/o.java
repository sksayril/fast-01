package d4;

import d4.f0;
import java.util.Objects;

final class o extends f0.e.d.a.b.C0110a {

    /* renamed from: a  reason: collision with root package name */
    private final long f8100a;

    /* renamed from: b  reason: collision with root package name */
    private final long f8101b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8102c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8103d;

    static final class b extends f0.e.d.a.b.C0110a.C0111a {

        /* renamed from: a  reason: collision with root package name */
        private Long f8104a;

        /* renamed from: b  reason: collision with root package name */
        private Long f8105b;

        /* renamed from: c  reason: collision with root package name */
        private String f8106c;

        /* renamed from: d  reason: collision with root package name */
        private String f8107d;

        b() {
        }

        public f0.e.d.a.b.C0110a a() {
            String str = "";
            if (this.f8104a == null) {
                str = str + " baseAddress";
            }
            if (this.f8105b == null) {
                str = str + " size";
            }
            if (this.f8106c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new o(this.f8104a.longValue(), this.f8105b.longValue(), this.f8106c, this.f8107d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f0.e.d.a.b.C0110a.C0111a b(long j10) {
            this.f8104a = Long.valueOf(j10);
            return this;
        }

        public f0.e.d.a.b.C0110a.C0111a c(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f8106c = str;
            return this;
        }

        public f0.e.d.a.b.C0110a.C0111a d(long j10) {
            this.f8105b = Long.valueOf(j10);
            return this;
        }

        public f0.e.d.a.b.C0110a.C0111a e(String str) {
            this.f8107d = str;
            return this;
        }
    }

    private o(long j10, long j11, String str, String str2) {
        this.f8100a = j10;
        this.f8101b = j11;
        this.f8102c = str;
        this.f8103d = str2;
    }

    public long b() {
        return this.f8100a;
    }

    public String c() {
        return this.f8102c;
    }

    public long d() {
        return this.f8101b;
    }

    public String e() {
        return this.f8103d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a.b.C0110a)) {
            return false;
        }
        f0.e.d.a.b.C0110a aVar = (f0.e.d.a.b.C0110a) obj;
        if (this.f8100a == aVar.b() && this.f8101b == aVar.d() && this.f8102c.equals(aVar.c())) {
            String str = this.f8103d;
            String e10 = aVar.e();
            if (str == null) {
                if (e10 == null) {
                    return true;
                }
            } else if (str.equals(e10)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f8100a;
        long j11 = this.f8101b;
        int hashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f8102c.hashCode()) * 1000003;
        String str = this.f8103d;
        return (str == null ? 0 : str.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f8100a + ", size=" + this.f8101b + ", name=" + this.f8102c + ", uuid=" + this.f8103d + "}";
    }
}
