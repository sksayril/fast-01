package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.h2;
import h2.p;

final class z2 extends h2.a {

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ String f5735q;

    /* renamed from: r  reason: collision with root package name */
    private final /* synthetic */ t1 f5736r;

    /* renamed from: s  reason: collision with root package name */
    private final /* synthetic */ h2 f5737s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    z2(h2 h2Var, String str, t1 t1Var) {
        super(h2Var);
        this.f5737s = h2Var;
        this.f5735q = str;
        this.f5736r = t1Var;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        ((v1) p.j(this.f5737s.f5297i)).getMaxUserProperties(this.f5735q, this.f5736r);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.f5736r.p((Bundle) null);
    }
}
