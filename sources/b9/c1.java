package b9;

import g8.s;
import g9.n0;
import g9.o0;
import g9.u;
import j8.g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.l;

public abstract class c1 extends d1 implements s0 {

    /* renamed from: r  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f3435r;

    /* renamed from: s  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f3436s;

    /* renamed from: t  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f3437t;
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    public static abstract class a implements Runnable, Comparable<a>, y0, o0 {
        private volatile Object _heap;

        /* renamed from: m  reason: collision with root package name */
        public long f3438m;

        /* renamed from: n  reason: collision with root package name */
        private int f3439n;

        public final void e() {
            synchronized (this) {
                Object obj = this._heap;
                if (obj != f1.f3450a) {
                    b bVar = obj instanceof b ? (b) obj : null;
                    if (bVar != null) {
                        bVar.g(this);
                    }
                    this._heap = f1.f3450a;
                    s sVar = s.f8976a;
                }
            }
        }

        public void g(int i10) {
            this.f3439n = i10;
        }

        public int i() {
            return this.f3439n;
        }

        public n0<?> m() {
            Object obj = this._heap;
            if (obj instanceof n0) {
                return (n0) obj;
            }
            return null;
        }

        public void n(n0<?> n0Var) {
            if (this._heap != f1.f3450a) {
                this._heap = n0Var;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: q */
        public int compareTo(a aVar) {
            int i10 = ((this.f3438m - aVar.f3438m) > 0 ? 1 : ((this.f3438m - aVar.f3438m) == 0 ? 0 : -1));
            if (i10 > 0) {
                return 1;
            }
            return i10 < 0 ? -1 : 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0046, code lost:
            r8 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000b, code lost:
            return r8;
         */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0040  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int r(long r8, b9.c1.b r10, b9.c1 r11) {
            /*
                r7 = this;
                monitor-enter(r7)
                java.lang.Object r0 = r7._heap     // Catch:{ all -> 0x004b }
                g9.h0 r1 = b9.f1.f3450a     // Catch:{ all -> 0x004b }
                if (r0 != r1) goto L_0x000c
                r8 = 2
            L_0x000a:
                monitor-exit(r7)
                return r8
            L_0x000c:
                monitor-enter(r10)     // Catch:{ all -> 0x004b }
                g9.o0 r0 = r10.b()     // Catch:{ all -> 0x0048 }
                b9.c1$a r0 = (b9.c1.a) r0     // Catch:{ all -> 0x0048 }
                boolean r11 = r11.f0()     // Catch:{ all -> 0x0048 }
                if (r11 == 0) goto L_0x001d
                r8 = 1
                monitor-exit(r10)     // Catch:{ all -> 0x004b }
                monitor-exit(r7)
                return r8
            L_0x001d:
                r1 = 0
                if (r0 != 0) goto L_0x0024
            L_0x0021:
                r10.f3440c = r8     // Catch:{ all -> 0x0048 }
                goto L_0x0037
            L_0x0024:
                long r3 = r0.f3438m     // Catch:{ all -> 0x0048 }
                long r5 = r3 - r8
                int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r11 < 0) goto L_0x002d
                goto L_0x002e
            L_0x002d:
                r8 = r3
            L_0x002e:
                long r3 = r10.f3440c     // Catch:{ all -> 0x0048 }
                long r3 = r8 - r3
                int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r11 <= 0) goto L_0x0037
                goto L_0x0021
            L_0x0037:
                long r8 = r7.f3438m     // Catch:{ all -> 0x0048 }
                long r3 = r10.f3440c     // Catch:{ all -> 0x0048 }
                long r8 = r8 - r3
                int r11 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r11 >= 0) goto L_0x0042
                r7.f3438m = r3     // Catch:{ all -> 0x0048 }
            L_0x0042:
                r10.a(r7)     // Catch:{ all -> 0x0048 }
                monitor-exit(r10)     // Catch:{ all -> 0x004b }
                r8 = 0
                goto L_0x000a
            L_0x0048:
                r8 = move-exception
                monitor-exit(r10)     // Catch:{ all -> 0x004b }
                throw r8     // Catch:{ all -> 0x004b }
            L_0x004b:
                r8 = move-exception
                monitor-exit(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: b9.c1.a.r(long, b9.c1$b, b9.c1):int");
        }

        public final boolean s(long j10) {
            return j10 - this.f3438m >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f3438m + ']';
        }
    }

    public static final class b extends n0<a> {

        /* renamed from: c  reason: collision with root package name */
        public long f3440c;

        public b(long j10) {
            this.f3440c = j10;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<c1> cls2 = c1.class;
        f3435r = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        f3436s = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
        f3437t = AtomicIntegerFieldUpdater.newUpdater(cls2, "_isCompleted");
    }

    private final void b0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3435r;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f3435r, this, (Object) null, f1.f3451b)) {
                    return;
                }
            } else if (obj instanceof u) {
                ((u) obj).d();
                return;
            } else if (obj != f1.f3451b) {
                u uVar = new u(8, true);
                l.c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                uVar.a((Runnable) obj);
                if (androidx.concurrent.futures.b.a(f3435r, this, obj, uVar)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private final Runnable c0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3435r;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof u) {
                l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                u uVar = (u) obj;
                Object j10 = uVar.j();
                if (j10 != u.f9035h) {
                    return (Runnable) j10;
                }
                androidx.concurrent.futures.b.a(f3435r, this, obj, uVar.i());
            } else if (obj == f1.f3451b) {
                return null;
            } else {
                if (androidx.concurrent.futures.b.a(f3435r, this, obj, (Object) null)) {
                    l.c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final boolean e0(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3435r;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f0()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f3435r, this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof u) {
                l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                u uVar = (u) obj;
                int a10 = uVar.a(runnable);
                if (a10 == 0) {
                    return true;
                }
                if (a10 == 1) {
                    androidx.concurrent.futures.b.a(f3435r, this, obj, uVar.i());
                } else if (a10 == 2) {
                    return false;
                }
            } else if (obj == f1.f3451b) {
                return false;
            } else {
                u uVar2 = new u(8, true);
                l.c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                uVar2.a((Runnable) obj);
                uVar2.a(runnable);
                if (androidx.concurrent.futures.b.a(f3435r, this, obj, uVar2)) {
                    return true;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final boolean f0() {
        return f3437t.get(this) != 0;
    }

    private final void h0() {
        a aVar;
        c.a();
        long nanoTime = System.nanoTime();
        while (true) {
            b bVar = (b) f3436s.get(this);
            if (bVar != null && (aVar = (a) bVar.i()) != null) {
                Y(nanoTime, aVar);
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: b9.c1$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int k0(long r4, b9.c1.a r6) {
        /*
            r3 = this;
            boolean r0 = r3.f0()
            if (r0 == 0) goto L_0x0008
            r4 = 1
            return r4
        L_0x0008:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f3436s
            java.lang.Object r1 = r0.get(r3)
            b9.c1$b r1 = (b9.c1.b) r1
            if (r1 != 0) goto L_0x0025
            r1 = 0
            b9.c1$b r2 = new b9.c1$b
            r2.<init>(r4)
            androidx.concurrent.futures.b.a(r0, r3, r1, r2)
            java.lang.Object r0 = r0.get(r3)
            kotlin.jvm.internal.l.b(r0)
            r1 = r0
            b9.c1$b r1 = (b9.c1.b) r1
        L_0x0025:
            int r4 = r6.r(r4, r1, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.c1.k0(long, b9.c1$a):int");
    }

    private final void l0(boolean z9) {
        f3437t.set(this, z9 ? 1 : 0);
    }

    private final boolean m0(a aVar) {
        b bVar = (b) f3436s.get(this);
        return (bVar != null ? (a) bVar.e() : null) == aVar;
    }

    public final void I(g gVar, Runnable runnable) {
        d0(runnable);
    }

    /* access modifiers changed from: protected */
    public long P() {
        a aVar;
        if (super.P() == 0) {
            return 0;
        }
        Object obj = f3435r.get(this);
        if (obj != null) {
            if (!(obj instanceof u)) {
                return obj == f1.f3451b ? Long.MAX_VALUE : 0;
            }
            if (!((u) obj).g()) {
                return 0;
            }
        }
        b bVar = (b) f3436s.get(this);
        if (bVar == null || (aVar = (a) bVar.e()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = aVar.f3438m;
        c.a();
        return i.b(j10 - System.nanoTime(), 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long U() {
        /*
            r9 = this;
            boolean r0 = r9.V()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f3436s
            java.lang.Object r0 = r0.get(r9)
            b9.c1$b r0 = (b9.c1.b) r0
            if (r0 == 0) goto L_0x0049
            boolean r3 = r0.d()
            if (r3 != 0) goto L_0x0049
            b9.c.a()
            long r3 = java.lang.System.nanoTime()
        L_0x0020:
            monitor-enter(r0)
            g9.o0 r5 = r0.b()     // Catch:{ all -> 0x0046 }
            r6 = 0
            if (r5 != 0) goto L_0x002a
        L_0x0028:
            monitor-exit(r0)
            goto L_0x0041
        L_0x002a:
            b9.c1$a r5 = (b9.c1.a) r5     // Catch:{ all -> 0x0046 }
            boolean r7 = r5.s(r3)     // Catch:{ all -> 0x0046 }
            r8 = 0
            if (r7 == 0) goto L_0x0038
            boolean r5 = r9.e0(r5)     // Catch:{ all -> 0x0046 }
            goto L_0x0039
        L_0x0038:
            r5 = 0
        L_0x0039:
            if (r5 == 0) goto L_0x0028
            g9.o0 r5 = r0.h(r8)     // Catch:{ all -> 0x0046 }
            r6 = r5
            goto L_0x0028
        L_0x0041:
            b9.c1$a r6 = (b9.c1.a) r6
            if (r6 != 0) goto L_0x0020
            goto L_0x0049
        L_0x0046:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0049:
            java.lang.Runnable r0 = r9.c0()
            if (r0 == 0) goto L_0x0053
            r0.run()
            return r1
        L_0x0053:
            long r0 = r9.P()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.c1.U():long");
    }

    public void d0(Runnable runnable) {
        if (e0(runnable)) {
            Z();
        } else {
            o0.f3473u.d0(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public boolean g0() {
        if (!T()) {
            return false;
        }
        b bVar = (b) f3436s.get(this);
        if (bVar != null && !bVar.d()) {
            return false;
        }
        Object obj = f3435r.get(this);
        if (obj != null) {
            return obj instanceof u ? ((u) obj).g() : obj == f1.f3451b;
        }
    }

    /* access modifiers changed from: protected */
    public final void i0() {
        f3435r.set(this, (Object) null);
        f3436s.set(this, (Object) null);
    }

    public final void j0(long j10, a aVar) {
        int k02 = k0(j10, aVar);
        if (k02 != 0) {
            if (k02 == 1) {
                Y(j10, aVar);
            } else if (k02 != 2) {
                throw new IllegalStateException("unexpected result".toString());
            }
        } else if (m0(aVar)) {
            Z();
        }
    }

    public void shutdown() {
        m2.f3468a.c();
        l0(true);
        b0();
        do {
        } while (U() <= 0);
        h0();
    }
}
