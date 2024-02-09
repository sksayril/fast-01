package i9;

import androidx.concurrent.futures.b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.u;

public final class n {

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f9654b;

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f9655c;

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f9656d;

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f9657e;

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReferenceArray<h> f9658a = new AtomicReferenceArray<>(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    static {
        Class<n> cls = n.class;
        f9654b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f9655c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f9656d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f9657e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    private final h b(h hVar) {
        if (d() == 127) {
            return hVar;
        }
        boolean z9 = true;
        if (hVar.f9642n.b() != 1) {
            z9 = false;
        }
        if (z9) {
            f9657e.incrementAndGet(this);
        }
        int i10 = f9655c.get(this) & 127;
        while (this.f9658a.get(i10) != null) {
            Thread.yield();
        }
        this.f9658a.lazySet(i10, hVar);
        f9655c.incrementAndGet(this);
        return null;
    }

    private final void c(h hVar) {
        if (hVar != null) {
            boolean z9 = true;
            if (hVar.f9642n.b() != 1) {
                z9 = false;
            }
            if (z9) {
                f9657e.decrementAndGet(this);
            }
        }
    }

    private final int d() {
        return f9655c.get(this) - f9656d.get(this);
    }

    private final h i() {
        h andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9656d;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 - f9655c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1) && (andSet = this.f9658a.getAndSet(i11, (Object) null)) != null) {
                c(andSet);
                return andSet;
            }
        }
    }

    private final boolean j(d dVar) {
        h i10 = i();
        if (i10 == null) {
            return false;
        }
        dVar.a(i10);
        return true;
    }

    private final h k(boolean z9) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h hVar;
        do {
            atomicReferenceFieldUpdater = f9654b;
            hVar = (h) atomicReferenceFieldUpdater.get(this);
            if (hVar != null) {
                boolean z10 = true;
                if (hVar.f9642n.b() != 1) {
                    z10 = false;
                }
                if (z10 == z9) {
                }
            }
            int i10 = f9656d.get(this);
            int i11 = f9655c.get(this);
            while (i10 != i11) {
                if (z9 && f9657e.get(this) == 0) {
                    return null;
                }
                i11--;
                h m10 = m(i11, z9);
                if (m10 != null) {
                    return m10;
                }
            }
            return null;
        } while (!b.a(atomicReferenceFieldUpdater, this, hVar, (Object) null));
        return hVar;
    }

    private final h l(int i10) {
        int i11 = f9656d.get(this);
        int i12 = f9655c.get(this);
        boolean z9 = true;
        if (i10 != 1) {
            z9 = false;
        }
        while (i11 != i12) {
            if (z9 && f9657e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            h m10 = m(i11, z9);
            if (m10 != null) {
                return m10;
            }
            i11 = i13;
        }
        return null;
    }

    private final h m(int i10, boolean z9) {
        int i11 = i10 & 127;
        h hVar = this.f9658a.get(i11);
        if (hVar != null) {
            boolean z10 = true;
            if (hVar.f9642n.b() != 1) {
                z10 = false;
            }
            if (z10 == z9 && this.f9658a.compareAndSet(i11, hVar, (Object) null)) {
                if (z9) {
                    f9657e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }

    private final long o(int i10, u<h> uVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        T t9;
        do {
            atomicReferenceFieldUpdater = f9654b;
            t9 = (h) atomicReferenceFieldUpdater.get(this);
            if (t9 == null) {
                return -2;
            }
            int i11 = 1;
            if (!(t9.f9642n.b() == 1)) {
                i11 = 2;
            }
            if ((i11 & i10) == 0) {
                return -2;
            }
            long a10 = l.f9650f.a() - t9.f9641m;
            long j10 = l.f9646b;
            if (a10 < j10) {
                return j10 - a10;
            }
        } while (!b.a(atomicReferenceFieldUpdater, this, t9, (Object) null));
        uVar.f11078m = t9;
        return -1;
    }

    public final h a(h hVar, boolean z9) {
        if (z9) {
            return b(hVar);
        }
        h hVar2 = (h) f9654b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final int e() {
        return f9654b.get(this) != null ? d() + 1 : d();
    }

    public final void f(d dVar) {
        h hVar = (h) f9654b.getAndSet(this, (Object) null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        do {
        } while (j(dVar));
    }

    public final h g() {
        h hVar = (h) f9654b.getAndSet(this, (Object) null);
        return hVar == null ? i() : hVar;
    }

    public final h h() {
        return k(true);
    }

    public final long n(int i10, u<h> uVar) {
        T i11 = i10 == 3 ? i() : l(i10);
        if (i11 == null) {
            return o(i10, uVar);
        }
        uVar.f11078m = i11;
        return -1;
    }
}
