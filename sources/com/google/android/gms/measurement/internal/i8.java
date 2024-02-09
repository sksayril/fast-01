package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.w1;

final class i8 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ w1 f6128m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ String f6129n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ String f6130o;

    /* renamed from: p  reason: collision with root package name */
    private final /* synthetic */ boolean f6131p;

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f6132q;

    i8(AppMeasurementDynamiteService appMeasurementDynamiteService, w1 w1Var, String str, String str2, boolean z9) {
        this.f6132q = appMeasurementDynamiteService;
        this.f6128m = w1Var;
        this.f6129n = str;
        this.f6130o = str2;
        this.f6131p = z9;
    }

    public final void run() {
        this.f6132q.f5830c.I().F(this.f6128m, this.f6129n, this.f6130o, this.f6131p);
    }
}
