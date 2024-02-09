package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.db;
import com.google.android.gms.measurement.internal.hb;
import h0.a;

public final class AppMeasurementService extends Service implements hb {

    /* renamed from: m  reason: collision with root package name */
    private db<AppMeasurementService> f5826m;

    private final db<AppMeasurementService> c() {
        if (this.f5826m == null) {
            this.f5826m = new db<>(this);
        }
        return this.f5826m;
    }

    public final void a(Intent intent) {
        a.b(intent);
    }

    public final void b(JobParameters jobParameters, boolean z9) {
        throw new UnsupportedOperationException();
    }

    public final boolean e(int i10) {
        return stopSelfResult(i10);
    }

    public final IBinder onBind(Intent intent) {
        return c().b(intent);
    }

    public final void onCreate() {
        super.onCreate();
        c().c();
    }

    public final void onDestroy() {
        c().h();
        super.onDestroy();
    }

    public final void onRebind(Intent intent) {
        c().i(intent);
    }

    public final int onStartCommand(Intent intent, int i10, int i11) {
        return c().a(intent, i10, i11);
    }

    public final boolean onUnbind(Intent intent) {
        return c().k(intent);
    }
}
