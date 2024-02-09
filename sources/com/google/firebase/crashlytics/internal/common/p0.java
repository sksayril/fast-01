package com.google.firebase.crashlytics.internal.common;

import d3.k;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final /* synthetic */ class p0 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Callable f7382m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Executor f7383n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ k f7384o;

    public /* synthetic */ p0(Callable callable, Executor executor, k kVar) {
        this.f7382m = callable;
        this.f7383n = executor;
        this.f7384o = kVar;
    }

    public final void run() {
        q0.k(this.f7382m, this.f7383n, this.f7384o);
    }
}
