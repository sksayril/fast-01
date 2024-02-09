package n6;

import android.os.Handler;
import android.os.HandlerThread;

class k {

    /* renamed from: e  reason: collision with root package name */
    private static k f11387e;

    /* renamed from: a  reason: collision with root package name */
    private Handler f11388a;

    /* renamed from: b  reason: collision with root package name */
    private HandlerThread f11389b;

    /* renamed from: c  reason: collision with root package name */
    private int f11390c = 0;

    /* renamed from: d  reason: collision with root package name */
    private final Object f11391d = new Object();

    private k() {
    }

    private void a() {
        synchronized (this.f11391d) {
            if (this.f11388a == null) {
                if (this.f11390c > 0) {
                    HandlerThread handlerThread = new HandlerThread("CameraThread");
                    this.f11389b = handlerThread;
                    handlerThread.start();
                    this.f11388a = new Handler(this.f11389b.getLooper());
                } else {
                    throw new IllegalStateException("CameraThread is not open");
                }
            }
        }
    }

    public static k d() {
        if (f11387e == null) {
            f11387e = new k();
        }
        return f11387e;
    }

    private void f() {
        synchronized (this.f11391d) {
            this.f11389b.quit();
            this.f11389b = null;
            this.f11388a = null;
        }
    }

    /* access modifiers changed from: protected */
    public void b() {
        synchronized (this.f11391d) {
            int i10 = this.f11390c - 1;
            this.f11390c = i10;
            if (i10 == 0) {
                f();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void c(Runnable runnable) {
        synchronized (this.f11391d) {
            a();
            this.f11388a.post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void e(Runnable runnable) {
        synchronized (this.f11391d) {
            this.f11390c++;
            c(runnable);
        }
    }
}
