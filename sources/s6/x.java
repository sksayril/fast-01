package s6;

import k7.j;
import k7.k;
import u6.d;

public final /* synthetic */ class x implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ j f12322m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ k.d f12323n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ i f12324o;

    public /* synthetic */ x(j jVar, k.d dVar, i iVar) {
        this.f12322m = jVar;
        this.f12323n = dVar;
        this.f12324o = iVar;
    }

    public final void run() {
        this.f12324o.v(new d(this.f12322m, this.f12323n));
    }
}
