package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import z2.o;

class u implements v {

    /* renamed from: a  reason: collision with root package name */
    private final o f10508a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10509b;

    /* renamed from: c  reason: collision with root package name */
    private final float f10510c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10511d;

    u(o oVar, boolean z9, float f10) {
        this.f10508a = oVar;
        this.f10510c = f10;
        this.f10511d = z9;
        this.f10509b = oVar.a();
    }

    public void a(float f10) {
        this.f10508a.k(f10);
    }

    public void b(boolean z9) {
        this.f10511d = z9;
        this.f10508a.c(z9);
    }

    public void c(int i10) {
        this.f10508a.h(i10);
    }

    public void d(boolean z9) {
        this.f10508a.e(z9);
    }

    public void e(int i10) {
        this.f10508a.d(i10);
    }

    public void f(float f10) {
        this.f10508a.i(f10 * this.f10510c);
    }

    public void g(List<LatLng> list) {
        this.f10508a.g(list);
    }

    public void h(List<List<LatLng>> list) {
        this.f10508a.f(list);
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return this.f10511d;
    }

    /* access modifiers changed from: package-private */
    public String j() {
        return this.f10509b;
    }

    /* access modifiers changed from: package-private */
    public void k() {
        this.f10508a.b();
    }

    public void setVisible(boolean z9) {
        this.f10508a.j(z9);
    }
}
