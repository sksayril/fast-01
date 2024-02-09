package com.google.android.gms.measurement.internal;

import h2.p;
import l2.d;

final class sb {

    /* renamed from: a  reason: collision with root package name */
    private final d f6557a;

    /* renamed from: b  reason: collision with root package name */
    private long f6558b;

    public sb(d dVar) {
        p.j(dVar);
        this.f6557a = dVar;
    }

    public final void a() {
        this.f6558b = 0;
    }

    public final boolean b(long j10) {
        return this.f6558b == 0 || this.f6557a.b() - this.f6558b >= 3600000;
    }

    public final void c() {
        this.f6558b = this.f6557a.b();
    }
}
