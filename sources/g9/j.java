package g9;

import androidx.concurrent.futures.b;
import b9.a0;
import b9.b1;
import b9.d0;
import b9.g0;
import b9.m;
import b9.m2;
import b9.n0;
import b9.u0;
import g8.s;
import j8.d;
import j8.g;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.l;

public final class j<T> extends u0<T> implements e, d<T> {

    /* renamed from: t  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f8994t = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: p  reason: collision with root package name */
    public final g0 f8995p;

    /* renamed from: q  reason: collision with root package name */
    public final d<T> f8996q;

    /* renamed from: r  reason: collision with root package name */
    public Object f8997r = k.f9000a;

    /* renamed from: s  reason: collision with root package name */
    public final Object f8998s = l0.b(getContext());

    public j(g0 g0Var, d<? super T> dVar) {
        super(-1);
        this.f8995p = g0Var;
        this.f8996q = dVar;
    }

    private final m<?> o() {
        Object obj = f8994t.get(this);
        if (obj instanceof m) {
            return (m) obj;
        }
        return null;
    }

    public void a(Object obj, Throwable th) {
        if (obj instanceof a0) {
            ((a0) obj).f3428b.invoke(th);
        }
    }

    public d<T> b() {
        return this;
    }

    public e getCallerFrame() {
        d<T> dVar = this.f8996q;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public g getContext() {
        return this.f8996q.getContext();
    }

    public Object k() {
        Object obj = this.f8997r;
        this.f8997r = k.f9000a;
        return obj;
    }

    public final void l() {
        do {
        } while (f8994t.get(this) == k.f9001b);
    }

    public final m<T> m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8994t;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f8994t.set(this, k.f9001b);
                return null;
            } else if (obj instanceof m) {
                if (b.a(f8994t, this, obj, k.f9001b)) {
                    return (m) obj;
                }
            } else if (obj != k.f9001b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final boolean p() {
        return f8994t.get(this) != null;
    }

    public final boolean q(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8994t;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            h0 h0Var = k.f9001b;
            if (l.a(obj, h0Var)) {
                if (b.a(f8994t, this, h0Var, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (b.a(f8994t, this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }

    public final void r() {
        l();
        m<?> o10 = o();
        if (o10 != null) {
            o10.r();
        }
    }

    public void resumeWith(Object obj) {
        g context;
        Object c10;
        g context2 = this.f8996q.getContext();
        Object d10 = d0.d(obj, (r8.l) null, 1, (Object) null);
        if (this.f8995p.J(context2)) {
            this.f8997r = d10;
            this.f3492o = 0;
            this.f8995p.I(context2, this);
            return;
        }
        b1 b10 = m2.f3468a.b();
        if (b10.S()) {
            this.f8997r = d10;
            this.f3492o = 0;
            b10.O(this);
            return;
        }
        b10.Q(true);
        try {
            context = getContext();
            c10 = l0.c(context, this.f8998s);
            this.f8996q.resumeWith(obj);
            s sVar = s.f8976a;
            l0.a(context, c10);
            do {
            } while (b10.V());
        } catch (Throwable th) {
            try {
                h(th, (Throwable) null);
            } catch (Throwable th2) {
                b10.L(true);
                throw th2;
            }
        }
        b10.L(true);
    }

    public final Throwable s(b9.l<?> lVar) {
        h0 h0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8994t;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            h0Var = k.f9001b;
            if (obj != h0Var) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                } else if (b.a(f8994t, this, obj, (Object) null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        } while (!b.a(f8994t, this, h0Var, lVar));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f8995p + ", " + n0.c(this.f8996q) + ']';
    }
}
