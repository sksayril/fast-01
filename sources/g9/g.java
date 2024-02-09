package g9;

import b9.h0;
import java.util.Collection;
import java.util.ServiceLoader;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final Collection<h0> f8988a;

    static {
        Class<h0> cls = h0.class;
        f8988a = h.e(f.a(ServiceLoader.load(cls, cls.getClassLoader()).iterator()));
    }

    public static final Collection<h0> a() {
        return f8988a;
    }

    public static final void b(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
