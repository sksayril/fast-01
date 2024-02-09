package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.h2;
import h2.p;

final class b3 extends h2.a {

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ h2.b f5119q;

    /* renamed from: r  reason: collision with root package name */
    private final /* synthetic */ h2 f5120r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    b3(h2 h2Var, h2.b bVar) {
        super(h2Var);
        this.f5120r = h2Var;
        this.f5119q = bVar;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        ((v1) p.j(this.f5120r.f5297i)).registerOnMeasurementEventListener(this.f5119q);
    }
}
