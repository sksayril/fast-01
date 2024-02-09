package d3;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

final class d0 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ j f7728m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ e0 f7729n;

    d0(e0 e0Var, j jVar) {
        this.f7729n = e0Var;
        this.f7728m = jVar;
    }

    public final void run() {
        try {
            j a10 = this.f7729n.f7731b.a(this.f7728m.n());
            if (a10 == null) {
                this.f7729n.e(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = l.f7746b;
            a10.i(executor, this.f7729n);
            a10.f(executor, this.f7729n);
            a10.a(executor, this.f7729n);
        } catch (h e10) {
            if (e10.getCause() instanceof Exception) {
                this.f7729n.e((Exception) e10.getCause());
            } else {
                this.f7729n.e(e10);
            }
        } catch (CancellationException unused) {
            this.f7729n.c();
        } catch (Exception e11) {
            this.f7729n.e(e11);
        }
    }
}
