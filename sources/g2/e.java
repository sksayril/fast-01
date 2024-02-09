package g2;

import android.app.Activity;
import h2.p;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private final Object f8870a;

    public e(Activity activity) {
        p.k(activity, "Activity must not be null");
        this.f8870a = activity;
    }

    public final Activity a() {
        return (Activity) this.f8870a;
    }

    public final androidx.fragment.app.e b() {
        return (androidx.fragment.app.e) this.f8870a;
    }

    public final boolean c() {
        return this.f8870a instanceof Activity;
    }

    public final boolean d() {
        return this.f8870a instanceof androidx.fragment.app.e;
    }
}
