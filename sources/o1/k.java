package o1;

import com.google.auto.value.AutoValue;
import o1.e;

@AutoValue
public abstract class k {

    @AutoValue.Builder
    public static abstract class a {
        public abstract k a();

        public abstract a b(a aVar);

        public abstract a c(b bVar);
    }

    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        
        private final int value;

        private b(int i10) {
            this.value = i10;
        }
    }

    public static a a() {
        return new e.b();
    }

    public abstract a b();

    public abstract b c();
}
