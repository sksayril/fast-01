package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.u;
import java.util.List;
import kotlin.jvm.internal.l;
import t0.a;

public final class ProcessLifecycleInitializer implements a<l> {
    public List<Class<? extends a<?>>> a() {
        return n.c();
    }

    /* renamed from: c */
    public l b(Context context) {
        l.e(context, "context");
        androidx.startup.a e10 = androidx.startup.a.e(context);
        l.d(e10, "getInstance(context)");
        if (e10.g(ProcessLifecycleInitializer.class)) {
            i.a(context);
            u.b bVar = u.f2770u;
            bVar.b(context);
            return bVar.a();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }
}
