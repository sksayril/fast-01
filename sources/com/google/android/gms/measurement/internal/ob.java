package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.jf;

public final /* synthetic */ class ob implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private /* synthetic */ lb f6396m;

    public /* synthetic */ ob(lb lbVar) {
        this.f6396m = lbVar;
    }

    public final void run() {
        lb lbVar = this.f6396m;
        mb mbVar = lbVar.f6284o;
        long j10 = lbVar.f6282m;
        long j11 = lbVar.f6283n;
        mbVar.f6330b.m();
        mbVar.f6330b.k().E().a("Application going to the background");
        mbVar.f6330b.g().f6248s.a(true);
        mbVar.f6330b.C(true);
        if (!mbVar.f6330b.d().P()) {
            mbVar.f6330b.f6068f.e(j11);
            mbVar.f6330b.D(false, false, j11);
        }
        if (!jf.a() || !mbVar.f6330b.d().r(k0.K0)) {
            mbVar.f6330b.q().T("auto", "_ab", j10, new Bundle());
        } else {
            mbVar.f6330b.k().I().b("Application backgrounded at: timestamp_millis", Long.valueOf(j10));
        }
    }
}
