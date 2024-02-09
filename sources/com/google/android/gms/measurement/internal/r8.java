package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class r8 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f6514m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ y7 f6515n;

    r8(y7 y7Var, AtomicReference atomicReference) {
        this.f6515n = y7Var;
        this.f6514m = atomicReference;
    }

    public final void run() {
        synchronized (this.f6514m) {
            try {
                this.f6514m.set(this.f6515n.d().G(this.f6515n.o().E()));
                this.f6514m.notify();
            } catch (Throwable th) {
                this.f6514m.notify();
                throw th;
            }
        }
    }
}
