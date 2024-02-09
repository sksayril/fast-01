package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class z8 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f6777m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ y7 f6778n;

    z8(y7 y7Var, AtomicReference atomicReference) {
        this.f6778n = y7Var;
        this.f6777m = atomicReference;
    }

    public final void run() {
        synchronized (this.f6777m) {
            try {
                this.f6777m.set(Integer.valueOf(this.f6778n.d().t(this.f6778n.o().E(), k0.P)));
                this.f6777m.notify();
            } catch (Throwable th) {
                this.f6777m.notify();
                throw th;
            }
        }
    }
}
