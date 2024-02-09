package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

public final /* synthetic */ class z7 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private /* synthetic */ y7 f6775m;

    /* renamed from: n  reason: collision with root package name */
    private /* synthetic */ AtomicReference f6776n;

    public /* synthetic */ z7(y7 y7Var, AtomicReference atomicReference) {
        this.f6775m = y7Var;
        this.f6776n = atomicReference;
    }

    public final void run() {
        y7 y7Var = this.f6775m;
        AtomicReference atomicReference = this.f6776n;
        Bundle a10 = y7Var.g().f6243n.a();
        y9 s9 = y7Var.s();
        if (a10 == null) {
            a10 = new Bundle();
        }
        s9.Q(atomicReference, a10);
    }
}
