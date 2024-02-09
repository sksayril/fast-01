package y6;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import k7.c;

class c implements k7.c, f {

    /* renamed from: a  reason: collision with root package name */
    private final FlutterJNI f13290a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, f> f13291b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, List<b>> f13292c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f13293d;

    /* renamed from: e  reason: collision with root package name */
    private final AtomicBoolean f13294e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<Integer, c.b> f13295f;

    /* renamed from: g  reason: collision with root package name */
    private int f13296g;

    /* renamed from: h  reason: collision with root package name */
    private final d f13297h;

    /* renamed from: i  reason: collision with root package name */
    private WeakHashMap<c.C0169c, d> f13298i;

    /* renamed from: j  reason: collision with root package name */
    private i f13299j;

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f13300a;

        /* renamed from: b  reason: collision with root package name */
        int f13301b;

        /* renamed from: c  reason: collision with root package name */
        long f13302c;

        b(ByteBuffer byteBuffer, int i10, long j10) {
            this.f13300a = byteBuffer;
            this.f13301b = i10;
            this.f13302c = j10;
        }
    }

    /* renamed from: y6.c$c  reason: collision with other inner class name */
    static class C0231c implements d {

        /* renamed from: a  reason: collision with root package name */
        private final ExecutorService f13303a;

        C0231c(ExecutorService executorService) {
            this.f13303a = executorService;
        }

        public void a(Runnable runnable) {
            this.f13303a.execute(runnable);
        }
    }

    interface d {
        void a(Runnable runnable);
    }

    private static class e implements i {

        /* renamed from: a  reason: collision with root package name */
        ExecutorService f13304a = x6.a.e().b();

        e() {
        }

        public d a(c.d dVar) {
            return dVar.a() ? new h(this.f13304a) : new C0231c(this.f13304a);
        }
    }

    private static class f {

        /* renamed from: a  reason: collision with root package name */
        public final c.a f13305a;

        /* renamed from: b  reason: collision with root package name */
        public final d f13306b;

        f(c.a aVar, d dVar) {
            this.f13305a = aVar;
            this.f13306b = dVar;
        }
    }

    static class g implements c.b {

        /* renamed from: a  reason: collision with root package name */
        private final FlutterJNI f13307a;

        /* renamed from: b  reason: collision with root package name */
        private final int f13308b;

        /* renamed from: c  reason: collision with root package name */
        private final AtomicBoolean f13309c = new AtomicBoolean(false);

        g(FlutterJNI flutterJNI, int i10) {
            this.f13307a = flutterJNI;
            this.f13308b = i10;
        }

        public void a(ByteBuffer byteBuffer) {
            if (this.f13309c.getAndSet(true)) {
                throw new IllegalStateException("Reply already submitted");
            } else if (byteBuffer == null) {
                this.f13307a.invokePlatformMessageEmptyResponseCallback(this.f13308b);
            } else {
                this.f13307a.invokePlatformMessageResponseCallback(this.f13308b, byteBuffer, byteBuffer.position());
            }
        }
    }

    static class h implements d {

        /* renamed from: a  reason: collision with root package name */
        private final ExecutorService f13310a;

        /* renamed from: b  reason: collision with root package name */
        private final ConcurrentLinkedQueue<Runnable> f13311b = new ConcurrentLinkedQueue<>();

        /* renamed from: c  reason: collision with root package name */
        private final AtomicBoolean f13312c = new AtomicBoolean(false);

        h(ExecutorService executorService) {
            this.f13310a = executorService;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void f() {
            if (this.f13312c.compareAndSet(false, true)) {
                try {
                    Runnable poll = this.f13311b.poll();
                    if (poll != null) {
                        poll.run();
                    }
                } finally {
                    this.f13312c.set(false);
                    if (!this.f13311b.isEmpty()) {
                        this.f13310a.execute(new e(this));
                    }
                }
            }
        }

        public void a(Runnable runnable) {
            this.f13311b.add(runnable);
            this.f13310a.execute(new d(this));
        }
    }

    interface i {
        d a(c.d dVar);
    }

    private static class j implements c.C0169c {
        private j() {
        }
    }

    c(FlutterJNI flutterJNI) {
        this(flutterJNI, new e());
    }

    c(FlutterJNI flutterJNI, i iVar) {
        this.f13291b = new HashMap();
        this.f13292c = new HashMap();
        this.f13293d = new Object();
        this.f13294e = new AtomicBoolean(false);
        this.f13295f = new HashMap();
        this.f13296g = 1;
        this.f13297h = new g();
        this.f13298i = new WeakHashMap<>();
        this.f13290a = flutterJNI;
        this.f13299j = iVar;
    }

    private void j(String str, f fVar, ByteBuffer byteBuffer, int i10, long j10) {
        f fVar2 = fVar;
        d dVar = fVar2 != null ? fVar2.f13306b : null;
        d8.e.b("PlatformChannel ScheduleHandler on " + str, i10);
        b bVar = new b(this, str, i10, fVar, byteBuffer, j10);
        if (dVar == null) {
            dVar = this.f13297h;
        }
        dVar.a(bVar);
    }

    private static void k(Error error) {
        Thread currentThread = Thread.currentThread();
        if (currentThread.getUncaughtExceptionHandler() != null) {
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, error);
            return;
        }
        throw error;
    }

    private void l(f fVar, ByteBuffer byteBuffer, int i10) {
        if (fVar != null) {
            try {
                x6.b.f("DartMessenger", "Deferring to registered handler to process message.");
                fVar.f13305a.a(byteBuffer, new g(this.f13290a, i10));
            } catch (Exception e10) {
                x6.b.c("DartMessenger", "Uncaught exception in binary message listener", e10);
            } catch (Error e11) {
                k(e11);
            }
        } else {
            x6.b.f("DartMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
            this.f13290a.invokePlatformMessageEmptyResponseCallback(i10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void m(String str, int i10, f fVar, ByteBuffer byteBuffer, long j10) {
        d8.e.e("PlatformChannel ScheduleHandler on " + str, i10);
        d8.e.a("DartMessenger#handleMessageFromDart on " + str);
        try {
            l(fVar, byteBuffer, i10);
            if (byteBuffer != null && byteBuffer.isDirect()) {
                byteBuffer.limit(0);
            }
        } finally {
            this.f13290a.cleanupMessageData(j10);
            d8.e.d();
        }
    }

    public c.C0169c a(c.d dVar) {
        d a10 = this.f13299j.a(dVar);
        j jVar = new j();
        this.f13298i.put(jVar, a10);
        return jVar;
    }

    public void b(String str, ByteBuffer byteBuffer, c.b bVar) {
        d8.e.a("DartMessenger#send on " + str);
        try {
            x6.b.f("DartMessenger", "Sending message with callback over channel '" + str + "'");
            int i10 = this.f13296g;
            this.f13296g = i10 + 1;
            if (bVar != null) {
                this.f13295f.put(Integer.valueOf(i10), bVar);
            }
            if (byteBuffer == null) {
                this.f13290a.dispatchEmptyPlatformMessage(str, i10);
            } else {
                this.f13290a.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i10);
            }
        } finally {
            d8.e.d();
        }
    }

    public void c(String str, c.a aVar) {
        e(str, aVar, (c.C0169c) null);
    }

    public /* synthetic */ c.C0169c d() {
        return k7.b.a(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0076, code lost:
        r10 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        if (r10.hasNext() == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
        r11 = (y6.c.b) r10.next();
        j(r9, r8.f13291b.get(r9), r11.f13300a, r11.f13301b, r11.f13302c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(java.lang.String r9, k7.c.a r10, k7.c.C0169c r11) {
        /*
            r8 = this;
            if (r10 != 0) goto L_0x002a
            java.lang.String r10 = "DartMessenger"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Removing handler for channel '"
            r11.append(r0)
            r11.append(r9)
            java.lang.String r0 = "'"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            x6.b.f(r10, r11)
            java.lang.Object r0 = r8.f13293d
            monitor-enter(r0)
            java.util.Map<java.lang.String, y6.c$f> r10 = r8.f13291b     // Catch:{ all -> 0x0027 }
            r10.remove(r9)     // Catch:{ all -> 0x0027 }
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return
        L_0x0027:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r9
        L_0x002a:
            r0 = 0
            if (r11 == 0) goto L_0x0041
            java.util.WeakHashMap<k7.c$c, y6.c$d> r0 = r8.f13298i
            java.lang.Object r11 = r0.get(r11)
            r0 = r11
            y6.c$d r0 = (y6.c.d) r0
            if (r0 == 0) goto L_0x0039
            goto L_0x0041
        L_0x0039:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue)."
            r9.<init>(r10)
            throw r9
        L_0x0041:
            java.lang.String r11 = "DartMessenger"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Setting handler for channel '"
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = "'"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            x6.b.f(r11, r1)
            java.lang.Object r11 = r8.f13293d
            monitor-enter(r11)
            java.util.Map<java.lang.String, y6.c$f> r1 = r8.f13291b     // Catch:{ all -> 0x009c }
            y6.c$f r2 = new y6.c$f     // Catch:{ all -> 0x009c }
            r2.<init>(r10, r0)     // Catch:{ all -> 0x009c }
            r1.put(r9, r2)     // Catch:{ all -> 0x009c }
            java.util.Map<java.lang.String, java.util.List<y6.c$b>> r10 = r8.f13292c     // Catch:{ all -> 0x009c }
            java.lang.Object r10 = r10.remove(r9)     // Catch:{ all -> 0x009c }
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x009c }
            if (r10 != 0) goto L_0x0075
            monitor-exit(r11)     // Catch:{ all -> 0x009c }
            return
        L_0x0075:
            monitor-exit(r11)     // Catch:{ all -> 0x009c }
            java.util.Iterator r10 = r10.iterator()
        L_0x007a:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x009b
            java.lang.Object r11 = r10.next()
            y6.c$b r11 = (y6.c.b) r11
            java.util.Map<java.lang.String, y6.c$f> r0 = r8.f13291b
            java.lang.Object r0 = r0.get(r9)
            r3 = r0
            y6.c$f r3 = (y6.c.f) r3
            java.nio.ByteBuffer r4 = r11.f13300a
            int r5 = r11.f13301b
            long r6 = r11.f13302c
            r1 = r8
            r2 = r9
            r1.j(r2, r3, r4, r5, r6)
            goto L_0x007a
        L_0x009b:
            return
        L_0x009c:
            r9 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x009c }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.c.e(java.lang.String, k7.c$a, k7.c$c):void");
    }

    public void f(String str, ByteBuffer byteBuffer) {
        x6.b.f("DartMessenger", "Sending message over channel '" + str + "'");
        b(str, byteBuffer, (c.b) null);
    }

    public void g(int i10, ByteBuffer byteBuffer) {
        x6.b.f("DartMessenger", "Received message reply from Dart.");
        c.b remove = this.f13295f.remove(Integer.valueOf(i10));
        if (remove != null) {
            try {
                x6.b.f("DartMessenger", "Invoking registered callback for reply from Dart.");
                remove.a(byteBuffer);
                if (byteBuffer != null && byteBuffer.isDirect()) {
                    byteBuffer.limit(0);
                }
            } catch (Exception e10) {
                x6.b.c("DartMessenger", "Uncaught exception in binary message reply handler", e10);
            } catch (Error e11) {
                k(e11);
            }
        }
    }

    public void h(String str, ByteBuffer byteBuffer, int i10, long j10) {
        f fVar;
        boolean z9;
        x6.b.f("DartMessenger", "Received message from Dart over channel '" + str + "'");
        synchronized (this.f13293d) {
            fVar = this.f13291b.get(str);
            z9 = this.f13294e.get() && fVar == null;
            if (z9) {
                if (!this.f13292c.containsKey(str)) {
                    this.f13292c.put(str, new LinkedList());
                }
                this.f13292c.get(str).add(new b(byteBuffer, i10, j10));
            }
        }
        if (!z9) {
            j(str, fVar, byteBuffer, i10, j10);
        }
    }
}
