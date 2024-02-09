package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import z2.d;
import z2.n;
import z2.r;

class x implements z {

    /* renamed from: a  reason: collision with root package name */
    private final r f10517a = new r();

    /* renamed from: b  reason: collision with root package name */
    private boolean f10518b;

    /* renamed from: c  reason: collision with root package name */
    private final float f10519c;

    x(float f10) {
        this.f10519c = f10;
    }

    public void a(float f10) {
        this.f10517a.M(f10);
    }

    public void b(boolean z9) {
        this.f10518b = z9;
        this.f10517a.f(z9);
    }

    public void c(List<n> list) {
        this.f10517a.I(list);
    }

    public void d(boolean z9) {
        this.f10517a.k(z9);
    }

    public void e(int i10) {
        this.f10517a.H(i10);
    }

    public void f(float f10) {
        this.f10517a.L(f10 * this.f10519c);
    }

    public void g(List<LatLng> list) {
        this.f10517a.d(list);
    }

    public void h(d dVar) {
        this.f10517a.i(dVar);
    }

    public void i(int i10) {
        this.f10517a.g(i10);
    }

    public void j(d dVar) {
        this.f10517a.J(dVar);
    }

    /* access modifiers changed from: package-private */
    public r k() {
        return this.f10517a;
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return this.f10518b;
    }

    public void setVisible(boolean z9) {
        this.f10517a.K(z9);
    }
}
