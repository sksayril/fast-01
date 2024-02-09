package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import h2.p;

final class pa implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ sc f6441m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ y9 f6442n;

    pa(y9 y9Var, sc scVar) {
        this.f6442n = y9Var;
        this.f6441m = scVar;
    }

    public final void run() {
        q4 A = this.f6442n.f6749d;
        if (A == null) {
            this.f6442n.k().F().a("Failed to send consent settings to service");
            return;
        }
        try {
            p.j(this.f6441m);
            A.b1(this.f6441m);
            this.f6442n.f0();
        } catch (RemoteException e10) {
            this.f6442n.k().F().b("Failed to send consent settings to the service", e10);
        }
    }
}
