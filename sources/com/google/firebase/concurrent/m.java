package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Runnable f7252m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ p.b f7253n;

    public /* synthetic */ m(Runnable runnable, p.b bVar) {
        this.f7252m = runnable;
        this.f7253n = bVar;
    }

    public final void run() {
        o.u(this.f7252m, this.f7253n);
    }
}
