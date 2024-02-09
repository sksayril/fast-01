package s6;

import android.os.Handler;
import android.os.HandlerThread;

class s implements o {

    /* renamed from: a  reason: collision with root package name */
    final String f12306a;

    /* renamed from: b  reason: collision with root package name */
    final int f12307b;

    /* renamed from: c  reason: collision with root package name */
    private HandlerThread f12308c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f12309d;

    s(String str, int i10) {
        this.f12306a = str;
        this.f12307b = i10;
    }

    public /* synthetic */ void a(i iVar, Runnable runnable) {
        n.a(this, iVar, runnable);
    }

    public void b(k kVar) {
        this.f12309d.post(kVar.f12286b);
    }

    public void c() {
        HandlerThread handlerThread = this.f12308c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f12308c = null;
            this.f12309d = null;
        }
    }

    public void start() {
        HandlerThread handlerThread = new HandlerThread(this.f12306a, this.f12307b);
        this.f12308c = handlerThread;
        handlerThread.start();
        this.f12309d = new Handler(this.f12308c.getLooper());
    }
}
