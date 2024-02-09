package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.h2;
import h2.p;

final class m2 extends h2.a {

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ String f5439q;

    /* renamed from: r  reason: collision with root package name */
    private final /* synthetic */ String f5440r;

    /* renamed from: s  reason: collision with root package name */
    private final /* synthetic */ Bundle f5441s;

    /* renamed from: t  reason: collision with root package name */
    private final /* synthetic */ h2 f5442t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    m2(h2 h2Var, String str, String str2, Bundle bundle) {
        super(h2Var);
        this.f5442t = h2Var;
        this.f5439q = str;
        this.f5440r = str2;
        this.f5441s = bundle;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        ((v1) p.j(this.f5442t.f5297i)).clearConditionalUserProperty(this.f5439q, this.f5440r, this.f5441s);
    }
}
