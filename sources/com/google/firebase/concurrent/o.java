package com.google.firebase.concurrent;

import com.google.firebase.concurrent.p;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

class o implements ScheduledExecutorService {

    /* renamed from: m  reason: collision with root package name */
    private final ExecutorService f7256m;

    /* renamed from: n  reason: collision with root package name */
    private final ScheduledExecutorService f7257n;

    o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f7256m = executorService;
        this.f7257n = scheduledExecutorService;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void o(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void p(Runnable runnable, p.b bVar) {
        this.f7256m.execute(new l(runnable, bVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture q(Runnable runnable, long j10, TimeUnit timeUnit, p.b bVar) {
        return this.f7257n.schedule(new i(this, runnable, bVar), j10, timeUnit);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void r(Callable callable, p.b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Future s(Callable callable, p.b bVar) {
        return this.f7256m.submit(new d(callable, bVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture t(Callable callable, long j10, TimeUnit timeUnit, p.b bVar) {
        return this.f7257n.schedule(new e(this, callable, bVar), j10, timeUnit);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void u(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e10) {
            bVar.a(e10);
            throw e10;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void v(Runnable runnable, p.b bVar) {
        this.f7256m.execute(new m(runnable, bVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture w(Runnable runnable, long j10, long j11, TimeUnit timeUnit, p.b bVar) {
        return this.f7257n.scheduleAtFixedRate(new j(this, runnable, bVar), j10, j11, timeUnit);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void x(Runnable runnable, p.b bVar) {
        this.f7256m.execute(new n(runnable, bVar));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ScheduledFuture y(Runnable runnable, long j10, long j11, TimeUnit timeUnit, p.b bVar) {
        return this.f7257n.scheduleWithFixedDelay(new k(this, runnable, bVar), j10, j11, timeUnit);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void z(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e10) {
            bVar.a(e10);
        }
    }

    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f7256m.awaitTermination(j10, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f7256m.execute(runnable);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f7256m.invokeAll(collection);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return this.f7256m.invokeAll(collection, j10, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return this.f7256m.invokeAny(collection);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return this.f7256m.invokeAny(collection, j10, timeUnit);
    }

    public boolean isShutdown() {
        return this.f7256m.isShutdown();
    }

    public boolean isTerminated() {
        return this.f7256m.isTerminated();
    }

    public ScheduledFuture<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        return new p(new g(this, runnable, j10, timeUnit));
    }

    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
        return new p(new h(this, callable, j10, timeUnit));
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return new p(new c(this, runnable, j10, j11, timeUnit));
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return new p(new f(this, runnable, j10, j11, timeUnit));
    }

    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public Future<?> submit(Runnable runnable) {
        return this.f7256m.submit(runnable);
    }

    public <T> Future<T> submit(Runnable runnable, T t9) {
        return this.f7256m.submit(runnable, t9);
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return this.f7256m.submit(callable);
    }
}
