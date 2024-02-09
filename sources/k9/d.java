package k9;

import b9.q2;
import g8.s;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;
import r8.l;
import r8.p;

public class d {

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f11039c;

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f11040d;

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f11041e;

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicLongFieldUpdater f11042f;

    /* renamed from: g  reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f11043g;
    private volatile int _availablePermits;

    /* renamed from: a  reason: collision with root package name */
    private final int f11044a;

    /* renamed from: b  reason: collision with root package name */
    private final l<Throwable, s> f11045b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    /* synthetic */ class a extends j implements p<Long, f, f> {

        /* renamed from: m  reason: collision with root package name */
        public static final a f11046m = new a();

        a() {
            super(2, e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final f d(long j10, f fVar) {
            return e.h(j10, fVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return d(((Number) obj).longValue(), (f) obj2);
        }
    }

    static final class b extends m implements l<Throwable, s> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ d f11047m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(1);
            this.f11047m = dVar;
        }

        public final void b(Throwable th) {
            this.f11047m.i();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return s.f8976a;
        }
    }

    /* synthetic */ class c extends j implements p<Long, f, f> {

        /* renamed from: m  reason: collision with root package name */
        public static final c f11048m = new c();

        c() {
            super(2, e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final f d(long j10, f fVar) {
            return e.h(j10, fVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return d(((Number) obj).longValue(), (f) obj2);
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<d> cls2 = d.class;
        f11039c = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "head");
        f11040d = AtomicLongFieldUpdater.newUpdater(cls2, "deqIdx");
        f11041e = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "tail");
        f11042f = AtomicLongFieldUpdater.newUpdater(cls2, "enqIdx");
        f11043g = AtomicIntegerFieldUpdater.newUpdater(cls2, "_availablePermits");
    }

    public d(int i10, int i11) {
        this.f11044a = i10;
        boolean z9 = true;
        if (i10 > 0) {
            if ((i11 < 0 || i11 > i10) ? false : z9) {
                f fVar = new f(0, (f) null, 2);
                this.head = fVar;
                this.tail = fVar;
                this._availablePermits = i10 - i11;
                this.f11045b = new b(this);
                return;
            }
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0051, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0037, code lost:
        r10 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean e(b9.q2 r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = f11041e
            java.lang.Object r3 = r2.get(r0)
            k9.f r3 = (k9.f) r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = f11042f
            long r4 = r4.getAndIncrement(r0)
            k9.d$a r6 = k9.d.a.f11046m
            int r7 = k9.e.f11054f
            long r7 = (long) r7
            long r7 = r4 / r7
        L_0x001b:
            java.lang.Object r9 = g9.d.c(r3, r7, r6)
            boolean r10 = g9.f0.c(r9)
            if (r10 != 0) goto L_0x005e
            g9.e0 r10 = g9.f0.b(r9)
        L_0x0029:
            java.lang.Object r13 = r2.get(r0)
            g9.e0 r13 = (g9.e0) r13
            long r14 = r13.f8986o
            long r11 = r10.f8986o
            int r16 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r16 < 0) goto L_0x0039
        L_0x0037:
            r10 = 1
            goto L_0x0051
        L_0x0039:
            boolean r11 = r10.q()
            if (r11 != 0) goto L_0x0041
            r10 = 0
            goto L_0x0051
        L_0x0041:
            boolean r11 = androidx.concurrent.futures.b.a(r2, r0, r13, r10)
            if (r11 == 0) goto L_0x0054
            boolean r10 = r13.m()
            if (r10 == 0) goto L_0x0037
            r13.k()
            goto L_0x0037
        L_0x0051:
            if (r10 == 0) goto L_0x001b
            goto L_0x005e
        L_0x0054:
            boolean r11 = r10.m()
            if (r11 == 0) goto L_0x0029
            r10.k()
            goto L_0x0029
        L_0x005e:
            g9.e0 r2 = g9.f0.b(r9)
            k9.f r2 = (k9.f) r2
            int r3 = k9.e.f11054f
            long r6 = (long) r3
            long r4 = r4 % r6
            int r3 = (int) r4
            r4 = 0
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r2.r()
            boolean r4 = r5.compareAndSet(r3, r4, r1)
            if (r4 == 0) goto L_0x007b
            r1.e(r2, r3)
            r1 = 1
            return r1
        L_0x007b:
            g9.h0 r4 = k9.e.f11050b
            g9.h0 r5 = k9.e.f11051c
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r2.r()
            boolean r2 = r2.compareAndSet(r3, r4, r5)
            if (r2 == 0) goto L_0x00c9
            boolean r2 = r1 instanceof b9.l
            if (r2 == 0) goto L_0x00a1
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>"
            kotlin.jvm.internal.l.c(r1, r2)
            b9.l r1 = (b9.l) r1
            g8.s r2 = g8.s.f8976a
            r8.l<java.lang.Throwable, g8.s> r3 = r0.f11045b
            r1.f(r2, r3)
        L_0x009f:
            r1 = 1
            goto L_0x00ad
        L_0x00a1:
            boolean r2 = r1 instanceof j9.b
            if (r2 == 0) goto L_0x00ae
            j9.b r1 = (j9.b) r1
            g8.s r2 = g8.s.f8976a
            r1.d(r2)
            goto L_0x009f
        L_0x00ad:
            return r1
        L_0x00ae:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "unexpected: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x00c9:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.d.e(b9.q2):boolean");
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    private final void f() {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f11043g
            int r1 = r0.get(r3)
            int r2 = r3.f11044a
            if (r1 <= r2) goto L_0x0010
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L_0x0000
        L_0x0010:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.d.f():void");
    }

    private final int g() {
        int andDecrement;
        do {
            andDecrement = f11043g.getAndDecrement(this);
        } while (andDecrement > this.f11044a);
        return andDecrement;
    }

    private final boolean k(Object obj) {
        if (obj instanceof b9.l) {
            kotlin.jvm.internal.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            b9.l lVar = (b9.l) obj;
            Object j10 = lVar.j(s.f8976a, (Object) null, this.f11045b);
            if (j10 == null) {
                return false;
            }
            lVar.n(j10);
            return true;
        } else if (obj instanceof j9.b) {
            return ((j9.b) obj).b(this, s.f8976a);
        } else {
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x004f, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0035, code lost:
        r9 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean l() {
        /*
            r16 = this;
            r0 = r16
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f11039c
            java.lang.Object r2 = r1.get(r0)
            k9.f r2 = (k9.f) r2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = f11040d
            long r3 = r3.getAndIncrement(r0)
            int r5 = k9.e.f11054f
            long r5 = (long) r5
            long r5 = r3 / r5
            k9.d$c r7 = k9.d.c.f11048m
        L_0x0019:
            java.lang.Object r8 = g9.d.c(r2, r5, r7)
            boolean r9 = g9.f0.c(r8)
            if (r9 != 0) goto L_0x005c
            g9.e0 r9 = g9.f0.b(r8)
        L_0x0027:
            java.lang.Object r12 = r1.get(r0)
            g9.e0 r12 = (g9.e0) r12
            long r13 = r12.f8986o
            long r10 = r9.f8986o
            int r15 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r15 < 0) goto L_0x0037
        L_0x0035:
            r9 = 1
            goto L_0x004f
        L_0x0037:
            boolean r10 = r9.q()
            if (r10 != 0) goto L_0x003f
            r9 = 0
            goto L_0x004f
        L_0x003f:
            boolean r10 = androidx.concurrent.futures.b.a(r1, r0, r12, r9)
            if (r10 == 0) goto L_0x0052
            boolean r9 = r12.m()
            if (r9 == 0) goto L_0x0035
            r12.k()
            goto L_0x0035
        L_0x004f:
            if (r9 == 0) goto L_0x0019
            goto L_0x005c
        L_0x0052:
            boolean r10 = r9.m()
            if (r10 == 0) goto L_0x0027
            r9.k()
            goto L_0x0027
        L_0x005c:
            g9.e0 r1 = g9.f0.b(r8)
            k9.f r1 = (k9.f) r1
            r1.b()
            long r7 = r1.f8986o
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x006d
            r2 = 0
            return r2
        L_0x006d:
            int r2 = k9.e.f11054f
            long r5 = (long) r2
            long r3 = r3 % r5
            int r2 = (int) r3
            g9.h0 r3 = k9.e.f11050b
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r1.r()
            java.lang.Object r3 = r4.getAndSet(r2, r3)
            if (r3 != 0) goto L_0x00b0
            int r3 = k9.e.f11049a
            r10 = 0
        L_0x0087:
            if (r10 >= r3) goto L_0x009d
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r1.r()
            java.lang.Object r4 = r4.get(r2)
            g9.h0 r5 = k9.e.f11051c
            if (r4 != r5) goto L_0x0099
            r4 = 1
            return r4
        L_0x0099:
            r4 = 1
            int r10 = r10 + 1
            goto L_0x0087
        L_0x009d:
            r4 = 1
            g9.h0 r3 = k9.e.f11050b
            g9.h0 r5 = k9.e.f11052d
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r1.r()
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            r1 = r1 ^ r4
            return r1
        L_0x00b0:
            g9.h0 r1 = k9.e.f11053e
            if (r3 != r1) goto L_0x00b8
            r1 = 0
            return r1
        L_0x00b8:
            boolean r1 = r0.k(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.d.l():boolean");
    }

    /* access modifiers changed from: protected */
    public final void d(b9.l<? super s> lVar) {
        while (g() <= 0) {
            kotlin.jvm.internal.l.c(lVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (e((q2) lVar)) {
                return;
            }
        }
        lVar.f(s.f8976a, this.f11045b);
    }

    public int h() {
        return Math.max(f11043g.get(this), 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i() {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f11043g
            int r0 = r0.getAndIncrement(r3)
            int r1 = r3.f11044a
            if (r0 >= r1) goto L_0x0014
            if (r0 < 0) goto L_0x000d
            return
        L_0x000d:
            boolean r0 = r3.l()
            if (r0 == 0) goto L_0x0000
            return
        L_0x0014:
            r3.f()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The number of released permits cannot be greater than "
            r1.append(r2)
            int r2 = r3.f11044a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.d.i():void");
    }

    public boolean j() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f11043g;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 > this.f11044a) {
                f();
            } else if (i10 <= 0) {
                return false;
            } else {
                if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }
}
