package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

public final /* synthetic */ class e8 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private /* synthetic */ y7 f6000m;

    /* renamed from: n  reason: collision with root package name */
    private /* synthetic */ Bundle f6001n;

    /* renamed from: o  reason: collision with root package name */
    private /* synthetic */ long f6002o;

    public /* synthetic */ e8(y7 y7Var, Bundle bundle, long j10) {
        this.f6000m = y7Var;
        this.f6001n = bundle;
        this.f6002o = j10;
    }

    public final void run() {
        y7 y7Var = this.f6000m;
        Bundle bundle = this.f6001n;
        long j10 = this.f6002o;
        if (TextUtils.isEmpty(y7Var.o().F())) {
            y7Var.F(bundle, 0, j10);
        } else {
            y7Var.k().L().a("Using developer consent only; google app id found");
        }
    }
}
