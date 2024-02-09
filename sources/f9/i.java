package f9;

import b9.v1;
import e9.c;
import g8.s;
import j8.g;
import j8.h;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import r8.p;
import r8.q;

public final class i<T> extends d implements c<T> {

    /* renamed from: m  reason: collision with root package name */
    public final c<T> f8819m;

    /* renamed from: n  reason: collision with root package name */
    public final g f8820n;

    /* renamed from: o  reason: collision with root package name */
    public final int f8821o;

    /* renamed from: p  reason: collision with root package name */
    private g f8822p;

    /* renamed from: q  reason: collision with root package name */
    private j8.d<? super s> f8823q;

    static final class a extends m implements p<Integer, g.b, Integer> {

        /* renamed from: m  reason: collision with root package name */
        public static final a f8824m = new a();

        a() {
            super(2);
        }

        public final Integer b(int i10, g.b bVar) {
            return Integer.valueOf(i10 + 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((Number) obj).intValue(), (g.b) obj2);
        }
    }

    public i(c<? super T> cVar, g gVar) {
        super(g.f8814m, h.f10863m);
        this.f8819m = cVar;
        this.f8820n = gVar;
        this.f8821o = ((Number) gVar.k(0, a.f8824m)).intValue();
    }

    private final void b(g gVar, g gVar2, T t9) {
        if (gVar2 instanceof e) {
            h((e) gVar2, t9);
        }
        k.a(this, gVar);
    }

    private final Object e(j8.d<? super s> dVar, T t9) {
        g context = dVar.getContext();
        v1.f(context);
        g gVar = this.f8822p;
        if (gVar != context) {
            b(context, gVar, t9);
            this.f8822p = context;
        }
        this.f8823q = dVar;
        q a10 = j.f8825a;
        c<T> cVar = this.f8819m;
        l.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        l.c(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object a11 = a10.a(cVar, t9, this);
        if (!l.a(a11, d.d())) {
            this.f8823q = null;
        }
        return a11;
    }

    private final void h(e eVar, Object obj) {
        throw new IllegalStateException(h.e("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + eVar.f8812m + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    public Object emit(T t9, j8.d<? super s> dVar) {
        try {
            Object e10 = e(dVar, t9);
            if (e10 == d.d()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return e10 == d.d() ? e10 : s.f8976a;
        } catch (Throwable th) {
            this.f8822p = new e(th, dVar.getContext());
            throw th;
        }
    }

    public e getCallerFrame() {
        j8.d<? super s> dVar = this.f8823q;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public g getContext() {
        g gVar = this.f8822p;
        return gVar == null ? h.f10863m : gVar;
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public Object invokeSuspend(Object obj) {
        Throwable b10 = g8.m.b(obj);
        if (b10 != null) {
            this.f8822p = new e(b10, getContext());
        }
        j8.d<? super s> dVar = this.f8823q;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return d.d();
    }

    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
