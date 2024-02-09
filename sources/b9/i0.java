package b9;

import g9.h;
import j8.g;

public final class i0 {
    public static final void a(g gVar, Throwable th) {
        try {
            h0 h0Var = (h0) gVar.a(h0.f3454b);
            if (h0Var != null) {
                h0Var.F(gVar, th);
            } else {
                h.a(gVar, th);
            }
        } catch (Throwable th2) {
            h.a(gVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        b.a(runtimeException, th);
        return runtimeException;
    }
}
