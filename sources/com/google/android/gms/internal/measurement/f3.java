package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.internal.measurement.h2;
import h2.p;
import o2.d;

final class f3 extends h2.a {

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ Activity f5229q;

    /* renamed from: r  reason: collision with root package name */
    private final /* synthetic */ h2.c f5230r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    f3(h2.c cVar, Activity activity) {
        super(h2.this);
        this.f5230r = cVar;
        this.f5229q = activity;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        ((v1) p.j(h2.this.f5297i)).onActivityStarted(d.e3(this.f5229q), this.f5299n);
    }
}
