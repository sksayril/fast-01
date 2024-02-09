package d3;

import java.util.concurrent.Executor;

final class e0<TResult, TContinuationResult> implements g<TContinuationResult>, f, d, f0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f7730a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final i f7731b;

    /* renamed from: c  reason: collision with root package name */
    private final k0 f7732c;

    public e0(Executor executor, i iVar, k0 k0Var) {
        this.f7730a = executor;
        this.f7731b = iVar;
        this.f7732c = k0Var;
    }

    public final void a(TContinuationResult tcontinuationresult) {
        this.f7732c.u(tcontinuationresult);
    }

    public final void b() {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        this.f7732c.v();
    }

    public final void d(j jVar) {
        this.f7730a.execute(new d0(this, jVar));
    }

    public final void e(Exception exc) {
        this.f7732c.t(exc);
    }
}
