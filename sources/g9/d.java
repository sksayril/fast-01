package g9;

public final class d {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final h0 f8981a = new h0("CLOSED");

    public static final <N extends e<N>> N b(N n10) {
        while (true) {
            N a10 = n10.f();
            if (a10 == f8981a) {
                return n10;
            }
            N n11 = (e) a10;
            if (n11 != null) {
                n10 = n11;
            } else if (n10.j()) {
                return n10;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [r8.p<? super java.lang.Long, ? super S, ? extends S>, r8.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S extends g9.e0<S>> java.lang.Object c(S r4, long r5, r8.p<? super java.lang.Long, ? super S, ? extends S> r7) {
        /*
        L_0x0000:
            long r0 = r4.f8986o
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x0012
            boolean r0 = r4.h()
            if (r0 == 0) goto L_0x000d
            goto L_0x0012
        L_0x000d:
            java.lang.Object r4 = g9.f0.a(r4)
            return r4
        L_0x0012:
            java.lang.Object r0 = r4.f()
            g9.h0 r1 = f8981a
            if (r0 != r1) goto L_0x0023
            g9.h0 r4 = f8981a
            java.lang.Object r4 = g9.f0.a(r4)
            return r4
        L_0x0023:
            g9.e r0 = (g9.e) r0
            g9.e0 r0 = (g9.e0) r0
            if (r0 == 0) goto L_0x002b
        L_0x0029:
            r4 = r0
            goto L_0x0000
        L_0x002b:
            long r0 = r4.f8986o
            r2 = 1
            long r0 = r0 + r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r7.invoke(r0, r4)
            g9.e0 r0 = (g9.e0) r0
            boolean r1 = r4.l(r0)
            if (r1 == 0) goto L_0x0000
            boolean r1 = r4.h()
            if (r1 == 0) goto L_0x0029
            r4.k()
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.d.c(g9.e0, long, r8.p):java.lang.Object");
    }
}
