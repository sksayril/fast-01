package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import h2.p;

final class fc implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ String f6037m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ String f6038n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ Bundle f6039o;

    /* renamed from: p  reason: collision with root package name */
    private final /* synthetic */ gc f6040p;

    fc(gc gcVar, String str, String str2, Bundle bundle) {
        this.f6040p = gcVar;
        this.f6037m = str;
        this.f6038n = str2;
        this.f6039o = bundle;
    }

    public final void run() {
        this.f6040p.f6070a.t((i0) p.j(this.f6040p.f6070a.m0().F(this.f6037m, this.f6038n, this.f6039o, "auto", this.f6040p.f6070a.a().a(), false, true)), this.f6037m);
    }
}
