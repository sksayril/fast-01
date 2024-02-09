package b9;

import i9.h;
import j8.d;
import kotlin.jvm.internal.l;

public abstract class u0<T> extends h {

    /* renamed from: o  reason: collision with root package name */
    public int f3492o;

    public u0(int i10) {
        this.f3492o = i10;
    }

    public void a(Object obj, Throwable th) {
    }

    public abstract d<T> b();

    public Throwable c(Object obj) {
        z zVar = obj instanceof z ? (z) obj : null;
        if (zVar != null) {
            return zVar.f3519a;
        }
        return null;
    }

    public <T> T g(Object obj) {
        return obj;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                b.a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            l.b(th);
            i0.a(b().getContext(), new m0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    public abstract Object k();

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0081, code lost:
        if (r4.M0() != false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00aa, code lost:
        if (r4.M0() != false) goto L_0x00ac;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            i9.i r0 = r10.f9642n
            j8.d r1 = r10.b()     // Catch:{ all -> 0x00b0 }
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            kotlin.jvm.internal.l.c(r1, r2)     // Catch:{ all -> 0x00b0 }
            g9.j r1 = (g9.j) r1     // Catch:{ all -> 0x00b0 }
            j8.d<T> r2 = r1.f8996q     // Catch:{ all -> 0x00b0 }
            java.lang.Object r1 = r1.f8998s     // Catch:{ all -> 0x00b0 }
            j8.g r3 = r2.getContext()     // Catch:{ all -> 0x00b0 }
            java.lang.Object r1 = g9.l0.c(r3, r1)     // Catch:{ all -> 0x00b0 }
            g9.h0 r4 = g9.l0.f9003a     // Catch:{ all -> 0x00b0 }
            r5 = 0
            if (r1 == r4) goto L_0x0023
            b9.o2 r4 = b9.f0.g(r2, r3, r1)     // Catch:{ all -> 0x00b0 }
            goto L_0x0024
        L_0x0023:
            r4 = r5
        L_0x0024:
            j8.g r6 = r2.getContext()     // Catch:{ all -> 0x00a3 }
            java.lang.Object r7 = r10.k()     // Catch:{ all -> 0x00a3 }
            java.lang.Throwable r8 = r10.c(r7)     // Catch:{ all -> 0x00a3 }
            if (r8 != 0) goto L_0x0043
            int r9 = r10.f3492o     // Catch:{ all -> 0x00a3 }
            boolean r9 = b9.v0.b(r9)     // Catch:{ all -> 0x00a3 }
            if (r9 == 0) goto L_0x0043
            b9.r1$b r9 = b9.r1.f3485c     // Catch:{ all -> 0x00a3 }
            j8.g$b r6 = r6.a(r9)     // Catch:{ all -> 0x00a3 }
            b9.r1 r6 = (b9.r1) r6     // Catch:{ all -> 0x00a3 }
            goto L_0x0044
        L_0x0043:
            r6 = r5
        L_0x0044:
            if (r6 == 0) goto L_0x0061
            boolean r9 = r6.b()     // Catch:{ all -> 0x00a3 }
            if (r9 != 0) goto L_0x0061
            java.util.concurrent.CancellationException r6 = r6.y()     // Catch:{ all -> 0x00a3 }
            r10.a(r7, r6)     // Catch:{ all -> 0x00a3 }
            g8.m$a r7 = g8.m.f8970m     // Catch:{ all -> 0x00a3 }
            java.lang.Object r6 = g8.n.a(r6)     // Catch:{ all -> 0x00a3 }
            java.lang.Object r6 = g8.m.a(r6)     // Catch:{ all -> 0x00a3 }
        L_0x005d:
            r2.resumeWith(r6)     // Catch:{ all -> 0x00a3 }
            goto L_0x0079
        L_0x0061:
            if (r8 == 0) goto L_0x006e
            g8.m$a r6 = g8.m.f8970m     // Catch:{ all -> 0x00a3 }
            java.lang.Object r6 = g8.n.a(r8)     // Catch:{ all -> 0x00a3 }
            java.lang.Object r6 = g8.m.a(r6)     // Catch:{ all -> 0x00a3 }
            goto L_0x005d
        L_0x006e:
            g8.m$a r6 = g8.m.f8970m     // Catch:{ all -> 0x00a3 }
            java.lang.Object r6 = r10.g(r7)     // Catch:{ all -> 0x00a3 }
            java.lang.Object r6 = g8.m.a(r6)     // Catch:{ all -> 0x00a3 }
            goto L_0x005d
        L_0x0079:
            g8.s r2 = g8.s.f8976a     // Catch:{ all -> 0x00a3 }
            if (r4 == 0) goto L_0x0083
            boolean r4 = r4.M0()     // Catch:{ all -> 0x00b0 }
            if (r4 == 0) goto L_0x0086
        L_0x0083:
            g9.l0.a(r3, r1)     // Catch:{ all -> 0x00b0 }
        L_0x0086:
            g8.m$a r1 = g8.m.f8970m     // Catch:{ all -> 0x0090 }
            r0.a()     // Catch:{ all -> 0x0090 }
            java.lang.Object r0 = g8.m.a(r2)     // Catch:{ all -> 0x0090 }
            goto L_0x009b
        L_0x0090:
            r0 = move-exception
            g8.m$a r1 = g8.m.f8970m
            java.lang.Object r0 = g8.n.a(r0)
            java.lang.Object r0 = g8.m.a(r0)
        L_0x009b:
            java.lang.Throwable r0 = g8.m.b(r0)
            r10.h(r5, r0)
            goto L_0x00cf
        L_0x00a3:
            r2 = move-exception
            if (r4 == 0) goto L_0x00ac
            boolean r4 = r4.M0()     // Catch:{ all -> 0x00b0 }
            if (r4 == 0) goto L_0x00af
        L_0x00ac:
            g9.l0.a(r3, r1)     // Catch:{ all -> 0x00b0 }
        L_0x00af:
            throw r2     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r1 = move-exception
            g8.m$a r2 = g8.m.f8970m     // Catch:{ all -> 0x00bd }
            r0.a()     // Catch:{ all -> 0x00bd }
            g8.s r0 = g8.s.f8976a     // Catch:{ all -> 0x00bd }
            java.lang.Object r0 = g8.m.a(r0)     // Catch:{ all -> 0x00bd }
            goto L_0x00c8
        L_0x00bd:
            r0 = move-exception
            g8.m$a r2 = g8.m.f8970m
            java.lang.Object r0 = g8.n.a(r0)
            java.lang.Object r0 = g8.m.a(r0)
        L_0x00c8:
            java.lang.Throwable r0 = g8.m.b(r0)
            r10.h(r1, r0)
        L_0x00cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.u0.run():void");
    }
}
