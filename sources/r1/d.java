package r1;

import java.util.Objects;

public final class d {
    public static <T> void a(T t9, Class<T> cls) {
        if (t9 == null) {
            throw new IllegalStateException(cls.getCanonicalName() + " must be set");
        }
    }

    public static <T> T b(T t9) {
        Objects.requireNonNull(t9);
        return t9;
    }

    public static <T> T c(T t9, String str) {
        Objects.requireNonNull(t9, str);
        return t9;
    }
}
