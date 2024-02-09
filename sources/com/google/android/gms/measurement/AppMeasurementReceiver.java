package com.google.android.gms.measurement;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.u5;
import h0.a;

public final class AppMeasurementReceiver extends a implements u5.a {

    /* renamed from: o  reason: collision with root package name */
    private u5 f5825o;

    public final void a(Context context, Intent intent) {
        a.c(context, intent);
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f5825o == null) {
            this.f5825o = new u5(this);
        }
        this.f5825o.a(context, intent);
    }
}
