package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.l;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f2752a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f2753b = new AtomicBoolean(false);

    public static final class a extends c {
        public void onActivityCreated(Activity activity, Bundle bundle) {
            l.e(activity, "activity");
            v.f2782n.c(activity);
        }
    }

    private i() {
    }

    public static final void a(Context context) {
        l.e(context, "context");
        if (!f2753b.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            l.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
        }
    }
}
