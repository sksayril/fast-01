package io.flutter.plugins.googlemaps;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import k7.k;
import z2.b0;
import z2.y;

class g0 implements b0 {

    /* renamed from: b  reason: collision with root package name */
    protected final String f10475b;

    /* renamed from: c  reason: collision with root package name */
    protected final k f10476c;

    /* renamed from: d  reason: collision with root package name */
    protected final Handler f10477d = new Handler(Looper.getMainLooper());

    private final class a implements k.d {

        /* renamed from: a  reason: collision with root package name */
        private final CountDownLatch f10478a = new CountDownLatch(1);

        /* renamed from: b  reason: collision with root package name */
        private final int f10479b;

        /* renamed from: c  reason: collision with root package name */
        private final int f10480c;

        /* renamed from: d  reason: collision with root package name */
        private final int f10481d;

        /* renamed from: e  reason: collision with root package name */
        private Map<String, ?> f10482e;

        a(int i10, int i11, int i12) {
            this.f10479b = i10;
            this.f10480c = i11;
            this.f10481d = i12;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void f() {
            g0 g0Var = g0.this;
            g0Var.f10476c.d("tileOverlay#getTile", e.r(g0Var.f10475b, this.f10479b, this.f10480c, this.f10481d), this);
        }

        public void a(Object obj) {
            this.f10482e = (Map) obj;
            this.f10478a.countDown();
        }

        public void b(String str, String str2, Object obj) {
            Log.e("TileProviderController", "Can't get tile: errorCode = " + str + ", errorMessage = " + str + ", date = " + obj);
            this.f10482e = null;
            this.f10478a.countDown();
        }

        public void c() {
            Log.e("TileProviderController", "Can't get tile: notImplemented");
            this.f10482e = null;
            this.f10478a.countDown();
        }

        /* access modifiers changed from: package-private */
        public y e() {
            String format;
            g0.this.f10477d.post(new f0(this));
            try {
                this.f10478a.await();
                try {
                    return e.j(this.f10482e);
                } catch (Exception e10) {
                    e = e10;
                    format = "Can't parse tile data";
                    Log.e("TileProviderController", format, e);
                    return b0.f13477a;
                }
            } catch (InterruptedException e11) {
                e = e11;
                format = String.format("countDownLatch: can't get tile: x = %d, y= %d, zoom = %d", new Object[]{Integer.valueOf(this.f10479b), Integer.valueOf(this.f10480c), Integer.valueOf(this.f10481d)});
                Log.e("TileProviderController", format, e);
                return b0.f13477a;
            }
        }
    }

    g0(k kVar, String str) {
        this.f10475b = str;
        this.f10476c = kVar;
    }

    public y a(int i10, int i11, int i12) {
        return new a(i10, i11, i12).e();
    }
}
