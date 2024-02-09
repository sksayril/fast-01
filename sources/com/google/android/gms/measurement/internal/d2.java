package com.google.android.gms.measurement.internal;

final class d2 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ String f5945m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ long f5946n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ b0 f5947o;

    d2(b0 b0Var, String str, long j10) {
        this.f5947o = b0Var;
        this.f5945m = str;
        this.f5946n = j10;
    }

    public final void run() {
        b0.B(this.f5947o, this.f5945m, this.f5946n);
    }
}
