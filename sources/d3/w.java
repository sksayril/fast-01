package d3;

import java.util.concurrent.Executor;

final class w implements f0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f7769a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f7770b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public d f7771c;

    public w(Executor executor, d dVar) {
        this.f7769a = executor;
        this.f7771c = dVar;
    }

    public final void b() {
        synchronized (this.f7770b) {
            this.f7771c = null;
        }
    }

    public final void d(j jVar) {
        if (jVar.o()) {
            synchronized (this.f7770b) {
                if (this.f7771c != null) {
                    this.f7769a.execute(new v(this));
                }
            }
        }
    }
}
