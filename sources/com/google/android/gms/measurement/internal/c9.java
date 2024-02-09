package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class c9 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f5926m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ y7 f5927n;

    c9(y7 y7Var, AtomicReference atomicReference) {
        this.f5927n = y7Var;
        this.f5926m = atomicReference;
    }

    public final void run() {
        synchronized (this.f5926m) {
            try {
                this.f5926m.set(Double.valueOf(this.f5927n.d().n(this.f5927n.o().E(), k0.Q)));
                this.f5926m.notify();
            } catch (Throwable th) {
                this.f5926m.notify();
                throw th;
            }
        }
    }
}
