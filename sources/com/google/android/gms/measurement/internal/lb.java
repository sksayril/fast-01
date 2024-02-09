package com.google.android.gms.measurement.internal;

final class lb implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    long f6282m;

    /* renamed from: n  reason: collision with root package name */
    long f6283n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ mb f6284o;

    lb(mb mbVar, long j10, long j11) {
        this.f6284o = mbVar;
        this.f6282m = j10;
        this.f6283n = j11;
    }

    public final void run() {
        this.f6284o.f6330b.i().C(new ob(this));
    }
}
