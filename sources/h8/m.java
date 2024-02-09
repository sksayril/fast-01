package h8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.l;

class m {
    public static final <T> Object[] a(T[] tArr, boolean z9) {
        Class<Object[]> cls = Object[].class;
        l.e(tArr, "<this>");
        if (z9 && l.a(tArr.getClass(), cls)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
        l.d(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    public static <T> List<T> b(T t9) {
        List<T> singletonList = Collections.singletonList(t9);
        l.d(singletonList, "singletonList(element)");
        return singletonList;
    }
}
