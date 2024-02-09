package m9;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import g8.s;
import io.flutter.plugin.platform.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k7.k;
import k7.p;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import m6.j;
import n6.i;
import o5.e;

public final class c implements f, k.c, p {

    /* renamed from: v  reason: collision with root package name */
    public static final C0184c f11261v = new C0184c((g) null);

    /* renamed from: m  reason: collision with root package name */
    private final Context f11262m;

    /* renamed from: n  reason: collision with root package name */
    private final int f11263n;

    /* renamed from: o  reason: collision with root package name */
    private final HashMap<String, Object> f11264o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f11265p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public boolean f11266q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public a f11267r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final k f11268s;

    /* renamed from: t  reason: collision with root package name */
    private g f11269t;

    /* renamed from: u  reason: collision with root package name */
    private final int f11270u;

    static final class a extends m implements r8.a<s> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ c f11271m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(0);
            this.f11271m = cVar;
        }

        public final void b() {
            a b10;
            if (!this.f11271m.f11266q && this.f11271m.o() && (b10 = this.f11271m.f11267r) != null) {
                b10.u();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            b();
            return s.f8976a;
        }
    }

    static final class b extends m implements r8.a<s> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ c f11272m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(0);
            this.f11272m = cVar;
        }

        public final void b() {
            a b10;
            if (!this.f11272m.o()) {
                this.f11272m.i();
            } else if (!this.f11272m.f11266q && this.f11272m.o() && (b10 = this.f11272m.f11267r) != null) {
                b10.y();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            b();
            return s.f8976a;
        }
    }

    /* renamed from: m9.c$c  reason: collision with other inner class name */
    public static final class C0184c {
        private C0184c() {
        }

        public /* synthetic */ C0184c(g gVar) {
            this();
        }
    }

    public static final class d implements m6.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<o5.a> f11273a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f11274b;

        d(List<? extends o5.a> list, c cVar) {
            this.f11273a = list;
            this.f11274b = cVar;
        }

        public void a(m6.b bVar) {
            l.e(bVar, "result");
            if (this.f11273a.isEmpty() || this.f11273a.contains(bVar.a())) {
                this.f11274b.f11268s.c("onRecognizeQR", f0.f(g8.p.a("code", bVar.e()), g8.p.a("type", bVar.a().name()), g8.p.a("rawBytes", bVar.c())));
            }
        }

        public void b(List<? extends o5.p> list) {
            l.e(list, "resultPoints");
        }
    }

    public c(Context context, k7.c cVar, int i10, HashMap<String, Object> hashMap) {
        l.e(context, "context");
        l.e(cVar, "messenger");
        l.e(hashMap, "params");
        this.f11262m = context;
        this.f11263n = i10;
        this.f11264o = hashMap;
        k kVar = new k(cVar, "net.touchcapture.qr.flutterqr/qrview_" + i10);
        this.f11268s = kVar;
        this.f11270u = i10 + 513469796;
        f fVar = f.f11279a;
        d7.c b10 = fVar.b();
        if (b10 != null) {
            b10.b(this);
        }
        kVar.e(this);
        Activity a10 = fVar.a();
        this.f11269t = a10 != null ? e.a(a10, new a(this), new b(this)) : null;
    }

    private final void A() {
        a aVar = this.f11267r;
        if (aVar != null) {
            aVar.N();
        }
    }

    private final void B(k.d dVar) {
        a aVar = this.f11267r;
        if (aVar == null) {
            g(dVar);
        } else if (r()) {
            aVar.setTorch(!this.f11265p);
            boolean z9 = !this.f11265p;
            this.f11265p = z9;
            dVar.a(Boolean.valueOf(z9));
        } else {
            dVar.b("404", "This device doesn't support flash", (Object) null);
        }
    }

    private final void g(k.d dVar) {
        dVar.b("404", "No barcode view found", (Object) null);
    }

    private final void h(double d10, double d11, double d12, k.d dVar) {
        y(d10, d11, d12);
        dVar.a(Boolean.TRUE);
    }

    /* access modifiers changed from: private */
    public final void i() {
        Activity a10;
        if (o()) {
            this.f11268s.c("onPermissionSet", Boolean.TRUE);
        } else if (Build.VERSION.SDK_INT >= 23 && (a10 = f.f11279a.a()) != null) {
            a10.requestPermissions(new String[]{"android.permission.CAMERA"}, this.f11270u);
        }
    }

    private final int j(double d10) {
        return (int) (d10 * ((double) this.f11262m.getResources().getDisplayMetrics().density));
    }

    private final void k(k.d dVar) {
        a aVar = this.f11267r;
        if (aVar == null) {
            g(dVar);
            return;
        }
        aVar.u();
        i cameraSettings = aVar.getCameraSettings();
        if (cameraSettings.b() == 1) {
            cameraSettings.i(0);
        } else {
            cameraSettings.i(1);
        }
        aVar.y();
        dVar.a(Integer.valueOf(cameraSettings.b()));
    }

    private final List<o5.a> l(List<Integer> list, k.d dVar) {
        List<o5.a> list2;
        if (list != null) {
            try {
                list2 = new ArrayList<>(o.i(list, 10));
                for (Number intValue : list) {
                    list2.add(o5.a.values()[intValue.intValue()]);
                }
            } catch (Exception e10) {
                dVar.b("", e10.getMessage(), (Object) null);
                return n.c();
            }
        } else {
            list2 = null;
        }
        if (list2 == null) {
            list2 = n.c();
        }
        return list2;
    }

    private final void m(k.d dVar) {
        a aVar = this.f11267r;
        if (aVar == null) {
            g(dVar);
        } else {
            dVar.a(Integer.valueOf(aVar.getCameraSettings().b()));
        }
    }

    private final void n(k.d dVar) {
        if (this.f11267r == null) {
            g(dVar);
        } else {
            dVar.a(Boolean.valueOf(this.f11265p));
        }
    }

    /* access modifiers changed from: private */
    public final boolean o() {
        return Build.VERSION.SDK_INT < 23 || androidx.core.content.a.a(this.f11262m, "android.permission.CAMERA") == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x003e, code lost:
        r4 = r4.getCameraSettings();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void p(k7.k.d r6) {
        /*
            r5 = this;
            r0 = 4
            r1 = 0
            g8.l[] r0 = new g8.l[r0]     // Catch:{ Exception -> 0x005c }
            r2 = 0
            java.lang.String r3 = "hasFrontCamera"
            boolean r4 = r5.s()     // Catch:{ Exception -> 0x005c }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x005c }
            g8.l r3 = g8.p.a(r3, r4)     // Catch:{ Exception -> 0x005c }
            r0[r2] = r3     // Catch:{ Exception -> 0x005c }
            r2 = 1
            java.lang.String r3 = "hasBackCamera"
            boolean r4 = r5.q()     // Catch:{ Exception -> 0x005c }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x005c }
            g8.l r3 = g8.p.a(r3, r4)     // Catch:{ Exception -> 0x005c }
            r0[r2] = r3     // Catch:{ Exception -> 0x005c }
            r2 = 2
            java.lang.String r3 = "hasFlash"
            boolean r4 = r5.r()     // Catch:{ Exception -> 0x005c }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x005c }
            g8.l r3 = g8.p.a(r3, r4)     // Catch:{ Exception -> 0x005c }
            r0[r2] = r3     // Catch:{ Exception -> 0x005c }
            r2 = 3
            java.lang.String r3 = "activeCamera"
            m9.a r4 = r5.f11267r     // Catch:{ Exception -> 0x005c }
            if (r4 == 0) goto L_0x004d
            n6.i r4 = r4.getCameraSettings()     // Catch:{ Exception -> 0x005c }
            if (r4 == 0) goto L_0x004d
            int r4 = r4.b()     // Catch:{ Exception -> 0x005c }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x005c }
            goto L_0x004e
        L_0x004d:
            r4 = r1
        L_0x004e:
            g8.l r3 = g8.p.a(r3, r4)     // Catch:{ Exception -> 0x005c }
            r0[r2] = r3     // Catch:{ Exception -> 0x005c }
            java.util.Map r0 = h8.f0.f(r0)     // Catch:{ Exception -> 0x005c }
            r6.a(r0)     // Catch:{ Exception -> 0x005c }
            goto L_0x0066
        L_0x005c:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = ""
            r6.b(r2, r0, r1)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.c.p(k7.k$d):void");
    }

    @SuppressLint({"UnsupportedChromeOsCameraSystemFeature"})
    private final boolean q() {
        return t("android.hardware.camera");
    }

    private final boolean r() {
        return t("android.hardware.camera.flash");
    }

    private final boolean s() {
        return t("android.hardware.camera.front");
    }

    private final boolean t(String str) {
        return this.f11262m.getPackageManager().hasSystemFeature(str);
    }

    private final a u() {
        i cameraSettings;
        a aVar = this.f11267r;
        if (aVar == null) {
            aVar = new a(f.f11279a.a());
            this.f11267r = aVar;
            aVar.setDecoderFactory(new j((Collection<o5.a>) null, (Map<e, ?>) null, (String) null, 2));
            Object obj = this.f11264o.get("cameraFacing");
            l.c(obj, "null cannot be cast to non-null type kotlin.Int");
            if (((Integer) obj).intValue() == 1 && (cameraSettings = aVar.getCameraSettings()) != null) {
                cameraSettings.i(1);
            }
        } else if (!this.f11266q) {
            aVar.y();
        }
        return aVar;
    }

    private final void v(k.d dVar) {
        a aVar = this.f11267r;
        if (aVar == null) {
            g(dVar);
            return;
        }
        if (aVar.t()) {
            this.f11266q = true;
            aVar.u();
        }
        dVar.a(Boolean.TRUE);
    }

    private final void w(k.d dVar) {
        a aVar = this.f11267r;
        if (aVar == null) {
            g(dVar);
            return;
        }
        if (!aVar.t()) {
            this.f11266q = false;
            aVar.y();
        }
        dVar.a(Boolean.TRUE);
    }

    private final void x(boolean z9) {
        a aVar = this.f11267r;
        if (aVar != null) {
            aVar.u();
            aVar.getCameraSettings().j(z9);
            aVar.y();
        }
    }

    private final void y(double d10, double d11, double d12) {
        a aVar = this.f11267r;
        if (aVar != null) {
            aVar.O(j(d10), j(d11), j(d12));
        }
    }

    private final void z(List<Integer> list, k.d dVar) {
        i();
        List<o5.a> l10 = l(list, dVar);
        a aVar = this.f11267r;
        if (aVar != null) {
            aVar.I(new d(l10, this));
        }
    }

    public View I() {
        return u();
    }

    public /* synthetic */ void J() {
        io.flutter.plugin.platform.e.d(this);
    }

    public /* synthetic */ void K(View view) {
        io.flutter.plugin.platform.e.a(this, view);
    }

    public /* synthetic */ void O() {
        io.flutter.plugin.platform.e.b(this);
    }

    public /* synthetic */ void P() {
        io.flutter.plugin.platform.e.c(this);
    }

    public void e() {
        g gVar = this.f11269t;
        if (gVar != null) {
            gVar.a();
        }
        d7.c b10 = f.f11279a.b();
        if (b10 != null) {
            b10.f(this);
        }
        a aVar = this.f11267r;
        if (aVar != null) {
            aVar.u();
        }
        this.f11267r = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0114, code lost:
        if (r0.equals("stopCamera") == false) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0117, code lost:
        v(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (r0.equals("pauseCamera") == false) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(k7.j r12, k7.k.d r13) {
        /*
            r11 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.l.e(r12, r0)
            java.lang.String r0 = "result"
            kotlin.jvm.internal.l.e(r13, r0)
            java.lang.String r0 = r12.f10996a
            if (r0 == 0) goto L_0x013f
            int r1 = r0.hashCode()
            switch(r1) {
                case -2129330689: goto L_0x0128;
                case -2110134142: goto L_0x011b;
                case -1824838201: goto L_0x010e;
                case -1176613766: goto L_0x00a9;
                case -1157185016: goto L_0x009a;
                case -668845828: goto L_0x008b;
                case 437643762: goto L_0x007c;
                case 1026482610: goto L_0x006d;
                case 1669188213: goto L_0x005e;
                case 1714778527: goto L_0x004f;
                case 1899593587: goto L_0x0030;
                case 1984772457: goto L_0x0021;
                case 2013529275: goto L_0x0017;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x013f
        L_0x0017:
            java.lang.String r12 = "pauseCamera"
            boolean r12 = r0.equals(r12)
            if (r12 != 0) goto L_0x0117
            goto L_0x013f
        L_0x0021:
            java.lang.String r12 = "getCameraInfo"
            boolean r12 = r0.equals(r12)
            if (r12 != 0) goto L_0x002b
            goto L_0x013f
        L_0x002b:
            r11.m(r13)
            goto L_0x0142
        L_0x0030:
            java.lang.String r1 = "invertScan"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x003a
            goto L_0x013f
        L_0x003a:
            java.lang.String r13 = "isInvertScan"
            java.lang.Object r12 = r12.a(r13)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            if (r12 != 0) goto L_0x0046
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
        L_0x0046:
            boolean r12 = r12.booleanValue()
            r11.x(r12)
            goto L_0x0142
        L_0x004f:
            java.lang.String r12 = "stopScan"
            boolean r12 = r0.equals(r12)
            if (r12 != 0) goto L_0x0059
            goto L_0x013f
        L_0x0059:
            r11.A()
            goto L_0x0142
        L_0x005e:
            java.lang.String r12 = "requestPermissions"
            boolean r12 = r0.equals(r12)
            if (r12 != 0) goto L_0x0068
            goto L_0x013f
        L_0x0068:
            r11.i()
            goto L_0x0142
        L_0x006d:
            java.lang.String r12 = "resumeCamera"
            boolean r12 = r0.equals(r12)
            if (r12 != 0) goto L_0x0077
            goto L_0x013f
        L_0x0077:
            r11.w(r13)
            goto L_0x0142
        L_0x007c:
            java.lang.String r12 = "flipCamera"
            boolean r12 = r0.equals(r12)
            if (r12 != 0) goto L_0x0086
            goto L_0x013f
        L_0x0086:
            r11.k(r13)
            goto L_0x0142
        L_0x008b:
            java.lang.String r12 = "toggleFlash"
            boolean r12 = r0.equals(r12)
            if (r12 != 0) goto L_0x0095
            goto L_0x013f
        L_0x0095:
            r11.B(r13)
            goto L_0x0142
        L_0x009a:
            java.lang.String r12 = "getFlashInfo"
            boolean r12 = r0.equals(r12)
            if (r12 != 0) goto L_0x00a4
            goto L_0x013f
        L_0x00a4:
            r11.n(r13)
            goto L_0x0142
        L_0x00a9:
            java.lang.String r1 = "changeScanArea"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b3
            goto L_0x013f
        L_0x00b3:
            java.lang.String r0 = "scanAreaWidth"
            java.lang.Object r0 = r12.a(r0)
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x0104
            java.lang.String r2 = "requireNotNull(...)"
            kotlin.jvm.internal.l.d(r0, r2)
            java.lang.Number r0 = (java.lang.Number) r0
            double r4 = r0.doubleValue()
            java.lang.String r0 = "scanAreaHeight"
            java.lang.Object r0 = r12.a(r0)
            if (r0 == 0) goto L_0x00fa
            kotlin.jvm.internal.l.d(r0, r2)
            java.lang.Number r0 = (java.lang.Number) r0
            double r6 = r0.doubleValue()
            java.lang.String r0 = "cutOutBottomOffset"
            java.lang.Object r12 = r12.a(r0)
            if (r12 == 0) goto L_0x00f0
            kotlin.jvm.internal.l.d(r12, r2)
            java.lang.Number r12 = (java.lang.Number) r12
            double r8 = r12.doubleValue()
            r3 = r11
            r10 = r13
            r3.h(r4, r6, r8, r10)
            goto L_0x0142
        L_0x00f0:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r1.toString()
            r12.<init>(r13)
            throw r12
        L_0x00fa:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r1.toString()
            r12.<init>(r13)
            throw r12
        L_0x0104:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r1.toString()
            r12.<init>(r13)
            throw r12
        L_0x010e:
            java.lang.String r12 = "stopCamera"
            boolean r12 = r0.equals(r12)
            if (r12 != 0) goto L_0x0117
            goto L_0x013f
        L_0x0117:
            r11.v(r13)
            goto L_0x0142
        L_0x011b:
            java.lang.String r12 = "getSystemFeatures"
            boolean r12 = r0.equals(r12)
            if (r12 != 0) goto L_0x0124
            goto L_0x013f
        L_0x0124:
            r11.p(r13)
            goto L_0x0142
        L_0x0128:
            java.lang.String r1 = "startScan"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0131
            goto L_0x013f
        L_0x0131:
            java.lang.Object r12 = r12.f10997b
            boolean r0 = r12 instanceof java.util.List
            if (r0 == 0) goto L_0x013a
            java.util.List r12 = (java.util.List) r12
            goto L_0x013b
        L_0x013a:
            r12 = 0
        L_0x013b:
            r11.z(r12, r13)
            goto L_0x0142
        L_0x013f:
            r13.c()
        L_0x0142:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.c.onMethodCall(k7.j, k7.k$d):void");
    }

    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        l.e(strArr, "permissions");
        l.e(iArr, "grantResults");
        boolean z9 = false;
        if (i10 != this.f11270u) {
            return false;
        }
        Integer k10 = j.k(iArr);
        if (k10 != null && k10.intValue() == 0) {
            z9 = true;
        }
        this.f11268s.c("onPermissionSet", Boolean.valueOf(z9));
        return z9;
    }
}
