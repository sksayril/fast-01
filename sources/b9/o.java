package b9;

import g9.j;
import j8.d;

public final class o {
    public static final void a(l<?> lVar, y0 y0Var) {
        lVar.i(new z0(y0Var));
    }

    public static final <T> m<T> b(d<? super T> dVar) {
        if (!(dVar instanceof j)) {
            return new m<>(dVar, 1);
        }
        m<T> m10 = ((j) dVar).m();
        if (m10 != null) {
            if (!m10.J()) {
                m10 = null;
            }
            if (m10 != null) {
                return m10;
            }
        }
        return new m<>(dVar, 2);
    }
}
