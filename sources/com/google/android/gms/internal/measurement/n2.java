package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.internal.measurement.h2;
import h2.p;
import o2.d;

final class n2 extends h2.a {

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ Activity f5459q;

    /* renamed from: r  reason: collision with root package name */
    private final /* synthetic */ String f5460r;

    /* renamed from: s  reason: collision with root package name */
    private final /* synthetic */ String f5461s;

    /* renamed from: t  reason: collision with root package name */
    private final /* synthetic */ h2 f5462t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    n2(h2 h2Var, Activity activity, String str, String str2) {
        super(h2Var);
        this.f5462t = h2Var;
        this.f5459q = activity;
        this.f5460r = str;
        this.f5461s = str2;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        ((v1) p.j(this.f5462t.f5297i)).setCurrentScreen(d.e3(this.f5459q), this.f5460r, this.f5461s, this.f5298m);
    }
}
