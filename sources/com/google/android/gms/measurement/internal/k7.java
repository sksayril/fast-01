package com.google.android.gms.measurement.internal;

abstract class k7 extends l7 {

    /* renamed from: b  reason: collision with root package name */
    private boolean f6259b;

    k7(m6 m6Var) {
        super(m6Var);
        this.f6276a.m();
    }

    /* access modifiers changed from: protected */
    public final void n() {
        if (!q()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void o() {
        if (this.f6259b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!r()) {
            this.f6276a.Q();
            this.f6259b = true;
        }
    }

    public final void p() {
        if (!this.f6259b) {
            s();
            this.f6276a.Q();
            this.f6259b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: package-private */
    public final boolean q() {
        return this.f6259b;
    }

    /* access modifiers changed from: protected */
    public abstract boolean r();

    /* access modifiers changed from: protected */
    public void s() {
    }
}
