package com.google.android.gms.measurement.internal;

final class mb {

    /* renamed from: a  reason: collision with root package name */
    private lb f6329a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ gb f6330b;

    mb(gb gbVar) {
        this.f6330b = gbVar;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f6330b.m();
        if (this.f6329a != null) {
            this.f6330b.f6065c.removeCallbacks(this.f6329a);
        }
        this.f6330b.g().f6248s.a(false);
        this.f6330b.C(false);
    }

    /* access modifiers changed from: package-private */
    public final void b(long j10) {
        this.f6329a = new lb(this, this.f6330b.a().a(), j10);
        this.f6330b.f6065c.postDelayed(this.f6329a, 2000);
    }
}
