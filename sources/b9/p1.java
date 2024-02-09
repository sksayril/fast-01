package b9;

import g8.s;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import r8.l;

final class p1 extends t1 {

    /* renamed from: r  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f3480r = AtomicIntegerFieldUpdater.newUpdater(p1.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: q  reason: collision with root package name */
    private final l<Throwable, s> f3481q;

    public p1(l<? super Throwable, s> lVar) {
        this.f3481q = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        v((Throwable) obj);
        return s.f8976a;
    }

    public void v(Throwable th) {
        if (f3480r.compareAndSet(this, 0, 1)) {
            this.f3481q.invoke(th);
        }
    }
}
