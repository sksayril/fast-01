package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import z3.g;

public final class z {

    class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f7434a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AtomicLong f7435b;

        /* renamed from: com.google.firebase.crashlytics.internal.common.z$a$a  reason: collision with other inner class name */
        class C0097a extends d {

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ Runnable f7436m;

            C0097a(Runnable runnable) {
                this.f7436m = runnable;
            }

            public void a() {
                this.f7436m.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.f7434a = str;
            this.f7435b = atomicLong;
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C0097a(runnable));
            newThread.setName(this.f7434a + this.f7435b.getAndIncrement());
            return newThread;
        }
    }

    class b extends d {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f7438m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ ExecutorService f7439n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ long f7440o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ TimeUnit f7441p;

        b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
            this.f7438m = str;
            this.f7439n = executorService;
            this.f7440o = j10;
            this.f7441p = timeUnit;
        }

        public void a() {
            try {
                g f10 = g.f();
                f10.b("Executing shutdown hook for " + this.f7438m);
                this.f7439n.shutdown();
                if (!this.f7439n.awaitTermination(this.f7440o, this.f7441p)) {
                    g f11 = g.f();
                    f11.b(this.f7438m + " did not shut down in the allocated time. Requesting immediate shutdown.");
                    this.f7439n.shutdownNow();
                }
            } catch (InterruptedException unused) {
                g.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{this.f7438m}));
                this.f7439n.shutdownNow();
            }
        }
    }

    private static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2, TimeUnit.SECONDS);
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static void b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        b bVar = new b(str, executorService, j10, timeUnit);
        runtime.addShutdownHook(new Thread(bVar, "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService e10 = e(d(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, e10);
        return e10;
    }

    public static ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1));
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static ExecutorService e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
