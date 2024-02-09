package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.w1;

final class i9 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ w1 f6133m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ i0 f6134n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ String f6135o;

    /* renamed from: p  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f6136p;

    i9(AppMeasurementDynamiteService appMeasurementDynamiteService, w1 w1Var, i0 i0Var, String str) {
        this.f6136p = appMeasurementDynamiteService;
        this.f6133m = w1Var;
        this.f6134n = i0Var;
        this.f6135o = str;
    }

    public final void run() {
        this.f6136p.f5830c.I().D(this.f6133m, this.f6134n, this.f6135o);
    }
}
