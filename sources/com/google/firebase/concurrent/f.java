package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class f implements p.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f7228a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f7229b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f7230c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f7231d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f7232e;

    public /* synthetic */ f(o oVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        this.f7228a = oVar;
        this.f7229b = runnable;
        this.f7230c = j10;
        this.f7231d = j11;
        this.f7232e = timeUnit;
    }

    public final ScheduledFuture a(p.b bVar) {
        return this.f7228a.y(this.f7229b, this.f7230c, this.f7231d, this.f7232e, bVar);
    }
}
