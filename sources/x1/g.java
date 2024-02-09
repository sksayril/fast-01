package x1;

import r1.b;
import r1.d;

public final class g implements b<String> {

    private static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final g f13076a = new g();
    }

    public static g a() {
        return a.f13076a;
    }

    public static String b() {
        return (String) d.c(f.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public String get() {
        return b();
    }
}
