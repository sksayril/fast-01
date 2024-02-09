package d4;

import d4.f0;
import java.util.List;
import java.util.Objects;

final class m extends f0.e.d.a {

    /* renamed from: a  reason: collision with root package name */
    private final f0.e.d.a.b f8076a;

    /* renamed from: b  reason: collision with root package name */
    private final List<f0.c> f8077b;

    /* renamed from: c  reason: collision with root package name */
    private final List<f0.c> f8078c;

    /* renamed from: d  reason: collision with root package name */
    private final Boolean f8079d;

    /* renamed from: e  reason: collision with root package name */
    private final f0.e.d.a.c f8080e;

    /* renamed from: f  reason: collision with root package name */
    private final List<f0.e.d.a.c> f8081f;

    /* renamed from: g  reason: collision with root package name */
    private final int f8082g;

    static final class b extends f0.e.d.a.C0109a {

        /* renamed from: a  reason: collision with root package name */
        private f0.e.d.a.b f8083a;

        /* renamed from: b  reason: collision with root package name */
        private List<f0.c> f8084b;

        /* renamed from: c  reason: collision with root package name */
        private List<f0.c> f8085c;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f8086d;

        /* renamed from: e  reason: collision with root package name */
        private f0.e.d.a.c f8087e;

        /* renamed from: f  reason: collision with root package name */
        private List<f0.e.d.a.c> f8088f;

        /* renamed from: g  reason: collision with root package name */
        private Integer f8089g;

        b() {
        }

        private b(f0.e.d.a aVar) {
            this.f8083a = aVar.f();
            this.f8084b = aVar.e();
            this.f8085c = aVar.g();
            this.f8086d = aVar.c();
            this.f8087e = aVar.d();
            this.f8088f = aVar.b();
            this.f8089g = Integer.valueOf(aVar.h());
        }

        public f0.e.d.a a() {
            String str = "";
            if (this.f8083a == null) {
                str = str + " execution";
            }
            if (this.f8089g == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new m(this.f8083a, this.f8084b, this.f8085c, this.f8086d, this.f8087e, this.f8088f, this.f8089g.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public f0.e.d.a.C0109a b(List<f0.e.d.a.c> list) {
            this.f8088f = list;
            return this;
        }

        public f0.e.d.a.C0109a c(Boolean bool) {
            this.f8086d = bool;
            return this;
        }

        public f0.e.d.a.C0109a d(f0.e.d.a.c cVar) {
            this.f8087e = cVar;
            return this;
        }

        public f0.e.d.a.C0109a e(List<f0.c> list) {
            this.f8084b = list;
            return this;
        }

        public f0.e.d.a.C0109a f(f0.e.d.a.b bVar) {
            Objects.requireNonNull(bVar, "Null execution");
            this.f8083a = bVar;
            return this;
        }

        public f0.e.d.a.C0109a g(List<f0.c> list) {
            this.f8085c = list;
            return this;
        }

        public f0.e.d.a.C0109a h(int i10) {
            this.f8089g = Integer.valueOf(i10);
            return this;
        }
    }

    private m(f0.e.d.a.b bVar, List<f0.c> list, List<f0.c> list2, Boolean bool, f0.e.d.a.c cVar, List<f0.e.d.a.c> list3, int i10) {
        this.f8076a = bVar;
        this.f8077b = list;
        this.f8078c = list2;
        this.f8079d = bool;
        this.f8080e = cVar;
        this.f8081f = list3;
        this.f8082g = i10;
    }

    public List<f0.e.d.a.c> b() {
        return this.f8081f;
    }

    public Boolean c() {
        return this.f8079d;
    }

    public f0.e.d.a.c d() {
        return this.f8080e;
    }

    public List<f0.c> e() {
        return this.f8077b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = r4.f8078c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r1 = r4.f8079d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        r1 = r4.f8080e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006b, code lost:
        r1 = r4.f8081f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f8077b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof d4.f0.e.d.a
            r2 = 0
            if (r1 == 0) goto L_0x008b
            d4.f0$e$d$a r5 = (d4.f0.e.d.a) r5
            d4.f0$e$d$a$b r1 = r4.f8076a
            d4.f0$e$d$a$b r3 = r5.f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
            java.util.List<d4.f0$c> r1 = r4.f8077b
            if (r1 != 0) goto L_0x0022
            java.util.List r1 = r5.e()
            if (r1 != 0) goto L_0x0089
            goto L_0x002c
        L_0x0022:
            java.util.List r3 = r5.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
        L_0x002c:
            java.util.List<d4.f0$c> r1 = r4.f8078c
            if (r1 != 0) goto L_0x0037
            java.util.List r1 = r5.g()
            if (r1 != 0) goto L_0x0089
            goto L_0x0041
        L_0x0037:
            java.util.List r3 = r5.g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
        L_0x0041:
            java.lang.Boolean r1 = r4.f8079d
            if (r1 != 0) goto L_0x004c
            java.lang.Boolean r1 = r5.c()
            if (r1 != 0) goto L_0x0089
            goto L_0x0056
        L_0x004c:
            java.lang.Boolean r3 = r5.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
        L_0x0056:
            d4.f0$e$d$a$c r1 = r4.f8080e
            if (r1 != 0) goto L_0x0061
            d4.f0$e$d$a$c r1 = r5.d()
            if (r1 != 0) goto L_0x0089
            goto L_0x006b
        L_0x0061:
            d4.f0$e$d$a$c r3 = r5.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
        L_0x006b:
            java.util.List<d4.f0$e$d$a$c> r1 = r4.f8081f
            if (r1 != 0) goto L_0x0076
            java.util.List r1 = r5.b()
            if (r1 != 0) goto L_0x0089
            goto L_0x0080
        L_0x0076:
            java.util.List r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
        L_0x0080:
            int r1 = r4.f8082g
            int r5 = r5.h()
            if (r1 != r5) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r0 = 0
        L_0x008a:
            return r0
        L_0x008b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d4.m.equals(java.lang.Object):boolean");
    }

    public f0.e.d.a.b f() {
        return this.f8076a;
    }

    public List<f0.c> g() {
        return this.f8078c;
    }

    public int h() {
        return this.f8082g;
    }

    public int hashCode() {
        int hashCode = (this.f8076a.hashCode() ^ 1000003) * 1000003;
        List<f0.c> list = this.f8077b;
        int i10 = 0;
        int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<f0.c> list2 = this.f8078c;
        int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f8079d;
        int hashCode4 = (hashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        f0.e.d.a.c cVar = this.f8080e;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<f0.e.d.a.c> list3 = this.f8081f;
        if (list3 != null) {
            i10 = list3.hashCode();
        }
        return ((hashCode5 ^ i10) * 1000003) ^ this.f8082g;
    }

    public f0.e.d.a.C0109a i() {
        return new b(this);
    }

    public String toString() {
        return "Application{execution=" + this.f8076a + ", customAttributes=" + this.f8077b + ", internalKeys=" + this.f8078c + ", background=" + this.f8079d + ", currentProcessDetails=" + this.f8080e + ", appProcessDetails=" + this.f8081f + ", uiOrientation=" + this.f8082g + "}";
    }
}
