package d4;

import d4.f0;
import java.util.Objects;

final class l extends f0.e.d {

    /* renamed from: a  reason: collision with root package name */
    private final long f8064a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8065b;

    /* renamed from: c  reason: collision with root package name */
    private final f0.e.d.a f8066c;

    /* renamed from: d  reason: collision with root package name */
    private final f0.e.d.c f8067d;

    /* renamed from: e  reason: collision with root package name */
    private final f0.e.d.C0121d f8068e;

    /* renamed from: f  reason: collision with root package name */
    private final f0.e.d.f f8069f;

    static final class b extends f0.e.d.b {

        /* renamed from: a  reason: collision with root package name */
        private Long f8070a;

        /* renamed from: b  reason: collision with root package name */
        private String f8071b;

        /* renamed from: c  reason: collision with root package name */
        private f0.e.d.a f8072c;

        /* renamed from: d  reason: collision with root package name */
        private f0.e.d.c f8073d;

        /* renamed from: e  reason: collision with root package name */
        private f0.e.d.C0121d f8074e;

        /* renamed from: f  reason: collision with root package name */
        private f0.e.d.f f8075f;

        b() {
        }

        private b(f0.e.d dVar) {
            this.f8070a = Long.valueOf(dVar.f());
            this.f8071b = dVar.g();
            this.f8072c = dVar.b();
            this.f8073d = dVar.c();
            this.f8074e = dVar.d();
            this.f8075f = dVar.e();
        }

        public f0.e.d a() {
            String str = "";
            if (this.f8070a == null) {
                str = str + " timestamp";
            }
            if (this.f8071b == null) {
                str = str + " type";
            }
            if (this.f8072c == null) {
                str = str + " app";
            }
            if (this.f8073d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new l(this.f8070a.longValue(), this.f8071b, this.f8072c, this.f8073d, this.f8074e, this.f8075f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f0.e.d.b b(f0.e.d.a aVar) {
            Objects.requireNonNull(aVar, "Null app");
            this.f8072c = aVar;
            return this;
        }

        public f0.e.d.b c(f0.e.d.c cVar) {
            Objects.requireNonNull(cVar, "Null device");
            this.f8073d = cVar;
            return this;
        }

        public f0.e.d.b d(f0.e.d.C0121d dVar) {
            this.f8074e = dVar;
            return this;
        }

        public f0.e.d.b e(f0.e.d.f fVar) {
            this.f8075f = fVar;
            return this;
        }

        public f0.e.d.b f(long j10) {
            this.f8070a = Long.valueOf(j10);
            return this;
        }

        public f0.e.d.b g(String str) {
            Objects.requireNonNull(str, "Null type");
            this.f8071b = str;
            return this;
        }
    }

    private l(long j10, String str, f0.e.d.a aVar, f0.e.d.c cVar, f0.e.d.C0121d dVar, f0.e.d.f fVar) {
        this.f8064a = j10;
        this.f8065b = str;
        this.f8066c = aVar;
        this.f8067d = cVar;
        this.f8068e = dVar;
        this.f8069f = fVar;
    }

    public f0.e.d.a b() {
        return this.f8066c;
    }

    public f0.e.d.c c() {
        return this.f8067d;
    }

    public f0.e.d.C0121d d() {
        return this.f8068e;
    }

    public f0.e.d.f e() {
        return this.f8069f;
    }

    public boolean equals(Object obj) {
        f0.e.d.C0121d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d)) {
            return false;
        }
        f0.e.d dVar2 = (f0.e.d) obj;
        if (this.f8064a == dVar2.f() && this.f8065b.equals(dVar2.g()) && this.f8066c.equals(dVar2.b()) && this.f8067d.equals(dVar2.c()) && ((dVar = this.f8068e) != null ? dVar.equals(dVar2.d()) : dVar2.d() == null)) {
            f0.e.d.f fVar = this.f8069f;
            f0.e.d.f e10 = dVar2.e();
            if (fVar == null) {
                if (e10 == null) {
                    return true;
                }
            } else if (fVar.equals(e10)) {
                return true;
            }
        }
        return false;
    }

    public long f() {
        return this.f8064a;
    }

    public String g() {
        return this.f8065b;
    }

    public f0.e.d.b h() {
        return new b(this);
    }

    public int hashCode() {
        long j10 = this.f8064a;
        int hashCode = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f8065b.hashCode()) * 1000003) ^ this.f8066c.hashCode()) * 1000003) ^ this.f8067d.hashCode()) * 1000003;
        f0.e.d.C0121d dVar = this.f8068e;
        int i10 = 0;
        int hashCode2 = (hashCode ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        f0.e.d.f fVar = this.f8069f;
        if (fVar != null) {
            i10 = fVar.hashCode();
        }
        return hashCode2 ^ i10;
    }

    public String toString() {
        return "Event{timestamp=" + this.f8064a + ", type=" + this.f8065b + ", app=" + this.f8066c + ", device=" + this.f8067d + ", log=" + this.f8068e + ", rollouts=" + this.f8069f + "}";
    }
}
