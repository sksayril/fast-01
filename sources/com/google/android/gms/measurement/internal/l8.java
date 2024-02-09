package com.google.android.gms.measurement.internal;

import r3.a;

final class l8 implements a<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ rb f6277a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ y7 f6278b;

    l8(y7 y7Var, rb rbVar) {
        this.f6278b = y7Var;
        this.f6277a = rbVar;
    }

    public final void a(Object obj) {
        this.f6278b.m();
        this.f6278b.f6737i = false;
        this.f6278b.q0();
        this.f6278b.k().E().b("registerTriggerAsync ran. uri", this.f6277a.f6528m);
    }

    public final void b(Throwable th) {
        this.f6278b.m();
        this.f6278b.f6737i = false;
        this.f6278b.q0();
        this.f6278b.k().F().b("registerTriggerAsync failed with throwable", th);
    }
}
