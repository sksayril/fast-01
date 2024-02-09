package e9;

import g8.s;
import j8.d;
import kotlin.coroutines.jvm.internal.f;

public final class p<T> implements c<T> {

    /* renamed from: m  reason: collision with root package name */
    private final c<T> f8580m;

    /* renamed from: n  reason: collision with root package name */
    private final r8.p<c<? super T>, d<? super s>, Object> f8581n;

    @f(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {419, 423}, m = "onSubscription")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: m  reason: collision with root package name */
        Object f8582m;

        /* renamed from: n  reason: collision with root package name */
        Object f8583n;

        /* renamed from: o  reason: collision with root package name */
        /* synthetic */ Object f8584o;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ p<T> f8585p;

        /* renamed from: q  reason: collision with root package name */
        int f8586q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p<T> pVar, d<? super a> dVar) {
            super(dVar);
            this.f8585p = pVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f8584o = obj;
            this.f8586q |= Integer.MIN_VALUE;
            return this.f8585p.a(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(j8.d<? super g8.s> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof e9.p.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            e9.p$a r0 = (e9.p.a) r0
            int r1 = r0.f8586q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8586q = r1
            goto L_0x0018
        L_0x0013:
            e9.p$a r0 = new e9.p$a
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f8584o
            java.lang.Object r1 = k8.d.d()
            int r2 = r0.f8586q
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            g8.n.b(r7)
            goto L_0x0077
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0034:
            java.lang.Object r2 = r0.f8583n
            f9.i r2 = (f9.i) r2
            java.lang.Object r4 = r0.f8582m
            e9.p r4 = (e9.p) r4
            g8.n.b(r7)     // Catch:{ all -> 0x007d }
            goto L_0x005e
        L_0x0040:
            g8.n.b(r7)
            f9.i r2 = new f9.i
            e9.c<T> r7 = r6.f8580m
            j8.g r5 = r0.getContext()
            r2.<init>(r7, r5)
            r8.p<e9.c<? super T>, j8.d<? super g8.s>, java.lang.Object> r7 = r6.f8581n     // Catch:{ all -> 0x007d }
            r0.f8582m = r6     // Catch:{ all -> 0x007d }
            r0.f8583n = r2     // Catch:{ all -> 0x007d }
            r0.f8586q = r4     // Catch:{ all -> 0x007d }
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch:{ all -> 0x007d }
            if (r7 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r4 = r6
        L_0x005e:
            r2.releaseIntercepted()
            e9.c<T> r7 = r4.f8580m
            boolean r2 = r7 instanceof e9.p
            if (r2 == 0) goto L_0x007a
            e9.p r7 = (e9.p) r7
            r2 = 0
            r0.f8582m = r2
            r0.f8583n = r2
            r0.f8586q = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L_0x0077
            return r1
        L_0x0077:
            g8.s r7 = g8.s.f8976a
            return r7
        L_0x007a:
            g8.s r7 = g8.s.f8976a
            return r7
        L_0x007d:
            r7 = move-exception
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.p.a(j8.d):java.lang.Object");
    }

    public Object emit(T t9, d<? super s> dVar) {
        return this.f8580m.emit(t9, dVar);
    }
}
