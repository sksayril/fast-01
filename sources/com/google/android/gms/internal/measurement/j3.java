package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.internal.measurement.h2;
import h2.p;
import o2.d;

final class j3 extends h2.a {

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ Activity f5372q;

    /* renamed from: r  reason: collision with root package name */
    private final /* synthetic */ t1 f5373r;

    /* renamed from: s  reason: collision with root package name */
    private final /* synthetic */ h2.c f5374s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    j3(h2.c cVar, Activity activity, t1 t1Var) {
        super(h2.this);
        this.f5374s = cVar;
        this.f5372q = activity;
        this.f5373r = t1Var;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        ((v1) p.j(h2.this.f5297i)).onActivitySaveInstanceState(d.e3(this.f5372q), this.f5373r, this.f5299n);
    }
}
