package s6;

import android.os.Handler;
import android.os.HandlerThread;

class m {

    /* renamed from: a  reason: collision with root package name */
    private final String f12289a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12290b;

    /* renamed from: c  reason: collision with root package name */
    private HandlerThread f12291c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f12292d;

    /* renamed from: e  reason: collision with root package name */
    protected Runnable f12293e;

    /* renamed from: f  reason: collision with root package name */
    private k f12294f;

    m(String str, int i10) {
        this.f12289a = str;
        this.f12290b = i10;
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        k kVar = this.f12294f;
        return kVar != null && kVar.b();
    }

    /* access modifiers changed from: package-private */
    public Integer d() {
        k kVar = this.f12294f;
        if (kVar != null) {
            return kVar.a();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void e(k kVar) {
        this.f12292d.post(new l(this, kVar));
    }

    /* access modifiers changed from: package-private */
    public synchronized void f() {
        HandlerThread handlerThread = this.f12291c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f12291c = null;
            this.f12292d = null;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void g(Runnable runnable) {
        HandlerThread handlerThread = new HandlerThread(this.f12289a, this.f12290b);
        this.f12291c = handlerThread;
        handlerThread.start();
        this.f12292d = new Handler(this.f12291c.getLooper());
        this.f12293e = runnable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void c(k kVar) {
        kVar.f12286b.run();
        this.f12294f = kVar;
        this.f12293e.run();
    }
}
