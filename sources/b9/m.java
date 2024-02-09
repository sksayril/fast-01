package b9;

import androidx.concurrent.futures.b;
import b9.r1;
import g8.s;
import g9.e0;
import g9.h0;
import g9.j;
import j8.d;
import j8.g;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.l;

public class m<T> extends u0<T> implements l<T>, e, q2 {

    /* renamed from: r  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f3463r = AtomicIntegerFieldUpdater.newUpdater(m.class, "_decisionAndIndex");

    /* renamed from: s  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f3464s;

    /* renamed from: t  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f3465t;
    private volatile int _decisionAndIndex = 536870911;
    private volatile Object _parentHandle;
    private volatile Object _state = d.f3441m;

    /* renamed from: p  reason: collision with root package name */
    private final d<T> f3466p;

    /* renamed from: q  reason: collision with root package name */
    private final g f3467q;

    static {
        Class<Object> cls = Object.class;
        f3464s = AtomicReferenceFieldUpdater.newUpdater(m.class, cls, "_state");
        f3465t = AtomicReferenceFieldUpdater.newUpdater(m.class, cls, "_parentHandle");
    }

    public m(d<? super T> dVar, int i10) {
        super(i10);
        this.f3466p = dVar;
        this.f3467q = dVar.getContext();
    }

    private final y0 A() {
        r1 r1Var = (r1) getContext().a(r1.f3485c);
        if (r1Var == null) {
            return null;
        }
        y0 d10 = r1.a.d(r1Var, true, false, new q(this), 2, (Object) null);
        b.a(f3465t, this, (Object) null, d10);
        return d10;
    }

    private final void B(Object obj) {
        Object obj2 = obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3464s;
        while (true) {
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof d)) {
                if (obj3 instanceof j ? true : obj3 instanceof e0) {
                    F(obj2, obj3);
                } else {
                    boolean z9 = obj3 instanceof z;
                    if (z9) {
                        z zVar = (z) obj3;
                        if (!zVar.b()) {
                            F(obj2, obj3);
                        }
                        if (obj3 instanceof p) {
                            Throwable th = null;
                            if (!z9) {
                                zVar = null;
                            }
                            if (zVar != null) {
                                th = zVar.f3519a;
                            }
                            if (obj2 instanceof j) {
                                m((j) obj2, th);
                                return;
                            }
                            l.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            p((e0) obj2, th);
                            return;
                        }
                        return;
                    } else if (obj3 instanceof y) {
                        y yVar = (y) obj3;
                        if (yVar.f3501b != null) {
                            F(obj2, obj3);
                        }
                        if (!(obj2 instanceof e0)) {
                            l.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                            j jVar = (j) obj2;
                            if (yVar.c()) {
                                m(jVar, yVar.f3504e);
                                return;
                            } else {
                                if (b.a(f3464s, this, obj3, y.b(yVar, (Object) null, jVar, (r8.l) null, (Object) null, (Throwable) null, 29, (Object) null))) {
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    } else if (!(obj2 instanceof e0)) {
                        l.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        if (b.a(f3464s, this, obj3, new y(obj3, (j) obj2, (r8.l) null, (Object) null, (Throwable) null, 28, (kotlin.jvm.internal.g) null))) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } else if (b.a(f3464s, this, obj3, obj2)) {
                return;
            }
        }
    }

    private final boolean D() {
        if (v0.c(this.f3492o)) {
            d<T> dVar = this.f3466p;
            l.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((j) dVar).p()) {
                return true;
            }
        }
        return false;
    }

    private final j E(r8.l<? super Throwable, s> lVar) {
        return lVar instanceof j ? (j) lVar : new o1(lVar);
    }

    private final void F(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    private final void K(Object obj, int i10, r8.l<? super Throwable, s> lVar) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3464s;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof f2) {
            } else {
                if (obj2 instanceof p) {
                    p pVar = (p) obj2;
                    if (pVar.c()) {
                        if (lVar != null) {
                            o(lVar, pVar.f3519a);
                            return;
                        }
                        return;
                    }
                }
                l(obj);
                throw new g8.d();
            }
        } while (!b.a(f3464s, this, obj2, M((f2) obj2, obj, i10, lVar, (Object) null)));
        s();
        t(i10);
    }

    static /* synthetic */ void L(m mVar, Object obj, int i10, r8.l lVar, int i11, Object obj2) {
        if (obj2 == null) {
            if ((i11 & 4) != 0) {
                lVar = null;
            }
            mVar.K(obj, i10, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    private final Object M(f2 f2Var, Object obj, int i10, r8.l<? super Throwable, s> lVar, Object obj2) {
        if (obj instanceof z) {
            return obj;
        }
        if (!v0.b(i10) && obj2 == null) {
            return obj;
        }
        if (lVar == null && !(f2Var instanceof j) && obj2 == null) {
            return obj;
        }
        return new y(obj, f2Var instanceof j ? (j) f2Var : null, lVar, obj2, (Throwable) null, 16, (kotlin.jvm.internal.g) null);
    }

    private final boolean N() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3463r;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f3463r.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    private final h0 O(Object obj, Object obj2, r8.l<? super Throwable, s> lVar) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3464s;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof f2) {
            } else if (!(obj3 instanceof y) || obj2 == null || ((y) obj3).f3503d != obj2) {
                return null;
            } else {
                return n.f3470a;
            }
        } while (!b.a(f3464s, this, obj3, M((f2) obj3, obj, this.f3492o, lVar, obj2)));
        s();
        return n.f3470a;
    }

    private final boolean P() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3463r;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f3463r.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    private final Void l(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void p(e0<?> e0Var, Throwable th) {
        int i10 = f3463r.get(this) & 536870911;
        if (i10 != 536870911) {
            try {
                e0Var.o(i10, th, getContext());
            } catch (Throwable th2) {
                g context = getContext();
                i0.a(context, new c0("Exception in invokeOnCancellation handler for " + this, th2));
            }
        } else {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
    }

    private final boolean q(Throwable th) {
        if (!D()) {
            return false;
        }
        d<T> dVar = this.f3466p;
        l.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((j) dVar).q(th);
    }

    private final void s() {
        if (!D()) {
            r();
        }
    }

    private final void t(int i10) {
        if (!N()) {
            v0.a(this, i10);
        }
    }

    private final y0 v() {
        return (y0) f3465t.get(this);
    }

    private final String y() {
        Object x9 = x();
        return x9 instanceof f2 ? "Active" : x9 instanceof p ? "Cancelled" : "Completed";
    }

    public boolean C() {
        return !(x() instanceof f2);
    }

    /* access modifiers changed from: protected */
    public String G() {
        return "CancellableContinuation";
    }

    public final void H(Throwable th) {
        if (!q(th)) {
            d(th);
            s();
        }
    }

    public final void I() {
        Throwable s9;
        d<T> dVar = this.f3466p;
        j jVar = dVar instanceof j ? (j) dVar : null;
        if (jVar != null && (s9 = jVar.s(this)) != null) {
            r();
            d(s9);
        }
    }

    public final boolean J() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3464s;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (!(obj instanceof y) || ((y) obj).f3503d == null) {
            f3463r.set(this, 536870911);
            atomicReferenceFieldUpdater.set(this, d.f3441m);
            return true;
        }
        r();
        return false;
    }

    public void a(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3464s;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof f2) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof z)) {
                if (obj2 instanceof y) {
                    y yVar = (y) obj2;
                    if (!yVar.c()) {
                        Throwable th2 = th;
                        if (b.a(f3464s, this, obj2, y.b(yVar, (Object) null, (j) null, (r8.l) null, (Object) null, th, 15, (Object) null))) {
                            yVar.d(this, th2);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else {
                    Throwable th3 = th;
                    if (b.a(f3464s, this, obj2, new y(obj2, (j) null, (r8.l) null, (Object) null, th, 14, (kotlin.jvm.internal.g) null))) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    public final d<T> b() {
        return this.f3466p;
    }

    public Throwable c(Object obj) {
        Throwable c10 = super.c(obj);
        if (c10 != null) {
            return c10;
        }
        return null;
    }

    public boolean d(Throwable th) {
        Object obj;
        boolean z9;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3464s;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            z9 = false;
            if (!(obj instanceof f2)) {
                return false;
            }
            if ((obj instanceof j) || (obj instanceof e0)) {
                z9 = true;
            }
        } while (!b.a(f3464s, this, obj, new p(this, th, z9)));
        f2 f2Var = (f2) obj;
        if (f2Var instanceof j) {
            m((j) obj, th);
        } else if (f2Var instanceof e0) {
            p((e0) obj, th);
        }
        s();
        t(this.f3492o);
        return true;
    }

    public void e(e0<?> e0Var, int i10) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3463r;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if (!((i11 & 536870911) == 536870911)) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        B(e0Var);
    }

    public void f(T t9, r8.l<? super Throwable, s> lVar) {
        K(t9, this.f3492o, lVar);
    }

    public <T> T g(Object obj) {
        return obj instanceof y ? ((y) obj).f3500a : obj;
    }

    public e getCallerFrame() {
        d<T> dVar = this.f3466p;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public g getContext() {
        return this.f3467q;
    }

    public void i(r8.l<? super Throwable, s> lVar) {
        B(E(lVar));
    }

    public Object j(T t9, Object obj, r8.l<? super Throwable, s> lVar) {
        return O(t9, obj, lVar);
    }

    public Object k() {
        return x();
    }

    public final void m(j jVar, Throwable th) {
        try {
            jVar.f(th);
        } catch (Throwable th2) {
            g context = getContext();
            i0.a(context, new c0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public void n(Object obj) {
        t(this.f3492o);
    }

    public final void o(r8.l<? super Throwable, s> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            g context = getContext();
            i0.a(context, new c0("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void r() {
        y0 v9 = v();
        if (v9 != null) {
            v9.e();
            f3465t.set(this, e2.f3444m);
        }
    }

    public void resumeWith(Object obj) {
        L(this, d0.b(obj, this), this.f3492o, (r8.l) null, 4, (Object) null);
    }

    public String toString() {
        return G() + '(' + n0.c(this.f3466p) + "){" + y() + "}@" + n0.b(this);
    }

    public Throwable u(r1 r1Var) {
        return r1Var.y();
    }

    public final Object w() {
        r1 r1Var;
        boolean D = D();
        if (P()) {
            if (v() == null) {
                A();
            }
            if (D) {
                I();
            }
            return d.d();
        }
        if (D) {
            I();
        }
        Object x9 = x();
        if (x9 instanceof z) {
            throw ((z) x9).f3519a;
        } else if (!v0.b(this.f3492o) || (r1Var = (r1) getContext().a(r1.f3485c)) == null || r1Var.b()) {
            return g(x9);
        } else {
            CancellationException y9 = r1Var.y();
            a(x9, y9);
            throw y9;
        }
    }

    public final Object x() {
        return f3464s.get(this);
    }

    public void z() {
        y0 A = A();
        if (A != null && C()) {
            A.e();
            f3465t.set(this, e2.f3444m);
        }
    }
}
