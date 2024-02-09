package c5;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import g8.s;
import kotlin.jvm.internal.l;

public final class j0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: m  reason: collision with root package name */
    public static final j0 f3747m = new j0();

    /* renamed from: n  reason: collision with root package name */
    private static boolean f3748n;

    /* renamed from: o  reason: collision with root package name */
    private static g0 f3749o;

    private j0() {
    }

    public final void a(g0 g0Var) {
        f3749o = g0Var;
        if (g0Var != null && f3748n) {
            f3748n = false;
            g0Var.k();
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        l.e(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        l.e(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        l.e(activity, "activity");
        g0 g0Var = f3749o;
        if (g0Var != null) {
            g0Var.h();
        }
    }

    public void onActivityResumed(Activity activity) {
        s sVar;
        l.e(activity, "activity");
        g0 g0Var = f3749o;
        if (g0Var != null) {
            g0Var.k();
            sVar = s.f8976a;
        } else {
            sVar = null;
        }
        if (sVar == null) {
            f3748n = true;
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        l.e(activity, "activity");
        l.e(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        l.e(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        l.e(activity, "activity");
    }
}
