package g9;

import b9.c2;
import b9.s0;
import g8.d;
import j8.g;

final class y extends c2 implements s0 {

    /* renamed from: o  reason: collision with root package name */
    private final Throwable f9045o;

    /* renamed from: p  reason: collision with root package name */
    private final String f9046p;

    public y(Throwable th, String str) {
        this.f9045o = th;
        this.f9046p = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r1 == null) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Void O() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f9045o
            if (r0 == 0) goto L_0x0036
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f9046p
            if (r1 == 0) goto L_0x0025
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L_0x0027
        L_0x0025:
            java.lang.String r1 = ""
        L_0x0027:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f9045o
            r1.<init>(r0, r2)
            throw r1
        L_0x0036:
            g9.x.d()
            g8.d r0 = new g8.d
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.y.O():java.lang.Void");
    }

    public boolean J(g gVar) {
        O();
        throw new d();
    }

    public c2 L() {
        return this;
    }

    /* renamed from: N */
    public Void I(g gVar, Runnable runnable) {
        O();
        throw new d();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        if (this.f9045o != null) {
            str = ", cause=" + this.f9045o;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }
}
