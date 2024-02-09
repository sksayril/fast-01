package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import h2.p;
import java.util.concurrent.atomic.AtomicReference;

final class ca implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f5928m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ sc f5929n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ Bundle f5930o;

    /* renamed from: p  reason: collision with root package name */
    private final /* synthetic */ y9 f5931p;

    ca(y9 y9Var, AtomicReference atomicReference, sc scVar, Bundle bundle) {
        this.f5931p = y9Var;
        this.f5928m = atomicReference;
        this.f5929n = scVar;
        this.f5930o = bundle;
    }

    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.f5928m) {
            try {
                q4 A = this.f5931p.f6749d;
                if (A == null) {
                    this.f5931p.k().F().a("Failed to get trigger URIs; not connected to service");
                    this.f5928m.notify();
                    return;
                }
                p.j(this.f5929n);
                this.f5928m.set(A.d2(this.f5929n, this.f5930o));
                this.f5931p.f0();
                atomicReference = this.f5928m;
                atomicReference.notify();
            } catch (RemoteException e10) {
                try {
                    this.f5931p.k().F().b("Failed to get trigger URIs; remote exception", e10);
                    atomicReference = this.f5928m;
                } catch (Throwable th) {
                    this.f5928m.notify();
                    throw th;
                }
            }
        }
    }
}
