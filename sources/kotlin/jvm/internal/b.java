package kotlin.jvm.internal;

import java.util.Iterator;

public final class b {
    public static final <T> Iterator<T> a(T[] tArr) {
        l.e(tArr, "array");
        return new a(tArr);
    }
}
