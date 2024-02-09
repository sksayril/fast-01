package com.google.android.gms.measurement.internal;

final class w9 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ r9 f6677m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ long f6678n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ q9 f6679o;

    w9(q9 q9Var, r9 r9Var, long j10) {
        this.f6679o = q9Var;
        this.f6677m = r9Var;
        this.f6678n = j10;
    }

    public final void run() {
        this.f6679o.N(this.f6677m, false, this.f6678n);
        q9 q9Var = this.f6679o;
        q9Var.f6473e = null;
        q9Var.s().K((r9) null);
    }
}
