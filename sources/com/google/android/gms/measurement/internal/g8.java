package com.google.android.gms.measurement.internal;

public final /* synthetic */ class g8 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private /* synthetic */ y7 f6055m;

    /* renamed from: n  reason: collision with root package name */
    private /* synthetic */ String f6056n;

    public /* synthetic */ g8(y7 y7Var, String str) {
        this.f6055m = y7Var;
        this.f6056n = str;
    }

    public final void run() {
        y7 y7Var = this.f6055m;
        if (y7Var.o().J(this.f6056n)) {
            y7Var.o().H();
        }
    }
}
