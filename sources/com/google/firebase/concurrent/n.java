package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Runnable f7254m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ p.b f7255n;

    public /* synthetic */ n(Runnable runnable, p.b bVar) {
        this.f7254m = runnable;
        this.f7255n = bVar;
    }

    public final void run() {
        o.z(this.f7254m, this.f7255n);
    }
}
