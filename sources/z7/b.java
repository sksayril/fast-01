package z7;

import k7.d;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ d.b f13600m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ IllegalStateException f13601n;

    public /* synthetic */ b(d.b bVar, IllegalStateException illegalStateException) {
        this.f13600m = bVar;
        this.f13601n = illegalStateException;
    }

    public final void run() {
        this.f13600m.b("IllegalStateException", "Caught IllegalStateException: " + this.f13601n.getMessage(), (Object) null);
    }
}
