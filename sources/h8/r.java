package h8;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.l;

class r extends q {
    public static final <T> void j(List<T> list, Comparator<? super T> comparator) {
        l.e(list, "<this>");
        l.e(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
