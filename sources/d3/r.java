package d3;

final class r implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ j f7758m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ s f7759n;

    r(s sVar, j jVar) {
        this.f7759n = sVar;
        this.f7758m = jVar;
    }

    public final void run() {
        if (this.f7758m.o()) {
            this.f7759n.f7762c.v();
            return;
        }
        try {
            this.f7759n.f7762c.u(this.f7759n.f7761b.a(this.f7758m));
        } catch (h e10) {
            if (e10.getCause() instanceof Exception) {
                this.f7759n.f7762c.t((Exception) e10.getCause());
            } else {
                this.f7759n.f7762c.t(e10);
            }
        } catch (Exception e11) {
            this.f7759n.f7762c.t(e11);
        }
    }
}
