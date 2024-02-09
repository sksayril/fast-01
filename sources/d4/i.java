package d4;

import d4.f0;
import java.util.Objects;

final class i extends f0.e.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f8031a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8032b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8033c;

    /* renamed from: d  reason: collision with root package name */
    private final f0.e.a.b f8034d;

    /* renamed from: e  reason: collision with root package name */
    private final String f8035e;

    /* renamed from: f  reason: collision with root package name */
    private final String f8036f;

    /* renamed from: g  reason: collision with root package name */
    private final String f8037g;

    static final class b extends f0.e.a.C0108a {

        /* renamed from: a  reason: collision with root package name */
        private String f8038a;

        /* renamed from: b  reason: collision with root package name */
        private String f8039b;

        /* renamed from: c  reason: collision with root package name */
        private String f8040c;

        /* renamed from: d  reason: collision with root package name */
        private f0.e.a.b f8041d;

        /* renamed from: e  reason: collision with root package name */
        private String f8042e;

        /* renamed from: f  reason: collision with root package name */
        private String f8043f;

        /* renamed from: g  reason: collision with root package name */
        private String f8044g;

        b() {
        }

        public f0.e.a a() {
            String str = "";
            if (this.f8038a == null) {
                str = str + " identifier";
            }
            if (this.f8039b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new i(this.f8038a, this.f8039b, this.f8040c, this.f8041d, this.f8042e, this.f8043f, this.f8044g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f0.e.a.C0108a b(String str) {
            this.f8043f = str;
            return this;
        }

        public f0.e.a.C0108a c(String str) {
            this.f8044g = str;
            return this;
        }

        public f0.e.a.C0108a d(String str) {
            this.f8040c = str;
            return this;
        }

        public f0.e.a.C0108a e(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f8038a = str;
            return this;
        }

        public f0.e.a.C0108a f(String str) {
            this.f8042e = str;
            return this;
        }

        public f0.e.a.C0108a g(String str) {
            Objects.requireNonNull(str, "Null version");
            this.f8039b = str;
            return this;
        }
    }

    private i(String str, String str2, String str3, f0.e.a.b bVar, String str4, String str5, String str6) {
        this.f8031a = str;
        this.f8032b = str2;
        this.f8033c = str3;
        this.f8034d = bVar;
        this.f8035e = str4;
        this.f8036f = str5;
        this.f8037g = str6;
    }

    public String b() {
        return this.f8036f;
    }

    public String c() {
        return this.f8037g;
    }

    public String d() {
        return this.f8033c;
    }

    public String e() {
        return this.f8031a;
    }

    public boolean equals(Object obj) {
        String str;
        f0.e.a.b bVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.a)) {
            return false;
        }
        f0.e.a aVar = (f0.e.a) obj;
        if (this.f8031a.equals(aVar.e()) && this.f8032b.equals(aVar.h()) && ((str = this.f8033c) != null ? str.equals(aVar.d()) : aVar.d() == null) && ((bVar = this.f8034d) != null ? bVar.equals(aVar.g()) : aVar.g() == null) && ((str2 = this.f8035e) != null ? str2.equals(aVar.f()) : aVar.f() == null) && ((str3 = this.f8036f) != null ? str3.equals(aVar.b()) : aVar.b() == null)) {
            String str4 = this.f8037g;
            String c10 = aVar.c();
            if (str4 == null) {
                if (c10 == null) {
                    return true;
                }
            } else if (str4.equals(c10)) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.f8035e;
    }

    public f0.e.a.b g() {
        return this.f8034d;
    }

    public String h() {
        return this.f8032b;
    }

    public int hashCode() {
        int hashCode = (((this.f8031a.hashCode() ^ 1000003) * 1000003) ^ this.f8032b.hashCode()) * 1000003;
        String str = this.f8033c;
        int i10 = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        f0.e.a.b bVar = this.f8034d;
        int hashCode3 = (hashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.f8035e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f8036f;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f8037g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return hashCode5 ^ i10;
    }

    public String toString() {
        return "Application{identifier=" + this.f8031a + ", version=" + this.f8032b + ", displayVersion=" + this.f8033c + ", organization=" + this.f8034d + ", installationUuid=" + this.f8035e + ", developmentPlatform=" + this.f8036f + ", developmentPlatformVersion=" + this.f8037g + "}";
    }
}
