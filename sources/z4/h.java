package z4;

import android.content.Context;
import w3.c;
import w3.r;

public class h {

    public interface a<T> {
        String a(T t9);
    }

    public static c<?> b(String str, String str2) {
        return c.l(f.a(str, str2), f.class);
    }

    public static c<?> c(String str, a<Context> aVar) {
        return c.m(f.class).b(r.i(Context.class)).e(new g(str, aVar)).c();
    }
}
