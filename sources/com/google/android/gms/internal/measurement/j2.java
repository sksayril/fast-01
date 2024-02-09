package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.h2;
import h2.p;

final class j2 extends h2.a {

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ Bundle f5370q;

    /* renamed from: r  reason: collision with root package name */
    private final /* synthetic */ h2 f5371r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    j2(h2 h2Var, Bundle bundle) {
        super(h2Var);
        this.f5371r = h2Var;
        this.f5370q = bundle;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        ((v1) p.j(this.f5371r.f5297i)).setConditionalUserProperty(this.f5370q, this.f5298m);
    }
}
