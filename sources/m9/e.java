package m9;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import g8.s;
import kotlin.jvm.internal.l;

public final class e {

    public static final class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Activity f11276m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ r8.a<s> f11277n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ r8.a<s> f11278o;

        a(Activity activity, r8.a<s> aVar, r8.a<s> aVar2) {
            this.f11276m = activity;
            this.f11277n = aVar;
            this.f11278o = aVar2;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            l.e(activity, "p0");
        }

        public void onActivityDestroyed(Activity activity) {
            l.e(activity, "p0");
        }

        public void onActivityPaused(Activity activity) {
            r8.a<s> aVar;
            l.e(activity, "p0");
            if (l.a(activity, this.f11276m) && (aVar = this.f11277n) != null) {
                aVar.invoke();
            }
        }

        public void onActivityResumed(Activity activity) {
            r8.a<s> aVar;
            l.e(activity, "p0");
            if (l.a(activity, this.f11276m) && (aVar = this.f11278o) != null) {
                aVar.invoke();
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            l.e(activity, "p0");
            l.e(bundle, "p1");
        }

        public void onActivityStarted(Activity activity) {
            l.e(activity, "p0");
        }

        public void onActivityStopped(Activity activity) {
            l.e(activity, "p0");
        }
    }

    public static final g a(Activity activity, r8.a<s> aVar, r8.a<s> aVar2) {
        l.e(activity, "<this>");
        a aVar3 = new a(activity, aVar, aVar2);
        activity.getApplication().registerActivityLifecycleCallbacks(aVar3);
        Application application = activity.getApplication();
        l.d(application, "getApplication(...)");
        return new g(application, aVar3);
    }
}
