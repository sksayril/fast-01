package com.google.android.gms.measurement.internal;

final class t6 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ e f6579m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ sc f6580n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ q6 f6581o;

    t6(q6 q6Var, e eVar, sc scVar) {
        this.f6581o = q6Var;
        this.f6579m = eVar;
        this.f6580n = scVar;
    }

    public final void run() {
        this.f6581o.f6463c.n0();
        if (this.f6579m.f5971o.d() == null) {
            this.f6581o.f6463c.r(this.f6579m, this.f6580n);
        } else {
            this.f6581o.f6463c.S(this.f6579m, this.f6580n);
        }
    }
}
