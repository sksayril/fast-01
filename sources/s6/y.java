package s6;

import k7.j;
import k7.k;
import u6.d;

public final /* synthetic */ class y implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ j f12325m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ k.d f12326n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ i f12327o;

    public /* synthetic */ y(j jVar, k.d dVar, i iVar) {
        this.f12325m = jVar;
        this.f12326n = dVar;
        this.f12327o = iVar;
    }

    public final void run() {
        this.f12327o.P(new d(this.f12325m, this.f12326n));
    }
}
