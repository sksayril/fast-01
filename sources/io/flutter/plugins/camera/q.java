package io.flutter.plugins.camera;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import io.flutter.embedding.engine.systemchannels.j;
import io.flutter.plugins.camera.k0;
import io.flutter.plugins.camera.s;
import io.flutter.view.e;
import java.io.File;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executors;
import k7.d;
import k7.k;

class q implements s.b, ImageReader.OnImageAvailableListener {
    private static final HashMap<String, Integer> B;
    k.d A;

    /* renamed from: a  reason: collision with root package name */
    n7.d f10250a;

    /* renamed from: b  reason: collision with root package name */
    private String f10251b;

    /* renamed from: c  reason: collision with root package name */
    private o0 f10252c;

    /* renamed from: d  reason: collision with root package name */
    private int f10253d;

    /* renamed from: e  reason: collision with root package name */
    private final e.c f10254e;

    /* renamed from: f  reason: collision with root package name */
    private final w7.b f10255f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f10256g;

    /* renamed from: h  reason: collision with root package name */
    private final Context f10257h;

    /* renamed from: i  reason: collision with root package name */
    final h0 f10258i;

    /* renamed from: j  reason: collision with root package name */
    private y f10259j;

    /* renamed from: k  reason: collision with root package name */
    private final n7.b f10260k;

    /* renamed from: l  reason: collision with root package name */
    private final Activity f10261l;

    /* renamed from: m  reason: collision with root package name */
    private final s f10262m;

    /* renamed from: n  reason: collision with root package name */
    Handler f10263n;

    /* renamed from: o  reason: collision with root package name */
    private HandlerThread f10264o;

    /* renamed from: p  reason: collision with root package name */
    t f10265p;

    /* renamed from: q  reason: collision with root package name */
    CameraCaptureSession f10266q;

    /* renamed from: r  reason: collision with root package name */
    private ImageReader f10267r;

    /* renamed from: s  reason: collision with root package name */
    z7.d f10268s;

    /* renamed from: t  reason: collision with root package name */
    CaptureRequest.Builder f10269t;

    /* renamed from: u  reason: collision with root package name */
    private MediaRecorder f10270u;

    /* renamed from: v  reason: collision with root package name */
    boolean f10271v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f10272w;

    /* renamed from: x  reason: collision with root package name */
    private File f10273x;

    /* renamed from: y  reason: collision with root package name */
    private a8.b f10274y;

    /* renamed from: z  reason: collision with root package name */
    private a8.a f10275z;

    class a extends CameraDevice.StateCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w7.a f10276a;

        a(w7.a aVar) {
            this.f10276a = aVar;
        }

        public void onClosed(CameraDevice cameraDevice) {
            Log.i("Camera", "open | onClosed");
            q qVar = q.this;
            qVar.f10265p = null;
            qVar.t();
            q.this.f10258i.l();
        }

        public void onDisconnected(CameraDevice cameraDevice) {
            Log.i("Camera", "open | onDisconnected");
            q.this.s();
            q.this.f10258i.m("The camera was disconnected.");
        }

        public void onError(CameraDevice cameraDevice, int i10) {
            Log.i("Camera", "open | onError");
            q.this.s();
            q.this.f10258i.m(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "Unknown camera error" : "The camera service has encountered a fatal error." : "The camera device has encountered a fatal error" : "The camera device could not be opened due to a device policy." : "Max cameras in use" : "The camera device is in use already.");
        }

        public void onOpened(CameraDevice cameraDevice) {
            q qVar = q.this;
            qVar.f10265p = new h(cameraDevice);
            try {
                q.this.x0();
                q qVar2 = q.this;
                if (!qVar2.f10271v) {
                    qVar2.f10258i.n(Integer.valueOf(this.f10276a.h().getWidth()), Integer.valueOf(this.f10276a.h().getHeight()), q.this.f10250a.c().c(), q.this.f10250a.b().c(), Boolean.valueOf(q.this.f10250a.e().c()), Boolean.valueOf(q.this.f10250a.g().c()));
                }
            } catch (Exception e10) {
                q.this.f10258i.m(e10.getMessage());
                q.this.s();
            }
        }
    }

    class b extends CameraCaptureSession.StateCallback {

        /* renamed from: a  reason: collision with root package name */
        boolean f10278a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f10279b;

        b(Runnable runnable) {
            this.f10279b = runnable;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(String str, String str2) {
            q.this.f10258i.m(str2);
        }

        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            Log.i("Camera", "CameraCaptureSession onClosed");
            this.f10278a = true;
        }

        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            Log.i("Camera", "CameraCaptureSession onConfigureFailed");
            q.this.f10258i.m("Failed to configure camera session.");
        }

        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Log.i("Camera", "CameraCaptureSession onConfigured");
            q qVar = q.this;
            if (qVar.f10265p == null || this.f10278a) {
                qVar.f10258i.m("The camera was closed during configuration.");
                return;
            }
            qVar.f10266q = cameraCaptureSession;
            Log.i("Camera", "Updating builder settings");
            q qVar2 = q.this;
            qVar2.J0(qVar2.f10269t);
            q.this.g0(this.f10279b, new r(this));
        }
    }

    class c extends CameraCaptureSession.CaptureCallback {
        c() {
        }

        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            q.this.H0();
        }
    }

    class d implements k0.a {
        d() {
        }

        public void a(String str, String str2) {
            q qVar = q.this;
            qVar.f10258i.d(qVar.A, str, str2, (Object) null);
        }

        public void b(String str) {
            q qVar = q.this;
            qVar.f10258i.e(qVar.A, str);
        }
    }

    class e implements d.C0170d {
        e() {
        }

        public void a(Object obj, d.b bVar) {
            q.this.s0(bVar);
        }

        public void b(Object obj) {
            q qVar = q.this;
            z7.d dVar = qVar.f10268s;
            if (dVar != null) {
                dVar.m(qVar.f10263n);
            }
        }
    }

    class f implements Thread.UncaughtExceptionHandler {
        f() {
        }

        public void uncaughtException(Thread thread, Throwable th) {
            q.this.f10258i.m("Failed to process frames after camera was flipped.");
        }
    }

    static /* synthetic */ class g {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10285a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                o7.b[] r0 = o7.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10285a = r0
                o7.b r1 = o7.b.locked     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10285a     // Catch:{ NoSuchFieldError -> 0x001d }
                o7.b r1 = o7.b.auto     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.camera.q.g.<clinit>():void");
        }
    }

    private class h implements t {

        /* renamed from: a  reason: collision with root package name */
        private final CameraDevice f10286a;

        h(CameraDevice cameraDevice) {
            this.f10286a = cameraDevice;
        }

        public void a(List<Surface> list, CameraCaptureSession.StateCallback stateCallback, Handler handler) {
            this.f10286a.createCaptureSession(list, stateCallback, q.this.f10263n);
        }

        @TargetApi(28)
        public void b(SessionConfiguration sessionConfiguration) {
            this.f10286a.createCaptureSession(sessionConfiguration);
        }

        public CaptureRequest.Builder c(int i10) {
            return this.f10286a.createCaptureRequest(i10);
        }

        public void close() {
            this.f10286a.close();
        }
    }

    static class i {
        public static Handler a(Looper looper) {
            return new Handler(looper);
        }
    }

    static class j {
        public static HandlerThread a(String str) {
            return new HandlerThread(str);
        }
    }

    static {
        HashMap<String, Integer> hashMap = new HashMap<>();
        B = hashMap;
        hashMap.put("yuv420", 35);
        hashMap.put("jpeg", 256);
        hashMap.put("nv21", 17);
    }

    public q(Activity activity, e.c cVar, n7.b bVar, h0 h0Var, y yVar, w7.b bVar2, boolean z9) {
        if (activity != null) {
            this.f10261l = activity;
            this.f10256g = z9;
            this.f10254e = cVar;
            this.f10258i = h0Var;
            this.f10257h = activity.getApplicationContext();
            this.f10259j = yVar;
            this.f10260k = bVar;
            this.f10255f = bVar2;
            this.f10250a = n7.d.k(bVar, yVar, activity, h0Var, bVar2);
            this.f10274y = new a8.b(3000, 3000);
            a8.a aVar = new a8.a();
            this.f10275z = aVar;
            this.f10262m = s.a(this, this.f10274y, aVar);
            v0();
            return;
        }
        throw new IllegalStateException("No activity available!");
    }

    private void A0() {
        ImageReader imageReader = this.f10267r;
        if (imageReader != null && imageReader.getSurface() != null) {
            Log.i("Camera", "startPreview");
            w(1, this.f10267r.getSurface());
        }
    }

    private void C0() {
        t tVar = this.f10265p;
        if (tVar != null) {
            tVar.close();
            this.f10265p = null;
            this.f10266q = null;
            return;
        }
        t();
    }

    private void G0() {
        Log.i("Camera", "captureStillPicture");
        this.f10262m.e(c0.STATE_CAPTURING);
        t tVar = this.f10265p;
        if (tVar != null) {
            try {
                CaptureRequest.Builder c10 = tVar.c(2);
                c10.addTarget(this.f10267r.getSurface());
                CaptureRequest.Key key = CaptureRequest.SCALER_CROP_REGION;
                c10.set(key, (Rect) this.f10269t.get(key));
                J0(c10);
                j.f c11 = this.f10250a.i().c();
                c10.set(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(c11 == null ? A().d() : A().e(c11)));
                c cVar = new c();
                try {
                    Log.i("Camera", "sending capture request");
                    this.f10266q.capture(c10.build(), cVar, this.f10263n);
                } catch (CameraAccessException e10) {
                    this.f10258i.d(this.A, "cameraAccess", e10.getMessage(), (Object) null);
                }
            } catch (CameraAccessException e11) {
                this.f10258i.d(this.A, "cameraAccess", e11.getMessage(), (Object) null);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void I(String str, String str2) {
        this.f10258i.m(str2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void J(String str, String str2) {
        this.f10258i.d(this.A, "cameraAccess", str2, (Object) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void W() {
        this.f10270u.start();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void X(String str, String str2) {
        this.f10258i.d(this.A, str, str2, (Object) null);
    }

    private void Y() {
        Log.i("Camera", "lockAutoFocus");
        if (this.f10266q == null) {
            Log.i("Camera", "[unlockAutoFocus] captureSession null, returning");
            return;
        }
        this.f10269t.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        try {
            this.f10266q.capture(this.f10269t.build(), (CameraCaptureSession.CaptureCallback) null, this.f10263n);
        } catch (CameraAccessException e10) {
            this.f10258i.m(e10.getMessage());
        }
    }

    private void d0(String str) {
        Log.i("Camera", "prepareMediaRecorder");
        MediaRecorder mediaRecorder = this.f10270u;
        if (mediaRecorder != null) {
            mediaRecorder.release();
        }
        u();
        j.f c10 = this.f10250a.i().c();
        this.f10270u = ((!n0.c() || G() == null) ? new z7.f(H(), str) : new z7.f(G(), str)).b(this.f10256g).c(c10 == null ? A().g() : A().h(c10)).a();
    }

    private void f0() {
        if (this.f10252c == null) {
            w7.a h10 = this.f10250a.h();
            this.f10252c = new o0(this.f10270u.getSurface(), h10.g().getWidth(), h10.g().getHeight(), new f());
        }
    }

    private void j0() {
        Log.i("Camera", "runPictureAutoFocus");
        this.f10262m.e(c0.STATE_WAITING_FOCUS);
        Y();
    }

    private void k0() {
        Log.i("Camera", "runPrecaptureSequence");
        try {
            this.f10269t.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
            this.f10266q.capture(this.f10269t.build(), this.f10262m, this.f10263n);
            g0((Runnable) null, new a(this));
            this.f10262m.e(c0.STATE_WAITING_PRECAPTURE_START);
            this.f10269t.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
            this.f10266q.capture(this.f10269t.build(), this.f10262m, this.f10263n);
        } catch (CameraAccessException e10) {
            e10.printStackTrace();
        }
    }

    private void t0(k7.d dVar) {
        dVar.d(new e());
    }

    private void u() {
        o0 o0Var = this.f10252c;
        if (o0Var != null) {
            o0Var.b();
            this.f10252c = null;
        }
    }

    private void v(int i10, Runnable runnable, Surface... surfaceArr) {
        this.f10266q = null;
        this.f10269t = this.f10265p.c(i10);
        w7.a h10 = this.f10250a.h();
        SurfaceTexture d10 = this.f10254e.d();
        d10.setDefaultBufferSize(h10.h().getWidth(), h10.h().getHeight());
        Surface surface = new Surface(d10);
        this.f10269t.addTarget(surface);
        List<Surface> asList = Arrays.asList(surfaceArr);
        if (i10 != 1) {
            Surface surface2 = this.f10267r.getSurface();
            for (Surface surface3 : asList) {
                if (surface3 != surface2) {
                    this.f10269t.addTarget(surface3);
                }
            }
        }
        Size c10 = b0.c(this.f10259j, this.f10269t);
        this.f10250a.e().d(c10);
        this.f10250a.g().d(c10);
        b bVar = new b(runnable);
        if (n0.e()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new OutputConfiguration(surface));
            for (Surface outputConfiguration : asList) {
                arrayList.add(new OutputConfiguration(outputConfiguration));
            }
            y(arrayList, bVar);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(surface);
        arrayList2.addAll(asList);
        x(arrayList2, bVar);
    }

    private void w0(boolean z9, boolean z10) {
        p pVar;
        z7.d dVar;
        ArrayList arrayList = new ArrayList();
        if (z9) {
            arrayList.add(this.f10270u.getSurface());
            pVar = new p(this);
        } else {
            pVar = null;
        }
        if (z10 && (dVar = this.f10268s) != null) {
            arrayList.add(dVar.f());
        }
        arrayList.add(this.f10267r.getSurface());
        v(3, pVar, (Surface[]) arrayList.toArray(new Surface[0]));
    }

    private void x(List<Surface> list, CameraCaptureSession.StateCallback stateCallback) {
        this.f10265p.a(list, stateCallback, this.f10263n);
    }

    @TargetApi(28)
    private void y(List<OutputConfiguration> list, CameraCaptureSession.StateCallback stateCallback) {
        this.f10265p.b(new SessionConfiguration(0, list, Executors.newSingleThreadExecutor(), stateCallback));
    }

    private void z0() {
        if (this.f10252c != null) {
            j.f c10 = this.f10250a.i().c();
            x7.a b10 = this.f10250a.i().b();
            int g10 = b10 != null ? c10 == null ? b10.g() : b10.h(c10) : 0;
            if (this.f10259j.a() != this.f10253d) {
                g10 = (g10 + 180) % 360;
            }
            this.f10252c.j(g10);
            w(3, this.f10252c.f());
        }
    }

    /* access modifiers changed from: package-private */
    public x7.a A() {
        return this.f10250a.i().b();
    }

    public double B() {
        return this.f10250a.d().c();
    }

    public void B0(k.d dVar, k7.d dVar2) {
        e0(dVar);
        if (dVar2 != null) {
            t0(dVar2);
        }
        this.f10253d = this.f10259j.a();
        this.f10271v = true;
        try {
            w0(true, dVar2 != null);
            dVar.a((Object) null);
        } catch (CameraAccessException e10) {
            this.f10271v = false;
            this.f10273x = null;
            dVar.b("videoRecordingFailed", e10.getMessage(), (Object) null);
        }
    }

    public double C() {
        return this.f10250a.d().d();
    }

    public float D() {
        return this.f10250a.j().c();
    }

    public void D0() {
        HandlerThread handlerThread = this.f10264o;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        this.f10264o = null;
        this.f10263n = null;
    }

    public double E() {
        return this.f10250a.d().e();
    }

    public void E0(k.d dVar) {
        if (!this.f10271v) {
            dVar.a((Object) null);
            return;
        }
        this.f10250a.l(this.f10260k.f(this.f10259j, false));
        this.f10271v = false;
        try {
            u();
            this.f10266q.abortCaptures();
            this.f10270u.stop();
        } catch (CameraAccessException | IllegalStateException unused) {
        }
        this.f10270u.reset();
        try {
            x0();
            dVar.a(this.f10273x.getAbsolutePath());
            this.f10273x = null;
        } catch (CameraAccessException | IllegalStateException | InterruptedException e10) {
            dVar.b("videoRecordingFailed", e10.getMessage(), (Object) null);
        }
    }

    public float F() {
        return this.f10250a.j().d();
    }

    public void F0(k.d dVar) {
        if (this.f10262m.b() != c0.STATE_PREVIEW) {
            dVar.b("captureAlreadyActive", "Picture is currently already being captured", (Object) null);
            return;
        }
        this.A = dVar;
        try {
            this.f10273x = File.createTempFile("CAP", ".jpg", this.f10257h.getCacheDir());
            this.f10274y.c();
            this.f10267r.setOnImageAvailableListener(this, this.f10263n);
            o7.a b10 = this.f10250a.b();
            if (!b10.b() || b10.c() != o7.b.auto) {
                k0();
            } else {
                j0();
            }
        } catch (IOException | SecurityException e10) {
            this.f10258i.d(this.A, "cannotCreateFile", e10.getMessage(), (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    public EncoderProfiles G() {
        return this.f10250a.h().i();
    }

    /* access modifiers changed from: package-private */
    public CamcorderProfile H() {
        return this.f10250a.h().j();
    }

    /* access modifiers changed from: package-private */
    public void H0() {
        Log.i("Camera", "unlockAutoFocus");
        if (this.f10266q == null) {
            Log.i("Camera", "[unlockAutoFocus] captureSession null, returning");
            return;
        }
        try {
            this.f10269t.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            this.f10266q.capture(this.f10269t.build(), (CameraCaptureSession.CaptureCallback) null, this.f10263n);
            this.f10269t.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
            this.f10266q.capture(this.f10269t.build(), (CameraCaptureSession.CaptureCallback) null, this.f10263n);
            g0((Runnable) null, new h(this));
        } catch (CameraAccessException e10) {
            this.f10258i.m(e10.getMessage());
        }
    }

    public void I0() {
        this.f10250a.i().f();
    }

    /* access modifiers changed from: package-private */
    public void J0(CaptureRequest.Builder builder) {
        for (n7.a<?> a10 : this.f10250a.a()) {
            a10.a(builder);
        }
    }

    public void Z(j.f fVar) {
        this.f10250a.i().d(fVar);
    }

    public void a() {
        G0();
    }

    @SuppressLint({"MissingPermission"})
    public void a0(String str) {
        this.f10251b = str;
        w7.a h10 = this.f10250a.h();
        if (!h10.b()) {
            h0 h0Var = this.f10258i;
            h0Var.m("Camera with name \"" + this.f10259j.s() + "\" is not supported by this plugin.");
            return;
        }
        this.f10267r = ImageReader.newInstance(h10.g().getWidth(), h10.g().getHeight(), 256, 1);
        Integer num = B.get(str);
        if (num == null) {
            Log.w("Camera", "The selected imageFormatGroup is not supported by Android. Defaulting to yuv420");
            num = 35;
        }
        this.f10268s = new z7.d(h10.h().getWidth(), h10.h().getHeight(), num.intValue(), 1);
        d0.c(this.f10261l).openCamera(this.f10259j.s(), new a(h10), this.f10263n);
    }

    public void b() {
        k0();
    }

    public void b0() {
        this.f10272w = true;
        this.f10266q.stopRepeating();
    }

    public void c0(k.d dVar) {
        if (!this.f10271v) {
            dVar.a((Object) null);
            return;
        }
        try {
            if (n0.f()) {
                this.f10270u.pause();
                dVar.a((Object) null);
                return;
            }
            dVar.b("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", (Object) null);
        } catch (IllegalStateException e10) {
            dVar.b("videoRecordingFailed", e10.getMessage(), (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    public void e0(k.d dVar) {
        try {
            File createTempFile = File.createTempFile("REC", ".mp4", this.f10257h.getCacheDir());
            this.f10273x = createTempFile;
            try {
                d0(createTempFile.getAbsolutePath());
                this.f10250a.l(this.f10260k.f(this.f10259j, true));
            } catch (IOException e10) {
                this.f10271v = false;
                this.f10273x = null;
                dVar.b("videoRecordingFailed", e10.getMessage(), (Object) null);
            }
        } catch (IOException | SecurityException e11) {
            dVar.b("cannotCreateFile", e11.getMessage(), (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    public void g0(Runnable runnable, j0 j0Var) {
        String str;
        Log.i("Camera", "refreshPreviewCaptureSession");
        CameraCaptureSession cameraCaptureSession = this.f10266q;
        if (cameraCaptureSession == null) {
            Log.i("Camera", "refreshPreviewCaptureSession: captureSession not yet initialized, skipping preview capture session refresh.");
            return;
        }
        try {
            if (!this.f10272w) {
                cameraCaptureSession.setRepeatingRequest(this.f10269t.build(), this.f10262m, this.f10263n);
            }
            if (runnable != null) {
                runnable.run();
            }
        } catch (IllegalStateException e10) {
            str = "Camera is closed: " + e10.getMessage();
            j0Var.a("cameraAccess", str);
        } catch (CameraAccessException e11) {
            str = e11.getMessage();
            j0Var.a("cameraAccess", str);
        }
    }

    public void h0() {
        this.f10272w = false;
        g0((Runnable) null, new i(this));
    }

    public void i0(k.d dVar) {
        if (!this.f10271v) {
            dVar.a((Object) null);
            return;
        }
        try {
            if (n0.f()) {
                this.f10270u.resume();
                dVar.a((Object) null);
                return;
            }
            dVar.b("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", (Object) null);
        } catch (IllegalStateException e10) {
            dVar.b("videoRecordingFailed", e10.getMessage(), (Object) null);
        }
    }

    public void l0(k.d dVar, y yVar) {
        String str;
        if (!this.f10271v) {
            str = "Device was not recording";
        } else if (!n0.b()) {
            str = "Device does not support switching the camera while recording";
        } else {
            C0();
            f0();
            this.f10259j = yVar;
            n7.d k10 = n7.d.k(this.f10260k, yVar, this.f10261l, this.f10258i, this.f10255f);
            this.f10250a = k10;
            k10.l(this.f10260k.f(this.f10259j, true));
            try {
                a0(this.f10251b);
            } catch (CameraAccessException e10) {
                dVar.b("setDescriptionWhileRecordingFailed", e10.getMessage(), (Object) null);
            }
            dVar.a((Object) null);
            return;
        }
        dVar.b("setDescriptionWhileRecordingFailed", str, (Object) null);
    }

    public void m0(k.d dVar, p7.b bVar) {
        p7.a c10 = this.f10250a.c();
        c10.d(bVar);
        c10.a(this.f10269t);
        g0(new c(dVar), new m(dVar));
    }

    public void n0(k.d dVar, double d10) {
        q7.a d11 = this.f10250a.d();
        d11.g(Double.valueOf(d10));
        d11.a(this.f10269t);
        g0(new g(dVar, d11), new j(dVar));
    }

    public void o0(k.d dVar, n7.e eVar) {
        r7.a e10 = this.f10250a.e();
        e10.e(eVar);
        e10.a(this.f10269t);
        g0(new e(dVar), new k(dVar));
    }

    public void onImageAvailable(ImageReader imageReader) {
        Log.i("Camera", "onImageAvailable");
        Image acquireNextImage = imageReader.acquireNextImage();
        if (acquireNextImage != null) {
            this.f10263n.post(new k0(acquireNextImage, this.f10273x, new d()));
            this.f10262m.e(c0.STATE_PREVIEW);
        }
    }

    public void p0(k.d dVar, s7.b bVar) {
        s7.a f10 = this.f10250a.f();
        f10.c(bVar);
        f10.a(this.f10269t);
        g0(new f(dVar), new n(dVar));
    }

    public void q0(k.d dVar, o7.b bVar) {
        o7.a b10 = this.f10250a.b();
        b10.d(bVar);
        b10.a(this.f10269t);
        if (!this.f10272w) {
            int i10 = g.f10285a[bVar.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    H0();
                }
            } else if (this.f10266q == null) {
                Log.i("Camera", "[unlockAutoFocus] captureSession null, returning");
                return;
            } else {
                Y();
                this.f10269t.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                try {
                    this.f10266q.setRepeatingRequest(this.f10269t.build(), (CameraCaptureSession.CaptureCallback) null, this.f10263n);
                } catch (CameraAccessException e10) {
                    if (dVar != null) {
                        dVar.b("setFocusModeFailed", "Error setting focus mode: " + e10.getMessage(), (Object) null);
                        return;
                    }
                    return;
                }
            }
        }
        if (dVar != null) {
            dVar.a((Object) null);
        }
    }

    public void r0(k.d dVar, n7.e eVar) {
        t7.a g10 = this.f10250a.g();
        g10.e(eVar);
        g10.a(this.f10269t);
        g0(new b(dVar), new o(dVar));
        q0((k.d) null, this.f10250a.b().c());
    }

    public void s() {
        Log.i("Camera", "close");
        C0();
        ImageReader imageReader = this.f10267r;
        if (imageReader != null) {
            imageReader.close();
            this.f10267r = null;
        }
        z7.d dVar = this.f10268s;
        if (dVar != null) {
            dVar.d();
            this.f10268s = null;
        }
        MediaRecorder mediaRecorder = this.f10270u;
        if (mediaRecorder != null) {
            mediaRecorder.reset();
            this.f10270u.release();
            this.f10270u = null;
        }
        D0();
    }

    /* access modifiers changed from: package-private */
    public void s0(d.b bVar) {
        z7.d dVar = this.f10268s;
        if (dVar != null) {
            dVar.n(this.f10275z, bVar, this.f10263n);
        }
    }

    /* access modifiers changed from: package-private */
    public void t() {
        if (this.f10266q != null) {
            Log.i("Camera", "closeCaptureSession");
            this.f10266q.close();
            this.f10266q = null;
        }
    }

    public void u0(k.d dVar, float f10) {
        y7.a j10 = this.f10250a.j();
        float c10 = j10.c();
        float d10 = j10.d();
        if (f10 > c10 || f10 < d10) {
            dVar.b("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", new Object[]{Float.valueOf(d10), Float.valueOf(c10)}), (Object) null);
            return;
        }
        j10.e(Float.valueOf(f10));
        j10.a(this.f10269t);
        g0(new d(dVar), new l(dVar));
    }

    public void v0() {
        if (this.f10264o == null) {
            HandlerThread a10 = j.a("CameraBackground");
            this.f10264o = a10;
            try {
                a10.start();
            } catch (IllegalThreadStateException unused) {
            }
            this.f10263n = i.a(this.f10264o.getLooper());
        }
    }

    /* access modifiers changed from: package-private */
    public void w(int i10, Surface... surfaceArr) {
        v(i10, (Runnable) null, surfaceArr);
    }

    public void x0() {
        if (this.f10271v) {
            z0();
        } else {
            A0();
        }
    }

    public void y0(k7.d dVar) {
        t0(dVar);
        w0(false, true);
        Log.i("Camera", "startPreviewWithImageStream");
    }

    public void z() {
        Log.i("Camera", "dispose");
        s();
        this.f10254e.a();
        A().l();
    }
}
