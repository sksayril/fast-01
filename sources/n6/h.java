package n6;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import m6.p;
import m6.q;
import s5.b;

public final class h {
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public static final String f11359n = "h";

    /* renamed from: a  reason: collision with root package name */
    private Camera f11360a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Camera.CameraInfo f11361b;

    /* renamed from: c  reason: collision with root package name */
    private a f11362c;

    /* renamed from: d  reason: collision with root package name */
    private b f11363d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f11364e;

    /* renamed from: f  reason: collision with root package name */
    private String f11365f;

    /* renamed from: g  reason: collision with root package name */
    private i f11366g = new i();

    /* renamed from: h  reason: collision with root package name */
    private m f11367h;

    /* renamed from: i  reason: collision with root package name */
    private p f11368i;

    /* renamed from: j  reason: collision with root package name */
    private p f11369j;

    /* renamed from: k  reason: collision with root package name */
    private int f11370k = -1;

    /* renamed from: l  reason: collision with root package name */
    private Context f11371l;

    /* renamed from: m  reason: collision with root package name */
    private final a f11372m;

    private final class a implements Camera.PreviewCallback {

        /* renamed from: a  reason: collision with root package name */
        private p f11373a;

        /* renamed from: b  reason: collision with root package name */
        private p f11374b;

        public a() {
        }

        public void a(p pVar) {
            this.f11373a = pVar;
        }

        public void b(p pVar) {
            this.f11374b = pVar;
        }

        public void onPreviewFrame(byte[] bArr, Camera camera) {
            Exception e10;
            p pVar = this.f11374b;
            p pVar2 = this.f11373a;
            if (pVar == null || pVar2 == null) {
                Log.d(h.f11359n, "Got preview callback, but no handler or resolution available");
                if (pVar2 != null) {
                    e10 = new Exception("No resolution available");
                } else {
                    return;
                }
            } else if (bArr != null) {
                try {
                    byte[] bArr2 = bArr;
                    q qVar = new q(bArr2, pVar.f11243m, pVar.f11244n, camera.getParameters().getPreviewFormat(), h.this.f());
                    if (h.this.f11361b.facing == 1) {
                        qVar.e(true);
                    }
                    pVar2.a(qVar);
                    return;
                } catch (RuntimeException e11) {
                    e10 = e11;
                    Log.e(h.f11359n, "Camera preview failed", e10);
                }
            } else {
                throw new NullPointerException("No preview data received");
            }
            pVar2.b(e10);
        }
    }

    public h(Context context) {
        this.f11371l = context;
        this.f11372m = new a();
    }

    private int c() {
        int c10 = this.f11367h.c();
        int i10 = 0;
        if (c10 != 0) {
            if (c10 == 1) {
                i10 = 90;
            } else if (c10 == 2) {
                i10 = 180;
            } else if (c10 == 3) {
                i10 = 270;
            }
        }
        Camera.CameraInfo cameraInfo = this.f11361b;
        int i11 = cameraInfo.facing;
        int i12 = cameraInfo.orientation;
        int i13 = (i11 == 1 ? 360 - ((i12 + i10) % 360) : (i12 - i10) + 360) % 360;
        String str = f11359n;
        Log.i(str, "Camera Display Orientation: " + i13);
        return i13;
    }

    private Camera.Parameters g() {
        Camera.Parameters parameters = this.f11360a.getParameters();
        String str = this.f11365f;
        if (str == null) {
            this.f11365f = parameters.flatten();
        } else {
            parameters.unflatten(str);
        }
        return parameters;
    }

    private static List<p> i(Camera.Parameters parameters) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                new p(previewSize.width, previewSize.height);
                arrayList.add(new p(previewSize.width, previewSize.height));
            }
            return arrayList;
        }
        for (Camera.Size next : supportedPreviewSizes) {
            arrayList.add(new p(next.width, next.height));
        }
        return arrayList;
    }

    private void n(int i10) {
        this.f11360a.setDisplayOrientation(i10);
    }

    private void p(boolean z9) {
        Camera.Parameters g10 = g();
        if (g10 == null) {
            Log.w(f11359n, "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        String str = f11359n;
        Log.i(str, "Initial camera parameters: " + g10.flatten());
        if (z9) {
            Log.w(str, "In camera config safe mode -- most settings will not be honored");
        }
        c.g(g10, this.f11366g.a(), z9);
        if (!z9) {
            c.k(g10, false);
            if (this.f11366g.h()) {
                c.i(g10);
            }
            if (this.f11366g.e()) {
                c.c(g10);
            }
            if (this.f11366g.g()) {
                c.l(g10);
                c.h(g10);
                c.j(g10);
            }
        }
        List<p> i10 = i(g10);
        if (i10.size() == 0) {
            this.f11368i = null;
        } else {
            p a10 = this.f11367h.a(i10, j());
            this.f11368i = a10;
            g10.setPreviewSize(a10.f11243m, a10.f11244n);
        }
        if (Build.DEVICE.equals("glass-1")) {
            c.e(g10);
        }
        Log.i(str, "Final camera parameters: " + g10.flatten());
        this.f11360a.setParameters(g10);
    }

    private void r() {
        try {
            int c10 = c();
            this.f11370k = c10;
            n(c10);
        } catch (Exception unused) {
            Log.w(f11359n, "Failed to set rotation.");
        }
        try {
            p(false);
        } catch (Exception unused2) {
            try {
                p(true);
            } catch (Exception unused3) {
                Log.w(f11359n, "Camera rejected even safe-mode parameters! No configuration");
            }
        }
        Camera.Size previewSize = this.f11360a.getParameters().getPreviewSize();
        if (previewSize == null) {
            this.f11369j = this.f11368i;
        } else {
            this.f11369j = new p(previewSize.width, previewSize.height);
        }
        this.f11372m.b(this.f11369j);
    }

    public void d() {
        Camera camera = this.f11360a;
        if (camera != null) {
            camera.release();
            this.f11360a = null;
        }
    }

    public void e() {
        if (this.f11360a != null) {
            r();
            return;
        }
        throw new RuntimeException("Camera not open");
    }

    public int f() {
        return this.f11370k;
    }

    public p h() {
        if (this.f11369j == null) {
            return null;
        }
        return j() ? this.f11369j.g() : this.f11369j;
    }

    public boolean j() {
        int i10 = this.f11370k;
        if (i10 != -1) {
            return i10 % 180 != 0;
        }
        throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
    }

    public boolean k() {
        String flashMode;
        Camera.Parameters parameters = this.f11360a.getParameters();
        if (parameters == null || (flashMode = parameters.getFlashMode()) == null) {
            return false;
        }
        return "on".equals(flashMode) || "torch".equals(flashMode);
    }

    public void l() {
        Camera b10 = t5.a.b(this.f11366g.b());
        this.f11360a = b10;
        if (b10 != null) {
            int a10 = t5.a.a(this.f11366g.b());
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            this.f11361b = cameraInfo;
            Camera.getCameraInfo(a10, cameraInfo);
            return;
        }
        throw new RuntimeException("Failed to open camera");
    }

    public void m(p pVar) {
        Camera camera = this.f11360a;
        if (camera != null && this.f11364e) {
            this.f11372m.a(pVar);
            camera.setOneShotPreviewCallback(this.f11372m);
        }
    }

    public void o(i iVar) {
        this.f11366g = iVar;
    }

    public void q(m mVar) {
        this.f11367h = mVar;
    }

    public void s(j jVar) {
        jVar.a(this.f11360a);
    }

    public void t(boolean z9) {
        if (this.f11360a != null) {
            try {
                if (z9 != k()) {
                    a aVar = this.f11362c;
                    if (aVar != null) {
                        aVar.j();
                    }
                    Camera.Parameters parameters = this.f11360a.getParameters();
                    c.k(parameters, z9);
                    if (this.f11366g.f()) {
                        c.d(parameters, z9);
                    }
                    this.f11360a.setParameters(parameters);
                    a aVar2 = this.f11362c;
                    if (aVar2 != null) {
                        aVar2.i();
                    }
                }
            } catch (RuntimeException e10) {
                Log.e(f11359n, "Failed to set torch", e10);
            }
        }
    }

    public void u() {
        Camera camera = this.f11360a;
        if (camera != null && !this.f11364e) {
            camera.startPreview();
            this.f11364e = true;
            this.f11362c = new a(this.f11360a, this.f11366g);
            b bVar = new b(this.f11371l, this, this.f11366g);
            this.f11363d = bVar;
            bVar.d();
        }
    }

    public void v() {
        a aVar = this.f11362c;
        if (aVar != null) {
            aVar.j();
            this.f11362c = null;
        }
        b bVar = this.f11363d;
        if (bVar != null) {
            bVar.e();
            this.f11363d = null;
        }
        Camera camera = this.f11360a;
        if (camera != null && this.f11364e) {
            camera.stopPreview();
            this.f11372m.a((p) null);
            this.f11364e = false;
        }
    }
}
