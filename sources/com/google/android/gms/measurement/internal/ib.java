package com.google.android.gms.measurement.internal;

final class ib implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ long f6141m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ gb f6142n;

    ib(gb gbVar, long j10) {
        this.f6142n = gbVar;
        this.f6141m = j10;
    }

    public final void run() {
        gb.B(this.f6142n, this.f6141m);
    }
}
