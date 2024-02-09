package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Runnable f7250m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ p.b f7251n;

    public /* synthetic */ l(Runnable runnable, p.b bVar) {
        this.f7250m = runnable;
        this.f7251n = bVar;
    }

    public final void run() {
        o.o(this.f7250m, this.f7251n);
    }
}
