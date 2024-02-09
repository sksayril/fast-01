package h8;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.l;

class j0 {
    public static final <T> Set<T> a(T t9) {
        Set<T> singleton = Collections.singleton(t9);
        l.d(singleton, "singleton(element)");
        return singleton;
    }
}
