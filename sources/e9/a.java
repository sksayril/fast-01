package e9;

import g8.s;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

public abstract class a<T> implements b<T> {

    @f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {230}, m = "collect")
    /* renamed from: e9.a$a  reason: collision with other inner class name */
    static final class C0132a extends d {

        /* renamed from: m  reason: collision with root package name */
        Object f8531m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f8532n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ a<T> f8533o;

        /* renamed from: p  reason: collision with root package name */
        int f8534p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0132a(a<T> aVar, j8.d<? super C0132a> dVar) {
            super(dVar);
            this.f8533o = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f8532n = obj;
            this.f8534p |= Integer.MIN_VALUE;
            return this.f8533o.a((c) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(e9.c<? super T> r6, j8.d<? super g8.s> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof e9.a.C0132a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            e9.a$a r0 = (e9.a.C0132a) r0
            int r1 = r0.f8534p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f8534p = r1
            goto L_0x0018
        L_0x0013:
            e9.a$a r0 = new e9.a$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f8532n
            java.lang.Object r1 = k8.d.d()
            int r2 = r0.f8534p
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r6 = r0.f8531m
            f9.i r6 = (f9.i) r6
            g8.n.b(r7)     // Catch:{ all -> 0x002d }
            goto L_0x004f
        L_0x002d:
            r7 = move-exception
            goto L_0x0059
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            g8.n.b(r7)
            f9.i r7 = new f9.i
            j8.g r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f8531m = r7     // Catch:{ all -> 0x0055 }
            r0.f8534p = r3     // Catch:{ all -> 0x0055 }
            java.lang.Object r6 = r5.b(r7, r0)     // Catch:{ all -> 0x0055 }
            if (r6 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r6 = r7
        L_0x004f:
            r6.releaseIntercepted()
            g8.s r6 = g8.s.f8976a
            return r6
        L_0x0055:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x0059:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.a.a(e9.c, j8.d):java.lang.Object");
    }

    public abstract Object b(c<? super T> cVar, j8.d<? super s> dVar);
}
