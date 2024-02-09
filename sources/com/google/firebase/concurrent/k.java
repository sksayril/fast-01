package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ o f7247m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Runnable f7248n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ p.b f7249o;

    public /* synthetic */ k(o oVar, Runnable runnable, p.b bVar) {
        this.f7247m = oVar;
        this.f7248n = runnable;
        this.f7249o = bVar;
    }

    public final void run() {
        this.f7247m.x(this.f7248n, this.f7249o);
    }
}
