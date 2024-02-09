package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class c implements p.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f7218a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f7219b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f7220c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ long f7221d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f7222e;

    public /* synthetic */ c(o oVar, Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        this.f7218a = oVar;
        this.f7219b = runnable;
        this.f7220c = j10;
        this.f7221d = j11;
        this.f7222e = timeUnit;
    }

    public final ScheduledFuture a(p.b bVar) {
        return this.f7218a.w(this.f7219b, this.f7220c, this.f7221d, this.f7222e, bVar);
    }
}
