package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.w1;

final class kc implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ w1 f6265m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f6266n;

    kc(AppMeasurementDynamiteService appMeasurementDynamiteService, w1 w1Var) {
        this.f6266n = appMeasurementDynamiteService;
        this.f6265m = w1Var;
    }

    public final void run() {
        this.f6266n.f5830c.K().S(this.f6265m, this.f6266n.f5830c.n());
    }
}
