package d4;

import d4.f0;
import java.util.Objects;

final class s extends f0.e.d.a.b.C0116e.C0118b {

    /* renamed from: a  reason: collision with root package name */
    private final long f8130a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8131b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8132c;

    /* renamed from: d  reason: collision with root package name */
    private final long f8133d;

    /* renamed from: e  reason: collision with root package name */
    private final int f8134e;

    static final class b extends f0.e.d.a.b.C0116e.C0118b.C0119a {

        /* renamed from: a  reason: collision with root package name */
        private Long f8135a;

        /* renamed from: b  reason: collision with root package name */
        private String f8136b;

        /* renamed from: c  reason: collision with root package name */
        private String f8137c;

        /* renamed from: d  reason: collision with root package name */
        private Long f8138d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f8139e;

        b() {
        }

        public f0.e.d.a.b.C0116e.C0118b a() {
            String str = "";
            if (this.f8135a == null) {
                str = str + " pc";
            }
            if (this.f8136b == null) {
                str = str + " symbol";
            }
            if (this.f8138d == null) {
                str = str + " offset";
            }
            if (this.f8139e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new s(this.f8135a.longValue(), this.f8136b, this.f8137c, this.f8138d.longValue(), this.f8139e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f0.e.d.a.b.C0116e.C0118b.C0119a b(String str) {
            this.f8137c = str;
            return this;
        }

        public f0.e.d.a.b.C0116e.C0118b.C0119a c(int i10) {
            this.f8139e = Integer.valueOf(i10);
            return this;
        }

        public f0.e.d.a.b.C0116e.C0118b.C0119a d(long j10) {
            this.f8138d = Long.valueOf(j10);
            return this;
        }

        public f0.e.d.a.b.C0116e.C0118b.C0119a e(long j10) {
            this.f8135a = Long.valueOf(j10);
            return this;
        }

        public f0.e.d.a.b.C0116e.C0118b.C0119a f(String str) {
            Objects.requireNonNull(str, "Null symbol");
            this.f8136b = str;
            return this;
        }
    }

    private s(long j10, String str, String str2, long j11, int i10) {
        this.f8130a = j10;
        this.f8131b = str;
        this.f8132c = str2;
        this.f8133d = j11;
        this.f8134e = i10;
    }

    public String b() {
        return this.f8132c;
    }

    public int c() {
        return this.f8134e;
    }

    public long d() {
        return this.f8133d;
    }

    public long e() {
        return this.f8130a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r1 = r7.f8132c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof d4.f0.e.d.a.b.C0116e.C0118b
            r2 = 0
            if (r1 == 0) goto L_0x004b
            d4.f0$e$d$a$b$e$b r8 = (d4.f0.e.d.a.b.C0116e.C0118b) r8
            long r3 = r7.f8130a
            long r5 = r8.e()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0049
            java.lang.String r1 = r7.f8131b
            java.lang.String r3 = r8.f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0049
            java.lang.String r1 = r7.f8132c
            if (r1 != 0) goto L_0x002c
            java.lang.String r1 = r8.b()
            if (r1 != 0) goto L_0x0049
            goto L_0x0036
        L_0x002c:
            java.lang.String r3 = r8.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0049
        L_0x0036:
            long r3 = r7.f8133d
            long r5 = r8.d()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0049
            int r1 = r7.f8134e
            int r8 = r8.c()
            if (r1 != r8) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            return r0
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.s.equals(java.lang.Object):boolean");
    }

    public String f() {
        return this.f8131b;
    }

    public int hashCode() {
        long j10 = this.f8130a;
        int hashCode = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f8131b.hashCode()) * 1000003;
        String str = this.f8132c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j11 = this.f8133d;
        return this.f8134e ^ ((((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public String toString() {
        return "Frame{pc=" + this.f8130a + ", symbol=" + this.f8131b + ", file=" + this.f8132c + ", offset=" + this.f8133d + ", importance=" + this.f8134e + "}";
    }
}
