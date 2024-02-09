package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.os.Looper;
import d3.j;
import d3.k;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class q0 {

    /* renamed from: a  reason: collision with root package name */
    private static final ExecutorService f7386a = z.c("awaitEvenIfOnMainThread task continuation executor");

    public static <T> T f(j<T> jVar) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        jVar.k(f7386a, new o0(countDownLatch));
        countDownLatch.await(Looper.getMainLooper() == Looper.myLooper() ? 3 : 4, TimeUnit.SECONDS);
        if (jVar.q()) {
            return jVar.n();
        }
        if (jVar.o()) {
            throw new CancellationException("Task is already canceled");
        } else if (jVar.p()) {
            throw new IllegalStateException(jVar.m());
        } else {
            throw new TimeoutException();
        }
    }

    public static boolean g(CountDownLatch countDownLatch, long j10, TimeUnit timeUnit) {
        long nanos;
        boolean await;
        boolean z9 = false;
        try {
            nanos = timeUnit.toNanos(j10);
            while (true) {
                await = countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                break;
            }
            if (z9) {
                Thread.currentThread().interrupt();
            }
            return await;
        } catch (InterruptedException unused) {
            z9 = true;
            nanos = (System.nanoTime() + nanos) - System.nanoTime();
        } catch (Throwable th) {
            if (z9) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    public static <T> j<T> h(Executor executor, Callable<j<T>> callable) {
        k kVar = new k();
        executor.execute(new p0(callable, executor, kVar));
        return kVar.a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object j(k kVar, j jVar) {
        if (jVar.q()) {
            kVar.c(jVar.n());
            return null;
        } else if (jVar.m() == null) {
            return null;
        } else {
            kVar.b(jVar.m());
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void k(Callable callable, Executor executor, k kVar) {
        try {
            ((j) callable.call()).k(executor, new n0(kVar));
        } catch (Exception e10) {
            kVar.b(e10);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Void l(k kVar, j jVar) {
        if (jVar.q()) {
            kVar.e(jVar.n());
            return null;
        } else if (jVar.m() == null) {
            return null;
        } else {
            kVar.d(jVar.m());
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Void m(k kVar, j jVar) {
        if (jVar.q()) {
            kVar.e(jVar.n());
            return null;
        } else if (jVar.m() == null) {
            return null;
        } else {
            kVar.d(jVar.m());
            return null;
        }
    }

    @SuppressLint({"TaskMainThread"})
    public static <T> j<T> n(j<T> jVar, j<T> jVar2) {
        k kVar = new k();
        m0 m0Var = new m0(kVar);
        jVar.j(m0Var);
        jVar2.j(m0Var);
        return kVar.a();
    }

    public static <T> j<T> o(Executor executor, j<T> jVar, j<T> jVar2) {
        k kVar = new k();
        l0 l0Var = new l0(kVar);
        jVar.k(executor, l0Var);
        jVar2.k(executor, l0Var);
        return kVar.a();
    }
}
