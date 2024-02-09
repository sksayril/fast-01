package androidx.concurrent.futures;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class a<V> implements r3.d<V> {

    /* renamed from: p  reason: collision with root package name */
    static final boolean f1131p = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: q  reason: collision with root package name */
    private static final Logger f1132q = Logger.getLogger(a.class.getName());

    /* renamed from: r  reason: collision with root package name */
    static final b f1133r;

    /* renamed from: s  reason: collision with root package name */
    private static final Object f1134s = new Object();

    /* renamed from: m  reason: collision with root package name */
    volatile Object f1135m;

    /* renamed from: n  reason: collision with root package name */
    volatile e f1136n;

    /* renamed from: o  reason: collision with root package name */
    volatile i f1137o;

    private static abstract class b {
        private b() {
        }

        /* access modifiers changed from: package-private */
        public abstract boolean a(a<?> aVar, e eVar, e eVar2);

        /* access modifiers changed from: package-private */
        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        public abstract boolean c(a<?> aVar, i iVar, i iVar2);

        /* access modifiers changed from: package-private */
        public abstract void d(i iVar, i iVar2);

        /* access modifiers changed from: package-private */
        public abstract void e(i iVar, Thread thread);
    }

    private static final class c {

        /* renamed from: c  reason: collision with root package name */
        static final c f1138c;

        /* renamed from: d  reason: collision with root package name */
        static final c f1139d;

        /* renamed from: a  reason: collision with root package name */
        final boolean f1140a;

        /* renamed from: b  reason: collision with root package name */
        final Throwable f1141b;

        static {
            if (a.f1131p) {
                f1139d = null;
                f1138c = null;
                return;
            }
            f1139d = new c(false, (Throwable) null);
            f1138c = new c(true, (Throwable) null);
        }

        c(boolean z9, Throwable th) {
            this.f1140a = z9;
            this.f1141b = th;
        }
    }

    private static final class d {

        /* renamed from: b  reason: collision with root package name */
        static final d f1142b = new d(new C0013a("Failure occurred while trying to finish a future."));

        /* renamed from: a  reason: collision with root package name */
        final Throwable f1143a;

        /* renamed from: androidx.concurrent.futures.a$d$a  reason: collision with other inner class name */
        class C0013a extends Throwable {
            C0013a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        d(Throwable th) {
            this.f1143a = (Throwable) a.m(th);
        }
    }

    private static final class e {

        /* renamed from: d  reason: collision with root package name */
        static final e f1144d = new e((Runnable) null, (Executor) null);

        /* renamed from: a  reason: collision with root package name */
        final Runnable f1145a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f1146b;

        /* renamed from: c  reason: collision with root package name */
        e f1147c;

        e(Runnable runnable, Executor executor) {
            this.f1145a = runnable;
            this.f1146b = executor;
        }
    }

    private static final class f extends b {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, Thread> f1148a;

        /* renamed from: b  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<i, i> f1149b;

        /* renamed from: c  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, i> f1150c;

        /* renamed from: d  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, e> f1151d;

        /* renamed from: e  reason: collision with root package name */
        final AtomicReferenceFieldUpdater<a, Object> f1152e;

        f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f1148a = atomicReferenceFieldUpdater;
            this.f1149b = atomicReferenceFieldUpdater2;
            this.f1150c = atomicReferenceFieldUpdater3;
            this.f1151d = atomicReferenceFieldUpdater4;
            this.f1152e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            return b.a(this.f1151d, aVar, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            return b.a(this.f1152e, aVar, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        public boolean c(a<?> aVar, i iVar, i iVar2) {
            return b.a(this.f1150c, aVar, iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        public void d(i iVar, i iVar2) {
            this.f1149b.lazySet(iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        public void e(i iVar, Thread thread) {
            this.f1148a.lazySet(iVar, thread);
        }
    }

    private static final class g<V> implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final a<V> f1153m;

        /* renamed from: n  reason: collision with root package name */
        final r3.d<? extends V> f1154n;

        public void run() {
            if (this.f1153m.f1135m == this) {
                if (a.f1133r.b(this.f1153m, this, a.t(this.f1154n))) {
                    a.q(this.f1153m);
                }
            }
        }
    }

    private static final class h extends b {
        h() {
            super();
        }

        /* access modifiers changed from: package-private */
        public boolean a(a<?> aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                if (aVar.f1136n != eVar) {
                    return false;
                }
                aVar.f1136n = eVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f1135m != obj) {
                    return false;
                }
                aVar.f1135m = obj2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c(a<?> aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                if (aVar.f1137o != iVar) {
                    return false;
                }
                aVar.f1137o = iVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public void d(i iVar, i iVar2) {
            iVar.f1157b = iVar2;
        }

        /* access modifiers changed from: package-private */
        public void e(i iVar, Thread thread) {
            iVar.f1156a = thread;
        }
    }

    private static final class i {

        /* renamed from: c  reason: collision with root package name */
        static final i f1155c = new i(false);

        /* renamed from: a  reason: collision with root package name */
        volatile Thread f1156a;

        /* renamed from: b  reason: collision with root package name */
        volatile i f1157b;

        i() {
            a.f1133r.e(this, Thread.currentThread());
        }

        i(boolean z9) {
        }

        /* access modifiers changed from: package-private */
        public void a(i iVar) {
            a.f1133r.d(this, iVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            Thread thread = this.f1156a;
            if (thread != null) {
                this.f1156a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.concurrent.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.concurrent.futures.a$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: androidx.concurrent.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.concurrent.futures.a$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.concurrent.futures.a$i> r0 = androidx.concurrent.futures.a.i.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f1131p = r1
            java.lang.Class<androidx.concurrent.futures.a> r1 = androidx.concurrent.futures.a.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            f1132q = r1
            androidx.concurrent.futures.a$f r1 = new androidx.concurrent.futures.a$f     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.concurrent.futures.a> r2 = androidx.concurrent.futures.a.class
            java.lang.String r5 = "o"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.concurrent.futures.a> r0 = androidx.concurrent.futures.a.class
            java.lang.Class<androidx.concurrent.futures.a$e> r2 = androidx.concurrent.futures.a.e.class
            java.lang.String r6 = "n"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.concurrent.futures.a> r0 = androidx.concurrent.futures.a.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "m"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            androidx.concurrent.futures.a$h r1 = new androidx.concurrent.futures.a$h
            r1.<init>()
        L_0x0054:
            f1133r = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0063
            java.util.logging.Logger r1 = f1132q
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0063:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f1134s = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.a.<clinit>():void");
    }

    protected a() {
    }

    private String B(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    private void g(StringBuilder sb) {
        String str = "]";
        try {
            Object u9 = u(this);
            sb.append("SUCCESS, result=[");
            sb.append(B(u9));
            sb.append(str);
            return;
        } catch (ExecutionException e10) {
            sb.append("FAILURE, cause=[");
            sb.append(e10.getCause());
        } catch (CancellationException unused) {
            str = "CANCELLED";
        } catch (RuntimeException e11) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e11.getClass());
            str = " thrown from get()]";
        }
        sb.append(str);
    }

    private static CancellationException k(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    static <T> T m(T t9) {
        Objects.requireNonNull(t9);
        return t9;
    }

    private e n(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f1136n;
        } while (!f1133r.a(this, eVar2, e.f1144d));
        e eVar3 = eVar2;
        e eVar4 = eVar;
        e eVar5 = eVar3;
        while (eVar5 != null) {
            e eVar6 = eVar5.f1147c;
            eVar5.f1147c = eVar4;
            eVar4 = eVar5;
            eVar5 = eVar6;
        }
        return eVar4;
    }

    static void q(a<?> aVar) {
        e eVar = null;
        a<V> aVar2 = aVar;
        while (true) {
            aVar2.x();
            aVar2.i();
            e n10 = aVar2.n(eVar);
            while (true) {
                if (n10 != null) {
                    eVar = n10.f1147c;
                    Runnable runnable = n10.f1145a;
                    if (runnable instanceof g) {
                        g gVar = (g) runnable;
                        a<V> aVar3 = gVar.f1153m;
                        if (aVar3.f1135m == gVar) {
                            if (f1133r.b(aVar3, gVar, t(gVar.f1154n))) {
                                aVar2 = aVar3;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        r(runnable, n10.f1146b);
                    }
                    n10 = eVar;
                } else {
                    return;
                }
            }
        }
    }

    private static void r(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f1132q;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e10);
        }
    }

    private V s(Object obj) {
        if (obj instanceof c) {
            throw k("Task was cancelled.", ((c) obj).f1141b);
        } else if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f1143a);
        } else if (obj == f1134s) {
            return null;
        } else {
            return obj;
        }
    }

    static Object t(r3.d<?> dVar) {
        if (dVar instanceof a) {
            Object obj = ((a) dVar).f1135m;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f1140a ? cVar.f1141b != null ? new c(false, cVar.f1141b) : c.f1139d : obj;
        }
        boolean isCancelled = dVar.isCancelled();
        if ((!f1131p) && isCancelled) {
            return c.f1139d;
        }
        try {
            Object u9 = u(dVar);
            return u9 == null ? f1134s : u9;
        } catch (ExecutionException e10) {
            return new d(e10.getCause());
        } catch (CancellationException e11) {
            if (isCancelled) {
                return new c(false, e11);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + dVar, e11));
        } catch (Throwable th) {
            return new d(th);
        }
    }

    static <V> V u(Future<V> future) {
        V v9;
        boolean z9 = false;
        while (true) {
            try {
                v9 = future.get();
                break;
            } catch (InterruptedException unused) {
                z9 = true;
            } catch (Throwable th) {
                if (z9) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
        return v9;
    }

    private void x() {
        i iVar;
        do {
            iVar = this.f1137o;
        } while (!f1133r.c(this, iVar, i.f1155c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f1157b;
        }
    }

    private void y(i iVar) {
        iVar.f1156a = null;
        while (true) {
            i iVar2 = this.f1137o;
            if (iVar2 != i.f1155c) {
                i iVar3 = null;
                while (iVar2 != null) {
                    i iVar4 = iVar2.f1157b;
                    if (iVar2.f1156a != null) {
                        iVar3 = iVar2;
                    } else if (iVar3 != null) {
                        iVar3.f1157b = iVar4;
                        if (iVar3.f1156a == null) {
                        }
                    } else if (!f1133r.c(this, iVar2, iVar4)) {
                    }
                    iVar2 = iVar4;
                }
                return;
            }
            return;
        }
    }

    /* access modifiers changed from: protected */
    public boolean A(Throwable th) {
        if (!f1133r.b(this, (Object) null, new d((Throwable) m(th)))) {
            return false;
        }
        q(this);
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean C() {
        Object obj = this.f1135m;
        return (obj instanceof c) && ((c) obj).f1140a;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, r3.d<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f1135m
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof androidx.concurrent.futures.a.g
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0061
            boolean r3 = f1131p
            if (r3 == 0) goto L_0x001f
            androidx.concurrent.futures.a$c r3 = new androidx.concurrent.futures.a$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            androidx.concurrent.futures.a$c r3 = androidx.concurrent.futures.a.c.f1138c
            goto L_0x0026
        L_0x0024:
            androidx.concurrent.futures.a$c r3 = androidx.concurrent.futures.a.c.f1139d
        L_0x0026:
            r5 = 0
            r4 = r7
        L_0x0028:
            androidx.concurrent.futures.a$b r6 = f1133r
            boolean r6 = r6.b(r4, r0, r3)
            if (r6 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0035
            r4.v()
        L_0x0035:
            q(r4)
            boolean r4 = r0 instanceof androidx.concurrent.futures.a.g
            if (r4 == 0) goto L_0x0062
            androidx.concurrent.futures.a$g r0 = (androidx.concurrent.futures.a.g) r0
            r3.d<? extends V> r0 = r0.f1154n
            boolean r4 = r0 instanceof androidx.concurrent.futures.a
            if (r4 == 0) goto L_0x0055
            r4 = r0
            androidx.concurrent.futures.a r4 = (androidx.concurrent.futures.a) r4
            java.lang.Object r0 = r4.f1135m
            if (r0 != 0) goto L_0x004d
            r5 = 1
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            boolean r6 = r0 instanceof androidx.concurrent.futures.a.g
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0062
            r5 = 1
            goto L_0x0028
        L_0x0055:
            r0.cancel(r8)
            goto L_0x0062
        L_0x0059:
            java.lang.Object r0 = r4.f1135m
            boolean r6 = r0 instanceof androidx.concurrent.futures.a.g
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0062
        L_0x0061:
            r1 = 0
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.a.cancel(boolean):boolean");
    }

    public final void e(Runnable runnable, Executor executor) {
        m(runnable);
        m(executor);
        e eVar = this.f1136n;
        if (eVar != e.f1144d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f1147c = eVar;
                if (!f1133r.a(this, eVar, eVar2)) {
                    eVar = this.f1136n;
                } else {
                    return;
                }
            } while (eVar != e.f1144d);
        }
        r(runnable, executor);
    }

    public final V get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f1135m;
            if ((obj2 != null) && (!(obj2 instanceof g))) {
                return s(obj2);
            }
            i iVar = this.f1137o;
            if (iVar != i.f1155c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f1133r.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f1135m;
                            } else {
                                y(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return s(obj);
                    }
                    iVar = this.f1137o;
                } while (iVar != i.f1155c);
            }
            return s(this.f1135m);
        }
        throw new InterruptedException();
    }

    public final V get(long j10, TimeUnit timeUnit) {
        long j11 = j10;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j11);
        if (!Thread.interrupted()) {
            Object obj = this.f1135m;
            if ((obj != null) && (!(obj instanceof g))) {
                return s(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                i iVar = this.f1137o;
                if (iVar != i.f1155c) {
                    i iVar2 = new i();
                    do {
                        iVar2.a(iVar);
                        if (f1133r.c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f1135m;
                                    if ((obj2 != null) && (!(obj2 instanceof g))) {
                                        return s(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    y(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            y(iVar2);
                        } else {
                            iVar = this.f1137o;
                        }
                    } while (iVar != i.f1155c);
                }
                return s(this.f1135m);
            }
            while (nanos > 0) {
                Object obj3 = this.f1135m;
                if ((obj3 != null) && (!(obj3 instanceof g))) {
                    return s(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String timeUnit3 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = timeUnit3.toLowerCase(locale);
            String str = "Waited " + j11 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j12 = -nanos;
                long convert = timeUnit2.convert(j12, TimeUnit.NANOSECONDS);
                long nanos2 = j12 - timeUnit2.toNanos(convert);
                int i10 = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z9 = i10 == 0 || nanos2 > 1000;
                if (i10 > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z9) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z9) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + aVar);
        }
        throw new InterruptedException();
    }

    /* access modifiers changed from: protected */
    public void i() {
    }

    public final boolean isCancelled() {
        return this.f1135m instanceof c;
    }

    public final boolean isDone() {
        Object obj = this.f1135m;
        return (!(obj instanceof g)) & (obj != null);
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            str2 = "CANCELLED";
        } else {
            if (!isDone()) {
                try {
                    str = w();
                } catch (RuntimeException e10) {
                    str = "Exception thrown from implementation: " + e10.getClass();
                }
                if (str != null && !str.isEmpty()) {
                    sb.append("PENDING, info=[");
                    sb.append(str);
                    sb.append("]");
                    sb.append("]");
                    return sb.toString();
                } else if (!isDone()) {
                    str2 = "PENDING";
                }
            }
            g(sb);
            sb.append("]");
            return sb.toString();
        }
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public void v() {
    }

    /* access modifiers changed from: protected */
    public String w() {
        Object obj = this.f1135m;
        if (obj instanceof g) {
            return "setFuture=[" + B(((g) obj).f1154n) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    /* access modifiers changed from: protected */
    public boolean z(V v9) {
        if (v9 == null) {
            v9 = f1134s;
        }
        if (!f1133r.b(this, (Object) null, v9)) {
            return false;
        }
        q(this);
        return true;
    }
}
