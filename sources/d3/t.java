package d3;

import java.util.concurrent.Executor;

final class t implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ j f7763m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ u f7764n;

    t(u uVar, j jVar) {
        this.f7764n = uVar;
        this.f7763m = jVar;
    }

    public final void run() {
        try {
            j jVar = (j) this.f7764n.f7766b.a(this.f7763m);
            if (jVar == null) {
                this.f7764n.e(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = l.f7746b;
            jVar.i(executor, this.f7764n);
            jVar.f(executor, this.f7764n);
            jVar.a(executor, this.f7764n);
        } catch (h e10) {
            if (e10.getCause() instanceof Exception) {
                this.f7764n.f7767c.t((Exception) e10.getCause());
            } else {
                this.f7764n.f7767c.t(e10);
            }
        } catch (Exception e11) {
            this.f7764n.f7767c.t(e11);
        }
    }
}
