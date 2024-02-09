package io.flutter.plugins.googlemaps;

import android.content.Context;
import android.graphics.Rect;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
import java.util.Map;
import k7.c;

class f implements m {

    /* renamed from: m  reason: collision with root package name */
    private final GoogleMapOptions f10460m = new GoogleMapOptions();

    /* renamed from: n  reason: collision with root package name */
    private boolean f10461n = false;

    /* renamed from: o  reason: collision with root package name */
    private boolean f10462o = false;

    /* renamed from: p  reason: collision with root package name */
    private boolean f10463p = false;

    /* renamed from: q  reason: collision with root package name */
    private boolean f10464q = true;

    /* renamed from: r  reason: collision with root package name */
    private boolean f10465r = false;

    /* renamed from: s  reason: collision with root package name */
    private boolean f10466s = true;

    /* renamed from: t  reason: collision with root package name */
    private Object f10467t;

    /* renamed from: u  reason: collision with root package name */
    private Object f10468u;

    /* renamed from: v  reason: collision with root package name */
    private Object f10469v;

    /* renamed from: w  reason: collision with root package name */
    private Object f10470w;

    /* renamed from: x  reason: collision with root package name */
    private List<Map<String, ?>> f10471x;

    /* renamed from: y  reason: collision with root package name */
    private Rect f10472y = new Rect(0, 0, 0, 0);

    f() {
    }

    public void A(boolean z9) {
        this.f10460m.E(z9);
    }

    public void H(boolean z9) {
        this.f10460m.J(z9);
    }

    public void L(boolean z9) {
        this.f10460m.K(z9);
    }

    public void M(boolean z9) {
        this.f10462o = z9;
    }

    public void N(boolean z9) {
        this.f10460m.M(z9);
    }

    public void Q(boolean z9) {
        this.f10460m.L(z9);
    }

    public void R(boolean z9) {
        this.f10465r = z9;
    }

    public void V(boolean z9) {
        this.f10460m.I(z9);
    }

    public void W(float f10, float f11, float f12, float f13) {
        this.f10472y = new Rect((int) f11, (int) f10, (int) f13, (int) f12);
    }

    public void X(boolean z9) {
        this.f10461n = z9;
    }

    public void Y(boolean z9) {
        this.f10460m.C(z9);
    }

    public void Z(LatLngBounds latLngBounds) {
        this.f10460m.B(latLngBounds);
    }

    /* access modifiers changed from: package-private */
    public GoogleMapController a(int i10, Context context, c cVar, o oVar) {
        GoogleMapController googleMapController = new GoogleMapController(i10, context, cVar, oVar, this.f10460m);
        googleMapController.d0();
        googleMapController.M(this.f10462o);
        googleMapController.y(this.f10463p);
        googleMapController.x(this.f10464q);
        googleMapController.R(this.f10465r);
        googleMapController.u(this.f10466s);
        googleMapController.X(this.f10461n);
        googleMapController.m0(this.f10467t);
        googleMapController.o0(this.f10468u);
        googleMapController.p0(this.f10469v);
        googleMapController.l0(this.f10470w);
        Rect rect = this.f10472y;
        googleMapController.W((float) rect.top, (float) rect.left, (float) rect.bottom, (float) rect.right);
        googleMapController.q0(this.f10471x);
        return googleMapController;
    }

    public void a0(Float f10, Float f11) {
        if (f10 != null) {
            this.f10460m.H(f10.floatValue());
        }
        if (f11 != null) {
            this.f10460m.G(f11.floatValue());
        }
    }

    /* access modifiers changed from: package-private */
    public void b(CameraPosition cameraPosition) {
        this.f10460m.d(cameraPosition);
    }

    public void c(Object obj) {
        this.f10470w = obj;
    }

    public void d(Object obj) {
        this.f10467t = obj;
    }

    public void e(Object obj) {
        this.f10468u = obj;
    }

    public void f(Object obj) {
        this.f10469v = obj;
    }

    public void g(List<Map<String, ?>> list) {
        this.f10471x = list;
    }

    public void h(String str) {
        this.f10460m.D(str);
    }

    public void t(int i10) {
        this.f10460m.F(i10);
    }

    public void u(boolean z9) {
        this.f10466s = z9;
    }

    public void x(boolean z9) {
        this.f10464q = z9;
    }

    public void y(boolean z9) {
        this.f10463p = z9;
    }

    public void z(boolean z9) {
        this.f10460m.f(z9);
    }
}
