package t3;

import android.content.Context;
import android.text.TextUtils;
import h2.o;
import h2.p;
import h2.s;
import l2.m;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final String f12426a;

    /* renamed from: b  reason: collision with root package name */
    private final String f12427b;

    /* renamed from: c  reason: collision with root package name */
    private final String f12428c;

    /* renamed from: d  reason: collision with root package name */
    private final String f12429d;

    /* renamed from: e  reason: collision with root package name */
    private final String f12430e;

    /* renamed from: f  reason: collision with root package name */
    private final String f12431f;

    /* renamed from: g  reason: collision with root package name */
    private final String f12432g;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private String f12433a;

        /* renamed from: b  reason: collision with root package name */
        private String f12434b;

        /* renamed from: c  reason: collision with root package name */
        private String f12435c;

        /* renamed from: d  reason: collision with root package name */
        private String f12436d;

        /* renamed from: e  reason: collision with root package name */
        private String f12437e;

        /* renamed from: f  reason: collision with root package name */
        private String f12438f;

        /* renamed from: g  reason: collision with root package name */
        private String f12439g;

        public n a() {
            return new n(this.f12434b, this.f12433a, this.f12435c, this.f12436d, this.f12437e, this.f12438f, this.f12439g);
        }

        public b b(String str) {
            this.f12433a = p.g(str, "ApiKey must be set.");
            return this;
        }

        public b c(String str) {
            this.f12434b = p.g(str, "ApplicationId must be set.");
            return this;
        }

        public b d(String str) {
            this.f12435c = str;
            return this;
        }

        public b e(String str) {
            this.f12436d = str;
            return this;
        }

        public b f(String str) {
            this.f12437e = str;
            return this;
        }

        public b g(String str) {
            this.f12439g = str;
            return this;
        }

        public b h(String str) {
            this.f12438f = str;
            return this;
        }
    }

    private n(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        p.n(!m.a(str), "ApplicationId must be set.");
        this.f12427b = str;
        this.f12426a = str2;
        this.f12428c = str3;
        this.f12429d = str4;
        this.f12430e = str5;
        this.f12431f = str6;
        this.f12432g = str7;
    }

    public static n a(Context context) {
        s sVar = new s(context);
        String a10 = sVar.a("google_app_id");
        if (TextUtils.isEmpty(a10)) {
            return null;
        }
        return new n(a10, sVar.a("google_api_key"), sVar.a("firebase_database_url"), sVar.a("ga_trackingId"), sVar.a("gcm_defaultSenderId"), sVar.a("google_storage_bucket"), sVar.a("project_id"));
    }

    public String b() {
        return this.f12426a;
    }

    public String c() {
        return this.f12427b;
    }

    public String d() {
        return this.f12428c;
    }

    public String e() {
        return this.f12429d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return o.a(this.f12427b, nVar.f12427b) && o.a(this.f12426a, nVar.f12426a) && o.a(this.f12428c, nVar.f12428c) && o.a(this.f12429d, nVar.f12429d) && o.a(this.f12430e, nVar.f12430e) && o.a(this.f12431f, nVar.f12431f) && o.a(this.f12432g, nVar.f12432g);
    }

    public String f() {
        return this.f12430e;
    }

    public String g() {
        return this.f12432g;
    }

    public String h() {
        return this.f12431f;
    }

    public int hashCode() {
        return o.b(this.f12427b, this.f12426a, this.f12428c, this.f12429d, this.f12430e, this.f12431f, this.f12432g);
    }

    public String toString() {
        return o.c(this).a("applicationId", this.f12427b).a("apiKey", this.f12426a).a("databaseUrl", this.f12428c).a("gcmSenderId", this.f12430e).a("storageBucket", this.f12431f).a("projectId", this.f12432g).toString();
    }
}
