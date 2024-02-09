package com.baseflow.geolocator;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import c7.a;
import com.baseflow.geolocator.GeolocatorLocationService;
import d1.k;
import d1.m;
import d7.c;
import e1.b;
import k7.o;

public class a implements c7.a, d7.a {

    /* renamed from: m  reason: collision with root package name */
    private final b f4794m = new b();

    /* renamed from: n  reason: collision with root package name */
    private final k f4795n = new k();

    /* renamed from: o  reason: collision with root package name */
    private final m f4796o = new m();
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public GeolocatorLocationService f4797p;

    /* renamed from: q  reason: collision with root package name */
    private j f4798q;

    /* renamed from: r  reason: collision with root package name */
    private m f4799r;

    /* renamed from: s  reason: collision with root package name */
    private final ServiceConnection f4800s = new C0086a();

    /* renamed from: t  reason: collision with root package name */
    private b f4801t;

    /* renamed from: u  reason: collision with root package name */
    private o f4802u;

    /* renamed from: v  reason: collision with root package name */
    private c f4803v;

    /* renamed from: com.baseflow.geolocator.a$a  reason: collision with other inner class name */
    class C0086a implements ServiceConnection {
        C0086a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            x6.b.a("FlutterGeolocator", "Geolocator foreground service connected");
            if (iBinder instanceof GeolocatorLocationService.a) {
                a.this.g(((GeolocatorLocationService.a) iBinder).a());
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            x6.b.a("FlutterGeolocator", "Geolocator foreground service disconnected");
            if (a.this.f4797p != null) {
                a.this.f4797p.m((Activity) null);
                GeolocatorLocationService unused = a.this.f4797p = null;
            }
        }
    }

    private void d(Context context) {
        context.bindService(new Intent(context, GeolocatorLocationService.class), this.f4800s, 1);
    }

    private void e() {
        c cVar = this.f4803v;
        if (cVar != null) {
            cVar.g(this.f4795n);
            this.f4803v.f(this.f4794m);
        }
    }

    private void f() {
        x6.b.a("FlutterGeolocator", "Disposing Geolocator services");
        j jVar = this.f4798q;
        if (jVar != null) {
            jVar.x();
            this.f4798q.v((Activity) null);
            this.f4798q = null;
        }
        m mVar = this.f4799r;
        if (mVar != null) {
            mVar.k();
            this.f4799r.i((GeolocatorLocationService) null);
            this.f4799r = null;
        }
        b bVar = this.f4801t;
        if (bVar != null) {
            bVar.d((Context) null);
            this.f4801t.f();
            this.f4801t = null;
        }
        GeolocatorLocationService geolocatorLocationService = this.f4797p;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.m((Activity) null);
        }
    }

    /* access modifiers changed from: private */
    public void g(GeolocatorLocationService geolocatorLocationService) {
        x6.b.a("FlutterGeolocator", "Initializing Geolocator services");
        this.f4797p = geolocatorLocationService;
        geolocatorLocationService.g();
        m mVar = this.f4799r;
        if (mVar != null) {
            mVar.i(geolocatorLocationService);
        }
    }

    private void h() {
        o oVar = this.f4802u;
        if (oVar != null) {
            oVar.c(this.f4795n);
            this.f4802u.b(this.f4794m);
            return;
        }
        c cVar = this.f4803v;
        if (cVar != null) {
            cVar.c(this.f4795n);
            this.f4803v.b(this.f4794m);
        }
    }

    private void i(Context context) {
        GeolocatorLocationService geolocatorLocationService = this.f4797p;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.h();
        }
        context.unbindService(this.f4800s);
    }

    public void onAttachedToActivity(c cVar) {
        x6.b.a("FlutterGeolocator", "Attaching Geolocator to activity");
        this.f4803v = cVar;
        h();
        j jVar = this.f4798q;
        if (jVar != null) {
            jVar.v(cVar.d());
        }
        m mVar = this.f4799r;
        if (mVar != null) {
            mVar.h(cVar.d());
        }
        GeolocatorLocationService geolocatorLocationService = this.f4797p;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.m(this.f4803v.d());
        }
    }

    public void onAttachedToEngine(a.b bVar) {
        j jVar = new j(this.f4794m, this.f4795n, this.f4796o);
        this.f4798q = jVar;
        jVar.w(bVar.a(), bVar.b());
        m mVar = new m(this.f4794m);
        this.f4799r = mVar;
        mVar.j(bVar.a(), bVar.b());
        b bVar2 = new b();
        this.f4801t = bVar2;
        bVar2.d(bVar.a());
        this.f4801t.e(bVar.a(), bVar.b());
        d(bVar.a());
    }

    public void onDetachedFromActivity() {
        x6.b.a("FlutterGeolocator", "Detaching Geolocator from activity");
        e();
        j jVar = this.f4798q;
        if (jVar != null) {
            jVar.v((Activity) null);
        }
        m mVar = this.f4799r;
        if (mVar != null) {
            mVar.h((Activity) null);
        }
        GeolocatorLocationService geolocatorLocationService = this.f4797p;
        if (geolocatorLocationService != null) {
            geolocatorLocationService.m((Activity) null);
        }
        if (this.f4803v != null) {
            this.f4803v = null;
        }
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onDetachedFromEngine(a.b bVar) {
        i(bVar.a());
        f();
    }

    public void onReattachedToActivityForConfigChanges(c cVar) {
        onAttachedToActivity(cVar);
    }
}
