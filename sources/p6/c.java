package p6;

import android.app.Activity;
import androidx.core.app.b;
import androidx.core.content.a;
import java.io.File;
import java.io.IOException;
import k7.d;
import k7.k;
import k7.p;

public class c implements k.c, d.C0170d, p {

    /* renamed from: m  reason: collision with root package name */
    private final Activity f11927m;

    /* renamed from: n  reason: collision with root package name */
    private e f11928n;

    /* renamed from: o  reason: collision with root package name */
    private k.d f11929o;

    /* renamed from: p  reason: collision with root package name */
    private d.b f11930p;

    c(Activity activity) {
        this.f11927m = activity;
    }

    private void c() {
        b.s(this.f11927m, new String[]{"android.permission.RECORD_AUDIO"}, 1001);
    }

    private String e(k.d dVar) {
        try {
            return File.createTempFile("audio", ".m4a", this.f11927m.getCacheDir()).getPath();
        } catch (IOException e10) {
            dVar.b("record", "Cannot create temp file.", e10.getMessage());
            e10.printStackTrace();
            return null;
        }
    }

    private void f(k.d dVar) {
        if (!g()) {
            this.f11929o = dVar;
            c();
            return;
        }
        dVar.a(Boolean.TRUE);
    }

    private boolean g() {
        return a.a(this.f11927m, "android.permission.RECORD_AUDIO") == 0;
    }

    private e h(String str) {
        a aVar = new a();
        if (aVar.d(str)) {
            return aVar;
        }
        b bVar = new b(this.f11927m);
        if (bVar.d(str)) {
            return bVar;
        }
        return null;
    }

    private void i(int i10) {
        d.b bVar = this.f11930p;
        if (bVar != null) {
            bVar.a(Integer.valueOf(i10));
        }
    }

    public void a(Object obj, d.b bVar) {
        this.f11930p = bVar;
    }

    public void b(Object obj) {
        this.f11930p = null;
    }

    /* access modifiers changed from: package-private */
    public void d() {
        e eVar = this.f11928n;
        if (eVar != null) {
            eVar.close();
        }
        this.f11929o = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ab, code lost:
        r14.a((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c3, code lost:
        r13 = java.lang.Boolean.valueOf(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c7, code lost:
        r14.a(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0171, code lost:
        r13 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(k7.j r13, k7.k.d r14) {
        /*
            r12 = this;
            java.lang.String r0 = r13.f10996a
            r0.hashCode()
            int r1 = r0.hashCode()
            r2 = 2
            r3 = 0
            r4 = 1
            r5 = -1
            switch(r1) {
                case -2122989593: goto L_0x0089;
                case -934426579: goto L_0x007e;
                case -321287432: goto L_0x0073;
                case 3540994: goto L_0x0068;
                case 106440182: goto L_0x005d;
                case 109757538: goto L_0x0052;
                case 115944508: goto L_0x0047;
                case 171850761: goto L_0x003c;
                case 806845809: goto L_0x002e;
                case 1262423501: goto L_0x0020;
                case 1671767583: goto L_0x0012;
                default: goto L_0x0010;
            }
        L_0x0010:
            goto L_0x0093
        L_0x0012:
            java.lang.String r1 = "dispose"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001c
            goto L_0x0093
        L_0x001c:
            r5 = 10
            goto L_0x0093
        L_0x0020:
            java.lang.String r1 = "getAmplitude"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002a
            goto L_0x0093
        L_0x002a:
            r5 = 9
            goto L_0x0093
        L_0x002e:
            java.lang.String r1 = "listInputDevices"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0038
            goto L_0x0093
        L_0x0038:
            r5 = 8
            goto L_0x0093
        L_0x003c:
            java.lang.String r1 = "hasPermission"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0045
            goto L_0x0093
        L_0x0045:
            r5 = 7
            goto L_0x0093
        L_0x0047:
            java.lang.String r1 = "isEncoderSupported"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0050
            goto L_0x0093
        L_0x0050:
            r5 = 6
            goto L_0x0093
        L_0x0052:
            java.lang.String r1 = "start"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x005b
            goto L_0x0093
        L_0x005b:
            r5 = 5
            goto L_0x0093
        L_0x005d:
            java.lang.String r1 = "pause"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0066
            goto L_0x0093
        L_0x0066:
            r5 = 4
            goto L_0x0093
        L_0x0068:
            java.lang.String r1 = "stop"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0071
            goto L_0x0093
        L_0x0071:
            r5 = 3
            goto L_0x0093
        L_0x0073:
            java.lang.String r1 = "isPaused"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x007c
            goto L_0x0093
        L_0x007c:
            r5 = 2
            goto L_0x0093
        L_0x007e:
            java.lang.String r1 = "resume"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0087
            goto L_0x0093
        L_0x0087:
            r5 = 1
            goto L_0x0093
        L_0x0089:
            java.lang.String r1 = "isRecording"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0092
            goto L_0x0093
        L_0x0092:
            r5 = 0
        L_0x0093:
            java.lang.String r0 = "encoder"
            r1 = 0
            switch(r5) {
                case 0: goto L_0x018f;
                case 1: goto L_0x0175;
                case 2: goto L_0x0167;
                case 3: goto L_0x0149;
                case 4: goto L_0x012f;
                case 5: goto L_0x00cc;
                case 6: goto L_0x00b5;
                case 7: goto L_0x00b0;
                case 8: goto L_0x00ab;
                case 9: goto L_0x00a2;
                case 10: goto L_0x009e;
                default: goto L_0x0099;
            }
        L_0x0099:
            r14.c()
            goto L_0x0199
        L_0x009e:
            r12.d()
            goto L_0x00ab
        L_0x00a2:
            p6.e r13 = r12.f11928n
            if (r13 == 0) goto L_0x00ab
            java.util.Map r13 = r13.a()
            goto L_0x00c7
        L_0x00ab:
            r14.a(r1)
            goto L_0x0199
        L_0x00b0:
            r12.f(r14)
            goto L_0x0199
        L_0x00b5:
            java.lang.Object r13 = r13.a(r0)
            java.lang.String r13 = (java.lang.String) r13
            p6.e r0 = r12.h(r13)
            boolean r13 = r0.d(r13)
        L_0x00c3:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
        L_0x00c7:
            r14.a(r13)
            goto L_0x0199
        L_0x00cc:
            java.lang.String r2 = "path"
            java.lang.Object r2 = r13.a(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x00dd
            java.lang.String r2 = r12.e(r14)
            if (r2 != 0) goto L_0x00dd
            return
        L_0x00dd:
            r6 = r2
            java.lang.Object r0 = r13.a(r0)
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r0 = "bitRate"
            java.lang.Object r0 = r13.a(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r8 = r0.intValue()
            java.lang.String r0 = "samplingRate"
            java.lang.Object r0 = r13.a(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r9 = r0.intValue()
            java.lang.String r0 = "numChannels"
            java.lang.Object r0 = r13.a(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r10 = r0.intValue()
            java.lang.String r0 = "device"
            java.lang.Object r13 = r13.a(r0)
            r11 = r13
            java.util.Map r11 = (java.util.Map) r11
            p6.e r5 = r12.h(r7)
            r12.f11928n = r5
            r5.f(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0123 }
            r14.a(r1)     // Catch:{ Exception -> 0x0123 }
            r12.i(r4)     // Catch:{ Exception -> 0x0123 }
            goto L_0x0199
        L_0x0123:
            r13 = move-exception
            java.lang.String r0 = r13.getMessage()
            java.lang.Throwable r13 = r13.getCause()
            java.lang.String r1 = "-1"
            goto L_0x0163
        L_0x012f:
            p6.e r13 = r12.f11928n
            if (r13 == 0) goto L_0x00ab
            r13.b()     // Catch:{ Exception -> 0x013d }
            r14.a(r1)     // Catch:{ Exception -> 0x013d }
            r12.i(r3)     // Catch:{ Exception -> 0x013d }
            goto L_0x0199
        L_0x013d:
            r13 = move-exception
            java.lang.String r0 = r13.getMessage()
            java.lang.Throwable r13 = r13.getCause()
            java.lang.String r1 = "-3"
            goto L_0x0163
        L_0x0149:
            p6.e r13 = r12.f11928n
            if (r13 == 0) goto L_0x00ab
            java.lang.String r13 = r13.stop()     // Catch:{ Exception -> 0x0158 }
            r14.a(r13)     // Catch:{ Exception -> 0x0158 }
            r12.i(r2)     // Catch:{ Exception -> 0x0158 }
            goto L_0x0199
        L_0x0158:
            r13 = move-exception
            java.lang.String r0 = r13.getMessage()
            java.lang.Throwable r13 = r13.getCause()
            java.lang.String r1 = "-2"
        L_0x0163:
            r14.b(r1, r0, r13)
            goto L_0x0199
        L_0x0167:
            p6.e r13 = r12.f11928n
            if (r13 == 0) goto L_0x0171
            boolean r13 = r13.e()
            goto L_0x00c3
        L_0x0171:
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            goto L_0x00c7
        L_0x0175:
            p6.e r13 = r12.f11928n
            if (r13 == 0) goto L_0x00ab
            r13.c()     // Catch:{ Exception -> 0x0183 }
            r14.a(r1)     // Catch:{ Exception -> 0x0183 }
            r12.i(r4)     // Catch:{ Exception -> 0x0183 }
            goto L_0x0199
        L_0x0183:
            r13 = move-exception
            java.lang.String r0 = r13.getMessage()
            java.lang.Throwable r13 = r13.getCause()
            java.lang.String r1 = "-4"
            goto L_0x0163
        L_0x018f:
            p6.e r13 = r12.f11928n
            if (r13 == 0) goto L_0x0171
            boolean r13 = r13.g()
            goto L_0x00c3
        L_0x0199:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.c.onMethodCall(k7.j, k7.k$d):void");
    }

    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        k.d dVar;
        if (i10 != 1001 || (dVar = this.f11929o) == null) {
            return false;
        }
        dVar.a((iArr.length <= 0 || iArr[0] != 0) ? Boolean.FALSE : Boolean.TRUE);
        this.f11929o = null;
        return true;
    }
}
