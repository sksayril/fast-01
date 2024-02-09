package x1;

import r1.b;
import r1.d;

public final class j implements b<e> {

    private static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final j f13082a = new j();
    }

    public static j a() {
        return a.f13082a;
    }

    public static e c() {
        return (e) d.c(f.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public e get() {
        return c();
    }
}
