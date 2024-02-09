package z1;

import r1.b;

public final class d implements b<a> {

    private static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final d f13468a = new d();
    }

    public static d a() {
        return a.f13468a;
    }

    public static a c() {
        return (a) r1.d.c(b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public a get() {
        return c();
    }
}
