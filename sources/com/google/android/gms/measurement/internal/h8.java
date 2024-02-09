package com.google.android.gms.measurement.internal;

import java.util.concurrent.Executor;

final class h8 implements Executor {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ y7 f6109m;

    h8(y7 y7Var) {
        this.f6109m = y7Var;
    }

    public final void execute(Runnable runnable) {
        this.f6109m.i().C(runnable);
    }
}
