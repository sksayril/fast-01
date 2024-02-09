package d3;

import java.util.concurrent.Executor;

final class u<TResult, TContinuationResult> implements g<TContinuationResult>, f, d, f0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f7765a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final b f7766b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final k0 f7767c;

    public u(Executor executor, b bVar, k0 k0Var) {
        this.f7765a = executor;
        this.f7766b = bVar;
        this.f7767c = k0Var;
    }

    public final void a(TContinuationResult tcontinuationresult) {
        this.f7767c.u(tcontinuationresult);
    }

    public final void b() {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        this.f7767c.v();
    }

    public final void d(j jVar) {
        this.f7765a.execute(new t(this, jVar));
    }

    public final void e(Exception exc) {
        this.f7767c.t(exc);
    }
}
