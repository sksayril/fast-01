package com.google.android.gms.measurement.internal;

abstract class e3 extends f4 {

    /* renamed from: b  reason: collision with root package name */
    private boolean f5993b;

    e3(m6 m6Var) {
        super(m6Var);
        this.f6276a.m();
    }

    /* access modifiers changed from: protected */
    public final void u() {
        if (!y()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void v() {
        if (this.f5993b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!z()) {
            this.f6276a.Q();
            this.f5993b = true;
        }
    }

    public final void w() {
        if (!this.f5993b) {
            x();
            this.f6276a.Q();
            this.f5993b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    public void x() {
    }

    /* access modifiers changed from: package-private */
    public final boolean y() {
        return this.f5993b;
    }

    /* access modifiers changed from: protected */
    public abstract boolean z();
}
