package n6;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import m6.p;
import m6.r;
import s5.k;

public class g {
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final String f11341n = "g";
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public k f11342a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public j f11343b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public h f11344c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public Handler f11345d;

    /* renamed from: e  reason: collision with root package name */
    private m f11346e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11347f = false;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f11348g = true;

    /* renamed from: h  reason: collision with root package name */
    private Handler f11349h;

    /* renamed from: i  reason: collision with root package name */
    private i f11350i = new i();

    /* renamed from: j  reason: collision with root package name */
    private Runnable f11351j = new a();

    /* renamed from: k  reason: collision with root package name */
    private Runnable f11352k = new b();

    /* renamed from: l  reason: collision with root package name */
    private Runnable f11353l = new c();

    /* renamed from: m  reason: collision with root package name */
    private Runnable f11354m = new d();

    class a implements Runnable {
        a() {
        }

        public void run() {
            try {
                Log.d(g.f11341n, "Opening camera");
                g.this.f11344c.l();
            } catch (Exception e10) {
                g.this.t(e10);
                Log.e(g.f11341n, "Failed to open camera", e10);
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            try {
                Log.d(g.f11341n, "Configuring camera");
                g.this.f11344c.e();
                if (g.this.f11345d != null) {
                    g.this.f11345d.obtainMessage(k.zxing_prewiew_size_ready, g.this.o()).sendToTarget();
                }
            } catch (Exception e10) {
                g.this.t(e10);
                Log.e(g.f11341n, "Failed to configure camera", e10);
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            try {
                Log.d(g.f11341n, "Starting preview");
                g.this.f11344c.s(g.this.f11343b);
                g.this.f11344c.u();
            } catch (Exception e10) {
                g.this.t(e10);
                Log.e(g.f11341n, "Failed to start preview", e10);
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        public void run() {
            try {
                Log.d(g.f11341n, "Closing camera");
                g.this.f11344c.v();
                g.this.f11344c.d();
            } catch (Exception e10) {
                Log.e(g.f11341n, "Failed to close camera", e10);
            }
            boolean unused = g.this.f11348g = true;
            g.this.f11345d.sendEmptyMessage(k.zxing_camera_closed);
            g.this.f11342a.b();
        }
    }

    public g(Context context) {
        r.a();
        this.f11342a = k.d();
        h hVar = new h(context);
        this.f11344c = hVar;
        hVar.o(this.f11350i);
        this.f11349h = new Handler();
    }

    private void C() {
        if (!this.f11347f) {
            throw new IllegalStateException("CameraInstance is not open");
        }
    }

    /* access modifiers changed from: private */
    public p o() {
        return this.f11344c.h();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void q(p pVar) {
        this.f11344c.m(pVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void r(p pVar) {
        if (!this.f11347f) {
            Log.d(f11341n, "Camera is closed, not requesting preview");
        } else {
            this.f11342a.c(new d(this, pVar));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void s(boolean z9) {
        this.f11344c.t(z9);
    }

    /* access modifiers changed from: private */
    public void t(Exception exc) {
        Handler handler = this.f11345d;
        if (handler != null) {
            handler.obtainMessage(k.zxing_camera_error, exc).sendToTarget();
        }
    }

    public void A(boolean z9) {
        r.a();
        if (this.f11347f) {
            this.f11342a.c(new f(this, z9));
        }
    }

    public void B() {
        r.a();
        C();
        this.f11342a.c(this.f11353l);
    }

    public void l() {
        r.a();
        if (this.f11347f) {
            this.f11342a.c(this.f11354m);
        } else {
            this.f11348g = true;
        }
        this.f11347f = false;
    }

    public void m() {
        r.a();
        C();
        this.f11342a.c(this.f11352k);
    }

    public m n() {
        return this.f11346e;
    }

    public boolean p() {
        return this.f11348g;
    }

    public void u() {
        r.a();
        this.f11347f = true;
        this.f11348g = false;
        this.f11342a.e(this.f11351j);
    }

    public void v(p pVar) {
        this.f11349h.post(new e(this, pVar));
    }

    public void w(i iVar) {
        if (!this.f11347f) {
            this.f11350i = iVar;
            this.f11344c.o(iVar);
        }
    }

    public void x(m mVar) {
        this.f11346e = mVar;
        this.f11344c.q(mVar);
    }

    public void y(Handler handler) {
        this.f11345d = handler;
    }

    public void z(j jVar) {
        this.f11343b = jVar;
    }
}
