package h6;

final class f {

    /* renamed from: a  reason: collision with root package name */
    private final a f9402a;

    /* renamed from: b  reason: collision with root package name */
    private final g[] f9403b;

    /* renamed from: c  reason: collision with root package name */
    private c f9404c;

    /* renamed from: d  reason: collision with root package name */
    private final int f9405d;

    f(a aVar, c cVar) {
        this.f9402a = aVar;
        int a10 = aVar.a();
        this.f9405d = a10;
        this.f9404c = cVar;
        this.f9403b = new g[(a10 + 2)];
    }

    private void a(g gVar) {
        if (gVar != null) {
            ((h) gVar).g(this.f9402a);
        }
    }

    private static boolean b(d dVar, d dVar2) {
        if (dVar2 == null || !dVar2.g() || dVar2.a() != dVar.a()) {
            return false;
        }
        dVar.i(dVar2.c());
        return true;
    }

    private static int c(int i10, int i11, d dVar) {
        if (dVar == null || dVar.g()) {
            return i11;
        }
        if (!dVar.h(i10)) {
            return i11 + 1;
        }
        dVar.i(i10);
        return 0;
    }

    private int d() {
        int f10 = f();
        if (f10 == 0) {
            return 0;
        }
        for (int i10 = 1; i10 < this.f9405d + 1; i10++) {
            d[] d10 = this.f9403b[i10].d();
            for (int i11 = 0; i11 < d10.length; i11++) {
                if (d10[i11] != null && !d10[i11].g()) {
                    e(i10, i11, d10);
                }
            }
        }
        return f10;
    }

    private void e(int i10, int i11, d[] dVarArr) {
        d dVar = dVarArr[i11];
        d[] d10 = this.f9403b[i10 - 1].d();
        g[] gVarArr = this.f9403b;
        int i12 = i10 + 1;
        d[] d11 = gVarArr[i12] != null ? gVarArr[i12].d() : d10;
        d[] dVarArr2 = new d[14];
        dVarArr2[2] = d10[i11];
        dVarArr2[3] = d11[i11];
        int i13 = 0;
        if (i11 > 0) {
            int i14 = i11 - 1;
            dVarArr2[0] = dVarArr[i14];
            dVarArr2[4] = d10[i14];
            dVarArr2[5] = d11[i14];
        }
        if (i11 > 1) {
            int i15 = i11 - 2;
            dVarArr2[8] = dVarArr[i15];
            dVarArr2[10] = d10[i15];
            dVarArr2[11] = d11[i15];
        }
        if (i11 < dVarArr.length - 1) {
            int i16 = i11 + 1;
            dVarArr2[1] = dVarArr[i16];
            dVarArr2[6] = d10[i16];
            dVarArr2[7] = d11[i16];
        }
        if (i11 < dVarArr.length - 2) {
            int i17 = i11 + 2;
            dVarArr2[9] = dVarArr[i17];
            dVarArr2[12] = d10[i17];
            dVarArr2[13] = d11[i17];
        }
        while (i13 < 14 && !b(dVar, dVarArr2[i13])) {
            i13++;
        }
    }

    private int f() {
        g();
        return h() + i();
    }

    private void g() {
        g[] gVarArr = this.f9403b;
        if (gVarArr[0] != null && gVarArr[this.f9405d + 1] != null) {
            d[] d10 = gVarArr[0].d();
            d[] d11 = this.f9403b[this.f9405d + 1].d();
            for (int i10 = 0; i10 < d10.length; i10++) {
                if (!(d10[i10] == null || d11[i10] == null || d10[i10].c() != d11[i10].c())) {
                    for (int i11 = 1; i11 <= this.f9405d; i11++) {
                        d dVar = this.f9403b[i11].d()[i10];
                        if (dVar != null) {
                            dVar.i(d10[i10].c());
                            if (!dVar.g()) {
                                this.f9403b[i11].d()[i10] = null;
                            }
                        }
                    }
                }
            }
        }
    }

    private int h() {
        g[] gVarArr = this.f9403b;
        if (gVarArr[0] == null) {
            return 0;
        }
        d[] d10 = gVarArr[0].d();
        int i10 = 0;
        for (int i11 = 0; i11 < d10.length; i11++) {
            if (d10[i11] != null) {
                int c10 = d10[i11].c();
                int i12 = 0;
                for (int i13 = 1; i13 < this.f9405d + 1 && i12 < 2; i13++) {
                    d dVar = this.f9403b[i13].d()[i11];
                    if (dVar != null) {
                        i12 = c(c10, i12, dVar);
                        if (!dVar.g()) {
                            i10++;
                        }
                    }
                }
            }
        }
        return i10;
    }

    private int i() {
        g[] gVarArr = this.f9403b;
        int i10 = this.f9405d;
        if (gVarArr[i10 + 1] == null) {
            return 0;
        }
        d[] d10 = gVarArr[i10 + 1].d();
        int i11 = 0;
        for (int i12 = 0; i12 < d10.length; i12++) {
            if (d10[i12] != null) {
                int c10 = d10[i12].c();
                int i13 = 0;
                for (int i14 = this.f9405d + 1; i14 > 0 && i13 < 2; i14--) {
                    d dVar = this.f9403b[i14].d()[i12];
                    if (dVar != null) {
                        i13 = c(c10, i13, dVar);
                        if (!dVar.g()) {
                            i11++;
                        }
                    }
                }
            }
        }
        return i11;
    }

    /* access modifiers changed from: package-private */
    public int j() {
        return this.f9405d;
    }

    /* access modifiers changed from: package-private */
    public int k() {
        return this.f9402a.b();
    }

    /* access modifiers changed from: package-private */
    public int l() {
        return this.f9402a.c();
    }

    /* access modifiers changed from: package-private */
    public c m() {
        return this.f9404c;
    }

    /* access modifiers changed from: package-private */
    public g n(int i10) {
        return this.f9403b[i10];
    }

    /* access modifiers changed from: package-private */
    public g[] o() {
        a(this.f9403b[0]);
        a(this.f9403b[this.f9405d + 1]);
        int i10 = 928;
        while (true) {
            int d10 = d();
            if (d10 > 0 && d10 < i10) {
                i10 = d10;
            }
        }
        return this.f9403b;
    }

    /* access modifiers changed from: package-private */
    public void p(c cVar) {
        this.f9404c = cVar;
    }

    /* access modifiers changed from: package-private */
    public void q(int i10, g gVar) {
        this.f9403b[i10] = gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0083, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0084, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0087, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r10 = this;
            h6.g[] r0 = r10.f9403b
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            if (r2 != 0) goto L_0x000d
            int r2 = r10.f9405d
            int r2 = r2 + r3
            r2 = r0[r2]
        L_0x000d:
            java.util.Formatter r0 = new java.util.Formatter
            r0.<init>()
            r4 = 0
        L_0x0013:
            h6.d[] r5 = r2.d()     // Catch:{ all -> 0x007c }
            int r5 = r5.length     // Catch:{ all -> 0x007c }
            if (r4 >= r5) goto L_0x0074
            java.lang.String r5 = "CW %3d:"
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x007c }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x007c }
            r6[r1] = r7     // Catch:{ all -> 0x007c }
            r0.format(r5, r6)     // Catch:{ all -> 0x007c }
            r5 = 0
        L_0x0028:
            int r6 = r10.f9405d     // Catch:{ all -> 0x007c }
            r7 = 2
            int r6 = r6 + r7
            if (r5 >= r6) goto L_0x006a
            h6.g[] r6 = r10.f9403b     // Catch:{ all -> 0x007c }
            r8 = r6[r5]     // Catch:{ all -> 0x007c }
            java.lang.String r9 = "    |   "
            if (r8 != 0) goto L_0x003c
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x007c }
            r0.format(r9, r6)     // Catch:{ all -> 0x007c }
            goto L_0x0067
        L_0x003c:
            r6 = r6[r5]     // Catch:{ all -> 0x007c }
            h6.d[] r6 = r6.d()     // Catch:{ all -> 0x007c }
            r6 = r6[r4]     // Catch:{ all -> 0x007c }
            if (r6 != 0) goto L_0x004c
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x007c }
            r0.format(r9, r6)     // Catch:{ all -> 0x007c }
            goto L_0x0067
        L_0x004c:
            java.lang.String r8 = " %3d|%3d"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x007c }
            int r9 = r6.c()     // Catch:{ all -> 0x007c }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x007c }
            r7[r1] = r9     // Catch:{ all -> 0x007c }
            int r6 = r6.e()     // Catch:{ all -> 0x007c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x007c }
            r7[r3] = r6     // Catch:{ all -> 0x007c }
            r0.format(r8, r7)     // Catch:{ all -> 0x007c }
        L_0x0067:
            int r5 = r5 + 1
            goto L_0x0028
        L_0x006a:
            java.lang.String r5 = "%n"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x007c }
            r0.format(r5, r6)     // Catch:{ all -> 0x007c }
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0074:
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x007c }
            r0.close()
            return r1
        L_0x007c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007e }
        L_0x007e:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x0083 }
            goto L_0x0087
        L_0x0083:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0087:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h6.f.toString():java.lang.String");
    }
}
