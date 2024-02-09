package d3;

final class x implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ j f7772m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ y f7773n;

    x(y yVar, j jVar) {
        this.f7773n = yVar;
        this.f7772m = jVar;
    }

    public final void run() {
        synchronized (this.f7773n.f7775b) {
            y yVar = this.f7773n;
            if (yVar.f7776c != null) {
                yVar.f7776c.a(this.f7772m);
            }
        }
    }
}
