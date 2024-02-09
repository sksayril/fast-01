package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.h2;
import h2.p;
import o2.d;

final class y2 extends h2.a {

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ int f5706q = 5;

    /* renamed from: r  reason: collision with root package name */
    private final /* synthetic */ String f5707r;

    /* renamed from: s  reason: collision with root package name */
    private final /* synthetic */ Object f5708s;

    /* renamed from: t  reason: collision with root package name */
    private final /* synthetic */ Object f5709t;

    /* renamed from: u  reason: collision with root package name */
    private final /* synthetic */ Object f5710u;

    /* renamed from: v  reason: collision with root package name */
    private final /* synthetic */ h2 f5711v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    y2(h2 h2Var, boolean z9, int i10, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.f5711v = h2Var;
        this.f5707r = str;
        this.f5708s = obj;
        this.f5709t = null;
        this.f5710u = null;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        ((v1) p.j(this.f5711v.f5297i)).logHealthData(this.f5706q, this.f5707r, d.e3(this.f5708s), d.e3(null), d.e3(null));
    }
}
