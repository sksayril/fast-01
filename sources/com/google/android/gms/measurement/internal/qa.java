package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import h2.p;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

final class qa implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f6481m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ String f6482n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ String f6483o;

    /* renamed from: p  reason: collision with root package name */
    private final /* synthetic */ String f6484p;

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ sc f6485q;

    /* renamed from: r  reason: collision with root package name */
    private final /* synthetic */ y9 f6486r;

    qa(y9 y9Var, AtomicReference atomicReference, String str, String str2, String str3, sc scVar) {
        this.f6486r = y9Var;
        this.f6481m = atomicReference;
        this.f6482n = str;
        this.f6483o = str2;
        this.f6484p = str3;
        this.f6485q = scVar;
    }

    public final void run() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        List<e> z22;
        synchronized (this.f6481m) {
            try {
                q4 A = this.f6486r.f6749d;
                if (A == null) {
                    this.f6486r.k().F().d("(legacy) Failed to get conditional properties; not connected to service", x4.u(this.f6482n), this.f6483o, this.f6484p);
                    this.f6481m.set(Collections.emptyList());
                    this.f6481m.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f6482n)) {
                    p.j(this.f6485q);
                    atomicReference2 = this.f6481m;
                    z22 = A.c0(this.f6483o, this.f6484p, this.f6485q);
                } else {
                    atomicReference2 = this.f6481m;
                    z22 = A.z2(this.f6482n, this.f6483o, this.f6484p);
                }
                atomicReference2.set(z22);
                this.f6486r.f0();
                atomicReference = this.f6481m;
                atomicReference.notify();
            } catch (RemoteException e10) {
                try {
                    this.f6486r.k().F().d("(legacy) Failed to get conditional properties; remote exception", x4.u(this.f6482n), this.f6483o, e10);
                    this.f6481m.set(Collections.emptyList());
                    atomicReference = this.f6481m;
                } catch (Throwable th) {
                    this.f6481m.notify();
                    throw th;
                }
            }
        }
    }
}
