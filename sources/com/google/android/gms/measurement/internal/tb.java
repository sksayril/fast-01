package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.e1;
import com.google.android.gms.internal.measurement.g1;
import l2.d;

public final class tb extends yb {

    /* renamed from: d  reason: collision with root package name */
    private final AlarmManager f6589d = ((AlarmManager) zza().getSystemService("alarm"));

    /* renamed from: e  reason: collision with root package name */
    private x f6590e;

    /* renamed from: f  reason: collision with root package name */
    private Integer f6591f;

    protected tb(zb zbVar) {
        super(zbVar);
    }

    private final PendingIntent A() {
        Context zza = zza();
        return e1.a(zza, 0, new Intent().setClassName(zza, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), e1.f5203b);
    }

    private final x B() {
        if (this.f6590e == null) {
            this.f6590e = new wb(this, this.f6637b.h0());
        }
        return this.f6590e;
    }

    @TargetApi(24)
    private final void C() {
        JobScheduler jobScheduler = (JobScheduler) zza().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(z());
        }
    }

    private final int z() {
        if (this.f6591f == null) {
            String packageName = zza().getPackageName();
            this.f6591f = Integer.valueOf(("measurement" + packageName).hashCode());
        }
        return this.f6591f.intValue();
    }

    public final /* bridge */ /* synthetic */ d a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ f c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ g d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ c0 e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ w4 f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ k5 g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ oc h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ f6 i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    public final /* bridge */ /* synthetic */ x4 k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    public final /* bridge */ /* synthetic */ jc n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ xc o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ p p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ w5 q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ bb r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ xb s() {
        return super.s();
    }

    /* access modifiers changed from: protected */
    public final boolean w() {
        AlarmManager alarmManager = this.f6589d;
        if (alarmManager != null) {
            alarmManager.cancel(A());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        C();
        return false;
    }

    public final void x(long j10) {
        t();
        Context zza = zza();
        if (!oc.b0(zza)) {
            k().E().a("Receiver not registered/enabled");
        }
        if (!oc.c0(zza, false)) {
            k().E().a("Service not registered/enabled");
        }
        y();
        k().J().b("Scheduling upload, millis", Long.valueOf(j10));
        long b10 = a().b() + j10;
        if (j10 < Math.max(0, k0.f6225z.a(null).longValue()) && !B().e()) {
            B().b(j10);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Context zza2 = zza();
            ComponentName componentName = new ComponentName(zza2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int z9 = z();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            g1.c(zza2, new JobInfo.Builder(z9, componentName).setMinimumLatency(j10).setOverrideDeadline(j10 << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        AlarmManager alarmManager = this.f6589d;
        if (alarmManager != null) {
            alarmManager.setInexactRepeating(2, b10, Math.max(k0.f6215u.a(null).longValue(), j10), A());
        }
    }

    public final void y() {
        t();
        k().J().a("Unscheduling upload");
        AlarmManager alarmManager = this.f6589d;
        if (alarmManager != null) {
            alarmManager.cancel(A());
        }
        B().a();
        if (Build.VERSION.SDK_INT >= 24) {
            C();
        }
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
