package com.google.android.gms.measurement.internal;

final class w6 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ e f6660m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ q6 f6661n;

    w6(q6 q6Var, e eVar) {
        this.f6661n = q6Var;
        this.f6660m = eVar;
    }

    public final void run() {
        this.f6661n.f6463c.n0();
        if (this.f6660m.f5971o.d() == null) {
            this.f6661n.f6463c.q(this.f6660m);
        } else {
            this.f6661n.f6463c.R(this.f6660m);
        }
    }
}
