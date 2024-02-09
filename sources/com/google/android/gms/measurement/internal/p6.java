package com.google.android.gms.measurement.internal;

import android.os.Bundle;

public final /* synthetic */ class p6 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private /* synthetic */ q6 f6426m;

    /* renamed from: n  reason: collision with root package name */
    private /* synthetic */ String f6427n;

    /* renamed from: o  reason: collision with root package name */
    private /* synthetic */ Bundle f6428o;

    public /* synthetic */ p6(q6 q6Var, String str, Bundle bundle) {
        this.f6426m = q6Var;
        this.f6427n = str;
        this.f6428o = bundle;
    }

    public final void run() {
        this.f6426m.e3(this.f6427n, this.f6428o);
    }
}
