package z;

import b9.j0;
import b9.l0;
import b9.r1;
import d9.f;
import d9.g;
import d9.j;
import g8.s;
import j8.d;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.internal.m;
import r8.p;

public final class l<T> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final j0 f13352a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final p<T, d<? super s>, Object> f13353b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final d9.d<T> f13354c = f.b(Integer.MAX_VALUE, (d9.a) null, (r8.l) null, 6, (Object) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final AtomicInteger f13355d = new AtomicInteger(0);

    static final class a extends m implements r8.l<Throwable, s> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ r8.l<Throwable, s> f13356m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ l<T> f13357n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ p<T, Throwable, s> f13358o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(r8.l<? super Throwable, s> lVar, l<T> lVar2, p<? super T, ? super Throwable, s> pVar) {
            super(1);
            this.f13356m = lVar;
            this.f13357n = lVar2;
            this.f13358o = pVar;
        }

        public final void b(Throwable th) {
            s sVar;
            this.f13356m.invoke(th);
            this.f13357n.f13354c.a(th);
            do {
                Object f10 = g.f(this.f13357n.f13354c.c());
                if (f10 == null) {
                    sVar = null;
                    continue;
                } else {
                    this.f13358o.invoke(f10, th);
                    sVar = s.f8976a;
                    continue;
                }
            } while (sVar != null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return s.f8976a;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {122, 122}, m = "invokeSuspend")
    static final class b extends k implements p<j0, d<? super s>, Object> {

        /* renamed from: m  reason: collision with root package name */
        Object f13359m;

        /* renamed from: n  reason: collision with root package name */
        int f13360n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ l<T> f13361o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(l<T> lVar, d<? super b> dVar) {
            super(2, dVar);
            this.f13361o = lVar;
        }

        public final d<s> create(Object obj, d<?> dVar) {
            return new b(this.f13361o, dVar);
        }

        public final Object invoke(j0 j0Var, d<? super s> dVar) {
            return ((b) create(j0Var, dVar)).invokeSuspend(s.f8976a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x007a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = k8.d.d()
                int r1 = r7.f13360n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0026
                if (r1 == r3) goto L_0x001b
                if (r1 != r2) goto L_0x0013
                g8.n.b(r8)
                r8 = r7
                goto L_0x006e
            L_0x0013:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x001b:
                java.lang.Object r1 = r7.f13359m
                r8.p r1 = (r8.p) r1
                g8.n.b(r8)
                r4 = r1
                r1 = r0
                r0 = r7
                goto L_0x0060
            L_0x0026:
                g8.n.b(r8)
                z.l<T> r8 = r7.f13361o
                java.util.concurrent.atomic.AtomicInteger r8 = r8.f13355d
                int r8 = r8.get()
                if (r8 <= 0) goto L_0x0037
                r8 = 1
                goto L_0x0038
            L_0x0037:
                r8 = 0
            L_0x0038:
                if (r8 == 0) goto L_0x007d
                r8 = r7
            L_0x003b:
                z.l<T> r1 = r8.f13361o
                b9.j0 r1 = r1.f13352a
                b9.k0.d(r1)
                z.l<T> r1 = r8.f13361o
                r8.p r1 = r1.f13353b
                z.l<T> r4 = r8.f13361o
                d9.d r4 = r4.f13354c
                r8.f13359m = r1
                r8.f13360n = r3
                java.lang.Object r4 = r4.b(r8)
                if (r4 != r0) goto L_0x005b
                return r0
            L_0x005b:
                r6 = r0
                r0 = r8
                r8 = r4
                r4 = r1
                r1 = r6
            L_0x0060:
                r5 = 0
                r0.f13359m = r5
                r0.f13360n = r2
                java.lang.Object r8 = r4.invoke(r8, r0)
                if (r8 != r1) goto L_0x006c
                return r1
            L_0x006c:
                r8 = r0
                r0 = r1
            L_0x006e:
                z.l<T> r1 = r8.f13361o
                java.util.concurrent.atomic.AtomicInteger r1 = r1.f13355d
                int r1 = r1.decrementAndGet()
                if (r1 != 0) goto L_0x003b
                g8.s r8 = g8.s.f8976a
                return r8
            L_0x007d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: z.l.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public l(j0 j0Var, r8.l<? super Throwable, s> lVar, p<? super T, ? super Throwable, s> pVar, p<? super T, ? super d<? super s>, ? extends Object> pVar2) {
        kotlin.jvm.internal.l.e(j0Var, "scope");
        kotlin.jvm.internal.l.e(lVar, "onComplete");
        kotlin.jvm.internal.l.e(pVar, "onUndeliveredElement");
        kotlin.jvm.internal.l.e(pVar2, "consumeMessage");
        this.f13352a = j0Var;
        this.f13353b = pVar2;
        r1 r1Var = (r1) j0Var.e().a(r1.f3485c);
        if (r1Var != null) {
            r1Var.h(new a(lVar, this, pVar));
        }
    }

    public final void e(T t9) {
        Object d10 = this.f13354c.d(t9);
        if (d10 instanceof g.a) {
            Throwable e10 = g.e(d10);
            if (e10 == null) {
                e10 = new j("Channel was closed normally");
            }
            throw e10;
        } else if (!g.i(d10)) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (this.f13355d.getAndIncrement() == 0) {
            r1 unused = i.d(this.f13352a, (j8.g) null, (l0) null, new b(this, (d<? super b>) null), 3, (Object) null);
        }
    }
}
