package s1;

import p4.d;

public final class f {

    /* renamed from: c  reason: collision with root package name */
    private static final f f12162c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f12163a;

    /* renamed from: b  reason: collision with root package name */
    private final long f12164b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f12165a = 0;

        /* renamed from: b  reason: collision with root package name */
        private long f12166b = 0;

        a() {
        }

        public f a() {
            return new f(this.f12165a, this.f12166b);
        }

        public a b(long j10) {
            this.f12166b = j10;
            return this;
        }

        public a c(long j10) {
            this.f12165a = j10;
            return this;
        }
    }

    f(long j10, long j11) {
        this.f12163a = j10;
        this.f12164b = j11;
    }

    public static a c() {
        return new a();
    }

    @d(tag = 2)
    public long a() {
        return this.f12164b;
    }

    @d(tag = 1)
    public long b() {
        return this.f12163a;
    }
}
