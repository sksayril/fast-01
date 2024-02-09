package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.concurrent.Callable;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Callable f7223m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ p.b f7224n;

    public /* synthetic */ d(Callable callable, p.b bVar) {
        this.f7223m = callable;
        this.f7224n = bVar;
    }

    public final void run() {
        o.r(this.f7223m, this.f7224n);
    }
}
