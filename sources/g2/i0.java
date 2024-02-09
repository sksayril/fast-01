package g2;

import com.google.android.gms.common.api.internal.LifecycleCallback;

final class i0 implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f8895m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ String f8896n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ j0 f8897o;

    i0(j0 j0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f8897o = j0Var;
        this.f8895m = lifecycleCallback;
        this.f8896n = str;
    }

    public final void run() {
        j0 j0Var = this.f8897o;
        if (j0Var.f8900o0 > 0) {
            this.f8895m.f(j0Var.f8901p0 != null ? j0Var.f8901p0.getBundle(this.f8896n) : null);
        }
        if (this.f8897o.f8900o0 >= 2) {
            this.f8895m.j();
        }
        if (this.f8897o.f8900o0 >= 3) {
            this.f8895m.h();
        }
        if (this.f8897o.f8900o0 >= 4) {
            this.f8895m.k();
        }
        if (this.f8897o.f8900o0 >= 5) {
            this.f8895m.g();
        }
    }
}
