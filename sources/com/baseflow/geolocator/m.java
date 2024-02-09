package com.baseflow.geolocator;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import c1.c;
import d1.k;
import d1.p;
import d1.s;
import e1.b;
import java.util.Map;
import k7.d;

class m implements d.C0170d {

    /* renamed from: m  reason: collision with root package name */
    private final b f4832m;

    /* renamed from: n  reason: collision with root package name */
    private d f4833n;

    /* renamed from: o  reason: collision with root package name */
    private Context f4834o;

    /* renamed from: p  reason: collision with root package name */
    private Activity f4835p;

    /* renamed from: q  reason: collision with root package name */
    private GeolocatorLocationService f4836q;

    /* renamed from: r  reason: collision with root package name */
    private k f4837r = new k();

    /* renamed from: s  reason: collision with root package name */
    private p f4838s;

    public m(b bVar) {
        this.f4832m = bVar;
    }

    private void e(boolean z9) {
        k kVar;
        Log.e("FlutterGeolocator", "Geolocator position updates stopped");
        GeolocatorLocationService geolocatorLocationService = this.f4836q;
        if (geolocatorLocationService == null || !geolocatorLocationService.c(z9)) {
            Log.e("FlutterGeolocator", "There is still another flutter engine connected, not stopping location service");
        } else {
            this.f4836q.o();
            this.f4836q.e();
        }
        p pVar = this.f4838s;
        if (pVar != null && (kVar = this.f4837r) != null) {
            kVar.f(pVar);
            this.f4838s = null;
        }
    }

    public void a(Object obj, d.b bVar) {
        d1.d dVar = null;
        try {
            if (!this.f4832m.d(this.f4834o)) {
                c1.b bVar2 = c1.b.permissionDenied;
                bVar.b(bVar2.toString(), bVar2.toDescription(), (Object) null);
            } else if (this.f4836q == null) {
                Log.e("FlutterGeolocator", "Location background service has not started correctly");
            } else {
                Map map = (Map) obj;
                boolean z9 = false;
                if (!(map == null || map.get("forceLocationManager") == null)) {
                    z9 = ((Boolean) map.get("forceLocationManager")).booleanValue();
                }
                s e10 = s.e(map);
                if (map != null) {
                    dVar = d1.d.g((Map) map.get("foregroundNotificationConfig"));
                }
                if (dVar != null) {
                    Log.e("FlutterGeolocator", "Geolocator position updates started using Android foreground service");
                    this.f4836q.n(z9, e10, bVar);
                    this.f4836q.f(dVar);
                    return;
                }
                Log.e("FlutterGeolocator", "Geolocator position updates started");
                p a10 = this.f4837r.a(this.f4834o, Boolean.TRUE.equals(Boolean.valueOf(z9)), e10);
                this.f4838s = a10;
                this.f4837r.e(a10, this.f4835p, new l(bVar), new k(bVar));
            }
        } catch (c unused) {
            c1.b bVar3 = c1.b.permissionDefinitionsNotFound;
            bVar.b(bVar3.toString(), bVar3.toDescription(), (Object) null);
        }
    }

    public void b(Object obj) {
        e(true);
    }

    public void h(Activity activity) {
        if (!(activity != null || this.f4838s == null || this.f4833n == null)) {
            k();
        }
        this.f4835p = activity;
    }

    public void i(GeolocatorLocationService geolocatorLocationService) {
        this.f4836q = geolocatorLocationService;
    }

    /* access modifiers changed from: package-private */
    public void j(Context context, k7.c cVar) {
        if (this.f4833n != null) {
            Log.w("FlutterGeolocator", "Setting a event call handler before the last was disposed.");
            k();
        }
        d dVar = new d(cVar, "flutter.baseflow.com/geolocator_updates_android");
        this.f4833n = dVar;
        dVar.d(this);
        this.f4834o = context;
    }

    /* access modifiers changed from: package-private */
    public void k() {
        if (this.f4833n == null) {
            Log.d("FlutterGeolocator", "Tried to stop listening when no MethodChannel had been initialized.");
            return;
        }
        e(false);
        this.f4833n.d((d.C0170d) null);
        this.f4833n = null;
    }
}
