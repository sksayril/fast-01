package com.google.android.gms.common.api.internal;

import android.util.Log;
import e2.b;
import h2.j;

final class t implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ b f5033m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ u f5034n;

    t(u uVar, b bVar) {
        this.f5034n = uVar;
        this.f5033m = bVar;
    }

    public final void run() {
        u uVar = this.f5034n;
        r rVar = (r) uVar.f5040f.f4953l.get(uVar.f5036b);
        if (rVar != null) {
            if (this.f5033m.k()) {
                this.f5034n.f5039e = true;
                if (this.f5034n.f5035a.n()) {
                    this.f5034n.h();
                    return;
                }
                try {
                    u uVar2 = this.f5034n;
                    uVar2.f5035a.c((j) null, uVar2.f5035a.d());
                } catch (SecurityException e10) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
                    this.f5034n.f5035a.e("Failed to get service from broker.");
                    rVar.F(new b(10), (Exception) null);
                }
            } else {
                rVar.F(this.f5033m, (Exception) null);
            }
        }
    }
}
