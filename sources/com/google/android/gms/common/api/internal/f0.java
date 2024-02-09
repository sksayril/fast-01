package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.c;
import d3.k;
import e2.d;
import g2.v;

public final class f0 extends b0 {

    /* renamed from: c  reason: collision with root package name */
    public final c.a f4983c;

    public f0(c.a aVar, k kVar) {
        super(4, kVar);
        this.f4983c = aVar;
    }

    public final /* bridge */ /* synthetic */ void d(j jVar, boolean z9) {
    }

    public final boolean f(r rVar) {
        v vVar = (v) rVar.u().get(this.f4983c);
        return vVar != null && vVar.f8913a.f();
    }

    public final d[] g(r rVar) {
        v vVar = (v) rVar.u().get(this.f4983c);
        if (vVar == null) {
            return null;
        }
        return vVar.f8913a.c();
    }

    public final void h(r rVar) {
        v vVar = (v) rVar.u().remove(this.f4983c);
        if (vVar != null) {
            vVar.f8914b.b(rVar.s(), this.f4959b);
            vVar.f8913a.a();
            return;
        }
        this.f4959b.e(Boolean.FALSE);
    }
}
