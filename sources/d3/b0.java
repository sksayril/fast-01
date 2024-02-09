package d3;

final class b0 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ j f7723m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ c0 f7724n;

    b0(c0 c0Var, j jVar) {
        this.f7724n = c0Var;
        this.f7723m = jVar;
    }

    public final void run() {
        synchronized (this.f7724n.f7726b) {
            c0 c0Var = this.f7724n;
            if (c0Var.f7727c != null) {
                c0Var.f7727c.a(this.f7723m.n());
            }
        }
    }
}
