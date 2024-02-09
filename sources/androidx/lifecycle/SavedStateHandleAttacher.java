package androidx.lifecycle;

import androidx.lifecycle.g;
import kotlin.jvm.internal.l;

public final class SavedStateHandleAttacher implements j {

    /* renamed from: m  reason: collision with root package name */
    private final z f2721m;

    public SavedStateHandleAttacher(z zVar) {
        l.e(zVar, "provider");
        this.f2721m = zVar;
    }

    public void h(l lVar, g.a aVar) {
        l.e(lVar, "source");
        l.e(aVar, "event");
        if (aVar == g.a.ON_CREATE) {
            lVar.a().c(this);
            this.f2721m.c();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
    }
}
