package com.baseflow.geolocator;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.util.Log;
import c1.c;
import d1.m;
import d1.n;
import d1.p;
import d1.r;
import d1.s;
import e1.b;
import f1.a;
import java.util.HashMap;
import java.util.Map;
import k7.k;

class j implements k.c {

    /* renamed from: m  reason: collision with root package name */
    private final b f4823m;

    /* renamed from: n  reason: collision with root package name */
    private final d1.k f4824n;

    /* renamed from: o  reason: collision with root package name */
    private final m f4825o;

    /* renamed from: p  reason: collision with root package name */
    final Map<String, p> f4826p = new HashMap();

    /* renamed from: q  reason: collision with root package name */
    private Context f4827q;

    /* renamed from: r  reason: collision with root package name */
    private Activity f4828r;

    /* renamed from: s  reason: collision with root package name */
    private k f4829s;

    j(b bVar, d1.k kVar, m mVar) {
        this.f4823m = bVar;
        this.f4824n = kVar;
        this.f4825o = mVar;
    }

    private void h(k.d dVar, Context context) {
        n a10 = this.f4825o.a(context, new d(dVar));
        if (a10 != null) {
            dVar.a(Integer.valueOf(a10.ordinal()));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void j(boolean[] zArr, p pVar, String str, k.d dVar, Location location) {
        if (!zArr[0]) {
            zArr[0] = true;
            this.f4824n.f(pVar);
            this.f4826p.remove(str);
            dVar.a(r.b(location));
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void k(boolean[] zArr, p pVar, String str, k.d dVar, c1.b bVar) {
        if (!zArr[0]) {
            zArr[0] = true;
            this.f4824n.f(pVar);
            this.f4826p.remove(str);
            dVar.b(bVar.toString(), bVar.toDescription(), (Object) null);
        }
    }

    private void p(k7.j jVar, k.d dVar) {
        String str = (String) ((Map) jVar.f10997b).get("requestId");
        p pVar = this.f4826p.get(str);
        if (pVar != null) {
            pVar.e();
        }
        this.f4826p.remove(str);
        dVar.a((Object) null);
    }

    private void q(k.d dVar) {
        try {
            dVar.a(Integer.valueOf(this.f4823m.a(this.f4827q).toInt()));
        } catch (c unused) {
            c1.b bVar = c1.b.permissionDefinitionsNotFound;
            dVar.b(bVar.toString(), bVar.toDescription(), (Object) null);
        }
    }

    private void r(k7.j jVar, k.d dVar) {
        try {
            if (!this.f4823m.d(this.f4827q)) {
                c1.b bVar = c1.b.permissionDenied;
                dVar.b(bVar.toString(), bVar.toDescription(), (Object) null);
                return;
            }
            Map map = (Map) jVar.f10997b;
            boolean booleanValue = map.get("forceLocationManager") != null ? ((Boolean) map.get("forceLocationManager")).booleanValue() : false;
            s e10 = s.e(map);
            String str = (String) map.get("requestId");
            p a10 = this.f4824n.a(this.f4827q, booleanValue, e10);
            this.f4826p.put(str, a10);
            boolean[] zArr = {false};
            p pVar = a10;
            String str2 = str;
            k.d dVar2 = dVar;
            this.f4824n.e(a10, this.f4828r, new g(this, zArr, pVar, str2, dVar2), new c(this, zArr, pVar, str2, dVar2));
        } catch (c unused) {
            c1.b bVar2 = c1.b.permissionDefinitionsNotFound;
            dVar.b(bVar2.toString(), bVar2.toDescription(), (Object) null);
        }
    }

    private void s(k7.j jVar, k.d dVar) {
        try {
            if (!this.f4823m.d(this.f4827q)) {
                c1.b bVar = c1.b.permissionDenied;
                dVar.b(bVar.toString(), bVar.toDescription(), (Object) null);
                return;
            }
            Boolean bool = (Boolean) jVar.a("forceLocationManager");
            this.f4824n.b(this.f4827q, bool != null && bool.booleanValue(), new h(dVar), new f(dVar));
        } catch (c unused) {
            c1.b bVar2 = c1.b.permissionDefinitionsNotFound;
            dVar.b(bVar2.toString(), bVar2.toDescription(), (Object) null);
        }
    }

    private void t(k.d dVar) {
        this.f4824n.d(this.f4827q, new d1.c(dVar));
    }

    private void u(k.d dVar) {
        try {
            this.f4823m.f(this.f4828r, new i(dVar), new e(dVar));
        } catch (c unused) {
            c1.b bVar = c1.b.permissionDefinitionsNotFound;
            dVar.b(bVar.toString(), bVar.toDescription(), (Object) null);
        }
    }

    public void onMethodCall(k7.j jVar, k.d dVar) {
        boolean b10;
        String str = jVar.f10996a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1757019252:
                if (str.equals("getCurrentPosition")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1156770336:
                if (str.equals("getLastKnownPosition")) {
                    c10 = 1;
                    break;
                }
                break;
            case -821636766:
                if (str.equals("openLocationSettings")) {
                    c10 = 2;
                    break;
                }
                break;
            case 347240634:
                if (str.equals("openAppSettings")) {
                    c10 = 3;
                    break;
                }
                break;
            case 356040619:
                if (str.equals("isLocationServiceEnabled")) {
                    c10 = 4;
                    break;
                }
                break;
            case 686218487:
                if (str.equals("checkPermission")) {
                    c10 = 5;
                    break;
                }
                break;
            case 746581438:
                if (str.equals("requestPermission")) {
                    c10 = 6;
                    break;
                }
                break;
            case 877043524:
                if (str.equals("getLocationAccuracy")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1774650278:
                if (str.equals("cancelGetCurrentPosition")) {
                    c10 = 8;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                r(jVar, dVar);
                return;
            case 1:
                s(jVar, dVar);
                return;
            case 2:
                b10 = a.b(this.f4827q);
                break;
            case 3:
                b10 = a.a(this.f4827q);
                break;
            case 4:
                t(dVar);
                return;
            case 5:
                q(dVar);
                return;
            case 6:
                u(dVar);
                return;
            case 7:
                h(dVar, this.f4827q);
                return;
            case 8:
                p(jVar, dVar);
                return;
            default:
                dVar.c();
                return;
        }
        dVar.a(Boolean.valueOf(b10));
    }

    /* access modifiers changed from: package-private */
    public void v(Activity activity) {
        this.f4828r = activity;
    }

    /* access modifiers changed from: package-private */
    public void w(Context context, k7.c cVar) {
        if (this.f4829s != null) {
            Log.w("MethodCallHandlerImpl", "Setting a method call handler before the last was disposed.");
            x();
        }
        k kVar = new k(cVar, "flutter.baseflow.com/geolocator_android");
        this.f4829s = kVar;
        kVar.e(this);
        this.f4827q = context;
    }

    /* access modifiers changed from: package-private */
    public void x() {
        k kVar = this.f4829s;
        if (kVar == null) {
            Log.d("MethodCallHandlerImpl", "Tried to stop listening when no MethodChannel had been initialized.");
            return;
        }
        kVar.e((k.c) null);
        this.f4829s = null;
    }
}
