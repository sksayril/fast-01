package e5;

import a9.b;
import a9.e;
import android.content.Context;
import b9.j0;
import c0.d;
import c5.w;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.v;
import r8.l;
import t3.c;
import t3.m;
import x8.h;

public final class f {

    /* renamed from: c  reason: collision with root package name */
    public static final a f8482c = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final t8.a<Context, z.f<d>> f8483d = b0.a.b(w.f3770a.b(), (a0.b) null, (l) null, (j0) null, 14, (Object) null);

    /* renamed from: a  reason: collision with root package name */
    private final h f8484a;

    /* renamed from: b  reason: collision with root package name */
    private final h f8485b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ h<Object>[] f8486a = {v.e(new r(a.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final z.f<d> b(Context context) {
            return (z.f) f.f8483d.a(context, f8486a[0]);
        }

        public final f c() {
            Object k10 = m.a(c.f12403a).k(f.class);
            kotlin.jvm.internal.l.d(k10, "Firebase.app[SessionsSettings::class.java]");
            return (f) k10;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.settings.SessionsSettings", f = "SessionsSettings.kt", l = {134, 135}, m = "updateSettings")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: m  reason: collision with root package name */
        Object f8487m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f8488n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ f f8489o;

        /* renamed from: p  reason: collision with root package name */
        int f8490p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar, j8.d<? super b> dVar) {
            super(dVar);
            this.f8489o = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f8488n = obj;
            this.f8490p |= Integer.MIN_VALUE;
            return this.f8489o.g(this);
        }
    }

    private f(Context context, j8.g gVar, j8.g gVar2, t4.d dVar, c5.b bVar) {
        this(new b(context), new c(gVar2, dVar, bVar, new d(bVar, gVar, (String) null, 4, (g) null), f8482c.b(context)));
    }

    public f(h hVar, h hVar2) {
        kotlin.jvm.internal.l.e(hVar, "localOverrideSettings");
        kotlin.jvm.internal.l.e(hVar2, "remoteSettings");
        this.f8484a = hVar;
        this.f8485b = hVar2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public f(t3.f r8, j8.g r9, j8.g r10, t4.d r11) {
        /*
            r7 = this;
            java.lang.String r0 = "firebaseApp"
            kotlin.jvm.internal.l.e(r8, r0)
            java.lang.String r0 = "blockingDispatcher"
            kotlin.jvm.internal.l.e(r9, r0)
            java.lang.String r0 = "backgroundDispatcher"
            kotlin.jvm.internal.l.e(r10, r0)
            java.lang.String r0 = "firebaseInstallationsApi"
            kotlin.jvm.internal.l.e(r11, r0)
            android.content.Context r2 = r8.m()
            java.lang.String r0 = "firebaseApp.applicationContext"
            kotlin.jvm.internal.l.d(r2, r0)
            c5.b0 r0 = c5.b0.f3647a
            c5.b r6 = r0.b(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.f.<init>(t3.f, j8.g, j8.g, t4.d):void");
    }

    private final boolean e(double d10) {
        return 0.0d <= d10 && d10 <= 1.0d;
    }

    private final boolean f(long j10) {
        return a9.b.I(j10) && a9.b.D(j10);
    }

    public final double b() {
        Double b10 = this.f8484a.b();
        if (b10 != null) {
            double doubleValue = b10.doubleValue();
            if (e(doubleValue)) {
                return doubleValue;
            }
        }
        Double b11 = this.f8485b.b();
        if (b11 == null) {
            return 1.0d;
        }
        double doubleValue2 = b11.doubleValue();
        if (e(doubleValue2)) {
            return doubleValue2;
        }
        return 1.0d;
    }

    public final long c() {
        a9.b c10 = this.f8484a.c();
        if (c10 != null) {
            long M = c10.M();
            if (f(M)) {
                return M;
            }
        }
        a9.b c11 = this.f8485b.c();
        if (c11 != null) {
            long M2 = c11.M();
            if (f(M2)) {
                return M2;
            }
        }
        b.a aVar = a9.b.f50n;
        return a9.d.h(30, e.MINUTES);
    }

    public final boolean d() {
        Boolean a10 = this.f8484a.a();
        if (a10 != null) {
            return a10.booleanValue();
        }
        Boolean a11 = this.f8485b.a();
        if (a11 != null) {
            return a11.booleanValue();
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(j8.d<? super g8.s> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof e5.f.b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            e5.f$b r0 = (e5.f.b) r0
            int r1 = r0.f8490p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8490p = r1
            goto L_0x0018
        L_0x0013:
            e5.f$b r0 = new e5.f$b
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f8488n
            java.lang.Object r1 = k8.d.d()
            int r2 = r0.f8490p
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            g8.n.b(r6)
            goto L_0x005b
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            java.lang.Object r2 = r0.f8487m
            e5.f r2 = (e5.f) r2
            g8.n.b(r6)
            goto L_0x004d
        L_0x003c:
            g8.n.b(r6)
            e5.h r6 = r5.f8484a
            r0.f8487m = r5
            r0.f8490p = r4
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L_0x004c
            return r1
        L_0x004c:
            r2 = r5
        L_0x004d:
            e5.h r6 = r2.f8485b
            r2 = 0
            r0.f8487m = r2
            r0.f8490p = r3
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L_0x005b
            return r1
        L_0x005b:
            g8.s r6 = g8.s.f8976a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e5.f.g(j8.d):java.lang.Object");
    }
}
