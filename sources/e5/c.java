package e5;

import a9.b;
import android.util.Log;
import g8.n;
import g8.s;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import org.json.JSONObject;
import r8.p;
import z8.e;

public final class c implements h {

    /* renamed from: g  reason: collision with root package name */
    private static final a f8449g = new a((g) null);

    /* renamed from: a  reason: collision with root package name */
    private final j8.g f8450a;

    /* renamed from: b  reason: collision with root package name */
    private final t4.d f8451b;

    /* renamed from: c  reason: collision with root package name */
    private final c5.b f8452c;

    /* renamed from: d  reason: collision with root package name */
    private final a f8453d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final g f8454e;

    /* renamed from: f  reason: collision with root package name */
    private final k9.a f8455f = k9.c.b(false, 1, (Object) null);

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    @f(c = "com.google.firebase.sessions.settings.RemoteSettings", f = "RemoteSettings.kt", l = {170, 76, 94}, m = "updateSettings")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: m  reason: collision with root package name */
        Object f8456m;

        /* renamed from: n  reason: collision with root package name */
        Object f8457n;

        /* renamed from: o  reason: collision with root package name */
        /* synthetic */ Object f8458o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ c f8459p;

        /* renamed from: q  reason: collision with root package name */
        int f8460q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar, j8.d<? super b> dVar) {
            super(dVar);
            this.f8459p = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f8458o = obj;
            this.f8460q |= Integer.MIN_VALUE;
            return this.f8459p.d(this);
        }
    }

    @f(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", l = {125, 128, 131, 133, 134, 136}, m = "invokeSuspend")
    /* renamed from: e5.c$c  reason: collision with other inner class name */
    static final class C0131c extends k implements p<JSONObject, j8.d<? super s>, Object> {

        /* renamed from: m  reason: collision with root package name */
        Object f8461m;

        /* renamed from: n  reason: collision with root package name */
        Object f8462n;

        /* renamed from: o  reason: collision with root package name */
        int f8463o;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f8464p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ c f8465q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0131c(c cVar, j8.d<? super C0131c> dVar) {
            super(2, dVar);
            this.f8465q = cVar;
        }

        /* renamed from: b */
        public final Object invoke(JSONObject jSONObject, j8.d<? super s> dVar) {
            return ((C0131c) create(jSONObject, dVar)).invokeSuspend(s.f8976a);
        }

        public final j8.d<s> create(Object obj, j8.d<?> dVar) {
            C0131c cVar = new C0131c(this.f8465q, dVar);
            cVar.f8464p = obj;
            return cVar;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f6, code lost:
            r13 = (java.lang.Integer) r8.f11078m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fa, code lost:
            if (r13 == null) goto L_0x0119;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fc, code lost:
            r2 = r12.f8465q;
            r13.intValue();
            r12.f8464p = r1;
            r12.f8461m = r0;
            r12.f8462n = null;
            r12.f8463o = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0116, code lost:
            if (e5.c.e(r2).m((java.lang.Integer) r8.f11078m, r12) != r4) goto L_0x0119;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0118, code lost:
            return r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0119, code lost:
            r13 = (java.lang.Double) r1.f11078m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x011d, code lost:
            if (r13 == null) goto L_0x013c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x011f, code lost:
            r2 = r12.f8465q;
            r13.doubleValue();
            r12.f8464p = r0;
            r12.f8461m = null;
            r12.f8462n = null;
            r12.f8463o = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0139, code lost:
            if (e5.c.e(r2).i((java.lang.Double) r1.f11078m, r12) != r4) goto L_0x013c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x013b, code lost:
            return r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x013c, code lost:
            r13 = (java.lang.Integer) r0.f11078m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0140, code lost:
            if (r13 == null) goto L_0x0162;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0142, code lost:
            r1 = r12.f8465q;
            r13.intValue();
            r12.f8464p = null;
            r12.f8461m = null;
            r12.f8462n = null;
            r12.f8463o = 4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x015c, code lost:
            if (e5.c.e(r1).j((java.lang.Integer) r0.f11078m, r12) != r4) goto L_0x015f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x015e, code lost:
            return r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x015f, code lost:
            r13 = g8.s.f8976a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0162, code lost:
            r13 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0163, code lost:
            if (r13 != null) goto L_0x0182;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x0165, code lost:
            r13 = e5.c.e(r12.f8465q);
            r0 = kotlin.coroutines.jvm.internal.b.b(86400);
            r12.f8464p = null;
            r12.f8461m = null;
            r12.f8462n = null;
            r12.f8463o = 5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x017f, code lost:
            if (r13.j(r0, r12) != r4) goto L_0x0182;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0181, code lost:
            return r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0182, code lost:
            r13 = e5.c.e(r12.f8465q);
            r0 = kotlin.coroutines.jvm.internal.b.c(java.lang.System.currentTimeMillis());
            r12.f8464p = null;
            r12.f8461m = null;
            r12.f8462n = null;
            r12.f8463o = 6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x019d, code lost:
            if (r13.k(r0, r12) != r4) goto L_0x01a0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x019f, code lost:
            return r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x01a2, code lost:
            return g8.s.f8976a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00d5  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00f4  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.String r0 = "cache_duration"
                java.lang.String r1 = "session_timeout_seconds"
                java.lang.String r2 = "sampling_rate"
                java.lang.String r3 = "sessions_enabled"
                java.lang.Object r4 = k8.d.d()
                int r5 = r12.f8463o
                r6 = 0
                switch(r5) {
                    case 0: goto L_0x0050;
                    case 1: goto L_0x003f;
                    case 2: goto L_0x0032;
                    case 3: goto L_0x0029;
                    case 4: goto L_0x0024;
                    case 5: goto L_0x001f;
                    case 6: goto L_0x001a;
                    default: goto L_0x0012;
                }
            L_0x0012:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x001a:
                g8.n.b(r13)
                goto L_0x01a0
            L_0x001f:
                g8.n.b(r13)
                goto L_0x0182
            L_0x0024:
                g8.n.b(r13)
                goto L_0x015f
            L_0x0029:
                java.lang.Object r0 = r12.f8464p
                kotlin.jvm.internal.u r0 = (kotlin.jvm.internal.u) r0
                g8.n.b(r13)
                goto L_0x013c
            L_0x0032:
                java.lang.Object r0 = r12.f8461m
                kotlin.jvm.internal.u r0 = (kotlin.jvm.internal.u) r0
                java.lang.Object r1 = r12.f8464p
                kotlin.jvm.internal.u r1 = (kotlin.jvm.internal.u) r1
                g8.n.b(r13)
                goto L_0x0119
            L_0x003f:
                java.lang.Object r0 = r12.f8462n
                kotlin.jvm.internal.u r0 = (kotlin.jvm.internal.u) r0
                java.lang.Object r1 = r12.f8461m
                kotlin.jvm.internal.u r1 = (kotlin.jvm.internal.u) r1
                java.lang.Object r2 = r12.f8464p
                kotlin.jvm.internal.u r2 = (kotlin.jvm.internal.u) r2
                g8.n.b(r13)
                goto L_0x00f1
            L_0x0050:
                g8.n.b(r13)
                java.lang.Object r13 = r12.f8464p
                org.json.JSONObject r13 = (org.json.JSONObject) r13
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r7 = "Fetched settings: "
                r5.append(r7)
                r5.append(r13)
                java.lang.String r5 = r5.toString()
                java.lang.String r7 = "SessionConfigFetcher"
                android.util.Log.d(r7, r5)
                kotlin.jvm.internal.u r5 = new kotlin.jvm.internal.u
                r5.<init>()
                kotlin.jvm.internal.u r8 = new kotlin.jvm.internal.u
                r8.<init>()
                kotlin.jvm.internal.u r9 = new kotlin.jvm.internal.u
                r9.<init>()
                java.lang.String r10 = "app_quality"
                boolean r11 = r13.has(r10)
                if (r11 == 0) goto L_0x00d2
                java.lang.Object r13 = r13.get(r10)
                java.lang.String r10 = "null cannot be cast to non-null type org.json.JSONObject"
                kotlin.jvm.internal.l.c(r13, r10)
                org.json.JSONObject r13 = (org.json.JSONObject) r13
                boolean r10 = r13.has(r3)     // Catch:{ JSONException -> 0x00ca }
                if (r10 == 0) goto L_0x009c
                java.lang.Object r3 = r13.get(r3)     // Catch:{ JSONException -> 0x00ca }
                java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ JSONException -> 0x00ca }
                goto L_0x009d
            L_0x009c:
                r3 = r6
            L_0x009d:
                boolean r10 = r13.has(r2)     // Catch:{ JSONException -> 0x00c8 }
                if (r10 == 0) goto L_0x00ab
                java.lang.Object r2 = r13.get(r2)     // Catch:{ JSONException -> 0x00c8 }
                java.lang.Double r2 = (java.lang.Double) r2     // Catch:{ JSONException -> 0x00c8 }
                r5.f11078m = r2     // Catch:{ JSONException -> 0x00c8 }
            L_0x00ab:
                boolean r2 = r13.has(r1)     // Catch:{ JSONException -> 0x00c8 }
                if (r2 == 0) goto L_0x00b9
                java.lang.Object r1 = r13.get(r1)     // Catch:{ JSONException -> 0x00c8 }
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ JSONException -> 0x00c8 }
                r8.f11078m = r1     // Catch:{ JSONException -> 0x00c8 }
            L_0x00b9:
                boolean r1 = r13.has(r0)     // Catch:{ JSONException -> 0x00c8 }
                if (r1 == 0) goto L_0x00d3
                java.lang.Object r13 = r13.get(r0)     // Catch:{ JSONException -> 0x00c8 }
                java.lang.Integer r13 = (java.lang.Integer) r13     // Catch:{ JSONException -> 0x00c8 }
                r9.f11078m = r13     // Catch:{ JSONException -> 0x00c8 }
                goto L_0x00d3
            L_0x00c8:
                r13 = move-exception
                goto L_0x00cc
            L_0x00ca:
                r13 = move-exception
                r3 = r6
            L_0x00cc:
                java.lang.String r0 = "Error parsing the configs remotely fetched: "
                android.util.Log.e(r7, r0, r13)
                goto L_0x00d3
            L_0x00d2:
                r3 = r6
            L_0x00d3:
                if (r3 == 0) goto L_0x00f4
                e5.c r13 = r12.f8465q
                r3.booleanValue()
                e5.g r13 = r13.f8454e
                r12.f8464p = r5
                r12.f8461m = r8
                r12.f8462n = r9
                r0 = 1
                r12.f8463o = r0
                java.lang.Object r13 = r13.n(r3, r12)
                if (r13 != r4) goto L_0x00ee
                return r4
            L_0x00ee:
                r2 = r5
                r1 = r8
                r0 = r9
            L_0x00f1:
                r8 = r1
                r1 = r2
                goto L_0x00f6
            L_0x00f4:
                r1 = r5
                r0 = r9
            L_0x00f6:
                T r13 = r8.f11078m
                java.lang.Integer r13 = (java.lang.Integer) r13
                if (r13 == 0) goto L_0x0119
                e5.c r2 = r12.f8465q
                r13.intValue()
                e5.g r13 = r2.f8454e
                T r2 = r8.f11078m
                java.lang.Integer r2 = (java.lang.Integer) r2
                r12.f8464p = r1
                r12.f8461m = r0
                r12.f8462n = r6
                r3 = 2
                r12.f8463o = r3
                java.lang.Object r13 = r13.m(r2, r12)
                if (r13 != r4) goto L_0x0119
                return r4
            L_0x0119:
                T r13 = r1.f11078m
                java.lang.Double r13 = (java.lang.Double) r13
                if (r13 == 0) goto L_0x013c
                e5.c r2 = r12.f8465q
                r13.doubleValue()
                e5.g r13 = r2.f8454e
                T r1 = r1.f11078m
                java.lang.Double r1 = (java.lang.Double) r1
                r12.f8464p = r0
                r12.f8461m = r6
                r12.f8462n = r6
                r2 = 3
                r12.f8463o = r2
                java.lang.Object r13 = r13.i(r1, r12)
                if (r13 != r4) goto L_0x013c
                return r4
            L_0x013c:
                T r13 = r0.f11078m
                java.lang.Integer r13 = (java.lang.Integer) r13
                if (r13 == 0) goto L_0x0162
                e5.c r1 = r12.f8465q
                r13.intValue()
                e5.g r13 = r1.f8454e
                T r0 = r0.f11078m
                java.lang.Integer r0 = (java.lang.Integer) r0
                r12.f8464p = r6
                r12.f8461m = r6
                r12.f8462n = r6
                r1 = 4
                r12.f8463o = r1
                java.lang.Object r13 = r13.j(r0, r12)
                if (r13 != r4) goto L_0x015f
                return r4
            L_0x015f:
                g8.s r13 = g8.s.f8976a
                goto L_0x0163
            L_0x0162:
                r13 = r6
            L_0x0163:
                if (r13 != 0) goto L_0x0182
                e5.c r13 = r12.f8465q
                e5.g r13 = r13.f8454e
                r0 = 86400(0x15180, float:1.21072E-40)
                java.lang.Integer r0 = kotlin.coroutines.jvm.internal.b.b(r0)
                r12.f8464p = r6
                r12.f8461m = r6
                r12.f8462n = r6
                r1 = 5
                r12.f8463o = r1
                java.lang.Object r13 = r13.j(r0, r12)
                if (r13 != r4) goto L_0x0182
                return r4
            L_0x0182:
                e5.c r13 = r12.f8465q
                e5.g r13 = r13.f8454e
                long r0 = java.lang.System.currentTimeMillis()
                java.lang.Long r0 = kotlin.coroutines.jvm.internal.b.c(r0)
                r12.f8464p = r6
                r12.f8461m = r6
                r12.f8462n = r6
                r1 = 6
                r12.f8463o = r1
                java.lang.Object r13 = r13.k(r0, r12)
                if (r13 != r4) goto L_0x01a0
                return r4
            L_0x01a0:
                g8.s r13 = g8.s.f8976a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: e5.c.C0131c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @f(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", f = "RemoteSettings.kt", l = {}, m = "invokeSuspend")
    static final class d extends k implements p<String, j8.d<? super s>, Object> {

        /* renamed from: m  reason: collision with root package name */
        int f8466m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f8467n;

        d(j8.d<? super d> dVar) {
            super(2, dVar);
        }

        /* renamed from: b */
        public final Object invoke(String str, j8.d<? super s> dVar) {
            return ((d) create(str, dVar)).invokeSuspend(s.f8976a);
        }

        public final j8.d<s> create(Object obj, j8.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f8467n = obj;
            return dVar2;
        }

        public final Object invokeSuspend(Object obj) {
            Object unused = d.d();
            if (this.f8466m == 0) {
                n.b(obj);
                Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f8467n));
                return s.f8976a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public c(j8.g gVar, t4.d dVar, c5.b bVar, a aVar, z.f<c0.d> fVar) {
        l.e(gVar, "backgroundDispatcher");
        l.e(dVar, "firebaseInstallationsApi");
        l.e(bVar, "appInfo");
        l.e(aVar, "configsFetcher");
        l.e(fVar, "dataStore");
        this.f8450a = gVar;
        this.f8451b = dVar;
        this.f8452c = bVar;
        this.f8453d = aVar;
        this.f8454e = new g(fVar);
    }

    private final String f(String str) {
        return new e("/").a(str, "");
    }

    public Boolean a() {
        return this.f8454e.g();
    }

    public Double b() {
        return this.f8454e.f();
    }

    public a9.b c() {
        Integer e10 = this.f8454e.e();
        if (e10 == null) {
            return null;
        }
        b.a aVar = a9.b.f50n;
        return a9.b.g(a9.d.h(e10.intValue(), a9.e.SECONDS));
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0091 A[Catch:{ all -> 0x0052 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009c A[SYNTHETIC, Splitter:B:39:0x009c] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b8 A[Catch:{ all -> 0x0052 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object d(j8.d<? super g8.s> r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            boolean r2 = r0 instanceof e5.c.b
            if (r2 == 0) goto L_0x0017
            r2 = r0
            e5.c$b r2 = (e5.c.b) r2
            int r3 = r2.f8460q
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f8460q = r3
            goto L_0x001c
        L_0x0017:
            e5.c$b r2 = new e5.c$b
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.f8458o
            java.lang.Object r3 = k8.d.d()
            int r4 = r2.f8460q
            java.lang.String r5 = "SessionConfigFetcher"
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r4 == 0) goto L_0x0062
            if (r4 == r8) goto L_0x0056
            if (r4 == r7) goto L_0x0046
            if (r4 != r6) goto L_0x003e
            java.lang.Object r2 = r2.f8456m
            k9.a r2 = (k9.a) r2
            g8.n.b(r0)     // Catch:{ all -> 0x003b }
            goto L_0x014e
        L_0x003b:
            r0 = move-exception
            goto L_0x0154
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0046:
            java.lang.Object r4 = r2.f8457n
            k9.a r4 = (k9.a) r4
            java.lang.Object r10 = r2.f8456m
            e5.c r10 = (e5.c) r10
            g8.n.b(r0)     // Catch:{ all -> 0x0052 }
            goto L_0x00b4
        L_0x0052:
            r0 = move-exception
            r2 = r4
            goto L_0x0154
        L_0x0056:
            java.lang.Object r4 = r2.f8457n
            k9.a r4 = (k9.a) r4
            java.lang.Object r10 = r2.f8456m
            e5.c r10 = (e5.c) r10
            g8.n.b(r0)
            goto L_0x0089
        L_0x0062:
            g8.n.b(r0)
            k9.a r0 = r1.f8455f
            boolean r0 = r0.c()
            if (r0 != 0) goto L_0x0078
            e5.g r0 = r1.f8454e
            boolean r0 = r0.d()
            if (r0 != 0) goto L_0x0078
            g8.s r0 = g8.s.f8976a
            return r0
        L_0x0078:
            k9.a r0 = r1.f8455f
            r2.f8456m = r1
            r2.f8457n = r0
            r2.f8460q = r8
            java.lang.Object r4 = r0.b(r9, r2)
            if (r4 != r3) goto L_0x0087
            return r3
        L_0x0087:
            r4 = r0
            r10 = r1
        L_0x0089:
            e5.g r0 = r10.f8454e     // Catch:{ all -> 0x0052 }
            boolean r0 = r0.d()     // Catch:{ all -> 0x0052 }
            if (r0 != 0) goto L_0x009c
            java.lang.String r0 = "Remote settings cache not expired. Using cached values."
            android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0052 }
            g8.s r0 = g8.s.f8976a     // Catch:{ all -> 0x0052 }
            r4.a(r9)
            return r0
        L_0x009c:
            t4.d r0 = r10.f8451b     // Catch:{ all -> 0x0052 }
            d3.j r0 = r0.a()     // Catch:{ all -> 0x0052 }
            java.lang.String r11 = "firebaseInstallationsApi.id"
            kotlin.jvm.internal.l.d(r0, r11)     // Catch:{ all -> 0x0052 }
            r2.f8456m = r10     // Catch:{ all -> 0x0052 }
            r2.f8457n = r4     // Catch:{ all -> 0x0052 }
            r2.f8460q = r7     // Catch:{ all -> 0x0052 }
            java.lang.Object r0 = l9.b.a(r0, r2)     // Catch:{ all -> 0x0052 }
            if (r0 != r3) goto L_0x00b4
            return r3
        L_0x00b4:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0052 }
            if (r0 != 0) goto L_0x00c3
            java.lang.String r0 = "Error getting Firebase Installation ID. Skipping this Session Event."
            android.util.Log.w(r5, r0)     // Catch:{ all -> 0x0052 }
            g8.s r0 = g8.s.f8976a     // Catch:{ all -> 0x0052 }
            r4.a(r9)
            return r0
        L_0x00c3:
            r11 = 5
            g8.l[] r11 = new g8.l[r11]     // Catch:{ all -> 0x0052 }
            java.lang.String r12 = "X-Crashlytics-Installation-ID"
            g8.l r0 = g8.p.a(r12, r0)     // Catch:{ all -> 0x0052 }
            r12 = 0
            r11[r12] = r0     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "X-Crashlytics-Device-Model"
            kotlin.jvm.internal.x r13 = kotlin.jvm.internal.x.f11081a     // Catch:{ all -> 0x0052 }
            java.lang.String r13 = "%s/%s"
            java.lang.Object[] r14 = new java.lang.Object[r7]     // Catch:{ all -> 0x0052 }
            java.lang.String r15 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x0052 }
            r14[r12] = r15     // Catch:{ all -> 0x0052 }
            java.lang.String r12 = android.os.Build.MODEL     // Catch:{ all -> 0x0052 }
            r14[r8] = r12     // Catch:{ all -> 0x0052 }
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r14, r7)     // Catch:{ all -> 0x0052 }
            java.lang.String r12 = java.lang.String.format(r13, r12)     // Catch:{ all -> 0x0052 }
            java.lang.String r13 = "format(format, *args)"
            kotlin.jvm.internal.l.d(r12, r13)     // Catch:{ all -> 0x0052 }
            java.lang.String r12 = r10.f(r12)     // Catch:{ all -> 0x0052 }
            g8.l r0 = g8.p.a(r0, r12)     // Catch:{ all -> 0x0052 }
            r11[r8] = r0     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "X-Crashlytics-OS-Build-Version"
            java.lang.String r8 = android.os.Build.VERSION.INCREMENTAL     // Catch:{ all -> 0x0052 }
            java.lang.String r12 = "INCREMENTAL"
            kotlin.jvm.internal.l.d(r8, r12)     // Catch:{ all -> 0x0052 }
            java.lang.String r8 = r10.f(r8)     // Catch:{ all -> 0x0052 }
            g8.l r0 = g8.p.a(r0, r8)     // Catch:{ all -> 0x0052 }
            r11[r7] = r0     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "X-Crashlytics-OS-Display-Version"
            java.lang.String r7 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0052 }
            java.lang.String r8 = "RELEASE"
            kotlin.jvm.internal.l.d(r7, r8)     // Catch:{ all -> 0x0052 }
            java.lang.String r7 = r10.f(r7)     // Catch:{ all -> 0x0052 }
            g8.l r0 = g8.p.a(r0, r7)     // Catch:{ all -> 0x0052 }
            r11[r6] = r0     // Catch:{ all -> 0x0052 }
            r0 = 4
            java.lang.String r7 = "X-Crashlytics-API-Client-Version"
            c5.b r8 = r10.f8452c     // Catch:{ all -> 0x0052 }
            java.lang.String r8 = r8.f()     // Catch:{ all -> 0x0052 }
            g8.l r7 = g8.p.a(r7, r8)     // Catch:{ all -> 0x0052 }
            r11[r0] = r7     // Catch:{ all -> 0x0052 }
            java.util.Map r0 = h8.f0.f(r11)     // Catch:{ all -> 0x0052 }
            java.lang.String r7 = "Fetching settings from server."
            android.util.Log.d(r5, r7)     // Catch:{ all -> 0x0052 }
            e5.a r5 = r10.f8453d     // Catch:{ all -> 0x0052 }
            e5.c$c r7 = new e5.c$c     // Catch:{ all -> 0x0052 }
            r7.<init>(r10, r9)     // Catch:{ all -> 0x0052 }
            e5.c$d r8 = new e5.c$d     // Catch:{ all -> 0x0052 }
            r8.<init>(r9)     // Catch:{ all -> 0x0052 }
            r2.f8456m = r4     // Catch:{ all -> 0x0052 }
            r2.f8457n = r9     // Catch:{ all -> 0x0052 }
            r2.f8460q = r6     // Catch:{ all -> 0x0052 }
            java.lang.Object r0 = r5.a(r0, r7, r8, r2)     // Catch:{ all -> 0x0052 }
            if (r0 != r3) goto L_0x014d
            return r3
        L_0x014d:
            r2 = r4
        L_0x014e:
            g8.s r0 = g8.s.f8976a     // Catch:{ all -> 0x003b }
            r2.a(r9)
            return r0
        L_0x0154:
            r2.a(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.c.d(j8.d):java.lang.Object");
    }
}
