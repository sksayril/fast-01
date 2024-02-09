package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.concurrent.Callable;

public final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f7225a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Callable f7226b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p.b f7227c;

    public /* synthetic */ e(o oVar, Callable callable, p.b bVar) {
        this.f7225a = oVar;
        this.f7226b = callable;
        this.f7227c = bVar;
    }

    public final Object call() {
        return this.f7225a.s(this.f7226b, this.f7227c);
    }
}
