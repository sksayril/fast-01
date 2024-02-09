package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

final class d {

    /* renamed from: a  reason: collision with root package name */
    protected static final Class<?> f1218a;

    /* renamed from: b  reason: collision with root package name */
    protected static final Field f1219b = b();

    /* renamed from: c  reason: collision with root package name */
    protected static final Field f1220c = f();

    /* renamed from: d  reason: collision with root package name */
    protected static final Method f1221d;

    /* renamed from: e  reason: collision with root package name */
    protected static final Method f1222e;

    /* renamed from: f  reason: collision with root package name */
    protected static final Method f1223f;

    /* renamed from: g  reason: collision with root package name */
    private static final Handler f1224g = new Handler(Looper.getMainLooper());

    class a implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C0016d f1225m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Object f1226n;

        a(C0016d dVar, Object obj) {
            this.f1225m = dVar;
            this.f1226n = obj;
        }

        public void run() {
            this.f1225m.f1231m = this.f1226n;
        }
    }

    class b implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Application f1227m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ C0016d f1228n;

        b(Application application, C0016d dVar) {
            this.f1227m = application;
            this.f1228n = dVar;
        }

        public void run() {
            this.f1227m.unregisterActivityLifecycleCallbacks(this.f1228n);
        }
    }

    class c implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ Object f1229m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Object f1230n;

        c(Object obj, Object obj2) {
            this.f1229m = obj;
            this.f1230n = obj2;
        }

        public void run() {
            try {
                Method method = d.f1221d;
                if (method != null) {
                    method.invoke(this.f1229m, new Object[]{this.f1230n, Boolean.FALSE, "AppCompat recreation"});
                    return;
                }
                d.f1222e.invoke(this.f1229m, new Object[]{this.f1230n, Boolean.FALSE});
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* renamed from: androidx.core.app.d$d  reason: collision with other inner class name */
    private static final class C0016d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: m  reason: collision with root package name */
        Object f1231m;

        /* renamed from: n  reason: collision with root package name */
        private Activity f1232n;

        /* renamed from: o  reason: collision with root package name */
        private final int f1233o;

        /* renamed from: p  reason: collision with root package name */
        private boolean f1234p = false;

        /* renamed from: q  reason: collision with root package name */
        private boolean f1235q = false;

        /* renamed from: r  reason: collision with root package name */
        private boolean f1236r = false;

        C0016d(Activity activity) {
            this.f1232n = activity;
            this.f1233o = activity.hashCode();
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f1232n == activity) {
                this.f1232n = null;
                this.f1235q = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f1235q && !this.f1236r && !this.f1234p && d.h(this.f1231m, this.f1233o, activity)) {
                this.f1236r = true;
                this.f1231m = null;
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f1232n == activity) {
                this.f1234p = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> a10 = a();
        f1218a = a10;
        f1221d = d(a10);
        f1222e = c(a10);
        f1223f = e(a10);
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    protected static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f1220c.get(activity);
            if (obj2 == obj) {
                if (activity.hashCode() == i10) {
                    f1224g.postAtFrontOfQueue(new c(f1219b.get(activity), obj2));
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        Application application;
        C0016d dVar;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (g() && f1223f == null) {
            return false;
        } else {
            if (f1222e == null && f1221d == null) {
                return false;
            }
            try {
                Object obj2 = f1220c.get(activity);
                if (obj2 == null || (obj = f1219b.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                dVar = new C0016d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = f1224g;
                handler.post(new a(dVar, obj2));
                if (g()) {
                    Method method = f1223f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, new Object[]{obj2, null, null, 0, bool, null, null, bool, bool});
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
