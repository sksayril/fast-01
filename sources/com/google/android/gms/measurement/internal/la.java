package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import h2.p;

final class la implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ sc f6279m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ Bundle f6280n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ y9 f6281o;

    la(y9 y9Var, sc scVar, Bundle bundle) {
        this.f6281o = y9Var;
        this.f6279m = scVar;
        this.f6280n = bundle;
    }

    public final void run() {
        q4 A = this.f6281o.f6749d;
        if (A == null) {
            this.f6281o.k().F().a("Failed to send default event parameters to service");
            return;
        }
        try {
            p.j(this.f6279m);
            A.c1(this.f6280n, this.f6279m);
        } catch (RemoteException e10) {
            this.f6281o.k().F().b("Failed to send default event parameters to service", e10);
        }
    }
}
