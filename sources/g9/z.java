package g9;

import b9.i0;
import g8.s;
import j8.g;
import kotlin.jvm.internal.m;
import r8.l;

public final class z {

    static final class a extends m implements l<Throwable, s> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ l<E, s> f9047m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ E f9048n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ g f9049o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(l<? super E, s> lVar, E e10, g gVar) {
            super(1);
            this.f9047m = lVar;
            this.f9048n = e10;
            this.f9049o = gVar;
        }

        public final void b(Throwable th) {
            z.b(this.f9047m, this.f9048n, this.f9049o);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return s.f8976a;
        }
    }

    public static final <E> l<Throwable, s> a(l<? super E, s> lVar, E e10, g gVar) {
        return new a(lVar, e10, gVar);
    }

    public static final <E> void b(l<? super E, s> lVar, E e10, g gVar) {
        q0 c10 = c(lVar, e10, (q0) null);
        if (c10 != null) {
            i0.a(gVar, c10);
        }
    }

    public static final <E> q0 c(l<? super E, s> lVar, E e10, q0 q0Var) {
        try {
            lVar.invoke(e10);
        } catch (Throwable th) {
            if (q0Var == null || q0Var.getCause() == th) {
                return new q0("Exception in undelivered element handler for " + e10, th);
            }
            b.a(q0Var, th);
        }
        return q0Var;
    }

    public static /* synthetic */ q0 d(l lVar, Object obj, q0 q0Var, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            q0Var = null;
        }
        return c(lVar, obj, q0Var);
    }
}
