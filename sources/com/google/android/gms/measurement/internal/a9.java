package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class a9 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f5862m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ y7 f5863n;

    a9(y7 y7Var, AtomicReference atomicReference) {
        this.f5863n = y7Var;
        this.f5862m = atomicReference;
    }

    public final void run() {
        synchronized (this.f5862m) {
            try {
                this.f5862m.set(Long.valueOf(this.f5863n.d().w(this.f5863n.o().E(), k0.O)));
                this.f5862m.notify();
            } catch (Throwable th) {
                this.f5862m.notify();
                throw th;
            }
        }
    }
}
