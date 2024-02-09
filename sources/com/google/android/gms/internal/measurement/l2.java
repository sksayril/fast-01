package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.h2;
import h2.p;

final class l2 extends h2.a {

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ String f5423q;

    /* renamed from: r  reason: collision with root package name */
    private final /* synthetic */ String f5424r;

    /* renamed from: s  reason: collision with root package name */
    private final /* synthetic */ t1 f5425s;

    /* renamed from: t  reason: collision with root package name */
    private final /* synthetic */ h2 f5426t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    l2(h2 h2Var, String str, String str2, t1 t1Var) {
        super(h2Var);
        this.f5426t = h2Var;
        this.f5423q = str;
        this.f5424r = str2;
        this.f5425s = t1Var;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        ((v1) p.j(this.f5426t.f5297i)).getConditionalUserProperties(this.f5423q, this.f5424r, this.f5425s);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.f5425s.p((Bundle) null);
    }
}
