package z0;

import android.util.Log;
import c7.a;

public final class b implements a {

    /* renamed from: m  reason: collision with root package name */
    private c f13463m;

    /* renamed from: n  reason: collision with root package name */
    private a f13464n;

    public void onAttachedToEngine(a.b bVar) {
        a aVar = new a(bVar.a());
        this.f13464n = aVar;
        c cVar = new c(aVar);
        this.f13463m = cVar;
        cVar.c(bVar.b());
    }

    public void onDetachedFromEngine(a.b bVar) {
        c cVar = this.f13463m;
        if (cVar == null) {
            Log.wtf("GeocodingPlugin", "Already detached from the engine.");
            return;
        }
        cVar.d();
        this.f13463m = null;
        this.f13464n = null;
    }
}
