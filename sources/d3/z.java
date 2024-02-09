package d3;

import h2.p;

final class z implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ j f7777m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ a0 f7778n;

    z(a0 a0Var, j jVar) {
        this.f7778n = a0Var;
        this.f7777m = jVar;
    }

    public final void run() {
        synchronized (this.f7778n.f7721b) {
            a0 a0Var = this.f7778n;
            if (a0Var.f7722c != null) {
                a0Var.f7722c.e((Exception) p.j(this.f7777m.m()));
            }
        }
    }
}
