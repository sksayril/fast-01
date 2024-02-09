package com.baseflow.geolocator;

import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import d1.u;
import k7.c;
import k7.d;

public class b implements d.C0170d {

    /* renamed from: m  reason: collision with root package name */
    private d f4805m;

    /* renamed from: n  reason: collision with root package name */
    private Context f4806n;

    /* renamed from: o  reason: collision with root package name */
    private u f4807o;

    private void c() {
        u uVar;
        Context context = this.f4806n;
        if (context != null && (uVar = this.f4807o) != null) {
            context.unregisterReceiver(uVar);
        }
    }

    public void a(Object obj, d.b bVar) {
        if (this.f4806n != null) {
            IntentFilter intentFilter = new IntentFilter("android.location.PROVIDERS_CHANGED");
            intentFilter.addAction("android.intent.action.PROVIDER_CHANGED");
            u uVar = new u(bVar);
            this.f4807o = uVar;
            this.f4806n.registerReceiver(uVar, intentFilter);
        }
    }

    public void b(Object obj) {
        c();
    }

    /* access modifiers changed from: package-private */
    public void d(Context context) {
        this.f4806n = context;
    }

    /* access modifiers changed from: package-private */
    public void e(Context context, c cVar) {
        if (this.f4805m != null) {
            Log.w("LocationServiceHandler", "Setting a event call handler before the last was disposed.");
            f();
        }
        d dVar = new d(cVar, "flutter.baseflow.com/geolocator_service_updates_android");
        this.f4805m = dVar;
        dVar.d(this);
        this.f4806n = context;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        if (this.f4805m != null) {
            c();
            this.f4805m.d((d.C0170d) null);
            this.f4805m = null;
        }
    }
}
