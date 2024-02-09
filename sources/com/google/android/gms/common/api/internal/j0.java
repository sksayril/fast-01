package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;
import e2.b;
import h2.p;

final class j0 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final h0 f5001m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ k0 f5002n;

    j0(k0 k0Var, h0 h0Var) {
        this.f5002n = k0Var;
        this.f5001m = h0Var;
    }

    public final void run() {
        if (this.f5002n.f5005n) {
            b b10 = this.f5001m.b();
            if (b10.i()) {
                k0 k0Var = this.f5002n;
                k0Var.f4931m.startActivityForResult(GoogleApiActivity.a(k0Var.b(), (PendingIntent) p.j(b10.g()), this.f5001m.a(), false), 1);
                return;
            }
            k0 k0Var2 = this.f5002n;
            if (k0Var2.f5008q.b(k0Var2.b(), b10.d(), (String) null) != null) {
                k0 k0Var3 = this.f5002n;
                k0Var3.f5008q.v(k0Var3.b(), this.f5002n.f4931m, b10.d(), 2, this.f5002n);
            } else if (b10.d() == 18) {
                k0 k0Var4 = this.f5002n;
                Dialog q9 = k0Var4.f5008q.q(k0Var4.b(), this.f5002n);
                k0 k0Var5 = this.f5002n;
                k0Var5.f5008q.r(k0Var5.b().getApplicationContext(), new i0(this, q9));
            } else {
                this.f5002n.l(b10, this.f5001m.a());
            }
        }
    }
}
