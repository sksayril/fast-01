package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class s8 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ long f6543m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ y7 f6544n;

    s8(y7 y7Var, long j10) {
        this.f6544n = y7Var;
        this.f6543m = j10;
    }

    public final void run() {
        this.f6544n.D(this.f6543m, true);
        this.f6544n.s().P(new AtomicReference());
    }
}
