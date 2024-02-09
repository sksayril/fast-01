package d4;

import d4.f0;
import java.util.List;
import java.util.Objects;

final class p extends f0.e.d.a.b.c {

    /* renamed from: a  reason: collision with root package name */
    private final String f8108a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8109b;

    /* renamed from: c  reason: collision with root package name */
    private final List<f0.e.d.a.b.C0116e.C0118b> f8110c;

    /* renamed from: d  reason: collision with root package name */
    private final f0.e.d.a.b.c f8111d;

    /* renamed from: e  reason: collision with root package name */
    private final int f8112e;

    static final class b extends f0.e.d.a.b.c.C0113a {

        /* renamed from: a  reason: collision with root package name */
        private String f8113a;

        /* renamed from: b  reason: collision with root package name */
        private String f8114b;

        /* renamed from: c  reason: collision with root package name */
        private List<f0.e.d.a.b.C0116e.C0118b> f8115c;

        /* renamed from: d  reason: collision with root package name */
        private f0.e.d.a.b.c f8116d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f8117e;

        b() {
        }

        public f0.e.d.a.b.c a() {
            String str = "";
            if (this.f8113a == null) {
                str = str + " type";
            }
            if (this.f8115c == null) {
                str = str + " frames";
            }
            if (this.f8117e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new p(this.f8113a, this.f8114b, this.f8115c, this.f8116d, this.f8117e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f0.e.d.a.b.c.C0113a b(f0.e.d.a.b.c cVar) {
            this.f8116d = cVar;
            return this;
        }

        public f0.e.d.a.b.c.C0113a c(List<f0.e.d.a.b.C0116e.C0118b> list) {
            Objects.requireNonNull(list, "Null frames");
            this.f8115c = list;
            return this;
        }

        public f0.e.d.a.b.c.C0113a d(int i10) {
            this.f8117e = Integer.valueOf(i10);
            return this;
        }

        public f0.e.d.a.b.c.C0113a e(String str) {
            this.f8114b = str;
            return this;
        }

        public f0.e.d.a.b.c.C0113a f(String str) {
            Objects.requireNonNull(str, "Null type");
            this.f8113a = str;
            return this;
        }
    }

    private p(String str, String str2, List<f0.e.d.a.b.C0116e.C0118b> list, f0.e.d.a.b.c cVar, int i10) {
        this.f8108a = str;
        this.f8109b = str2;
        this.f8110c = list;
        this.f8111d = cVar;
        this.f8112e = i10;
    }

    public f0.e.d.a.b.c b() {
        return this.f8111d;
    }

    public List<f0.e.d.a.b.C0116e.C0118b> c() {
        return this.f8110c;
    }

    public int d() {
        return this.f8112e;
    }

    public String e() {
        return this.f8109b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r1 = r4.f8111d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f8109b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof d4.f0.e.d.a.b.c
            r2 = 0
            if (r1 == 0) goto L_0x0058
            d4.f0$e$d$a$b$c r5 = (d4.f0.e.d.a.b.c) r5
            java.lang.String r1 = r4.f8108a
            java.lang.String r3 = r5.f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
            java.lang.String r1 = r4.f8109b
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = r5.e()
            if (r1 != 0) goto L_0x0056
            goto L_0x002c
        L_0x0022:
            java.lang.String r3 = r5.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
        L_0x002c:
            java.util.List<d4.f0$e$d$a$b$e$b> r1 = r4.f8110c
            java.util.List r3 = r5.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
            d4.f0$e$d$a$b$c r1 = r4.f8111d
            if (r1 != 0) goto L_0x0043
            d4.f0$e$d$a$b$c r1 = r5.b()
            if (r1 != 0) goto L_0x0056
            goto L_0x004d
        L_0x0043:
            d4.f0$e$d$a$b$c r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
        L_0x004d:
            int r1 = r4.f8112e
            int r5 = r5.d()
            if (r1 != r5) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r0 = 0
        L_0x0057:
            return r0
        L_0x0058:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.p.equals(java.lang.Object):boolean");
    }

    public String f() {
        return this.f8108a;
    }

    public int hashCode() {
        int hashCode = (this.f8108a.hashCode() ^ 1000003) * 1000003;
        String str = this.f8109b;
        int i10 = 0;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f8110c.hashCode()) * 1000003;
        f0.e.d.a.b.c cVar = this.f8111d;
        if (cVar != null) {
            i10 = cVar.hashCode();
        }
        return ((hashCode2 ^ i10) * 1000003) ^ this.f8112e;
    }

    public String toString() {
        return "Exception{type=" + this.f8108a + ", reason=" + this.f8109b + ", frames=" + this.f8110c + ", causedBy=" + this.f8111d + ", overflowCount=" + this.f8112e + "}";
    }
}
