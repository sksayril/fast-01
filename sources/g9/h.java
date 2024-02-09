package g9;

import b9.h0;
import b9.i0;
import j8.g;

public final class h {
    public static final void a(g gVar, Throwable th) {
        for (h0 F : g.a()) {
            try {
                F.F(gVar, th);
            } catch (Throwable th2) {
                g.b(i0.b(th, th2));
            }
        }
        try {
            b.a(th, new i(gVar));
        } catch (Throwable unused) {
        }
        g.b(th);
    }
}
