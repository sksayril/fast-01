package b9;

import j8.h;
import java.util.concurrent.Executor;

final class w0 implements Executor {

    /* renamed from: m  reason: collision with root package name */
    public final g0 f3494m;

    public void execute(Runnable runnable) {
        g0 g0Var = this.f3494m;
        h hVar = h.f10863m;
        if (g0Var.J(hVar)) {
            this.f3494m.I(hVar, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.f3494m.toString();
    }
}
