package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.g;

@Deprecated
class ReflectiveGenericLifecycleObserver implements j {

    /* renamed from: m  reason: collision with root package name */
    private final Object f2719m;

    /* renamed from: n  reason: collision with root package name */
    private final a.C0049a f2720n;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f2719m = obj;
        this.f2720n = a.f2726c.c(obj.getClass());
    }

    public void h(l lVar, g.a aVar) {
        this.f2720n.a(lVar, aVar, this.f2719m);
    }
}
