package g9;

import b9.c2;
import g8.d;
import java.util.List;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f9044a = true;

    private static final y a(Throwable th, String str) {
        if (f9044a) {
            return new y(th, str);
        }
        if (th != null) {
            throw th;
        }
        d();
        throw new d();
    }

    static /* synthetic */ y b(Throwable th, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final boolean c(c2 c2Var) {
        return c2Var.L() instanceof y;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final c2 e(v vVar, List<? extends v> list) {
        try {
            return vVar.b(list);
        } catch (Throwable th) {
            return a(th, vVar.a());
        }
    }
}
