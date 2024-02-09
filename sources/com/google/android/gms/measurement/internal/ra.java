package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import h2.p;

final class ra implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ boolean f6522m = true;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ sc f6523n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ boolean f6524o;

    /* renamed from: p  reason: collision with root package name */
    private final /* synthetic */ e f6525p;

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ e f6526q;

    /* renamed from: r  reason: collision with root package name */
    private final /* synthetic */ y9 f6527r;

    ra(y9 y9Var, boolean z9, sc scVar, boolean z10, e eVar, e eVar2) {
        this.f6527r = y9Var;
        this.f6523n = scVar;
        this.f6524o = z10;
        this.f6525p = eVar;
        this.f6526q = eVar2;
    }

    public final void run() {
        q4 A = this.f6527r.f6749d;
        if (A == null) {
            this.f6527r.k().F().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f6522m) {
            p.j(this.f6523n);
            this.f6527r.J(A, this.f6524o ? null : this.f6525p, this.f6523n);
        } else {
            try {
                if (TextUtils.isEmpty(this.f6526q.f5969m)) {
                    p.j(this.f6523n);
                    A.G2(this.f6525p, this.f6523n);
                } else {
                    A.x0(this.f6525p);
                }
            } catch (RemoteException e10) {
                this.f6527r.k().F().b("Failed to send conditional user property to the service", e10);
            }
        }
        this.f6527r.f0();
    }
}
