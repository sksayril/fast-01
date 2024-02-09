package k8;

import g8.n;
import g8.s;
import j8.g;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.y;
import r8.l;
import r8.p;

class c {

    public static final class a extends j {

        /* renamed from: m  reason: collision with root package name */
        private int f11015m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ l f11016n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(j8.d dVar, l lVar) {
            super(dVar);
            this.f11016n = lVar;
            kotlin.jvm.internal.l.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            int i10 = this.f11015m;
            if (i10 == 0) {
                this.f11015m = 1;
                n.b(obj);
                kotlin.jvm.internal.l.c(this.f11016n, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                return ((l) y.b(this.f11016n, 1)).invoke(this);
            } else if (i10 == 1) {
                this.f11015m = 2;
                n.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: m  reason: collision with root package name */
        private int f11017m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ l f11018n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(j8.d dVar, g gVar, l lVar) {
            super(dVar, gVar);
            this.f11018n = lVar;
            kotlin.jvm.internal.l.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            int i10 = this.f11017m;
            if (i10 == 0) {
                this.f11017m = 1;
                n.b(obj);
                kotlin.jvm.internal.l.c(this.f11018n, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                return ((l) y.b(this.f11018n, 1)).invoke(this);
            } else if (i10 == 1) {
                this.f11017m = 2;
                n.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: k8.c$c  reason: collision with other inner class name */
    public static final class C0172c extends j {

        /* renamed from: m  reason: collision with root package name */
        private int f11019m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ p f11020n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ Object f11021o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0172c(j8.d dVar, p pVar, Object obj) {
            super(dVar);
            this.f11020n = pVar;
            this.f11021o = obj;
            kotlin.jvm.internal.l.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            int i10 = this.f11019m;
            if (i10 == 0) {
                this.f11019m = 1;
                n.b(obj);
                kotlin.jvm.internal.l.c(this.f11020n, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) y.b(this.f11020n, 2)).invoke(this.f11021o, this);
            } else if (i10 == 1) {
                this.f11019m = 2;
                n.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: m  reason: collision with root package name */
        private int f11022m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ p f11023n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ Object f11024o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(j8.d dVar, g gVar, p pVar, Object obj) {
            super(dVar, gVar);
            this.f11023n = pVar;
            this.f11024o = obj;
            kotlin.jvm.internal.l.c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            int i10 = this.f11022m;
            if (i10 == 0) {
                this.f11022m = 1;
                n.b(obj);
                kotlin.jvm.internal.l.c(this.f11023n, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((p) y.b(this.f11023n, 2)).invoke(this.f11024o, this);
            } else if (i10 == 1) {
                this.f11022m = 2;
                n.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    public static <T> j8.d<s> a(l<? super j8.d<? super T>, ? extends Object> lVar, j8.d<? super T> dVar) {
        kotlin.jvm.internal.l.e(lVar, "<this>");
        kotlin.jvm.internal.l.e(dVar, "completion");
        j8.d<? super T> a10 = h.a(dVar);
        if (lVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) lVar).create(a10);
        }
        g context = a10.getContext();
        return context == j8.h.f10863m ? new a(a10, lVar) : new b(a10, context, lVar);
    }

    public static <R, T> j8.d<s> b(p<? super R, ? super j8.d<? super T>, ? extends Object> pVar, R r9, j8.d<? super T> dVar) {
        kotlin.jvm.internal.l.e(pVar, "<this>");
        kotlin.jvm.internal.l.e(dVar, "completion");
        j8.d<? super T> a10 = h.a(dVar);
        if (pVar instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) pVar).create(r9, a10);
        }
        g context = a10.getContext();
        return context == j8.h.f10863m ? new C0172c(a10, pVar, r9) : new d(a10, context, pVar, r9);
    }

    public static <T> j8.d<T> c(j8.d<? super T> dVar) {
        j8.d<Object> intercepted;
        kotlin.jvm.internal.l.e(dVar, "<this>");
        kotlin.coroutines.jvm.internal.d dVar2 = dVar instanceof kotlin.coroutines.jvm.internal.d ? (kotlin.coroutines.jvm.internal.d) dVar : null;
        return (dVar2 == null || (intercepted = dVar2.intercepted()) == null) ? dVar : intercepted;
    }
}
