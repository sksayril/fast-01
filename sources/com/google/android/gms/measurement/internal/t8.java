package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import h2.p;

final class t8 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ Bundle f6582m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ y7 f6583n;

    t8(y7 y7Var, Bundle bundle) {
        this.f6583n = y7Var;
        this.f6582m = bundle;
    }

    public final void run() {
        y7 y7Var = this.f6583n;
        Bundle bundle = this.f6582m;
        y7Var.m();
        y7Var.u();
        p.j(bundle);
        String f10 = p.f(bundle.getString("name"));
        if (!y7Var.f6276a.o()) {
            y7Var.k().J().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        nc ncVar = new nc(f10, 0, (Object) null, "");
        try {
            e eVar = r4;
            e eVar2 = new e(bundle.getString("app_id"), "", ncVar, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), (i0) null, bundle.getLong("trigger_timeout"), (i0) null, bundle.getLong("time_to_live"), y7Var.h().F(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true));
            y7Var.s().G(eVar);
        } catch (IllegalArgumentException unused) {
        }
    }
}
