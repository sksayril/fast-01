package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import h2.p;
import i2.a;

final class ja implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ sc f6169m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ y9 f6170n;

    ja(y9 y9Var, sc scVar) {
        this.f6170n = y9Var;
        this.f6169m = scVar;
    }

    public final void run() {
        q4 A = this.f6170n.f6749d;
        if (A == null) {
            this.f6170n.k().F().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            p.j(this.f6169m);
            A.y2(this.f6169m);
            this.f6170n.p().I();
            this.f6170n.J(A, (a) null, this.f6169m);
            this.f6170n.f0();
        } catch (RemoteException e10) {
            this.f6170n.k().F().b("Failed to send app launch to the service", e10);
        }
    }
}
