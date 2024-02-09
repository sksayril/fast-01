package com.google.android.gms.measurement.internal;

final class w implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ n7 f6639m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ x f6640n;

    w(x xVar, n7 n7Var) {
        this.f6640n = xVar;
        this.f6639m = n7Var;
    }

    public final void run() {
        this.f6639m.c();
        if (f.a()) {
            this.f6639m.i().C(this);
            return;
        }
        boolean e10 = this.f6640n.e();
        this.f6640n.f6687c = 0;
        if (e10) {
            this.f6640n.d();
        }
    }
}
