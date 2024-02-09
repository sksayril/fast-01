package g9;

import b9.g0;
import b9.i0;
import b9.p0;
import b9.s0;
import j8.g;
import j8.h;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class o extends g0 implements s0 {

    /* renamed from: t  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f9013t = AtomicIntegerFieldUpdater.newUpdater(o.class, "runningWorkers");
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final g0 f9014o;

    /* renamed from: p  reason: collision with root package name */
    private final int f9015p;

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ s0 f9016q;

    /* renamed from: r  reason: collision with root package name */
    private final t<Runnable> f9017r;
    private volatile int runningWorkers;

    /* renamed from: s  reason: collision with root package name */
    private final Object f9018s;

    private final class a implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        private Runnable f9019m;

        public a(Runnable runnable) {
            this.f9019m = runnable;
        }

        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f9019m.run();
                } catch (Throwable th) {
                    i0.a(h.f10863m, th);
                }
                Runnable M = o.this.N();
                if (M != null) {
                    this.f9019m = M;
                    i10++;
                    if (i10 >= 16 && o.this.f9014o.J(o.this)) {
                        o.this.f9014o.I(o.this, this);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public o(g0 g0Var, int i10) {
        this.f9014o = g0Var;
        this.f9015p = i10;
        s0 s0Var = g0Var instanceof s0 ? (s0) g0Var : null;
        this.f9016q = s0Var == null ? p0.a() : s0Var;
        this.f9017r = new t<>(false);
        this.f9018s = new Object();
    }

    /* access modifiers changed from: private */
    public final Runnable N() {
        while (true) {
            Runnable d10 = this.f9017r.d();
            if (d10 != null) {
                return d10;
            }
            synchronized (this.f9018s) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9013t;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f9017r.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    private final boolean O() {
        boolean z9;
        synchronized (this.f9018s) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9013t;
            if (atomicIntegerFieldUpdater.get(this) >= this.f9015p) {
                z9 = false;
            } else {
                atomicIntegerFieldUpdater.incrementAndGet(this);
                z9 = true;
            }
        }
        return z9;
    }

    public void I(g gVar, Runnable runnable) {
        Runnable N;
        this.f9017r.a(runnable);
        if (f9013t.get(this) < this.f9015p && O() && (N = N()) != null) {
            this.f9014o.I(this, new a(N));
        }
    }
}
