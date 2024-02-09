package com.google.android.gms.measurement.internal;

final class wa implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ q4 f6680m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ va f6681n;

    wa(va vaVar, q4 q4Var) {
        this.f6681n = vaVar;
        this.f6680m = q4Var;
    }

    public final void run() {
        synchronized (this.f6681n) {
            this.f6681n.f6634a = false;
            if (!this.f6681n.f6636c.b0()) {
                this.f6681n.f6636c.k().E().a("Connected to remote service");
                this.f6681n.f6636c.I(this.f6680m);
            }
        }
    }
}
