package i9;

import b9.g0;
import b9.h1;
import g9.i0;
import j8.g;
import j8.h;
import java.util.concurrent.Executor;

public final class b extends h1 implements Executor {

    /* renamed from: p  reason: collision with root package name */
    public static final b f9632p = new b();

    /* renamed from: q  reason: collision with root package name */
    private static final g0 f9633q = m.f9653o.K(k0.e("kotlinx.coroutines.io.parallelism", i.a(64, i0.a()), 0, 0, 12, (Object) null));

    private b() {
    }

    public void I(g gVar, Runnable runnable) {
        f9633q.I(gVar, runnable);
    }

    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    public void execute(Runnable runnable) {
        I(h.f10863m, runnable);
    }

    public String toString() {
        return "Dispatchers.IO";
    }
}
