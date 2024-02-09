package d3;

import java.util.concurrent.Executor;

final class s implements f0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f7760a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final b f7761b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final k0 f7762c;

    public s(Executor executor, b bVar, k0 k0Var) {
        this.f7760a = executor;
        this.f7761b = bVar;
        this.f7762c = k0Var;
    }

    public final void b() {
        throw new UnsupportedOperationException();
    }

    public final void d(j jVar) {
        this.f7760a.execute(new r(this, jVar));
    }
}
