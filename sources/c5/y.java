package c5;

import android.content.Context;
import android.util.Log;
import b9.j0;
import b9.k0;
import b9.l0;
import b9.r1;
import c0.d;
import g8.n;
import g8.s;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.v;
import r8.l;
import r8.p;
import r8.q;
import x8.h;

public final class y implements x {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final b f3776f = new b((g) null);
    /* access modifiers changed from: private */
    @Deprecated

    /* renamed from: g  reason: collision with root package name */
    public static final t8.a<Context, z.f<c0.d>> f3777g = b0.a.b(w.f3770a.a(), (a0.b) null, (l) null, (j0) null, 14, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Context f3778b;

    /* renamed from: c  reason: collision with root package name */
    private final j8.g f3779c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<m> f3780d = new AtomicReference<>();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final e9.b<m> f3781e;

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionDatastoreImpl$1", f = "SessionDatastore.kt", l = {79}, m = "invokeSuspend")
    static final class a extends k implements p<j0, j8.d<? super s>, Object> {

        /* renamed from: m  reason: collision with root package name */
        int f3782m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ y f3783n;

        /* renamed from: c5.y$a$a  reason: collision with other inner class name */
        static final class C0080a<T> implements e9.c {

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ y f3784m;

            C0080a(y yVar) {
                this.f3784m = yVar;
            }

            /* renamed from: a */
            public final Object emit(m mVar, j8.d<? super s> dVar) {
                this.f3784m.f3780d.set(mVar);
                return s.f8976a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(y yVar, j8.d<? super a> dVar) {
            super(2, dVar);
            this.f3783n = yVar;
        }

        public final j8.d<s> create(Object obj, j8.d<?> dVar) {
            return new a(this.f3783n, dVar);
        }

        public final Object invoke(j0 j0Var, j8.d<? super s> dVar) {
            return ((a) create(j0Var, dVar)).invokeSuspend(s.f8976a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d10 = d.d();
            int i10 = this.f3782m;
            if (i10 == 0) {
                n.b(obj);
                e9.b g10 = this.f3783n.f3781e;
                C0080a aVar = new C0080a(this.f3783n);
                this.f3782m = 1;
                if (g10.a(aVar, this) == d10) {
                    return d10;
                }
            } else if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return s.f8976a;
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ h<Object>[] f3785a = {v.e(new r(b.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final z.f<c0.d> b(Context context) {
            return (z.f) y.f3777g.a(context, f3785a[0]);
        }
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f3786a = new c();

        /* renamed from: b  reason: collision with root package name */
        private static final d.a<String> f3787b = c0.f.f("session_id");

        private c() {
        }

        public final d.a<String> a() {
            return f3787b;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1", f = "SessionDatastore.kt", l = {73}, m = "invokeSuspend")
    static final class d extends k implements q<e9.c<? super c0.d>, Throwable, j8.d<? super s>, Object> {

        /* renamed from: m  reason: collision with root package name */
        int f3788m;

        /* renamed from: n  reason: collision with root package name */
        private /* synthetic */ Object f3789n;

        /* renamed from: o  reason: collision with root package name */
        /* synthetic */ Object f3790o;

        d(j8.d<? super d> dVar) {
            super(3, dVar);
        }

        /* renamed from: b */
        public final Object a(e9.c<? super c0.d> cVar, Throwable th, j8.d<? super s> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f3789n = cVar;
            dVar2.f3790o = th;
            return dVar2.invokeSuspend(s.f8976a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d10 = d.d();
            int i10 = this.f3788m;
            if (i10 == 0) {
                n.b(obj);
                Log.e("FirebaseSessionsRepo", "Error reading stored session data.", (Throwable) this.f3790o);
                c0.d a10 = c0.e.a();
                this.f3789n = null;
                this.f3788m = 1;
                if (((e9.c) this.f3789n).emit(a10, this) == d10) {
                    return d10;
                }
            } else if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return s.f8976a;
        }
    }

    public static final class e implements e9.b<m> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ e9.b f3791m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ y f3792n;

        public static final class a<T> implements e9.c {

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ e9.c f3793m;

            /* renamed from: n  reason: collision with root package name */
            final /* synthetic */ y f3794n;

            @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2", f = "SessionDatastore.kt", l = {224}, m = "emit")
            /* renamed from: c5.y$e$a$a  reason: collision with other inner class name */
            public static final class C0081a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: m  reason: collision with root package name */
                /* synthetic */ Object f3795m;

                /* renamed from: n  reason: collision with root package name */
                int f3796n;

                /* renamed from: o  reason: collision with root package name */
                final /* synthetic */ a f3797o;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0081a(a aVar, j8.d dVar) {
                    super(dVar);
                    this.f3797o = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f3795m = obj;
                    this.f3796n |= Integer.MIN_VALUE;
                    return this.f3797o.emit((Object) null, this);
                }
            }

            public a(e9.c cVar, y yVar) {
                this.f3793m = cVar;
                this.f3794n = yVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, j8.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof c5.y.e.a.C0081a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    c5.y$e$a$a r0 = (c5.y.e.a.C0081a) r0
                    int r1 = r0.f3796n
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f3796n = r1
                    goto L_0x0018
                L_0x0013:
                    c5.y$e$a$a r0 = new c5.y$e$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f3795m
                    java.lang.Object r1 = k8.d.d()
                    int r2 = r0.f3796n
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    g8.n.b(r6)
                    goto L_0x0047
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    g8.n.b(r6)
                    e9.c r6 = r4.f3793m
                    c0.d r5 = (c0.d) r5
                    c5.y r2 = r4.f3794n
                    c5.m r5 = r2.i(r5)
                    r0.f3796n = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0047
                    return r1
                L_0x0047:
                    g8.s r5 = g8.s.f8976a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: c5.y.e.a.emit(java.lang.Object, j8.d):java.lang.Object");
            }
        }

        public e(e9.b bVar, y yVar) {
            this.f3791m = bVar;
            this.f3792n = yVar;
        }

        public Object a(e9.c cVar, j8.d dVar) {
            Object a10 = this.f3791m.a(new a(cVar, this.f3792n), dVar);
            return a10 == d.d() ? a10 : s.f8976a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1", f = "SessionDatastore.kt", l = {85}, m = "invokeSuspend")
    static final class f extends k implements p<j0, j8.d<? super s>, Object> {

        /* renamed from: m  reason: collision with root package name */
        int f3798m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ y f3799n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ String f3800o;

        @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1", f = "SessionDatastore.kt", l = {}, m = "invokeSuspend")
        static final class a extends k implements p<c0.a, j8.d<? super s>, Object> {

            /* renamed from: m  reason: collision with root package name */
            int f3801m;

            /* renamed from: n  reason: collision with root package name */
            /* synthetic */ Object f3802n;

            /* renamed from: o  reason: collision with root package name */
            final /* synthetic */ String f3803o;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(String str, j8.d<? super a> dVar) {
                super(2, dVar);
                this.f3803o = str;
            }

            /* renamed from: b */
            public final Object invoke(c0.a aVar, j8.d<? super s> dVar) {
                return ((a) create(aVar, dVar)).invokeSuspend(s.f8976a);
            }

            public final j8.d<s> create(Object obj, j8.d<?> dVar) {
                a aVar = new a(this.f3803o, dVar);
                aVar.f3802n = obj;
                return aVar;
            }

            public final Object invokeSuspend(Object obj) {
                Object unused = d.d();
                if (this.f3801m == 0) {
                    n.b(obj);
                    ((c0.a) this.f3802n).i(c.f3786a.a(), this.f3803o);
                    return s.f8976a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(y yVar, String str, j8.d<? super f> dVar) {
            super(2, dVar);
            this.f3799n = yVar;
            this.f3800o = str;
        }

        public final j8.d<s> create(Object obj, j8.d<?> dVar) {
            return new f(this.f3799n, this.f3800o, dVar);
        }

        public final Object invoke(j0 j0Var, j8.d<? super s> dVar) {
            return ((f) create(j0Var, dVar)).invokeSuspend(s.f8976a);
        }

        public final Object invokeSuspend(Object obj) {
            Object d10 = d.d();
            int i10 = this.f3798m;
            if (i10 == 0) {
                n.b(obj);
                z.f a10 = y.f3776f.b(this.f3799n.f3778b);
                a aVar = new a(this.f3800o, (j8.d<? super a>) null);
                this.f3798m = 1;
                if (c0.g.a(a10, aVar, this) == d10) {
                    return d10;
                }
            } else if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return s.f8976a;
        }
    }

    public y(Context context, j8.g gVar) {
        kotlin.jvm.internal.l.e(context, "context");
        kotlin.jvm.internal.l.e(gVar, "backgroundDispatcher");
        this.f3778b = context;
        this.f3779c = gVar;
        this.f3781e = new e(e9.d.a(f3776f.b(context).b(), new d((j8.d<? super d>) null)), this);
        r1 unused = i.d(k0.a(gVar), (j8.g) null, (l0) null, new a(this, (j8.d<? super a>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final m i(c0.d dVar) {
        return new m((String) dVar.b(c.f3786a.a()));
    }

    public String a() {
        m mVar = this.f3780d.get();
        if (mVar != null) {
            return mVar.a();
        }
        return null;
    }

    public void b(String str) {
        kotlin.jvm.internal.l.e(str, "sessionId");
        r1 unused = i.d(k0.a(this.f3779c), (j8.g) null, (l0) null, new f(this, str, (j8.d<? super f>) null), 3, (Object) null);
    }
}
