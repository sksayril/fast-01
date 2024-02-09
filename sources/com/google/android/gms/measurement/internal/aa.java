package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.w1;
import h2.p;

final class aa implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ String f5864m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ String f5865n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ sc f5866o;

    /* renamed from: p  reason: collision with root package name */
    private final /* synthetic */ boolean f5867p;

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ w1 f5868q;

    /* renamed from: r  reason: collision with root package name */
    private final /* synthetic */ y9 f5869r;

    aa(y9 y9Var, String str, String str2, sc scVar, boolean z9, w1 w1Var) {
        this.f5869r = y9Var;
        this.f5864m = str;
        this.f5865n = str2;
        this.f5866o = scVar;
        this.f5867p = z9;
        this.f5868q = w1Var;
    }

    public final void run() {
        Bundle bundle = new Bundle();
        try {
            q4 A = this.f5869r.f6749d;
            if (A == null) {
                this.f5869r.k().F().c("Failed to get user properties; not connected to service", this.f5864m, this.f5865n);
            } else {
                p.j(this.f5866o);
                bundle = oc.E(A.u1(this.f5864m, this.f5865n, this.f5867p, this.f5866o));
                this.f5869r.f0();
            }
        } catch (RemoteException e10) {
            this.f5869r.k().F().c("Failed to get user properties; remote exception", this.f5864m, e10);
        } catch (Throwable th) {
            this.f5869r.h().P(this.f5868q, bundle);
            throw th;
        }
        this.f5869r.h().P(this.f5868q, bundle);
    }
}
