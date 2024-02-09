package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.kd;
import h2.p;

final class c7 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ sc f5922m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ q6 f5923n;

    c7(q6 q6Var, sc scVar) {
        this.f5923n = q6Var;
        this.f5922m = scVar;
    }

    public final void run() {
        this.f5923n.f6463c.n0();
        zb J = this.f5923n.f6463c;
        sc scVar = this.f5922m;
        J.i().m();
        J.o0();
        p.f(scVar.f6559m);
        p7 f10 = p7.f(scVar.H, (!kd.a() || !J.b0().r(k0.T0)) ? 100 : scVar.M);
        p7 P = J.P(scVar.f6559m);
        J.k().J().c("Setting consent, package, consent", scVar.f6559m, f10);
        J.B(scVar.f6559m, f10);
        if (f10.t(P)) {
            J.a0(scVar);
        }
        if (kd.a() && J.b0().r(k0.T0)) {
            z c10 = z.c(scVar.N);
            if (!z.f6758f.equals(c10)) {
                J.k().J().c("Setting DMA consent. package, consent", scVar.f6559m, c10);
                J.A(scVar.f6559m, c10);
            }
        }
    }
}
