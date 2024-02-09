package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class v8 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f6623m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ String f6624n = null;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ String f6625o;

    /* renamed from: p  reason: collision with root package name */
    private final /* synthetic */ String f6626p;

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ boolean f6627q;

    /* renamed from: r  reason: collision with root package name */
    private final /* synthetic */ y7 f6628r;

    v8(y7 y7Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z9) {
        this.f6628r = y7Var;
        this.f6623m = atomicReference;
        this.f6625o = str2;
        this.f6626p = str3;
        this.f6627q = z9;
    }

    public final void run() {
        this.f6628r.f6276a.I().S(this.f6623m, (String) null, this.f6625o, this.f6626p, this.f6627q);
    }
}
