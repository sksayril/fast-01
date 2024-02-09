package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.h2;
import h2.p;

final class c3 extends h2.a {

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ Long f5156q;

    /* renamed from: r  reason: collision with root package name */
    private final /* synthetic */ String f5157r;

    /* renamed from: s  reason: collision with root package name */
    private final /* synthetic */ String f5158s;

    /* renamed from: t  reason: collision with root package name */
    private final /* synthetic */ Bundle f5159t;

    /* renamed from: u  reason: collision with root package name */
    private final /* synthetic */ boolean f5160u;

    /* renamed from: v  reason: collision with root package name */
    private final /* synthetic */ boolean f5161v;

    /* renamed from: w  reason: collision with root package name */
    private final /* synthetic */ h2 f5162w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    c3(h2 h2Var, Long l10, String str, String str2, Bundle bundle, boolean z9, boolean z10) {
        super(h2Var);
        this.f5162w = h2Var;
        this.f5156q = l10;
        this.f5157r = str;
        this.f5158s = str2;
        this.f5159t = bundle;
        this.f5160u = z9;
        this.f5161v = z10;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        Long l10 = this.f5156q;
        ((v1) p.j(this.f5162w.f5297i)).logEvent(this.f5157r, this.f5158s, this.f5159t, this.f5160u, this.f5161v, l10 == null ? this.f5298m : l10.longValue());
    }
}
