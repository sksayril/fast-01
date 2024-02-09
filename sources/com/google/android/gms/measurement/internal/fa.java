package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.w1;
import h2.p;

final class fa implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ sc f6030m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ w1 f6031n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ y9 f6032o;

    fa(y9 y9Var, sc scVar, w1 w1Var) {
        this.f6032o = y9Var;
        this.f6030m = scVar;
        this.f6031n = w1Var;
    }

    public final void run() {
        String str = null;
        try {
            if (!this.f6032o.g().I().y()) {
                this.f6032o.k().L().a("Analytics storage consent denied; will not get app instance id");
                this.f6032o.q().S((String) null);
                this.f6032o.g().f6236g.b((String) null);
            } else {
                q4 A = this.f6032o.f6749d;
                if (A == null) {
                    this.f6032o.k().F().a("Failed to get app instance id");
                } else {
                    p.j(this.f6030m);
                    str = A.K1(this.f6030m);
                    if (str != null) {
                        this.f6032o.q().S(str);
                        this.f6032o.g().f6236g.b(str);
                    }
                    this.f6032o.f0();
                }
            }
        } catch (RemoteException e10) {
            this.f6032o.k().F().b("Failed to get app instance id", e10);
        } catch (Throwable th) {
            this.f6032o.h().Q(this.f6031n, (String) null);
            throw th;
        }
        this.f6032o.h().Q(this.f6031n, str);
    }
}
