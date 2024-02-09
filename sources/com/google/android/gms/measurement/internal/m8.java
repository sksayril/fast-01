package com.google.android.gms.measurement.internal;

final class m8 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ long f6320m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ y7 f6321n;

    m8(y7 y7Var, long j10) {
        this.f6321n = y7Var;
        this.f6320m = j10;
    }

    public final void run() {
        this.f6321n.g().f6240k.b(this.f6320m);
        this.f6321n.k().E().b("Session timeout duration set", Long.valueOf(this.f6320m));
    }
}
