package h8;

import java.util.Set;
import kotlin.jvm.internal.l;

class k0 extends j0 {
    public static <T> Set<T> b() {
        return z.f9429m;
    }

    public static final <T> Set<T> c(Set<? extends T> set) {
        l.e(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : j0.a(set.iterator().next()) : b();
    }
}
