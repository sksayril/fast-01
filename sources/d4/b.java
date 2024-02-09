package d4;

import d4.f0;
import java.util.Objects;

final class b extends f0 {

    /* renamed from: b  reason: collision with root package name */
    private final String f7927b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7928c;

    /* renamed from: d  reason: collision with root package name */
    private final int f7929d;

    /* renamed from: e  reason: collision with root package name */
    private final String f7930e;

    /* renamed from: f  reason: collision with root package name */
    private final String f7931f;

    /* renamed from: g  reason: collision with root package name */
    private final String f7932g;

    /* renamed from: h  reason: collision with root package name */
    private final String f7933h;

    /* renamed from: i  reason: collision with root package name */
    private final String f7934i;

    /* renamed from: j  reason: collision with root package name */
    private final f0.e f7935j;

    /* renamed from: k  reason: collision with root package name */
    private final f0.d f7936k;

    /* renamed from: l  reason: collision with root package name */
    private final f0.a f7937l;

    /* renamed from: d4.b$b  reason: collision with other inner class name */
    static final class C0105b extends f0.b {

        /* renamed from: a  reason: collision with root package name */
        private String f7938a;

        /* renamed from: b  reason: collision with root package name */
        private String f7939b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f7940c;

        /* renamed from: d  reason: collision with root package name */
        private String f7941d;

        /* renamed from: e  reason: collision with root package name */
        private String f7942e;

        /* renamed from: f  reason: collision with root package name */
        private String f7943f;

        /* renamed from: g  reason: collision with root package name */
        private String f7944g;

        /* renamed from: h  reason: collision with root package name */
        private String f7945h;

        /* renamed from: i  reason: collision with root package name */
        private f0.e f7946i;

        /* renamed from: j  reason: collision with root package name */
        private f0.d f7947j;

        /* renamed from: k  reason: collision with root package name */
        private f0.a f7948k;

        C0105b() {
        }

        private C0105b(f0 f0Var) {
            this.f7938a = f0Var.l();
            this.f7939b = f0Var.h();
            this.f7940c = Integer.valueOf(f0Var.k());
            this.f7941d = f0Var.i();
            this.f7942e = f0Var.g();
            this.f7943f = f0Var.d();
            this.f7944g = f0Var.e();
            this.f7945h = f0Var.f();
            this.f7946i = f0Var.m();
            this.f7947j = f0Var.j();
            this.f7948k = f0Var.c();
        }

        public f0 a() {
            String str = "";
            if (this.f7938a == null) {
                str = str + " sdkVersion";
            }
            if (this.f7939b == null) {
                str = str + " gmpAppId";
            }
            if (this.f7940c == null) {
                str = str + " platform";
            }
            if (this.f7941d == null) {
                str = str + " installationUuid";
            }
            if (this.f7944g == null) {
                str = str + " buildVersion";
            }
            if (this.f7945h == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new b(this.f7938a, this.f7939b, this.f7940c.intValue(), this.f7941d, this.f7942e, this.f7943f, this.f7944g, this.f7945h, this.f7946i, this.f7947j, this.f7948k);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f0.b b(f0.a aVar) {
            this.f7948k = aVar;
            return this;
        }

        public f0.b c(String str) {
            this.f7943f = str;
            return this;
        }

        public f0.b d(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.f7944g = str;
            return this;
        }

        public f0.b e(String str) {
            Objects.requireNonNull(str, "Null displayVersion");
            this.f7945h = str;
            return this;
        }

        public f0.b f(String str) {
            this.f7942e = str;
            return this;
        }

        public f0.b g(String str) {
            Objects.requireNonNull(str, "Null gmpAppId");
            this.f7939b = str;
            return this;
        }

        public f0.b h(String str) {
            Objects.requireNonNull(str, "Null installationUuid");
            this.f7941d = str;
            return this;
        }

        public f0.b i(f0.d dVar) {
            this.f7947j = dVar;
            return this;
        }

        public f0.b j(int i10) {
            this.f7940c = Integer.valueOf(i10);
            return this;
        }

        public f0.b k(String str) {
            Objects.requireNonNull(str, "Null sdkVersion");
            this.f7938a = str;
            return this;
        }

        public f0.b l(f0.e eVar) {
            this.f7946i = eVar;
            return this;
        }
    }

    private b(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, f0.e eVar, f0.d dVar, f0.a aVar) {
        this.f7927b = str;
        this.f7928c = str2;
        this.f7929d = i10;
        this.f7930e = str3;
        this.f7931f = str4;
        this.f7932g = str5;
        this.f7933h = str6;
        this.f7934i = str7;
        this.f7935j = eVar;
        this.f7936k = dVar;
        this.f7937l = aVar;
    }

    public f0.a c() {
        return this.f7937l;
    }

    public String d() {
        return this.f7932g;
    }

    public String e() {
        return this.f7933h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        f0.e eVar;
        f0.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        if (this.f7927b.equals(f0Var.l()) && this.f7928c.equals(f0Var.h()) && this.f7929d == f0Var.k() && this.f7930e.equals(f0Var.i()) && ((str = this.f7931f) != null ? str.equals(f0Var.g()) : f0Var.g() == null) && ((str2 = this.f7932g) != null ? str2.equals(f0Var.d()) : f0Var.d() == null) && this.f7933h.equals(f0Var.e()) && this.f7934i.equals(f0Var.f()) && ((eVar = this.f7935j) != null ? eVar.equals(f0Var.m()) : f0Var.m() == null) && ((dVar = this.f7936k) != null ? dVar.equals(f0Var.j()) : f0Var.j() == null)) {
            f0.a aVar = this.f7937l;
            f0.a c10 = f0Var.c();
            if (aVar == null) {
                if (c10 == null) {
                    return true;
                }
            } else if (aVar.equals(c10)) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.f7934i;
    }

    public String g() {
        return this.f7931f;
    }

    public String h() {
        return this.f7928c;
    }

    public int hashCode() {
        int hashCode = (((((((this.f7927b.hashCode() ^ 1000003) * 1000003) ^ this.f7928c.hashCode()) * 1000003) ^ this.f7929d) * 1000003) ^ this.f7930e.hashCode()) * 1000003;
        String str = this.f7931f;
        int i10 = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f7932g;
        int hashCode3 = (((((hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.f7933h.hashCode()) * 1000003) ^ this.f7934i.hashCode()) * 1000003;
        f0.e eVar = this.f7935j;
        int hashCode4 = (hashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        f0.d dVar = this.f7936k;
        int hashCode5 = (hashCode4 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        f0.a aVar = this.f7937l;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return hashCode5 ^ i10;
    }

    public String i() {
        return this.f7930e;
    }

    public f0.d j() {
        return this.f7936k;
    }

    public int k() {
        return this.f7929d;
    }

    public String l() {
        return this.f7927b;
    }

    public f0.e m() {
        return this.f7935j;
    }

    /* access modifiers changed from: protected */
    public f0.b n() {
        return new C0105b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f7927b + ", gmpAppId=" + this.f7928c + ", platform=" + this.f7929d + ", installationUuid=" + this.f7930e + ", firebaseInstallationId=" + this.f7931f + ", appQualitySessionId=" + this.f7932g + ", buildVersion=" + this.f7933h + ", displayVersion=" + this.f7934i + ", session=" + this.f7935j + ", ndkPayload=" + this.f7936k + ", appExitInfo=" + this.f7937l + "}";
    }
}
