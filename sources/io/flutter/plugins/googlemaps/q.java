package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import z2.a;
import z2.l;

class q implements r {

    /* renamed from: a  reason: collision with root package name */
    private final l f10498a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10499b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10500c;

    q(l lVar, boolean z9) {
        this.f10498a = lVar;
        this.f10500c = z9;
        this.f10499b = lVar.a();
    }

    public void a(float f10) {
        this.f10498a.q(f10);
    }

    public void b(boolean z9) {
        this.f10500c = z9;
    }

    public void c(float f10) {
        this.f10498a.f(f10);
    }

    public void d(boolean z9) {
        this.f10498a.h(z9);
    }

    public void e(boolean z9) {
        this.f10498a.i(z9);
    }

    public void f(float f10, float f11) {
        this.f10498a.k(f10, f11);
    }

    public void g(float f10) {
        this.f10498a.m(f10);
    }

    public void h(float f10, float f11) {
        this.f10498a.g(f10, f11);
    }

    public void i(LatLng latLng) {
        this.f10498a.l(latLng);
    }

    public void j(a aVar) {
        this.f10498a.j(aVar);
    }

    public void k(String str, String str2) {
        this.f10498a.o(str);
        this.f10498a.n(str2);
    }

    /* access modifiers changed from: package-private */
    public boolean l() {
        return this.f10500c;
    }

    /* access modifiers changed from: package-private */
    public String m() {
        return this.f10499b;
    }

    public void n() {
        this.f10498a.c();
    }

    public boolean o() {
        return this.f10498a.d();
    }

    /* access modifiers changed from: package-private */
    public void p() {
        this.f10498a.e();
    }

    public void q() {
        this.f10498a.r();
    }

    public void setVisible(boolean z9) {
        this.f10498a.p(z9);
    }
}
