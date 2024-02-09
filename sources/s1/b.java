package s1;

import p4.d;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    private static final b f12144b = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final e f12145a;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private e f12146a = null;

        a() {
        }

        public b a() {
            return new b(this.f12146a);
        }

        public a b(e eVar) {
            this.f12146a = eVar;
            return this;
        }
    }

    b(e eVar) {
        this.f12145a = eVar;
    }

    public static a b() {
        return new a();
    }

    @d(tag = 1)
    public e a() {
        return this.f12145a;
    }
}
