package com.google.firebase.crashlytics.internal.common;

import d3.j;
import d3.m;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class n {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f7321a;

    /* renamed from: b  reason: collision with root package name */
    private j<Void> f7322b = m.e(null);

    /* renamed from: c  reason: collision with root package name */
    private final Object f7323c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final ThreadLocal<Boolean> f7324d = new ThreadLocal<>();

    class a implements Runnable {
        a() {
        }

        public void run() {
            n.this.f7324d.set(Boolean.TRUE);
        }
    }

    class b implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f7326a;

        b(Runnable runnable) {
            this.f7326a = runnable;
        }

        /* renamed from: a */
        public Void call() {
            this.f7326a.run();
            return null;
        }
    }

    class c implements d3.b<Void, T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callable f7328a;

        c(Callable callable) {
            this.f7328a = callable;
        }

        public T a(j<Void> jVar) {
            return this.f7328a.call();
        }
    }

    class d implements d3.b<T, Void> {
        d() {
        }

        /* renamed from: b */
        public Void a(j<T> jVar) {
            return null;
        }
    }

    public n(Executor executor) {
        this.f7321a = executor;
        executor.execute(new a());
    }

    private <T> j<Void> d(j<T> jVar) {
        return jVar.k(this.f7321a, new d());
    }

    private boolean e() {
        return Boolean.TRUE.equals(this.f7324d.get());
    }

    private <T> d3.b<Void, T> f(Callable<T> callable) {
        return new c(callable);
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public Executor c() {
        return this.f7321a;
    }

    /* access modifiers changed from: package-private */
    public j<Void> g(Runnable runnable) {
        return h(new b(runnable));
    }

    public <T> j<T> h(Callable<T> callable) {
        j<TContinuationResult> k10;
        synchronized (this.f7323c) {
            k10 = this.f7322b.k(this.f7321a, f(callable));
            this.f7322b = d(k10);
        }
        return k10;
    }

    public <T> j<T> i(Callable<j<T>> callable) {
        j<TContinuationResult> l10;
        synchronized (this.f7323c) {
            l10 = this.f7322b.l(this.f7321a, f(callable));
            this.f7322b = d(l10);
        }
        return l10;
    }
}
