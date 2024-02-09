package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import h2.p;

final class da implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ sc f5962m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ y9 f5963n;

    da(y9 y9Var, sc scVar) {
        this.f5963n = y9Var;
        this.f5962m = scVar;
    }

    public final void run() {
        q4 A = this.f5963n.f6749d;
        if (A == null) {
            this.f5963n.k().F().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            p.j(this.f5962m);
            A.l0(this.f5962m);
        } catch (RemoteException e10) {
            this.f5963n.k().F().b("Failed to reset data on the service: remote exception", e10);
        }
        this.f5963n.f0();
    }
}
