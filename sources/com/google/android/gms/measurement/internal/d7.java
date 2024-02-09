package com.google.android.gms.measurement.internal;

final class d7 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ i0 f5952m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ String f5953n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ q6 f5954o;

    d7(q6 q6Var, i0 i0Var, String str) {
        this.f5954o = q6Var;
        this.f5952m = i0Var;
        this.f5953n = str;
    }

    public final void run() {
        this.f5954o.f6463c.n0();
        this.f5954o.f6463c.t(this.f5952m, this.f5953n);
    }
}
