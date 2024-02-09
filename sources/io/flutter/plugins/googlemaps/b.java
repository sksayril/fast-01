package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import z2.e;

class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final e f10446a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10447b;

    /* renamed from: c  reason: collision with root package name */
    private final float f10448c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10449d;

    b(e eVar, boolean z9, float f10) {
        this.f10446a = eVar;
        this.f10449d = z9;
        this.f10448c = f10;
        this.f10447b = eVar.a();
    }

    public void a(float f10) {
        this.f10446a.j(f10);
    }

    public void b(boolean z9) {
        this.f10449d = z9;
        this.f10446a.d(z9);
    }

    public void c(int i10) {
        this.f10446a.g(i10);
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        return this.f10449d;
    }

    public void e(int i10) {
        this.f10446a.e(i10);
    }

    public void f(float f10) {
        this.f10446a.h(f10 * this.f10448c);
    }

    public void g(double d10) {
        this.f10446a.f(d10);
    }

    public void h(LatLng latLng) {
        this.f10446a.c(latLng);
    }

    /* access modifiers changed from: package-private */
    public String i() {
        return this.f10447b;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        this.f10446a.b();
    }

    public void setVisible(boolean z9) {
        this.f10446a.i(z9);
    }
}
