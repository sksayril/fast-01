package androidx.lifecycle;

import androidx.lifecycle.g;
import androidx.savedstate.a;
import kotlin.jvm.internal.l;

public final class SavedStateHandleController implements j {

    /* renamed from: m  reason: collision with root package name */
    private final String f2722m;

    /* renamed from: n  reason: collision with root package name */
    private final x f2723n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f2724o;

    public final void a(a aVar, g gVar) {
        l.e(aVar, "registry");
        l.e(gVar, "lifecycle");
        if (!this.f2724o) {
            this.f2724o = true;
            gVar.a(this);
            aVar.h(this.f2722m, this.f2723n.c());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner".toString());
    }

    public final boolean e() {
        return this.f2724o;
    }

    public void h(l lVar, g.a aVar) {
        l.e(lVar, "source");
        l.e(aVar, "event");
        if (aVar == g.a.ON_DESTROY) {
            this.f2724o = false;
            lVar.a().c(this);
        }
    }
}
