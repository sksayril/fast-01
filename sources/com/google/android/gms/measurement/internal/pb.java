package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.pf;
import com.google.android.gms.internal.measurement.qd;

final class pb {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ gb f6443a;

    pb(gb gbVar) {
        this.f6443a = gbVar;
    }

    private final void c(long j10, boolean z9) {
        this.f6443a.m();
        if (this.f6443a.f6276a.o()) {
            this.f6443a.g().f6245p.b(j10);
            this.f6443a.k().J().b("Session started, time", Long.valueOf(this.f6443a.a().b()));
            Long valueOf = Long.valueOf(j10 / 1000);
            this.f6443a.q().Z("auto", "_sid", valueOf, j10);
            this.f6443a.g().f6246q.b(valueOf.longValue());
            this.f6443a.g().f6241l.a(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            if (this.f6443a.d().r(k0.f6200m0) && z9) {
                bundle.putLong("_aib", 1);
            }
            this.f6443a.q().T("auto", "_s", j10, bundle);
            if (qd.a() && this.f6443a.d().r(k0.f6206p0)) {
                String a10 = this.f6443a.g().f6251v.a();
                if (!TextUtils.isEmpty(a10)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_ffr", a10);
                    this.f6443a.q().T("auto", "_ssr", j10, bundle2);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f6443a.m();
        if (this.f6443a.g().x(this.f6443a.a().a())) {
            this.f6443a.g().f6241l.a(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.f6443a.k().J().a("Detected application was in foreground");
                c(this.f6443a.a().a(), false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(long j10, boolean z9) {
        this.f6443a.m();
        this.f6443a.F();
        if (this.f6443a.g().x(j10)) {
            this.f6443a.g().f6241l.a(true);
            if (pf.a() && this.f6443a.d().r(k0.f6222x0)) {
                this.f6443a.o().H();
            }
        }
        this.f6443a.g().f6245p.b(j10);
        if (this.f6443a.g().f6241l.b()) {
            c(j10, z9);
        }
    }
}
