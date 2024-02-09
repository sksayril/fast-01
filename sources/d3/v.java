package d3;

final class v implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ w f7768m;

    v(w wVar) {
        this.f7768m = wVar;
    }

    public final void run() {
        synchronized (this.f7768m.f7770b) {
            w wVar = this.f7768m;
            if (wVar.f7771c != null) {
                wVar.f7771c.c();
            }
        }
    }
}
