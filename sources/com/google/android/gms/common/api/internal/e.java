package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.c;
import d3.k;
import e2.d;
import f2.a;
import f2.a.b;

public abstract class e<A extends a.b, L> {

    /* renamed from: a  reason: collision with root package name */
    private final c f4966a;

    /* renamed from: b  reason: collision with root package name */
    private final d[] f4967b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f4968c;

    /* renamed from: d  reason: collision with root package name */
    private final int f4969d;

    protected e(c<L> cVar, d[] dVarArr, boolean z9, int i10) {
        this.f4966a = cVar;
        this.f4967b = dVarArr;
        this.f4968c = z9;
        this.f4969d = i10;
    }

    public void a() {
        this.f4966a.a();
    }

    public c.a<L> b() {
        return this.f4966a.b();
    }

    public d[] c() {
        return this.f4967b;
    }

    /* access modifiers changed from: protected */
    public abstract void d(A a10, k<Void> kVar);

    public final int e() {
        return this.f4969d;
    }

    public final boolean f() {
        return this.f4968c;
    }
}
