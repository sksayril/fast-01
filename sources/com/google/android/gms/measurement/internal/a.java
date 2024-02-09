package com.google.android.gms.measurement.internal;

final class a implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ String f5836m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ long f5837n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ b0 f5838o;

    a(b0 b0Var, String str, long j10) {
        this.f5838o = b0Var;
        this.f5836m = str;
        this.f5837n = j10;
    }

    public final void run() {
        b0.x(this.f5838o, this.f5836m, this.f5837n);
    }
}
