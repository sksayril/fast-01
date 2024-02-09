package g9;

import b9.f2;
import g9.e0;
import j8.g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public abstract class e0<S extends e0<S>> extends e<S> implements f2 {

    /* renamed from: p  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f8985p = AtomicIntegerFieldUpdater.newUpdater(e0.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;

    /* renamed from: o  reason: collision with root package name */
    public final long f8986o;

    public e0(long j10, S s9, int i10) {
        super(s9);
        this.f8986o = j10;
        this.cleanedAndPointers = i10 << 16;
    }

    public boolean h() {
        return f8985p.get(this) == n() && !i();
    }

    public final boolean m() {
        return f8985p.addAndGet(this, -65536) == n() && !i();
    }

    public abstract int n();

    public abstract void o(int i10, Throwable th, g gVar);

    public final void p() {
        if (f8985p.incrementAndGet(this) == n()) {
            k();
        }
    }

    public final boolean q() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f8985p;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (!(i10 != n() || i())) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 65536 + i10));
        return true;
    }
}
