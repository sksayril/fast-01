package b9;

import j8.g;
import java.util.concurrent.CancellationException;

final /* synthetic */ class w1 {
    public static final x a(r1 r1Var) {
        return new u1(r1Var);
    }

    public static /* synthetic */ x b(r1 r1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            r1Var = null;
        }
        return v1.a(r1Var);
    }

    public static final void c(g gVar, CancellationException cancellationException) {
        r1 r1Var = (r1) gVar.a(r1.f3485c);
        if (r1Var != null) {
            r1Var.A(cancellationException);
        }
    }

    public static /* synthetic */ void d(g gVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        v1.c(gVar, cancellationException);
    }

    public static final void e(r1 r1Var) {
        if (!r1Var.b()) {
            throw r1Var.y();
        }
    }

    public static final void f(g gVar) {
        r1 r1Var = (r1) gVar.a(r1.f3485c);
        if (r1Var != null) {
            v1.e(r1Var);
        }
    }
}
