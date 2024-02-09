package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.f2;
import com.google.android.gms.measurement.internal.hb;
import h2.p;

public final class db<T extends Context & hb> {

    /* renamed from: a  reason: collision with root package name */
    private final T f5964a;

    public db(T t9) {
        p.j(t9);
        this.f5964a = t9;
    }

    private final void f(Runnable runnable) {
        zb j10 = zb.j(this.f5964a);
        j10.i().C(new eb(this, j10, runnable));
    }

    private final x4 j() {
        return m6.b(this.f5964a, (f2) null, (Long) null).k();
    }

    public final int a(Intent intent, int i10, int i11) {
        x4 k10 = m6.b(this.f5964a, (f2) null, (Long) null).k();
        if (intent == null) {
            k10.K().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        k10.J().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            f(new fb(this, i11, k10, intent));
        }
        return 2;
    }

    public final IBinder b(Intent intent) {
        if (intent == null) {
            j().F().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new q6(zb.j(this.f5964a));
        }
        j().K().b("onBind received unknown action", action);
        return null;
    }

    public final void c() {
        m6.b(this.f5964a, (f2) null, (Long) null).k().J().a("Local AppMeasurementService is starting up");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(int i10, x4 x4Var, Intent intent) {
        if (((hb) this.f5964a).e(i10)) {
            x4Var.J().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
            j().J().a("Completed wakeful intent.");
            ((hb) this.f5964a).a(intent);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e(x4 x4Var, JobParameters jobParameters) {
        x4Var.J().a("AppMeasurementJobService processed last upload request.");
        ((hb) this.f5964a).b(jobParameters, false);
    }

    @TargetApi(24)
    public final boolean g(JobParameters jobParameters) {
        x4 k10 = m6.b(this.f5964a, (f2) null, (Long) null).k();
        String string = jobParameters.getExtras().getString("action");
        k10.J().b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        f(new cb(this, k10, jobParameters));
        return true;
    }

    public final void h() {
        m6.b(this.f5964a, (f2) null, (Long) null).k().J().a("Local AppMeasurementService is shutting down");
    }

    public final void i(Intent intent) {
        if (intent == null) {
            j().F().a("onRebind called with null intent");
            return;
        }
        j().J().b("onRebind called. action", intent.getAction());
    }

    public final boolean k(Intent intent) {
        if (intent == null) {
            j().F().a("onUnbind called with null intent");
            return true;
        }
        j().J().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
