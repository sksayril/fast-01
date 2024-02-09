package h5;

import java.util.Objects;

public final class a {
    public static void a(boolean z9) {
        if (!z9) {
            throw new IllegalArgumentException();
        }
    }

    public static <T> T b(T t9) {
        Objects.requireNonNull(t9);
        return t9;
    }
}
