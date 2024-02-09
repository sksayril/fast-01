package androidx.lifecycle;

import androidx.lifecycle.g;
import androidx.savedstate.a;
import kotlin.jvm.internal.l;
import s0.d;

public final class LegacySavedStateHandleController {

    /* renamed from: a  reason: collision with root package name */
    public static final LegacySavedStateHandleController f2695a = new LegacySavedStateHandleController();

    public static final class a implements a.C0063a {
        public void a(d dVar) {
            l.e(dVar, "owner");
            if (dVar instanceof g0) {
                f0 l10 = ((g0) dVar).l();
                androidx.savedstate.a k10 = dVar.k();
                for (String b10 : l10.c()) {
                    b0 b11 = l10.b(b10);
                    l.b(b11);
                    LegacySavedStateHandleController.a(b11, k10, dVar.a());
                }
                if (!l10.c().isEmpty()) {
                    k10.i(a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
        }
    }

    private LegacySavedStateHandleController() {
    }

    public static final void a(b0 b0Var, androidx.savedstate.a aVar, g gVar) {
        l.e(b0Var, "viewModel");
        l.e(aVar, "registry");
        l.e(gVar, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) b0Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.e()) {
            savedStateHandleController.a(aVar, gVar);
            f2695a.b(aVar, gVar);
        }
    }

    private final void b(androidx.savedstate.a aVar, g gVar) {
        g.b b10 = gVar.b();
        if (b10 == g.b.INITIALIZED || b10.isAtLeast(g.b.STARTED)) {
            aVar.i(a.class);
        } else {
            gVar.a(new LegacySavedStateHandleController$tryToAddRecreator$1(gVar, aVar));
        }
    }
}
