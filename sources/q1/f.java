package q1;

import com.google.auto.value.AutoValue;
import p1.i;
import q1.a;

@AutoValue
public abstract class f {

    @AutoValue.Builder
    public static abstract class a {
        public abstract f a();

        public abstract a b(Iterable<i> iterable);

        public abstract a c(byte[] bArr);
    }

    public static a a() {
        return new a.b();
    }

    public abstract Iterable<i> b();

    public abstract byte[] c();
}
