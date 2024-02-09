package d3;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import g2.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

final class j0 extends LifecycleCallback {

    /* renamed from: n  reason: collision with root package name */
    private final List f7737n = new ArrayList();

    private j0(f fVar) {
        super(fVar);
        this.f4931m.b("TaskOnStopCallback", this);
    }

    public static j0 l(Activity activity) {
        f c10 = LifecycleCallback.c(activity);
        j0 j0Var = (j0) c10.c("TaskOnStopCallback", j0.class);
        return j0Var == null ? new j0(c10) : j0Var;
    }

    public final void k() {
        synchronized (this.f7737n) {
            for (WeakReference weakReference : this.f7737n) {
                f0 f0Var = (f0) weakReference.get();
                if (f0Var != null) {
                    f0Var.b();
                }
            }
            this.f7737n.clear();
        }
    }

    public final void m(f0 f0Var) {
        synchronized (this.f7737n) {
            this.f7737n.add(new WeakReference(f0Var));
        }
    }
}
