package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.pf;

final class d9 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ p7 f5956m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ long f5957n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ long f5958o;

    /* renamed from: p  reason: collision with root package name */
    private final /* synthetic */ boolean f5959p;

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ p7 f5960q;

    /* renamed from: r  reason: collision with root package name */
    private final /* synthetic */ y7 f5961r;

    d9(y7 y7Var, p7 p7Var, long j10, long j11, boolean z9, p7 p7Var2) {
        this.f5961r = y7Var;
        this.f5956m = p7Var;
        this.f5957n = j10;
        this.f5958o = j11;
        this.f5959p = z9;
        this.f5960q = p7Var2;
    }

    public final void run() {
        this.f5961r.I(this.f5956m);
        this.f5961r.D(this.f5957n, false);
        y7.M(this.f5961r, this.f5956m, this.f5958o, true, this.f5959p);
        if (pf.a() && this.f5961r.d().r(k0.f6222x0)) {
            y7.N(this.f5961r, this.f5956m, this.f5960q);
        }
    }
}
