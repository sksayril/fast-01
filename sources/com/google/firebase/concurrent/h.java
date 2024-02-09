package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class h implements p.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f7237a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Callable f7238b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f7239c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f7240d;

    public /* synthetic */ h(o oVar, Callable callable, long j10, TimeUnit timeUnit) {
        this.f7237a = oVar;
        this.f7238b = callable;
        this.f7239c = j10;
        this.f7240d = timeUnit;
    }

    public final ScheduledFuture a(p.b bVar) {
        return this.f7237a.t(this.f7238b, this.f7239c, this.f7240d, bVar);
    }
}
