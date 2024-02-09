package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.w1;

final class h7 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ w1 f6107m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f6108n;

    h7(AppMeasurementDynamiteService appMeasurementDynamiteService, w1 w1Var) {
        this.f6108n = appMeasurementDynamiteService;
        this.f6107m = w1Var;
    }

    public final void run() {
        this.f6108n.f5830c.I().C(this.f6107m);
    }
}
