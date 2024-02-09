package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

public final /* synthetic */ class cb implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private /* synthetic */ db f5932m;

    /* renamed from: n  reason: collision with root package name */
    private /* synthetic */ x4 f5933n;

    /* renamed from: o  reason: collision with root package name */
    private /* synthetic */ JobParameters f5934o;

    public /* synthetic */ cb(db dbVar, x4 x4Var, JobParameters jobParameters) {
        this.f5932m = dbVar;
        this.f5933n = x4Var;
        this.f5934o = jobParameters;
    }

    public final void run() {
        this.f5932m.e(this.f5933n, this.f5934o);
    }
}
