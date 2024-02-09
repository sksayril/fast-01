package b9;

import b9.r1;
import g8.s;
import g9.a0;
import g9.r;
import g9.s;
import j8.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import r8.p;

public class y1 implements r1, t, g2 {

    /* renamed from: m  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f3505m;

    /* renamed from: n  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f3506n;
    private volatile Object _parentHandle;
    private volatile Object _state;

    private static final class a<T> extends m<T> {

        /* renamed from: u  reason: collision with root package name */
        private final y1 f3507u;

        public a(j8.d<? super T> dVar, y1 y1Var) {
            super(dVar, 1);
            this.f3507u = y1Var;
        }

        /* access modifiers changed from: protected */
        public String G() {
            return "AwaitContinuation";
        }

        public Throwable u(r1 r1Var) {
            Throwable f10;
            Object d02 = this.f3507u.d0();
            return (!(d02 instanceof c) || (f10 = ((c) d02).f()) == null) ? d02 instanceof z ? ((z) d02).f3519a : r1Var.y() : f10;
        }
    }

    private static final class b extends x1 {

        /* renamed from: q  reason: collision with root package name */
        private final y1 f3508q;

        /* renamed from: r  reason: collision with root package name */
        private final c f3509r;

        /* renamed from: s  reason: collision with root package name */
        private final s f3510s;

        /* renamed from: t  reason: collision with root package name */
        private final Object f3511t;

        public b(y1 y1Var, c cVar, s sVar, Object obj) {
            this.f3508q = y1Var;
            this.f3509r = cVar;
            this.f3510s = sVar;
            this.f3511t = obj;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            v((Throwable) obj);
            return s.f8976a;
        }

        public void v(Throwable th) {
            this.f3508q.S(this.f3509r, this.f3510s, this.f3511t);
        }
    }

    private static final class c implements m1 {

        /* renamed from: n  reason: collision with root package name */
        private static final AtomicIntegerFieldUpdater f3512n;

        /* renamed from: o  reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f3513o;

        /* renamed from: p  reason: collision with root package name */
        private static final AtomicReferenceFieldUpdater f3514p;
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;

        /* renamed from: m  reason: collision with root package name */
        private final d2 f3515m;

        static {
            Class<Object> cls = Object.class;
            Class<c> cls2 = c.class;
            f3512n = AtomicIntegerFieldUpdater.newUpdater(cls2, "_isCompleting");
            f3513o = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_rootCause");
            f3514p = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_exceptionsHolder");
        }

        public c(d2 d2Var, boolean z9, Throwable th) {
            this.f3515m = d2Var;
            this._isCompleting = z9 ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        private final Object e() {
            return f3514p.get(this);
        }

        private final void l(Object obj) {
            f3514p.set(this, obj);
        }

        public final void a(Throwable th) {
            Throwable f10 = f();
            if (f10 == null) {
                m(th);
            } else if (th != f10) {
                Object e10 = e();
                if (e10 == null) {
                    l(th);
                } else if (e10 instanceof Throwable) {
                    if (th != e10) {
                        ArrayList<Throwable> c10 = c();
                        c10.add(e10);
                        c10.add(th);
                        l(c10);
                    }
                } else if (e10 instanceof ArrayList) {
                    ((ArrayList) e10).add(th);
                } else {
                    throw new IllegalStateException(("State is " + e10).toString());
                }
            }
        }

        public boolean b() {
            return f() == null;
        }

        public d2 d() {
            return this.f3515m;
        }

        public final Throwable f() {
            return (Throwable) f3513o.get(this);
        }

        public final boolean g() {
            return f() != null;
        }

        public final boolean h() {
            return f3512n.get(this) != 0;
        }

        public final boolean i() {
            return e() == z1.f3525e;
        }

        public final List<Throwable> j(Throwable th) {
            ArrayList<Throwable> arrayList;
            Object e10 = e();
            if (e10 == null) {
                arrayList = c();
            } else if (e10 instanceof Throwable) {
                ArrayList<Throwable> c10 = c();
                c10.add(e10);
                arrayList = c10;
            } else if (e10 instanceof ArrayList) {
                arrayList = (ArrayList) e10;
            } else {
                throw new IllegalStateException(("State is " + e10).toString());
            }
            Throwable f10 = f();
            if (f10 != null) {
                arrayList.add(0, f10);
            }
            if (th != null && !l.a(th, f10)) {
                arrayList.add(th);
            }
            l(z1.f3525e);
            return arrayList;
        }

        public final void k(boolean z9) {
            f3512n.set(this, z9 ? 1 : 0);
        }

        public final void m(Throwable th) {
            f3513o.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + g() + ", completing=" + h() + ", rootCause=" + f() + ", exceptions=" + e() + ", list=" + d() + ']';
        }
    }

    public static final class d extends s.a {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ y1 f3516d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f3517e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(g9.s sVar, y1 y1Var, Object obj) {
            super(sVar);
            this.f3516d = y1Var;
            this.f3517e = obj;
        }

        /* renamed from: f */
        public Object d(g9.s sVar) {
            if (this.f3516d.d0() == this.f3517e) {
                return null;
            }
            return r.a();
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<y1> cls2 = y1.class;
        f3505m = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_state");
        f3506n = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_parentHandle");
    }

    public y1(boolean z9) {
        this._state = z9 ? z1.f3527g : z1.f3526f;
    }

    public static /* synthetic */ CancellationException B0(y1 y1Var, Throwable th, String str, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            return y1Var.A0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    private final boolean D0(m1 m1Var, Object obj) {
        if (!androidx.concurrent.futures.b.a(f3505m, this, m1Var, z1.g(obj))) {
            return false;
        }
        r0((Throwable) null);
        s0(obj);
        R(m1Var, obj);
        return true;
    }

    private final boolean E0(m1 m1Var, Throwable th) {
        d2 b02 = b0(m1Var);
        if (b02 == null) {
            return false;
        }
        if (!androidx.concurrent.futures.b.a(f3505m, this, m1Var, new c(b02, false, th))) {
            return false;
        }
        p0(b02, th);
        return true;
    }

    private final Object F0(Object obj, Object obj2) {
        return !(obj instanceof m1) ? z1.f3521a : (((obj instanceof a1) || (obj instanceof x1)) && !(obj instanceof s) && !(obj2 instanceof z)) ? D0((m1) obj, obj2) ? obj2 : z1.f3523c : G0((m1) obj, obj2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006e, code lost:
        r3 = (java.lang.Throwable) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0071, code lost:
        if (r2 == null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0073, code lost:
        p0(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0076, code lost:
        r9 = V(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x007a, code lost:
        if (r9 == null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0080, code lost:
        if (H0(r1, r9, r10) == false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0084, code lost:
        return b9.z1.f3522b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0089, code lost:
        return U(r1, r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object G0(b9.m1 r9, java.lang.Object r10) {
        /*
            r8 = this;
            b9.d2 r0 = r8.b0(r9)
            if (r0 != 0) goto L_0x000b
            g9.h0 r9 = b9.z1.f3523c
            return r9
        L_0x000b:
            boolean r1 = r9 instanceof b9.y1.c
            r2 = 0
            if (r1 == 0) goto L_0x0014
            r1 = r9
            b9.y1$c r1 = (b9.y1.c) r1
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            r3 = 0
            if (r1 != 0) goto L_0x001d
            b9.y1$c r1 = new b9.y1$c
            r1.<init>(r0, r3, r2)
        L_0x001d:
            kotlin.jvm.internal.u r4 = new kotlin.jvm.internal.u
            r4.<init>()
            monitor-enter(r1)
            boolean r5 = r1.h()     // Catch:{ all -> 0x008a }
            if (r5 == 0) goto L_0x002f
            g9.h0 r9 = b9.z1.f3521a     // Catch:{ all -> 0x008a }
            monitor-exit(r1)
            return r9
        L_0x002f:
            r5 = 1
            r1.k(r5)     // Catch:{ all -> 0x008a }
            if (r1 == r9) goto L_0x0043
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f3505m     // Catch:{ all -> 0x008a }
            boolean r6 = androidx.concurrent.futures.b.a(r6, r8, r9, r1)     // Catch:{ all -> 0x008a }
            if (r6 != 0) goto L_0x0043
            g9.h0 r9 = b9.z1.f3523c     // Catch:{ all -> 0x008a }
            monitor-exit(r1)
            return r9
        L_0x0043:
            boolean r6 = r1.g()     // Catch:{ all -> 0x008a }
            boolean r7 = r10 instanceof b9.z     // Catch:{ all -> 0x008a }
            if (r7 == 0) goto L_0x004f
            r7 = r10
            b9.z r7 = (b9.z) r7     // Catch:{ all -> 0x008a }
            goto L_0x0050
        L_0x004f:
            r7 = r2
        L_0x0050:
            if (r7 == 0) goto L_0x0057
            java.lang.Throwable r7 = r7.f3519a     // Catch:{ all -> 0x008a }
            r1.a(r7)     // Catch:{ all -> 0x008a }
        L_0x0057:
            java.lang.Throwable r7 = r1.f()     // Catch:{ all -> 0x008a }
            if (r6 != 0) goto L_0x005e
            r3 = 1
        L_0x005e:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x008a }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x0069
            r2 = r7
        L_0x0069:
            r4.f11078m = r2     // Catch:{ all -> 0x008a }
            g8.s r3 = g8.s.f8976a     // Catch:{ all -> 0x008a }
            monitor-exit(r1)
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            if (r2 == 0) goto L_0x0076
            r8.p0(r0, r2)
        L_0x0076:
            b9.s r9 = r8.V(r9)
            if (r9 == 0) goto L_0x0085
            boolean r9 = r8.H0(r1, r9, r10)
            if (r9 == 0) goto L_0x0085
            g9.h0 r9 = b9.z1.f3522b
            return r9
        L_0x0085:
            java.lang.Object r9 = r8.U(r1, r10)
            return r9
        L_0x008a:
            r9 = move-exception
            monitor-exit(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.y1.G0(b9.m1, java.lang.Object):java.lang.Object");
    }

    private final boolean H0(c cVar, s sVar, Object obj) {
        while (r1.a.d(sVar.f3489q, false, false, new b(this, cVar, sVar, obj), 1, (Object) null) == e2.f3444m) {
            sVar = o0(sVar);
            if (sVar == null) {
                return false;
            }
        }
        return true;
    }

    private final Object J(j8.d<Object> dVar) {
        a aVar = new a(c.c(dVar), this);
        aVar.z();
        o.a(aVar, h(new h2(aVar)));
        Object w9 = aVar.w();
        if (w9 == d.d()) {
            h.c(dVar);
        }
        return w9;
    }

    private final Object N(Object obj) {
        Object F0;
        do {
            Object d02 = d0();
            if (!(d02 instanceof m1) || ((d02 instanceof c) && ((c) d02).h())) {
                return z1.f3521a;
            }
            F0 = F0(d02, new z(T(obj), false, 2, (g) null));
        } while (F0 == z1.f3523c);
        return F0;
    }

    private final boolean O(Throwable th) {
        if (i0()) {
            return true;
        }
        boolean z9 = th instanceof CancellationException;
        r c02 = c0();
        return (c02 == null || c02 == e2.f3444m) ? z9 : c02.k(th) || z9;
    }

    private final void R(m1 m1Var, Object obj) {
        r c02 = c0();
        if (c02 != null) {
            c02.e();
            x0(e2.f3444m);
        }
        Throwable th = null;
        z zVar = obj instanceof z ? (z) obj : null;
        if (zVar != null) {
            th = zVar.f3519a;
        }
        if (m1Var instanceof x1) {
            try {
                ((x1) m1Var).v(th);
            } catch (Throwable th2) {
                f0(new c0("Exception in completion handler " + m1Var + " for " + this, th2));
            }
        } else {
            d2 d10 = m1Var.d();
            if (d10 != null) {
                q0(d10, th);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void S(c cVar, s sVar, Object obj) {
        s o02 = o0(sVar);
        if (o02 == null || !H0(cVar, o02, obj)) {
            B(U(cVar, obj));
        }
    }

    private final Throwable T(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new s1(P(), (Throwable) null, this) : th;
        }
        l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((g2) obj).u();
    }

    private final Object U(c cVar, Object obj) {
        boolean g10;
        Throwable Y;
        z zVar = obj instanceof z ? (z) obj : null;
        Throwable th = zVar != null ? zVar.f3519a : null;
        synchronized (cVar) {
            g10 = cVar.g();
            List<Throwable> j10 = cVar.j(th);
            Y = Y(cVar, j10);
            if (Y != null) {
                x(Y, j10);
            }
        }
        boolean z9 = false;
        if (!(Y == null || Y == th)) {
            obj = new z(Y, false, 2, (g) null);
        }
        if (Y != null) {
            if (O(Y) || e0(Y)) {
                z9 = true;
            }
            if (z9) {
                l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                ((z) obj).b();
            }
        }
        if (!g10) {
            r0(Y);
        }
        s0(obj);
        androidx.concurrent.futures.b.a(f3505m, this, cVar, z1.g(obj));
        R(cVar, obj);
        return obj;
    }

    private final s V(m1 m1Var) {
        s sVar = m1Var instanceof s ? (s) m1Var : null;
        if (sVar != null) {
            return sVar;
        }
        d2 d10 = m1Var.d();
        if (d10 != null) {
            return o0(d10);
        }
        return null;
    }

    private final Throwable X(Object obj) {
        z zVar = obj instanceof z ? (z) obj : null;
        if (zVar != null) {
            return zVar.f3519a;
        }
        return null;
    }

    private final Throwable Y(c cVar, List<? extends Throwable> list) {
        T t9 = null;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (!(((Throwable) next) instanceof CancellationException)) {
                    t9 = next;
                    break;
                }
            }
            Throwable th = (Throwable) t9;
            return th != null ? th : (Throwable) list.get(0);
        } else if (cVar.g()) {
            return new s1(P(), (Throwable) null, this);
        } else {
            return null;
        }
    }

    private final d2 b0(m1 m1Var) {
        d2 d10 = m1Var.d();
        if (d10 != null) {
            return d10;
        }
        if (m1Var instanceof a1) {
            return new d2();
        }
        if (m1Var instanceof x1) {
            v0((x1) m1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + m1Var).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        if (r0 == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        p0(((b9.y1.c) r2).d(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004d, code lost:
        return b9.z1.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object j0(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r6.d0()
            boolean r3 = r2 instanceof b9.y1.c
            if (r3 == 0) goto L_0x0051
            monitor-enter(r2)
            r3 = r2
            b9.y1$c r3 = (b9.y1.c) r3     // Catch:{ all -> 0x004e }
            boolean r3 = r3.i()     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x001a
            g9.h0 r7 = b9.z1.f3524d     // Catch:{ all -> 0x004e }
            monitor-exit(r2)
            return r7
        L_0x001a:
            r3 = r2
            b9.y1$c r3 = (b9.y1.c) r3     // Catch:{ all -> 0x004e }
            boolean r3 = r3.g()     // Catch:{ all -> 0x004e }
            if (r7 != 0) goto L_0x0025
            if (r3 != 0) goto L_0x0031
        L_0x0025:
            if (r1 != 0) goto L_0x002b
            java.lang.Throwable r1 = r6.T(r7)     // Catch:{ all -> 0x004e }
        L_0x002b:
            r7 = r2
            b9.y1$c r7 = (b9.y1.c) r7     // Catch:{ all -> 0x004e }
            r7.a(r1)     // Catch:{ all -> 0x004e }
        L_0x0031:
            r7 = r2
            b9.y1$c r7 = (b9.y1.c) r7     // Catch:{ all -> 0x004e }
            java.lang.Throwable r7 = r7.f()     // Catch:{ all -> 0x004e }
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x003d
            r0 = r7
        L_0x003d:
            monitor-exit(r2)
            if (r0 == 0) goto L_0x0049
            b9.y1$c r2 = (b9.y1.c) r2
            b9.d2 r7 = r2.d()
            r6.p0(r7, r0)
        L_0x0049:
            g9.h0 r7 = b9.z1.f3521a
            return r7
        L_0x004e:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        L_0x0051:
            boolean r3 = r2 instanceof b9.m1
            if (r3 == 0) goto L_0x00a2
            if (r1 != 0) goto L_0x005b
            java.lang.Throwable r1 = r6.T(r7)
        L_0x005b:
            r3 = r2
            b9.m1 r3 = (b9.m1) r3
            boolean r4 = r3.b()
            if (r4 == 0) goto L_0x006f
            boolean r2 = r6.E0(r3, r1)
            if (r2 == 0) goto L_0x0002
            g9.h0 r7 = b9.z1.f3521a
            return r7
        L_0x006f:
            b9.z r3 = new b9.z
            r4 = 0
            r5 = 2
            r3.<init>(r1, r4, r5, r0)
            java.lang.Object r3 = r6.F0(r2, r3)
            g9.h0 r4 = b9.z1.f3521a
            if (r3 == r4) goto L_0x0087
            g9.h0 r2 = b9.z1.f3523c
            if (r3 == r2) goto L_0x0002
            return r3
        L_0x0087:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot happen in "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x00a2:
            g9.h0 r7 = b9.z1.f3524d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.y1.j0(java.lang.Object):java.lang.Object");
    }

    private final x1 m0(r8.l<? super Throwable, g8.s> lVar, boolean z9) {
        x1 x1Var = null;
        if (z9) {
            if (lVar instanceof t1) {
                x1Var = (t1) lVar;
            }
            if (x1Var == null) {
                x1Var = new p1(lVar);
            }
        } else {
            if (lVar instanceof x1) {
                x1Var = (x1) lVar;
            }
            if (x1Var == null) {
                x1Var = new q1(lVar);
            }
        }
        x1Var.x(this);
        return x1Var;
    }

    private final s o0(g9.s sVar) {
        while (sVar.q()) {
            sVar = sVar.p();
        }
        while (true) {
            sVar = sVar.o();
            if (!sVar.q()) {
                if (sVar instanceof s) {
                    return (s) sVar;
                }
                if (sVar instanceof d2) {
                    return null;
                }
            }
        }
    }

    private final void p0(d2 d2Var, Throwable th) {
        r0(th);
        Object n10 = d2Var.n();
        l.c(n10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        c0 c0Var = null;
        for (g9.s sVar = (g9.s) n10; !l.a(sVar, d2Var); sVar = sVar.o()) {
            if (sVar instanceof t1) {
                x1 x1Var = (x1) sVar;
                try {
                    x1Var.v(th);
                } catch (Throwable th2) {
                    if (c0Var != null) {
                        b.a(c0Var, th2);
                    } else {
                        c0Var = new c0("Exception in completion handler " + x1Var + " for " + this, th2);
                        g8.s sVar2 = g8.s.f8976a;
                    }
                }
            }
        }
        if (c0Var != null) {
            f0(c0Var);
        }
        O(th);
    }

    private final void q0(d2 d2Var, Throwable th) {
        Object n10 = d2Var.n();
        l.c(n10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        c0 c0Var = null;
        for (g9.s sVar = (g9.s) n10; !l.a(sVar, d2Var); sVar = sVar.o()) {
            if (sVar instanceof x1) {
                x1 x1Var = (x1) sVar;
                try {
                    x1Var.v(th);
                } catch (Throwable th2) {
                    if (c0Var != null) {
                        b.a(c0Var, th2);
                    } else {
                        c0Var = new c0("Exception in completion handler " + x1Var + " for " + this, th2);
                        g8.s sVar2 = g8.s.f8976a;
                    }
                }
            }
        }
        if (c0Var != null) {
            f0(c0Var);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [b9.l1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void u0(b9.a1 r3) {
        /*
            r2 = this;
            b9.d2 r0 = new b9.d2
            r0.<init>()
            boolean r1 = r3.b()
            if (r1 == 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            b9.l1 r1 = new b9.l1
            r1.<init>(r0)
            r0 = r1
        L_0x0012:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f3505m
            androidx.concurrent.futures.b.a(r1, r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.y1.u0(b9.a1):void");
    }

    private final boolean v(Object obj, d2 d2Var, x1 x1Var) {
        int u9;
        d dVar = new d(x1Var, this, obj);
        do {
            u9 = d2Var.p().u(x1Var, d2Var, dVar);
            if (u9 == 1) {
                return true;
            }
        } while (u9 != 2);
        return false;
    }

    private final void v0(x1 x1Var) {
        x1Var.i(new d2());
        androidx.concurrent.futures.b.a(f3505m, this, x1Var, x1Var.o());
    }

    private final void x(Throwable th, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            for (Throwable th2 : list) {
                if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                    b.a(th, th2);
                }
            }
        }
    }

    private final int y0(Object obj) {
        if (obj instanceof a1) {
            if (((a1) obj).b()) {
                return 0;
            }
            if (!androidx.concurrent.futures.b.a(f3505m, this, obj, z1.f3527g)) {
                return -1;
            }
            t0();
            return 1;
        } else if (!(obj instanceof l1)) {
            return 0;
        } else {
            if (!androidx.concurrent.futures.b.a(f3505m, this, obj, ((l1) obj).d())) {
                return -1;
            }
            t0();
            return 1;
        }
    }

    private final String z0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof m1 ? ((m1) obj).b() ? "Active" : "New" : obj instanceof z ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.g() ? "Cancelling" : cVar.h() ? "Completing" : "Active";
    }

    public void A(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new s1(P(), (Throwable) null, this);
        }
        M(cancellationException);
    }

    /* access modifiers changed from: protected */
    public final CancellationException A0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = P();
            }
            cancellationException = new s1(str, th, this);
        }
        return cancellationException;
    }

    /* access modifiers changed from: protected */
    public void B(Object obj) {
    }

    public final r C(t tVar) {
        y0 d10 = r1.a.d(this, true, false, new s(tVar), 2, (Object) null);
        l.c(d10, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (r) d10;
    }

    public final String C0() {
        return n0() + '{' + z0(d0()) + '}';
    }

    public final void E(g2 g2Var) {
        L(g2Var);
    }

    /* access modifiers changed from: protected */
    public final Object I(j8.d<Object> dVar) {
        Object d02;
        do {
            d02 = d0();
            if (!(d02 instanceof m1)) {
                if (!(d02 instanceof z)) {
                    return z1.h(d02);
                }
                throw ((z) d02).f3519a;
            }
        } while (y0(d02) < 0);
        return J(dVar);
    }

    public final boolean K(Throwable th) {
        return L(th);
    }

    public final boolean L(Object obj) {
        Object a10 = z1.f3521a;
        if (a0() && (a10 = N(obj)) == z1.f3522b) {
            return true;
        }
        if (a10 == z1.f3521a) {
            a10 = j0(obj);
        }
        if (a10 == z1.f3521a || a10 == z1.f3522b) {
            return true;
        }
        if (a10 == z1.f3524d) {
            return false;
        }
        B(a10);
        return true;
    }

    public void M(Throwable th) {
        L(th);
    }

    /* access modifiers changed from: protected */
    public String P() {
        return "Job was cancelled";
    }

    public boolean Q(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return L(th) && Z();
    }

    public final Object W() {
        Object d02 = d0();
        if (!(!(d02 instanceof m1))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        } else if (!(d02 instanceof z)) {
            return z1.h(d02);
        } else {
            throw ((z) d02).f3519a;
        }
    }

    public boolean Z() {
        return true;
    }

    public <E extends g.b> E a(g.c<E> cVar) {
        return r1.a.c(this, cVar);
    }

    public boolean a0() {
        return false;
    }

    public boolean b() {
        Object d02 = d0();
        return (d02 instanceof m1) && ((m1) d02).b();
    }

    public final r c0() {
        return (r) f3506n.get(this);
    }

    public final Object d0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3505m;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof a0)) {
                return obj;
            }
            ((a0) obj).a(this);
        }
    }

    /* access modifiers changed from: protected */
    public boolean e0(Throwable th) {
        return false;
    }

    public void f0(Throwable th) {
        throw th;
    }

    /* access modifiers changed from: protected */
    public final void g0(r1 r1Var) {
        if (r1Var == null) {
            x0(e2.f3444m);
            return;
        }
        r1Var.start();
        r C = r1Var.C(this);
        x0(C);
        if (h0()) {
            C.e();
            x0(e2.f3444m);
        }
    }

    public final g.c<?> getKey() {
        return r1.f3485c;
    }

    public r1 getParent() {
        r c02 = c0();
        if (c02 != null) {
            return c02.getParent();
        }
        return null;
    }

    public final y0 h(r8.l<? super Throwable, g8.s> lVar) {
        return w(false, true, lVar);
    }

    public final boolean h0() {
        return !(d0() instanceof m1);
    }

    /* access modifiers changed from: protected */
    public boolean i0() {
        return false;
    }

    public final boolean isCancelled() {
        Object d02 = d0();
        return (d02 instanceof z) || ((d02 instanceof c) && ((c) d02).g());
    }

    public <R> R k(R r9, p<? super R, ? super g.b, ? extends R> pVar) {
        return r1.a.b(this, r9, pVar);
    }

    public final boolean k0(Object obj) {
        Object F0;
        do {
            F0 = F0(d0(), obj);
            if (F0 == z1.f3521a) {
                return false;
            }
            if (F0 == z1.f3522b) {
                return true;
            }
        } while (F0 == z1.f3523c);
        B(F0);
        return true;
    }

    public final Object l0(Object obj) {
        Object F0;
        do {
            F0 = F0(d0(), obj);
            if (F0 == z1.f3521a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, X(obj));
            }
        } while (F0 == z1.f3523c);
        return F0;
    }

    public String n0() {
        return n0.a(this);
    }

    public j8.g r(g.c<?> cVar) {
        return r1.a.e(this, cVar);
    }

    /* access modifiers changed from: protected */
    public void r0(Throwable th) {
    }

    /* access modifiers changed from: protected */
    public void s0(Object obj) {
    }

    public final boolean start() {
        int y02;
        do {
            y02 = y0(d0());
            if (y02 == 0) {
                return false;
            }
        } while (y02 != 1);
        return true;
    }

    public j8.g t(j8.g gVar) {
        return r1.a.f(this, gVar);
    }

    /* access modifiers changed from: protected */
    public void t0() {
    }

    public String toString() {
        return C0() + '@' + n0.b(this);
    }

    public CancellationException u() {
        Throwable th;
        Object d02 = d0();
        CancellationException cancellationException = null;
        if (d02 instanceof c) {
            th = ((c) d02).f();
        } else if (d02 instanceof z) {
            th = ((z) d02).f3519a;
        } else if (!(d02 instanceof m1)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + d02).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        if (cancellationException != null) {
            return cancellationException;
        }
        return new s1("Parent job is " + z0(d02), th, this);
    }

    public final y0 w(boolean z9, boolean z10, r8.l<? super Throwable, g8.s> lVar) {
        x1 m02 = m0(lVar, z9);
        while (true) {
            Object d02 = d0();
            if (d02 instanceof a1) {
                a1 a1Var = (a1) d02;
                if (!a1Var.b()) {
                    u0(a1Var);
                } else if (androidx.concurrent.futures.b.a(f3505m, this, d02, m02)) {
                    return m02;
                }
            } else {
                Throwable th = null;
                if (d02 instanceof m1) {
                    d2 d10 = ((m1) d02).d();
                    if (d10 == null) {
                        l.c(d02, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        v0((x1) d02);
                    } else {
                        y0 y0Var = e2.f3444m;
                        if (z9 && (d02 instanceof c)) {
                            synchronized (d02) {
                                th = ((c) d02).f();
                                if (th == null || ((lVar instanceof s) && !((c) d02).h())) {
                                    if (v(d02, d10, m02)) {
                                        if (th == null) {
                                            return m02;
                                        }
                                        y0Var = m02;
                                    }
                                }
                                g8.s sVar = g8.s.f8976a;
                            }
                        }
                        if (th != null) {
                            if (z10) {
                                lVar.invoke(th);
                            }
                            return y0Var;
                        } else if (v(d02, d10, m02)) {
                            return m02;
                        }
                    }
                } else {
                    if (z10) {
                        z zVar = d02 instanceof z ? (z) d02 : null;
                        if (zVar != null) {
                            th = zVar.f3519a;
                        }
                        lVar.invoke(th);
                    }
                    return e2.f3444m;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w0(b9.x1 r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.d0()
            boolean r1 = r0 instanceof b9.x1
            if (r1 == 0) goto L_0x0018
            if (r0 == r4) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f3505m
            b9.a1 r2 = b9.z1.f3527g
            boolean r0 = androidx.concurrent.futures.b.a(r1, r3, r0, r2)
            if (r0 == 0) goto L_0x0000
            return
        L_0x0018:
            boolean r1 = r0 instanceof b9.m1
            if (r1 == 0) goto L_0x0027
            b9.m1 r0 = (b9.m1) r0
            b9.d2 r0 = r0.d()
            if (r0 == 0) goto L_0x0027
            r4.r()
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.y1.w0(b9.x1):void");
    }

    public final void x0(r rVar) {
        f3506n.set(this, rVar);
    }

    public final CancellationException y() {
        Object d02 = d0();
        if (d02 instanceof c) {
            Throwable f10 = ((c) d02).f();
            if (f10 != null) {
                CancellationException A0 = A0(f10, n0.a(this) + " is cancelling");
                if (A0 != null) {
                    return A0;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (d02 instanceof m1) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (d02 instanceof z) {
            return B0(this, ((z) d02).f3519a, (String) null, 1, (Object) null);
        } else {
            return new s1(n0.a(this) + " has completed normally", (Throwable) null, this);
        }
    }
}
