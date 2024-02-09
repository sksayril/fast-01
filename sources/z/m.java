package z;

import b9.j0;
import b9.r1;
import b9.u;
import b9.w;
import g8.s;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.t;

public final class m<T> implements f<T> {

    /* renamed from: k  reason: collision with root package name */
    public static final a f13362k = new a((kotlin.jvm.internal.g) null);
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final Set<String> f13363l = new LinkedHashSet();
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final Object f13364m = new Object();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final r8.a<File> f13365a;

    /* renamed from: b  reason: collision with root package name */
    private final k<T> f13366b;

    /* renamed from: c  reason: collision with root package name */
    private final b<T> f13367c;

    /* renamed from: d  reason: collision with root package name */
    private final j0 f13368d;

    /* renamed from: e  reason: collision with root package name */
    private final e9.b<T> f13369e = e9.d.g(new g(this, (j8.d<? super g>) null));

    /* renamed from: f  reason: collision with root package name */
    private final String f13370f = ".tmp";

    /* renamed from: g  reason: collision with root package name */
    private final g8.g f13371g = i.a(new h(this));
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final e9.k<n<T>> f13372h = e9.n.a(o.f13461a);

    /* renamed from: i  reason: collision with root package name */
    private List<? extends r8.p<? super i<T>, ? super j8.d<? super s>, ? extends Object>> f13373i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public final l<b<T>> f13374j;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final Set<String> a() {
            return m.f13363l;
        }

        public final Object b() {
            return m.f13364m;
        }
    }

    private static abstract class b<T> {

        public static final class a<T> extends b<T> {

            /* renamed from: a  reason: collision with root package name */
            private final n<T> f13375a;

            public a(n<T> nVar) {
                super((kotlin.jvm.internal.g) null);
                this.f13375a = nVar;
            }

            public n<T> a() {
                return this.f13375a;
            }
        }

        /* renamed from: z.m$b$b  reason: collision with other inner class name */
        public static final class C0234b<T> extends b<T> {

            /* renamed from: a  reason: collision with root package name */
            private final r8.p<T, j8.d<? super T>, Object> f13376a;

            /* renamed from: b  reason: collision with root package name */
            private final u<T> f13377b;

            /* renamed from: c  reason: collision with root package name */
            private final n<T> f13378c;

            /* renamed from: d  reason: collision with root package name */
            private final j8.g f13379d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0234b(r8.p<? super T, ? super j8.d<? super T>, ? extends Object> pVar, u<T> uVar, n<T> nVar, j8.g gVar) {
                super((kotlin.jvm.internal.g) null);
                kotlin.jvm.internal.l.e(pVar, "transform");
                kotlin.jvm.internal.l.e(uVar, "ack");
                kotlin.jvm.internal.l.e(gVar, "callerContext");
                this.f13376a = pVar;
                this.f13377b = uVar;
                this.f13378c = nVar;
                this.f13379d = gVar;
            }

            public final u<T> a() {
                return this.f13377b;
            }

            public final j8.g b() {
                return this.f13379d;
            }

            public n<T> c() {
                return this.f13378c;
            }

            public final r8.p<T, j8.d<? super T>, Object> d() {
                return this.f13376a;
            }
        }

        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    private static final class c extends OutputStream {

        /* renamed from: m  reason: collision with root package name */
        private final FileOutputStream f13380m;

        public c(FileOutputStream fileOutputStream) {
            kotlin.jvm.internal.l.e(fileOutputStream, "fileOutputStream");
            this.f13380m = fileOutputStream;
        }

        public void close() {
        }

        public void flush() {
            this.f13380m.flush();
        }

        public void write(int i10) {
            this.f13380m.write(i10);
        }

        public void write(byte[] bArr) {
            kotlin.jvm.internal.l.e(bArr, "b");
            this.f13380m.write(bArr);
        }

        public void write(byte[] bArr, int i10, int i11) {
            kotlin.jvm.internal.l.e(bArr, "bytes");
            this.f13380m.write(bArr, i10, i11);
        }
    }

    static final class d extends kotlin.jvm.internal.m implements r8.l<Throwable, s> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ m<T> f13381m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(m<T> mVar) {
            super(1);
            this.f13381m = mVar;
        }

        public final void b(Throwable th) {
            if (th != null) {
                this.f13381m.f13372h.setValue(new h(th));
            }
            a aVar = m.f13362k;
            Object b10 = aVar.b();
            m<T> mVar = this.f13381m;
            synchronized (b10) {
                aVar.a().remove(mVar.r().getAbsolutePath());
                s sVar = s.f8976a;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return s.f8976a;
        }
    }

    static final class e extends kotlin.jvm.internal.m implements r8.p<b<T>, Throwable, s> {

        /* renamed from: m  reason: collision with root package name */
        public static final e f13382m = new e();

        e() {
            super(2);
        }

        public final void b(b<T> bVar, Throwable th) {
            kotlin.jvm.internal.l.e(bVar, "msg");
            if (bVar instanceof b.C0234b) {
                u a10 = ((b.C0234b) bVar).a();
                if (th == null) {
                    th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                a10.o(th);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((b) obj, (Throwable) obj2);
            return s.f8976a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$actor$3", f = "SingleProcessDataStore.kt", l = {239, 242}, m = "invokeSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.k implements r8.p<b<T>, j8.d<? super s>, Object> {

        /* renamed from: m  reason: collision with root package name */
        int f13383m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f13384n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ m<T> f13385o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(m<T> mVar, j8.d<? super f> dVar) {
            super(2, dVar);
            this.f13385o = mVar;
        }

        /* renamed from: b */
        public final Object invoke(b<T> bVar, j8.d<? super s> dVar) {
            return ((f) create(bVar, dVar)).invokeSuspend(s.f8976a);
        }

        public final j8.d<s> create(Object obj, j8.d<?> dVar) {
            f fVar = new f(this.f13385o, dVar);
            fVar.f13384n = obj;
            return fVar;
        }

        public final Object invokeSuspend(Object obj) {
            Object d10 = d.d();
            int i10 = this.f13383m;
            if (i10 == 0) {
                g8.n.b(obj);
                b bVar = (b) this.f13384n;
                if (bVar instanceof b.a) {
                    this.f13383m = 1;
                    if (this.f13385o.s((b.a) bVar, this) == d10) {
                        return d10;
                    }
                } else if (bVar instanceof b.C0234b) {
                    this.f13383m = 2;
                    if (this.f13385o.t((b.C0234b) bVar, this) == d10) {
                        return d10;
                    }
                }
            } else if (i10 == 1 || i10 == 2) {
                g8.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return s.f8976a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$data$1", f = "SingleProcessDataStore.kt", l = {117}, m = "invokeSuspend")
    static final class g extends kotlin.coroutines.jvm.internal.k implements r8.p<e9.c<? super T>, j8.d<? super s>, Object> {

        /* renamed from: m  reason: collision with root package name */
        int f13386m;

        /* renamed from: n  reason: collision with root package name */
        private /* synthetic */ Object f13387n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ m<T> f13388o;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", f = "SingleProcessDataStore.kt", l = {}, m = "invokeSuspend")
        static final class a extends kotlin.coroutines.jvm.internal.k implements r8.p<n<T>, j8.d<? super Boolean>, Object> {

            /* renamed from: m  reason: collision with root package name */
            int f13389m;

            /* renamed from: n  reason: collision with root package name */
            /* synthetic */ Object f13390n;

            /* renamed from: o  reason: collision with root package name */
            final /* synthetic */ n<T> f13391o;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(n<T> nVar, j8.d<? super a> dVar) {
                super(2, dVar);
                this.f13391o = nVar;
            }

            /* renamed from: b */
            public final Object invoke(n<T> nVar, j8.d<? super Boolean> dVar) {
                return ((a) create(nVar, dVar)).invokeSuspend(s.f8976a);
            }

            public final j8.d<s> create(Object obj, j8.d<?> dVar) {
                a aVar = new a(this.f13391o, dVar);
                aVar.f13390n = obj;
                return aVar;
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = d.d();
                if (this.f13389m == 0) {
                    g8.n.b(obj);
                    n<T> nVar = (n) this.f13390n;
                    n<T> nVar2 = this.f13391o;
                    boolean z9 = false;
                    if (!(nVar2 instanceof c) && !(nVar2 instanceof h) && nVar == nVar2) {
                        z9 = true;
                    }
                    return kotlin.coroutines.jvm.internal.b.a(z9);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public static final class b implements e9.b<T> {

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ e9.b f13392m;

            public static final class a implements e9.c<n<T>> {

                /* renamed from: m  reason: collision with root package name */
                final /* synthetic */ e9.c f13393m;

                @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", f = "SingleProcessDataStore.kt", l = {137}, m = "emit")
                /* renamed from: z.m$g$b$a$a  reason: collision with other inner class name */
                public static final class C0235a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: m  reason: collision with root package name */
                    /* synthetic */ Object f13394m;

                    /* renamed from: n  reason: collision with root package name */
                    int f13395n;

                    /* renamed from: o  reason: collision with root package name */
                    final /* synthetic */ a f13396o;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C0235a(a aVar, j8.d dVar) {
                        super(dVar);
                        this.f13396o = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f13394m = obj;
                        this.f13395n |= Integer.MIN_VALUE;
                        return this.f13396o.emit((Object) null, this);
                    }
                }

                public a(e9.c cVar) {
                    this.f13393m = cVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Object emit(java.lang.Object r5, j8.d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof z.m.g.b.a.C0235a
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        z.m$g$b$a$a r0 = (z.m.g.b.a.C0235a) r0
                        int r1 = r0.f13395n
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f13395n = r1
                        goto L_0x0018
                    L_0x0013:
                        z.m$g$b$a$a r0 = new z.m$g$b$a$a
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.f13394m
                        java.lang.Object r1 = k8.d.d()
                        int r2 = r0.f13395n
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        g8.n.b(r6)
                        goto L_0x0053
                    L_0x0029:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x0031:
                        g8.n.b(r6)
                        e9.c r6 = r4.f13393m
                        z.n r5 = (z.n) r5
                        boolean r2 = r5 instanceof z.j
                        if (r2 != 0) goto L_0x0073
                        boolean r2 = r5 instanceof z.h
                        if (r2 != 0) goto L_0x006c
                        boolean r2 = r5 instanceof z.c
                        if (r2 == 0) goto L_0x0056
                        z.c r5 = (z.c) r5
                        java.lang.Object r5 = r5.b()
                        r0.f13395n = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L_0x0053
                        return r1
                    L_0x0053:
                        g8.s r5 = g8.s.f8976a
                        return r5
                    L_0x0056:
                        boolean r5 = r5 instanceof z.o
                        if (r5 == 0) goto L_0x0066
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                        java.lang.String r6 = r6.toString()
                        r5.<init>(r6)
                        throw r5
                    L_0x0066:
                        g8.k r5 = new g8.k
                        r5.<init>()
                        throw r5
                    L_0x006c:
                        z.h r5 = (z.h) r5
                        java.lang.Throwable r5 = r5.a()
                        throw r5
                    L_0x0073:
                        z.j r5 = (z.j) r5
                        java.lang.Throwable r5 = r5.a()
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: z.m.g.b.a.emit(java.lang.Object, j8.d):java.lang.Object");
                }
            }

            public b(e9.b bVar) {
                this.f13392m = bVar;
            }

            public Object a(e9.c cVar, j8.d dVar) {
                Object a10 = this.f13392m.a(new a(cVar), dVar);
                return a10 == d.d() ? a10 : s.f8976a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(m<T> mVar, j8.d<? super g> dVar) {
            super(2, dVar);
            this.f13388o = mVar;
        }

        public final j8.d<s> create(Object obj, j8.d<?> dVar) {
            g gVar = new g(this.f13388o, dVar);
            gVar.f13387n = obj;
            return gVar;
        }

        public final Object invoke(e9.c<? super T> cVar, j8.d<? super s> dVar) {
            return ((g) create(cVar, dVar)).invokeSuspend(s.f8976a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d10 = d.d();
            int i10 = this.f13386m;
            if (i10 == 0) {
                g8.n.b(obj);
                e9.c cVar = (e9.c) this.f13387n;
                n nVar = (n) this.f13388o.f13372h.getValue();
                if (!(nVar instanceof c)) {
                    this.f13388o.f13374j.e(new b.a(nVar));
                }
                b bVar = new b(e9.d.c(this.f13388o.f13372h, new a(nVar, (j8.d<? super a>) null)));
                this.f13386m = 1;
                if (e9.d.d(cVar, bVar, this) == d10) {
                    return d10;
                }
            } else if (i10 == 1) {
                g8.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return s.f8976a;
        }
    }

    static final class h extends kotlin.jvm.internal.m implements r8.a<File> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ m<T> f13397m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(m<T> mVar) {
            super(0);
            this.f13397m = mVar;
        }

        /* renamed from: b */
        public final File invoke() {
            File file = (File) this.f13397m.f13365a.invoke();
            String absolutePath = file.getAbsolutePath();
            a aVar = m.f13362k;
            synchronized (aVar.b()) {
                if (!aVar.a().contains(absolutePath)) {
                    Set<String> a10 = aVar.a();
                    kotlin.jvm.internal.l.d(absolutePath, "it");
                    a10.add(absolutePath);
                } else {
                    throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                }
            }
            return file;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {276, 281, 284}, m = "handleUpdate")
    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: m  reason: collision with root package name */
        Object f13398m;

        /* renamed from: n  reason: collision with root package name */
        Object f13399n;

        /* renamed from: o  reason: collision with root package name */
        Object f13400o;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f13401p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ m<T> f13402q;

        /* renamed from: r  reason: collision with root package name */
        int f13403r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(m<T> mVar, j8.d<? super i> dVar) {
            super(dVar);
            this.f13402q = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f13401p = obj;
            this.f13403r |= Integer.MIN_VALUE;
            return this.f13402q.t((b.C0234b) null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {322, 348, 505}, m = "readAndInit")
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: m  reason: collision with root package name */
        Object f13404m;

        /* renamed from: n  reason: collision with root package name */
        Object f13405n;

        /* renamed from: o  reason: collision with root package name */
        Object f13406o;

        /* renamed from: p  reason: collision with root package name */
        Object f13407p;

        /* renamed from: q  reason: collision with root package name */
        Object f13408q;

        /* renamed from: r  reason: collision with root package name */
        Object f13409r;

        /* renamed from: s  reason: collision with root package name */
        /* synthetic */ Object f13410s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ m<T> f13411t;

        /* renamed from: u  reason: collision with root package name */
        int f13412u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(m<T> mVar, j8.d<? super j> dVar) {
            super(dVar);
            this.f13411t = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f13410s = obj;
            this.f13412u |= Integer.MIN_VALUE;
            return this.f13411t.u(this);
        }
    }

    public static final class k implements i<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k9.a f13413a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t f13414b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.u<T> f13415c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m<T> f13416d;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1", f = "SingleProcessDataStore.kt", l = {503, 337, 339}, m = "updateData")
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: m  reason: collision with root package name */
            Object f13417m;

            /* renamed from: n  reason: collision with root package name */
            Object f13418n;

            /* renamed from: o  reason: collision with root package name */
            Object f13419o;

            /* renamed from: p  reason: collision with root package name */
            Object f13420p;

            /* renamed from: q  reason: collision with root package name */
            Object f13421q;

            /* renamed from: r  reason: collision with root package name */
            /* synthetic */ Object f13422r;

            /* renamed from: s  reason: collision with root package name */
            final /* synthetic */ k f13423s;

            /* renamed from: t  reason: collision with root package name */
            int f13424t;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(k kVar, j8.d<? super a> dVar) {
                super(dVar);
                this.f13423s = kVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f13422r = obj;
                this.f13424t |= Integer.MIN_VALUE;
                return this.f13423s.a((r8.p) null, this);
            }
        }

        k(k9.a aVar, t tVar, kotlin.jvm.internal.u<T> uVar, m<T> mVar) {
            this.f13413a = aVar;
            this.f13414b = tVar;
            this.f13415c = uVar;
            this.f13416d = mVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x009a A[Catch:{ all -> 0x00df }] */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00ba A[Catch:{ all -> 0x0056 }] */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00d0 A[Catch:{ all -> 0x003b }] */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x00d7 A[SYNTHETIC, Splitter:B:47:0x00d7] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a(r8.p<? super T, ? super j8.d<? super T>, ? extends java.lang.Object> r11, j8.d<? super T> r12) {
            /*
                r10 = this;
                boolean r0 = r12 instanceof z.m.k.a
                if (r0 == 0) goto L_0x0013
                r0 = r12
                z.m$k$a r0 = (z.m.k.a) r0
                int r1 = r0.f13424t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f13424t = r1
                goto L_0x0018
            L_0x0013:
                z.m$k$a r0 = new z.m$k$a
                r0.<init>(r10, r12)
            L_0x0018:
                java.lang.Object r12 = r0.f13422r
                java.lang.Object r1 = k8.d.d()
                int r2 = r0.f13424t
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L_0x0076
                if (r2 == r5) goto L_0x005a
                if (r2 == r4) goto L_0x0046
                if (r2 != r3) goto L_0x003e
                java.lang.Object r11 = r0.f13419o
                java.lang.Object r1 = r0.f13418n
                kotlin.jvm.internal.u r1 = (kotlin.jvm.internal.u) r1
                java.lang.Object r0 = r0.f13417m
                k9.a r0 = (k9.a) r0
                g8.n.b(r12)     // Catch:{ all -> 0x003b }
                goto L_0x00cc
            L_0x003b:
                r11 = move-exception
                goto L_0x00e1
            L_0x003e:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L_0x0046:
                java.lang.Object r11 = r0.f13419o
                z.m r11 = (z.m) r11
                java.lang.Object r2 = r0.f13418n
                kotlin.jvm.internal.u r2 = (kotlin.jvm.internal.u) r2
                java.lang.Object r4 = r0.f13417m
                k9.a r4 = (k9.a) r4
                g8.n.b(r12)     // Catch:{ all -> 0x0056 }
                goto L_0x00b2
            L_0x0056:
                r11 = move-exception
                r0 = r4
                goto L_0x00e1
            L_0x005a:
                java.lang.Object r11 = r0.f13421q
                z.m r11 = (z.m) r11
                java.lang.Object r2 = r0.f13420p
                kotlin.jvm.internal.u r2 = (kotlin.jvm.internal.u) r2
                java.lang.Object r5 = r0.f13419o
                kotlin.jvm.internal.t r5 = (kotlin.jvm.internal.t) r5
                java.lang.Object r7 = r0.f13418n
                k9.a r7 = (k9.a) r7
                java.lang.Object r8 = r0.f13417m
                r8.p r8 = (r8.p) r8
                g8.n.b(r12)
                r12 = r7
                r9 = r8
                r8 = r11
                r11 = r9
                goto L_0x0096
            L_0x0076:
                g8.n.b(r12)
                k9.a r12 = r10.f13413a
                kotlin.jvm.internal.t r2 = r10.f13414b
                kotlin.jvm.internal.u<T> r7 = r10.f13415c
                z.m<T> r8 = r10.f13416d
                r0.f13417m = r11
                r0.f13418n = r12
                r0.f13419o = r2
                r0.f13420p = r7
                r0.f13421q = r8
                r0.f13424t = r5
                java.lang.Object r5 = r12.b(r6, r0)
                if (r5 != r1) goto L_0x0094
                return r1
            L_0x0094:
                r5 = r2
                r2 = r7
            L_0x0096:
                boolean r5 = r5.f11077m     // Catch:{ all -> 0x00df }
                if (r5 != 0) goto L_0x00d7
                T r5 = r2.f11078m     // Catch:{ all -> 0x00df }
                r0.f13417m = r12     // Catch:{ all -> 0x00df }
                r0.f13418n = r2     // Catch:{ all -> 0x00df }
                r0.f13419o = r8     // Catch:{ all -> 0x00df }
                r0.f13420p = r6     // Catch:{ all -> 0x00df }
                r0.f13421q = r6     // Catch:{ all -> 0x00df }
                r0.f13424t = r4     // Catch:{ all -> 0x00df }
                java.lang.Object r11 = r11.invoke(r5, r0)     // Catch:{ all -> 0x00df }
                if (r11 != r1) goto L_0x00af
                return r1
            L_0x00af:
                r4 = r12
                r12 = r11
                r11 = r8
            L_0x00b2:
                T r5 = r2.f11078m     // Catch:{ all -> 0x0056 }
                boolean r5 = kotlin.jvm.internal.l.a(r12, r5)     // Catch:{ all -> 0x0056 }
                if (r5 != 0) goto L_0x00d0
                r0.f13417m = r4     // Catch:{ all -> 0x0056 }
                r0.f13418n = r2     // Catch:{ all -> 0x0056 }
                r0.f13419o = r12     // Catch:{ all -> 0x0056 }
                r0.f13424t = r3     // Catch:{ all -> 0x0056 }
                java.lang.Object r11 = r11.A(r12, r0)     // Catch:{ all -> 0x0056 }
                if (r11 != r1) goto L_0x00c9
                return r1
            L_0x00c9:
                r11 = r12
                r1 = r2
                r0 = r4
            L_0x00cc:
                r1.f11078m = r11     // Catch:{ all -> 0x003b }
                r2 = r1
                goto L_0x00d1
            L_0x00d0:
                r0 = r4
            L_0x00d1:
                T r11 = r2.f11078m     // Catch:{ all -> 0x003b }
                r0.a(r6)
                return r11
            L_0x00d7:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00df }
                java.lang.String r0 = "InitializerApi.updateData should not be called after initialization is complete."
                r11.<init>(r0)     // Catch:{ all -> 0x00df }
                throw r11     // Catch:{ all -> 0x00df }
            L_0x00df:
                r11 = move-exception
                r0 = r12
            L_0x00e1:
                r0.a(r6)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: z.m.k.a(r8.p, j8.d):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {302}, m = "readAndInitOrPropagateAndThrowFailure")
    static final class l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: m  reason: collision with root package name */
        Object f13425m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f13426n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ m<T> f13427o;

        /* renamed from: p  reason: collision with root package name */
        int f13428p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(m<T> mVar, j8.d<? super l> dVar) {
            super(dVar);
            this.f13427o = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f13426n = obj;
            this.f13428p |= Integer.MIN_VALUE;
            return this.f13427o.v(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {311}, m = "readAndInitOrPropagateFailure")
    /* renamed from: z.m$m  reason: collision with other inner class name */
    static final class C0236m extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: m  reason: collision with root package name */
        Object f13429m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f13430n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ m<T> f13431o;

        /* renamed from: p  reason: collision with root package name */
        int f13432p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0236m(m<T> mVar, j8.d<? super C0236m> dVar) {
            super(dVar);
            this.f13431o = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f13430n = obj;
            this.f13432p |= Integer.MIN_VALUE;
            return this.f13431o.w(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {381}, m = "readData")
    static final class n extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: m  reason: collision with root package name */
        Object f13433m;

        /* renamed from: n  reason: collision with root package name */
        Object f13434n;

        /* renamed from: o  reason: collision with root package name */
        Object f13435o;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f13436p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ m<T> f13437q;

        /* renamed from: r  reason: collision with root package name */
        int f13438r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(m<T> mVar, j8.d<? super n> dVar) {
            super(dVar);
            this.f13437q = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f13436p = obj;
            this.f13438r |= Integer.MIN_VALUE;
            return this.f13437q.x(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {359, 362, 365}, m = "readDataOrHandleCorruption")
    static final class o extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: m  reason: collision with root package name */
        Object f13439m;

        /* renamed from: n  reason: collision with root package name */
        Object f13440n;

        /* renamed from: o  reason: collision with root package name */
        /* synthetic */ Object f13441o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ m<T> f13442p;

        /* renamed from: q  reason: collision with root package name */
        int f13443q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(m<T> mVar, j8.d<? super o> dVar) {
            super(dVar);
            this.f13442p = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f13441o = obj;
            this.f13443q |= Integer.MIN_VALUE;
            return this.f13442p.y(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {402, 410}, m = "transformAndWrite")
    static final class p extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: m  reason: collision with root package name */
        Object f13444m;

        /* renamed from: n  reason: collision with root package name */
        Object f13445n;

        /* renamed from: o  reason: collision with root package name */
        Object f13446o;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f13447p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ m<T> f13448q;

        /* renamed from: r  reason: collision with root package name */
        int f13449r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(m<T> mVar, j8.d<? super p> dVar) {
            super(dVar);
            this.f13448q = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f13447p = obj;
            this.f13449r |= Integer.MIN_VALUE;
            return this.f13448q.z((r8.p) null, (j8.g) null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", f = "SingleProcessDataStore.kt", l = {402}, m = "invokeSuspend")
    static final class q extends kotlin.coroutines.jvm.internal.k implements r8.p<j0, j8.d<? super T>, Object> {

        /* renamed from: m  reason: collision with root package name */
        int f13450m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ r8.p<T, j8.d<? super T>, Object> f13451n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ T f13452o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(r8.p<? super T, ? super j8.d<? super T>, ? extends Object> pVar, T t9, j8.d<? super q> dVar) {
            super(2, dVar);
            this.f13451n = pVar;
            this.f13452o = t9;
        }

        public final j8.d<s> create(Object obj, j8.d<?> dVar) {
            return new q(this.f13451n, this.f13452o, dVar);
        }

        public final Object invoke(j0 j0Var, j8.d<? super T> dVar) {
            return ((q) create(j0Var, dVar)).invokeSuspend(s.f8976a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d10 = d.d();
            int i10 = this.f13450m;
            if (i10 == 0) {
                g8.n.b(obj);
                r8.p<T, j8.d<? super T>, Object> pVar = this.f13451n;
                T t9 = this.f13452o;
                this.f13450m = 1;
                obj = pVar.invoke(t9, this);
                if (obj == d10) {
                    return d10;
                }
            } else if (i10 == 1) {
                g8.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {426}, m = "writeData$datastore_core")
    static final class r extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: m  reason: collision with root package name */
        Object f13453m;

        /* renamed from: n  reason: collision with root package name */
        Object f13454n;

        /* renamed from: o  reason: collision with root package name */
        Object f13455o;

        /* renamed from: p  reason: collision with root package name */
        Object f13456p;

        /* renamed from: q  reason: collision with root package name */
        Object f13457q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f13458r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ m<T> f13459s;

        /* renamed from: t  reason: collision with root package name */
        int f13460t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(m<T> mVar, j8.d<? super r> dVar) {
            super(dVar);
            this.f13459s = mVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f13458r = obj;
            this.f13460t |= Integer.MIN_VALUE;
            return this.f13459s.A(null, this);
        }
    }

    public m(r8.a<? extends File> aVar, k<T> kVar, List<? extends r8.p<? super i<T>, ? super j8.d<? super s>, ? extends Object>> list, b<T> bVar, j0 j0Var) {
        kotlin.jvm.internal.l.e(aVar, "produceFile");
        kotlin.jvm.internal.l.e(kVar, "serializer");
        kotlin.jvm.internal.l.e(list, "initTasksList");
        kotlin.jvm.internal.l.e(bVar, "corruptionHandler");
        kotlin.jvm.internal.l.e(j0Var, "scope");
        this.f13365a = aVar;
        this.f13366b = kVar;
        this.f13367c = bVar;
        this.f13368d = j0Var;
        this.f13373i = v.A(list);
        this.f13374j = new l<>(j0Var, new d(this), e.f13382m, new f(this, (j8.d<? super f>) null));
    }

    private final void q(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException(kotlin.jvm.internal.l.k("Unable to create parent directories of ", file));
            }
        }
    }

    /* access modifiers changed from: private */
    public final File r() {
        return (File) this.f13371g.getValue();
    }

    /* access modifiers changed from: private */
    public final Object s(b.a<T> aVar, j8.d<? super s> dVar) {
        n<T> value = this.f13372h.getValue();
        if (!(value instanceof c)) {
            if (value instanceof j) {
                if (value == aVar.a()) {
                    Object w9 = w(dVar);
                    return w9 == d.d() ? w9 : s.f8976a;
                }
            } else if (kotlin.jvm.internal.l.a(value, o.f13461a)) {
                Object w10 = w(dVar);
                return w10 == d.d() ? w10 : s.f8976a;
            } else if (value instanceof h) {
                throw new IllegalStateException("Can't read in final state.".toString());
            }
        }
        return s.f8976a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t(z.m.b.C0234b<T> r9, j8.d<? super g8.s> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof z.m.i
            if (r0 == 0) goto L_0x0013
            r0 = r10
            z.m$i r0 = (z.m.i) r0
            int r1 = r0.f13403r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13403r = r1
            goto L_0x0018
        L_0x0013:
            z.m$i r0 = new z.m$i
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f13401p
            java.lang.Object r1 = k8.d.d()
            int r2 = r0.f13403r
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0055
            if (r2 == r5) goto L_0x004a
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r9 = r0.f13398m
            b9.u r9 = (b9.u) r9
            goto L_0x004e
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0038:
            java.lang.Object r9 = r0.f13400o
            b9.u r9 = (b9.u) r9
            java.lang.Object r2 = r0.f13399n
            z.m r2 = (z.m) r2
            java.lang.Object r4 = r0.f13398m
            z.m$b$b r4 = (z.m.b.C0234b) r4
            g8.n.b(r10)     // Catch:{ all -> 0x0052 }
            r10 = r9
            r9 = r4
            goto L_0x00a0
        L_0x004a:
            java.lang.Object r9 = r0.f13398m
            b9.u r9 = (b9.u) r9
        L_0x004e:
            g8.n.b(r10)     // Catch:{ all -> 0x0052 }
            goto L_0x00b8
        L_0x0052:
            r10 = move-exception
            goto L_0x00d9
        L_0x0055:
            g8.n.b(r10)
            b9.u r10 = r9.a()
            g8.m$a r2 = g8.m.f8970m     // Catch:{ all -> 0x00d5 }
            e9.k<z.n<T>> r2 = r8.f13372h     // Catch:{ all -> 0x00d5 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x00d5 }
            z.n r2 = (z.n) r2     // Catch:{ all -> 0x00d5 }
            boolean r6 = r2 instanceof z.c     // Catch:{ all -> 0x00d5 }
            if (r6 == 0) goto L_0x0081
            r8.p r2 = r9.d()     // Catch:{ all -> 0x00d5 }
            j8.g r9 = r9.b()     // Catch:{ all -> 0x00d5 }
            r0.f13398m = r10     // Catch:{ all -> 0x00d5 }
            r0.f13403r = r5     // Catch:{ all -> 0x00d5 }
            java.lang.Object r9 = r8.z(r2, r9, r0)     // Catch:{ all -> 0x00d5 }
            if (r9 != r1) goto L_0x007d
            return r1
        L_0x007d:
            r7 = r10
            r10 = r9
            r9 = r7
            goto L_0x00b8
        L_0x0081:
            boolean r6 = r2 instanceof z.j     // Catch:{ all -> 0x00d5 }
            if (r6 == 0) goto L_0x0086
            goto L_0x0088
        L_0x0086:
            boolean r5 = r2 instanceof z.o     // Catch:{ all -> 0x00d5 }
        L_0x0088:
            if (r5 == 0) goto L_0x00c4
            z.n r5 = r9.c()     // Catch:{ all -> 0x00d5 }
            if (r2 != r5) goto L_0x00bd
            r0.f13398m = r9     // Catch:{ all -> 0x00d5 }
            r0.f13399n = r8     // Catch:{ all -> 0x00d5 }
            r0.f13400o = r10     // Catch:{ all -> 0x00d5 }
            r0.f13403r = r4     // Catch:{ all -> 0x00d5 }
            java.lang.Object r2 = r8.v(r0)     // Catch:{ all -> 0x00d5 }
            if (r2 != r1) goto L_0x009f
            return r1
        L_0x009f:
            r2 = r8
        L_0x00a0:
            r8.p r4 = r9.d()     // Catch:{ all -> 0x00d5 }
            j8.g r9 = r9.b()     // Catch:{ all -> 0x00d5 }
            r0.f13398m = r10     // Catch:{ all -> 0x00d5 }
            r5 = 0
            r0.f13399n = r5     // Catch:{ all -> 0x00d5 }
            r0.f13400o = r5     // Catch:{ all -> 0x00d5 }
            r0.f13403r = r3     // Catch:{ all -> 0x00d5 }
            java.lang.Object r9 = r2.z(r4, r9, r0)     // Catch:{ all -> 0x00d5 }
            if (r9 != r1) goto L_0x007d
            return r1
        L_0x00b8:
            java.lang.Object r10 = g8.m.a(r10)     // Catch:{ all -> 0x0052 }
            goto L_0x00e3
        L_0x00bd:
            z.j r2 = (z.j) r2     // Catch:{ all -> 0x00d5 }
            java.lang.Throwable r9 = r2.a()     // Catch:{ all -> 0x00d5 }
            throw r9     // Catch:{ all -> 0x00d5 }
        L_0x00c4:
            boolean r9 = r2 instanceof z.h     // Catch:{ all -> 0x00d5 }
            if (r9 == 0) goto L_0x00cf
            z.h r2 = (z.h) r2     // Catch:{ all -> 0x00d5 }
            java.lang.Throwable r9 = r2.a()     // Catch:{ all -> 0x00d5 }
            throw r9     // Catch:{ all -> 0x00d5 }
        L_0x00cf:
            g8.k r9 = new g8.k     // Catch:{ all -> 0x00d5 }
            r9.<init>()     // Catch:{ all -> 0x00d5 }
            throw r9     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x00d9:
            g8.m$a r0 = g8.m.f8970m
            java.lang.Object r10 = g8.n.a(r10)
            java.lang.Object r10 = g8.m.a(r10)
        L_0x00e3:
            b9.w.c(r9, r10)
            g8.s r9 = g8.s.f8976a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: z.m.t(z.m$b$b, j8.d):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0114 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object u(j8.d<? super g8.s> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof z.m.j
            if (r0 == 0) goto L_0x0013
            r0 = r14
            z.m$j r0 = (z.m.j) r0
            int r1 = r0.f13412u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13412u = r1
            goto L_0x0018
        L_0x0013:
            z.m$j r0 = new z.m$j
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f13410s
            java.lang.Object r1 = k8.d.d()
            int r2 = r0.f13412u
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x007b
            if (r2 == r6) goto L_0x0067
            if (r2 == r4) goto L_0x004a
            if (r2 != r3) goto L_0x0042
            java.lang.Object r1 = r0.f13407p
            k9.a r1 = (k9.a) r1
            java.lang.Object r2 = r0.f13406o
            kotlin.jvm.internal.t r2 = (kotlin.jvm.internal.t) r2
            java.lang.Object r3 = r0.f13405n
            kotlin.jvm.internal.u r3 = (kotlin.jvm.internal.u) r3
            java.lang.Object r0 = r0.f13404m
            z.m r0 = (z.m) r0
            g8.n.b(r14)
            goto L_0x0117
        L_0x0042:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x004a:
            java.lang.Object r2 = r0.f13409r
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r8 = r0.f13408q
            z.m$k r8 = (z.m.k) r8
            java.lang.Object r9 = r0.f13407p
            kotlin.jvm.internal.t r9 = (kotlin.jvm.internal.t) r9
            java.lang.Object r10 = r0.f13406o
            kotlin.jvm.internal.u r10 = (kotlin.jvm.internal.u) r10
            java.lang.Object r11 = r0.f13405n
            k9.a r11 = (k9.a) r11
            java.lang.Object r12 = r0.f13404m
            z.m r12 = (z.m) r12
            g8.n.b(r14)
            goto L_0x00d8
        L_0x0067:
            java.lang.Object r2 = r0.f13407p
            kotlin.jvm.internal.u r2 = (kotlin.jvm.internal.u) r2
            java.lang.Object r8 = r0.f13406o
            kotlin.jvm.internal.u r8 = (kotlin.jvm.internal.u) r8
            java.lang.Object r9 = r0.f13405n
            k9.a r9 = (k9.a) r9
            java.lang.Object r10 = r0.f13404m
            z.m r10 = (z.m) r10
            g8.n.b(r14)
            goto L_0x00b8
        L_0x007b:
            g8.n.b(r14)
            e9.k<z.n<T>> r14 = r13.f13372h
            java.lang.Object r14 = r14.getValue()
            z.o r2 = z.o.f13461a
            boolean r14 = kotlin.jvm.internal.l.a(r14, r2)
            if (r14 != 0) goto L_0x0099
            e9.k<z.n<T>> r14 = r13.f13372h
            java.lang.Object r14 = r14.getValue()
            boolean r14 = r14 instanceof z.j
            if (r14 == 0) goto L_0x0097
            goto L_0x0099
        L_0x0097:
            r14 = 0
            goto L_0x009a
        L_0x0099:
            r14 = 1
        L_0x009a:
            if (r14 == 0) goto L_0x0136
            k9.a r9 = k9.c.b(r5, r6, r7)
            kotlin.jvm.internal.u r2 = new kotlin.jvm.internal.u
            r2.<init>()
            r0.f13404m = r13
            r0.f13405n = r9
            r0.f13406o = r2
            r0.f13407p = r2
            r0.f13412u = r6
            java.lang.Object r14 = r13.y(r0)
            if (r14 != r1) goto L_0x00b6
            return r1
        L_0x00b6:
            r10 = r13
            r8 = r2
        L_0x00b8:
            r2.f11078m = r14
            kotlin.jvm.internal.t r14 = new kotlin.jvm.internal.t
            r14.<init>()
            z.m$k r2 = new z.m$k
            r2.<init>(r9, r14, r8, r10)
            java.util.List<? extends r8.p<? super z.i<T>, ? super j8.d<? super g8.s>, ? extends java.lang.Object>> r11 = r10.f13373i
            if (r11 != 0) goto L_0x00ce
            r2 = r1
            r1 = r9
            r9 = r14
            r14 = r0
            r0 = r10
            goto L_0x00fe
        L_0x00ce:
            java.util.Iterator r11 = r11.iterator()
            r12 = r10
            r10 = r8
            r8 = r2
            r2 = r11
            r11 = r9
            r9 = r14
        L_0x00d8:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto L_0x00f9
            java.lang.Object r14 = r2.next()
            r8.p r14 = (r8.p) r14
            r0.f13404m = r12
            r0.f13405n = r11
            r0.f13406o = r10
            r0.f13407p = r9
            r0.f13408q = r8
            r0.f13409r = r2
            r0.f13412u = r4
            java.lang.Object r14 = r14.invoke(r8, r0)
            if (r14 != r1) goto L_0x00d8
            return r1
        L_0x00f9:
            r14 = r0
            r2 = r1
            r8 = r10
            r1 = r11
            r0 = r12
        L_0x00fe:
            r0.f13373i = r7
            r14.f13404m = r0
            r14.f13405n = r8
            r14.f13406o = r9
            r14.f13407p = r1
            r14.f13408q = r7
            r14.f13409r = r7
            r14.f13412u = r3
            java.lang.Object r14 = r1.b(r7, r14)
            if (r14 != r2) goto L_0x0115
            return r2
        L_0x0115:
            r3 = r8
            r2 = r9
        L_0x0117:
            r2.f11077m = r6     // Catch:{ all -> 0x0131 }
            g8.s r14 = g8.s.f8976a     // Catch:{ all -> 0x0131 }
            r1.a(r7)
            e9.k<z.n<T>> r0 = r0.f13372h
            z.c r1 = new z.c
            T r2 = r3.f11078m
            if (r2 == 0) goto L_0x012a
            int r5 = r2.hashCode()
        L_0x012a:
            r1.<init>(r2, r5)
            r0.setValue(r1)
            return r14
        L_0x0131:
            r14 = move-exception
            r1.a(r7)
            throw r14
        L_0x0136:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: z.m.u(j8.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(j8.d<? super g8.s> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof z.m.l
            if (r0 == 0) goto L_0x0013
            r0 = r5
            z.m$l r0 = (z.m.l) r0
            int r1 = r0.f13428p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13428p = r1
            goto L_0x0018
        L_0x0013:
            z.m$l r0 = new z.m$l
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f13426n
            java.lang.Object r1 = k8.d.d()
            int r2 = r0.f13428p
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r0 = r0.f13425m
            z.m r0 = (z.m) r0
            g8.n.b(r5)     // Catch:{ all -> 0x002d }
            goto L_0x0045
        L_0x002d:
            r5 = move-exception
            goto L_0x004a
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            g8.n.b(r5)
            r0.f13425m = r4     // Catch:{ all -> 0x0048 }
            r0.f13428p = r3     // Catch:{ all -> 0x0048 }
            java.lang.Object r5 = r4.u(r0)     // Catch:{ all -> 0x0048 }
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            g8.s r5 = g8.s.f8976a
            return r5
        L_0x0048:
            r5 = move-exception
            r0 = r4
        L_0x004a:
            e9.k<z.n<T>> r0 = r0.f13372h
            z.j r1 = new z.j
            r1.<init>(r5)
            r0.setValue(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z.m.v(j8.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object w(j8.d<? super g8.s> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof z.m.C0236m
            if (r0 == 0) goto L_0x0013
            r0 = r5
            z.m$m r0 = (z.m.C0236m) r0
            int r1 = r0.f13432p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13432p = r1
            goto L_0x0018
        L_0x0013:
            z.m$m r0 = new z.m$m
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f13430n
            java.lang.Object r1 = k8.d.d()
            int r2 = r0.f13432p
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r0 = r0.f13429m
            z.m r0 = (z.m) r0
            g8.n.b(r5)     // Catch:{ all -> 0x002d }
            goto L_0x0051
        L_0x002d:
            r5 = move-exception
            goto L_0x0047
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            g8.n.b(r5)
            r0.f13429m = r4     // Catch:{ all -> 0x0045 }
            r0.f13432p = r3     // Catch:{ all -> 0x0045 }
            java.lang.Object r5 = r4.u(r0)     // Catch:{ all -> 0x0045 }
            if (r5 != r1) goto L_0x0051
            return r1
        L_0x0045:
            r5 = move-exception
            r0 = r4
        L_0x0047:
            e9.k<z.n<T>> r0 = r0.f13372h
            z.j r1 = new z.j
            r1.<init>(r5)
            r0.setValue(r1)
        L_0x0051:
            g8.s r5 = g8.s.f8976a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z.m.w(j8.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0064, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0069, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        p8.a.a(r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006d, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:24:0x0060, B:30:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object x(j8.d<? super T> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof z.m.n
            if (r0 == 0) goto L_0x0013
            r0 = r6
            z.m$n r0 = (z.m.n) r0
            int r1 = r0.f13438r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13438r = r1
            goto L_0x0018
        L_0x0013:
            z.m$n r0 = new z.m$n
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f13436p
            java.lang.Object r1 = k8.d.d()
            int r2 = r0.f13438r
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r1 = r0.f13435o
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f13434n
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r0 = r0.f13433m
            z.m r0 = (z.m) r0
            g8.n.b(r6)     // Catch:{ all -> 0x0035 }
            goto L_0x0060
        L_0x0035:
            r6 = move-exception
            goto L_0x0068
        L_0x0037:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003f:
            g8.n.b(r6)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x006e }
            java.io.File r6 = r5.r()     // Catch:{ FileNotFoundException -> 0x006e }
            r2.<init>(r6)     // Catch:{ FileNotFoundException -> 0x006e }
            r6 = 0
            z.k<T> r4 = r5.f13366b     // Catch:{ all -> 0x0066 }
            r0.f13433m = r5     // Catch:{ all -> 0x0066 }
            r0.f13434n = r2     // Catch:{ all -> 0x0066 }
            r0.f13435o = r6     // Catch:{ all -> 0x0066 }
            r0.f13438r = r3     // Catch:{ all -> 0x0066 }
            java.lang.Object r0 = r4.c(r2, r0)     // Catch:{ all -> 0x0066 }
            if (r0 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r1 = r6
            r6 = r0
            r0 = r5
        L_0x0060:
            p8.a.a(r2, r1)     // Catch:{ FileNotFoundException -> 0x0064 }
            return r6
        L_0x0064:
            r6 = move-exception
            goto L_0x0070
        L_0x0066:
            r6 = move-exception
            r0 = r5
        L_0x0068:
            throw r6     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r1 = move-exception
            p8.a.a(r2, r6)     // Catch:{ FileNotFoundException -> 0x0064 }
            throw r1     // Catch:{ FileNotFoundException -> 0x0064 }
        L_0x006e:
            r6 = move-exception
            r0 = r5
        L_0x0070:
            java.io.File r1 = r0.r()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L_0x0081
            z.k<T> r6 = r0.f13366b
            java.lang.Object r6 = r6.a()
            return r6
        L_0x0081:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z.m.x(j8.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0085 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object y(j8.d<? super T> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof z.m.o
            if (r0 == 0) goto L_0x0013
            r0 = r8
            z.m$o r0 = (z.m.o) r0
            int r1 = r0.f13443q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13443q = r1
            goto L_0x0018
        L_0x0013:
            z.m$o r0 = new z.m$o
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f13441o
            java.lang.Object r1 = k8.d.d()
            int r2 = r0.f13443q
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0055
            if (r2 == r5) goto L_0x004b
            if (r2 == r4) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r1 = r0.f13440n
            java.lang.Object r0 = r0.f13439m
            z.a r0 = (z.a) r0
            g8.n.b(r8)     // Catch:{ IOException -> 0x0035 }
            goto L_0x0087
        L_0x0035:
            r8 = move-exception
            goto L_0x008a
        L_0x0037:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003f:
            java.lang.Object r2 = r0.f13440n
            z.a r2 = (z.a) r2
            java.lang.Object r4 = r0.f13439m
            z.m r4 = (z.m) r4
            g8.n.b(r8)
            goto L_0x0079
        L_0x004b:
            java.lang.Object r2 = r0.f13439m
            z.m r2 = (z.m) r2
            g8.n.b(r8)     // Catch:{ a -> 0x0053 }
            goto L_0x0063
        L_0x0053:
            r8 = move-exception
            goto L_0x0066
        L_0x0055:
            g8.n.b(r8)
            r0.f13439m = r7     // Catch:{ a -> 0x0064 }
            r0.f13443q = r5     // Catch:{ a -> 0x0064 }
            java.lang.Object r8 = r7.x(r0)     // Catch:{ a -> 0x0064 }
            if (r8 != r1) goto L_0x0063
            return r1
        L_0x0063:
            return r8
        L_0x0064:
            r8 = move-exception
            r2 = r7
        L_0x0066:
            z.b<T> r5 = r2.f13367c
            r0.f13439m = r2
            r0.f13440n = r8
            r0.f13443q = r4
            java.lang.Object r4 = r5.a(r8, r0)
            if (r4 != r1) goto L_0x0075
            return r1
        L_0x0075:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L_0x0079:
            r0.f13439m = r2     // Catch:{ IOException -> 0x0088 }
            r0.f13440n = r8     // Catch:{ IOException -> 0x0088 }
            r0.f13443q = r3     // Catch:{ IOException -> 0x0088 }
            java.lang.Object r0 = r4.A(r8, r0)     // Catch:{ IOException -> 0x0088 }
            if (r0 != r1) goto L_0x0086
            return r1
        L_0x0086:
            r1 = r8
        L_0x0087:
            return r1
        L_0x0088:
            r8 = move-exception
            r0 = r2
        L_0x008a:
            g8.b.a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z.m.y(j8.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object z(r8.p<? super T, ? super j8.d<? super T>, ? extends java.lang.Object> r8, j8.g r9, j8.d<? super T> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof z.m.p
            if (r0 == 0) goto L_0x0013
            r0 = r10
            z.m$p r0 = (z.m.p) r0
            int r1 = r0.f13449r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13449r = r1
            goto L_0x0018
        L_0x0013:
            z.m$p r0 = new z.m$p
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f13447p
            java.lang.Object r1 = k8.d.d()
            int r2 = r0.f13449r
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 == r5) goto L_0x003b
            if (r2 != r4) goto L_0x0033
            java.lang.Object r8 = r0.f13445n
            java.lang.Object r9 = r0.f13444m
            z.m r9 = (z.m) r9
            g8.n.b(r10)
            goto L_0x008e
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003b:
            java.lang.Object r8 = r0.f13446o
            java.lang.Object r9 = r0.f13445n
            z.c r9 = (z.c) r9
            java.lang.Object r2 = r0.f13444m
            z.m r2 = (z.m) r2
            g8.n.b(r10)
            goto L_0x0073
        L_0x0049:
            g8.n.b(r10)
            e9.k<z.n<T>> r10 = r7.f13372h
            java.lang.Object r10 = r10.getValue()
            z.c r10 = (z.c) r10
            r10.a()
            java.lang.Object r2 = r10.b()
            z.m$q r6 = new z.m$q
            r6.<init>(r8, r2, r3)
            r0.f13444m = r7
            r0.f13445n = r10
            r0.f13446o = r2
            r0.f13449r = r5
            java.lang.Object r8 = b9.g.g(r9, r6, r0)
            if (r8 != r1) goto L_0x006f
            return r1
        L_0x006f:
            r9 = r10
            r10 = r8
            r8 = r2
            r2 = r7
        L_0x0073:
            r9.a()
            boolean r9 = kotlin.jvm.internal.l.a(r8, r10)
            if (r9 == 0) goto L_0x007d
            goto L_0x00a0
        L_0x007d:
            r0.f13444m = r2
            r0.f13445n = r10
            r0.f13446o = r3
            r0.f13449r = r4
            java.lang.Object r8 = r2.A(r10, r0)
            if (r8 != r1) goto L_0x008c
            return r1
        L_0x008c:
            r8 = r10
            r9 = r2
        L_0x008e:
            e9.k<z.n<T>> r9 = r9.f13372h
            z.c r10 = new z.c
            if (r8 == 0) goto L_0x0099
            int r0 = r8.hashCode()
            goto L_0x009a
        L_0x0099:
            r0 = 0
        L_0x009a:
            r10.<init>(r8, r0)
            r9.setValue(r10)
        L_0x00a0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z.m.z(r8.p, j8.g, j8.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bf, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        p8.a.a(r2, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c3, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c4, code lost:
        r8 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c5, code lost:
        r9 = r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:26:0x0092, B:34:0x00be] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009f A[Catch:{ all -> 0x00bf, IOException -> 0x00c4 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a0 A[Catch:{ all -> 0x00bf, IOException -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A(T r8, j8.d<? super g8.s> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof z.m.r
            if (r0 == 0) goto L_0x0013
            r0 = r9
            z.m$r r0 = (z.m.r) r0
            int r1 = r0.f13460t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f13460t = r1
            goto L_0x0018
        L_0x0013:
            z.m$r r0 = new z.m$r
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f13458r
            java.lang.Object r1 = k8.d.d()
            int r2 = r0.f13460t
            r3 = 1
            if (r2 == 0) goto L_0x0048
            if (r2 != r3) goto L_0x0040
            java.lang.Object r8 = r0.f13457q
            java.io.FileOutputStream r8 = (java.io.FileOutputStream) r8
            java.lang.Object r1 = r0.f13456p
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f13455o
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r3 = r0.f13454n
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r0 = r0.f13453m
            z.m r0 = (z.m) r0
            g8.n.b(r9)     // Catch:{ all -> 0x003d }
            goto L_0x0089
        L_0x003d:
            r8 = move-exception
            goto L_0x00be
        L_0x0040:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0048:
            g8.n.b(r9)
            java.io.File r9 = r7.r()
            r7.q(r9)
            java.io.File r9 = new java.io.File
            java.io.File r2 = r7.r()
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r4 = r7.f13370f
            java.lang.String r2 = kotlin.jvm.internal.l.k(r2, r4)
            r9.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00c7 }
            r2.<init>(r9)     // Catch:{ IOException -> 0x00c7 }
            r4 = 0
            z.k<T> r5 = r7.f13366b     // Catch:{ all -> 0x00bc }
            z.m$c r6 = new z.m$c     // Catch:{ all -> 0x00bc }
            r6.<init>(r2)     // Catch:{ all -> 0x00bc }
            r0.f13453m = r7     // Catch:{ all -> 0x00bc }
            r0.f13454n = r9     // Catch:{ all -> 0x00bc }
            r0.f13455o = r2     // Catch:{ all -> 0x00bc }
            r0.f13456p = r4     // Catch:{ all -> 0x00bc }
            r0.f13457q = r2     // Catch:{ all -> 0x00bc }
            r0.f13460t = r3     // Catch:{ all -> 0x00bc }
            java.lang.Object r8 = r5.b(r8, r6, r0)     // Catch:{ all -> 0x00bc }
            if (r8 != r1) goto L_0x0085
            return r1
        L_0x0085:
            r0 = r7
            r3 = r9
            r8 = r2
            r1 = r4
        L_0x0089:
            java.io.FileDescriptor r8 = r8.getFD()     // Catch:{ all -> 0x003d }
            r8.sync()     // Catch:{ all -> 0x003d }
            g8.s r8 = g8.s.f8976a     // Catch:{ all -> 0x003d }
            p8.a.a(r2, r1)     // Catch:{ IOException -> 0x00c4 }
            java.io.File r9 = r0.r()     // Catch:{ IOException -> 0x00c4 }
            boolean r9 = r3.renameTo(r9)     // Catch:{ IOException -> 0x00c4 }
            if (r9 == 0) goto L_0x00a0
            return r8
        L_0x00a0:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ IOException -> 0x00c4 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00c4 }
            r9.<init>()     // Catch:{ IOException -> 0x00c4 }
            java.lang.String r0 = "Unable to rename "
            r9.append(r0)     // Catch:{ IOException -> 0x00c4 }
            r9.append(r3)     // Catch:{ IOException -> 0x00c4 }
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r9.append(r0)     // Catch:{ IOException -> 0x00c4 }
            java.lang.String r9 = r9.toString()     // Catch:{ IOException -> 0x00c4 }
            r8.<init>(r9)     // Catch:{ IOException -> 0x00c4 }
            throw r8     // Catch:{ IOException -> 0x00c4 }
        L_0x00bc:
            r8 = move-exception
            r3 = r9
        L_0x00be:
            throw r8     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            r9 = move-exception
            p8.a.a(r2, r8)     // Catch:{ IOException -> 0x00c4 }
            throw r9     // Catch:{ IOException -> 0x00c4 }
        L_0x00c4:
            r8 = move-exception
            r9 = r3
            goto L_0x00c8
        L_0x00c7:
            r8 = move-exception
        L_0x00c8:
            boolean r0 = r9.exists()
            if (r0 == 0) goto L_0x00d1
            r9.delete()
        L_0x00d1:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z.m.A(java.lang.Object, j8.d):java.lang.Object");
    }

    public Object a(r8.p<? super T, ? super j8.d<? super T>, ? extends Object> pVar, j8.d<? super T> dVar) {
        u b10 = w.b((r1) null, 1, (Object) null);
        this.f13374j.e(new b.C0234b(pVar, b10, this.f13372h.getValue(), dVar.getContext()));
        return b10.H(dVar);
    }

    public e9.b<T> b() {
        return this.f13369e;
    }
}
