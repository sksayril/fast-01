package h8;

import java.util.Collection;
import kotlin.jvm.internal.l;

class o extends n {
    public static <T> int i(Iterable<? extends T> iterable, int i10) {
        l.e(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }
}
