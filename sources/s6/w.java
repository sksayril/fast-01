package s6;

import k7.j;
import k7.k;
import u6.d;

public final /* synthetic */ class w implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ j f12319m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ k.d f12320n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ i f12321o;

    public /* synthetic */ w(j jVar, k.d dVar, i iVar) {
        this.f12319m = jVar;
        this.f12320n = dVar;
        this.f12321o = iVar;
    }

    public final void run() {
        this.f12321o.R(new d(this.f12319m, this.f12320n));
    }
}
