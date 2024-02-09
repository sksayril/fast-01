package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import h2.p;

final class oa implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ boolean f6390m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ sc f6391n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ boolean f6392o;

    /* renamed from: p  reason: collision with root package name */
    private final /* synthetic */ i0 f6393p;

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ String f6394q;

    /* renamed from: r  reason: collision with root package name */
    private final /* synthetic */ y9 f6395r;

    oa(y9 y9Var, boolean z9, sc scVar, boolean z10, i0 i0Var, String str) {
        this.f6395r = y9Var;
        this.f6390m = z9;
        this.f6391n = scVar;
        this.f6392o = z10;
        this.f6393p = i0Var;
        this.f6394q = str;
    }

    public final void run() {
        q4 A = this.f6395r.f6749d;
        if (A == null) {
            this.f6395r.k().F().a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f6390m) {
            p.j(this.f6391n);
            this.f6395r.J(A, this.f6392o ? null : this.f6393p, this.f6391n);
        } else {
            try {
                if (TextUtils.isEmpty(this.f6394q)) {
                    p.j(this.f6391n);
                    A.a2(this.f6393p, this.f6391n);
                } else {
                    A.P1(this.f6393p, this.f6394q, this.f6395r.k().N());
                }
            } catch (RemoteException e10) {
                this.f6395r.k().F().b("Failed to send event to the service", e10);
            }
        }
        this.f6395r.f0();
    }
}
