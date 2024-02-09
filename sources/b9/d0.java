package b9;

import g8.m;
import g8.n;
import g8.s;
import j8.d;
import kotlin.jvm.internal.g;
import r8.l;

public final class d0 {
    public static final <T> Object a(Object obj, d<? super T> dVar) {
        if (obj instanceof z) {
            m.a aVar = m.f8970m;
            obj = n.a(((z) obj).f3519a);
        } else {
            m.a aVar2 = m.f8970m;
        }
        return m.a(obj);
    }

    public static final <T> Object b(Object obj, l<?> lVar) {
        Throwable b10 = m.b(obj);
        return b10 == null ? obj : new z(b10, false, 2, (g) null);
    }

    public static final <T> Object c(Object obj, l<? super Throwable, s> lVar) {
        Throwable b10 = m.b(obj);
        return b10 == null ? lVar != null ? new a0(obj, lVar) : obj : new z(b10, false, 2, (g) null);
    }

    public static /* synthetic */ Object d(Object obj, l lVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        return c(obj, lVar);
    }
}
