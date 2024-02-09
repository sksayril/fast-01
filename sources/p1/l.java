package p1;

import android.annotation.SuppressLint;
import n1.d;
import n1.f;
import t1.a;

public final class l {
    @SuppressLint({"DiscouragedApi"})
    public static void a(f<?> fVar, d dVar) {
        if (fVar instanceof s) {
            u.c().e().u(((s) fVar).d().f(dVar), 1);
            return;
        }
        a.g("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", fVar);
    }
}
