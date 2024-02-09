package io.flutter.plugins.camera;

import android.app.Activity;
import android.hardware.camera2.CameraAccessException;
import android.os.Handler;
import android.os.Looper;
import io.flutter.plugins.camera.v;
import io.flutter.view.e;
import java.util.HashMap;
import k7.c;
import k7.d;
import k7.j;
import k7.k;
import w7.b;

final class m0 implements k.c {

    /* renamed from: m  reason: collision with root package name */
    private final Activity f10211m;

    /* renamed from: n  reason: collision with root package name */
    private final c f10212n;

    /* renamed from: o  reason: collision with root package name */
    private final v f10213o;

    /* renamed from: p  reason: collision with root package name */
    private final v.b f10214p;

    /* renamed from: q  reason: collision with root package name */
    private final e f10215q;

    /* renamed from: r  reason: collision with root package name */
    private final k f10216r;

    /* renamed from: s  reason: collision with root package name */
    private final d f10217s;

    /* renamed from: t  reason: collision with root package name */
    private q f10218t;

    m0(Activity activity, c cVar, v vVar, v.b bVar, e eVar) {
        this.f10211m = activity;
        this.f10212n = cVar;
        this.f10213o = vVar;
        this.f10214p = bVar;
        this.f10215q = eVar;
        k kVar = new k(cVar, "plugins.flutter.io/camera_android");
        this.f10216r = kVar;
        this.f10217s = new d(cVar, "plugins.flutter.io/camera_android/imageStream");
        kVar.e(this);
    }

    private void b(Exception exc, k.d dVar) {
        if (exc instanceof CameraAccessException) {
            dVar.b("CameraAccess", exc.getMessage(), (Object) null);
            return;
        }
        throw ((RuntimeException) exc);
    }

    private void c(j jVar, k.d dVar) {
        boolean booleanValue = ((Boolean) jVar.a("enableAudio")).booleanValue();
        e.c a10 = this.f10215q.a();
        e.c cVar = a10;
        this.f10218t = new q(this.f10211m, cVar, new n7.c(), new h0(this.f10212n, a10.e(), new Handler(Looper.getMainLooper())), new z((String) jVar.a("cameraName"), d0.c(this.f10211m)), b.valueOf((String) jVar.a("resolutionPreset")), booleanValue);
        HashMap hashMap = new HashMap();
        hashMap.put("cameraId", Long.valueOf(a10.e()));
        dVar.a(hashMap);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(j jVar, k.d dVar, String str, String str2) {
        if (str == null) {
            try {
                c(jVar, dVar);
            } catch (Exception e10) {
                b(e10, dVar);
            }
        } else {
            dVar.b(str, str2, (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        this.f10216r.e((k.c) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: k7.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Double} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: type inference failed for: r5v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:146:0x02f1=Splitter:B:146:0x02f1, B:100:0x01ca=Splitter:B:100:0x01ca} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(k7.j r7, k7.k.d r8) {
        /*
            r6 = this;
            java.lang.String r0 = r7.f10996a
            r0.hashCode()
            int r1 = r0.hashCode()
            r2 = -1
            switch(r1) {
                case -2037208347: goto L_0x0182;
                case -1982465099: goto L_0x0177;
                case -1849130371: goto L_0x016c;
                case -1783353674: goto L_0x0161;
                case -1352294148: goto L_0x0156;
                case -1313121483: goto L_0x014b;
                case -1157944680: goto L_0x0140;
                case -1151868548: goto L_0x0135;
                case -1127151527: goto L_0x0127;
                case -1120721617: goto L_0x0119;
                case -1077837554: goto L_0x010b;
                case -579183206: goto L_0x00fd;
                case 109225283: goto L_0x00ef;
                case 186649688: goto L_0x00e1;
                case 196568648: goto L_0x00d3;
                case 391927665: goto L_0x00c5;
                case 770486092: goto L_0x00b7;
                case 871091088: goto L_0x00a9;
                case 888134860: goto L_0x009b;
                case 888641243: goto L_0x008d;
                case 954656505: goto L_0x007f;
                case 1018096247: goto L_0x0071;
                case 1120116920: goto L_0x0063;
                case 1422316786: goto L_0x0055;
                case 1656321690: goto L_0x0047;
                case 1671767583: goto L_0x0039;
                case 1672159065: goto L_0x002b;
                case 1765152647: goto L_0x001d;
                case 1838076131: goto L_0x000f;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x018c
        L_0x000f:
            java.lang.String r1 = "getMaxZoomLevel"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0019
            goto L_0x018c
        L_0x0019:
            r2 = 28
            goto L_0x018c
        L_0x001d:
            java.lang.String r1 = "setExposurePoint"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0027
            goto L_0x018c
        L_0x0027:
            r2 = 27
            goto L_0x018c
        L_0x002b:
            java.lang.String r1 = "stopImageStream"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0035
            goto L_0x018c
        L_0x0035:
            r2 = 26
            goto L_0x018c
        L_0x0039:
            java.lang.String r1 = "dispose"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0043
            goto L_0x018c
        L_0x0043:
            r2 = 25
            goto L_0x018c
        L_0x0047:
            java.lang.String r1 = "setDescriptionWhileRecording"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0051
            goto L_0x018c
        L_0x0051:
            r2 = 24
            goto L_0x018c
        L_0x0055:
            java.lang.String r1 = "pausePreview"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x005f
            goto L_0x018c
        L_0x005f:
            r2 = 23
            goto L_0x018c
        L_0x0063:
            java.lang.String r1 = "startVideoRecording"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x006d
            goto L_0x018c
        L_0x006d:
            r2 = 22
            goto L_0x018c
        L_0x0071:
            java.lang.String r1 = "takePicture"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x007b
            goto L_0x018c
        L_0x007b:
            r2 = 21
            goto L_0x018c
        L_0x007f:
            java.lang.String r1 = "startImageStream"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0089
            goto L_0x018c
        L_0x0089:
            r2 = 20
            goto L_0x018c
        L_0x008d:
            java.lang.String r1 = "resumePreview"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0097
            goto L_0x018c
        L_0x0097:
            r2 = 19
            goto L_0x018c
        L_0x009b:
            java.lang.String r1 = "setExposureMode"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00a5
            goto L_0x018c
        L_0x00a5:
            r2 = 18
            goto L_0x018c
        L_0x00a9:
            java.lang.String r1 = "initialize"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b3
            goto L_0x018c
        L_0x00b3:
            r2 = 17
            goto L_0x018c
        L_0x00b7:
            java.lang.String r1 = "pauseVideoRecording"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00c1
            goto L_0x018c
        L_0x00c1:
            r2 = 16
            goto L_0x018c
        L_0x00c5:
            java.lang.String r1 = "setFlashMode"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00cf
            goto L_0x018c
        L_0x00cf:
            r2 = 15
            goto L_0x018c
        L_0x00d3:
            java.lang.String r1 = "getMaxExposureOffset"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00dd
            goto L_0x018c
        L_0x00dd:
            r2 = 14
            goto L_0x018c
        L_0x00e1:
            java.lang.String r1 = "stopVideoRecording"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00eb
            goto L_0x018c
        L_0x00eb:
            r2 = 13
            goto L_0x018c
        L_0x00ef:
            java.lang.String r1 = "resumeVideoRecording"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00f9
            goto L_0x018c
        L_0x00f9:
            r2 = 12
            goto L_0x018c
        L_0x00fd:
            java.lang.String r1 = "setFocusPoint"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0107
            goto L_0x018c
        L_0x0107:
            r2 = 11
            goto L_0x018c
        L_0x010b:
            java.lang.String r1 = "unlockCaptureOrientation"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0115
            goto L_0x018c
        L_0x0115:
            r2 = 10
            goto L_0x018c
        L_0x0119:
            java.lang.String r1 = "setZoomLevel"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0123
            goto L_0x018c
        L_0x0123:
            r2 = 9
            goto L_0x018c
        L_0x0127:
            java.lang.String r1 = "setFocusMode"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0131
            goto L_0x018c
        L_0x0131:
            r2 = 8
            goto L_0x018c
        L_0x0135:
            java.lang.String r1 = "setExposureOffset"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x013e
            goto L_0x018c
        L_0x013e:
            r2 = 7
            goto L_0x018c
        L_0x0140:
            java.lang.String r1 = "prepareForVideoRecording"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0149
            goto L_0x018c
        L_0x0149:
            r2 = 6
            goto L_0x018c
        L_0x014b:
            java.lang.String r1 = "lockCaptureOrientation"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0154
            goto L_0x018c
        L_0x0154:
            r2 = 5
            goto L_0x018c
        L_0x0156:
            java.lang.String r1 = "create"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x015f
            goto L_0x018c
        L_0x015f:
            r2 = 4
            goto L_0x018c
        L_0x0161:
            java.lang.String r1 = "getMinExposureOffset"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x016a
            goto L_0x018c
        L_0x016a:
            r2 = 3
            goto L_0x018c
        L_0x016c:
            java.lang.String r1 = "getExposureOffsetStepSize"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0175
            goto L_0x018c
        L_0x0175:
            r2 = 2
            goto L_0x018c
        L_0x0177:
            java.lang.String r1 = "getMinZoomLevel"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0180
            goto L_0x018c
        L_0x0180:
            r2 = 1
            goto L_0x018c
        L_0x0182:
            java.lang.String r1 = "availableCameras"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x018b
            goto L_0x018c
        L_0x018b:
            r2 = 0
        L_0x018c:
            java.lang.String r0 = "y"
            java.lang.String r1 = "x"
            java.lang.String r3 = "reset"
            java.lang.String r4 = "mode"
            r5 = 0
            switch(r2) {
                case 0: goto L_0x03c6;
                case 1: goto L_0x03b8;
                case 2: goto L_0x03aa;
                case 3: goto L_0x039c;
                case 4: goto L_0x037a;
                case 5: goto L_0x0365;
                case 6: goto L_0x0361;
                case 7: goto L_0x034e;
                case 8: goto L_0x0324;
                case 9: goto L_0x0307;
                case 10: goto L_0x02fd;
                case 11: goto L_0x02d3;
                case 12: goto L_0x02cc;
                case 13: goto L_0x02c5;
                case 14: goto L_0x02b6;
                case 15: goto L_0x028c;
                case 16: goto L_0x0285;
                case 17: goto L_0x0268;
                case 18: goto L_0x023e;
                case 19: goto L_0x0237;
                case 20: goto L_0x022b;
                case 21: goto L_0x0224;
                case 22: goto L_0x020d;
                case 23: goto L_0x0203;
                case 24: goto L_0x01e9;
                case 25: goto L_0x01e0;
                case 26: goto L_0x01d6;
                case 27: goto L_0x01ac;
                case 28: goto L_0x019d;
                default: goto L_0x0198;
            }
        L_0x0198:
            r8.c()
            goto L_0x03d4
        L_0x019d:
            io.flutter.plugins.camera.q r7 = r6.f10218t     // Catch:{ Exception -> 0x03d0 }
            float r7 = r7.D()     // Catch:{ Exception -> 0x03d0 }
            java.lang.Float r7 = java.lang.Float.valueOf(r7)     // Catch:{ Exception -> 0x03d0 }
            r8.a(r7)     // Catch:{ Exception -> 0x03d0 }
            goto L_0x03d4
        L_0x01ac:
            java.lang.Object r2 = r7.a(r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x01bd
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x01bb
            goto L_0x01bd
        L_0x01bb:
            r7 = r5
            goto L_0x01ca
        L_0x01bd:
            java.lang.Object r1 = r7.a(r1)
            r5 = r1
            java.lang.Double r5 = (java.lang.Double) r5
            java.lang.Object r7 = r7.a(r0)
            java.lang.Double r7 = (java.lang.Double) r7
        L_0x01ca:
            io.flutter.plugins.camera.q r0 = r6.f10218t     // Catch:{ Exception -> 0x03d0 }
            n7.e r1 = new n7.e     // Catch:{ Exception -> 0x03d0 }
            r1.<init>(r5, r7)     // Catch:{ Exception -> 0x03d0 }
            r0.o0(r8, r1)     // Catch:{ Exception -> 0x03d0 }
            goto L_0x03d4
        L_0x01d6:
            io.flutter.plugins.camera.q r7 = r6.f10218t     // Catch:{ Exception -> 0x03d0 }
            r7.x0()     // Catch:{ Exception -> 0x03d0 }
            r8.a(r5)     // Catch:{ Exception -> 0x03d0 }
            goto L_0x03d4
        L_0x01e0:
            io.flutter.plugins.camera.q r7 = r6.f10218t
            if (r7 == 0) goto L_0x0361
            r7.z()
            goto L_0x0361
        L_0x01e9:
            java.lang.String r0 = "cameraName"
            java.lang.Object r7 = r7.a(r0)     // Catch:{ Exception -> 0x03d0 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x03d0 }
            io.flutter.plugins.camera.z r0 = new io.flutter.plugins.camera.z     // Catch:{ Exception -> 0x03d0 }
            android.app.Activity r1 = r6.f10211m     // Catch:{ Exception -> 0x03d0 }
            android.hardware.camera2.CameraManager r1 = io.flutter.plugins.camera.d0.c(r1)     // Catch:{ Exception -> 0x03d0 }
            r0.<init>(r7, r1)     // Catch:{ Exception -> 0x03d0 }
            io.flutter.plugins.camera.q r7 = r6.f10218t     // Catch:{ Exception -> 0x03d0 }
            r7.l0(r8, r0)     // Catch:{ Exception -> 0x03d0 }
            goto L_0x03d4
        L_0x0203:
            io.flutter.plugins.camera.q r7 = r6.f10218t     // Catch:{ Exception -> 0x03d0 }
            r7.b0()     // Catch:{ Exception -> 0x03d0 }
            r8.a(r5)     // Catch:{ Exception -> 0x03d0 }
            goto L_0x03d4
        L_0x020d:
            io.flutter.plugins.camera.q r0 = r6.f10218t
            java.lang.String r1 = "enableStream"
            java.lang.Object r7 = r7.a(r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r7 = java.util.Objects.equals(r7, r1)
            if (r7 == 0) goto L_0x021f
            k7.d r5 = r6.f10217s
        L_0x021f:
            r0.B0(r8, r5)
            goto L_0x03d4
        L_0x0224:
            io.flutter.plugins.camera.q r7 = r6.f10218t
            r7.F0(r8)
            goto L_0x03d4
        L_0x022b:
            io.flutter.plugins.camera.q r7 = r6.f10218t     // Catch:{ Exception -> 0x03d0 }
            k7.d r0 = r6.f10217s     // Catch:{ Exception -> 0x03d0 }
            r7.y0(r0)     // Catch:{ Exception -> 0x03d0 }
            r8.a(r5)     // Catch:{ Exception -> 0x03d0 }
            goto L_0x03d4
        L_0x0237:
            io.flutter.plugins.camera.q r7 = r6.f10218t
            r7.h0()
            goto L_0x0361
        L_0x023e:
            java.lang.Object r7 = r7.a(r4)
            java.lang.String r7 = (java.lang.String) r7
            p7.b r0 = p7.b.getValueForString(r7)
            if (r0 != 0) goto L_0x0261
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown exposure mode "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "setExposureModeFailed"
            r8.b(r0, r7, r5)
            return
        L_0x0261:
            io.flutter.plugins.camera.q r7 = r6.f10218t     // Catch:{ Exception -> 0x03d0 }
            r7.m0(r8, r0)     // Catch:{ Exception -> 0x03d0 }
            goto L_0x03d4
        L_0x0268:
            io.flutter.plugins.camera.q r0 = r6.f10218t
            if (r0 == 0) goto L_0x027c
            java.lang.String r1 = "imageFormatGroup"
            java.lang.Object r7 = r7.a(r1)     // Catch:{ Exception -> 0x03d0 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x03d0 }
            r0.a0(r7)     // Catch:{ Exception -> 0x03d0 }
            r8.a(r5)     // Catch:{ Exception -> 0x03d0 }
            goto L_0x03d4
        L_0x027c:
            java.lang.String r7 = "cameraNotFound"
            java.lang.String r0 = "Camera not found. Please call the 'create' method before calling 'initialize'."
            r8.b(r7, r0, r5)
            goto L_0x03d4
        L_0x0285:
            io.flutter.plugins.camera.q r7 = r6.f10218t
            r7.c0(r8)
            goto L_0x03d4
        L_0x028c:
            java.lang.Object r7 = r7.a(r4)
            java.lang.String r7 = (java.lang.String) r7
            s7.b r0 = s7.b.getValueForString(r7)
            if (r0 != 0) goto L_0x02af
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown flash mode "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "setFlashModeFailed"
            r8.b(r0, r7, r5)
            return
        L_0x02af:
            io.flutter.plugins.camera.q r7 = r6.f10218t     // Catch:{ Exception -> 0x03d0 }
            r7.p0(r8, r0)     // Catch:{ Exception -> 0x03d0 }
            goto L_0x03d4
        L_0x02b6:
            io.flutter.plugins.camera.q r7 = r6.f10218t     // Catch:{ Exception -> 0x03d0 }
            double r0 = r7.C()     // Catch:{ Exception -> 0x03d0 }
            java.lang.Double r7 = java.lang.Double.valueOf(r0)     // Catch:{ Exception -> 0x03d0 }
            r8.a(r7)     // Catch:{ Exception -> 0x03d0 }
            goto L_0x03d4
        L_0x02c5:
            io.flutter.plugins.camera.q r7 = r6.f10218t
            r7.E0(r8)
            goto L_0x03d4
        L_0x02cc:
            io.flutter.plugins.camera.q r7 = r6.f10218t
            r7.i0(r8)
            goto L_0x03d4
        L_0x02d3:
            java.lang.Object r2 = r7.a(r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L_0x02e4
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x02e2
            goto L_0x02e4
        L_0x02e2:
            r7 = r5
            goto L_0x02f1
        L_0x02e4:
            java.lang.Object r1 = r7.a(r1)
            r5 = r1
            java.lang.Double r5 = (java.lang.Double) r5
            java.lang.Object r7 = r7.a(r0)
            java.lang.Double r7 = (java.lang.Double) r7
        L_0x02f1:
            io.flutter.plugins.camera.q r0 = r6.f10218t     // Catch:{ Exception -> 0x03d0 }
            n7.e r1 = new n7.e     // Catch:{ Exception -> 0x03d0 }
            r1.<init>(r5, r7)     // Catch:{ Exception -> 0x03d0 }
            r0.r0(r8, r1)     // Catch:{ Exception -> 0x03d0 }
            goto L_0x03d4
        L_0x02fd:
            io.flutter.plugins.camera.q r7 = r6.f10218t     // Catch:{ Exception -> 0x03d0 }
            r7.I0()     // Catch:{ Exception -> 0x03d0 }
            r8.a(r5)     // Catch:{ Exception -> 0x03d0 }
            goto L_0x03d4
        L_0x0307:
            java.lang.String r0 = "zoom"
            java.lang.Object r7 = r7.a(r0)
            java.lang.Double r7 = (java.lang.Double) r7
            if (r7 != 0) goto L_0x0319
            java.lang.String r7 = "ZOOM_ERROR"
            java.lang.String r0 = "setZoomLevel is called without specifying a zoom level."
            r8.b(r7, r0, r5)
            return
        L_0x0319:
            io.flutter.plugins.camera.q r0 = r6.f10218t     // Catch:{ Exception -> 0x03d0 }
            float r7 = r7.floatValue()     // Catch:{ Exception -> 0x03d0 }
            r0.u0(r8, r7)     // Catch:{ Exception -> 0x03d0 }
            goto L_0x03d4
        L_0x0324:
            java.lang.Object r7 = r7.a(r4)
            java.lang.String r7 = (java.lang.String) r7
            o7.b r0 = o7.b.getValueForString(r7)
            if (r0 != 0) goto L_0x0347
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown focus mode "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "setFocusModeFailed"
            r8.b(r0, r7, r5)
            return
        L_0x0347:
            io.flutter.plugins.camera.q r7 = r6.f10218t     // Catch:{ Exception -> 0x03d0 }
            r7.q0(r8, r0)     // Catch:{ Exception -> 0x03d0 }
            goto L_0x03d4
        L_0x034e:
            io.flutter.plugins.camera.q r0 = r6.f10218t     // Catch:{ Exception -> 0x03d0 }
            java.lang.String r1 = "offset"
            java.lang.Object r7 = r7.a(r1)     // Catch:{ Exception -> 0x03d0 }
            java.lang.Double r7 = (java.lang.Double) r7     // Catch:{ Exception -> 0x03d0 }
            double r1 = r7.doubleValue()     // Catch:{ Exception -> 0x03d0 }
            r0.n0(r8, r1)     // Catch:{ Exception -> 0x03d0 }
            goto L_0x03d4
        L_0x0361:
            r8.a(r5)
            goto L_0x03d4
        L_0x0365:
            java.lang.String r0 = "orientation"
            java.lang.Object r7 = r7.a(r0)
            java.lang.String r7 = (java.lang.String) r7
            io.flutter.embedding.engine.systemchannels.j$f r7 = io.flutter.plugins.camera.d0.a(r7)
            io.flutter.plugins.camera.q r0 = r6.f10218t     // Catch:{ Exception -> 0x03d0 }
            r0.Z(r7)     // Catch:{ Exception -> 0x03d0 }
            r8.a(r5)     // Catch:{ Exception -> 0x03d0 }
            goto L_0x03d4
        L_0x037a:
            io.flutter.plugins.camera.q r0 = r6.f10218t
            if (r0 == 0) goto L_0x0381
            r0.s()
        L_0x0381:
            io.flutter.plugins.camera.v r0 = r6.f10213o
            android.app.Activity r1 = r6.f10211m
            io.flutter.plugins.camera.v$b r2 = r6.f10214p
            java.lang.String r3 = "enableAudio"
            java.lang.Object r3 = r7.a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            io.flutter.plugins.camera.l0 r4 = new io.flutter.plugins.camera.l0
            r4.<init>(r6, r7, r8)
            r0.e(r1, r2, r3, r4)
            goto L_0x03d4
        L_0x039c:
            io.flutter.plugins.camera.q r7 = r6.f10218t     // Catch:{ Exception -> 0x03d0 }
            double r0 = r7.E()     // Catch:{ Exception -> 0x03d0 }
            java.lang.Double r7 = java.lang.Double.valueOf(r0)     // Catch:{ Exception -> 0x03d0 }
            r8.a(r7)     // Catch:{ Exception -> 0x03d0 }
            goto L_0x03d4
        L_0x03aa:
            io.flutter.plugins.camera.q r7 = r6.f10218t     // Catch:{ Exception -> 0x03d0 }
            double r0 = r7.B()     // Catch:{ Exception -> 0x03d0 }
            java.lang.Double r7 = java.lang.Double.valueOf(r0)     // Catch:{ Exception -> 0x03d0 }
            r8.a(r7)     // Catch:{ Exception -> 0x03d0 }
            goto L_0x03d4
        L_0x03b8:
            io.flutter.plugins.camera.q r7 = r6.f10218t     // Catch:{ Exception -> 0x03d0 }
            float r7 = r7.F()     // Catch:{ Exception -> 0x03d0 }
            java.lang.Float r7 = java.lang.Float.valueOf(r7)     // Catch:{ Exception -> 0x03d0 }
            r8.a(r7)     // Catch:{ Exception -> 0x03d0 }
            goto L_0x03d4
        L_0x03c6:
            android.app.Activity r7 = r6.f10211m     // Catch:{ Exception -> 0x03d0 }
            java.util.List r7 = io.flutter.plugins.camera.d0.b(r7)     // Catch:{ Exception -> 0x03d0 }
            r8.a(r7)     // Catch:{ Exception -> 0x03d0 }
            goto L_0x03d4
        L_0x03d0:
            r7 = move-exception
            r6.b(r7, r8)
        L_0x03d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.camera.m0.onMethodCall(k7.j, k7.k$d):void");
    }
}
