package com.baseflow.geolocator;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Service;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import d1.b;
import d1.d;
import d1.k;
import d1.p;
import d1.s;
import k7.d;

public class GeolocatorLocationService extends Service {

    /* renamed from: m  reason: collision with root package name */
    private final String f4780m = "GeolocatorLocationService:Wakelock";

    /* renamed from: n  reason: collision with root package name */
    private final String f4781n = "GeolocatorLocationService:WifiLock";

    /* renamed from: o  reason: collision with root package name */
    private final a f4782o = new a(this);

    /* renamed from: p  reason: collision with root package name */
    private boolean f4783p = false;

    /* renamed from: q  reason: collision with root package name */
    private int f4784q = 0;

    /* renamed from: r  reason: collision with root package name */
    private int f4785r = 0;

    /* renamed from: s  reason: collision with root package name */
    private Activity f4786s = null;

    /* renamed from: t  reason: collision with root package name */
    private k f4787t = null;

    /* renamed from: u  reason: collision with root package name */
    private p f4788u;

    /* renamed from: v  reason: collision with root package name */
    private PowerManager.WakeLock f4789v = null;

    /* renamed from: w  reason: collision with root package name */
    private WifiManager.WifiLock f4790w = null;

    /* renamed from: x  reason: collision with root package name */
    private b f4791x = null;

    class a extends Binder {

        /* renamed from: c  reason: collision with root package name */
        private final GeolocatorLocationService f4792c;

        a(GeolocatorLocationService geolocatorLocationService) {
            this.f4792c = geolocatorLocationService;
        }

        public GeolocatorLocationService a() {
            return this.f4792c;
        }
    }

    @SuppressLint({"WakelockTimeout"})
    private void k(d dVar) {
        WifiManager wifiManager;
        PowerManager powerManager;
        l();
        if (dVar.d() && (powerManager = (PowerManager) getApplicationContext().getSystemService("power")) != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "GeolocatorLocationService:Wakelock");
            this.f4789v = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            this.f4789v.acquire();
        }
        if (dVar.e() && (wifiManager = (WifiManager) getApplicationContext().getSystemService("wifi")) != null) {
            WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "GeolocatorLocationService:WifiLock");
            this.f4790w = createWifiLock;
            createWifiLock.setReferenceCounted(false);
            this.f4790w.acquire();
        }
    }

    private void l() {
        PowerManager.WakeLock wakeLock = this.f4789v;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.f4789v.release();
            this.f4789v = null;
        }
        WifiManager.WifiLock wifiLock = this.f4790w;
        if (wifiLock != null && wifiLock.isHeld()) {
            this.f4790w.release();
            this.f4790w = null;
        }
    }

    public boolean c(boolean z9) {
        return z9 ? this.f4785r == 1 : this.f4784q == 0;
    }

    public void d(d dVar) {
        b bVar = this.f4791x;
        if (bVar != null) {
            bVar.f(dVar, this.f4783p);
            k(dVar);
        }
    }

    public void e() {
        if (this.f4783p) {
            Log.d("FlutterGeolocator", "Stop service in foreground.");
            if (Build.VERSION.SDK_INT >= 24) {
                stopForeground(1);
            } else {
                stopForeground(true);
            }
            l();
            this.f4783p = false;
            this.f4791x = null;
        }
    }

    public void f(d dVar) {
        if (this.f4791x != null) {
            Log.d("FlutterGeolocator", "Service already in foreground mode.");
            d(dVar);
        } else {
            Log.d("FlutterGeolocator", "Start service in foreground mode.");
            b bVar = new b(getApplicationContext(), "geolocator_channel_01", 75415, dVar);
            this.f4791x = bVar;
            bVar.d("Background Location");
            startForeground(75415, this.f4791x.a());
            this.f4783p = true;
        }
        k(dVar);
    }

    public void g() {
        this.f4784q++;
        Log.d("FlutterGeolocator", "Flutter engine connected. Connected engine count " + this.f4784q);
    }

    public void h() {
        this.f4784q--;
        Log.d("FlutterGeolocator", "Flutter engine disconnected. Connected engine count " + this.f4784q);
    }

    public void m(Activity activity) {
        this.f4786s = activity;
    }

    public void n(boolean z9, s sVar, d.b bVar) {
        this.f4785r++;
        k kVar = this.f4787t;
        if (kVar != null) {
            p a10 = kVar.a(getApplicationContext(), Boolean.TRUE.equals(Boolean.valueOf(z9)), sVar);
            this.f4788u = a10;
            this.f4787t.e(a10, this.f4786s, new b1.b(bVar), new b1.a(bVar));
        }
    }

    public void o() {
        k kVar;
        this.f4785r--;
        Log.d("FlutterGeolocator", "Stopping location service.");
        p pVar = this.f4788u;
        if (pVar != null && (kVar = this.f4787t) != null) {
            kVar.f(pVar);
        }
    }

    public IBinder onBind(Intent intent) {
        Log.d("FlutterGeolocator", "Binding to location service.");
        return this.f4782o;
    }

    public void onCreate() {
        super.onCreate();
        Log.d("FlutterGeolocator", "Creating service.");
        this.f4787t = new k();
    }

    public void onDestroy() {
        Log.d("FlutterGeolocator", "Destroying location service.");
        o();
        e();
        this.f4787t = null;
        this.f4791x = null;
        Log.d("FlutterGeolocator", "Destroyed location service.");
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        return 1;
    }

    public boolean onUnbind(Intent intent) {
        Log.d("FlutterGeolocator", "Unbinding from location service.");
        return super.onUnbind(intent);
    }
}
