package p1;

import java.util.concurrent.Executor;
import r1.b;
import r1.d;

public final class k implements b<Executor> {

    private static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final k f11832a = new k();
    }

    public static k a() {
        return a.f11832a;
    }

    public static Executor b() {
        return (Executor) d.c(j.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public Executor get() {
        return b();
    }
}
