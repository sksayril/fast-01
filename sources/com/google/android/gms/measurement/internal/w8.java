package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class w8 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f6672m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ String f6673n = null;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ String f6674o;

    /* renamed from: p  reason: collision with root package name */
    private final /* synthetic */ String f6675p;

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ y7 f6676q;

    w8(y7 y7Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f6676q = y7Var;
        this.f6672m = atomicReference;
        this.f6674o = str2;
        this.f6675p = str3;
    }

    public final void run() {
        this.f6676q.f6276a.I().R(this.f6672m, (String) null, this.f6674o, this.f6675p);
    }
}
