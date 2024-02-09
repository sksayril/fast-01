package com.google.android.gms.measurement.internal;

import h2.p;

final class ea implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ sc f6005m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ boolean f6006n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ nc f6007o;

    /* renamed from: p  reason: collision with root package name */
    private final /* synthetic */ y9 f6008p;

    ea(y9 y9Var, sc scVar, boolean z9, nc ncVar) {
        this.f6008p = y9Var;
        this.f6005m = scVar;
        this.f6006n = z9;
        this.f6007o = ncVar;
    }

    public final void run() {
        q4 A = this.f6008p.f6749d;
        if (A == null) {
            this.f6008p.k().F().a("Discarding data. Failed to set user property");
            return;
        }
        p.j(this.f6005m);
        this.f6008p.J(A, this.f6006n ? null : this.f6007o, this.f6005m);
        this.f6008p.f0();
    }
}
