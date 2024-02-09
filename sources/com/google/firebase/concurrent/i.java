package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ o f7241m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Runnable f7242n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ p.b f7243o;

    public /* synthetic */ i(o oVar, Runnable runnable, p.b bVar) {
        this.f7241m = oVar;
        this.f7242n = runnable;
        this.f7243o = bVar;
    }

    public final void run() {
        this.f7241m.p(this.f7242n, this.f7243o);
    }
}
