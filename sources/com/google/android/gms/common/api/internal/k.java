package com.google.android.gms.common.api.internal;

import android.app.Activity;
import e2.e;
import g2.f;
import h2.p;
import p.b;

public final class k extends k0 {

    /* renamed from: r  reason: collision with root package name */
    private final b f5003r = new b();

    /* renamed from: s  reason: collision with root package name */
    private final b f5004s;

    k(f fVar, b bVar, e eVar) {
        super(fVar, eVar);
        this.f5004s = bVar;
        this.f4931m.b("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, b bVar, g2.b bVar2) {
        f c10 = LifecycleCallback.c(activity);
        k kVar = (k) c10.c("ConnectionlessLifecycleHelper", k.class);
        if (kVar == null) {
            kVar = new k(c10, bVar, e.m());
        }
        p.k(bVar2, "ApiKey cannot be null");
        kVar.f5003r.add(bVar2);
        bVar.c(kVar);
    }

    private final void v() {
        if (!this.f5003r.isEmpty()) {
            this.f5004s.c(this);
        }
    }

    public final void h() {
        super.h();
        v();
    }

    public final void j() {
        super.j();
        v();
    }

    public final void k() {
        super.k();
        this.f5004s.d(this);
    }

    /* access modifiers changed from: protected */
    public final void m(e2.b bVar, int i10) {
        this.f5004s.H(bVar, i10);
    }

    /* access modifiers changed from: protected */
    public final void n() {
        this.f5004s.a();
    }

    /* access modifiers changed from: package-private */
    public final b t() {
        return this.f5003r;
    }
}
