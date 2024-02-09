package io.flutter.plugins.camera;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;

class s extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a  reason: collision with root package name */
    private final b f10289a;

    /* renamed from: b  reason: collision with root package name */
    private c0 f10290b = c0.STATE_PREVIEW;

    /* renamed from: c  reason: collision with root package name */
    private final a8.b f10291c;

    /* renamed from: d  reason: collision with root package name */
    private final a8.a f10292d;

    /* renamed from: e  reason: collision with root package name */
    CaptureResult.Key<Integer> f10293e = CaptureResult.CONTROL_AE_STATE;

    /* renamed from: f  reason: collision with root package name */
    CaptureResult.Key<Integer> f10294f = CaptureResult.CONTROL_AF_STATE;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10295a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                io.flutter.plugins.camera.c0[] r0 = io.flutter.plugins.camera.c0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10295a = r0
                io.flutter.plugins.camera.c0 r1 = io.flutter.plugins.camera.c0.STATE_PREVIEW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10295a     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.plugins.camera.c0 r1 = io.flutter.plugins.camera.c0.STATE_WAITING_FOCUS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f10295a     // Catch:{ NoSuchFieldError -> 0x0028 }
                io.flutter.plugins.camera.c0 r1 = io.flutter.plugins.camera.c0.STATE_WAITING_PRECAPTURE_START     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f10295a     // Catch:{ NoSuchFieldError -> 0x0033 }
                io.flutter.plugins.camera.c0 r1 = io.flutter.plugins.camera.c0.STATE_WAITING_PRECAPTURE_DONE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.camera.s.a.<clinit>():void");
        }
    }

    interface b {
        void a();

        void b();
    }

    private s(b bVar, a8.b bVar2, a8.a aVar) {
        this.f10289a = bVar;
        this.f10291c = bVar2;
        this.f10292d = aVar;
    }

    public static s a(b bVar, a8.b bVar2, a8.a aVar) {
        return new s(bVar, bVar2, aVar);
    }

    private void c(Integer num) {
        if (num == null || num.intValue() == 2) {
            this.f10289a.a();
        } else {
            this.f10289a.b();
        }
    }

    private void d(CaptureResult captureResult) {
        Integer num = (Integer) captureResult.get(this.f10293e);
        Integer num2 = (Integer) captureResult.get(this.f10294f);
        if (captureResult instanceof TotalCaptureResult) {
            this.f10292d.d((Float) captureResult.get(CaptureResult.LENS_APERTURE));
            this.f10292d.e((Long) captureResult.get(CaptureResult.SENSOR_EXPOSURE_TIME));
            this.f10292d.f((Integer) captureResult.get(CaptureResult.SENSOR_SENSITIVITY));
        }
        if (this.f10290b != c0.STATE_PREVIEW) {
            Log.d("CameraCaptureCallback", "CameraCaptureCallback | state: " + this.f10290b + " | afState: " + num2 + " | aeState: " + num);
        }
        int i10 = a.f10295a[this.f10290b.ordinal()];
        if (i10 != 2) {
            if (i10 == 3) {
                if (!(num == null || num.intValue() == 2 || num.intValue() == 5 || num.intValue() == 4)) {
                    if (this.f10291c.b().b()) {
                        Log.w("CameraCaptureCallback", "Metering timeout waiting for pre-capture to start, moving on with capture");
                    } else {
                        return;
                    }
                }
                e(c0.STATE_WAITING_PRECAPTURE_DONE);
            } else if (i10 == 4) {
                if (num != null && num.intValue() == 5) {
                    if (this.f10291c.b().b()) {
                        Log.w("CameraCaptureCallback", "Metering timeout waiting for pre-capture to finish, moving on with capture");
                    } else {
                        return;
                    }
                }
                this.f10289a.a();
            }
        } else if (num2 != null) {
            if (!(num2.intValue() == 4 || num2.intValue() == 5)) {
                if (this.f10291c.a().b()) {
                    Log.w("CameraCaptureCallback", "Focus timeout, moving on with capture");
                } else {
                    return;
                }
            }
            c(num);
        }
    }

    public c0 b() {
        return this.f10290b;
    }

    public void e(c0 c0Var) {
        this.f10290b = c0Var;
    }

    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        d(totalCaptureResult);
    }

    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        d(captureResult);
    }
}
