package w1;

import p1.p;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ r f12770m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ p f12771n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f12772o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Runnable f12773p;

    public /* synthetic */ g(r rVar, p pVar, int i10, Runnable runnable) {
        this.f12770m = rVar;
        this.f12771n = pVar;
        this.f12772o = i10;
        this.f12773p = runnable;
    }

    public final void run() {
        this.f12770m.t(this.f12771n, this.f12772o, this.f12773p);
    }
}
