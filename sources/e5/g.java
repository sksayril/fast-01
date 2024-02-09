package e5;

import b9.j0;
import c0.d;
import c0.f;
import g8.n;
import g8.s;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.l;
import r8.p;

public final class g {

    /* renamed from: c  reason: collision with root package name */
    private static final b f8491c = new b((kotlin.jvm.internal.g) null);
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    private static final d.a<Boolean> f8492d = f.a("firebase_sessions_enabled");
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    private static final d.a<Double> f8493e = f.b("firebase_sessions_sampling_rate");
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    private static final d.a<Integer> f8494f = f.d("firebase_sessions_restart_timeout");
    @Deprecated

    /* renamed from: g  reason: collision with root package name */
    private static final d.a<Integer> f8495g = f.d("firebase_sessions_cache_duration");
    @Deprecated

    /* renamed from: h  reason: collision with root package name */
    private static final d.a<Long> f8496h = f.e("firebase_sessions_cache_updated_time");
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final z.f<c0.d> f8497a;

    /* renamed from: b  reason: collision with root package name */
    private e f8498b;

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SettingsCache$1", f = "SettingsCache.kt", l = {46}, m = "invokeSuspend")
    static final class a extends k implements p<j0, j8.d<? super s>, Object> {

        /* renamed from: m  reason: collision with root package name */
        Object f8499m;

        /* renamed from: n  reason: collision with root package name */
        int f8500n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ g f8501o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar, j8.d<? super a> dVar) {
            super(2, dVar);
            this.f8501o = gVar;
        }

        public final j8.d<s> create(Object obj, j8.d<?> dVar) {
            return new a(this.f8501o, dVar);
        }

        public final Object invoke(j0 j0Var, j8.d<? super s> dVar) {
            return ((a) create(j0Var, dVar)).invokeSuspend(s.f8976a);
        }

        public final Object invokeSuspend(Object obj) {
            g gVar;
            Object d10 = d.d();
            int i10 = this.f8500n;
            if (i10 == 0) {
                n.b(obj);
                g gVar2 = this.f8501o;
                e9.b b10 = gVar2.f8497a.b();
                this.f8499m = gVar2;
                this.f8500n = 1;
                Object f10 = e9.d.f(b10, this);
                if (f10 == d10) {
                    return d10;
                }
                gVar = gVar2;
                obj = f10;
            } else if (i10 == 1) {
                gVar = (g) this.f8499m;
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar.l(((c0.d) obj).d());
            return s.f8976a;
        }
    }

    private static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SettingsCache", f = "SettingsCache.kt", l = {112}, m = "updateConfigValue")
    static final class c<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f8502m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ g f8503n;

        /* renamed from: o  reason: collision with root package name */
        int f8504o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g gVar, j8.d<? super c> dVar) {
            super(dVar);
            this.f8503n = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f8502m = obj;
            this.f8504o |= Integer.MIN_VALUE;
            return this.f8503n.h((d.a) null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2", f = "SettingsCache.kt", l = {}, m = "invokeSuspend")
    static final class d extends k implements p<c0.a, j8.d<? super s>, Object> {

        /* renamed from: m  reason: collision with root package name */
        int f8505m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f8506n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ T f8507o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ d.a<T> f8508p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ g f8509q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(T t9, d.a<T> aVar, g gVar, j8.d<? super d> dVar) {
            super(2, dVar);
            this.f8507o = t9;
            this.f8508p = aVar;
            this.f8509q = gVar;
        }

        /* renamed from: b */
        public final Object invoke(c0.a aVar, j8.d<? super s> dVar) {
            return ((d) create(aVar, dVar)).invokeSuspend(s.f8976a);
        }

        public final j8.d<s> create(Object obj, j8.d<?> dVar) {
            d dVar2 = new d(this.f8507o, this.f8508p, this.f8509q, dVar);
            dVar2.f8506n = obj;
            return dVar2;
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.d();
            if (this.f8505m == 0) {
                n.b(obj);
                c0.a aVar = (c0.a) this.f8506n;
                T t9 = this.f8507o;
                if (t9 != null) {
                    aVar.i(this.f8508p, t9);
                } else {
                    aVar.h(this.f8508p);
                }
                this.f8509q.l(aVar);
                return s.f8976a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public g(z.f<c0.d> fVar) {
        l.e(fVar, "dataStore");
        this.f8497a = fVar;
        Object unused = h.b((j8.g) null, new a(this, (j8.d<? super a>) null), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> java.lang.Object h(c0.d.a<T> r6, T r7, j8.d<? super g8.s> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof e5.g.c
            if (r0 == 0) goto L_0x0013
            r0 = r8
            e5.g$c r0 = (e5.g.c) r0
            int r1 = r0.f8504o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8504o = r1
            goto L_0x0018
        L_0x0013:
            e5.g$c r0 = new e5.g$c
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f8502m
            java.lang.Object r1 = k8.d.d()
            int r2 = r0.f8504o
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            g8.n.b(r8)     // Catch:{ IOException -> 0x0029 }
            goto L_0x005d
        L_0x0029:
            r6 = move-exception
            goto L_0x0047
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            g8.n.b(r8)
            z.f<c0.d> r8 = r5.f8497a     // Catch:{ IOException -> 0x0029 }
            e5.g$d r2 = new e5.g$d     // Catch:{ IOException -> 0x0029 }
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch:{ IOException -> 0x0029 }
            r0.f8504o = r3     // Catch:{ IOException -> 0x0029 }
            java.lang.Object r6 = c0.g.a(r8, r2, r0)     // Catch:{ IOException -> 0x0029 }
            if (r6 != r1) goto L_0x005d
            return r1
        L_0x0047:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Failed to update cache config value: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "SettingsCache"
            android.util.Log.w(r7, r6)
        L_0x005d:
            g8.s r6 = g8.s.f8976a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.g.h(c0.d$a, java.lang.Object, j8.d):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final void l(c0.d dVar) {
        this.f8498b = new e((Boolean) dVar.b(f8492d), (Double) dVar.b(f8493e), (Integer) dVar.b(f8494f), (Integer) dVar.b(f8495g), (Long) dVar.b(f8496h));
    }

    public final boolean d() {
        e eVar = this.f8498b;
        e eVar2 = null;
        if (eVar == null) {
            l.p("sessionConfigs");
            eVar = null;
        }
        Long b10 = eVar.b();
        e eVar3 = this.f8498b;
        if (eVar3 == null) {
            l.p("sessionConfigs");
        } else {
            eVar2 = eVar3;
        }
        Integer a10 = eVar2.a();
        return b10 == null || a10 == null || (System.currentTimeMillis() - b10.longValue()) / ((long) 1000) >= ((long) a10.intValue());
    }

    public final Integer e() {
        e eVar = this.f8498b;
        if (eVar == null) {
            l.p("sessionConfigs");
            eVar = null;
        }
        return eVar.d();
    }

    public final Double f() {
        e eVar = this.f8498b;
        if (eVar == null) {
            l.p("sessionConfigs");
            eVar = null;
        }
        return eVar.e();
    }

    public final Boolean g() {
        e eVar = this.f8498b;
        if (eVar == null) {
            l.p("sessionConfigs");
            eVar = null;
        }
        return eVar.c();
    }

    public final Object i(Double d10, j8.d<? super s> dVar) {
        Object h10 = h(f8493e, d10, dVar);
        return h10 == d.d() ? h10 : s.f8976a;
    }

    public final Object j(Integer num, j8.d<? super s> dVar) {
        Object h10 = h(f8495g, num, dVar);
        return h10 == d.d() ? h10 : s.f8976a;
    }

    public final Object k(Long l10, j8.d<? super s> dVar) {
        Object h10 = h(f8496h, l10, dVar);
        return h10 == d.d() ? h10 : s.f8976a;
    }

    public final Object m(Integer num, j8.d<? super s> dVar) {
        Object h10 = h(f8494f, num, dVar);
        return h10 == d.d() ? h10 : s.f8976a;
    }

    public final Object n(Boolean bool, j8.d<? super s> dVar) {
        Object h10 = h(f8492d, bool, dVar);
        return h10 == d.d() ? h10 : s.f8976a;
    }
}
