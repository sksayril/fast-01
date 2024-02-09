package d9;

import b9.m;
import b9.o;
import b9.q2;
import g8.m;
import g8.n;
import g8.s;
import g9.e;
import g9.e0;
import g9.f0;
import g9.g0;
import g9.h0;
import g9.q0;
import g9.z;
import j8.d;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.y;
import r8.l;
import r8.p;
import r8.q;

public class b<E> implements d<E> {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f8222e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f8223f;

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f8224g;

    /* renamed from: h  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f8225h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8226i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8227j;

    /* renamed from: k  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f8228k;

    /* renamed from: l  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f8229l;

    /* renamed from: m  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f8230m;
    private volatile Object _closeCause;

    /* renamed from: b  reason: collision with root package name */
    private final int f8231b;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;

    /* renamed from: c  reason: collision with root package name */
    public final l<E, s> f8232c;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    /* renamed from: d  reason: collision with root package name */
    private final q<j9.b<?>, Object, Object, l<Throwable, s>> f8233d;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    private final class a implements e<E>, q2 {
        /* access modifiers changed from: private */

        /* renamed from: m  reason: collision with root package name */
        public Object f8234m = c.f8258p;
        /* access modifiers changed from: private */

        /* renamed from: n  reason: collision with root package name */
        public m<? super Boolean> f8235n;

        public a() {
        }

        private final Object f(h<E> hVar, int i10, long j10, d<? super Boolean> dVar) {
            Boolean a10;
            b<E> bVar = b.this;
            m b10 = o.b(c.c(dVar));
            try {
                this.f8235n = b10;
                Object p10 = bVar.r0(hVar, i10, j10, this);
                if (p10 == c.f8255m) {
                    bVar.e0(this, hVar, i10);
                } else {
                    l<Throwable, s> lVar = null;
                    if (p10 == c.f8257o) {
                        if (j10 < bVar.I()) {
                            hVar.b();
                        }
                        h hVar2 = (h) b.f8227j.get(bVar);
                        while (true) {
                            if (bVar.P()) {
                                h();
                                break;
                            }
                            long andIncrement = b.f8223f.getAndIncrement(bVar);
                            int i11 = c.f8244b;
                            long j11 = andIncrement / ((long) i11);
                            int i12 = (int) (andIncrement % ((long) i11));
                            if (hVar2.f8986o != j11) {
                                h e10 = bVar.B(j11, hVar2);
                                if (e10 != null) {
                                    hVar2 = e10;
                                }
                            }
                            Object p11 = bVar.r0(hVar2, i12, andIncrement, this);
                            if (p11 == c.f8255m) {
                                bVar.e0(this, hVar2, i12);
                                break;
                            } else if (p11 == c.f8257o) {
                                if (andIncrement < bVar.I()) {
                                    hVar2.b();
                                }
                            } else if (p11 != c.f8256n) {
                                hVar2.b();
                                this.f8234m = p11;
                                this.f8235n = null;
                                a10 = kotlin.coroutines.jvm.internal.b.a(true);
                                l<E, s> lVar2 = bVar.f8232c;
                                if (lVar2 != null) {
                                    lVar = z.a(lVar2, p11, b10.getContext());
                                }
                            } else {
                                throw new IllegalStateException("unexpected".toString());
                            }
                        }
                    } else {
                        hVar.b();
                        this.f8234m = p10;
                        this.f8235n = null;
                        a10 = kotlin.coroutines.jvm.internal.b.a(true);
                        l<E, s> lVar3 = bVar.f8232c;
                        if (lVar3 != null) {
                            lVar = z.a(lVar3, p10, b10.getContext());
                        }
                    }
                    b10.f(a10, lVar);
                }
                Object w9 = b10.w();
                if (w9 == d.d()) {
                    h.c(dVar);
                }
                return w9;
            } catch (Throwable th) {
                b10.I();
                throw th;
            }
        }

        private final boolean g() {
            this.f8234m = c.z();
            Throwable E = b.this.E();
            if (E == null) {
                return false;
            }
            throw g0.a(E);
        }

        /* access modifiers changed from: private */
        public final void h() {
            Object a10;
            m<? super Boolean> mVar = this.f8235n;
            kotlin.jvm.internal.l.b(mVar);
            this.f8235n = null;
            this.f8234m = c.z();
            Throwable E = b.this.E();
            if (E == null) {
                m.a aVar = g8.m.f8970m;
                a10 = Boolean.FALSE;
            } else {
                m.a aVar2 = g8.m.f8970m;
                a10 = n.a(E);
            }
            mVar.resumeWith(g8.m.a(a10));
        }

        public Object a(d<? super Boolean> dVar) {
            boolean g10;
            h hVar;
            b<E> bVar = b.this;
            h hVar2 = (h) b.f8227j.get(bVar);
            while (true) {
                if (bVar.P()) {
                    g10 = g();
                    break;
                }
                long andIncrement = b.f8223f.getAndIncrement(bVar);
                int i10 = c.f8244b;
                long j10 = andIncrement / ((long) i10);
                int i11 = (int) (andIncrement % ((long) i10));
                if (hVar2.f8986o != j10) {
                    h e10 = bVar.B(j10, hVar2);
                    if (e10 == null) {
                        continue;
                    } else {
                        hVar = e10;
                    }
                } else {
                    hVar = hVar2;
                }
                Object p10 = bVar.r0(hVar, i11, andIncrement, (Object) null);
                if (p10 == c.f8255m) {
                    throw new IllegalStateException("unreachable".toString());
                } else if (p10 == c.f8257o) {
                    if (andIncrement < bVar.I()) {
                        hVar.b();
                    }
                    hVar2 = hVar;
                } else if (p10 == c.f8256n) {
                    return f(hVar, i11, andIncrement, dVar);
                } else {
                    hVar.b();
                    this.f8234m = p10;
                    g10 = true;
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(g10);
        }

        public void e(e0<?> e0Var, int i10) {
            b9.m<? super Boolean> mVar = this.f8235n;
            if (mVar != null) {
                mVar.e(e0Var, i10);
            }
        }

        public final boolean i(E e10) {
            b9.m<? super Boolean> mVar = this.f8235n;
            kotlin.jvm.internal.l.b(mVar);
            l<Throwable, s> lVar = null;
            this.f8235n = null;
            this.f8234m = e10;
            Boolean bool = Boolean.TRUE;
            l<E, s> lVar2 = b.this.f8232c;
            if (lVar2 != null) {
                lVar = z.a(lVar2, e10, mVar.getContext());
            }
            return c.B(mVar, bool, lVar);
        }

        public final void j() {
            Object a10;
            b9.m<? super Boolean> mVar = this.f8235n;
            kotlin.jvm.internal.l.b(mVar);
            this.f8235n = null;
            this.f8234m = c.z();
            Throwable E = b.this.E();
            if (E == null) {
                m.a aVar = g8.m.f8970m;
                a10 = Boolean.FALSE;
            } else {
                m.a aVar2 = g8.m.f8970m;
                a10 = n.a(E);
            }
            mVar.resumeWith(g8.m.a(a10));
        }

        public E next() {
            E e10 = this.f8234m;
            if (e10 != c.f8258p) {
                this.f8234m = c.f8258p;
                if (e10 != c.z()) {
                    return e10;
                }
                throw g0.a(b.this.F());
            }
            throw new IllegalStateException("`hasNext()` has not been invoked".toString());
        }
    }

    /* renamed from: d9.b$b  reason: collision with other inner class name */
    private static final class C0126b implements q2 {

        /* renamed from: m  reason: collision with root package name */
        private final b9.l<Boolean> f8237m;

        /* renamed from: n  reason: collision with root package name */
        private final /* synthetic */ b9.m<Boolean> f8238n;

        public final b9.l<Boolean> a() {
            return this.f8237m;
        }

        public void e(e0<?> e0Var, int i10) {
            this.f8238n.e(e0Var, i10);
        }
    }

    static final class c extends kotlin.jvm.internal.m implements q<j9.b<?>, Object, Object, l<? super Throwable, ? extends s>> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ b<E> f8239m;

        static final class a extends kotlin.jvm.internal.m implements l<Throwable, s> {

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ Object f8240m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ b<E> f8241n;

            /* renamed from: o  reason: collision with root package name */
            final /* synthetic */ j9.b<?> f8242o;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Object obj, b<E> bVar, j9.b<?> bVar2) {
                super(1);
                this.f8240m = obj;
                this.f8241n = bVar;
                this.f8242o = bVar2;
            }

            public final void b(Throwable th) {
                if (this.f8240m != c.z()) {
                    z.b(this.f8241n.f8232c, this.f8240m, this.f8242o.getContext());
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Throwable) obj);
                return s.f8976a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b<E> bVar) {
            super(3);
            this.f8239m = bVar;
        }

        /* renamed from: b */
        public final l<Throwable, s> a(j9.b<?> bVar, Object obj, Object obj2) {
            return new a(obj2, this.f8239m, bVar);
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<b> cls2 = b.class;
        f8222e = AtomicLongFieldUpdater.newUpdater(cls2, "sendersAndCloseStatus");
        f8223f = AtomicLongFieldUpdater.newUpdater(cls2, "receivers");
        f8224g = AtomicLongFieldUpdater.newUpdater(cls2, "bufferEnd");
        f8225h = AtomicLongFieldUpdater.newUpdater(cls2, "completedExpandBuffersAndPauseFlag");
        f8226i = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "sendSegment");
        f8227j = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "receiveSegment");
        f8228k = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "bufferEndSegment");
        f8229l = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_closeCause");
        f8230m = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "closeHandler");
    }

    public b(int i10, l<? super E, s> lVar) {
        this.f8231b = i10;
        this.f8232c = lVar;
        if (i10 >= 0) {
            this.bufferEnd = c.A(i10);
            this.completedExpandBuffersAndPauseFlag = D();
            h hVar = new h(0, (h) null, this, 3);
            this.sendSegment = hVar;
            this.receiveSegment = hVar;
            if (U()) {
                hVar = c.f8243a;
                kotlin.jvm.internal.l.c(hVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment = hVar;
            this.f8233d = lVar != null ? new c(this) : null;
            this._closeCause = c.f8261s;
            return;
        }
        throw new IllegalArgumentException(("Invalid channel capacity: " + i10 + ", should be >=0").toString());
    }

    private final h<E> A(long j10, h<E> hVar, long j11) {
        Object c10;
        boolean z9;
        long j12 = j10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8228k;
        p pVar = (p) c.y();
        h<E> hVar2 = hVar;
        do {
            c10 = g9.d.c(hVar2, j12, pVar);
            if (f0.c(c10)) {
                break;
            }
            e0 b10 = f0.b(c10);
            while (true) {
                e0 e0Var = (e0) atomicReferenceFieldUpdater.get(this);
                if (e0Var.f8986o >= b10.f8986o) {
                    break;
                } else if (!b10.q()) {
                    z9 = false;
                    continue;
                    break;
                } else if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, e0Var, b10)) {
                    if (e0Var.m()) {
                        e0Var.k();
                    }
                } else if (b10.m()) {
                    b10.k();
                }
            }
            z9 = true;
            continue;
        } while (!z9);
        if (f0.c(c10)) {
            x();
            Z(j10, hVar);
        } else {
            h<E> hVar3 = (h) f0.b(c10);
            long j13 = hVar3.f8986o;
            if (j13 <= j12) {
                return hVar3;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = f8224g;
            int i10 = c.f8244b;
            if (atomicLongFieldUpdater.compareAndSet(this, j11 + 1, ((long) i10) * j13)) {
                K((hVar3.f8986o * ((long) i10)) - j11);
                return null;
            }
        }
        L(this, 0, 1, (Object) null);
        return null;
    }

    /* access modifiers changed from: private */
    public final h<E> B(long j10, h<E> hVar) {
        Object c10;
        boolean z9;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8227j;
        p pVar = (p) c.y();
        do {
            c10 = g9.d.c(hVar, j10, pVar);
            if (f0.c(c10)) {
                break;
            }
            e0 b10 = f0.b(c10);
            while (true) {
                e0 e0Var = (e0) atomicReferenceFieldUpdater.get(this);
                z9 = true;
                if (e0Var.f8986o >= b10.f8986o) {
                    break;
                } else if (!b10.q()) {
                    z9 = false;
                    continue;
                    break;
                } else if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, e0Var, b10)) {
                    if (e0Var.m()) {
                        e0Var.k();
                        continue;
                    } else {
                        continue;
                    }
                } else if (b10.m()) {
                    b10.k();
                }
            }
        } while (!z9);
        if (f0.c(c10)) {
            x();
            if (hVar.f8986o * ((long) c.f8244b) >= I()) {
                return null;
            }
        } else {
            hVar = (h) f0.b(c10);
            if (!U() && j10 <= D() / ((long) c.f8244b)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8228k;
                while (true) {
                    e0 e0Var2 = (e0) atomicReferenceFieldUpdater2.get(this);
                    if (e0Var2.f8986o >= hVar.f8986o || !hVar.q()) {
                        break;
                    } else if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, e0Var2, hVar)) {
                        if (e0Var2.m()) {
                            e0Var2.k();
                        }
                    } else if (hVar.m()) {
                        hVar.k();
                    }
                }
            }
            long j11 = hVar.f8986o;
            if (j11 <= j10) {
                return hVar;
            }
            int i10 = c.f8244b;
            v0(j11 * ((long) i10));
            if (hVar.f8986o * ((long) i10) >= I()) {
                return null;
            }
        }
        hVar.b();
        return null;
    }

    /* access modifiers changed from: private */
    public final h<E> C(long j10, h<E> hVar) {
        Object c10;
        boolean z9;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8226i;
        p pVar = (p) c.y();
        do {
            c10 = g9.d.c(hVar, j10, pVar);
            if (f0.c(c10)) {
                break;
            }
            e0 b10 = f0.b(c10);
            while (true) {
                e0 e0Var = (e0) atomicReferenceFieldUpdater.get(this);
                z9 = true;
                if (e0Var.f8986o >= b10.f8986o) {
                    break;
                } else if (!b10.q()) {
                    z9 = false;
                    continue;
                    break;
                } else if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, e0Var, b10)) {
                    if (e0Var.m()) {
                        e0Var.k();
                        continue;
                    } else {
                        continue;
                    }
                } else if (b10.m()) {
                    b10.k();
                }
            }
        } while (!z9);
        if (f0.c(c10)) {
            x();
            if (hVar.f8986o * ((long) c.f8244b) >= G()) {
                return null;
            }
        } else {
            hVar = (h) f0.b(c10);
            long j11 = hVar.f8986o;
            if (j11 <= j10) {
                return hVar;
            }
            int i10 = c.f8244b;
            w0(j11 * ((long) i10));
            if (hVar.f8986o * ((long) i10) >= G()) {
                return null;
            }
        }
        hVar.b();
        return null;
    }

    private final long D() {
        return f8224g.get(this);
    }

    /* access modifiers changed from: private */
    public final Throwable F() {
        Throwable E = E();
        return E == null ? new i("Channel was closed") : E;
    }

    private final void K(long j10) {
        boolean z9;
        if ((f8225h.addAndGet(this, j10) & 4611686018427387904L) != 0) {
            do {
                if ((f8225h.get(this) & 4611686018427387904L) != 0) {
                    z9 = true;
                    continue;
                } else {
                    z9 = false;
                    continue;
                }
            } while (z9);
        }
    }

    static /* synthetic */ void L(b bVar, long j10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                j10 = 1;
            }
            bVar.K(j10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
    }

    private final void M() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8230m;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? c.f8259q : c.f8260r));
        if (obj != null) {
            l lVar = (l) y.b(obj, 1);
            ((l) obj).invoke(E());
        }
    }

    private final boolean N(h<E> hVar, int i10, long j10) {
        Object w9;
        do {
            w9 = hVar.w(i10);
            if (w9 != null && w9 != c.f8247e) {
                if (w9 == c.f8246d) {
                    return true;
                }
                if (w9 == c.f8252j || w9 == c.z() || w9 == c.f8251i || w9 == c.f8250h) {
                    return false;
                }
                if (w9 == c.f8249g) {
                    return true;
                }
                return w9 != c.f8248f && j10 == G();
            }
        } while (!hVar.r(i10, w9, c.f8250h));
        z();
        return false;
    }

    private final boolean O(long j10, boolean z9) {
        int i10 = (int) (j10 >> 60);
        if (i10 == 0 || i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            w(j10 & 1152921504606846975L);
            return !z9 || !J();
        } else if (i10 == 3) {
            v(j10 & 1152921504606846975L);
        } else {
            throw new IllegalStateException(("unexpected close status: " + i10).toString());
        }
    }

    private final boolean Q(long j10) {
        return O(j10, true);
    }

    /* access modifiers changed from: private */
    public final boolean S(long j10) {
        return O(j10, false);
    }

    private final boolean U() {
        long D = D();
        return D == 0 || D == Long.MAX_VALUE;
    }

    private final long V(h<E> hVar) {
        do {
            int i10 = c.f8244b;
            while (true) {
                i10--;
                if (-1 < i10) {
                    long j10 = (hVar.f8986o * ((long) c.f8244b)) + ((long) i10);
                    if (j10 < G()) {
                        return -1;
                    }
                    while (true) {
                        Object w9 = hVar.w(i10);
                        if (w9 == null || w9 == c.f8247e) {
                            if (hVar.r(i10, w9, c.z())) {
                                hVar.p();
                                break;
                            }
                        } else if (w9 == c.f8246d) {
                            return j10;
                        }
                    }
                } else {
                    hVar = (h) hVar.g();
                }
            }
        } while (hVar != null);
        return -1;
    }

    private final void W() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8222e;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if (((int) (j10 >> 60)) == 0) {
            } else {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, c.w(1152921504606846975L & j10, 1)));
    }

    private final void X() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8222e;
        do {
            j10 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, c.w(1152921504606846975L & j10, 3)));
    }

    private final void Y() {
        long j10;
        int i10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8222e;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            int i11 = (int) (j10 >> 60);
            if (i11 == 0) {
                j11 = j10 & 1152921504606846975L;
                i10 = 2;
            } else if (i11 == 1) {
                j11 = j10 & 1152921504606846975L;
                i10 = 3;
            } else {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, c.w(j11, i10)));
    }

    private final void Z(long j10, h<E> hVar) {
        boolean z9;
        h<E> hVar2;
        h<E> hVar3;
        while (hVar.f8986o < j10 && (hVar3 = (h) hVar.e()) != null) {
            hVar = hVar3;
        }
        while (true) {
            if (!hVar.h() || (hVar2 = (h) hVar.e()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8228k;
                while (true) {
                    e0 e0Var = (e0) atomicReferenceFieldUpdater.get(this);
                    z9 = true;
                    if (e0Var.f8986o >= hVar.f8986o) {
                        break;
                    } else if (!hVar.q()) {
                        z9 = false;
                        break;
                    } else if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, e0Var, hVar)) {
                        if (e0Var.m()) {
                            e0Var.k();
                        }
                    } else if (hVar.m()) {
                        hVar.k();
                    }
                }
                if (z9) {
                    return;
                }
            } else {
                hVar = hVar2;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void b0(b9.l<? super E> lVar) {
        m.a aVar = g8.m.f8970m;
        lVar.resumeWith(g8.m.a(n.a(F())));
    }

    /* access modifiers changed from: private */
    public final void e0(q2 q2Var, h<E> hVar, int i10) {
        d0();
        q2Var.e(hVar, i10);
    }

    /* access modifiers changed from: private */
    public final void f0(q2 q2Var, h<E> hVar, int i10) {
        q2Var.e(hVar, i10 + c.f8244b);
    }

    static /* synthetic */ <E> Object g0(b<E> bVar, d<? super E> dVar) {
        h hVar = (h) f8227j.get(bVar);
        while (!bVar.P()) {
            long andIncrement = f8223f.getAndIncrement(bVar);
            int i10 = c.f8244b;
            long j10 = andIncrement / ((long) i10);
            int i11 = (int) (andIncrement % ((long) i10));
            if (hVar.f8986o != j10) {
                h e10 = bVar.B(j10, hVar);
                if (e10 == null) {
                    continue;
                } else {
                    hVar = e10;
                }
            }
            Object p10 = bVar.r0(hVar, i11, andIncrement, (Object) null);
            if (p10 == c.f8255m) {
                throw new IllegalStateException("unexpected".toString());
            } else if (p10 == c.f8257o) {
                if (andIncrement < bVar.I()) {
                    hVar.b();
                }
            } else if (p10 == c.f8256n) {
                return bVar.h0(hVar, i11, andIncrement, dVar);
            } else {
                hVar.b();
                return p10;
            }
        }
        throw g0.a(bVar.F());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: b9.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: j9.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: r8.l<E, g8.s>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: r8.l<java.lang.Throwable, g8.s>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: j9.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: j9.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: j9.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: r8.l<E, g8.s>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: r8.l<java.lang.Throwable, g8.s>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: j9.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: j9.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object h0(d9.h<E> r9, int r10, long r11, j8.d<? super E> r13) {
        /*
            r8 = this;
            j8.d r0 = k8.c.c(r13)
            b9.m r0 = b9.o.b(r0)
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r0
            java.lang.Object r1 = r1.r0(r2, r3, r4, r6)     // Catch:{ all -> 0x00d1 }
            g9.h0 r2 = d9.c.f8255m     // Catch:{ all -> 0x00d1 }
            if (r1 != r2) goto L_0x001c
            r8.e0(r0, r9, r10)     // Catch:{ all -> 0x00d1 }
            goto L_0x00c3
        L_0x001c:
            g9.h0 r10 = d9.c.f8257o     // Catch:{ all -> 0x00d1 }
            r7 = 0
            if (r1 != r10) goto L_0x00b3
            long r1 = r8.I()     // Catch:{ all -> 0x00d1 }
            int r10 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r10 >= 0) goto L_0x002e
            r9.b()     // Catch:{ all -> 0x00d1 }
        L_0x002e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = f8227j     // Catch:{ all -> 0x00d1 }
            java.lang.Object r9 = r9.get(r8)     // Catch:{ all -> 0x00d1 }
            d9.h r9 = (d9.h) r9     // Catch:{ all -> 0x00d1 }
        L_0x0038:
            boolean r10 = r8.P()     // Catch:{ all -> 0x00d1 }
            if (r10 == 0) goto L_0x0043
            r8.b0(r0)     // Catch:{ all -> 0x00d1 }
            goto L_0x00c3
        L_0x0043:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r10 = f8223f     // Catch:{ all -> 0x00d1 }
            long r10 = r10.getAndIncrement(r8)     // Catch:{ all -> 0x00d1 }
            int r12 = d9.c.f8244b     // Catch:{ all -> 0x00d1 }
            long r1 = (long) r12     // Catch:{ all -> 0x00d1 }
            long r1 = r10 / r1
            long r3 = (long) r12     // Catch:{ all -> 0x00d1 }
            long r3 = r10 % r3
            int r12 = (int) r3     // Catch:{ all -> 0x00d1 }
            long r3 = r9.f8986o     // Catch:{ all -> 0x00d1 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 == 0) goto L_0x0062
            d9.h r1 = r8.B(r1, r9)     // Catch:{ all -> 0x00d1 }
            if (r1 != 0) goto L_0x0061
            goto L_0x0038
        L_0x0061:
            r9 = r1
        L_0x0062:
            r1 = r8
            r2 = r9
            r3 = r12
            r4 = r10
            r6 = r0
            java.lang.Object r1 = r1.r0(r2, r3, r4, r6)     // Catch:{ all -> 0x00d1 }
            g9.h0 r2 = d9.c.f8255m     // Catch:{ all -> 0x00d1 }
            if (r1 != r2) goto L_0x007c
            boolean r10 = r0 instanceof b9.q2     // Catch:{ all -> 0x00d1 }
            if (r10 == 0) goto L_0x0076
            r7 = r0
        L_0x0076:
            if (r7 == 0) goto L_0x00c3
            r8.e0(r7, r9, r12)     // Catch:{ all -> 0x00d1 }
            goto L_0x00c3
        L_0x007c:
            g9.h0 r12 = d9.c.f8257o     // Catch:{ all -> 0x00d1 }
            if (r1 != r12) goto L_0x008e
            long r1 = r8.I()     // Catch:{ all -> 0x00d1 }
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 >= 0) goto L_0x0038
            r9.b()     // Catch:{ all -> 0x00d1 }
            goto L_0x0038
        L_0x008e:
            g9.h0 r10 = d9.c.f8256n     // Catch:{ all -> 0x00d1 }
            if (r1 == r10) goto L_0x00a7
            r9.b()     // Catch:{ all -> 0x00d1 }
            r8.l<E, g8.s> r9 = r8.f8232c     // Catch:{ all -> 0x00d1 }
            if (r9 == 0) goto L_0x00a3
            j8.g r10 = r0.getContext()     // Catch:{ all -> 0x00d1 }
            r8.l r7 = g9.z.a(r9, r1, r10)     // Catch:{ all -> 0x00d1 }
        L_0x00a3:
            r0.f(r1, r7)     // Catch:{ all -> 0x00d1 }
            goto L_0x00c3
        L_0x00a7:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00d1 }
            java.lang.String r10 = "unexpected"
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00d1 }
            r9.<init>(r10)     // Catch:{ all -> 0x00d1 }
            throw r9     // Catch:{ all -> 0x00d1 }
        L_0x00b3:
            r9.b()     // Catch:{ all -> 0x00d1 }
            r8.l<E, g8.s> r9 = r8.f8232c     // Catch:{ all -> 0x00d1 }
            if (r9 == 0) goto L_0x00a3
            j8.g r10 = r0.getContext()     // Catch:{ all -> 0x00d1 }
            r8.l r7 = g9.z.a(r9, r1, r10)     // Catch:{ all -> 0x00d1 }
            goto L_0x00a3
        L_0x00c3:
            java.lang.Object r9 = r0.w()
            java.lang.Object r10 = k8.d.d()
            if (r9 != r10) goto L_0x00d0
            kotlin.coroutines.jvm.internal.h.c(r13)
        L_0x00d0:
            return r9
        L_0x00d1:
            r9 = move-exception
            r0.I()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.b.h0(d9.h, int, long, j8.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ab, code lost:
        r13 = (d9.h) r13.g();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void i0(d9.h<E> r13) {
        /*
            r12 = this;
            r8.l<E, g8.s> r0 = r12.f8232c
            r1 = 0
            r2 = 1
            java.lang.Object r3 = g9.n.b(r1, r2, r1)
        L_0x0008:
            int r4 = d9.c.f8244b
            int r4 = r4 - r2
        L_0x000b:
            r5 = -1
            if (r5 >= r4) goto L_0x00ab
            long r6 = r13.f8986o
            int r8 = d9.c.f8244b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L_0x0017:
            java.lang.Object r8 = r13.w(r4)
            g9.h0 r9 = d9.c.f8251i
            if (r8 == r9) goto L_0x00b3
            g9.h0 r9 = d9.c.f8246d
            if (r8 != r9) goto L_0x0048
            long r9 = r12.G()
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x00b3
            g9.h0 r9 = d9.c.z()
            boolean r8 = r13.r(r4, r8, r9)
            if (r8 == 0) goto L_0x0017
            if (r0 == 0) goto L_0x0041
            java.lang.Object r5 = r13.v(r4)
            g9.q0 r1 = g9.z.c(r0, r5, r1)
        L_0x0041:
            r13.s(r4)
        L_0x0044:
            r13.p()
            goto L_0x00a7
        L_0x0048:
            g9.h0 r9 = d9.c.f8247e
            if (r8 == r9) goto L_0x009c
            if (r8 != 0) goto L_0x0051
            goto L_0x009c
        L_0x0051:
            boolean r9 = r8 instanceof b9.q2
            if (r9 != 0) goto L_0x006e
            boolean r9 = r8 instanceof d9.o
            if (r9 == 0) goto L_0x005a
            goto L_0x006e
        L_0x005a:
            g9.h0 r9 = d9.c.f8249g
            if (r8 == r9) goto L_0x00b3
            g9.h0 r9 = d9.c.f8248f
            if (r8 != r9) goto L_0x0067
            goto L_0x00b3
        L_0x0067:
            g9.h0 r9 = d9.c.f8249g
            if (r8 == r9) goto L_0x0017
            goto L_0x00a7
        L_0x006e:
            long r9 = r12.G()
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x00b3
            boolean r9 = r8 instanceof d9.o
            if (r9 == 0) goto L_0x0080
            r9 = r8
            d9.o r9 = (d9.o) r9
            b9.q2 r9 = r9.f8275a
            goto L_0x0083
        L_0x0080:
            r9 = r8
            b9.q2 r9 = (b9.q2) r9
        L_0x0083:
            g9.h0 r10 = d9.c.z()
            boolean r8 = r13.r(r4, r8, r10)
            if (r8 == 0) goto L_0x0017
            if (r0 == 0) goto L_0x0097
            java.lang.Object r5 = r13.v(r4)
            g9.q0 r1 = g9.z.c(r0, r5, r1)
        L_0x0097:
            java.lang.Object r3 = g9.n.c(r3, r9)
            goto L_0x0041
        L_0x009c:
            g9.h0 r9 = d9.c.z()
            boolean r8 = r13.r(r4, r8, r9)
            if (r8 == 0) goto L_0x0017
            goto L_0x0044
        L_0x00a7:
            int r4 = r4 + -1
            goto L_0x000b
        L_0x00ab:
            g9.e r13 = r13.g()
            d9.h r13 = (d9.h) r13
            if (r13 != 0) goto L_0x0008
        L_0x00b3:
            if (r3 == 0) goto L_0x00d9
            boolean r13 = r3 instanceof java.util.ArrayList
            if (r13 != 0) goto L_0x00bf
            b9.q2 r3 = (b9.q2) r3
            r12.k0(r3)
            goto L_0x00d9
        L_0x00bf:
            java.lang.String r13 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.l.c(r3, r13)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r13 = r3.size()
            int r13 = r13 - r2
        L_0x00cb:
            if (r5 >= r13) goto L_0x00d9
            java.lang.Object r0 = r3.get(r13)
            b9.q2 r0 = (b9.q2) r0
            r12.k0(r0)
            int r13 = r13 + -1
            goto L_0x00cb
        L_0x00d9:
            if (r1 != 0) goto L_0x00dc
            return
        L_0x00dc:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.b.i0(d9.h):void");
    }

    private final void j0(q2 q2Var) {
        l0(q2Var, true);
    }

    private final void k0(q2 q2Var) {
        l0(q2Var, false);
    }

    private final void l0(q2 q2Var, boolean z9) {
        d dVar;
        Object b10;
        if (q2Var instanceof C0126b) {
            dVar = ((C0126b) q2Var).a();
            m.a aVar = g8.m.f8970m;
            b10 = Boolean.FALSE;
        } else if (q2Var instanceof b9.l) {
            dVar = (d) q2Var;
            m.a aVar2 = g8.m.f8970m;
            b10 = n.a(z9 ? F() : H());
        } else if (q2Var instanceof l) {
            dVar = ((l) q2Var).f8274m;
            m.a aVar3 = g8.m.f8970m;
            b10 = g.b(g.f8266b.a(E()));
        } else if (q2Var instanceof a) {
            ((a) q2Var).j();
            return;
        } else if (q2Var instanceof j9.b) {
            ((j9.b) q2Var).b(this, c.z());
            return;
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + q2Var).toString());
        }
        dVar.resumeWith(g8.m.a(b10));
    }

    private final boolean m0(long j10) {
        if (S(j10)) {
            return false;
        }
        return !r(j10 & 1152921504606846975L);
    }

    private final boolean n0(Object obj, E e10) {
        if (obj instanceof j9.b) {
            return ((j9.b) obj).b(this, e10);
        }
        l<Throwable, s> lVar = null;
        if (obj instanceof l) {
            kotlin.jvm.internal.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            l lVar2 = (l) obj;
            b9.m<g<? extends E>> mVar = lVar2.f8274m;
            g b10 = g.b(g.f8266b.c(e10));
            l<E, s> lVar3 = this.f8232c;
            if (lVar3 != null) {
                lVar = z.a(lVar3, e10, lVar2.f8274m.getContext());
            }
            return c.B(mVar, b10, lVar);
        } else if (obj instanceof a) {
            kotlin.jvm.internal.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(e10);
        } else if (obj instanceof b9.l) {
            kotlin.jvm.internal.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            b9.l lVar4 = (b9.l) obj;
            l<E, s> lVar5 = this.f8232c;
            if (lVar5 != null) {
                lVar = z.a(lVar5, e10, lVar4.getContext());
            }
            return c.B(lVar4, e10, lVar);
        } else {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
    }

    private final boolean o0(Object obj, h<E> hVar, int i10) {
        b9.l<Boolean> a10;
        Object obj2;
        if (obj instanceof b9.l) {
            kotlin.jvm.internal.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            a10 = (b9.l) obj;
            obj2 = s.f8976a;
        } else if (obj instanceof j9.b) {
            kotlin.jvm.internal.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            j9.d i11 = ((j9.a) obj).i(this, s.f8976a);
            if (i11 == j9.d.REREGISTER) {
                hVar.s(i10);
            }
            return i11 == j9.d.SUCCESSFUL;
        } else if (obj instanceof C0126b) {
            a10 = ((C0126b) obj).a();
            obj2 = Boolean.TRUE;
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        return c.C(a10, obj2, (l) null, 2, (Object) null);
    }

    private final boolean p0(h<E> hVar, int i10, long j10) {
        Object w9 = hVar.w(i10);
        if (!(w9 instanceof q2) || j10 < f8223f.get(this) || !hVar.r(i10, w9, c.f8249g)) {
            return q0(hVar, i10, j10);
        }
        if (o0(w9, hVar, i10)) {
            hVar.A(i10, c.f8246d);
            return true;
        }
        hVar.A(i10, c.f8252j);
        hVar.x(i10, false);
        return false;
    }

    private final boolean q0(h<E> hVar, int i10, long j10) {
        while (true) {
            Object w9 = hVar.w(i10);
            if (w9 instanceof q2) {
                if (j10 < f8223f.get(this)) {
                    if (hVar.r(i10, w9, new o((q2) w9))) {
                        return true;
                    }
                } else if (hVar.r(i10, w9, c.f8249g)) {
                    if (o0(w9, hVar, i10)) {
                        hVar.A(i10, c.f8246d);
                        return true;
                    }
                    hVar.A(i10, c.f8252j);
                    hVar.x(i10, false);
                    return false;
                }
            } else if (w9 == c.f8252j) {
                return false;
            } else {
                if (w9 == null) {
                    if (hVar.r(i10, w9, c.f8247e)) {
                        return true;
                    }
                } else if (w9 == c.f8246d || w9 == c.f8250h || w9 == c.f8251i || w9 == c.f8253k || w9 == c.z()) {
                    return true;
                } else {
                    if (w9 != c.f8248f) {
                        throw new IllegalStateException(("Unexpected cell state: " + w9).toString());
                    }
                }
            }
        }
        return true;
    }

    private final boolean r(long j10) {
        return j10 < D() || j10 < G() + ((long) this.f8231b);
    }

    /* access modifiers changed from: private */
    public final Object r0(h<E> hVar, int i10, long j10, Object obj) {
        Object w9 = hVar.w(i10);
        if (w9 == null) {
            if (j10 >= (f8222e.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return c.f8256n;
                }
                if (hVar.r(i10, w9, obj)) {
                    z();
                    return c.f8255m;
                }
            }
        } else if (w9 == c.f8246d && hVar.r(i10, w9, c.f8251i)) {
            z();
            return hVar.y(i10);
        }
        return s0(hVar, i10, j10, obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        r0 = g9.n.c(r0, r4);
        r9.x(r3, true);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void s(d9.h<E> r9, long r10) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            java.lang.Object r0 = g9.n.b(r0, r1, r0)
        L_0x0006:
            r2 = -1
            if (r9 == 0) goto L_0x0068
            int r3 = d9.c.f8244b
            int r3 = r3 - r1
        L_0x000c:
            if (r2 >= r3) goto L_0x0061
            long r4 = r9.f8986o
            int r6 = d9.c.f8244b
            long r6 = (long) r6
            long r4 = r4 * r6
            long r6 = (long) r3
            long r4 = r4 + r6
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 < 0) goto L_0x0068
        L_0x001b:
            java.lang.Object r4 = r9.w(r3)
            if (r4 == 0) goto L_0x0051
            g9.h0 r5 = d9.c.f8247e
            if (r4 != r5) goto L_0x0028
            goto L_0x0051
        L_0x0028:
            boolean r5 = r4 instanceof d9.o
            if (r5 == 0) goto L_0x0042
            g9.h0 r5 = d9.c.z()
            boolean r5 = r9.r(r3, r4, r5)
            if (r5 == 0) goto L_0x001b
            d9.o r4 = (d9.o) r4
            b9.q2 r4 = r4.f8275a
        L_0x003a:
            java.lang.Object r0 = g9.n.c(r0, r4)
            r9.x(r3, r1)
            goto L_0x005e
        L_0x0042:
            boolean r5 = r4 instanceof b9.q2
            if (r5 == 0) goto L_0x005e
            g9.h0 r5 = d9.c.z()
            boolean r5 = r9.r(r3, r4, r5)
            if (r5 == 0) goto L_0x001b
            goto L_0x003a
        L_0x0051:
            g9.h0 r5 = d9.c.z()
            boolean r4 = r9.r(r3, r4, r5)
            if (r4 == 0) goto L_0x001b
            r9.p()
        L_0x005e:
            int r3 = r3 + -1
            goto L_0x000c
        L_0x0061:
            g9.e r9 = r9.g()
            d9.h r9 = (d9.h) r9
            goto L_0x0006
        L_0x0068:
            if (r0 == 0) goto L_0x008e
            boolean r9 = r0 instanceof java.util.ArrayList
            if (r9 != 0) goto L_0x0074
            b9.q2 r0 = (b9.q2) r0
            r8.j0(r0)
            goto L_0x008e
        L_0x0074:
            java.lang.String r9 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.l.c(r0, r9)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r9 = r0.size()
            int r9 = r9 - r1
        L_0x0080:
            if (r2 >= r9) goto L_0x008e
            java.lang.Object r10 = r0.get(r9)
            b9.q2 r10 = (b9.q2) r10
            r8.j0(r10)
            int r9 = r9 + -1
            goto L_0x0080
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.b.s(d9.h, long):void");
    }

    private final Object s0(h<E> hVar, int i10, long j10, Object obj) {
        while (true) {
            Object w9 = hVar.w(i10);
            if (w9 == null || w9 == c.f8247e) {
                if (j10 < (f8222e.get(this) & 1152921504606846975L)) {
                    if (hVar.r(i10, w9, c.f8250h)) {
                        z();
                        return c.f8257o;
                    }
                } else if (obj == null) {
                    return c.f8256n;
                } else {
                    if (hVar.r(i10, w9, obj)) {
                        z();
                        return c.f8255m;
                    }
                }
            } else if (w9 == c.f8246d) {
                if (hVar.r(i10, w9, c.f8251i)) {
                    z();
                    return hVar.y(i10);
                }
            } else if (w9 == c.f8252j) {
                return c.f8257o;
            } else {
                if (w9 == c.f8250h) {
                    return c.f8257o;
                }
                if (w9 == c.z()) {
                    z();
                    return c.f8257o;
                } else if (w9 != c.f8249g && hVar.r(i10, w9, c.f8248f)) {
                    boolean z9 = w9 instanceof o;
                    if (z9) {
                        w9 = ((o) w9).f8275a;
                    }
                    if (o0(w9, hVar, i10)) {
                        hVar.A(i10, c.f8251i);
                        z();
                        return hVar.y(i10);
                    }
                    hVar.A(i10, c.f8252j);
                    hVar.x(i10, false);
                    if (z9) {
                        z();
                    }
                    return c.f8257o;
                }
            }
        }
    }

    private final h<E> t() {
        h hVar = f8228k.get(this);
        h hVar2 = (h) f8226i.get(this);
        if (hVar2.f8986o > ((h) hVar).f8986o) {
            hVar = hVar2;
        }
        h hVar3 = (h) f8227j.get(this);
        if (hVar3.f8986o > ((h) hVar).f8986o) {
            hVar = hVar3;
        }
        return (h) g9.d.b((e) hVar);
    }

    /* access modifiers changed from: private */
    public final int t0(h<E> hVar, int i10, E e10, long j10, Object obj, boolean z9) {
        hVar.B(i10, e10);
        if (z9) {
            return u0(hVar, i10, e10, j10, obj, z9);
        }
        Object w9 = hVar.w(i10);
        if (w9 == null) {
            if (r(j10)) {
                if (hVar.r(i10, (Object) null, c.f8246d)) {
                    return 1;
                }
            } else if (obj == null) {
                return 3;
            } else {
                if (hVar.r(i10, (Object) null, obj)) {
                    return 2;
                }
            }
        } else if (w9 instanceof q2) {
            hVar.s(i10);
            if (n0(w9, e10)) {
                hVar.A(i10, c.f8251i);
                c0();
                return 0;
            }
            if (hVar.t(i10, c.f8253k) != c.f8253k) {
                hVar.x(i10, true);
            }
            return 5;
        }
        return u0(hVar, i10, e10, j10, obj, z9);
    }

    private final int u0(h<E> hVar, int i10, E e10, long j10, Object obj, boolean z9) {
        while (true) {
            Object w9 = hVar.w(i10);
            if (w9 == null) {
                if (!r(j10) || z9) {
                    if (z9) {
                        if (hVar.r(i10, (Object) null, c.f8252j)) {
                            hVar.x(i10, false);
                            return 4;
                        }
                    } else if (obj == null) {
                        return 3;
                    } else {
                        if (hVar.r(i10, (Object) null, obj)) {
                            return 2;
                        }
                    }
                } else if (hVar.r(i10, (Object) null, c.f8246d)) {
                    return 1;
                }
            } else if (w9 == c.f8247e) {
                if (hVar.r(i10, w9, c.f8246d)) {
                    return 1;
                }
            } else if (w9 == c.f8253k) {
                hVar.s(i10);
                return 5;
            } else if (w9 == c.f8250h) {
                hVar.s(i10);
                return 5;
            } else {
                h0 z10 = c.z();
                hVar.s(i10);
                if (w9 == z10) {
                    x();
                    return 4;
                }
                if (w9 instanceof o) {
                    w9 = ((o) w9).f8275a;
                }
                if (n0(w9, e10)) {
                    hVar.A(i10, c.f8251i);
                    c0();
                    return 0;
                }
                if (hVar.t(i10, c.f8253k) != c.f8253k) {
                    hVar.x(i10, true);
                }
                return 5;
            }
        }
    }

    private final void v(long j10) {
        i0(w(j10));
    }

    private final void v0(long j10) {
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8223f;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            if (j11 >= j10 || f8223f.compareAndSet(this, j11, j10)) {
            }
            j11 = atomicLongFieldUpdater.get(this);
            return;
        } while (f8223f.compareAndSet(this, j11, j10));
    }

    private final h<E> w(long j10) {
        h<E> t9 = t();
        if (T()) {
            long V = V(t9);
            if (V != -1) {
                y(V);
            }
        }
        s(t9, j10);
        return t9;
    }

    private final void w0(long j10) {
        long j11;
        long j12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8222e;
        do {
            j11 = atomicLongFieldUpdater.get(this);
            j12 = 1152921504606846975L & j11;
            if (j12 < j10) {
            } else {
                return;
            }
        } while (!f8222e.compareAndSet(this, j11, c.w(j12, (int) (j11 >> 60))));
    }

    private final void x() {
        R();
    }

    private final void z() {
        if (!U()) {
            h hVar = (h) f8228k.get(this);
            while (true) {
                long andIncrement = f8224g.getAndIncrement(this);
                int i10 = c.f8244b;
                long j10 = andIncrement / ((long) i10);
                int i11 = (I() > andIncrement ? 1 : (I() == andIncrement ? 0 : -1));
                long j11 = hVar.f8986o;
                if (i11 <= 0) {
                    if (j11 < j10 && hVar.e() != null) {
                        Z(j10, hVar);
                    }
                    L(this, 0, 1, (Object) null);
                    return;
                }
                if (j11 != j10) {
                    h A = A(j10, hVar, andIncrement);
                    if (A == null) {
                        continue;
                    } else {
                        hVar = A;
                    }
                }
                boolean p02 = p0(hVar, (int) (andIncrement % ((long) i10)), andIncrement);
                L(this, 0, 1, (Object) null);
                if (p02) {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final Throwable E() {
        return (Throwable) f8229l.get(this);
    }

    public final long G() {
        return f8223f.get(this);
    }

    /* access modifiers changed from: protected */
    public final Throwable H() {
        Throwable E = E();
        return E == null ? new j("Channel was closed") : E;
    }

    public final long I() {
        return f8222e.get(this) & 1152921504606846975L;
    }

    public final boolean J() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8227j;
            h hVar = (h) atomicReferenceFieldUpdater.get(this);
            long G = G();
            if (I() <= G) {
                return false;
            }
            int i10 = c.f8244b;
            long j10 = G / ((long) i10);
            if (hVar.f8986o == j10 || (hVar = B(j10, hVar)) != null) {
                hVar.b();
                if (N(hVar, (int) (G % ((long) i10)), G)) {
                    return true;
                }
                f8223f.compareAndSet(this, G, G + 1);
            } else if (((h) atomicReferenceFieldUpdater.get(this)).f8986o < j10) {
                return false;
            }
        }
    }

    public boolean P() {
        return Q(f8222e.get(this));
    }

    public boolean R() {
        return S(f8222e.get(this));
    }

    /* access modifiers changed from: protected */
    public boolean T() {
        return false;
    }

    public boolean a(Throwable th) {
        return u(th, false);
    }

    /* access modifiers changed from: protected */
    public void a0() {
    }

    public Object b(d<? super E> dVar) {
        return g0(this, dVar);
    }

    public Object c() {
        h hVar;
        long j10 = f8223f.get(this);
        long j11 = f8222e.get(this);
        if (Q(j11)) {
            return g.f8266b.a(E());
        }
        if (j10 >= (j11 & 1152921504606846975L)) {
            return g.f8266b.b();
        }
        h0 i10 = c.f8253k;
        h hVar2 = (h) f8227j.get(this);
        while (!P()) {
            long andIncrement = f8223f.getAndIncrement(this);
            int i11 = c.f8244b;
            long j12 = andIncrement / ((long) i11);
            int i12 = (int) (andIncrement % ((long) i11));
            if (hVar2.f8986o != j12) {
                h e10 = B(j12, hVar2);
                if (e10 == null) {
                    continue;
                } else {
                    hVar = e10;
                }
            } else {
                hVar = hVar2;
            }
            Object p10 = r0(hVar, i12, andIncrement, i10);
            if (p10 == c.f8255m) {
                q2 q2Var = i10 instanceof q2 ? (q2) i10 : null;
                if (q2Var != null) {
                    e0(q2Var, hVar, i12);
                }
                x0(andIncrement);
                hVar.p();
                return g.f8266b.b();
            } else if (p10 == c.f8257o) {
                if (andIncrement < I()) {
                    hVar.b();
                }
                hVar2 = hVar;
            } else if (p10 != c.f8256n) {
                hVar.b();
                return g.f8266b.c(p10);
            } else {
                throw new IllegalStateException("unexpected".toString());
            }
        }
        return g.f8266b.a(E());
    }

    /* access modifiers changed from: protected */
    public void c0() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return d9.g.f8266b.a(H());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(E r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f8222e
            long r0 = r0.get(r14)
            boolean r0 = r14.m0(r0)
            if (r0 == 0) goto L_0x0013
            d9.g$b r15 = d9.g.f8266b
            java.lang.Object r15 = r15.b()
            return r15
        L_0x0013:
            g9.h0 r8 = d9.c.f8252j
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f8226i
            java.lang.Object r0 = r0.get(r14)
            d9.h r0 = (d9.h) r0
        L_0x0021:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f8222e
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = r14.S(r1)
            int r1 = d9.c.f8244b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.f8986o
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x004e
            d9.h r1 = r14.C(r2, r0)
            if (r1 != 0) goto L_0x004c
            if (r11 == 0) goto L_0x0021
            goto L_0x008e
        L_0x004c:
            r13 = r1
            goto L_0x004f
        L_0x004e:
            r13 = r0
        L_0x004f:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = r0.t0(r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto L_0x00b0
            r1 = 1
            if (r0 == r1) goto L_0x00b3
            r1 = 2
            if (r0 == r1) goto L_0x0089
            r1 = 3
            if (r0 == r1) goto L_0x007d
            r1 = 4
            if (r0 == r1) goto L_0x0071
            r1 = 5
            if (r0 == r1) goto L_0x006c
            goto L_0x006f
        L_0x006c:
            r13.b()
        L_0x006f:
            r0 = r13
            goto L_0x0021
        L_0x0071:
            long r0 = r14.G()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L_0x008e
            r13.b()
            goto L_0x008e
        L_0x007d:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x0089:
            if (r11 == 0) goto L_0x0099
            r13.p()
        L_0x008e:
            d9.g$b r15 = d9.g.f8266b
            java.lang.Throwable r0 = r14.H()
            java.lang.Object r15 = r15.a(r0)
            goto L_0x00bb
        L_0x0099:
            boolean r15 = r8 instanceof b9.q2
            if (r15 == 0) goto L_0x00a0
            b9.q2 r8 = (b9.q2) r8
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r8 == 0) goto L_0x00a6
            r14.f0(r8, r13, r12)
        L_0x00a6:
            r13.p()
            d9.g$b r15 = d9.g.f8266b
            java.lang.Object r15 = r15.b()
            goto L_0x00bb
        L_0x00b0:
            r13.b()
        L_0x00b3:
            d9.g$b r15 = d9.g.f8266b
            g8.s r0 = g8.s.f8976a
            java.lang.Object r15 = r15.c(r0)
        L_0x00bb:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.b.d(java.lang.Object):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public void d0() {
    }

    public e<E> iterator() {
        return new a();
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [g9.e] */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01da, code lost:
        r3 = r3.e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01e1, code lost:
        if (r3 != null) goto L_0x0202;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r16 = this;
            r0 = r16
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f8222e
            long r2 = r2.get(r0)
            r4 = 60
            long r2 = r2 >> r4
            int r3 = (int) r2
            r2 = 3
            r4 = 2
            if (r3 == r4) goto L_0x001b
            if (r3 == r2) goto L_0x0018
            goto L_0x0020
        L_0x0018:
            java.lang.String r3 = "cancelled,"
            goto L_0x001d
        L_0x001b:
            java.lang.String r3 = "closed,"
        L_0x001d:
            r1.append(r3)
        L_0x0020:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "capacity="
            r3.append(r5)
            int r5 = r0.f8231b
            r3.append(r5)
            r5 = 44
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r1.append(r3)
            java.lang.String r3 = "data=["
            r1.append(r3)
            d9.h[] r2 = new d9.h[r2]
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f8227j
            java.lang.Object r3 = r3.get(r0)
            r6 = 0
            r2[r6] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f8226i
            java.lang.Object r3 = r3.get(r0)
            r7 = 1
            r2[r7] = r3
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f8228k
            java.lang.Object r3 = r3.get(r0)
            r2[r4] = r3
            java.util.List r2 = h8.n.e(r2)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0069:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0085
            java.lang.Object r4 = r2.next()
            r8 = r4
            d9.h r8 = (d9.h) r8
            d9.h r9 = d9.c.f8243a
            if (r8 == r9) goto L_0x007e
            r8 = 1
            goto L_0x007f
        L_0x007e:
            r8 = 0
        L_0x007f:
            if (r8 == 0) goto L_0x0069
            r3.add(r4)
            goto L_0x0069
        L_0x0085:
            java.util.Iterator r2 = r3.iterator()
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0206
            java.lang.Object r3 = r2.next()
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x009a
            goto L_0x00b4
        L_0x009a:
            r4 = r3
            d9.h r4 = (d9.h) r4
            long r8 = r4.f8986o
        L_0x009f:
            java.lang.Object r4 = r2.next()
            r10 = r4
            d9.h r10 = (d9.h) r10
            long r10 = r10.f8986o
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x00ae
            r3 = r4
            r8 = r10
        L_0x00ae:
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x009f
        L_0x00b4:
            d9.h r3 = (d9.h) r3
            long r10 = r16.G()
            long r12 = r16.I()
        L_0x00be:
            int r2 = d9.c.f8244b
            r4 = 0
        L_0x00c1:
            if (r4 >= r2) goto L_0x01da
            long r8 = r3.f8986o
            int r14 = d9.c.f8244b
            long r14 = (long) r14
            long r8 = r8 * r14
            long r14 = (long) r4
            long r8 = r8 + r14
            int r14 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x00d4
            int r15 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r15 >= 0) goto L_0x01e3
        L_0x00d4:
            java.lang.Object r15 = r3.w(r4)
            java.lang.Object r6 = r3.v(r4)
            boolean r7 = r15 instanceof b9.l
            if (r7 == 0) goto L_0x00f6
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x00ea
            if (r14 < 0) goto L_0x00ea
            java.lang.String r7 = "receive"
            goto L_0x01a3
        L_0x00ea:
            if (r14 >= 0) goto L_0x00f2
            if (r7 < 0) goto L_0x00f2
            java.lang.String r7 = "send"
            goto L_0x01a3
        L_0x00f2:
            java.lang.String r7 = "cont"
            goto L_0x01a3
        L_0x00f6:
            boolean r7 = r15 instanceof j9.b
            if (r7 == 0) goto L_0x0110
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x0104
            if (r14 < 0) goto L_0x0104
            java.lang.String r7 = "onReceive"
            goto L_0x01a3
        L_0x0104:
            if (r14 >= 0) goto L_0x010c
            if (r7 < 0) goto L_0x010c
            java.lang.String r7 = "onSend"
            goto L_0x01a3
        L_0x010c:
            java.lang.String r7 = "select"
            goto L_0x01a3
        L_0x0110:
            boolean r7 = r15 instanceof d9.l
            if (r7 == 0) goto L_0x0118
            java.lang.String r7 = "receiveCatching"
            goto L_0x01a3
        L_0x0118:
            boolean r7 = r15 instanceof d9.b.C0126b
            if (r7 == 0) goto L_0x0120
            java.lang.String r7 = "sendBroadcast"
            goto L_0x01a3
        L_0x0120:
            boolean r7 = r15 instanceof d9.o
            if (r7 == 0) goto L_0x013c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "EB("
            r7.append(r8)
            r7.append(r15)
            r8 = 41
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            goto L_0x01a3
        L_0x013c:
            g9.h0 r7 = d9.c.f8248f
            boolean r7 = kotlin.jvm.internal.l.a(r15, r7)
            if (r7 == 0) goto L_0x0148
            r7 = 1
            goto L_0x0150
        L_0x0148:
            g9.h0 r7 = d9.c.f8249g
            boolean r7 = kotlin.jvm.internal.l.a(r15, r7)
        L_0x0150:
            if (r7 == 0) goto L_0x0155
            java.lang.String r7 = "resuming_sender"
            goto L_0x01a3
        L_0x0155:
            if (r15 != 0) goto L_0x0159
            r7 = 1
            goto L_0x0161
        L_0x0159:
            g9.h0 r7 = d9.c.f8247e
            boolean r7 = kotlin.jvm.internal.l.a(r15, r7)
        L_0x0161:
            if (r7 == 0) goto L_0x0165
            r7 = 1
            goto L_0x016d
        L_0x0165:
            g9.h0 r7 = d9.c.f8251i
            boolean r7 = kotlin.jvm.internal.l.a(r15, r7)
        L_0x016d:
            if (r7 == 0) goto L_0x0171
            r7 = 1
            goto L_0x0179
        L_0x0171:
            g9.h0 r7 = d9.c.f8250h
            boolean r7 = kotlin.jvm.internal.l.a(r15, r7)
        L_0x0179:
            if (r7 == 0) goto L_0x017d
            r7 = 1
            goto L_0x0185
        L_0x017d:
            g9.h0 r7 = d9.c.f8253k
            boolean r7 = kotlin.jvm.internal.l.a(r15, r7)
        L_0x0185:
            if (r7 == 0) goto L_0x0189
            r7 = 1
            goto L_0x0191
        L_0x0189:
            g9.h0 r7 = d9.c.f8252j
            boolean r7 = kotlin.jvm.internal.l.a(r15, r7)
        L_0x0191:
            if (r7 == 0) goto L_0x0195
            r7 = 1
            goto L_0x019d
        L_0x0195:
            g9.h0 r7 = d9.c.z()
            boolean r7 = kotlin.jvm.internal.l.a(r15, r7)
        L_0x019d:
            if (r7 != 0) goto L_0x01d4
            java.lang.String r7 = r15.toString()
        L_0x01a3:
            if (r6 == 0) goto L_0x01c2
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = 40
            r8.append(r9)
            r8.append(r7)
            r8.append(r5)
            r8.append(r6)
            java.lang.String r6 = "),"
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            goto L_0x01d1
        L_0x01c2:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
        L_0x01d1:
            r1.append(r6)
        L_0x01d4:
            int r4 = r4 + 1
            r6 = 0
            r7 = 1
            goto L_0x00c1
        L_0x01da:
            g9.e r2 = r3.e()
            r3 = r2
            d9.h r3 = (d9.h) r3
            if (r3 != 0) goto L_0x0202
        L_0x01e3:
            char r2 = z8.r.p0(r1)
            if (r2 != r5) goto L_0x01f8
            int r2 = r1.length()
            r4 = 1
            int r2 = r2 - r4
            java.lang.StringBuilder r2 = r1.deleteCharAt(r2)
            java.lang.String r3 = "this.deleteCharAt(index)"
            kotlin.jvm.internal.l.d(r2, r3)
        L_0x01f8:
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
        L_0x0202:
            r6 = 0
            r7 = 1
            goto L_0x00be
        L_0x0206:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.b.toString():java.lang.String");
    }

    /* access modifiers changed from: protected */
    public boolean u(Throwable th, boolean z9) {
        if (z9) {
            W();
        }
        boolean a10 = androidx.concurrent.futures.b.a(f8229l, this, c.f8261s, th);
        if (z9) {
            X();
        } else {
            Y();
        }
        x();
        a0();
        if (a10) {
            M();
        }
        return a10;
    }

    public final void x0(long j10) {
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j12;
        if (!U()) {
            do {
            } while (D() <= j10);
            int g10 = c.f8245c;
            int i10 = 0;
            while (i10 < g10) {
                long D = D();
                if (D != (f8225h.get(this) & 4611686018427387903L) || D != D()) {
                    i10++;
                } else {
                    return;
                }
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f8225h;
            do {
                j11 = atomicLongFieldUpdater2.get(this);
            } while (!atomicLongFieldUpdater2.compareAndSet(this, j11, c.v(j11 & 4611686018427387903L, true)));
            while (true) {
                long D2 = D();
                atomicLongFieldUpdater = f8225h;
                long j13 = atomicLongFieldUpdater.get(this);
                long j14 = j13 & 4611686018427387903L;
                boolean z9 = (4611686018427387904L & j13) != 0;
                if (D2 == j14 && D2 == D()) {
                    break;
                } else if (!z9) {
                    atomicLongFieldUpdater.compareAndSet(this, j13, c.v(j14, true));
                }
            }
            do {
                j12 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j12, c.v(j12 & 4611686018427387903L, false)));
        }
    }

    /* access modifiers changed from: protected */
    public final void y(long j10) {
        q0 d10;
        h hVar = (h) f8227j.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f8223f;
            long j11 = atomicLongFieldUpdater.get(this);
            if (j10 >= Math.max(((long) this.f8231b) + j11, D())) {
                if (atomicLongFieldUpdater.compareAndSet(this, j11, j11 + 1)) {
                    int i10 = c.f8244b;
                    long j12 = j11 / ((long) i10);
                    int i11 = (int) (j11 % ((long) i10));
                    if (hVar.f8986o != j12) {
                        h B = B(j12, hVar);
                        if (B == null) {
                            continue;
                        } else {
                            hVar = B;
                        }
                    }
                    Object r02 = r0(hVar, i11, j11, (Object) null);
                    if (r02 != c.f8257o) {
                        hVar.b();
                        l<E, s> lVar = this.f8232c;
                        if (!(lVar == null || (d10 = z.d(lVar, r02, (q0) null, 2, (Object) null)) == null)) {
                            throw d10;
                        }
                    } else if (j11 < I()) {
                        hVar.b();
                    }
                }
            } else {
                return;
            }
        }
    }
}
