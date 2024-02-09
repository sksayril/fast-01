package d3;

import java.util.concurrent.Executor;

final class a0 implements f0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f7720a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f7721b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public f f7722c;

    public a0(Executor executor, f fVar) {
        this.f7720a = executor;
        this.f7722c = fVar;
    }

    public final void b() {
        synchronized (this.f7721b) {
            this.f7722c = null;
        }
    }

    public final void d(j jVar) {
        if (!jVar.q() && !jVar.o()) {
            synchronized (this.f7721b) {
                if (this.f7722c != null) {
                    this.f7720a.execute(new z(this, jVar));
                }
            }
        }
    }
}
