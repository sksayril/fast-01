package com.google.android.gms.measurement.internal;

final class b9 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ Boolean f5893m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ y7 f5894n;

    b9(y7 y7Var, Boolean bool) {
        this.f5894n = y7Var;
        this.f5893m = bool;
    }

    public final void run() {
        this.f5894n.R(this.f5893m, true);
    }
}
