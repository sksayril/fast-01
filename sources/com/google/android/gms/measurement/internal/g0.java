package com.google.android.gms.measurement.internal;

import java.util.Iterator;

final class g0 implements Iterator<String> {

    /* renamed from: m  reason: collision with root package name */
    private Iterator<String> f6044m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ d0 f6045n;

    g0(d0 d0Var) {
        this.f6045n = d0Var;
        this.f6044m = d0Var.f5943m.keySet().iterator();
    }

    public final boolean hasNext() {
        return this.f6044m.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.f6044m.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
