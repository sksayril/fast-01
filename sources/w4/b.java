package w4;

import w4.f;

final class b extends f {

    /* renamed from: a  reason: collision with root package name */
    private final String f12958a;

    /* renamed from: b  reason: collision with root package name */
    private final long f12959b;

    /* renamed from: c  reason: collision with root package name */
    private final f.b f12960c;

    /* renamed from: w4.b$b  reason: collision with other inner class name */
    static final class C0220b extends f.a {

        /* renamed from: a  reason: collision with root package name */
        private String f12961a;

        /* renamed from: b  reason: collision with root package name */
        private Long f12962b;

        /* renamed from: c  reason: collision with root package name */
        private f.b f12963c;

        C0220b() {
        }

        public f a() {
            String str = "";
            if (this.f12962b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f12961a, this.f12962b.longValue(), this.f12963c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f.a b(f.b bVar) {
            this.f12963c = bVar;
            return this;
        }

        public f.a c(String str) {
            this.f12961a = str;
            return this;
        }

        public f.a d(long j10) {
            this.f12962b = Long.valueOf(j10);
            return this;
        }
    }

    private b(String str, long j10, f.b bVar) {
        this.f12958a = str;
        this.f12959b = j10;
        this.f12960c = bVar;
    }

    public f.b b() {
        return this.f12960c;
    }

    public String c() {
        return this.f12958a;
    }

    public long d() {
        return this.f12959b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        String str = this.f12958a;
        if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
            if (this.f12959b == fVar.d()) {
                f.b bVar = this.f12960c;
                f.b b10 = fVar.b();
                if (bVar == null) {
                    if (b10 == null) {
                        return true;
                    }
                } else if (bVar.equals(b10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f12958a;
        int i10 = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f12959b;
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        f.b bVar = this.f12960c;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return i11 ^ i10;
    }

    public String toString() {
        return "TokenResult{token=" + this.f12958a + ", tokenExpirationTimestamp=" + this.f12959b + ", responseCode=" + this.f12960c + "}";
    }
}
