package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import h2.p;
import java.util.concurrent.atomic.AtomicReference;

final class ga implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f6062m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ sc f6063n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ y9 f6064o;

    ga(y9 y9Var, AtomicReference atomicReference, sc scVar) {
        this.f6064o = y9Var;
        this.f6062m = atomicReference;
        this.f6063n = scVar;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f6062m) {
            try {
                if (!this.f6064o.g().I().y()) {
                    this.f6064o.k().L().a("Analytics storage consent denied; will not get app instance id");
                    this.f6064o.q().S((String) null);
                    this.f6064o.g().f6236g.b((String) null);
                    this.f6062m.set((Object) null);
                    this.f6062m.notify();
                    return;
                }
                q4 A = this.f6064o.f6749d;
                if (A == null) {
                    this.f6064o.k().F().a("Failed to get app instance id");
                    this.f6062m.notify();
                    return;
                }
                p.j(this.f6063n);
                this.f6062m.set(A.K1(this.f6063n));
                String str = (String) this.f6062m.get();
                if (str != null) {
                    this.f6064o.q().S(str);
                    this.f6064o.g().f6236g.b(str);
                }
                this.f6064o.f0();
                atomicReference = this.f6062m;
                atomicReference.notify();
            } catch (RemoteException e10) {
                try {
                    this.f6064o.k().F().b("Failed to get app instance id", e10);
                    atomicReference = this.f6062m;
                } catch (Throwable th) {
                    this.f6062m.notify();
                    throw th;
                }
            }
        }
    }
}
