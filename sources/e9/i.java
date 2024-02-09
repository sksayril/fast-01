package e9;

import g8.s;
import j8.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.t;
import r8.p;

final /* synthetic */ class i {

    public static final class a implements b<T> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ b f8551m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ p f8552n;

        public a(b bVar, p pVar) {
            this.f8551m = bVar;
            this.f8552n = pVar;
        }

        public Object a(c<? super T> cVar, d<? super s> dVar) {
            Object a10 = this.f8551m.a(new b(new t(), cVar, this.f8552n), dVar);
            return a10 == d.d() ? a10 : s.f8976a;
        }
    }

    static final class b<T> implements c {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ t f8553m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ c<T> f8554n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ p<T, d<? super Boolean>, Object> f8555o;

        @f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {37, 38, 40}, m = "emit")
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: m  reason: collision with root package name */
            Object f8556m;

            /* renamed from: n  reason: collision with root package name */
            Object f8557n;

            /* renamed from: o  reason: collision with root package name */
            /* synthetic */ Object f8558o;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ b<T> f8559p;

            /* renamed from: q  reason: collision with root package name */
            int f8560q;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b<? super T> bVar, d<? super a> dVar) {
                super(dVar);
                this.f8559p = bVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f8558o = obj;
                this.f8560q |= Integer.MIN_VALUE;
                return this.f8559p.emit(null, this);
            }
        }

        b(t tVar, c<? super T> cVar, p<? super T, ? super d<? super Boolean>, ? extends Object> pVar) {
            this.f8553m = tVar;
            this.f8554n = cVar;
            this.f8555o = pVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x008b  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(T r7, j8.d<? super g8.s> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof e9.i.b.a
                if (r0 == 0) goto L_0x0013
                r0 = r8
                e9.i$b$a r0 = (e9.i.b.a) r0
                int r1 = r0.f8560q
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f8560q = r1
                goto L_0x0018
            L_0x0013:
                e9.i$b$a r0 = new e9.i$b$a
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.f8558o
                java.lang.Object r1 = k8.d.d()
                int r2 = r0.f8560q
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L_0x0045
                if (r2 == r5) goto L_0x0041
                if (r2 == r4) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                g8.n.b(r8)
                goto L_0x0088
            L_0x002f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0037:
                java.lang.Object r7 = r0.f8557n
                java.lang.Object r2 = r0.f8556m
                e9.i$b r2 = (e9.i.b) r2
                g8.n.b(r8)
                goto L_0x006c
            L_0x0041:
                g8.n.b(r8)
                goto L_0x0059
            L_0x0045:
                g8.n.b(r8)
                kotlin.jvm.internal.t r8 = r6.f8553m
                boolean r8 = r8.f11077m
                if (r8 == 0) goto L_0x005c
                e9.c<T> r8 = r6.f8554n
                r0.f8560q = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L_0x0059
                return r1
            L_0x0059:
                g8.s r7 = g8.s.f8976a
                return r7
            L_0x005c:
                r8.p<T, j8.d<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f8555o
                r0.f8556m = r6
                r0.f8557n = r7
                r0.f8560q = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L_0x006b
                return r1
            L_0x006b:
                r2 = r6
            L_0x006c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L_0x008b
                kotlin.jvm.internal.t r8 = r2.f8553m
                r8.f11077m = r5
                e9.c<T> r8 = r2.f8554n
                r2 = 0
                r0.f8556m = r2
                r0.f8557n = r2
                r0.f8560q = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L_0x0088
                return r1
            L_0x0088:
                g8.s r7 = g8.s.f8976a
                return r7
            L_0x008b:
                g8.s r7 = g8.s.f8976a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: e9.i.b.emit(java.lang.Object, j8.d):java.lang.Object");
        }
    }

    public static final <T> b<T> a(b<? extends T> bVar, p<? super T, ? super d<? super Boolean>, ? extends Object> pVar) {
        return new a(bVar, pVar);
    }
}
