package androidx.profileinstaller;

import androidx.profileinstaller.i;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ i.c f2845m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ int f2846n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ Object f2847o;

    public /* synthetic */ h(i.c cVar, int i10, Object obj) {
        this.f2845m = cVar;
        this.f2846n = i10;
        this.f2847o = obj;
    }

    public final void run() {
        this.f2845m.b(this.f2846n, this.f2847o);
    }
}
