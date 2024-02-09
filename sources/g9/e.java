package g9;

import androidx.concurrent.futures.b;
import g9.e;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.l;

public abstract class e<N extends e<N>> {

    /* renamed from: m  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f8983m;

    /* renamed from: n  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f8984n;
    private volatile Object _next;
    private volatile Object _prev;

    static {
        Class<Object> cls = Object.class;
        Class<e> cls2 = e.class;
        f8983m = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f8984n = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
    }

    public e(N n10) {
        this._prev = n10;
    }

    private final N c() {
        N g10 = g();
        while (g10 != null && g10.h()) {
            g10 = (e) f8984n.get(g10);
        }
        return g10;
    }

    private final N d() {
        N e10;
        N e11 = e();
        l.b(e11);
        while (e11.h() && (e10 = e11.e()) != null) {
            e11 = e10;
        }
        return e11;
    }

    /* access modifiers changed from: private */
    public final Object f() {
        return f8983m.get(this);
    }

    public final void b() {
        f8984n.lazySet(this, (Object) null);
    }

    public final N e() {
        N a10 = f();
        if (a10 == d.f8981a) {
            return null;
        }
        return (e) a10;
    }

    public final N g() {
        return (e) f8984n.get(this);
    }

    public abstract boolean h();

    public final boolean i() {
        return e() == null;
    }

    public final boolean j() {
        return b.a(f8983m, this, (Object) null, d.f8981a);
    }

    public final void k() {
        Object obj;
        if (!i()) {
            while (true) {
                e c10 = c();
                e d10 = d();
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8984n;
                do {
                    obj = atomicReferenceFieldUpdater.get(d10);
                } while (!b.a(atomicReferenceFieldUpdater, d10, obj, ((e) obj) == null ? null : c10));
                if (c10 != null) {
                    f8983m.set(c10, d10);
                }
                if ((!d10.h() || d10.i()) && (c10 == null || !c10.h())) {
                    return;
                }
            }
        }
    }

    public final boolean l(N n10) {
        return b.a(f8983m, this, (Object) null, n10);
    }
}
