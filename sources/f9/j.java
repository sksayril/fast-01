package f9;

import e9.c;
import g8.s;
import j8.d;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import r8.q;

public final class j {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final q<c<Object>, Object, d<? super s>, Object> f8825a;

    /* synthetic */ class a extends kotlin.jvm.internal.j implements q<c<? super Object>, Object, d<? super s>, Object> {

        /* renamed from: m  reason: collision with root package name */
        public static final a f8826m = new a();

        a() {
            super(3, c.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* renamed from: d */
        public final Object a(c<Object> cVar, Object obj, d<? super s> dVar) {
            return cVar.emit(obj, dVar);
        }
    }

    static {
        a aVar = a.f8826m;
        l.c(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f8825a = (q) y.b(aVar, 3);
    }
}
