package g9;

import g9.e0;
import kotlin.jvm.internal.l;

public final class f0<S extends e0<S>> {
    public static <S extends e0<S>> Object a(Object obj) {
        return obj;
    }

    public static final S b(Object obj) {
        if (obj != d.f8981a) {
            l.c(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (e0) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public static final boolean c(Object obj) {
        return obj == d.f8981a;
    }
}
