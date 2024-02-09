package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

final class xa implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ ComponentName f6714m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ va f6715n;

    xa(va vaVar, ComponentName componentName) {
        this.f6715n = vaVar;
        this.f6714m = componentName;
    }

    public final void run() {
        y9.L(this.f6715n.f6636c, this.f6714m);
    }
}
