package com.google.android.gms.measurement.internal;

import android.content.Context;
import h2.p;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import l2.d;

public final class f6 extends k7 {
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final AtomicLong f6016l = new AtomicLong(Long.MIN_VALUE);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public j6 f6017c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public j6 f6018d;

    /* renamed from: e  reason: collision with root package name */
    private final PriorityBlockingQueue<k6<?>> f6019e = new PriorityBlockingQueue<>();

    /* renamed from: f  reason: collision with root package name */
    private final BlockingQueue<k6<?>> f6020f = new LinkedBlockingQueue();

    /* renamed from: g  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f6021g = new i6(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: h  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f6022h = new i6(this, "Thread death: Uncaught exception on network thread");
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final Object f6023i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final Semaphore f6024j = new Semaphore(2);
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public volatile boolean f6025k;

    f6(m6 m6Var) {
        super(m6Var);
    }

    private final void x(k6<?> k6Var) {
        synchronized (this.f6023i) {
            this.f6019e.add(k6Var);
            j6 j6Var = this.f6017c;
            if (j6Var == null) {
                j6 j6Var2 = new j6(this, "Measurement Worker", this.f6019e);
                this.f6017c = j6Var2;
                j6Var2.setUncaughtExceptionHandler(this.f6021g);
                this.f6017c.start();
            } else {
                j6Var.a();
            }
        }
    }

    public final <V> Future<V> A(Callable<V> callable) {
        n();
        p.j(callable);
        k6 k6Var = new k6(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f6017c) {
            k6Var.run();
        } else {
            x(k6Var);
        }
        return k6Var;
    }

    public final void C(Runnable runnable) {
        n();
        p.j(runnable);
        x(new k6(this, runnable, false, "Task exception on worker thread"));
    }

    public final void F(Runnable runnable) {
        n();
        p.j(runnable);
        x(new k6(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean I() {
        return Thread.currentThread() == this.f6017c;
    }

    public final /* bridge */ /* synthetic */ d a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ f c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ g d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ c0 e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ w4 f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ k5 g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ oc h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ f6 i() {
        return super.i();
    }

    public final void j() {
        if (Thread.currentThread() != this.f6018d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final /* bridge */ /* synthetic */ x4 k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    public final void m() {
        if (Thread.currentThread() != this.f6017c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:11|12|13|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3 = k().K();
        r3.a("Interrupted waiting for " + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        r2 = r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r2 != null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = k().K();
        r3.a("Timed out waiting for " + r5);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T u(java.util.concurrent.atomic.AtomicReference<T> r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
        /*
            r1 = this;
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.f6 r0 = r1.i()     // Catch:{ all -> 0x0048 }
            r0.C(r6)     // Catch:{ all -> 0x0048 }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x002c }
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x002b
            com.google.android.gms.measurement.internal.x4 r3 = r1.k()
            com.google.android.gms.measurement.internal.z4 r3 = r3.K()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Timed out waiting for "
            r4.<init>(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.a(r4)
        L_0x002b:
            return r2
        L_0x002c:
            com.google.android.gms.measurement.internal.x4 r3 = r1.k()     // Catch:{ all -> 0x0048 }
            com.google.android.gms.measurement.internal.z4 r3 = r3.K()     // Catch:{ all -> 0x0048 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0048 }
            java.lang.String r6 = "Interrupted waiting for "
            r4.<init>(r6)     // Catch:{ all -> 0x0048 }
            r4.append(r5)     // Catch:{ all -> 0x0048 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0048 }
            r3.a(r4)     // Catch:{ all -> 0x0048 }
            r3 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            return r3
        L_0x0048:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.f6.u(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    public final <V> Future<V> v(Callable<V> callable) {
        n();
        p.j(callable);
        k6 k6Var = new k6(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f6017c) {
            if (!this.f6019e.isEmpty()) {
                k().K().a("Callable skipped the worker queue.");
            }
            k6Var.run();
        } else {
            x(k6Var);
        }
        return k6Var;
    }

    public final void y(Runnable runnable) {
        n();
        p.j(runnable);
        k6 k6Var = new k6(this, runnable, false, "Task exception on network thread");
        synchronized (this.f6023i) {
            this.f6020f.add(k6Var);
            j6 j6Var = this.f6018d;
            if (j6Var == null) {
                j6 j6Var2 = new j6(this, "Measurement Network", this.f6020f);
                this.f6018d = j6Var2;
                j6Var2.setUncaughtExceptionHandler(this.f6022h);
                this.f6018d.start();
            } else {
                j6Var.a();
            }
        }
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
