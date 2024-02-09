package n1;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class c<T> {
    public static <T> c<T> d(T t9) {
        return new a((Integer) null, t9, d.DEFAULT);
    }

    public static <T> c<T> e(T t9) {
        return new a((Integer) null, t9, d.HIGHEST);
    }

    public abstract Integer a();

    public abstract T b();

    public abstract d c();
}
