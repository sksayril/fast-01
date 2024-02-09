package d4;

import d4.f0;

final class u extends f0.e.d.c {

    /* renamed from: a  reason: collision with root package name */
    private final Double f8148a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8149b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f8150c;

    /* renamed from: d  reason: collision with root package name */
    private final int f8151d;

    /* renamed from: e  reason: collision with root package name */
    private final long f8152e;

    /* renamed from: f  reason: collision with root package name */
    private final long f8153f;

    static final class b extends f0.e.d.c.a {

        /* renamed from: a  reason: collision with root package name */
        private Double f8154a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f8155b;

        /* renamed from: c  reason: collision with root package name */
        private Boolean f8156c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f8157d;

        /* renamed from: e  reason: collision with root package name */
        private Long f8158e;

        /* renamed from: f  reason: collision with root package name */
        private Long f8159f;

        b() {
        }

        public f0.e.d.c a() {
            String str = "";
            if (this.f8155b == null) {
                str = str + " batteryVelocity";
            }
            if (this.f8156c == null) {
                str = str + " proximityOn";
            }
            if (this.f8157d == null) {
                str = str + " orientation";
            }
            if (this.f8158e == null) {
                str = str + " ramUsed";
            }
            if (this.f8159f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new u(this.f8154a, this.f8155b.intValue(), this.f8156c.booleanValue(), this.f8157d.intValue(), this.f8158e.longValue(), this.f8159f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f0.e.d.c.a b(Double d10) {
            this.f8154a = d10;
            return this;
        }

        public f0.e.d.c.a c(int i10) {
            this.f8155b = Integer.valueOf(i10);
            return this;
        }

        public f0.e.d.c.a d(long j10) {
            this.f8159f = Long.valueOf(j10);
            return this;
        }

        public f0.e.d.c.a e(int i10) {
            this.f8157d = Integer.valueOf(i10);
            return this;
        }

        public f0.e.d.c.a f(boolean z9) {
            this.f8156c = Boolean.valueOf(z9);
            return this;
        }

        public f0.e.d.c.a g(long j10) {
            this.f8158e = Long.valueOf(j10);
            return this;
        }
    }

    private u(Double d10, int i10, boolean z9, int i11, long j10, long j11) {
        this.f8148a = d10;
        this.f8149b = i10;
        this.f8150c = z9;
        this.f8151d = i11;
        this.f8152e = j10;
        this.f8153f = j11;
    }

    public Double b() {
        return this.f8148a;
    }

    public int c() {
        return this.f8149b;
    }

    public long d() {
        return this.f8153f;
    }

    public int e() {
        return this.f8151d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.c)) {
            return false;
        }
        f0.e.d.c cVar = (f0.e.d.c) obj;
        Double d10 = this.f8148a;
        if (d10 != null ? d10.equals(cVar.b()) : cVar.b() == null) {
            return this.f8149b == cVar.c() && this.f8150c == cVar.g() && this.f8151d == cVar.e() && this.f8152e == cVar.f() && this.f8153f == cVar.d();
        }
    }

    public long f() {
        return this.f8152e;
    }

    public boolean g() {
        return this.f8150c;
    }

    public int hashCode() {
        Double d10 = this.f8148a;
        int hashCode = ((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f8149b) * 1000003;
        int i10 = this.f8150c ? 1231 : 1237;
        long j10 = this.f8152e;
        long j11 = this.f8153f;
        return ((((((hashCode ^ i10) * 1000003) ^ this.f8151d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f8148a + ", batteryVelocity=" + this.f8149b + ", proximityOn=" + this.f8150c + ", orientation=" + this.f8151d + ", ramUsed=" + this.f8152e + ", diskUsed=" + this.f8153f + "}";
    }
}
