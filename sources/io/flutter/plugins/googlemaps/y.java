package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import z2.d;
import z2.n;
import z2.q;

class y implements z {

    /* renamed from: a  reason: collision with root package name */
    private final q f10520a;

    /* renamed from: b  reason: collision with root package name */
    private final String f10521b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10522c;

    /* renamed from: d  reason: collision with root package name */
    private final float f10523d;

    y(q qVar, boolean z9, float f10) {
        this.f10520a = qVar;
        this.f10522c = z9;
        this.f10523d = f10;
        this.f10521b = qVar.a();
    }

    public void a(float f10) {
        this.f10520a.m(f10);
    }

    public void b(boolean z9) {
        this.f10522c = z9;
        this.f10520a.c(z9);
    }

    public void c(List<n> list) {
        this.f10520a.h(list);
    }

    public void d(boolean z9) {
        this.f10520a.f(z9);
    }

    public void e(int i10) {
        this.f10520a.g(i10);
    }

    public void f(float f10) {
        this.f10520a.l(f10 * this.f10523d);
    }

    public void g(List<LatLng> list) {
        this.f10520a.i(list);
    }

    public void h(d dVar) {
        this.f10520a.e(dVar);
    }

    public void i(int i10) {
        this.f10520a.d(i10);
    }

    public void j(d dVar) {
        this.f10520a.j(dVar);
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.f10522c;
    }

    /* access modifiers changed from: package-private */
    public String l() {
        return this.f10521b;
    }

    /* access modifiers changed from: package-private */
    public void m() {
        this.f10520a.b();
    }

    public void setVisible(boolean z9) {
        this.f10520a.k(z9);
    }
}
