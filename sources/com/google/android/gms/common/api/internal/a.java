package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import l2.k;

public final class a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: q  reason: collision with root package name */
    private static final a f4932q = new a();

    /* renamed from: m  reason: collision with root package name */
    private final AtomicBoolean f4933m = new AtomicBoolean();

    /* renamed from: n  reason: collision with root package name */
    private final AtomicBoolean f4934n = new AtomicBoolean();

    /* renamed from: o  reason: collision with root package name */
    private final ArrayList f4935o = new ArrayList();

    /* renamed from: p  reason: collision with root package name */
    private boolean f4936p = false;

    /* renamed from: com.google.android.gms.common.api.internal.a$a  reason: collision with other inner class name */
    public interface C0087a {
        void a(boolean z9);
    }

    private a() {
    }

    public static a b() {
        return f4932q;
    }

    public static void c(Application application) {
        a aVar = f4932q;
        synchronized (aVar) {
            if (!aVar.f4936p) {
                application.registerActivityLifecycleCallbacks(aVar);
                application.registerComponentCallbacks(aVar);
                aVar.f4936p = true;
            }
        }
    }

    private final void f(boolean z9) {
        synchronized (f4932q) {
            Iterator it = this.f4935o.iterator();
            while (it.hasNext()) {
                ((C0087a) it.next()).a(z9);
            }
        }
    }

    public void a(C0087a aVar) {
        synchronized (f4932q) {
            this.f4935o.add(aVar);
        }
    }

    public boolean d() {
        return this.f4933m.get();
    }

    @TargetApi(16)
    public boolean e(boolean z9) {
        if (!this.f4934n.get()) {
            if (!k.b()) {
                return z9;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f4934n.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f4933m.set(true);
            }
        }
        return d();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f4933m.compareAndSet(true, false);
        this.f4934n.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f4933m.compareAndSet(true, false);
        this.f4934n.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f4933m.compareAndSet(false, true)) {
            this.f4934n.set(true);
            f(true);
        }
    }
}
