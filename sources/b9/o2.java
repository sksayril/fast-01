package b9;

import g8.l;
import g8.p;
import g8.s;
import g9.d0;
import g9.l0;
import j8.d;
import j8.g;

public final class o2<T> extends d0<T> {

    /* renamed from: q  reason: collision with root package name */
    private final ThreadLocal<l<g, Object>> f3476q;
    private volatile boolean threadLocalIsSet;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o2(j8.g r3, j8.d<? super T> r4) {
        /*
            r2 = this;
            b9.p2 r0 = b9.p2.f3482m
            j8.g$b r1 = r3.a(r0)
            if (r1 != 0) goto L_0x000d
            j8.g r0 = r3.t(r0)
            goto L_0x000e
        L_0x000d:
            r0 = r3
        L_0x000e:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f3476q = r0
            j8.g r4 = r4.getContext()
            j8.e$b r0 = j8.e.f10860l
            j8.g$b r4 = r4.a(r0)
            boolean r4 = r4 instanceof b9.g0
            if (r4 != 0) goto L_0x0031
            r4 = 0
            java.lang.Object r4 = g9.l0.c(r3, r4)
            g9.l0.a(r3, r4)
            r2.N0(r3, r4)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.o2.<init>(j8.g, j8.d):void");
    }

    /* access modifiers changed from: protected */
    public void I0(Object obj) {
        if (this.threadLocalIsSet) {
            l lVar = this.f3476q.get();
            if (lVar != null) {
                l0.a((g) lVar.a(), lVar.b());
            }
            this.f3476q.remove();
        }
        Object a10 = d0.a(obj, this.f8982p);
        d<T> dVar = this.f8982p;
        g context = dVar.getContext();
        o2<?> o2Var = null;
        Object c10 = l0.c(context, o2Var);
        if (c10 != l0.f9003a) {
            o2Var = f0.g(dVar, context, c10);
        }
        try {
            this.f8982p.resumeWith(a10);
            s sVar = s.f8976a;
        } finally {
            if (o2Var == null || o2Var.M0()) {
                l0.a(context, c10);
            }
        }
    }

    public final boolean M0() {
        boolean z9 = this.threadLocalIsSet && this.f3476q.get() == null;
        this.f3476q.remove();
        return !z9;
    }

    public final void N0(g gVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f3476q.set(p.a(gVar, obj));
    }
}
