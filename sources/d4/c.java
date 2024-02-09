package d4;

import d4.f0;
import java.util.List;
import java.util.Objects;

final class c extends f0.a {

    /* renamed from: a  reason: collision with root package name */
    private final int f7952a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7953b;

    /* renamed from: c  reason: collision with root package name */
    private final int f7954c;

    /* renamed from: d  reason: collision with root package name */
    private final int f7955d;

    /* renamed from: e  reason: collision with root package name */
    private final long f7956e;

    /* renamed from: f  reason: collision with root package name */
    private final long f7957f;

    /* renamed from: g  reason: collision with root package name */
    private final long f7958g;

    /* renamed from: h  reason: collision with root package name */
    private final String f7959h;

    /* renamed from: i  reason: collision with root package name */
    private final List<f0.a.C0106a> f7960i;

    static final class b extends f0.a.b {

        /* renamed from: a  reason: collision with root package name */
        private Integer f7961a;

        /* renamed from: b  reason: collision with root package name */
        private String f7962b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f7963c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f7964d;

        /* renamed from: e  reason: collision with root package name */
        private Long f7965e;

        /* renamed from: f  reason: collision with root package name */
        private Long f7966f;

        /* renamed from: g  reason: collision with root package name */
        private Long f7967g;

        /* renamed from: h  reason: collision with root package name */
        private String f7968h;

        /* renamed from: i  reason: collision with root package name */
        private List<f0.a.C0106a> f7969i;

        b() {
        }

        public f0.a a() {
            String str = "";
            if (this.f7961a == null) {
                str = str + " pid";
            }
            if (this.f7962b == null) {
                str = str + " processName";
            }
            if (this.f7963c == null) {
                str = str + " reasonCode";
            }
            if (this.f7964d == null) {
                str = str + " importance";
            }
            if (this.f7965e == null) {
                str = str + " pss";
            }
            if (this.f7966f == null) {
                str = str + " rss";
            }
            if (this.f7967g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new c(this.f7961a.intValue(), this.f7962b, this.f7963c.intValue(), this.f7964d.intValue(), this.f7965e.longValue(), this.f7966f.longValue(), this.f7967g.longValue(), this.f7968h, this.f7969i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f0.a.b b(List<f0.a.C0106a> list) {
            this.f7969i = list;
            return this;
        }

        public f0.a.b c(int i10) {
            this.f7964d = Integer.valueOf(i10);
            return this;
        }

        public f0.a.b d(int i10) {
            this.f7961a = Integer.valueOf(i10);
            return this;
        }

        public f0.a.b e(String str) {
            Objects.requireNonNull(str, "Null processName");
            this.f7962b = str;
            return this;
        }

        public f0.a.b f(long j10) {
            this.f7965e = Long.valueOf(j10);
            return this;
        }

        public f0.a.b g(int i10) {
            this.f7963c = Integer.valueOf(i10);
            return this;
        }

        public f0.a.b h(long j10) {
            this.f7966f = Long.valueOf(j10);
            return this;
        }

        public f0.a.b i(long j10) {
            this.f7967g = Long.valueOf(j10);
            return this;
        }

        public f0.a.b j(String str) {
            this.f7968h = str;
            return this;
        }
    }

    private c(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List<f0.a.C0106a> list) {
        this.f7952a = i10;
        this.f7953b = str;
        this.f7954c = i11;
        this.f7955d = i12;
        this.f7956e = j10;
        this.f7957f = j11;
        this.f7958g = j12;
        this.f7959h = str2;
        this.f7960i = list;
    }

    public List<f0.a.C0106a> b() {
        return this.f7960i;
    }

    public int c() {
        return this.f7955d;
    }

    public int d() {
        return this.f7952a;
    }

    public String e() {
        return this.f7953b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.a)) {
            return false;
        }
        f0.a aVar = (f0.a) obj;
        if (this.f7952a == aVar.d() && this.f7953b.equals(aVar.e()) && this.f7954c == aVar.g() && this.f7955d == aVar.c() && this.f7956e == aVar.f() && this.f7957f == aVar.h() && this.f7958g == aVar.i() && ((str = this.f7959h) != null ? str.equals(aVar.j()) : aVar.j() == null)) {
            List<f0.a.C0106a> list = this.f7960i;
            List<f0.a.C0106a> b10 = aVar.b();
            if (list == null) {
                if (b10 == null) {
                    return true;
                }
            } else if (list.equals(b10)) {
                return true;
            }
        }
        return false;
    }

    public long f() {
        return this.f7956e;
    }

    public int g() {
        return this.f7954c;
    }

    public long h() {
        return this.f7957f;
    }

    public int hashCode() {
        long j10 = this.f7956e;
        long j11 = this.f7957f;
        long j12 = this.f7958g;
        int hashCode = (((((((((((((this.f7952a ^ 1000003) * 1000003) ^ this.f7953b.hashCode()) * 1000003) ^ this.f7954c) * 1000003) ^ this.f7955d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.f7959h;
        int i10 = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<f0.a.C0106a> list = this.f7960i;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode2 ^ i10;
    }

    public long i() {
        return this.f7958g;
    }

    public String j() {
        return this.f7959h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f7952a + ", processName=" + this.f7953b + ", reasonCode=" + this.f7954c + ", importance=" + this.f7955d + ", pss=" + this.f7956e + ", rss=" + this.f7957f + ", timestamp=" + this.f7958g + ", traceFile=" + this.f7959h + ", buildIdMappingForArch=" + this.f7960i + "}";
    }
}
