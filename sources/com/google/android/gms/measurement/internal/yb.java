package com.google.android.gms.measurement.internal;

abstract class yb extends vb {

    /* renamed from: c  reason: collision with root package name */
    private boolean f6756c;

    yb(zb zbVar) {
        super(zbVar);
        this.f6637b.q0();
    }

    /* access modifiers changed from: protected */
    public final void t() {
        if (!v()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void u() {
        if (!this.f6756c) {
            w();
            this.f6637b.p0();
            this.f6756c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: package-private */
    public final boolean v() {
        return this.f6756c;
    }

    /* access modifiers changed from: protected */
    public abstract boolean w();
}
