package p1;

import com.google.auto.value.AutoValue;
import n1.b;
import n1.c;
import n1.e;
import p1.c;

@AutoValue
abstract class o {

    @AutoValue.Builder
    public static abstract class a {
        public abstract o a();

        /* access modifiers changed from: package-private */
        public abstract a b(b bVar);

        /* access modifiers changed from: package-private */
        public abstract a c(c<?> cVar);

        /* access modifiers changed from: package-private */
        public abstract a d(e<?, byte[]> eVar);

        public abstract a e(p pVar);

        public abstract a f(String str);
    }

    o() {
    }

    public static a a() {
        return new c.b();
    }

    public abstract b b();

    /* access modifiers changed from: package-private */
    public abstract n1.c<?> c();

    public byte[] d() {
        return e().apply(c().b());
    }

    /* access modifiers changed from: package-private */
    public abstract e<?, byte[]> e();

    public abstract p f();

    public abstract String g();
}
