package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import z2.f;

class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final f f10438a = new f();

    /* renamed from: b  reason: collision with root package name */
    private final float f10439b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10440c;

    a(float f10) {
        this.f10439b = f10;
    }

    public void a(float f10) {
        this.f10438a.H(f10);
    }

    public void b(boolean z9) {
        this.f10440c = z9;
        this.f10438a.f(z9);
    }

    public void c(int i10) {
        this.f10438a.E(i10);
    }

    /* access modifiers changed from: package-private */
    public f d() {
        return this.f10438a;
    }

    public void e(int i10) {
        this.f10438a.g(i10);
    }

    public void f(float f10) {
        this.f10438a.F(f10 * this.f10439b);
    }

    public void g(double d10) {
        this.f10438a.D(d10);
    }

    public void h(LatLng latLng) {
        this.f10438a.d(latLng);
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return this.f10440c;
    }

    public void setVisible(boolean z9) {
        this.f10438a.G(z9);
    }
}
