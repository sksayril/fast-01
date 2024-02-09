package p1;

import java.util.Map;
import java.util.Objects;
import p1.i;

final class b extends i {

    /* renamed from: a  reason: collision with root package name */
    private final String f11788a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f11789b;

    /* renamed from: c  reason: collision with root package name */
    private final h f11790c;

    /* renamed from: d  reason: collision with root package name */
    private final long f11791d;

    /* renamed from: e  reason: collision with root package name */
    private final long f11792e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f11793f;

    /* renamed from: p1.b$b  reason: collision with other inner class name */
    static final class C0198b extends i.a {

        /* renamed from: a  reason: collision with root package name */
        private String f11794a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f11795b;

        /* renamed from: c  reason: collision with root package name */
        private h f11796c;

        /* renamed from: d  reason: collision with root package name */
        private Long f11797d;

        /* renamed from: e  reason: collision with root package name */
        private Long f11798e;

        /* renamed from: f  reason: collision with root package name */
        private Map<String, String> f11799f;

        C0198b() {
        }

        public i d() {
            String str = "";
            if (this.f11794a == null) {
                str = str + " transportName";
            }
            if (this.f11796c == null) {
                str = str + " encodedPayload";
            }
            if (this.f11797d == null) {
                str = str + " eventMillis";
            }
            if (this.f11798e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f11799f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f11794a, this.f11795b, this.f11796c, this.f11797d.longValue(), this.f11798e.longValue(), this.f11799f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: protected */
        public Map<String, String> e() {
            Map<String, String> map = this.f11799f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        /* access modifiers changed from: protected */
        public i.a f(Map<String, String> map) {
            Objects.requireNonNull(map, "Null autoMetadata");
            this.f11799f = map;
            return this;
        }

        public i.a g(Integer num) {
            this.f11795b = num;
            return this;
        }

        public i.a h(h hVar) {
            Objects.requireNonNull(hVar, "Null encodedPayload");
            this.f11796c = hVar;
            return this;
        }

        public i.a i(long j10) {
            this.f11797d = Long.valueOf(j10);
            return this;
        }

        public i.a j(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f11794a = str;
            return this;
        }

        public i.a k(long j10) {
            this.f11798e = Long.valueOf(j10);
            return this;
        }
    }

    private b(String str, Integer num, h hVar, long j10, long j11, Map<String, String> map) {
        this.f11788a = str;
        this.f11789b = num;
        this.f11790c = hVar;
        this.f11791d = j10;
        this.f11792e = j11;
        this.f11793f = map;
    }

    /* access modifiers changed from: protected */
    public Map<String, String> c() {
        return this.f11793f;
    }

    public Integer d() {
        return this.f11789b;
    }

    public h e() {
        return this.f11790c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r7.f11789b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof p1.i
            r2 = 0
            if (r1 == 0) goto L_0x005b
            p1.i r8 = (p1.i) r8
            java.lang.String r1 = r7.f11788a
            java.lang.String r3 = r8.j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            java.lang.Integer r1 = r7.f11789b
            if (r1 != 0) goto L_0x0022
            java.lang.Integer r1 = r8.d()
            if (r1 != 0) goto L_0x0059
            goto L_0x002c
        L_0x0022:
            java.lang.Integer r3 = r8.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
        L_0x002c:
            p1.h r1 = r7.f11790c
            p1.h r3 = r8.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0059
            long r3 = r7.f11791d
            long r5 = r8.f()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            long r3 = r7.f11792e
            long r5 = r8.k()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0059
            java.util.Map<java.lang.String, java.lang.String> r1 = r7.f11793f
            java.util.Map r8 = r8.c()
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            return r0
        L_0x005b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.b.equals(java.lang.Object):boolean");
    }

    public long f() {
        return this.f11791d;
    }

    public int hashCode() {
        int hashCode = (this.f11788a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f11789b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j10 = this.f11791d;
        long j11 = this.f11792e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f11790c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f11793f.hashCode();
    }

    public String j() {
        return this.f11788a;
    }

    public long k() {
        return this.f11792e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f11788a + ", code=" + this.f11789b + ", encodedPayload=" + this.f11790c + ", eventMillis=" + this.f11791d + ", uptimeMillis=" + this.f11792e + ", autoMetadata=" + this.f11793f + "}";
    }
}
