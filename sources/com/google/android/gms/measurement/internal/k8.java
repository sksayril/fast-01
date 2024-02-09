package com.google.android.gms.measurement.internal;

final class k8 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ boolean f6260m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ y7 f6261n;

    k8(y7 y7Var, boolean z9) {
        this.f6261n = y7Var;
        this.f6260m = z9;
    }

    public final void run() {
        boolean o10 = this.f6261n.f6276a.o();
        boolean n10 = this.f6261n.f6276a.n();
        this.f6261n.f6276a.l(this.f6260m);
        if (n10 == this.f6260m) {
            this.f6261n.f6276a.k().J().b("Default data collection state already set to", Boolean.valueOf(this.f6260m));
        }
        if (this.f6261n.f6276a.o() == o10 || this.f6261n.f6276a.o() != this.f6261n.f6276a.n()) {
            this.f6261n.f6276a.k().L().c("Default data collection is different than actual status", Boolean.valueOf(this.f6260m), Boolean.valueOf(o10));
        }
        this.f6261n.s0();
    }
}
