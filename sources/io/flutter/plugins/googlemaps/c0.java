package io.flutter.plugins.googlemaps;

import java.util.HashMap;
import java.util.Map;
import z2.z;

class c0 implements d0 {

    /* renamed from: a  reason: collision with root package name */
    private final z f10451a;

    c0(z zVar) {
        this.f10451a = zVar;
    }

    public void a(float f10) {
        this.f10451a.k(f10);
    }

    public void b(boolean z9) {
        this.f10451a.h(z9);
    }

    public void c(float f10) {
        this.f10451a.i(f10);
    }

    /* access modifiers changed from: package-private */
    public void d() {
        this.f10451a.a();
    }

    /* access modifiers changed from: package-private */
    public Map<String, Object> e() {
        HashMap hashMap = new HashMap();
        hashMap.put("fadeIn", Boolean.valueOf(this.f10451a.b()));
        hashMap.put("transparency", Float.valueOf(this.f10451a.d()));
        hashMap.put("id", this.f10451a.c());
        hashMap.put("zIndex", Float.valueOf(this.f10451a.e()));
        hashMap.put("visible", Boolean.valueOf(this.f10451a.f()));
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f10451a.g();
    }

    public void setVisible(boolean z9) {
        this.f10451a.j(z9);
    }
}
