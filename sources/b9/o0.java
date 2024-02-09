package b9;

import b9.c1;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.l;

public final class o0 extends c1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: u  reason: collision with root package name */
    public static final o0 f3473u;

    /* renamed from: v  reason: collision with root package name */
    private static final long f3474v;

    static {
        Long l10;
        o0 o0Var = new o0();
        f3473u = o0Var;
        b1.R(o0Var, false, 1, (Object) null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f3474v = timeUnit.toNanos(l10.longValue());
    }

    private o0() {
    }

    private final synchronized void n0() {
        if (q0()) {
            debugStatus = 3;
            i0();
            l.c(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    private final synchronized Thread o0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean p0() {
        return debugStatus == 4;
    }

    private final boolean q0() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    private final synchronized boolean r0() {
        if (q0()) {
            return false;
        }
        debugStatus = 1;
        l.c(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    private final void s0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    /* access modifiers changed from: protected */
    public Thread X() {
        Thread thread = _thread;
        return thread == null ? o0() : thread;
    }

    /* access modifiers changed from: protected */
    public void Y(long j10, c1.a aVar) {
        s0();
    }

    public void d0(Runnable runnable) {
        if (p0()) {
            s0();
        }
        super.d0(runnable);
    }

    public void run() {
        m2.f3468a.d(this);
        c.a();
        try {
            if (r0()) {
                long j10 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long U = U();
                    if (U == Long.MAX_VALUE) {
                        c.a();
                        long nanoTime = System.nanoTime();
                        if (j10 == Long.MAX_VALUE) {
                            j10 = f3474v + nanoTime;
                        }
                        long j11 = j10 - nanoTime;
                        if (j11 <= 0) {
                            _thread = null;
                            n0();
                            c.a();
                            if (!g0()) {
                                X();
                                return;
                            }
                            return;
                        }
                        U = i.d(U, j11);
                    } else {
                        j10 = Long.MAX_VALUE;
                    }
                    if (U > 0) {
                        if (q0()) {
                            _thread = null;
                            n0();
                            c.a();
                            if (!g0()) {
                                X();
                                return;
                            }
                            return;
                        }
                        c.a();
                        LockSupport.parkNanos(this, U);
                    }
                }
            }
        } finally {
            _thread = null;
            n0();
            c.a();
            if (!g0()) {
                X();
            }
        }
    }

    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
