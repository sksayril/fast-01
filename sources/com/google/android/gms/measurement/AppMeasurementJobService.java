package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.db;
import com.google.android.gms.measurement.internal.hb;

@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements hb {

    /* renamed from: m  reason: collision with root package name */
    private db<AppMeasurementJobService> f5824m;

    private final db<AppMeasurementJobService> c() {
        if (this.f5824m == null) {
            this.f5824m = new db<>(this);
        }
        return this.f5824m;
    }

    public final void a(Intent intent) {
    }

    @TargetApi(24)
    public final void b(JobParameters jobParameters, boolean z9) {
        jobFinished(jobParameters, false);
    }

    public final boolean e(int i10) {
        throw new UnsupportedOperationException();
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

    public final boolean onStartJob(JobParameters jobParameters) {
        return c().g(jobParameters);
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final boolean onUnbind(Intent intent) {
        return c().k(intent);
    }
}
