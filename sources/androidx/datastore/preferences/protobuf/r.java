package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.y;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

final class r extends q<y.d> {

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2056a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.datastore.preferences.protobuf.t1$b[] r0 = androidx.datastore.preferences.protobuf.t1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2056a = r0
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2056a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2056a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2056a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f2056a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f2056a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f2056a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f2056a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f2056a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.UINT32     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f2056a     // Catch:{ NoSuchFieldError -> 0x0078 }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f2056a     // Catch:{ NoSuchFieldError -> 0x0084 }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f2056a     // Catch:{ NoSuchFieldError -> 0x0090 }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.SINT32     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f2056a     // Catch:{ NoSuchFieldError -> 0x009c }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.SINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f2056a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.ENUM     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f2056a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.BYTES     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f2056a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.STRING     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f2056a     // Catch:{ NoSuchFieldError -> 0x00cc }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.GROUP     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f2056a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                androidx.datastore.preferences.protobuf.t1$b r1 = androidx.datastore.preferences.protobuf.t1.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.r.a.<clinit>():void");
        }
    }

    r() {
    }

    /* access modifiers changed from: package-private */
    public int a(Map.Entry<?, ?> entry) {
        return ((y.d) entry.getKey()).getNumber();
    }

    /* access modifiers changed from: package-private */
    public Object b(p pVar, r0 r0Var, int i10) {
        return pVar.a(r0Var, i10);
    }

    /* access modifiers changed from: package-private */
    public u<y.d> c(Object obj) {
        return ((y.c) obj).extensions;
    }

    /* access modifiers changed from: package-private */
    public u<y.d> d(Object obj) {
        return ((y.c) obj).L();
    }

    /* access modifiers changed from: package-private */
    public boolean e(r0 r0Var) {
        return r0Var instanceof y.c;
    }

    /* access modifiers changed from: package-private */
    public void f(Object obj) {
        c(obj).t();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x016d, code lost:
        r1 = java.lang.Long.valueOf(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <UT, UB> UB g(androidx.datastore.preferences.protobuf.f1 r5, java.lang.Object r6, androidx.datastore.preferences.protobuf.p r7, androidx.datastore.preferences.protobuf.u<androidx.datastore.preferences.protobuf.y.d> r8, UB r9, androidx.datastore.preferences.protobuf.n1<UT, UB> r10) {
        /*
            r4 = this;
            androidx.datastore.preferences.protobuf.y$e r6 = (androidx.datastore.preferences.protobuf.y.e) r6
            int r0 = r6.c()
            androidx.datastore.preferences.protobuf.y$d r1 = r6.f2134b
            boolean r1 = r1.f()
            if (r1 == 0) goto L_0x00d2
            androidx.datastore.preferences.protobuf.y$d r1 = r6.f2134b
            boolean r1 = r1.isPacked()
            if (r1 == 0) goto L_0x00d2
            int[] r7 = androidx.datastore.preferences.protobuf.r.a.f2056a
            androidx.datastore.preferences.protobuf.t1$b r1 = r6.a()
            int r1 = r1.ordinal()
            r7 = r7[r1]
            switch(r7) {
                case 1: goto L_0x00c3;
                case 2: goto L_0x00ba;
                case 3: goto L_0x00b1;
                case 4: goto L_0x00a8;
                case 5: goto L_0x009f;
                case 6: goto L_0x0096;
                case 7: goto L_0x008d;
                case 8: goto L_0x0084;
                case 9: goto L_0x007b;
                case 10: goto L_0x0072;
                case 11: goto L_0x0069;
                case 12: goto L_0x0060;
                case 13: goto L_0x0056;
                case 14: goto L_0x0042;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Type cannot be packed: "
            r7.append(r8)
            androidx.datastore.preferences.protobuf.y$d r6 = r6.f2134b
            androidx.datastore.preferences.protobuf.t1$b r6 = r6.h()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
        L_0x0042:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.O(r7)
            androidx.datastore.preferences.protobuf.y$d r5 = r6.f2134b
            androidx.datastore.preferences.protobuf.a0$d r5 = r5.g()
            java.lang.Object r9 = androidx.datastore.preferences.protobuf.i1.z(r0, r7, r5, r9, r10)
            goto L_0x00cb
        L_0x0056:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.l(r7)
            goto L_0x00cb
        L_0x0060:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.c(r7)
            goto L_0x00cb
        L_0x0069:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.J(r7)
            goto L_0x00cb
        L_0x0072:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.j(r7)
            goto L_0x00cb
        L_0x007b:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.n(r7)
            goto L_0x00cb
        L_0x0084:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.o(r7)
            goto L_0x00cb
        L_0x008d:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.g(r7)
            goto L_0x00cb
        L_0x0096:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.M(r7)
            goto L_0x00cb
        L_0x009f:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.N(r7)
            goto L_0x00cb
        L_0x00a8:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.v(r7)
            goto L_0x00cb
        L_0x00b1:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.I(r7)
            goto L_0x00cb
        L_0x00ba:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.z(r7)
            goto L_0x00cb
        L_0x00c3:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r5.G(r7)
        L_0x00cb:
            androidx.datastore.preferences.protobuf.y$d r5 = r6.f2134b
            r8.x(r5, r7)
            goto L_0x01b5
        L_0x00d2:
            r1 = 0
            androidx.datastore.preferences.protobuf.t1$b r2 = r6.a()
            androidx.datastore.preferences.protobuf.t1$b r3 = androidx.datastore.preferences.protobuf.t1.b.ENUM
            if (r2 != r3) goto L_0x00f0
            int r5 = r5.B()
            androidx.datastore.preferences.protobuf.y$d r7 = r6.f2134b
            androidx.datastore.preferences.protobuf.a0$d r7 = r7.g()
            androidx.datastore.preferences.protobuf.a0$c r7 = r7.a(r5)
            if (r7 != 0) goto L_0x015f
            java.lang.Object r5 = androidx.datastore.preferences.protobuf.i1.L(r0, r5, r9, r10)
            return r5
        L_0x00f0:
            int[] r10 = androidx.datastore.preferences.protobuf.r.a.f2056a
            androidx.datastore.preferences.protobuf.t1$b r0 = r6.a()
            int r0 = r0.ordinal()
            r10 = r10[r0]
            switch(r10) {
                case 1: goto L_0x017b;
                case 2: goto L_0x0172;
                case 3: goto L_0x0169;
                case 4: goto L_0x0164;
                case 5: goto L_0x015b;
                case 6: goto L_0x0156;
                case 7: goto L_0x0151;
                case 8: goto L_0x0148;
                case 9: goto L_0x0143;
                case 10: goto L_0x013e;
                case 11: goto L_0x0139;
                case 12: goto L_0x0134;
                case 13: goto L_0x012f;
                case 14: goto L_0x0127;
                case 15: goto L_0x0122;
                case 16: goto L_0x011d;
                case 17: goto L_0x010f;
                case 18: goto L_0x0101;
                default: goto L_0x00ff;
            }
        L_0x00ff:
            goto L_0x0183
        L_0x0101:
            androidx.datastore.preferences.protobuf.r0 r10 = r6.b()
            java.lang.Class r10 = r10.getClass()
            java.lang.Object r1 = r5.i(r10, r7)
            goto L_0x0183
        L_0x010f:
            androidx.datastore.preferences.protobuf.r0 r10 = r6.b()
            java.lang.Class r10 = r10.getClass()
            java.lang.Object r1 = r5.w(r10, r7)
            goto L_0x0183
        L_0x011d:
            java.lang.String r1 = r5.p()
            goto L_0x0183
        L_0x0122:
            androidx.datastore.preferences.protobuf.h r1 = r5.y()
            goto L_0x0183
        L_0x0127:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Shouldn't reach here."
            r5.<init>(r6)
            throw r5
        L_0x012f:
            long r0 = r5.m()
            goto L_0x016d
        L_0x0134:
            int r5 = r5.k()
            goto L_0x015f
        L_0x0139:
            long r0 = r5.u()
            goto L_0x016d
        L_0x013e:
            int r5 = r5.E()
            goto L_0x015f
        L_0x0143:
            int r5 = r5.A()
            goto L_0x015f
        L_0x0148:
            boolean r5 = r5.r()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            goto L_0x0183
        L_0x0151:
            int r5 = r5.q()
            goto L_0x015f
        L_0x0156:
            long r0 = r5.h()
            goto L_0x016d
        L_0x015b:
            int r5 = r5.B()
        L_0x015f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            goto L_0x0183
        L_0x0164:
            long r0 = r5.f()
            goto L_0x016d
        L_0x0169:
            long r0 = r5.K()
        L_0x016d:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            goto L_0x0183
        L_0x0172:
            float r5 = r5.readFloat()
            java.lang.Float r1 = java.lang.Float.valueOf(r5)
            goto L_0x0183
        L_0x017b:
            double r0 = r5.readDouble()
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
        L_0x0183:
            boolean r5 = r6.d()
            if (r5 == 0) goto L_0x018f
            androidx.datastore.preferences.protobuf.y$d r5 = r6.f2134b
            r8.a(r5, r1)
            goto L_0x01b5
        L_0x018f:
            int[] r5 = androidx.datastore.preferences.protobuf.r.a.f2056a
            androidx.datastore.preferences.protobuf.t1$b r7 = r6.a()
            int r7 = r7.ordinal()
            r5 = r5[r7]
            r7 = 17
            if (r5 == r7) goto L_0x01a4
            r7 = 18
            if (r5 == r7) goto L_0x01a4
            goto L_0x01b0
        L_0x01a4:
            androidx.datastore.preferences.protobuf.y$d r5 = r6.f2134b
            java.lang.Object r5 = r8.i(r5)
            if (r5 == 0) goto L_0x01b0
            java.lang.Object r1 = androidx.datastore.preferences.protobuf.a0.h(r5, r1)
        L_0x01b0:
            androidx.datastore.preferences.protobuf.y$d r5 = r6.f2134b
            r8.x(r5, r1)
        L_0x01b5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.r.g(androidx.datastore.preferences.protobuf.f1, java.lang.Object, androidx.datastore.preferences.protobuf.p, androidx.datastore.preferences.protobuf.u, java.lang.Object, androidx.datastore.preferences.protobuf.n1):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    public void h(f1 f1Var, Object obj, p pVar, u<y.d> uVar) {
        y.e eVar = (y.e) obj;
        uVar.x(eVar.f2134b, f1Var.i(eVar.b().getClass(), pVar));
    }

    /* access modifiers changed from: package-private */
    public void i(h hVar, Object obj, p pVar, u<y.d> uVar) {
        y.e eVar = (y.e) obj;
        r0 g10 = eVar.b().h().g();
        e Q = e.Q(ByteBuffer.wrap(hVar.G()), true);
        c1.a().b(g10, Q, pVar);
        uVar.x(eVar.f2134b, g10);
        if (Q.s() != Integer.MAX_VALUE) {
            throw b0.a();
        }
    }

    /* access modifiers changed from: package-private */
    public void j(u1 u1Var, Map.Entry<?, ?> entry) {
        y.d dVar = (y.d) entry.getKey();
        if (dVar.f()) {
            switch (a.f2056a[dVar.h().ordinal()]) {
                case 1:
                    i1.P(dVar.getNumber(), (List) entry.getValue(), u1Var, dVar.isPacked());
                    return;
                case 2:
                    i1.T(dVar.getNumber(), (List) entry.getValue(), u1Var, dVar.isPacked());
                    return;
                case 3:
                    i1.W(dVar.getNumber(), (List) entry.getValue(), u1Var, dVar.isPacked());
                    return;
                case 4:
                    i1.e0(dVar.getNumber(), (List) entry.getValue(), u1Var, dVar.isPacked());
                    return;
                case 5:
                case 14:
                    i1.V(dVar.getNumber(), (List) entry.getValue(), u1Var, dVar.isPacked());
                    return;
                case 6:
                    i1.S(dVar.getNumber(), (List) entry.getValue(), u1Var, dVar.isPacked());
                    return;
                case 7:
                    i1.R(dVar.getNumber(), (List) entry.getValue(), u1Var, dVar.isPacked());
                    return;
                case 8:
                    i1.N(dVar.getNumber(), (List) entry.getValue(), u1Var, dVar.isPacked());
                    return;
                case 9:
                    i1.d0(dVar.getNumber(), (List) entry.getValue(), u1Var, dVar.isPacked());
                    return;
                case 10:
                    i1.Y(dVar.getNumber(), (List) entry.getValue(), u1Var, dVar.isPacked());
                    return;
                case 11:
                    i1.Z(dVar.getNumber(), (List) entry.getValue(), u1Var, dVar.isPacked());
                    return;
                case 12:
                    i1.a0(dVar.getNumber(), (List) entry.getValue(), u1Var, dVar.isPacked());
                    return;
                case 13:
                    i1.b0(dVar.getNumber(), (List) entry.getValue(), u1Var, dVar.isPacked());
                    return;
                case 15:
                    i1.O(dVar.getNumber(), (List) entry.getValue(), u1Var);
                    return;
                case 16:
                    i1.c0(dVar.getNumber(), (List) entry.getValue(), u1Var);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        i1.U(dVar.getNumber(), (List) entry.getValue(), u1Var, c1.a().d(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        i1.X(dVar.getNumber(), (List) entry.getValue(), u1Var, c1.a().d(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            switch (a.f2056a[dVar.h().ordinal()]) {
                case 1:
                    u1Var.n(dVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                    return;
                case 2:
                    u1Var.A(dVar.getNumber(), ((Float) entry.getValue()).floatValue());
                    return;
                case 3:
                    u1Var.c(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    u1Var.G(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 5:
                case 14:
                    u1Var.i(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 6:
                    u1Var.w(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 7:
                    u1Var.m(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 8:
                    u1Var.d(dVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 9:
                    u1Var.e(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 10:
                    u1Var.g(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 11:
                    u1Var.o(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 12:
                    u1Var.M(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    u1Var.z(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 15:
                    u1Var.l(dVar.getNumber(), (h) entry.getValue());
                    return;
                case 16:
                    u1Var.E(dVar.getNumber(), (String) entry.getValue());
                    return;
                case 17:
                    u1Var.O(dVar.getNumber(), entry.getValue(), c1.a().d(entry.getValue().getClass()));
                    return;
                case 18:
                    u1Var.s(dVar.getNumber(), entry.getValue(), c1.a().d(entry.getValue().getClass()));
                    return;
                default:
                    return;
            }
        }
    }
}
