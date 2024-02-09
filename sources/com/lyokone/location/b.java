package com.lyokone.location;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import c7.a;
import com.lyokone.location.FlutterLocationService;
import d7.c;

public class b implements c7.a, d7.a {

    /* renamed from: m  reason: collision with root package name */
    private c f7645m;

    /* renamed from: n  reason: collision with root package name */
    private d f7646n;

    /* renamed from: o  reason: collision with root package name */
    private FlutterLocationService f7647o;

    /* renamed from: p  reason: collision with root package name */
    private c f7648p;

    /* renamed from: q  reason: collision with root package name */
    private final ServiceConnection f7649q = new a();

    class a implements ServiceConnection {
        a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d("LocationPlugin", "Service connected: " + componentName);
            b.this.e(((FlutterLocationService.b) iBinder).a());
        }

        public void onServiceDisconnected(ComponentName componentName) {
            Log.d("LocationPlugin", "Service disconnected:" + componentName);
        }
    }

    private void b(c cVar) {
        this.f7648p = cVar;
        cVar.d().bindService(new Intent(cVar.d(), FlutterLocationService.class), this.f7649q, 1);
    }

    private void c() {
        d();
        this.f7648p.d().unbindService(this.f7649q);
        this.f7648p = null;
    }

    private void d() {
        this.f7646n.c((a) null);
        this.f7645m.j((FlutterLocationService) null);
        this.f7645m.i((a) null);
        this.f7648p.f(this.f7647o.h());
        this.f7648p.f(this.f7647o.g());
        this.f7648p.g(this.f7647o.f());
        this.f7647o.k((Activity) null);
        this.f7647o = null;
    }

    /* access modifiers changed from: private */
    public void e(FlutterLocationService flutterLocationService) {
        this.f7647o = flutterLocationService;
        flutterLocationService.k(this.f7648p.d());
        this.f7648p.c(this.f7647o.f());
        this.f7648p.b(this.f7647o.g());
        this.f7648p.b(this.f7647o.h());
        this.f7645m.i(this.f7647o.e());
        this.f7645m.j(this.f7647o);
        this.f7646n.c(this.f7647o.e());
    }

    public void onAttachedToActivity(c cVar) {
        b(cVar);
    }

    public void onAttachedToEngine(a.b bVar) {
        c cVar = new c();
        this.f7645m = cVar;
        cVar.k(bVar.b());
        d dVar = new d();
        this.f7646n = dVar;
        dVar.d(bVar.b());
    }

    public void onDetachedFromActivity() {
        c();
    }

    public void onDetachedFromActivityForConfigChanges() {
        c();
    }

    public void onDetachedFromEngine(a.b bVar) {
        c cVar = this.f7645m;
        if (cVar != null) {
            cVar.l();
            this.f7645m = null;
        }
        d dVar = this.f7646n;
        if (dVar != null) {
            dVar.e();
            this.f7646n = null;
        }
    }

    public void onReattachedToActivityForConfigChanges(c cVar) {
        b(cVar);
    }
}
