package d3;

import java.util.concurrent.Executor;

final class c0 implements f0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f7725a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f7726b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public g f7727c;

    public c0(Executor executor, g gVar) {
        this.f7725a = executor;
        this.f7727c = gVar;
    }

    public final void b() {
        synchronized (this.f7726b) {
            this.f7727c = null;
        }
    }

    public final void d(j jVar) {
        if (jVar.q()) {
            synchronized (this.f7726b) {
                if (this.f7727c != null) {
                    this.f7725a.execute(new b0(this, jVar));
                }
            }
        }
    }
}
