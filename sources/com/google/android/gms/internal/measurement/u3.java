package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

public final class u3 {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f5636a;

    /* renamed from: b  reason: collision with root package name */
    final s6 f5637b;

    /* renamed from: c  reason: collision with root package name */
    final s6 f5638c;

    /* renamed from: d  reason: collision with root package name */
    private final ta f5639d;

    public u3() {
        d0 d0Var = new d0();
        this.f5636a = d0Var;
        s6 s6Var = new s6((s6) null, d0Var);
        this.f5638c = s6Var;
        this.f5637b = s6Var.d();
        ta taVar = new ta();
        this.f5639d = taVar;
        s6Var.h("require", new ug(taVar));
        taVar.b("internal.platform", w2.f5678a);
        s6Var.h("runtime.counter", new j(Double.valueOf(0.0d)));
    }

    public final r a(s6 s6Var, g5... g5VarArr) {
        r rVar = r.f5547d;
        for (g5 a10 : g5VarArr) {
            rVar = s8.a(a10);
            r5.b(this.f5638c);
            if ((rVar instanceof u) || (rVar instanceof s)) {
                rVar = this.f5636a.a(s6Var, rVar);
            }
        }
        return rVar;
    }

    public final void b(String str, Callable<? extends m> callable) {
        this.f5639d.b(str, callable);
    }
}
