package o0;

import androidx.concurrent.futures.c;
import b9.q0;
import g8.s;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.m;
import r3.d;
import r8.l;

public final class b {

    static final class a extends m implements l<Throwable, s> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ c.a<T> f11479m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ q0<T> f11480n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c.a<T> aVar, q0<? extends T> q0Var) {
            super(1);
            this.f11479m = aVar;
            this.f11480n = q0Var;
        }

        public final void b(Throwable th) {
            if (th == null) {
                this.f11479m.b(this.f11480n.g());
            } else if (th instanceof CancellationException) {
                this.f11479m.c();
            } else {
                this.f11479m.e(th);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return s.f8976a;
        }
    }

    public static final <T> d<T> b(q0<? extends T> q0Var, Object obj) {
        kotlin.jvm.internal.l.e(q0Var, "<this>");
        d<T> a10 = c.a(new a(q0Var, obj));
        kotlin.jvm.internal.l.d(a10, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return a10;
    }

    public static /* synthetic */ d c(q0 q0Var, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(q0Var, obj);
    }

    /* access modifiers changed from: private */
    public static final Object d(q0 q0Var, Object obj, c.a aVar) {
        kotlin.jvm.internal.l.e(q0Var, "$this_asListenableFuture");
        kotlin.jvm.internal.l.e(aVar, "completer");
        q0Var.h(new a(aVar, q0Var));
        return obj;
    }
}
