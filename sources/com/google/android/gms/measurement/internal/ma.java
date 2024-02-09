package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import h2.p;

final class ma implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ sc f6327m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ y9 f6328n;

    ma(y9 y9Var, sc scVar) {
        this.f6328n = y9Var;
        this.f6327m = scVar;
    }

    public final void run() {
        q4 A = this.f6328n.f6749d;
        if (A == null) {
            this.f6328n.k().F().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            p.j(this.f6327m);
            A.d1(this.f6327m);
            this.f6328n.f0();
        } catch (RemoteException e10) {
            this.f6328n.k().F().b("Failed to send measurementEnabled to the service", e10);
        }
    }
}
