package e9;

import b9.r1;
import g8.s;
import j8.g;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.u;
import r8.q;

final /* synthetic */ class h {

    public static final class a implements b<T> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ b f8535m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ q f8536n;

        @f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", l = {113, 114}, m = "collect")
        /* renamed from: e9.h$a$a  reason: collision with other inner class name */
        public static final class C0133a extends d {

            /* renamed from: m  reason: collision with root package name */
            /* synthetic */ Object f8537m;

            /* renamed from: n  reason: collision with root package name */
            int f8538n;

            /* renamed from: o  reason: collision with root package name */
            final /* synthetic */ a f8539o;

            /* renamed from: p  reason: collision with root package name */
            Object f8540p;

            /* renamed from: q  reason: collision with root package name */
            Object f8541q;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0133a(a aVar, j8.d dVar) {
                super(dVar);
                this.f8539o = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f8537m = obj;
                this.f8538n |= Integer.MIN_VALUE;
                return this.f8539o.a((c) null, this);
            }
        }

        public a(b bVar, q qVar) {
            this.f8535m = bVar;
            this.f8536n = qVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a(e9.c<? super T> r6, j8.d<? super g8.s> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof e9.h.a.C0133a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                e9.h$a$a r0 = (e9.h.a.C0133a) r0
                int r1 = r0.f8538n
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f8538n = r1
                goto L_0x0018
            L_0x0013:
                e9.h$a$a r0 = new e9.h$a$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f8537m
                java.lang.Object r1 = k8.d.d()
                int r2 = r0.f8538n
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0040
                if (r2 == r4) goto L_0x0034
                if (r2 != r3) goto L_0x002c
                g8.n.b(r7)
                goto L_0x006f
            L_0x002c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0034:
                java.lang.Object r6 = r0.f8541q
                e9.c r6 = (e9.c) r6
                java.lang.Object r2 = r0.f8540p
                e9.h$a r2 = (e9.h.a) r2
                g8.n.b(r7)
                goto L_0x0053
            L_0x0040:
                g8.n.b(r7)
                e9.b r7 = r5.f8535m
                r0.f8540p = r5
                r0.f8541q = r6
                r0.f8538n = r4
                java.lang.Object r7 = e9.d.b(r7, r6, r0)
                if (r7 != r1) goto L_0x0052
                return r1
            L_0x0052:
                r2 = r5
            L_0x0053:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L_0x006f
                r8.q r2 = r2.f8536n
                r4 = 0
                r0.f8540p = r4
                r0.f8541q = r4
                r0.f8538n = r3
                r3 = 6
                kotlin.jvm.internal.k.a(r3)
                java.lang.Object r6 = r2.a(r6, r7, r0)
                r7 = 7
                kotlin.jvm.internal.k.a(r7)
                if (r6 != r1) goto L_0x006f
                return r1
            L_0x006f:
                g8.s r6 = g8.s.f8976a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: e9.h.a.a(e9.c, j8.d):java.lang.Object");
        }
    }

    @f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", l = {156}, m = "catchImpl")
    static final class b<T> extends d {

        /* renamed from: m  reason: collision with root package name */
        Object f8542m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f8543n;

        /* renamed from: o  reason: collision with root package name */
        int f8544o;

        b(j8.d<? super b> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f8543n = obj;
            this.f8544o |= Integer.MIN_VALUE;
            return d.b((b) null, (c) null, this);
        }
    }

    static final class c<T> implements c {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ c<T> f8545m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ u<Throwable> f8546n;

        @f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", l = {158}, m = "emit")
        static final class a extends d {

            /* renamed from: m  reason: collision with root package name */
            Object f8547m;

            /* renamed from: n  reason: collision with root package name */
            /* synthetic */ Object f8548n;

            /* renamed from: o  reason: collision with root package name */
            final /* synthetic */ c<T> f8549o;

            /* renamed from: p  reason: collision with root package name */
            int f8550p;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c<? super T> cVar, j8.d<? super a> dVar) {
                super(dVar);
                this.f8549o = cVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f8548n = obj;
                this.f8550p |= Integer.MIN_VALUE;
                return this.f8549o.emit(null, this);
            }
        }

        c(c<? super T> cVar, u<Throwable> uVar) {
            this.f8545m = cVar;
            this.f8546n = uVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(T r5, j8.d<? super g8.s> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof e9.h.c.a
                if (r0 == 0) goto L_0x0013
                r0 = r6
                e9.h$c$a r0 = (e9.h.c.a) r0
                int r1 = r0.f8550p
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f8550p = r1
                goto L_0x0018
            L_0x0013:
                e9.h$c$a r0 = new e9.h$c$a
                r0.<init>(r4, r6)
            L_0x0018:
                java.lang.Object r6 = r0.f8548n
                java.lang.Object r1 = k8.d.d()
                int r2 = r0.f8550p
                r3 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                java.lang.Object r5 = r0.f8547m
                e9.h$c r5 = (e9.h.c) r5
                g8.n.b(r6)     // Catch:{ all -> 0x002d }
                goto L_0x0047
            L_0x002d:
                r6 = move-exception
                goto L_0x004c
            L_0x002f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0037:
                g8.n.b(r6)
                e9.c<T> r6 = r4.f8545m     // Catch:{ all -> 0x004a }
                r0.f8547m = r4     // Catch:{ all -> 0x004a }
                r0.f8550p = r3     // Catch:{ all -> 0x004a }
                java.lang.Object r5 = r6.emit(r5, r0)     // Catch:{ all -> 0x004a }
                if (r5 != r1) goto L_0x0047
                return r1
            L_0x0047:
                g8.s r5 = g8.s.f8976a
                return r5
            L_0x004a:
                r6 = move-exception
                r5 = r4
            L_0x004c:
                kotlin.jvm.internal.u<java.lang.Throwable> r5 = r5.f8546n
                r5.f11078m = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: e9.h.c.emit(java.lang.Object, j8.d):java.lang.Object");
        }
    }

    public static final <T> b<T> a(b<? extends T> bVar, q<? super c<? super T>, ? super Throwable, ? super j8.d<? super s>, ? extends Object> qVar) {
        return new a(bVar, qVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object b(e9.b<? extends T> r4, e9.c<? super T> r5, j8.d<? super java.lang.Throwable> r6) {
        /*
            boolean r0 = r6 instanceof e9.h.b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            e9.h$b r0 = (e9.h.b) r0
            int r1 = r0.f8544o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8544o = r1
            goto L_0x0018
        L_0x0013:
            e9.h$b r0 = new e9.h$b
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f8543n
            java.lang.Object r1 = k8.d.d()
            int r2 = r0.f8544o
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r4 = r0.f8542m
            kotlin.jvm.internal.u r4 = (kotlin.jvm.internal.u) r4
            g8.n.b(r6)     // Catch:{ all -> 0x002d }
            goto L_0x004f
        L_0x002d:
            r5 = move-exception
            goto L_0x0053
        L_0x002f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0037:
            g8.n.b(r6)
            kotlin.jvm.internal.u r6 = new kotlin.jvm.internal.u
            r6.<init>()
            e9.h$c r2 = new e9.h$c     // Catch:{ all -> 0x0051 }
            r2.<init>(r5, r6)     // Catch:{ all -> 0x0051 }
            r0.f8542m = r6     // Catch:{ all -> 0x0051 }
            r0.f8544o = r3     // Catch:{ all -> 0x0051 }
            java.lang.Object r4 = r4.a(r2, r0)     // Catch:{ all -> 0x0051 }
            if (r4 != r1) goto L_0x004f
            return r1
        L_0x004f:
            r4 = 0
            return r4
        L_0x0051:
            r5 = move-exception
            r4 = r6
        L_0x0053:
            T r4 = r4.f11078m
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = d(r5, r4)
            if (r6 != 0) goto L_0x0076
            j8.g r6 = r0.getContext()
            boolean r6 = c(r5, r6)
            if (r6 != 0) goto L_0x0076
            if (r4 != 0) goto L_0x006a
            return r5
        L_0x006a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L_0x0072
            g8.b.a(r4, r5)
            throw r4
        L_0x0072:
            g8.b.a(r5, r4)
            throw r5
        L_0x0076:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.h.b(e9.b, e9.c, j8.d):java.lang.Object");
    }

    private static final boolean c(Throwable th, g gVar) {
        r1 r1Var = (r1) gVar.a(r1.f3485c);
        if (r1Var == null || !r1Var.isCancelled()) {
            return false;
        }
        return d(th, r1Var.y());
    }

    private static final boolean d(Throwable th, Throwable th2) {
        return th2 != null && l.a(th2, th);
    }
}
