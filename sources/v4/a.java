package v4;

import java.util.Objects;
import v4.c;
import v4.d;

final class a extends d {

    /* renamed from: b  reason: collision with root package name */
    private final String f12709b;

    /* renamed from: c  reason: collision with root package name */
    private final c.a f12710c;

    /* renamed from: d  reason: collision with root package name */
    private final String f12711d;

    /* renamed from: e  reason: collision with root package name */
    private final String f12712e;

    /* renamed from: f  reason: collision with root package name */
    private final long f12713f;

    /* renamed from: g  reason: collision with root package name */
    private final long f12714g;

    /* renamed from: h  reason: collision with root package name */
    private final String f12715h;

    static final class b extends d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f12716a;

        /* renamed from: b  reason: collision with root package name */
        private c.a f12717b;

        /* renamed from: c  reason: collision with root package name */
        private String f12718c;

        /* renamed from: d  reason: collision with root package name */
        private String f12719d;

        /* renamed from: e  reason: collision with root package name */
        private Long f12720e;

        /* renamed from: f  reason: collision with root package name */
        private Long f12721f;

        /* renamed from: g  reason: collision with root package name */
        private String f12722g;

        b() {
        }

        private b(d dVar) {
            this.f12716a = dVar.d();
            this.f12717b = dVar.g();
            this.f12718c = dVar.b();
            this.f12719d = dVar.f();
            this.f12720e = Long.valueOf(dVar.c());
            this.f12721f = Long.valueOf(dVar.h());
            this.f12722g = dVar.e();
        }

        public d a() {
            String str = "";
            if (this.f12717b == null) {
                str = str + " registrationStatus";
            }
            if (this.f12720e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f12721f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f12716a, this.f12717b, this.f12718c, this.f12719d, this.f12720e.longValue(), this.f12721f.longValue(), this.f12722g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public d.a b(String str) {
            this.f12718c = str;
            return this;
        }

        public d.a c(long j10) {
            this.f12720e = Long.valueOf(j10);
            return this;
        }

        public d.a d(String str) {
            this.f12716a = str;
            return this;
        }

        public d.a e(String str) {
            this.f12722g = str;
            return this;
        }

        public d.a f(String str) {
            this.f12719d = str;
            return this;
        }

        public d.a g(c.a aVar) {
            Objects.requireNonNull(aVar, "Null registrationStatus");
            this.f12717b = aVar;
            return this;
        }

        public d.a h(long j10) {
            this.f12721f = Long.valueOf(j10);
            return this;
        }
    }

    private a(String str, c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f12709b = str;
        this.f12710c = aVar;
        this.f12711d = str2;
        this.f12712e = str3;
        this.f12713f = j10;
        this.f12714g = j11;
        this.f12715h = str4;
    }

    public String b() {
        return this.f12711d;
    }

    public long c() {
        return this.f12713f;
    }

    public String d() {
        return this.f12709b;
    }

    public String e() {
        return this.f12715h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f12709b;
        if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
            if (this.f12710c.equals(dVar.g()) && ((str = this.f12711d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f12712e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f12713f == dVar.c() && this.f12714g == dVar.h()) {
                String str4 = this.f12715h;
                String e10 = dVar.e();
                if (str4 == null) {
                    if (e10 == null) {
                        return true;
                    }
                } else if (str4.equals(e10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String f() {
        return this.f12712e;
    }

    public c.a g() {
        return this.f12710c;
    }

    public long h() {
        return this.f12714g;
    }

    public int hashCode() {
        String str = this.f12709b;
        int i10 = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f12710c.hashCode()) * 1000003;
        String str2 = this.f12711d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f12712e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j10 = this.f12713f;
        long j11 = this.f12714g;
        int i11 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f12715h;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i11 ^ i10;
    }

    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f12709b + ", registrationStatus=" + this.f12710c + ", authToken=" + this.f12711d + ", refreshToken=" + this.f12712e + ", expiresInSecs=" + this.f12713f + ", tokenCreationEpochInSecs=" + this.f12714g + ", fisError=" + this.f12715h + "}";
    }
}
