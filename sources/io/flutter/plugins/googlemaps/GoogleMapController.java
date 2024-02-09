package io.flutter.plugins.googlemaps;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import android.view.Choreographer;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.g;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import d7.c;
import io.flutter.plugin.platform.e;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k7.k;
import x2.c;
import x2.d;
import x2.f;
import z2.l;
import z2.o;
import z2.q;

final class GoogleMapController implements DefaultLifecycleObserver, c.a, m, k.c, f, l, io.flutter.plugin.platform.f {
    private k.d A;
    private final Context B;
    private final o C;
    private final s D;
    private final w E;
    private final a0 F;
    private final d G;
    private final e0 H;
    private List<Object> I;
    private List<Object> J;
    private List<Object> K;
    private List<Object> L;
    private List<Map<String, ?>> M;
    List<Float> N;
    private boolean O = false;

    /* renamed from: m  reason: collision with root package name */
    private final int f10421m;

    /* renamed from: n  reason: collision with root package name */
    private final k f10422n;

    /* renamed from: o  reason: collision with root package name */
    private final GoogleMapOptions f10423o;

    /* renamed from: p  reason: collision with root package name */
    private d f10424p;

    /* renamed from: q  reason: collision with root package name */
    private x2.c f10425q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f10426r = false;

    /* renamed from: s  reason: collision with root package name */
    private boolean f10427s = false;

    /* renamed from: t  reason: collision with root package name */
    private boolean f10428t = false;

    /* renamed from: u  reason: collision with root package name */
    private boolean f10429u = true;

    /* renamed from: v  reason: collision with root package name */
    private boolean f10430v = true;

    /* renamed from: w  reason: collision with root package name */
    private boolean f10431w = false;

    /* renamed from: x  reason: collision with root package name */
    private boolean f10432x = true;

    /* renamed from: y  reason: collision with root package name */
    private boolean f10433y = false;

    /* renamed from: z  reason: collision with root package name */
    final float f10434z;

    class a implements Choreographer.FrameCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f10435a;

        a(Runnable runnable) {
            this.f10435a = runnable;
        }

        public void doFrame(long j10) {
            this.f10435a.run();
        }
    }

    class b implements c.m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k.d f10436a;

        b(k.d dVar) {
            this.f10436a = dVar;
        }

        public void a(Bitmap bitmap) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bitmap.recycle();
            this.f10436a.a(byteArray);
        }
    }

    GoogleMapController(int i10, Context context, k7.c cVar, o oVar, GoogleMapOptions googleMapOptions) {
        this.f10421m = i10;
        this.B = context;
        this.f10423o = googleMapOptions;
        this.f10424p = new d(context, googleMapOptions);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f10434z = f10;
        k kVar = new k(cVar, "plugins.flutter.dev/google_maps_android_" + i10);
        this.f10422n = kVar;
        kVar.e(this);
        this.C = oVar;
        this.D = new s(kVar);
        this.E = new w(kVar, f10);
        this.F = new a0(kVar, f10);
        this.G = new d(kVar, f10);
        this.H = new e0(kVar);
    }

    private void S(x2.a aVar) {
        this.f10425q.f(aVar);
    }

    private int T(String str) {
        if (str != null) {
            return this.B.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    private void U() {
        d dVar = this.f10424p;
        if (dVar != null) {
            dVar.c();
            this.f10424p = null;
        }
    }

    private CameraPosition b0() {
        if (this.f10426r) {
            return this.f10425q.g();
        }
        return null;
    }

    private boolean c0() {
        return T("android.permission.ACCESS_FINE_LOCATION") == 0 || T("android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    private void e0() {
        x2.c cVar = this.f10425q;
        if (cVar != null && !this.O) {
            this.O = true;
            cVar.D(new i(this));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f0() {
        d dVar = this.f10424p;
        if (dVar != null) {
            dVar.invalidate();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g0() {
        j0(new g(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h0() {
        this.O = false;
        j0(new h(this));
    }

    private void i0(x2.a aVar) {
        this.f10425q.n(aVar);
    }

    private static void j0(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new a(runnable));
    }

    private void k0(l lVar) {
        x2.c cVar = this.f10425q;
        if (cVar == null) {
            Log.v("GoogleMapController", "Controller was disposed before GoogleMap was ready.");
            return;
        }
        cVar.z(lVar);
        this.f10425q.y(lVar);
        this.f10425q.x(lVar);
        this.f10425q.F(lVar);
        this.f10425q.G(lVar);
        this.f10425q.H(lVar);
        this.f10425q.I(lVar);
        this.f10425q.A(lVar);
        this.f10425q.C(lVar);
        this.f10425q.E(lVar);
    }

    private void r0() {
        this.G.c(this.L);
    }

    private void s0() {
        this.D.c(this.I);
    }

    private void t0() {
        this.E.c(this.J);
    }

    private void u0() {
        this.F.c(this.K);
    }

    private void v0() {
        this.H.b(this.M);
    }

    @SuppressLint({"MissingPermission"})
    private void w0() {
        if (c0()) {
            this.f10425q.w(this.f10427s);
            this.f10425q.k().k(this.f10428t);
            return;
        }
        Log.e("GoogleMapController", "Cannot enable MyLocation layer as location permissions are not granted");
    }

    public void A(boolean z9) {
        this.f10425q.k().j(z9);
    }

    public void B(l lVar) {
        this.D.l(lVar.a(), lVar.b());
    }

    public void C() {
        this.f10422n.c("camera#onIdle", Collections.singletonMap("map", Integer.valueOf(this.f10421m)));
    }

    public void D(x2.c cVar) {
        this.f10425q = cVar;
        cVar.q(this.f10430v);
        this.f10425q.K(this.f10431w);
        this.f10425q.p(this.f10432x);
        cVar.B(this);
        k.d dVar = this.A;
        if (dVar != null) {
            dVar.a((Object) null);
            this.A = null;
        }
        k0(this);
        w0();
        this.D.o(cVar);
        this.E.i(cVar);
        this.F.i(cVar);
        this.G.i(cVar);
        this.H.j(cVar);
        s0();
        t0();
        u0();
        r0();
        v0();
        List<Float> list = this.N;
        if (list != null && list.size() == 4) {
            W(this.N.get(0).floatValue(), this.N.get(1).floatValue(), this.N.get(2).floatValue(), this.N.get(3).floatValue());
        }
    }

    public void H(boolean z9) {
        this.f10425q.k().m(z9);
    }

    public View I() {
        return this.f10424p;
    }

    public /* synthetic */ void J() {
        e.d(this);
    }

    public /* synthetic */ void K(View view) {
        e.a(this, view);
    }

    public void L(boolean z9) {
        this.f10425q.k().n(z9);
    }

    public void M(boolean z9) {
        if (this.f10427s != z9) {
            this.f10427s = z9;
            if (this.f10425q != null) {
                w0();
            }
        }
    }

    public void N(boolean z9) {
        this.f10425q.k().p(z9);
    }

    public /* synthetic */ void O() {
        e.b(this);
    }

    public /* synthetic */ void P() {
        e.c(this);
    }

    public void Q(boolean z9) {
        if (this.f10429u != z9) {
            this.f10429u = z9;
            x2.c cVar = this.f10425q;
            if (cVar != null) {
                cVar.k().o(z9);
            }
        }
    }

    public void R(boolean z9) {
        this.f10431w = z9;
        x2.c cVar = this.f10425q;
        if (cVar != null) {
            cVar.K(z9);
        }
    }

    public void V(boolean z9) {
        this.f10425q.k().l(z9);
    }

    public void W(float f10, float f11, float f12, float f13) {
        x2.c cVar = this.f10425q;
        if (cVar != null) {
            float f14 = this.f10434z;
            cVar.J((int) (f11 * f14), (int) (f10 * f14), (int) (f13 * f14), (int) (f12 * f14));
            return;
        }
        n0(f10, f11, f12, f13);
    }

    public void X(boolean z9) {
        this.f10426r = z9;
    }

    public void Y(boolean z9) {
        this.f10423o.C(z9);
    }

    public void Z(LatLngBounds latLngBounds) {
        this.f10425q.r(latLngBounds);
    }

    public void a(l lVar) {
        this.D.i(lVar.a());
    }

    public void a0(Float f10, Float f11) {
        this.f10425q.o();
        if (f10 != null) {
            this.f10425q.v(f10.floatValue());
        }
        if (f11 != null) {
            this.f10425q.u(f11.floatValue());
        }
    }

    public void b(androidx.lifecycle.l lVar) {
        if (!this.f10433y) {
            this.f10424p.d();
        }
    }

    public void c(androidx.lifecycle.l lVar) {
        lVar.a().c(this);
        if (!this.f10433y) {
            U();
        }
    }

    public void d(androidx.lifecycle.l lVar) {
        if (!this.f10433y) {
            this.f10424p.b((Bundle) null);
        }
    }

    /* access modifiers changed from: package-private */
    public void d0() {
        this.C.a().a(this);
        this.f10424p.a(this);
    }

    public void e() {
        if (!this.f10433y) {
            this.f10433y = true;
            this.f10422n.e((k.c) null);
            k0((l) null);
            U();
            g a10 = this.C.a();
            if (a10 != null) {
                a10.c(this);
            }
        }
    }

    public void f(int i10) {
        HashMap hashMap = new HashMap(2);
        boolean z9 = true;
        if (i10 != 1) {
            z9 = false;
        }
        hashMap.put("isGesture", Boolean.valueOf(z9));
        this.f10422n.c("camera#onMoveStarted", hashMap);
    }

    public void g(l lVar) {
        this.D.k(lVar.a(), lVar.b());
    }

    public void i(androidx.lifecycle.l lVar) {
        if (!this.f10433y) {
            this.f10424p.d();
        }
    }

    public void j(q qVar) {
        this.F.g(qVar.a());
    }

    public void k(androidx.lifecycle.l lVar) {
        if (!this.f10433y) {
            this.f10424p.f();
        }
    }

    public void l(Bundle bundle) {
        if (!this.f10433y) {
            this.f10424p.e(bundle);
        }
    }

    public void l0(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        this.L = arrayList != null ? new ArrayList(arrayList) : null;
        if (this.f10425q != null) {
            r0();
        }
    }

    public void m() {
        if (this.f10426r) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("position", e.a(this.f10425q.g()));
            this.f10422n.c("camera#onMove", hashMap);
        }
    }

    public void m0(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        this.I = arrayList != null ? new ArrayList(arrayList) : null;
        if (this.f10425q != null) {
            s0();
        }
    }

    public void n(Bundle bundle) {
        if (!this.f10433y) {
            this.f10424p.b(bundle);
        }
    }

    /* access modifiers changed from: package-private */
    public void n0(float f10, float f11, float f12, float f13) {
        List<Float> list = this.N;
        if (list == null) {
            this.N = new ArrayList();
        } else {
            list.clear();
        }
        this.N.add(Float.valueOf(f10));
        this.N.add(Float.valueOf(f11));
        this.N.add(Float.valueOf(f12));
        this.N.add(Float.valueOf(f13));
    }

    public void o(l lVar) {
        this.D.j(lVar.a(), lVar.b());
    }

    public void o0(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        this.J = arrayList != null ? new ArrayList(arrayList) : null;
        if (this.f10425q != null) {
            t0();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d5, code lost:
        r9.a((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x029c, code lost:
        r8 = java.lang.Boolean.valueOf(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02b2, code lost:
        r8 = (java.lang.String) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0437, code lost:
        r9.a(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0468, code lost:
        r9.b("GoogleMap uninitialized", r8, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(k7.j r8, k7.k.d r9) {
        /*
            r7 = this;
            java.lang.String r0 = r8.f10996a
            r0.hashCode()
            int r1 = r0.hashCode()
            r2 = 2
            r3 = -1
            switch(r1) {
                case -2068530537: goto L_0x01ad;
                case -1753225255: goto L_0x01a2;
                case -1675017333: goto L_0x0197;
                case -1389285936: goto L_0x018c;
                case -1366519597: goto L_0x0181;
                case -1264573565: goto L_0x0176;
                case -1255039905: goto L_0x016b;
                case -1253612063: goto L_0x0160;
                case -1102318061: goto L_0x0152;
                case -596474455: goto L_0x0144;
                case -577075523: goto L_0x0136;
                case -508357782: goto L_0x0128;
                case -451921790: goto L_0x011a;
                case 262112323: goto L_0x010c;
                case 282895827: goto L_0x00fe;
                case 295004975: goto L_0x00f0;
                case 390939153: goto L_0x00e2;
                case 434031410: goto L_0x00d4;
                case 622947733: goto L_0x00c6;
                case 643972249: goto L_0x00b8;
                case 712945078: goto L_0x00aa;
                case 972868051: goto L_0x009c;
                case 1098288608: goto L_0x008e;
                case 1172199911: goto L_0x0080;
                case 1322988819: goto L_0x0072;
                case 1546082965: goto L_0x0064;
                case 1564959387: goto L_0x0056;
                case 1708609913: goto L_0x0048;
                case 1873569705: goto L_0x003a;
                case 1915657375: goto L_0x002c;
                case 1953391461: goto L_0x001e;
                case 2003557999: goto L_0x0010;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x01b7
        L_0x0010:
            java.lang.String r1 = "camera#move"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001a
            goto L_0x01b7
        L_0x001a:
            r3 = 31
            goto L_0x01b7
        L_0x001e:
            java.lang.String r1 = "markers#showInfoWindow"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0028
            goto L_0x01b7
        L_0x0028:
            r3 = 30
            goto L_0x01b7
        L_0x002c:
            java.lang.String r1 = "map#isLiteModeEnabled"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0036
            goto L_0x01b7
        L_0x0036:
            r3 = 29
            goto L_0x01b7
        L_0x003a:
            java.lang.String r1 = "circles#update"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0044
            goto L_0x01b7
        L_0x0044:
            r3 = 28
            goto L_0x01b7
        L_0x0048:
            java.lang.String r1 = "tileOverlays#clearTileCache"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0052
            goto L_0x01b7
        L_0x0052:
            r3 = 27
            goto L_0x01b7
        L_0x0056:
            java.lang.String r1 = "tileOverlays#update"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0060
            goto L_0x01b7
        L_0x0060:
            r3 = 26
            goto L_0x01b7
        L_0x0064:
            java.lang.String r1 = "map#isTrafficEnabled"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x006e
            goto L_0x01b7
        L_0x006e:
            r3 = 25
            goto L_0x01b7
        L_0x0072:
            java.lang.String r1 = "markers#update"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x007c
            goto L_0x01b7
        L_0x007c:
            r3 = 24
            goto L_0x01b7
        L_0x0080:
            java.lang.String r1 = "map#isZoomControlsEnabled"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x008a
            goto L_0x01b7
        L_0x008a:
            r3 = 23
            goto L_0x01b7
        L_0x008e:
            java.lang.String r1 = "map#isCompassEnabled"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0098
            goto L_0x01b7
        L_0x0098:
            r3 = 22
            goto L_0x01b7
        L_0x009c:
            java.lang.String r1 = "map#isBuildingsEnabled"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00a6
            goto L_0x01b7
        L_0x00a6:
            r3 = 21
            goto L_0x01b7
        L_0x00aa:
            java.lang.String r1 = "map#setStyle"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00b4
            goto L_0x01b7
        L_0x00b4:
            r3 = 20
            goto L_0x01b7
        L_0x00b8:
            java.lang.String r1 = "polylines#update"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00c2
            goto L_0x01b7
        L_0x00c2:
            r3 = 19
            goto L_0x01b7
        L_0x00c6:
            java.lang.String r1 = "map#getLatLng"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00d0
            goto L_0x01b7
        L_0x00d0:
            r3 = 18
            goto L_0x01b7
        L_0x00d4:
            java.lang.String r1 = "map#takeSnapshot"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00de
            goto L_0x01b7
        L_0x00de:
            r3 = 17
            goto L_0x01b7
        L_0x00e2:
            java.lang.String r1 = "map#isMapToolbarEnabled"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00ec
            goto L_0x01b7
        L_0x00ec:
            r3 = 16
            goto L_0x01b7
        L_0x00f0:
            java.lang.String r1 = "map#waitForMap"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00fa
            goto L_0x01b7
        L_0x00fa:
            r3 = 15
            goto L_0x01b7
        L_0x00fe:
            java.lang.String r1 = "map#isZoomGesturesEnabled"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0108
            goto L_0x01b7
        L_0x0108:
            r3 = 14
            goto L_0x01b7
        L_0x010c:
            java.lang.String r1 = "map#getMinMaxZoomLevels"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0116
            goto L_0x01b7
        L_0x0116:
            r3 = 13
            goto L_0x01b7
        L_0x011a:
            java.lang.String r1 = "map#getZoomLevel"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0124
            goto L_0x01b7
        L_0x0124:
            r3 = 12
            goto L_0x01b7
        L_0x0128:
            java.lang.String r1 = "markers#hideInfoWindow"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0132
            goto L_0x01b7
        L_0x0132:
            r3 = 11
            goto L_0x01b7
        L_0x0136:
            java.lang.String r1 = "map#isMyLocationButtonEnabled"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0140
            goto L_0x01b7
        L_0x0140:
            r3 = 10
            goto L_0x01b7
        L_0x0144:
            java.lang.String r1 = "map#isTiltGesturesEnabled"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x014e
            goto L_0x01b7
        L_0x014e:
            r3 = 9
            goto L_0x01b7
        L_0x0152:
            java.lang.String r1 = "polygons#update"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x015c
            goto L_0x01b7
        L_0x015c:
            r3 = 8
            goto L_0x01b7
        L_0x0160:
            java.lang.String r1 = "map#getTileOverlayInfo"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0169
            goto L_0x01b7
        L_0x0169:
            r3 = 7
            goto L_0x01b7
        L_0x016b:
            java.lang.String r1 = "markers#isInfoWindowShown"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0174
            goto L_0x01b7
        L_0x0174:
            r3 = 6
            goto L_0x01b7
        L_0x0176:
            java.lang.String r1 = "camera#animate"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x017f
            goto L_0x01b7
        L_0x017f:
            r3 = 5
            goto L_0x01b7
        L_0x0181:
            java.lang.String r1 = "map#getScreenCoordinate"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x018a
            goto L_0x01b7
        L_0x018a:
            r3 = 4
            goto L_0x01b7
        L_0x018c:
            java.lang.String r1 = "map#update"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0195
            goto L_0x01b7
        L_0x0195:
            r3 = 3
            goto L_0x01b7
        L_0x0197:
            java.lang.String r1 = "map#isRotateGesturesEnabled"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01a0
            goto L_0x01b7
        L_0x01a0:
            r3 = 2
            goto L_0x01b7
        L_0x01a2:
            java.lang.String r1 = "map#isScrollGesturesEnabled"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01ab
            goto L_0x01b7
        L_0x01ab:
            r3 = 1
            goto L_0x01b7
        L_0x01ad:
            java.lang.String r1 = "map#getVisibleRegion"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01b6
            goto L_0x01b7
        L_0x01b6:
            r3 = 0
        L_0x01b7:
            java.lang.String r0 = "tileOverlayId"
            java.lang.String r1 = "cameraUpdate"
            java.lang.String r4 = "markerId"
            java.lang.String r5 = "GoogleMap uninitialized"
            r6 = 0
            switch(r3) {
                case 0: goto L_0x0453;
                case 1: goto L_0x0447;
                case 2: goto L_0x043b;
                case 3: goto L_0x0426;
                case 4: goto L_0x040a;
                case 5: goto L_0x03fb;
                case 6: goto L_0x03ee;
                case 7: goto L_0x03e1;
                case 8: goto L_0x03b5;
                case 9: goto L_0x03a9;
                case 10: goto L_0x039d;
                case 11: goto L_0x0390;
                case 12: goto L_0x0382;
                case 13: goto L_0x0361;
                case 14: goto L_0x0355;
                case 15: goto L_0x0349;
                case 16: goto L_0x033d;
                case 17: goto L_0x032b;
                case 18: goto L_0x030d;
                case 19: goto L_0x02e1;
                case 20: goto L_0x02a9;
                case 21: goto L_0x02a2;
                case 22: goto L_0x0292;
                case 23: goto L_0x0287;
                case 24: goto L_0x025b;
                case 25: goto L_0x0254;
                case 26: goto L_0x0229;
                case 27: goto L_0x021a;
                case 28: goto L_0x01ef;
                case 29: goto L_0x01e7;
                case 30: goto L_0x01da;
                case 31: goto L_0x01c8;
                default: goto L_0x01c3;
            }
        L_0x01c3:
            r9.c()
            goto L_0x046b
        L_0x01c8:
            java.lang.Object r8 = r8.a(r1)
            float r0 = r7.f10434z
            x2.a r8 = io.flutter.plugins.googlemaps.e.w(r8, r0)
            r7.i0(r8)
        L_0x01d5:
            r9.a(r6)
            goto L_0x046b
        L_0x01da:
            java.lang.Object r8 = r8.a(r4)
            io.flutter.plugins.googlemaps.s r0 = r7.D
            java.lang.String r8 = (java.lang.String) r8
            r0.p(r8, r9)
            goto L_0x046b
        L_0x01e7:
            com.google.android.gms.maps.GoogleMapOptions r8 = r7.f10423o
            java.lang.Boolean r8 = r8.l()
            goto L_0x0437
        L_0x01ef:
            r7.e0()
            java.lang.String r0 = "circlesToAdd"
            java.lang.Object r0 = r8.a(r0)
            java.util.List r0 = (java.util.List) r0
            io.flutter.plugins.googlemaps.d r1 = r7.G
            r1.c(r0)
            java.lang.String r0 = "circlesToChange"
            java.lang.Object r0 = r8.a(r0)
            java.util.List r0 = (java.util.List) r0
            io.flutter.plugins.googlemaps.d r1 = r7.G
            r1.e(r0)
            java.lang.String r0 = "circleIdsToRemove"
            java.lang.Object r8 = r8.a(r0)
            java.util.List r8 = (java.util.List) r8
            io.flutter.plugins.googlemaps.d r0 = r7.G
            r0.h(r8)
            goto L_0x01d5
        L_0x021a:
            r7.e0()
            java.lang.Object r8 = r8.a(r0)
            java.lang.String r8 = (java.lang.String) r8
            io.flutter.plugins.googlemaps.e0 r0 = r7.H
            r0.e(r8)
            goto L_0x01d5
        L_0x0229:
            r7.e0()
            java.lang.String r0 = "tileOverlaysToAdd"
            java.lang.Object r0 = r8.a(r0)
            java.util.List r0 = (java.util.List) r0
            io.flutter.plugins.googlemaps.e0 r1 = r7.H
            r1.b(r0)
            java.lang.String r0 = "tileOverlaysToChange"
            java.lang.Object r0 = r8.a(r0)
            java.util.List r0 = (java.util.List) r0
            io.flutter.plugins.googlemaps.e0 r1 = r7.H
            r1.d(r0)
            java.lang.String r0 = "tileOverlayIdsToRemove"
            java.lang.Object r8 = r8.a(r0)
            java.util.List r8 = (java.util.List) r8
            io.flutter.plugins.googlemaps.e0 r0 = r7.H
            r0.i(r8)
            goto L_0x01d5
        L_0x0254:
            x2.c r8 = r7.f10425q
            boolean r8 = r8.m()
            goto L_0x029c
        L_0x025b:
            r7.e0()
            java.lang.String r0 = "markersToAdd"
            java.lang.Object r0 = r8.a(r0)
            java.util.List r0 = (java.util.List) r0
            io.flutter.plugins.googlemaps.s r1 = r7.D
            r1.c(r0)
            java.lang.String r0 = "markersToChange"
            java.lang.Object r0 = r8.a(r0)
            java.util.List r0 = (java.util.List) r0
            io.flutter.plugins.googlemaps.s r1 = r7.D
            r1.e(r0)
            java.lang.String r0 = "markerIdsToRemove"
            java.lang.Object r8 = r8.a(r0)
            java.util.List r8 = (java.util.List) r8
            io.flutter.plugins.googlemaps.s r0 = r7.D
            r0.n(r8)
            goto L_0x01d5
        L_0x0287:
            x2.c r8 = r7.f10425q
            x2.i r8 = r8.k()
            boolean r8 = r8.g()
            goto L_0x029c
        L_0x0292:
            x2.c r8 = r7.f10425q
            x2.i r8 = r8.k()
            boolean r8 = r8.a()
        L_0x029c:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            goto L_0x0437
        L_0x02a2:
            x2.c r8 = r7.f10425q
            boolean r8 = r8.l()
            goto L_0x029c
        L_0x02a9:
            r7.e0()
            java.lang.Object r8 = r8.f10997b
            boolean r0 = r8 instanceof java.lang.String
            if (r0 == 0) goto L_0x02c3
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L_0x02b7
            goto L_0x02c3
        L_0x02b7:
            x2.c r0 = r7.f10425q
            z2.k r1 = new z2.k
            r1.<init>(r8)
            boolean r8 = r0.s(r1)
            goto L_0x02c9
        L_0x02c3:
            x2.c r8 = r7.f10425q
            boolean r8 = r8.s(r6)
        L_0x02c9:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            r0.add(r1)
            if (r8 != 0) goto L_0x02dc
            java.lang.String r8 = "Unable to set the map style. Please check console logs for errors."
            r0.add(r8)
        L_0x02dc:
            r9.a(r0)
            goto L_0x046b
        L_0x02e1:
            r7.e0()
            java.lang.String r0 = "polylinesToAdd"
            java.lang.Object r0 = r8.a(r0)
            java.util.List r0 = (java.util.List) r0
            io.flutter.plugins.googlemaps.a0 r1 = r7.F
            r1.c(r0)
            java.lang.String r0 = "polylinesToChange"
            java.lang.Object r0 = r8.a(r0)
            java.util.List r0 = (java.util.List) r0
            io.flutter.plugins.googlemaps.a0 r1 = r7.F
            r1.e(r0)
            java.lang.String r0 = "polylineIdsToRemove"
            java.lang.Object r8 = r8.a(r0)
            java.util.List r8 = (java.util.List) r8
            io.flutter.plugins.googlemaps.a0 r0 = r7.F
            r0.h(r8)
            goto L_0x01d5
        L_0x030d:
            x2.c r0 = r7.f10425q
            if (r0 == 0) goto L_0x0327
            java.lang.Object r8 = r8.f10997b
            android.graphics.Point r8 = io.flutter.plugins.googlemaps.e.L(r8)
            x2.c r0 = r7.f10425q
            x2.h r0 = r0.j()
            com.google.android.gms.maps.model.LatLng r8 = r0.a(r8)
            java.lang.Object r8 = io.flutter.plugins.googlemaps.e.l(r8)
            goto L_0x0437
        L_0x0327:
            java.lang.String r8 = "getLatLng called prior to map initialization"
            goto L_0x0468
        L_0x032b:
            x2.c r8 = r7.f10425q
            if (r8 == 0) goto L_0x0339
            io.flutter.plugins.googlemaps.GoogleMapController$b r0 = new io.flutter.plugins.googlemaps.GoogleMapController$b
            r0.<init>(r9)
            r8.L(r0)
            goto L_0x046b
        L_0x0339:
            java.lang.String r8 = "takeSnapshot"
            goto L_0x0468
        L_0x033d:
            x2.c r8 = r7.f10425q
            x2.i r8 = r8.k()
            boolean r8 = r8.b()
            goto L_0x029c
        L_0x0349:
            x2.c r8 = r7.f10425q
            if (r8 == 0) goto L_0x0351
            r9.a(r6)
            return
        L_0x0351:
            r7.A = r9
            goto L_0x046b
        L_0x0355:
            x2.c r8 = r7.f10425q
            x2.i r8 = r8.k()
            boolean r8 = r8.h()
            goto L_0x029c
        L_0x0361:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r2)
            x2.c r0 = r7.f10425q
            float r0 = r0.i()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r8.add(r0)
            x2.c r0 = r7.f10425q
            float r0 = r0.h()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r8.add(r0)
            goto L_0x0437
        L_0x0382:
            x2.c r8 = r7.f10425q
            com.google.android.gms.maps.model.CameraPosition r8 = r8.g()
            float r8 = r8.f5811n
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            goto L_0x0437
        L_0x0390:
            java.lang.Object r8 = r8.a(r4)
            io.flutter.plugins.googlemaps.s r0 = r7.D
            java.lang.String r8 = (java.lang.String) r8
            r0.g(r8, r9)
            goto L_0x046b
        L_0x039d:
            x2.c r8 = r7.f10425q
            x2.i r8 = r8.k()
            boolean r8 = r8.c()
            goto L_0x029c
        L_0x03a9:
            x2.c r8 = r7.f10425q
            x2.i r8 = r8.k()
            boolean r8 = r8.f()
            goto L_0x029c
        L_0x03b5:
            r7.e0()
            java.lang.String r0 = "polygonsToAdd"
            java.lang.Object r0 = r8.a(r0)
            java.util.List r0 = (java.util.List) r0
            io.flutter.plugins.googlemaps.w r1 = r7.E
            r1.c(r0)
            java.lang.String r0 = "polygonsToChange"
            java.lang.Object r0 = r8.a(r0)
            java.util.List r0 = (java.util.List) r0
            io.flutter.plugins.googlemaps.w r1 = r7.E
            r1.e(r0)
            java.lang.String r0 = "polygonIdsToRemove"
            java.lang.Object r8 = r8.a(r0)
            java.util.List r8 = (java.util.List) r8
            io.flutter.plugins.googlemaps.w r0 = r7.E
            r0.h(r8)
            goto L_0x01d5
        L_0x03e1:
            java.lang.Object r8 = r8.a(r0)
            java.lang.String r8 = (java.lang.String) r8
            io.flutter.plugins.googlemaps.e0 r0 = r7.H
            java.util.Map r8 = r0.g(r8)
            goto L_0x0437
        L_0x03ee:
            java.lang.Object r8 = r8.a(r4)
            io.flutter.plugins.googlemaps.s r0 = r7.D
            java.lang.String r8 = (java.lang.String) r8
            r0.h(r8, r9)
            goto L_0x046b
        L_0x03fb:
            java.lang.Object r8 = r8.a(r1)
            float r0 = r7.f10434z
            x2.a r8 = io.flutter.plugins.googlemaps.e.w(r8, r0)
            r7.S(r8)
            goto L_0x01d5
        L_0x040a:
            x2.c r0 = r7.f10425q
            if (r0 == 0) goto L_0x0423
            java.lang.Object r8 = r8.f10997b
            com.google.android.gms.maps.model.LatLng r8 = io.flutter.plugins.googlemaps.e.E(r8)
            x2.c r0 = r7.f10425q
            x2.h r0 = r0.j()
            android.graphics.Point r8 = r0.c(r8)
            java.util.Map r8 = io.flutter.plugins.googlemaps.e.o(r8)
            goto L_0x0437
        L_0x0423:
            java.lang.String r8 = "getScreenCoordinate called prior to map initialization"
            goto L_0x0468
        L_0x0426:
            java.lang.String r0 = "options"
            java.lang.Object r8 = r8.a(r0)
            io.flutter.plugins.googlemaps.e.e(r8, r7)
            com.google.android.gms.maps.model.CameraPosition r8 = r7.b0()
            java.lang.Object r8 = io.flutter.plugins.googlemaps.e.a(r8)
        L_0x0437:
            r9.a(r8)
            goto L_0x046b
        L_0x043b:
            x2.c r8 = r7.f10425q
            x2.i r8 = r8.k()
            boolean r8 = r8.d()
            goto L_0x029c
        L_0x0447:
            x2.c r8 = r7.f10425q
            x2.i r8 = r8.k()
            boolean r8 = r8.e()
            goto L_0x029c
        L_0x0453:
            x2.c r8 = r7.f10425q
            if (r8 == 0) goto L_0x0466
            x2.h r8 = r8.j()
            z2.c0 r8 = r8.b()
            com.google.android.gms.maps.model.LatLngBounds r8 = r8.f13482q
            java.lang.Object r8 = io.flutter.plugins.googlemaps.e.m(r8)
            goto L_0x0437
        L_0x0466:
            java.lang.String r8 = "getVisibleRegion called prior to map initialization"
        L_0x0468:
            r9.b(r5, r8, r6)
        L_0x046b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.googlemaps.GoogleMapController.onMethodCall(k7.j, k7.k$d):void");
    }

    public void p(z2.e eVar) {
        this.G.g(eVar.a());
    }

    public void p0(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        this.K = arrayList != null ? new ArrayList(arrayList) : null;
        if (this.f10425q != null) {
            u0();
        }
    }

    public boolean q(l lVar) {
        return this.D.m(lVar.a());
    }

    public void q0(List<Map<String, ?>> list) {
        this.M = list;
        if (this.f10425q != null) {
            v0();
        }
    }

    public void r(o oVar) {
        this.E.g(oVar.a());
    }

    public void s(androidx.lifecycle.l lVar) {
        if (!this.f10433y) {
            this.f10424p.g();
        }
    }

    public void t(int i10) {
        this.f10425q.t(i10);
    }

    public void u(boolean z9) {
        this.f10432x = z9;
    }

    public void v(LatLng latLng) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("position", e.l(latLng));
        this.f10422n.c("map#onLongPress", hashMap);
    }

    public void w(LatLng latLng) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("position", e.l(latLng));
        this.f10422n.c("map#onTap", hashMap);
    }

    public void x(boolean z9) {
        this.f10430v = z9;
    }

    public void y(boolean z9) {
        if (this.f10428t != z9) {
            this.f10428t = z9;
            if (this.f10425q != null) {
                w0();
            }
        }
    }

    public void z(boolean z9) {
        this.f10425q.k().i(z9);
    }
}
