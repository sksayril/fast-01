package o1;

import java.util.Arrays;
import o1.l;

final class f extends l {

    /* renamed from: a  reason: collision with root package name */
    private final long f11548a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f11549b;

    /* renamed from: c  reason: collision with root package name */
    private final long f11550c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f11551d;

    /* renamed from: e  reason: collision with root package name */
    private final String f11552e;

    /* renamed from: f  reason: collision with root package name */
    private final long f11553f;

    /* renamed from: g  reason: collision with root package name */
    private final o f11554g;

    static final class b extends l.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f11555a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f11556b;

        /* renamed from: c  reason: collision with root package name */
        private Long f11557c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f11558d;

        /* renamed from: e  reason: collision with root package name */
        private String f11559e;

        /* renamed from: f  reason: collision with root package name */
        private Long f11560f;

        /* renamed from: g  reason: collision with root package name */
        private o f11561g;

        b() {
        }

        public l a() {
            String str = "";
            if (this.f11555a == null) {
                str = str + " eventTimeMs";
            }
            if (this.f11557c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f11560f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f11555a.longValue(), this.f11556b, this.f11557c.longValue(), this.f11558d, this.f11559e, this.f11560f.longValue(), this.f11561g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public l.a b(Integer num) {
            this.f11556b = num;
            return this;
        }

        public l.a c(long j10) {
            this.f11555a = Long.valueOf(j10);
            return this;
        }

        public l.a d(long j10) {
            this.f11557c = Long.valueOf(j10);
            return this;
        }

        public l.a e(o oVar) {
            this.f11561g = oVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public l.a f(byte[] bArr) {
            this.f11558d = bArr;
            return this;
        }

        /* access modifiers changed from: package-private */
        public l.a g(String str) {
            this.f11559e = str;
            return this;
        }

        public l.a h(long j10) {
            this.f11560f = Long.valueOf(j10);
            return this;
        }
    }

    private f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, o oVar) {
        this.f11548a = j10;
        this.f11549b = num;
        this.f11550c = j11;
        this.f11551d = bArr;
        this.f11552e = str;
        this.f11553f = j12;
        this.f11554g = oVar;
    }

    public Integer b() {
        return this.f11549b;
    }

    public long c() {
        return this.f11548a;
    }

    public long d() {
        return this.f11550c;
    }

    public o e() {
        return this.f11554g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f11548a == lVar.c() && ((num = this.f11549b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.f11550c == lVar.d()) {
            if (Arrays.equals(this.f11551d, lVar instanceof f ? ((f) lVar).f11551d : lVar.f()) && ((str = this.f11552e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f11553f == lVar.h()) {
                o oVar = this.f11554g;
                o e10 = lVar.e();
                if (oVar == null) {
                    if (e10 == null) {
                        return true;
                    }
                } else if (oVar.equals(e10)) {
                    return true;
                }
            }
        }
        return false;
    }

    public byte[] f() {
        return this.f11551d;
    }

    public String g() {
        return this.f11552e;
    }

    public long h() {
        return this.f11553f;
    }

    public int hashCode() {
        long j10 = this.f11548a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f11549b;
        int i11 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j11 = this.f11550c;
        int hashCode2 = (((((i10 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f11551d)) * 1000003;
        String str = this.f11552e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j12 = this.f11553f;
        int i12 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        o oVar = this.f11554g;
        if (oVar != null) {
            i11 = oVar.hashCode();
        }
        return i12 ^ i11;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f11548a + ", eventCode=" + this.f11549b + ", eventUptimeMs=" + this.f11550c + ", sourceExtension=" + Arrays.toString(this.f11551d) + ", sourceExtensionJsonProto3=" + this.f11552e + ", timezoneOffsetSeconds=" + this.f11553f + ", networkConnectionInfo=" + this.f11554g + "}";
    }
}
