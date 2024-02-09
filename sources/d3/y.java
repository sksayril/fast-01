package d3;

import java.util.concurrent.Executor;

final class y implements f0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f7774a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f7775b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public e f7776c;

    public y(Executor executor, e eVar) {
        this.f7774a = executor;
        this.f7776c = eVar;
    }

    public final void b() {
        synchronized (this.f7775b) {
            this.f7776c = null;
        }
    }

    public final void d(j jVar) {
        synchronized (this.f7775b) {
            if (this.f7776c != null) {
                this.f7774a.execute(new x(this, jVar));
            }
        }
    }
}
