package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import h2.p;

final class u8 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ Bundle f6605m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ y7 f6606n;

    u8(y7 y7Var, Bundle bundle) {
        this.f6606n = y7Var;
        this.f6605m = bundle;
    }

    public final void run() {
        y7 y7Var = this.f6606n;
        Bundle bundle = this.f6605m;
        y7Var.m();
        y7Var.u();
        p.j(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        p.f(string);
        p.f(string2);
        p.j(bundle.get("value"));
        if (!y7Var.f6276a.o()) {
            y7Var.k().J().a("Conditional property not set since app measurement is disabled");
            return;
        }
        nc ncVar = new nc(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            i0 F = y7Var.h().F(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0, true, true);
            i0 F2 = y7Var.h().F(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0, true, true);
            i0 F3 = y7Var.h().F(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0, true, true);
            y7Var.s().G(new e(bundle.getString("app_id"), string2, ncVar, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), F2, bundle.getLong("trigger_timeout"), F, bundle.getLong("time_to_live"), F3));
        } catch (IllegalArgumentException unused) {
        }
    }
}
