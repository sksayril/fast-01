package h8;

import java.lang.reflect.Array;
import kotlin.jvm.internal.l;

class g {
    public static final <T> T[] a(T[] tArr, int i10) {
        l.e(tArr, "reference");
        Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), i10);
        l.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) newInstance;
    }
}
