package v6;

import k7.j;
import k7.k;

class e implements k.c {

    /* renamed from: m  reason: collision with root package name */
    private final a f12746m;

    e(a aVar) {
        this.f12746m = aVar;
    }

    public void onMethodCall(j jVar, k.d dVar) {
        if ("check".equals(jVar.f10996a)) {
            dVar.a(this.f12746m.b());
        } else {
            dVar.c();
        }
    }
}
