package s1;

import p4.d;

public final class c {

    /* renamed from: c  reason: collision with root package name */
    private static final c f12147c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f12148a;

    /* renamed from: b  reason: collision with root package name */
    private final b f12149b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f12150a = 0;

        /* renamed from: b  reason: collision with root package name */
        private b f12151b = b.REASON_UNKNOWN;

        a() {
        }

        public c a() {
            return new c(this.f12150a, this.f12151b);
        }

        public a b(long j10) {
            this.f12150a = j10;
            return this;
        }

        public a c(b bVar) {
            this.f12151b = bVar;
            return this;
        }
    }

    public enum b implements p4.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        
        private final int number_;

        private b(int i10) {
            this.number_ = i10;
        }

        public int getNumber() {
            return this.number_;
        }
    }

    c(long j10, b bVar) {
        this.f12148a = j10;
        this.f12149b = bVar;
    }

    public static a c() {
        return new a();
    }

    @d(tag = 1)
    public long a() {
        return this.f12148a;
    }

    @d(tag = 3)
    public b b() {
        return this.f12149b;
    }
}
