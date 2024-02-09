package e9;

import g8.s;
import j8.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.u;

final /* synthetic */ class j {

    public static final class a implements c<T> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ u f8561m;

        public a(u uVar) {
            this.f8561m = uVar;
        }

        public Object emit(T t9, d<? super s> dVar) {
            this.f8561m.f11078m = t9;
            throw new f9.a(this);
        }
    }

    @f(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {183}, m = "first")
    static final class b<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: m  reason: collision with root package name */
        Object f8562m;

        /* renamed from: n  reason: collision with root package name */
        Object f8563n;

        /* renamed from: o  reason: collision with root package name */
        /* synthetic */ Object f8564o;

        /* renamed from: p  reason: collision with root package name */
        int f8565p;

        b(d<? super b> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f8564o = obj;
            this.f8565p |= Integer.MIN_VALUE;
            return d.f((b) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object a(e9.b<? extends T> r4, j8.d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof e9.j.b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            e9.j$b r0 = (e9.j.b) r0
            int r1 = r0.f8565p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8565p = r1
            goto L_0x0018
        L_0x0013:
            e9.j$b r0 = new e9.j$b
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f8564o
            java.lang.Object r1 = k8.d.d()
            int r2 = r0.f8565p
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r4 = r0.f8563n
            e9.j$a r4 = (e9.j.a) r4
            java.lang.Object r0 = r0.f8562m
            kotlin.jvm.internal.u r0 = (kotlin.jvm.internal.u) r0
            g8.n.b(r5)     // Catch:{ a -> 0x0031 }
            goto L_0x0062
        L_0x0031:
            r5 = move-exception
            goto L_0x005f
        L_0x0033:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x003b:
            g8.n.b(r5)
            kotlin.jvm.internal.u r5 = new kotlin.jvm.internal.u
            r5.<init>()
            g9.h0 r2 = f9.h.f8816a
            r5.f11078m = r2
            e9.j$a r2 = new e9.j$a
            r2.<init>(r5)
            r0.f8562m = r5     // Catch:{ a -> 0x005b }
            r0.f8563n = r2     // Catch:{ a -> 0x005b }
            r0.f8565p = r3     // Catch:{ a -> 0x005b }
            java.lang.Object r4 = r4.a(r2, r0)     // Catch:{ a -> 0x005b }
            if (r4 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r0 = r5
            goto L_0x0062
        L_0x005b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L_0x005f:
            f9.f.a(r5, r4)
        L_0x0062:
            T r4 = r0.f11078m
            g9.h0 r5 = f9.h.f8816a
            if (r4 == r5) goto L_0x0069
            return r4
        L_0x0069:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.j.a(e9.b, j8.d):java.lang.Object");
    }
}
