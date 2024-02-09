package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.pf;

final class g9 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ p7 f6057m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ long f6058n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ boolean f6059o;

    /* renamed from: p  reason: collision with root package name */
    private final /* synthetic */ p7 f6060p;

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ y7 f6061q;

    g9(y7 y7Var, p7 p7Var, long j10, boolean z9, p7 p7Var2) {
        this.f6061q = y7Var;
        this.f6057m = p7Var;
        this.f6058n = j10;
        this.f6059o = z9;
        this.f6060p = p7Var2;
    }

    public final void run() {
        this.f6061q.I(this.f6057m);
        y7.M(this.f6061q, this.f6057m, this.f6058n, false, this.f6059o);
        if (pf.a() && this.f6061q.d().r(k0.f6222x0)) {
            y7.N(this.f6061q, this.f6057m, this.f6060p);
        }
    }
}
