package o1;

import java.util.List;
import o1.m;

final class g extends m {

    /* renamed from: a  reason: collision with root package name */
    private final long f11562a;

    /* renamed from: b  reason: collision with root package name */
    private final long f11563b;

    /* renamed from: c  reason: collision with root package name */
    private final k f11564c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f11565d;

    /* renamed from: e  reason: collision with root package name */
    private final String f11566e;

    /* renamed from: f  reason: collision with root package name */
    private final List<l> f11567f;

    /* renamed from: g  reason: collision with root package name */
    private final p f11568g;

    static final class b extends m.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f11569a;

        /* renamed from: b  reason: collision with root package name */
        private Long f11570b;

        /* renamed from: c  reason: collision with root package name */
        private k f11571c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f11572d;

        /* renamed from: e  reason: collision with root package name */
        private String f11573e;

        /* renamed from: f  reason: collision with root package name */
        private List<l> f11574f;

        /* renamed from: g  reason: collision with root package name */
        private p f11575g;

        b() {
        }

        public m a() {
            String str = "";
            if (this.f11569a == null) {
                str = str + " requestTimeMs";
            }
            if (this.f11570b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f11569a.longValue(), this.f11570b.longValue(), this.f11571c, this.f11572d, this.f11573e, this.f11574f, this.f11575g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public m.a b(k kVar) {
            this.f11571c = kVar;
            return this;
        }

        public m.a c(List<l> list) {
            this.f11574f = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        public m.a d(Integer num) {
            this.f11572d = num;
            return this;
        }

        /* access modifiers changed from: package-private */
        public m.a e(String str) {
            this.f11573e = str;
            return this;
        }

        public m.a f(p pVar) {
            this.f11575g = pVar;
            return this;
        }

        public m.a g(long j10) {
            this.f11569a = Long.valueOf(j10);
            return this;
        }

        public m.a h(long j10) {
            this.f11570b = Long.valueOf(j10);
            return this;
        }
    }

    private g(long j10, long j11, k kVar, Integer num, String str, List<l> list, p pVar) {
        this.f11562a = j10;
        this.f11563b = j11;
        this.f11564c = kVar;
        this.f11565d = num;
        this.f11566e = str;
        this.f11567f = list;
        this.f11568g = pVar;
    }

    public k b() {
        return this.f11564c;
    }

    public List<l> c() {
        return this.f11567f;
    }

    public Integer d() {
        return this.f11565d;
    }

    public String e() {
        return this.f11566e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f11562a == mVar.g() && this.f11563b == mVar.h() && ((kVar = this.f11564c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f11565d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f11566e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f11567f) != null ? list.equals(mVar.c()) : mVar.c() == null)) {
            p pVar = this.f11568g;
            p f10 = mVar.f();
            if (pVar == null) {
                if (f10 == null) {
                    return true;
                }
            } else if (pVar.equals(f10)) {
                return true;
            }
        }
        return false;
    }

    public p f() {
        return this.f11568g;
    }

    public long g() {
        return this.f11562a;
    }

    public long h() {
        return this.f11563b;
    }

    public int hashCode() {
        long j10 = this.f11562a;
        long j11 = this.f11563b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        k kVar = this.f11564c;
        int i11 = 0;
        int hashCode = (i10 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f11565d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f11566e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<l> list = this.f11567f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f11568g;
        if (pVar != null) {
            i11 = pVar.hashCode();
        }
        return hashCode4 ^ i11;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f11562a + ", requestUptimeMs=" + this.f11563b + ", clientInfo=" + this.f11564c + ", logSource=" + this.f11565d + ", logSourceName=" + this.f11566e + ", logEvents=" + this.f11567f + ", qosTier=" + this.f11568g + "}";
    }
}
