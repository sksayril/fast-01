package com.google.android.gms.measurement.internal;

final class eb implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ zb f6009m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ Runnable f6010n;

    eb(db dbVar, zb zbVar, Runnable runnable) {
        this.f6009m = zbVar;
        this.f6010n = runnable;
    }

    public final void run() {
        this.f6009m.n0();
        this.f6009m.x(this.f6010n);
        this.f6009m.s0();
    }
}
