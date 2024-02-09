package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.f2;
import h2.p;

public final class u5 {

    /* renamed from: a  reason: collision with root package name */
    private final a f6599a;

    public interface a {
        void a(Context context, Intent intent);
    }

    public u5(a aVar) {
        p.j(aVar);
        this.f6599a = aVar;
    }

    public final void a(Context context, Intent intent) {
        x4 k10 = m6.b(context, (f2) null, (Long) null).k();
        if (intent == null) {
            k10.K().a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        k10.J().b("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            k10.J().a("Starting wakeful intent.");
            this.f6599a.a(context, className);
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            k10.K().a("Install Referrer Broadcasts are deprecated");
        }
    }
}
