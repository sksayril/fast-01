package g2;

import android.os.IBinder;

public final /* synthetic */ class t implements Runnable {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ g f8908m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ IBinder f8909n;

    public /* synthetic */ t(g gVar, IBinder iBinder) {
        this.f8908m = gVar;
        this.f8909n = iBinder;
    }

    public final void run() {
        this.f8908m.q(this.f8909n);
    }
}
