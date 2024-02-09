package w4;

import com.google.auto.value.AutoValue;
import w4.b;

@AutoValue
public abstract class f {

    @AutoValue.Builder
    public static abstract class a {
        public abstract f a();

        public abstract a b(b bVar);

        public abstract a c(String str);

        public abstract a d(long j10);
    }

    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        return new b.C0220b().d(0);
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}
