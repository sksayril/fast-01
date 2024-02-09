package com.google.firebase.concurrent;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ b f7211m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ Runnable f7212n;

    public /* synthetic */ a(b bVar, Runnable runnable) {
        this.f7211m = bVar;
        this.f7212n = runnable;
    }

    public final void run() {
        this.f7211m.b(this.f7212n);
    }
}
