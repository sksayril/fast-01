package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

final class za implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ va f6780m;

    za(va vaVar) {
        this.f6780m = vaVar;
    }

    public final void run() {
        y9.L(this.f6780m.f6636c, new ComponentName(this.f6780m.f6636c.zza(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
