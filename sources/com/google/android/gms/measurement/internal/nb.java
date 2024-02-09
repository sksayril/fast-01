package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.de;

final class nb {

    /* renamed from: a  reason: collision with root package name */
    private long f6354a;

    /* renamed from: b  reason: collision with root package name */
    protected long f6355b;

    /* renamed from: c  reason: collision with root package name */
    private final x f6356c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ gb f6357d;

    public nb(gb gbVar) {
        this.f6357d = gbVar;
        this.f6356c = new qb(this, gbVar.f6276a);
        long b10 = gbVar.a().b();
        this.f6354a = b10;
        this.f6355b = b10;
    }

    static /* synthetic */ void c(nb nbVar) {
        nbVar.f6357d.m();
        nbVar.d(false, false, nbVar.f6357d.a().b());
        nbVar.f6357d.n().u(nbVar.f6357d.a().b());
    }

    /* access modifiers changed from: package-private */
    public final long a(long j10) {
        long j11 = j10 - this.f6355b;
        this.f6355b = j10;
        return j11;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f6356c.a();
        this.f6354a = 0;
        this.f6355b = 0;
    }

    public final boolean d(boolean z9, boolean z10, long j10) {
        this.f6357d.m();
        this.f6357d.u();
        if (!de.a() || !this.f6357d.d().r(k0.f6208q0) || this.f6357d.f6276a.o()) {
            this.f6357d.g().f6245p.b(this.f6357d.a().a());
        }
        long j11 = j10 - this.f6354a;
        if (z9 || j11 >= 1000) {
            if (!z10) {
                j11 = a(j10);
            }
            this.f6357d.k().J().b("Recording user engagement, ms", Long.valueOf(j11));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j11);
            oc.V(this.f6357d.r().B(!this.f6357d.d().P()), bundle, true);
            if (!z10) {
                this.f6357d.q().y0("auto", "_e", bundle);
            }
            this.f6354a = j10;
            this.f6356c.a();
            this.f6356c.b(3600000);
            return true;
        }
        this.f6357d.k().J().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void e(long j10) {
        this.f6356c.a();
    }

    /* access modifiers changed from: package-private */
    public final void f(long j10) {
        this.f6357d.m();
        this.f6356c.a();
        this.f6354a = j10;
        this.f6355b = j10;
    }
}
