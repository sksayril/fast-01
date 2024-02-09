package x1;

import android.content.Context;
import f8.a;
import r1.b;
import r1.d;

public final class h implements b<String> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Context> f13078a;

    public h(a<Context> aVar) {
        this.f13078a = aVar;
    }

    public static h a(a<Context> aVar) {
        return new h(aVar);
    }

    public static String c(Context context) {
        return (String) d.c(f.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public String get() {
        return c(this.f13078a.get());
    }
}
