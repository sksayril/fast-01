package b2;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

final class c extends Thread {

    /* renamed from: m  reason: collision with root package name */
    private final WeakReference<a> f3384m;

    /* renamed from: n  reason: collision with root package name */
    private final long f3385n;

    /* renamed from: o  reason: collision with root package name */
    final CountDownLatch f3386o = new CountDownLatch(1);

    /* renamed from: p  reason: collision with root package name */
    boolean f3387p = false;

    public c(a aVar, long j10) {
        this.f3384m = new WeakReference<>(aVar);
        this.f3385n = j10;
        start();
    }

    private final void a() {
        a aVar = (a) this.f3384m.get();
        if (aVar != null) {
            aVar.c();
            this.f3387p = true;
        }
    }

    public final void run() {
        try {
            if (!this.f3386o.await(this.f3385n, TimeUnit.MILLISECONDS)) {
                a();
            }
        } catch (InterruptedException unused) {
            a();
        }
    }
}
