package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.h2;
import h2.p;

final class s2 extends h2.a {

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ t1 f5585q;

    /* renamed from: r  reason: collision with root package name */
    private final /* synthetic */ h2 f5586r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    s2(h2 h2Var, t1 t1Var) {
        super(h2Var);
        this.f5586r = h2Var;
        this.f5585q = t1Var;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        ((v1) p.j(this.f5586r.f5297i)).getGmpAppId(this.f5585q);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.f5585q.p((Bundle) null);
    }
}
