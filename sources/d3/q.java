package d3;

import java.util.concurrent.ExecutionException;

final class q<T> implements p<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f7750a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final int f7751b;

    /* renamed from: c  reason: collision with root package name */
    private final k0 f7752c;

    /* renamed from: d  reason: collision with root package name */
    private int f7753d;

    /* renamed from: e  reason: collision with root package name */
    private int f7754e;

    /* renamed from: f  reason: collision with root package name */
    private int f7755f;

    /* renamed from: g  reason: collision with root package name */
    private Exception f7756g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f7757h;

    public q(int i10, k0 k0Var) {
        this.f7751b = i10;
        this.f7752c = k0Var;
    }

    private final void b() {
        if (this.f7753d + this.f7754e + this.f7755f != this.f7751b) {
            return;
        }
        if (this.f7756g != null) {
            k0 k0Var = this.f7752c;
            int i10 = this.f7754e;
            int i11 = this.f7751b;
            k0Var.t(new ExecutionException(i10 + " out of " + i11 + " underlying tasks failed", this.f7756g));
        } else if (this.f7757h) {
            this.f7752c.v();
        } else {
            this.f7752c.u((Object) null);
        }
    }

    public final void a(T t9) {
        synchronized (this.f7750a) {
            this.f7753d++;
            b();
        }
    }

    public final void c() {
        synchronized (this.f7750a) {
            this.f7755f++;
            this.f7757h = true;
            b();
        }
    }

    public final void e(Exception exc) {
        synchronized (this.f7750a) {
            this.f7754e++;
            this.f7756g = exc;
            b();
        }
    }
}
