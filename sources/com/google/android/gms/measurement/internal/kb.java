package com.google.android.gms.measurement.internal;

final class kb implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ long f6263m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ gb f6264n;

    kb(gb gbVar, long j10) {
        this.f6264n = gbVar;
        this.f6263m = j10;
    }

    public final void run() {
        gb.H(this.f6264n, this.f6263m);
    }
}
