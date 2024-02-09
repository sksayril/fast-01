package l;

import java.util.concurrent.Executor;

public class c extends e {

    /* renamed from: c  reason: collision with root package name */
    private static volatile c f11084c;

    /* renamed from: d  reason: collision with root package name */
    private static final Executor f11085d = b.f11083m;

    /* renamed from: e  reason: collision with root package name */
    private static final Executor f11086e = a.f11082m;

    /* renamed from: a  reason: collision with root package name */
    private e f11087a;

    /* renamed from: b  reason: collision with root package name */
    private final e f11088b;

    private c() {
        d dVar = new d();
        this.f11088b = dVar;
        this.f11087a = dVar;
    }

    public static c f() {
        if (f11084c != null) {
            return f11084c;
        }
        synchronized (c.class) {
            if (f11084c == null) {
                f11084c = new c();
            }
        }
        return f11084c;
    }

    public void a(Runnable runnable) {
        this.f11087a.a(runnable);
    }

    public boolean b() {
        return this.f11087a.b();
    }

    public void c(Runnable runnable) {
        this.f11087a.c(runnable);
    }
}
