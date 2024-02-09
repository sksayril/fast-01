package p1;

import android.util.Base64;
import com.google.auto.value.AutoValue;
import n1.d;
import p1.d;

@AutoValue
public abstract class p {

    @AutoValue.Builder
    public static abstract class a {
        public abstract p a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(d dVar);
    }

    public static a a() {
        return new d.b().d(n1.d.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract n1.d d();

    public boolean e() {
        return c() != null;
    }

    public p f(n1.d dVar) {
        return a().b(b()).d(dVar).c(c()).a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? "" : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
