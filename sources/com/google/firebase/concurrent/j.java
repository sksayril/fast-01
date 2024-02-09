package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ o f7244m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Runnable f7245n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ p.b f7246o;

    public /* synthetic */ j(o oVar, Runnable runnable, p.b bVar) {
        this.f7244m = oVar;
        this.f7245n = runnable;
        this.f7246o = bVar;
    }

    public final void run() {
        this.f7244m.v(this.f7245n, this.f7246o);
    }
}
