package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.j;
import androidx.lifecycle.l;

class FragmentManager$6 implements j {

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ String f2358m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ s f2359n;

    /* renamed from: o  reason: collision with root package name */
    final /* synthetic */ g f2360o;

    /* renamed from: p  reason: collision with root package name */
    final /* synthetic */ n f2361p;

    public void h(l lVar, g.a aVar) {
        Bundle bundle;
        if (aVar == g.a.ON_START && (bundle = (Bundle) this.f2361p.f2513j.get(this.f2358m)) != null) {
            this.f2359n.a(this.f2358m, bundle);
            this.f2361p.q(this.f2358m);
        }
        if (aVar == g.a.ON_DESTROY) {
            this.f2360o.c(this);
            this.f2361p.f2514k.remove(this.f2358m);
        }
    }
}
