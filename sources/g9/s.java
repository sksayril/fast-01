package g9;

import b9.n0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.p;

public class s {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f9026m;

    /* renamed from: n  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f9027n;

    /* renamed from: o  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f9028o;
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    public static abstract class a extends b<s> {

        /* renamed from: b  reason: collision with root package name */
        public final s f9029b;

        /* renamed from: c  reason: collision with root package name */
        public s f9030c;

        public a(s sVar) {
            this.f9029b = sVar;
        }

        /* renamed from: e */
        public void b(s sVar, Object obj) {
            boolean z9 = obj == null;
            s sVar2 = z9 ? this.f9029b : this.f9030c;
            if (sVar2 != null && androidx.concurrent.futures.b.a(s.f9026m, sVar, this, sVar2) && z9) {
                s sVar3 = this.f9029b;
                s sVar4 = this.f9030c;
                l.b(sVar4);
                sVar3.m(sVar4);
            }
        }
    }

    /* synthetic */ class b extends p {
        b(Object obj) {
            super(obj, n0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
        }

        public Object get() {
            return n0.a(this.receiver);
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<s> cls2 = s.class;
        f9026m = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f9027n = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f9028o = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: g9.s} */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        if (androidx.concurrent.futures.b.a(r4, r3, r2, ((g9.b0) r5).f8979a) != false) goto L_0x0045;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final g9.s j(g9.a0 r9) {
        /*
            r8 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f9027n
            java.lang.Object r0 = r0.get(r8)
            g9.s r0 = (g9.s) r0
            r1 = 0
            r2 = r0
        L_0x000a:
            r3 = r1
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f9026m
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L_0x0020
            if (r0 != r2) goto L_0x0016
            return r2
        L_0x0016:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f9027n
            boolean r0 = androidx.concurrent.futures.b.a(r1, r8, r0, r2)
            if (r0 != 0) goto L_0x001f
            goto L_0x0000
        L_0x001f:
            return r2
        L_0x0020:
            boolean r6 = r8.q()
            if (r6 == 0) goto L_0x0027
            return r1
        L_0x0027:
            if (r5 != r9) goto L_0x002a
            return r2
        L_0x002a:
            boolean r6 = r5 instanceof g9.a0
            if (r6 == 0) goto L_0x0034
            g9.a0 r5 = (g9.a0) r5
            r5.a(r2)
            goto L_0x0000
        L_0x0034:
            boolean r6 = r5 instanceof g9.b0
            if (r6 == 0) goto L_0x0050
            if (r3 == 0) goto L_0x0047
            g9.b0 r5 = (g9.b0) r5
            g9.s r5 = r5.f8979a
            boolean r2 = androidx.concurrent.futures.b.a(r4, r3, r2, r5)
            if (r2 != 0) goto L_0x0045
            goto L_0x0000
        L_0x0045:
            r2 = r3
            goto L_0x000a
        L_0x0047:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f9027n
            java.lang.Object r2 = r4.get(r2)
            g9.s r2 = (g9.s) r2
            goto L_0x000b
        L_0x0050:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.l.c(r5, r3)
            r3 = r5
            g9.s r3 = (g9.s) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: g9.s.j(g9.a0):g9.s");
    }

    private final s l(s sVar) {
        while (sVar.q()) {
            sVar = (s) f9027n.get(sVar);
        }
        return sVar;
    }

    /* access modifiers changed from: private */
    public final void m(s sVar) {
        s sVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9027n;
        do {
            sVar2 = (s) atomicReferenceFieldUpdater.get(sVar);
            if (n() != sVar) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f9027n, sVar, sVar2, this));
        if (q()) {
            sVar.j((a0) null);
        }
    }

    private final b0 t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9028o;
        b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0Var2 = new b0(this);
        atomicReferenceFieldUpdater.lazySet(this, b0Var2);
        return b0Var2;
    }

    public final boolean i(s sVar) {
        f9027n.lazySet(sVar, this);
        f9026m.lazySet(sVar, this);
        while (n() == this) {
            if (androidx.concurrent.futures.b.a(f9026m, this, this, sVar)) {
                sVar.m(this);
                return true;
            }
        }
        return false;
    }

    public final Object n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9026m;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof a0)) {
                return obj;
            }
            ((a0) obj).a(this);
        }
    }

    public final s o() {
        return r.b(n());
    }

    public final s p() {
        s j10 = j((a0) null);
        return j10 == null ? l((s) f9027n.get(this)) : j10;
    }

    public boolean q() {
        return n() instanceof b0;
    }

    public boolean r() {
        return s() == null;
    }

    public final s s() {
        Object n10;
        s sVar;
        do {
            n10 = n();
            if (n10 instanceof b0) {
                return ((b0) n10).f8979a;
            }
            if (n10 == this) {
                return (s) n10;
            }
            l.c(n10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            sVar = (s) n10;
        } while (!androidx.concurrent.futures.b.a(f9026m, this, n10, sVar.t()));
        sVar.j((a0) null);
        return null;
    }

    public String toString() {
        return new b(this) + '@' + n0.b(this);
    }

    public final int u(s sVar, s sVar2, a aVar) {
        f9027n.lazySet(sVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9026m;
        atomicReferenceFieldUpdater.lazySet(sVar, sVar2);
        aVar.f9030c = sVar2;
        if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, sVar2, aVar)) {
            return 0;
        }
        return aVar.a(this) == null ? 1 : 2;
    }
}
