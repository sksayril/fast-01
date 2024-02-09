package com.google.android.gms.measurement.internal;

import android.os.Process;
import h2.p;
import java.util.concurrent.BlockingQueue;

final class j6 extends Thread {

    /* renamed from: m  reason: collision with root package name */
    private final Object f6155m;

    /* renamed from: n  reason: collision with root package name */
    private final BlockingQueue<k6<?>> f6156n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f6157o = false;

    /* renamed from: p  reason: collision with root package name */
    private final /* synthetic */ f6 f6158p;

    public j6(f6 f6Var, String str, BlockingQueue<k6<?>> blockingQueue) {
        this.f6158p = f6Var;
        p.j(str);
        p.j(blockingQueue);
        this.f6155m = new Object();
        this.f6156n = blockingQueue;
        setName(str);
    }

    private final void b(InterruptedException interruptedException) {
        z4 K = this.f6158p.k().K();
        String name = getName();
        K.b(name + " was interrupted", interruptedException);
    }

    private final void c() {
        synchronized (this.f6158p.f6023i) {
            if (!this.f6157o) {
                this.f6158p.f6024j.release();
                this.f6158p.f6023i.notifyAll();
                if (this == this.f6158p.f6017c) {
                    this.f6158p.f6017c = null;
                } else if (this == this.f6158p.f6018d) {
                    this.f6158p.f6018d = null;
                } else {
                    this.f6158p.k().F().a("Current scheduler thread is neither worker nor network");
                }
                this.f6157o = true;
            }
        }
    }

    public final void a() {
        synchronized (this.f6155m) {
            this.f6155m.notifyAll();
        }
    }

    public final void run() {
        boolean z9 = false;
        while (!z9) {
            try {
                this.f6158p.f6024j.acquire();
                z9 = true;
            } catch (InterruptedException e10) {
                b(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                k6 k6Var = (k6) this.f6156n.poll();
                if (k6Var != null) {
                    Process.setThreadPriority(k6Var.f6256n ? threadPriority : 10);
                    k6Var.run();
                } else {
                    synchronized (this.f6155m) {
                        if (this.f6156n.peek() == null && !this.f6158p.f6025k) {
                            try {
                                this.f6155m.wait(30000);
                            } catch (InterruptedException e11) {
                                b(e11);
                            }
                        }
                    }
                    synchronized (this.f6158p.f6023i) {
                        if (this.f6156n.peek() == null) {
                            c();
                            c();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }
}
