package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.h2;
import h2.p;

final class a3 extends h2.a {

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ boolean f5079q;

    /* renamed from: r  reason: collision with root package name */
    private final /* synthetic */ h2 f5080r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    a3(h2 h2Var, boolean z9) {
        super(h2Var);
        this.f5080r = h2Var;
        this.f5079q = z9;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        ((v1) p.j(this.f5080r.f5297i)).setDataCollectionEnabled(this.f5079q);
    }
}
