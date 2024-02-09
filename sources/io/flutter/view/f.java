package io.flutter.view;

import android.annotation.TargetApi;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

public class f {

    /* renamed from: e  reason: collision with root package name */
    private static f f10710e;

    /* renamed from: f  reason: collision with root package name */
    private static b f10711f;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public long f10712a = -1;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public FlutterJNI f10713b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public c f10714c = new c(0);

    /* renamed from: d  reason: collision with root package name */
    private final FlutterJNI.b f10715d = new a();

    class a implements FlutterJNI.b {
        a() {
        }

        private Choreographer.FrameCallback b(long j10) {
            if (f.this.f10714c == null) {
                return new c(j10);
            }
            long unused = f.this.f10714c.f10719a = j10;
            c d10 = f.this.f10714c;
            c unused2 = f.this.f10714c = null;
            return d10;
        }

        public void a(long j10) {
            Choreographer.getInstance().postFrameCallback(b(j10));
        }
    }

    @TargetApi(17)
    class b implements DisplayManager.DisplayListener {

        /* renamed from: a  reason: collision with root package name */
        private DisplayManager f10717a;

        b(DisplayManager displayManager) {
            this.f10717a = displayManager;
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f10717a.registerDisplayListener(this, (Handler) null);
        }

        public void onDisplayAdded(int i10) {
        }

        public void onDisplayChanged(int i10) {
            if (i10 == 0) {
                float refreshRate = this.f10717a.getDisplay(0).getRefreshRate();
                long unused = f.this.f10712a = (long) (1.0E9d / ((double) refreshRate));
                f.this.f10713b.setRefreshRateFPS(refreshRate);
            }
        }

        public void onDisplayRemoved(int i10) {
        }
    }

    private class c implements Choreographer.FrameCallback {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public long f10719a;

        c(long j10) {
            this.f10719a = j10;
        }

        public void doFrame(long j10) {
            long nanoTime = System.nanoTime() - j10;
            f.this.f10713b.onVsync(nanoTime < 0 ? 0 : nanoTime, f.this.f10712a, this.f10719a);
            c unused = f.this.f10714c = this;
        }
    }

    private f(FlutterJNI flutterJNI) {
        this.f10713b = flutterJNI;
    }

    @TargetApi(17)
    public static f f(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f10710e == null) {
            f10710e = new f(flutterJNI);
        }
        if (f10711f == null) {
            f fVar = f10710e;
            Objects.requireNonNull(fVar);
            b bVar = new b(displayManager);
            f10711f = bVar;
            bVar.a();
        }
        if (f10710e.f10712a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f10710e.f10712a = (long) (1.0E9d / ((double) refreshRate));
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f10710e;
    }

    public void g() {
        this.f10713b.setAsyncWaitForVsyncDelegate(this.f10715d);
    }
}
