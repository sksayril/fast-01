package g8;

import g8.m;
import kotlin.jvm.internal.l;

public final class n {
    public static final Object a(Throwable th) {
        l.e(th, "exception");
        return new m.b(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof m.b) {
            throw ((m.b) obj).f8971m;
        }
    }
}
