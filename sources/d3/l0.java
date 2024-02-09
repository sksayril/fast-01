package d3;

import java.util.concurrent.Callable;

final class l0 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ k0 f7747m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ Callable f7748n;

    l0(k0 k0Var, Callable callable) {
        this.f7747m = k0Var;
        this.f7748n = callable;
    }

    public final void run() {
        try {
            this.f7747m.u(this.f7748n.call());
        } catch (Exception e10) {
            this.f7747m.t(e10);
        } catch (Throwable th) {
            this.f7747m.t(new RuntimeException(th));
        }
    }
}
