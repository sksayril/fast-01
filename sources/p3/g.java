package p3;

import java.io.Serializable;

public abstract class g<T> implements Serializable {
    g() {
    }

    public static <T> g<T> a() {
        return a.e();
    }

    public static <T> g<T> d(T t9) {
        return new i(h.i(t9));
    }

    public abstract T b();

    public abstract boolean c();
}
