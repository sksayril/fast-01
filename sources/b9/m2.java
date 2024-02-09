package b9;

import g9.h0;
import g9.m0;

public final class m2 {

    /* renamed from: a  reason: collision with root package name */
    public static final m2 f3468a = new m2();

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal<b1> f3469b = m0.a(new h0("ThreadLocalEventLoop"));

    private m2() {
    }

    public final b1 a() {
        return f3469b.get();
    }

    public final b1 b() {
        ThreadLocal<b1> threadLocal = f3469b;
        b1 b1Var = threadLocal.get();
        if (b1Var != null) {
            return b1Var;
        }
        b1 a10 = e1.a();
        threadLocal.set(a10);
        return a10;
    }

    public final void c() {
        f3469b.set((Object) null);
    }

    public final void d(b1 b1Var) {
        f3469b.set(b1Var);
    }
}
