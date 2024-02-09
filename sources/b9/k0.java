package b9;

import g9.f;
import j8.g;
import java.util.concurrent.CancellationException;

public final class k0 {
    public static final j0 a(g gVar) {
        if (gVar.a(r1.f3485c) == null) {
            gVar = gVar.t(w1.b((r1) null, 1, (Object) null));
        }
        return new f(gVar);
    }

    public static final void b(j0 j0Var, CancellationException cancellationException) {
        r1 r1Var = (r1) j0Var.e().a(r1.f3485c);
        if (r1Var != null) {
            r1Var.A(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + j0Var).toString());
    }

    public static /* synthetic */ void c(j0 j0Var, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        b(j0Var, cancellationException);
    }

    public static final void d(j0 j0Var) {
        v1.f(j0Var.e());
    }
}
