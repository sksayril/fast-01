package x1;

import x1.e;

final class a extends e {

    /* renamed from: b  reason: collision with root package name */
    private final long f13053b;

    /* renamed from: c  reason: collision with root package name */
    private final int f13054c;

    /* renamed from: d  reason: collision with root package name */
    private final int f13055d;

    /* renamed from: e  reason: collision with root package name */
    private final long f13056e;

    /* renamed from: f  reason: collision with root package name */
    private final int f13057f;

    static final class b extends e.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f13058a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f13059b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f13060c;

        /* renamed from: d  reason: collision with root package name */
        private Long f13061d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f13062e;

        b() {
        }

        /* access modifiers changed from: package-private */
        public e a() {
            String str = "";
            if (this.f13058a == null) {
                str = str + " maxStorageSizeInBytes";
            }
            if (this.f13059b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f13060c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f13061d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f13062e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f13058a.longValue(), this.f13059b.intValue(), this.f13060c.intValue(), this.f13061d.longValue(), this.f13062e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        public e.a b(int i10) {
            this.f13060c = Integer.valueOf(i10);
            return this;
        }

        /* access modifiers changed from: package-private */
        public e.a c(long j10) {
            this.f13061d = Long.valueOf(j10);
            return this;
        }

        /* access modifiers changed from: package-private */
        public e.a d(int i10) {
            this.f13059b = Integer.valueOf(i10);
            return this;
        }

        /* access modifiers changed from: package-private */
        public e.a e(int i10) {
            this.f13062e = Integer.valueOf(i10);
            return this;
        }

        /* access modifiers changed from: package-private */
        public e.a f(long j10) {
            this.f13058a = Long.valueOf(j10);
            return this;
        }
    }

    private a(long j10, int i10, int i11, long j11, int i12) {
        this.f13053b = j10;
        this.f13054c = i10;
        this.f13055d = i11;
        this.f13056e = j11;
        this.f13057f = i12;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f13055d;
    }

    /* access modifiers changed from: package-private */
    public long c() {
        return this.f13056e;
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return this.f13054c;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f13057f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f13053b == eVar.f() && this.f13054c == eVar.d() && this.f13055d == eVar.b() && this.f13056e == eVar.c() && this.f13057f == eVar.e();
    }

    /* access modifiers changed from: package-private */
    public long f() {
        return this.f13053b;
    }

    public int hashCode() {
        long j10 = this.f13053b;
        long j11 = this.f13056e;
        return this.f13057f ^ ((((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f13054c) * 1000003) ^ this.f13055d) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f13053b + ", loadBatchSize=" + this.f13054c + ", criticalSectionEnterTimeoutMs=" + this.f13055d + ", eventCleanUpAge=" + this.f13056e + ", maxBlobByteSizePerRow=" + this.f13057f + "}";
    }
}
