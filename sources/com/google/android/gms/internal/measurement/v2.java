package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.h2;
import h2.p;

final class v2 extends h2.a {

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ String f5658q;

    /* renamed from: r  reason: collision with root package name */
    private final /* synthetic */ String f5659r;

    /* renamed from: s  reason: collision with root package name */
    private final /* synthetic */ boolean f5660s;

    /* renamed from: t  reason: collision with root package name */
    private final /* synthetic */ t1 f5661t;

    /* renamed from: u  reason: collision with root package name */
    private final /* synthetic */ h2 f5662u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    v2(h2 h2Var, String str, String str2, boolean z9, t1 t1Var) {
        super(h2Var);
        this.f5662u = h2Var;
        this.f5658q = str;
        this.f5659r = str2;
        this.f5660s = z9;
        this.f5661t = t1Var;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        ((v1) p.j(this.f5662u.f5297i)).getUserProperties(this.f5658q, this.f5659r, this.f5660s, this.f5661t);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.f5661t.p((Bundle) null);
    }
}
