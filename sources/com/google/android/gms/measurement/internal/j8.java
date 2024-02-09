package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class j8 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f6162m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ y7 f6163n;

    j8(y7 y7Var, AtomicReference atomicReference) {
        this.f6163n = y7Var;
        this.f6162m = atomicReference;
    }

    public final void run() {
        synchronized (this.f6162m) {
            try {
                this.f6162m.set(Boolean.valueOf(this.f6163n.d().I(this.f6163n.o().E())));
                this.f6162m.notify();
            } catch (Throwable th) {
                this.f6162m.notify();
                throw th;
            }
        }
    }
}
