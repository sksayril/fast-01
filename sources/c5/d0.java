package c5;

import android.util.Log;
import b9.j0;
import b9.k0;
import b9.l0;
import b9.r1;
import g8.s;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import r8.p;
import t3.f;

public final class d0 implements c0 {

    /* renamed from: g  reason: collision with root package name */
    public static final a f3686g = new a((g) null);

    /* renamed from: h  reason: collision with root package name */
    private static final double f3687h = Math.random();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final f f3688b;

    /* renamed from: c  reason: collision with root package name */
    private final t4.d f3689c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final e5.f f3690d;

    /* renamed from: e  reason: collision with root package name */
    private final i f3691e;

    /* renamed from: f  reason: collision with root package name */
    private final j8.g f3692f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", l = {113}, m = "getFirebaseInstallationId")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f3693m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ d0 f3694n;

        /* renamed from: o  reason: collision with root package name */
        int f3695o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d0 d0Var, j8.d<? super b> dVar) {
            super(dVar);
            this.f3694n = d0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f3693m = obj;
            this.f3695o |= Integer.MIN_VALUE;
            return this.f3694n.h(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1", f = "SessionFirelogPublisher.kt", l = {64, 72, 73}, m = "invokeSuspend")
    static final class c extends k implements p<j0, j8.d<? super s>, Object> {

        /* renamed from: m  reason: collision with root package name */
        Object f3696m;

        /* renamed from: n  reason: collision with root package name */
        Object f3697n;

        /* renamed from: o  reason: collision with root package name */
        Object f3698o;

        /* renamed from: p  reason: collision with root package name */
        Object f3699p;

        /* renamed from: q  reason: collision with root package name */
        Object f3700q;

        /* renamed from: r  reason: collision with root package name */
        Object f3701r;

        /* renamed from: s  reason: collision with root package name */
        Object f3702s;

        /* renamed from: t  reason: collision with root package name */
        Object f3703t;

        /* renamed from: u  reason: collision with root package name */
        int f3704u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ d0 f3705v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ z f3706w;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(d0 d0Var, z zVar, j8.d<? super c> dVar) {
            super(2, dVar);
            this.f3705v = d0Var;
            this.f3706w = zVar;
        }

        public final j8.d<s> create(Object obj, j8.d<?> dVar) {
            return new c(this.f3705v, this.f3706w, dVar);
        }

        public final Object invoke(j0 j0Var, j8.d<? super s> dVar) {
            return ((c) create(j0Var, dVar)).invokeSuspend(s.f8976a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x00f8 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00f9  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = k8.d.d()
                int r1 = r14.f3704u
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x006d
                if (r1 == r4) goto L_0x0069
                if (r1 == r3) goto L_0x0048
                if (r1 != r2) goto L_0x0040
                java.lang.Object r0 = r14.f3703t
                java.util.Map r0 = (java.util.Map) r0
                java.lang.Object r1 = r14.f3702s
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r2 = r14.f3701r
                c5.u r2 = (c5.u) r2
                java.lang.Object r3 = r14.f3700q
                e5.f r3 = (e5.f) r3
                java.lang.Object r4 = r14.f3699p
                c5.z r4 = (c5.z) r4
                java.lang.Object r5 = r14.f3698o
                t3.f r5 = (t3.f) r5
                java.lang.Object r6 = r14.f3697n
                c5.b0 r6 = (c5.b0) r6
                java.lang.Object r7 = r14.f3696m
                c5.d0 r7 = (c5.d0) r7
                g8.n.b(r15)
                r8 = r7
                r11 = r6
                r6 = r0
                r0 = r11
                r12 = r5
                r5 = r1
                r1 = r12
                r13 = r4
                r4 = r2
                r2 = r13
                goto L_0x0103
            L_0x0040:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x0048:
                java.lang.Object r1 = r14.f3702s
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r3 = r14.f3701r
                c5.u r3 = (c5.u) r3
                java.lang.Object r4 = r14.f3700q
                e5.f r4 = (e5.f) r4
                java.lang.Object r5 = r14.f3699p
                c5.z r5 = (c5.z) r5
                java.lang.Object r6 = r14.f3698o
                t3.f r6 = (t3.f) r6
                java.lang.Object r7 = r14.f3697n
                c5.b0 r7 = (c5.b0) r7
                java.lang.Object r8 = r14.f3696m
                c5.d0 r8 = (c5.d0) r8
                g8.n.b(r15)
                goto L_0x00dc
            L_0x0069:
                g8.n.b(r15)
                goto L_0x007b
            L_0x006d:
                g8.n.b(r15)
                c5.d0 r15 = r14.f3705v
                r14.f3704u = r4
                java.lang.Object r15 = r15.j(r14)
                if (r15 != r0) goto L_0x007b
                return r0
            L_0x007b:
                java.lang.Boolean r15 = (java.lang.Boolean) r15
                boolean r15 = r15.booleanValue()
                if (r15 == 0) goto L_0x0112
                c5.d0 r15 = r14.f3705v
                c5.b0 r1 = c5.b0.f3647a
                t3.f r4 = r15.f3688b
                c5.z r5 = r14.f3706w
                c5.d0 r6 = r14.f3705v
                e5.f r6 = r6.f3690d
                c5.v r7 = c5.v.f3769a
                c5.d0 r8 = r14.f3705v
                t3.f r8 = r8.f3688b
                android.content.Context r8 = r8.m()
                java.lang.String r9 = "firebaseApp.applicationContext"
                kotlin.jvm.internal.l.d(r8, r9)
                c5.u r8 = r7.d(r8)
                c5.d0 r10 = r14.f3705v
                t3.f r10 = r10.f3688b
                android.content.Context r10 = r10.m()
                kotlin.jvm.internal.l.d(r10, r9)
                java.util.List r7 = r7.c(r10)
                d5.a r9 = d5.a.f8184a
                r14.f3696m = r15
                r14.f3697n = r1
                r14.f3698o = r4
                r14.f3699p = r5
                r14.f3700q = r6
                r14.f3701r = r8
                r14.f3702s = r7
                r14.f3704u = r3
                java.lang.Object r3 = r9.c(r14)
                if (r3 != r0) goto L_0x00d2
                return r0
            L_0x00d2:
                r11 = r8
                r8 = r15
                r15 = r3
                r3 = r11
                r12 = r7
                r7 = r1
                r1 = r12
                r13 = r6
                r6 = r4
                r4 = r13
            L_0x00dc:
                java.util.Map r15 = (java.util.Map) r15
                c5.d0 r9 = r14.f3705v
                r14.f3696m = r8
                r14.f3697n = r7
                r14.f3698o = r6
                r14.f3699p = r5
                r14.f3700q = r4
                r14.f3701r = r3
                r14.f3702s = r1
                r14.f3703t = r15
                r14.f3704u = r2
                java.lang.Object r2 = r9.h(r14)
                if (r2 != r0) goto L_0x00f9
                return r0
            L_0x00f9:
                r0 = r7
                r11 = r6
                r6 = r15
                r15 = r2
                r2 = r5
                r5 = r1
                r1 = r11
                r12 = r4
                r4 = r3
                r3 = r12
            L_0x0103:
                java.lang.String r7 = "getFirebaseInstallationId()"
                kotlin.jvm.internal.l.d(r15, r7)
                r7 = r15
                java.lang.String r7 = (java.lang.String) r7
                c5.a0 r15 = r0.a(r1, r2, r3, r4, r5, r6, r7)
                r8.g(r15)
            L_0x0112:
                g8.s r15 = g8.s.f8976a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: c5.d0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", f = "SessionFirelogPublisher.kt", l = {95}, m = "shouldLogSession")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: m  reason: collision with root package name */
        Object f3707m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f3708n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ d0 f3709o;

        /* renamed from: p  reason: collision with root package name */
        int f3710p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(d0 d0Var, j8.d<? super d> dVar) {
            super(dVar);
            this.f3709o = d0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f3708n = obj;
            this.f3710p |= Integer.MIN_VALUE;
            return this.f3709o.j(this);
        }
    }

    public d0(f fVar, t4.d dVar, e5.f fVar2, i iVar, j8.g gVar) {
        l.e(fVar, "firebaseApp");
        l.e(dVar, "firebaseInstallations");
        l.e(fVar2, "sessionSettings");
        l.e(iVar, "eventGDTLogger");
        l.e(gVar, "backgroundDispatcher");
        this.f3688b = fVar;
        this.f3689c = dVar;
        this.f3690d = fVar2;
        this.f3691e = iVar;
        this.f3692f = gVar;
    }

    /* access modifiers changed from: private */
    public final void g(a0 a0Var) {
        try {
            this.f3691e.a(a0Var);
            Log.d("SessionFirelogPublisher", "Successfully logged Session Start event: " + a0Var.c().e());
        } catch (RuntimeException e10) {
            Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e10);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(j8.d<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof c5.d0.b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            c5.d0$b r0 = (c5.d0.b) r0
            int r1 = r0.f3695o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f3695o = r1
            goto L_0x0018
        L_0x0013:
            c5.d0$b r0 = new c5.d0$b
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f3693m
            java.lang.Object r1 = k8.d.d()
            int r2 = r0.f3695o
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            g8.n.b(r5)     // Catch:{ Exception -> 0x0029 }
            goto L_0x004a
        L_0x0029:
            r5 = move-exception
            goto L_0x004d
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            g8.n.b(r5)
            t4.d r5 = r4.f3689c     // Catch:{ Exception -> 0x0029 }
            d3.j r5 = r5.a()     // Catch:{ Exception -> 0x0029 }
            java.lang.String r2 = "firebaseInstallations.id"
            kotlin.jvm.internal.l.d(r5, r2)     // Catch:{ Exception -> 0x0029 }
            r0.f3695o = r3     // Catch:{ Exception -> 0x0029 }
            java.lang.Object r5 = l9.b.a(r5, r0)     // Catch:{ Exception -> 0x0029 }
            if (r5 != r1) goto L_0x004a
            return r1
        L_0x004a:
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0029 }
            goto L_0x0056
        L_0x004d:
            java.lang.String r0 = "SessionFirelogPublisher"
            java.lang.String r1 = "Error getting Firebase Installation ID. Using an empty ID"
            android.util.Log.e(r0, r1, r5)
            java.lang.String r5 = ""
        L_0x0056:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.d0.h(j8.d):java.lang.Object");
    }

    private final boolean i() {
        return f3687h <= this.f3690d.b();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(j8.d<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof c5.d0.d
            if (r0 == 0) goto L_0x0013
            r0 = r6
            c5.d0$d r0 = (c5.d0.d) r0
            int r1 = r0.f3710p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f3710p = r1
            goto L_0x0018
        L_0x0013:
            c5.d0$d r0 = new c5.d0$d
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f3708n
            java.lang.Object r1 = k8.d.d()
            int r2 = r0.f3710p
            java.lang.String r3 = "SessionFirelogPublisher"
            r4 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r4) goto L_0x002f
            java.lang.Object r0 = r0.f3707m
            c5.d0 r0 = (c5.d0) r0
            g8.n.b(r6)
            goto L_0x004d
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0037:
            g8.n.b(r6)
            java.lang.String r6 = "Data Collection is enabled for at least one Subscriber"
            android.util.Log.d(r3, r6)
            e5.f r6 = r5.f3690d
            r0.f3707m = r5
            r0.f3710p = r4
            java.lang.Object r6 = r6.g(r0)
            if (r6 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r0 = r5
        L_0x004d:
            e5.f r6 = r0.f3690d
            boolean r6 = r6.d()
            r1 = 0
            if (r6 != 0) goto L_0x0060
            java.lang.String r6 = "Sessions SDK disabled. Events will not be sent."
        L_0x0058:
            android.util.Log.d(r3, r6)
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r1)
            return r6
        L_0x0060:
            boolean r6 = r0.i()
            if (r6 != 0) goto L_0x0069
            java.lang.String r6 = "Sessions SDK has dropped this session due to sampling."
            goto L_0x0058
        L_0x0069:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c5.d0.j(j8.d):java.lang.Object");
    }

    public void a(z zVar) {
        l.e(zVar, "sessionDetails");
        r1 unused = i.d(k0.a(this.f3692f), (j8.g) null, (l0) null, new c(this, zVar, (j8.d<? super c>) null), 3, (Object) null);
    }
}
