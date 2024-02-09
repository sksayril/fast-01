package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.w1;

final class ia implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ w1 f6137m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ String f6138n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ String f6139o;

    /* renamed from: p  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f6140p;

    ia(AppMeasurementDynamiteService appMeasurementDynamiteService, w1 w1Var, String str, String str2) {
        this.f6140p = appMeasurementDynamiteService;
        this.f6137m = w1Var;
        this.f6138n = str;
        this.f6139o = str2;
    }

    public final void run() {
        this.f6140p.f5830c.I().E(this.f6137m, this.f6138n, this.f6139o);
    }
}
