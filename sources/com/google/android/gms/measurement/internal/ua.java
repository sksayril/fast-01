package com.google.android.gms.measurement.internal;

final class ua implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ q4 f6608m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ va f6609n;

    ua(va vaVar, q4 q4Var) {
        this.f6609n = vaVar;
        this.f6608m = q4Var;
    }

    public final void run() {
        synchronized (this.f6609n) {
            this.f6609n.f6634a = false;
            if (!this.f6609n.f6636c.b0()) {
                this.f6609n.f6636c.k().J().a("Connected to service");
                this.f6609n.f6636c.I(this.f6608m);
            }
        }
    }
}
