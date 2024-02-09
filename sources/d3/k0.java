package d3;

import android.app.Activity;
import h2.p;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

final class k0<TResult> extends j<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f7739a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final g0 f7740b = new g0();

    /* renamed from: c  reason: collision with root package name */
    private boolean f7741c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f7742d;

    /* renamed from: e  reason: collision with root package name */
    private Object f7743e;

    /* renamed from: f  reason: collision with root package name */
    private Exception f7744f;

    k0() {
    }

    private final void A() {
        if (this.f7741c) {
            throw c.a(this);
        }
    }

    private final void B() {
        synchronized (this.f7739a) {
            if (this.f7741c) {
                this.f7740b.b(this);
            }
        }
    }

    private final void y() {
        p.n(this.f7741c, "Task is not yet complete");
    }

    private final void z() {
        if (this.f7742d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    public final j<TResult> a(Executor executor, d dVar) {
        this.f7740b.a(new w(executor, dVar));
        B();
        return this;
    }

    public final j<TResult> b(e<TResult> eVar) {
        this.f7740b.a(new y(l.f7745a, eVar));
        B();
        return this;
    }

    public final j<TResult> c(Executor executor, e<TResult> eVar) {
        this.f7740b.a(new y(executor, eVar));
        B();
        return this;
    }

    public final j<TResult> d(Activity activity, f fVar) {
        a0 a0Var = new a0(l.f7745a, fVar);
        this.f7740b.a(a0Var);
        j0.l(activity).m(a0Var);
        B();
        return this;
    }

    public final j<TResult> e(f fVar) {
        f(l.f7745a, fVar);
        return this;
    }

    public final j<TResult> f(Executor executor, f fVar) {
        this.f7740b.a(new a0(executor, fVar));
        B();
        return this;
    }

    public final j<TResult> g(Activity activity, g<? super TResult> gVar) {
        c0 c0Var = new c0(l.f7745a, gVar);
        this.f7740b.a(c0Var);
        j0.l(activity).m(c0Var);
        B();
        return this;
    }

    public final j<TResult> h(g<? super TResult> gVar) {
        i(l.f7745a, gVar);
        return this;
    }

    public final j<TResult> i(Executor executor, g<? super TResult> gVar) {
        this.f7740b.a(new c0(executor, gVar));
        B();
        return this;
    }

    public final <TContinuationResult> j<TContinuationResult> j(b<TResult, TContinuationResult> bVar) {
        return k(l.f7745a, bVar);
    }

    public final <TContinuationResult> j<TContinuationResult> k(Executor executor, b<TResult, TContinuationResult> bVar) {
        k0 k0Var = new k0();
        this.f7740b.a(new s(executor, bVar, k0Var));
        B();
        return k0Var;
    }

    public final <TContinuationResult> j<TContinuationResult> l(Executor executor, b<TResult, j<TContinuationResult>> bVar) {
        k0 k0Var = new k0();
        this.f7740b.a(new u(executor, bVar, k0Var));
        B();
        return k0Var;
    }

    public final Exception m() {
        Exception exc;
        synchronized (this.f7739a) {
            exc = this.f7744f;
        }
        return exc;
    }

    public final TResult n() {
        TResult tresult;
        synchronized (this.f7739a) {
            y();
            z();
            Exception exc = this.f7744f;
            if (exc == null) {
                tresult = this.f7743e;
            } else {
                throw new h(exc);
            }
        }
        return tresult;
    }

    public final boolean o() {
        return this.f7742d;
    }

    public final boolean p() {
        boolean z9;
        synchronized (this.f7739a) {
            z9 = this.f7741c;
        }
        return z9;
    }

    public final boolean q() {
        boolean z9;
        synchronized (this.f7739a) {
            z9 = false;
            if (this.f7741c && !this.f7742d && this.f7744f == null) {
                z9 = true;
            }
        }
        return z9;
    }

    public final <TContinuationResult> j<TContinuationResult> r(i<TResult, TContinuationResult> iVar) {
        Executor executor = l.f7745a;
        k0 k0Var = new k0();
        this.f7740b.a(new e0(executor, iVar, k0Var));
        B();
        return k0Var;
    }

    public final <TContinuationResult> j<TContinuationResult> s(Executor executor, i<TResult, TContinuationResult> iVar) {
        k0 k0Var = new k0();
        this.f7740b.a(new e0(executor, iVar, k0Var));
        B();
        return k0Var;
    }

    public final void t(Exception exc) {
        p.k(exc, "Exception must not be null");
        synchronized (this.f7739a) {
            A();
            this.f7741c = true;
            this.f7744f = exc;
        }
        this.f7740b.b(this);
    }

    public final void u(Object obj) {
        synchronized (this.f7739a) {
            A();
            this.f7741c = true;
            this.f7743e = obj;
        }
        this.f7740b.b(this);
    }

    public final boolean v() {
        synchronized (this.f7739a) {
            if (this.f7741c) {
                return false;
            }
            this.f7741c = true;
            this.f7742d = true;
            this.f7740b.b(this);
            return true;
        }
    }

    public final boolean w(Exception exc) {
        p.k(exc, "Exception must not be null");
        synchronized (this.f7739a) {
            if (this.f7741c) {
                return false;
            }
            this.f7741c = true;
            this.f7744f = exc;
            this.f7740b.b(this);
            return true;
        }
    }

    public final boolean x(Object obj) {
        synchronized (this.f7739a) {
            if (this.f7741c) {
                return false;
            }
            this.f7741c = true;
            this.f7743e = obj;
            this.f7740b.b(this);
            return true;
        }
    }
}
