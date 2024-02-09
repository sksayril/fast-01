package m9;

import android.app.Application;
import kotlin.jvm.internal.l;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final Application f11282a;

    /* renamed from: b  reason: collision with root package name */
    private final Application.ActivityLifecycleCallbacks f11283b;

    public g(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        l.e(application, "application");
        l.e(activityLifecycleCallbacks, "callback");
        this.f11282a = application;
        this.f11283b = activityLifecycleCallbacks;
    }

    public final void a() {
        this.f11282a.unregisterActivityLifecycleCallbacks(this.f11283b);
    }
}
