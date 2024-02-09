package androidx.lifecycle;

import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.lifecycle.g;
import androidx.savedstate.a;
import kotlin.jvm.internal.l;

public final class LegacySavedStateHandleController$tryToAddRecreator$1 implements j {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ g f2696m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ a f2697n;

    LegacySavedStateHandleController$tryToAddRecreator$1(g gVar, a aVar) {
        this.f2696m = gVar;
        this.f2697n = aVar;
    }

    public void h(l lVar, g.a aVar) {
        l.e(lVar, "source");
        l.e(aVar, "event");
        if (aVar == g.a.ON_START) {
            this.f2696m.c(this);
            this.f2697n.i(LegacySavedStateHandleController.a.class);
        }
    }
}
