package g2;

import com.google.android.gms.common.api.internal.LifecycleCallback;

final class g0 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f8888m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ String f8889n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ h0 f8890o;

    g0(h0 h0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f8890o = h0Var;
        this.f8888m = lifecycleCallback;
        this.f8889n = str;
    }

    public final void run() {
        h0 h0Var = this.f8890o;
        if (h0Var.f8893n > 0) {
            this.f8888m.f(h0Var.f8894o != null ? h0Var.f8894o.getBundle(this.f8889n) : null);
        }
        if (this.f8890o.f8893n >= 2) {
            this.f8888m.j();
        }
        if (this.f8890o.f8893n >= 3) {
            this.f8888m.h();
        }
        if (this.f8890o.f8893n >= 4) {
            this.f8888m.k();
        }
        if (this.f8890o.f8893n >= 5) {
            this.f8888m.g();
        }
    }
}
