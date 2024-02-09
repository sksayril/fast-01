package v6;

import android.content.Context;
import android.net.ConnectivityManager;
import c7.a;
import k7.c;
import k7.d;
import k7.k;

public class f implements a {

    /* renamed from: m  reason: collision with root package name */
    private k f12747m;

    /* renamed from: n  reason: collision with root package name */
    private d f12748n;

    /* renamed from: o  reason: collision with root package name */
    private d f12749o;

    private void a(c cVar, Context context) {
        this.f12747m = new k(cVar, "dev.fluttercommunity.plus/connectivity");
        this.f12748n = new d(cVar, "dev.fluttercommunity.plus/connectivity_status");
        a aVar = new a((ConnectivityManager) context.getSystemService("connectivity"));
        e eVar = new e(aVar);
        this.f12749o = new d(context, aVar);
        this.f12747m.e(eVar);
        this.f12748n.d(this.f12749o);
    }

    private void b() {
        this.f12747m.e((k.c) null);
        this.f12748n.d((d.C0170d) null);
        this.f12749o.b((Object) null);
        this.f12747m = null;
        this.f12748n = null;
        this.f12749o = null;
    }

    public void onAttachedToEngine(a.b bVar) {
        a(bVar.b(), bVar.a());
    }

    public void onDetachedFromEngine(a.b bVar) {
        b();
    }
}
