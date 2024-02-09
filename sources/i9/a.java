package i9;

import b9.n0;
import g8.s;
import g9.c0;
import g9.h0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.u;

public final class a implements Executor, Closeable {

    /* renamed from: t  reason: collision with root package name */
    public static final C0150a f9610t = new C0150a((g) null);

    /* renamed from: u  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f9611u = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f9612v = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: w  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f9613w = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* renamed from: x  reason: collision with root package name */
    public static final h0 f9614x = new h0("NOT_IN_STACK");
    private volatile int _isTerminated;
    private volatile long controlState;

    /* renamed from: m  reason: collision with root package name */
    public final int f9615m;

    /* renamed from: n  reason: collision with root package name */
    public final int f9616n;

    /* renamed from: o  reason: collision with root package name */
    public final long f9617o;

    /* renamed from: p  reason: collision with root package name */
    public final String f9618p;
    private volatile long parkedWorkersStack;

    /* renamed from: q  reason: collision with root package name */
    public final d f9619q;

    /* renamed from: r  reason: collision with root package name */
    public final d f9620r;

    /* renamed from: s  reason: collision with root package name */
    public final c0<c> f9621s;

    /* renamed from: i9.a$a  reason: collision with other inner class name */
    public static final class C0150a {
        private C0150a() {
        }

        public /* synthetic */ C0150a(g gVar) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9622a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                i9.a$d[] r0 = i9.a.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                i9.a$d r1 = i9.a.d.PARKING     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                i9.a$d r1 = i9.a.d.BLOCKING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                i9.a$d r1 = i9.a.d.CPU_ACQUIRED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                i9.a$d r1 = i9.a.d.DORMANT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                i9.a$d r1 = i9.a.d.TERMINATED     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f9622a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i9.a.b.<clinit>():void");
        }
    }

    public final class c extends Thread {

        /* renamed from: u  reason: collision with root package name */
        private static final AtomicIntegerFieldUpdater f9623u = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");
        private volatile int indexInArray;

        /* renamed from: m  reason: collision with root package name */
        public final n f9624m;

        /* renamed from: n  reason: collision with root package name */
        private final u<h> f9625n;
        private volatile Object nextParkedWorker;

        /* renamed from: o  reason: collision with root package name */
        public d f9626o;

        /* renamed from: p  reason: collision with root package name */
        private long f9627p;

        /* renamed from: q  reason: collision with root package name */
        private long f9628q;

        /* renamed from: r  reason: collision with root package name */
        private int f9629r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f9630s;
        private volatile int workerCtl;

        private c() {
            setDaemon(true);
            this.f9624m = new n();
            this.f9625n = new u<>();
            this.f9626o = d.DORMANT;
            this.nextParkedWorker = a.f9614x;
            this.f9629r = u8.c.f12540m.b();
        }

        public c(a aVar, int i10) {
            this();
            q(i10);
        }

        private final void b(int i10) {
            if (i10 != 0) {
                a.f9612v.addAndGet(a.this, -2097152);
                if (this.f9626o != d.TERMINATED) {
                    this.f9626o = d.DORMANT;
                }
            }
        }

        private final void c(int i10) {
            if (i10 != 0 && u(d.BLOCKING)) {
                a.this.y();
            }
        }

        private final void d(h hVar) {
            int b10 = hVar.f9642n.b();
            k(b10);
            c(b10);
            a.this.t(hVar);
            b(b10);
        }

        private final h e(boolean z9) {
            h o10;
            h o11;
            if (z9) {
                boolean z10 = m(a.this.f9615m * 2) == 0;
                if (z10 && (o11 = o()) != null) {
                    return o11;
                }
                h g10 = this.f9624m.g();
                if (g10 != null) {
                    return g10;
                }
                if (!z10 && (o10 = o()) != null) {
                    return o10;
                }
            } else {
                h o12 = o();
                if (o12 != null) {
                    return o12;
                }
            }
            return v(3);
        }

        private final h f() {
            h h10 = this.f9624m.h();
            if (h10 != null) {
                return h10;
            }
            h hVar = (h) a.this.f9620r.d();
            return hVar == null ? v(1) : hVar;
        }

        public static final AtomicIntegerFieldUpdater j() {
            return f9623u;
        }

        private final void k(int i10) {
            this.f9627p = 0;
            if (this.f9626o == d.PARKING) {
                this.f9626o = d.BLOCKING;
            }
        }

        private final boolean l() {
            return this.nextParkedWorker != a.f9614x;
        }

        private final void n() {
            if (this.f9627p == 0) {
                this.f9627p = System.nanoTime() + a.this.f9617o;
            }
            LockSupport.parkNanos(a.this.f9617o);
            if (System.nanoTime() - this.f9627p >= 0) {
                this.f9627p = 0;
                w();
            }
        }

        private final h o() {
            d dVar;
            if (m(2) == 0) {
                h hVar = (h) a.this.f9619q.d();
                if (hVar != null) {
                    return hVar;
                }
                dVar = a.this.f9620r;
            } else {
                h hVar2 = (h) a.this.f9620r.d();
                if (hVar2 != null) {
                    return hVar2;
                }
                dVar = a.this.f9619q;
            }
            return (h) dVar.d();
        }

        private final void p() {
            loop0:
            while (true) {
                boolean z9 = false;
                while (!a.this.isTerminated() && this.f9626o != d.TERMINATED) {
                    h g10 = g(this.f9630s);
                    if (g10 != null) {
                        this.f9628q = 0;
                        d(g10);
                    } else {
                        this.f9630s = false;
                        if (this.f9628q == 0) {
                            t();
                        } else if (!z9) {
                            z9 = true;
                        } else {
                            u(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f9628q);
                            this.f9628q = 0;
                        }
                    }
                }
            }
            u(d.TERMINATED);
        }

        private final boolean s() {
            boolean z9;
            if (this.f9626o != d.CPU_ACQUIRED) {
                a aVar = a.this;
                AtomicLongFieldUpdater a10 = a.f9612v;
                while (true) {
                    long j10 = a10.get(aVar);
                    if (((int) ((9223367638808264704L & j10) >> 42)) != 0) {
                        if (a.f9612v.compareAndSet(aVar, j10, j10 - 4398046511104L)) {
                            z9 = true;
                            break;
                        }
                    } else {
                        z9 = false;
                        break;
                    }
                }
                if (!z9) {
                    return false;
                }
                this.f9626o = d.CPU_ACQUIRED;
            }
            return true;
        }

        private final void t() {
            if (!l()) {
                a.this.q(this);
                return;
            }
            f9623u.set(this, -1);
            while (l() && f9623u.get(this) == -1 && !a.this.isTerminated() && this.f9626o != d.TERMINATED) {
                u(d.PARKING);
                Thread.interrupted();
                n();
            }
        }

        private final h v(int i10) {
            int i11 = (int) (a.f9612v.get(a.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int m10 = m(i11);
            a aVar = a.this;
            long j10 = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                m10++;
                if (m10 > i11) {
                    m10 = 1;
                }
                c b10 = aVar.f9621s.b(m10);
                if (b10 == null || b10 == this) {
                    int i13 = i10;
                } else {
                    long n10 = b10.f9624m.n(i10, this.f9625n);
                    if (n10 == -1) {
                        u<h> uVar = this.f9625n;
                        h hVar = (h) uVar.f11078m;
                        uVar.f11078m = null;
                        return hVar;
                    } else if (n10 > 0) {
                        j10 = Math.min(j10, n10);
                    }
                }
            }
            if (j10 == Long.MAX_VALUE) {
                j10 = 0;
            }
            this.f9628q = j10;
            return null;
        }

        private final void w() {
            a aVar = a.this;
            synchronized (aVar.f9621s) {
                if (!aVar.isTerminated()) {
                    if (((int) (a.f9612v.get(aVar) & 2097151)) > aVar.f9615m) {
                        if (f9623u.compareAndSet(this, -1, 1)) {
                            int i10 = this.indexInArray;
                            q(0);
                            aVar.r(this, i10, 0);
                            int andDecrement = (int) (a.f9612v.getAndDecrement(aVar) & 2097151);
                            if (andDecrement != i10) {
                                c b10 = aVar.f9621s.b(andDecrement);
                                l.b(b10);
                                c cVar = b10;
                                aVar.f9621s.c(i10, cVar);
                                cVar.q(i10);
                                aVar.r(cVar, andDecrement, i10);
                            }
                            aVar.f9621s.c(andDecrement, null);
                            s sVar = s.f8976a;
                            this.f9626o = d.TERMINATED;
                        }
                    }
                }
            }
        }

        public final h g(boolean z9) {
            return s() ? e(z9) : f();
        }

        public final int h() {
            return this.indexInArray;
        }

        public final Object i() {
            return this.nextParkedWorker;
        }

        public final int m(int i10) {
            int i11 = this.f9629r;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f9629r = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        public final void q(int i10) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f9618p);
            sb.append("-worker-");
            sb.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb.toString());
            this.indexInArray = i10;
        }

        public final void r(Object obj) {
            this.nextParkedWorker = obj;
        }

        public void run() {
            p();
        }

        public final boolean u(d dVar) {
            d dVar2 = this.f9626o;
            boolean z9 = dVar2 == d.CPU_ACQUIRED;
            if (z9) {
                a.f9612v.addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f9626o = dVar;
            }
            return z9;
        }
    }

    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i10, int i11, long j10, String str) {
        this.f9615m = i10;
        this.f9616n = i11;
        this.f9617o = j10;
        this.f9618p = str;
        boolean z9 = true;
        if (i10 >= 1) {
            if (i11 >= i10) {
                if (i11 <= 2097150) {
                    if (j10 <= 0 ? false : z9) {
                        this.f9619q = new d();
                        this.f9620r = new d();
                        this.f9621s = new c0<>((i10 + 1) * 2);
                        this.controlState = ((long) i10) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
    }

    private final boolean A(long j10) {
        if (i.a(((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21)), 0) < this.f9615m) {
            int g10 = g();
            if (g10 == 1 && this.f9615m > 1) {
                g();
            }
            if (g10 > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean C(a aVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f9612v.get(aVar);
        }
        return aVar.A(j10);
    }

    private final boolean D() {
        c p10;
        do {
            p10 = p();
            if (p10 == null) {
                return false;
            }
        } while (!c.j().compareAndSet(p10, -1, 0));
        LockSupport.unpark(p10);
        return true;
    }

    private final boolean b(h hVar) {
        boolean z9 = true;
        if (hVar.f9642n.b() != 1) {
            z9 = false;
        }
        return (z9 ? this.f9620r : this.f9619q).a(hVar);
    }

    private final int g() {
        synchronized (this.f9621s) {
            if (isTerminated()) {
                return -1;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = f9612v;
            long j10 = atomicLongFieldUpdater.get(this);
            int i10 = (int) (j10 & 2097151);
            boolean z9 = false;
            int a10 = i.a(i10 - ((int) ((j10 & 4398044413952L) >> 21)), 0);
            if (a10 >= this.f9615m) {
                return 0;
            }
            if (i10 >= this.f9616n) {
                return 0;
            }
            int i11 = ((int) (f9612v.get(this) & 2097151)) + 1;
            if (i11 > 0 && this.f9621s.b(i11) == null) {
                c cVar = new c(this, i11);
                this.f9621s.c(i11, cVar);
                if (i11 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    z9 = true;
                }
                if (z9) {
                    int i12 = a10 + 1;
                    cVar.start();
                    return i12;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private final c k() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar == null || !l.a(a.this, this)) {
            return null;
        }
        return cVar;
    }

    public static /* synthetic */ void m(a aVar, Runnable runnable, i iVar, boolean z9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            iVar = l.f9651g;
        }
        if ((i10 & 4) != 0) {
            z9 = false;
        }
        aVar.l(runnable, iVar, z9);
    }

    private final int o(c cVar) {
        int h10;
        do {
            Object i10 = cVar.i();
            if (i10 == f9614x) {
                return -1;
            }
            if (i10 == null) {
                return 0;
            }
            cVar = (c) i10;
            h10 = cVar.h();
        } while (h10 == 0);
        return h10;
    }

    private final c p() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9611u;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c b10 = this.f9621s.b((int) (2097151 & j10));
            if (b10 == null) {
                return null;
            }
            long j11 = (2097152 + j10) & -2097152;
            int o10 = o(b10);
            if (o10 >= 0) {
                if (f9611u.compareAndSet(this, j10, ((long) o10) | j11)) {
                    b10.r(f9614x);
                    return b10;
                }
            }
        }
    }

    private final void w(long j10, boolean z9) {
        if (!z9 && !D() && !A(j10)) {
            D();
        }
    }

    private final h z(c cVar, h hVar, boolean z9) {
        if (cVar == null || cVar.f9626o == d.TERMINATED) {
            return hVar;
        }
        if (hVar.f9642n.b() == 0 && cVar.f9626o == d.BLOCKING) {
            return hVar;
        }
        cVar.f9630s = true;
        return cVar.f9624m.a(hVar, z9);
    }

    public void close() {
        u(10000);
    }

    public void execute(Runnable runnable) {
        m(this, runnable, (i) null, false, 6, (Object) null);
    }

    public final h h(Runnable runnable, i iVar) {
        long a10 = l.f9650f.a();
        if (!(runnable instanceof h)) {
            return new k(runnable, a10, iVar);
        }
        h hVar = (h) runnable;
        hVar.f9641m = a10;
        hVar.f9642n = iVar;
        return hVar;
    }

    public final boolean isTerminated() {
        return f9613w.get(this) != 0;
    }

    public final void l(Runnable runnable, i iVar, boolean z9) {
        b9.c.a();
        h h10 = h(runnable, iVar);
        boolean z10 = false;
        boolean z11 = h10.f9642n.b() == 1;
        long addAndGet = z11 ? f9612v.addAndGet(this, 2097152) : 0;
        c k10 = k();
        h z12 = z(k10, h10, z9);
        if (z12 == null || b(z12)) {
            if (z9 && k10 != null) {
                z10 = true;
            }
            if (z11) {
                w(addAndGet, z10);
            } else if (!z10) {
                y();
            }
        } else {
            throw new RejectedExecutionException(this.f9618p + " was terminated");
        }
    }

    public final boolean q(c cVar) {
        long j10;
        int h10;
        if (cVar.i() != f9614x) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9611u;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            h10 = cVar.h();
            cVar.r(this.f9621s.b((int) (2097151 & j10)));
        } while (!f9611u.compareAndSet(this, j10, ((2097152 + j10) & -2097152) | ((long) h10)));
        return true;
    }

    public final void r(c cVar, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9611u;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int i12 = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & -2097152;
            if (i12 == i10) {
                i12 = i11 == 0 ? o(cVar) : i11;
            }
            if (i12 >= 0) {
                if (f9611u.compareAndSet(this, j10, j11 | ((long) i12))) {
                    return;
                }
            }
        }
    }

    public final void t(h hVar) {
        try {
            hVar.run();
        } catch (Throwable th) {
            b9.c.a();
            throw th;
        }
        b9.c.a();
    }

    public String toString() {
        char c10;
        StringBuilder sb;
        ArrayList arrayList = new ArrayList();
        int a10 = this.f9621s.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < a10; i15++) {
            c b10 = this.f9621s.b(i15);
            if (b10 != null) {
                int e10 = b10.f9624m.e();
                int i16 = b.f9622a[b10.f9626o.ordinal()];
                if (i16 != 1) {
                    if (i16 == 2) {
                        i11++;
                        sb = new StringBuilder();
                        sb.append(e10);
                        c10 = 'b';
                    } else if (i16 == 3) {
                        i10++;
                        sb = new StringBuilder();
                        sb.append(e10);
                        c10 = 'c';
                    } else if (i16 == 4) {
                        i13++;
                        if (e10 > 0) {
                            sb = new StringBuilder();
                            sb.append(e10);
                            c10 = 'd';
                        }
                    } else if (i16 == 5) {
                        i14++;
                    }
                    sb.append(c10);
                    arrayList.add(sb.toString());
                } else {
                    i12++;
                }
            }
        }
        long j10 = f9612v.get(this);
        return this.f9618p + '@' + n0.b(this) + "[Pool Size {core = " + this.f9615m + ", max = " + this.f9616n + "}, Worker States {CPU = " + i10 + ", blocking = " + i11 + ", parked = " + i12 + ", dormant = " + i13 + ", terminated = " + i14 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f9619q.c() + ", global blocking queue size = " + this.f9620r.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((4398044413952L & j10) >> 21)) + ", CPUs acquired = " + (this.f9615m - ((int) ((9223367638808264704L & j10) >> 42))) + "}]";
    }

    public final void u(long j10) {
        int i10;
        h hVar;
        if (f9613w.compareAndSet(this, 0, 1)) {
            c k10 = k();
            synchronized (this.f9621s) {
                i10 = (int) (f9612v.get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    c b10 = this.f9621s.b(i11);
                    l.b(b10);
                    c cVar = b10;
                    if (cVar != k10) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j10);
                        }
                        cVar.f9624m.f(this.f9620r);
                    }
                    if (i11 == i10) {
                        break;
                    }
                    i11++;
                }
            }
            this.f9620r.b();
            this.f9619q.b();
            while (true) {
                if (k10 != null) {
                    hVar = k10.g(true);
                    if (hVar != null) {
                        continue;
                        t(hVar);
                    }
                }
                hVar = (h) this.f9619q.d();
                if (hVar == null && (hVar = (h) this.f9620r.d()) == null) {
                    break;
                }
                t(hVar);
            }
            if (k10 != null) {
                k10.u(d.TERMINATED);
            }
            f9611u.set(this, 0);
            f9612v.set(this, 0);
        }
    }

    public final void y() {
        if (!D() && !C(this, 0, 1, (Object) null)) {
            D();
        }
    }
}
