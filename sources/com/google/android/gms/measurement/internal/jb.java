package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

final class jb implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService.a f6171m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f6172n;

    jb(AppMeasurementDynamiteService appMeasurementDynamiteService, AppMeasurementDynamiteService.a aVar) {
        this.f6172n = appMeasurementDynamiteService;
        this.f6171m = aVar;
    }

    public final void run() {
        this.f6172n.f5830c.G().L(this.f6171m);
    }
}
