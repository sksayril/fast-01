package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.a;
import g8.g;
import java.util.Map;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;

public final class z implements a.c {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.savedstate.a f2796a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f2797b;

    /* renamed from: c  reason: collision with root package name */
    private Bundle f2798c;

    /* renamed from: d  reason: collision with root package name */
    private final g f2799d;

    static final class a extends m implements r8.a<a0> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ g0 f2800m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g0 g0Var) {
            super(0);
            this.f2800m = g0Var;
        }

        /* renamed from: b */
        public final a0 invoke() {
            return y.b(this.f2800m);
        }
    }

    public z(androidx.savedstate.a aVar, g0 g0Var) {
        l.e(aVar, "savedStateRegistry");
        l.e(g0Var, "viewModelStoreOwner");
        this.f2796a = aVar;
        this.f2799d = i.a(new a(g0Var));
    }

    private final a0 b() {
        return (a0) this.f2799d.getValue();
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f2798c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry next : b().e().entrySet()) {
            String str = (String) next.getKey();
            Bundle a10 = ((x) next.getValue()).c().a();
            if (!l.a(a10, Bundle.EMPTY)) {
                bundle.putBundle(str, a10);
            }
        }
        this.f2797b = false;
        return bundle;
    }

    public final void c() {
        if (!this.f2797b) {
            this.f2798c = this.f2796a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
            this.f2797b = true;
            b();
        }
    }
}
