package z1;

import r1.b;
import r1.d;

public final class c implements b<a> {

    private static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final c f13467a = new c();
    }

    public static c a() {
        return a.f13467a;
    }

    public static a b() {
        return (a) d.c(b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public a get() {
        return b();
    }
}
