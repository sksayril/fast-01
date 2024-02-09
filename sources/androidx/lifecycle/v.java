package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.g;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

public class v extends Fragment {

    /* renamed from: n  reason: collision with root package name */
    public static final b f2782n = new b((g) null);

    /* renamed from: m  reason: collision with root package name */
    private a f2783m;

    public interface a {
        void o();

        void s();

        void t();
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }

        public final void a(Activity activity, g.a aVar) {
            l.e(activity, "activity");
            l.e(aVar, "event");
            if (activity instanceof n) {
                ((n) activity).a().h(aVar);
            } else if (activity instanceof l) {
                g a10 = ((l) activity).a();
                if (a10 instanceof m) {
                    ((m) a10).h(aVar);
                }
            }
        }

        public final v b(Activity activity) {
            l.e(activity, "<this>");
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            l.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (v) findFragmentByTag;
        }

        public final void c(Activity activity) {
            l.e(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                c.Companion.a(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new v(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }
    }

    public static final class c implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a((kotlin.jvm.internal.g) null);

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final void a(Activity activity) {
                l.e(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new c());
            }
        }

        public static final void registerIn(Activity activity) {
            Companion.a(activity);
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            l.e(activity, "activity");
        }

        public void onActivityDestroyed(Activity activity) {
            l.e(activity, "activity");
        }

        public void onActivityPaused(Activity activity) {
            l.e(activity, "activity");
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            l.e(activity, "activity");
            v.f2782n.a(activity, g.a.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            l.e(activity, "activity");
            v.f2782n.a(activity, g.a.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            l.e(activity, "activity");
            v.f2782n.a(activity, g.a.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            l.e(activity, "activity");
            v.f2782n.a(activity, g.a.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            l.e(activity, "activity");
            v.f2782n.a(activity, g.a.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            l.e(activity, "activity");
            v.f2782n.a(activity, g.a.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
            l.e(activity, "activity");
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            l.e(activity, "activity");
            l.e(bundle, "bundle");
        }

        public void onActivityStarted(Activity activity) {
            l.e(activity, "activity");
        }

        public void onActivityStopped(Activity activity) {
            l.e(activity, "activity");
        }
    }

    private final void a(g.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            b bVar = f2782n;
            Activity activity = getActivity();
            l.d(activity, "activity");
            bVar.a(activity, aVar);
        }
    }

    private final void b(a aVar) {
        if (aVar != null) {
            aVar.t();
        }
    }

    private final void c(a aVar) {
        if (aVar != null) {
            aVar.o();
        }
    }

    private final void d(a aVar) {
        if (aVar != null) {
            aVar.s();
        }
    }

    public static final void e(Activity activity) {
        f2782n.c(activity);
    }

    public final void f(a aVar) {
        this.f2783m = aVar;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b(this.f2783m);
        a(g.a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        a(g.a.ON_DESTROY);
        this.f2783m = null;
    }

    public void onPause() {
        super.onPause();
        a(g.a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        c(this.f2783m);
        a(g.a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        d(this.f2783m);
        a(g.a.ON_START);
    }

    public void onStop() {
        super.onStop();
        a(g.a.ON_STOP);
    }
}
