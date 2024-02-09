package androidx.core.util;

import java.util.Objects;

public class c {

    static class a {
        static boolean a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        static int b(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return a.a(obj, obj2);
    }

    public static int b(Object... objArr) {
        return a.b(objArr);
    }

    public static <T> T c(T t9) {
        Objects.requireNonNull(t9);
        return t9;
    }

    public static <T> T d(T t9, String str) {
        Objects.requireNonNull(t9, str);
        return t9;
    }
}
