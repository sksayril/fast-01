package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.df;

public final class tc extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final m6 f6592a;

    public tc(m6 m6Var) {
        this.f6592a = m6Var;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            this.f6592a.k().K().a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.f6592a.k().K().a("App receiver called with null action");
        } else if (!action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            this.f6592a.k().K().a("App receiver called with unknown action");
        } else {
            m6 m6Var = this.f6592a;
            if (df.a() && m6Var.y().C((String) null, k0.M0)) {
                m6Var.k().J().a("App receiver notified triggers are available");
                m6Var.i().C(new vc(m6Var));
            }
        }
    }
}
