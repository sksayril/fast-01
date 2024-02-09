package s1;

import p4.d;

public final class e {

    /* renamed from: c  reason: collision with root package name */
    private static final e f12157c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f12158a;

    /* renamed from: b  reason: collision with root package name */
    private final long f12159b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f12160a = 0;

        /* renamed from: b  reason: collision with root package name */
        private long f12161b = 0;

        a() {
        }

        public e a() {
            return new e(this.f12160a, this.f12161b);
        }

        public a b(long j10) {
            this.f12160a = j10;
            return this;
        }

        public a c(long j10) {
            this.f12161b = j10;
            return this;
        }
    }

    e(long j10, long j11) {
        this.f12158a = j10;
        this.f12159b = j11;
    }

    public static a c() {
        return new a();
    }

    @d(tag = 1)
    public long a() {
        return this.f12158a;
    }

    @d(tag = 2)
    public long b() {
        return this.f12159b;
    }
}
