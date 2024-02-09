package com.google.android.gms.measurement.internal;

final class f7 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ nc f6026m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ sc f6027n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ q6 f6028o;

    f7(q6 q6Var, nc ncVar, sc scVar) {
        this.f6028o = q6Var;
        this.f6026m = ncVar;
        this.f6027n = scVar;
    }

    public final void run() {
        this.f6028o.f6463c.n0();
        if (this.f6026m.d() == null) {
            this.f6028o.f6463c.D(this.f6026m.f6359n, this.f6027n);
        } else {
            this.f6028o.f6463c.w(this.f6026m, this.f6027n);
        }
    }
}
