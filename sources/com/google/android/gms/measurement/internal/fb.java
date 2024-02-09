package com.google.android.gms.measurement.internal;

import android.content.Intent;

public final /* synthetic */ class fb implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private /* synthetic */ db f6033m;

    /* renamed from: n  reason: collision with root package name */
    private /* synthetic */ int f6034n;

    /* renamed from: o  reason: collision with root package name */
    private /* synthetic */ x4 f6035o;

    /* renamed from: p  reason: collision with root package name */
    private /* synthetic */ Intent f6036p;

    public /* synthetic */ fb(db dbVar, int i10, x4 x4Var, Intent intent) {
        this.f6033m = dbVar;
        this.f6034n = i10;
        this.f6035o = x4Var;
        this.f6036p = intent;
    }

    public final void run() {
        this.f6033m.d(this.f6034n, this.f6035o, this.f6036p);
    }
}
