package w4;

import w4.d;

final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private final String f12948a;

    /* renamed from: b  reason: collision with root package name */
    private final String f12949b;

    /* renamed from: c  reason: collision with root package name */
    private final String f12950c;

    /* renamed from: d  reason: collision with root package name */
    private final f f12951d;

    /* renamed from: e  reason: collision with root package name */
    private final d.b f12952e;

    static final class b extends d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f12953a;

        /* renamed from: b  reason: collision with root package name */
        private String f12954b;

        /* renamed from: c  reason: collision with root package name */
        private String f12955c;

        /* renamed from: d  reason: collision with root package name */
        private f f12956d;

        /* renamed from: e  reason: collision with root package name */
        private d.b f12957e;

        b() {
        }

        public d a() {
            return new a(this.f12953a, this.f12954b, this.f12955c, this.f12956d, this.f12957e);
        }

        public d.a b(f fVar) {
            this.f12956d = fVar;
            return this;
        }

        public d.a c(String str) {
            this.f12954b = str;
            return this;
        }

        public d.a d(String str) {
            this.f12955c = str;
            return this;
        }

        public d.a e(d.b bVar) {
            this.f12957e = bVar;
            return this;
        }

        public d.a f(String str) {
            this.f12953a = str;
            return this;
        }
    }

    private a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f12948a = str;
        this.f12949b = str2;
        this.f12950c = str3;
        this.f12951d = fVar;
        this.f12952e = bVar;
    }

    public f b() {
        return this.f12951d;
    }

    public String c() {
        return this.f12949b;
    }

    public String d() {
        return this.f12950c;
    }

    public d.b e() {
        return this.f12952e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f12948a;
        if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
            String str2 = this.f12949b;
            if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                String str3 = this.f12950c;
                if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                    f fVar = this.f12951d;
                    if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                        d.b bVar = this.f12952e;
                        d.b e10 = dVar.e();
                        if (bVar == null) {
                            if (e10 == null) {
                                return true;
                            }
                        } else if (bVar.equals(e10)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public String f() {
        return this.f12948a;
    }

    public int hashCode() {
        String str = this.f12948a;
        int i10 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f12949b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f12950c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f12951d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f12952e;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return hashCode4 ^ i10;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f12948a + ", fid=" + this.f12949b + ", refreshToken=" + this.f12950c + ", authToken=" + this.f12951d + ", responseCode=" + this.f12952e + "}";
    }
}
