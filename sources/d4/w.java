package d4;

import d4.f0;
import java.util.Objects;

final class w extends f0.e.d.C0122e {

    /* renamed from: a  reason: collision with root package name */
    private final f0.e.d.C0122e.b f8162a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8163b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8164c;

    /* renamed from: d  reason: collision with root package name */
    private final long f8165d;

    static final class b extends f0.e.d.C0122e.a {

        /* renamed from: a  reason: collision with root package name */
        private f0.e.d.C0122e.b f8166a;

        /* renamed from: b  reason: collision with root package name */
        private String f8167b;

        /* renamed from: c  reason: collision with root package name */
        private String f8168c;

        /* renamed from: d  reason: collision with root package name */
        private Long f8169d;

        b() {
        }

        public f0.e.d.C0122e a() {
            String str = "";
            if (this.f8166a == null) {
                str = str + " rolloutVariant";
            }
            if (this.f8167b == null) {
                str = str + " parameterKey";
            }
            if (this.f8168c == null) {
                str = str + " parameterValue";
            }
            if (this.f8169d == null) {
                str = str + " templateVersion";
            }
            if (str.isEmpty()) {
                return new w(this.f8166a, this.f8167b, this.f8168c, this.f8169d.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f0.e.d.C0122e.a b(String str) {
            Objects.requireNonNull(str, "Null parameterKey");
            this.f8167b = str;
            return this;
        }

        public f0.e.d.C0122e.a c(String str) {
            Objects.requireNonNull(str, "Null parameterValue");
            this.f8168c = str;
            return this;
        }

        public f0.e.d.C0122e.a d(f0.e.d.C0122e.b bVar) {
            Objects.requireNonNull(bVar, "Null rolloutVariant");
            this.f8166a = bVar;
            return this;
        }

        public f0.e.d.C0122e.a e(long j10) {
            this.f8169d = Long.valueOf(j10);
            return this;
        }
    }

    private w(f0.e.d.C0122e.b bVar, String str, String str2, long j10) {
        this.f8162a = bVar;
        this.f8163b = str;
        this.f8164c = str2;
        this.f8165d = j10;
    }

    public String b() {
        return this.f8163b;
    }

    public String c() {
        return this.f8164c;
    }

    public f0.e.d.C0122e.b d() {
        return this.f8162a;
    }

    public long e() {
        return this.f8165d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.C0122e)) {
            return false;
        }
        f0.e.d.C0122e eVar = (f0.e.d.C0122e) obj;
        return this.f8162a.equals(eVar.d()) && this.f8163b.equals(eVar.b()) && this.f8164c.equals(eVar.c()) && this.f8165d == eVar.e();
    }

    public int hashCode() {
        long j10 = this.f8165d;
        return ((((((this.f8162a.hashCode() ^ 1000003) * 1000003) ^ this.f8163b.hashCode()) * 1000003) ^ this.f8164c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f8162a + ", parameterKey=" + this.f8163b + ", parameterValue=" + this.f8164c + ", templateVersion=" + this.f8165d + "}";
    }
}
