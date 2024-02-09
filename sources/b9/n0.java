package b9;

import g8.m;
import g8.n;
import g9.j;
import j8.d;

public final class n0 {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(d<?> dVar) {
        Object obj;
        if (dVar instanceof j) {
            return dVar.toString();
        }
        try {
            m.a aVar = m.f8970m;
            obj = m.a(dVar + '@' + b(dVar));
        } catch (Throwable th) {
            m.a aVar2 = m.f8970m;
            obj = m.a(n.a(th));
        }
        Throwable b10 = m.b(obj);
        String str = obj;
        if (b10 != null) {
            str = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) str;
    }
}
