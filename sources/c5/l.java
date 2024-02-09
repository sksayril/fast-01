package c5;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import b9.j0;
import b9.k0;
import b9.l0;
import b9.r1;
import g8.s;
import j8.d;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.g;
import r8.p;
import t3.f;
import t3.n;

public final class l {

    /* renamed from: c  reason: collision with root package name */
    public static final b f3751c = new b((g) null);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final f f3752a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final e5.f f3753b;

    @kotlin.coroutines.jvm.internal.f(c = "com.google.firebase.sessions.FirebaseSessions$1", f = "FirebaseSessions.kt", l = {44, 48}, m = "invokeSuspend")
    static final class a extends k implements p<j0, d<? super s>, Object> {

        /* renamed from: m  reason: collision with root package name */
        int f3754m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ l f3755n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ j8.g f3756o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(l lVar, j8.g gVar, d<? super a> dVar) {
            super(2, dVar);
            this.f3755n = lVar;
            this.f3756o = gVar;
        }

        /* access modifiers changed from: private */
        public static final void e(String str, n nVar) {
            Log.w("FirebaseSessions", "FirebaseApp instance deleted. Sessions library will stop collecting data.");
            j0.f3747m.a((g0) null);
        }

        public final d<s> create(Object obj, d<?> dVar) {
            return new a(this.f3755n, this.f3756o, dVar);
        }

        public final Object invoke(j0 j0Var, d<? super s> dVar) {
            return ((a) create(j0Var, dVar)).invokeSuspend(s.f8976a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x007c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = k8.d.d()
                int r1 = r5.f3754m
                java.lang.String r2 = "FirebaseSessions"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0020
                if (r1 == r4) goto L_0x001c
                if (r1 != r3) goto L_0x0014
                g8.n.b(r6)
                goto L_0x006a
            L_0x0014:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x001c:
                g8.n.b(r6)
                goto L_0x002e
            L_0x0020:
                g8.n.b(r6)
                d5.a r6 = d5.a.f8184a
                r5.f3754m = r4
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L_0x002e
                return r0
            L_0x002e:
                java.util.Map r6 = (java.util.Map) r6
                java.util.Collection r6 = r6.values()
                boolean r1 = r6 instanceof java.util.Collection
                if (r1 == 0) goto L_0x003f
                boolean r1 = r6.isEmpty()
                if (r1 == 0) goto L_0x003f
                goto L_0x0056
            L_0x003f:
                java.util.Iterator r6 = r6.iterator()
            L_0x0043:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L_0x0056
                java.lang.Object r1 = r6.next()
                d5.b r1 = (d5.b) r1
                boolean r1 = r1.c()
                if (r1 == 0) goto L_0x0043
                r4 = 0
            L_0x0056:
                if (r4 == 0) goto L_0x005b
                java.lang.String r6 = "No Sessions subscribers. Not listening to lifecycle events."
                goto L_0x0078
            L_0x005b:
                c5.l r6 = r5.f3755n
                e5.f r6 = r6.f3753b
                r5.f3754m = r3
                java.lang.Object r6 = r6.g(r5)
                if (r6 != r0) goto L_0x006a
                return r0
            L_0x006a:
                c5.l r6 = r5.f3755n
                e5.f r6 = r6.f3753b
                boolean r6 = r6.d()
                if (r6 != 0) goto L_0x007c
                java.lang.String r6 = "Sessions SDK disabled. Not listening to lifecycle events."
            L_0x0078:
                android.util.Log.d(r2, r6)
                goto L_0x0096
            L_0x007c:
                c5.g0 r6 = new c5.g0
                j8.g r0 = r5.f3756o
                r6.<init>(r0)
                r6.i()
                c5.j0 r0 = c5.j0.f3747m
                r0.a(r6)
                c5.l r6 = r5.f3755n
                t3.f r6 = r6.f3752a
                c5.k r0 = c5.k.f3750a
                r6.h(r0)
            L_0x0096:
                g8.s r6 = g8.s.f8976a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: c5.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }
    }

    public l(f fVar, e5.f fVar2, j8.g gVar) {
        kotlin.jvm.internal.l.e(fVar, "firebaseApp");
        kotlin.jvm.internal.l.e(fVar2, "settings");
        kotlin.jvm.internal.l.e(gVar, "backgroundDispatcher");
        this.f3752a = fVar;
        this.f3753b = fVar2;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        Context applicationContext = fVar.m().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(j0.f3747m);
            r1 unused = i.d(k0.a(gVar), (j8.g) null, (l0) null, new a(this, gVar, (d<? super a>) null), 3, (Object) null);
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }
}
