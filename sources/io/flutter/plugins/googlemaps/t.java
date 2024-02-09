package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import z2.p;

class t implements v {

    /* renamed from: a  reason: collision with root package name */
    private final p f10505a = new p();

    /* renamed from: b  reason: collision with root package name */
    private final float f10506b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10507c;

    t(float f10) {
        this.f10506b = f10;
    }

    public void a(float f10) {
        this.f10505a.J(f10);
    }

    public void b(boolean z9) {
        this.f10507c = z9;
        this.f10505a.g(z9);
    }

    public void c(int i10) {
        this.f10505a.G(i10);
    }

    public void d(boolean z9) {
        this.f10505a.k(z9);
    }

    public void e(int i10) {
        this.f10505a.i(i10);
    }

    public void f(float f10) {
        this.f10505a.H(f10 * this.f10506b);
    }

    public void g(List<LatLng> list) {
        this.f10505a.d(list);
    }

    public void h(List<List<LatLng>> list) {
        for (List<LatLng> f10 : list) {
            this.f10505a.f(f10);
        }
    }

    /* access modifiers changed from: package-private */
    public p i() {
        return this.f10505a;
    }

    /* access modifiers changed from: package-private */
    public boolean j() {
        return this.f10507c;
    }

    public void setVisible(boolean z9) {
        this.f10505a.I(z9);
    }
}
