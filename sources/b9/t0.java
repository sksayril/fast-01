package b9;

import g9.d0;
import g9.k;
import j8.d;
import j8.g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import r8.l;

public final class t0<T> extends d0<T> {

    /* renamed from: q  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f3491q = AtomicIntegerFieldUpdater.newUpdater(t0.class, "_decision");
    private volatile int _decision;

    public t0(g gVar, d<? super T> dVar) {
        super(gVar, dVar);
    }

    private final boolean N0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3491q;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f3491q.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean O0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3491q;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f3491q.compareAndSet(this, 0, 1));
        return true;
    }

    /* access modifiers changed from: protected */
    public void B(Object obj) {
        I0(obj);
    }

    /* access modifiers changed from: protected */
    public void I0(Object obj) {
        if (!N0()) {
            k.c(c.c(this.f8982p), d0.a(obj, this.f8982p), (l) null, 2, (Object) null);
        }
    }

    public final Object M0() {
        if (O0()) {
            return d.d();
        }
        Object h10 = z1.h(d0());
        if (!(h10 instanceof z)) {
            return h10;
        }
        throw ((z) h10).f3519a;
    }
}
