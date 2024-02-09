package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class g implements p.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f7233a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f7234b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f7235c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f7236d;

    public /* synthetic */ g(o oVar, Runnable runnable, long j10, TimeUnit timeUnit) {
        this.f7233a = oVar;
        this.f7234b = runnable;
        this.f7235c = j10;
        this.f7236d = timeUnit;
    }

    public final ScheduledFuture a(p.b bVar) {
        return this.f7233a.q(this.f7234b, this.f7235c, this.f7236d, bVar);
    }
}
