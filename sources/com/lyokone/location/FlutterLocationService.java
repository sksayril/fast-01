package com.lyokone.location;

import android.app.Activity;
import android.app.Service;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import g8.s;
import java.util.Map;
import k7.k;
import k7.m;
import k7.p;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import r6.f;

public final class FlutterLocationService extends Service implements p {

    /* renamed from: s  reason: collision with root package name */
    public static final a f7621s = new a((g) null);

    /* renamed from: m  reason: collision with root package name */
    private final b f7622m = new b();

    /* renamed from: n  reason: collision with root package name */
    private boolean f7623n;

    /* renamed from: o  reason: collision with root package name */
    private Activity f7624o;

    /* renamed from: p  reason: collision with root package name */
    private r6.a f7625p;

    /* renamed from: q  reason: collision with root package name */
    private a f7626q;

    /* renamed from: r  reason: collision with root package name */
    private k.d f7627r;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public final class b extends Binder {
        public b() {
        }

        public final FlutterLocationService a() {
            return FlutterLocationService.this;
        }
    }

    private final boolean m() {
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        Activity activity = this.f7624o;
        if (activity != null) {
            return androidx.core.app.b.t(activity, "android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        throw new ActivityNotFoundException();
    }

    public final Map<String, Object> a(f fVar) {
        l.e(fVar, "options");
        r6.a aVar = this.f7625p;
        if (aVar != null) {
            aVar.f(fVar, this.f7623n);
        }
        if (!this.f7623n) {
            return null;
        }
        return f0.f(g8.p.a("channelId", "flutter_location_channel_01"), g8.p.a("notificationId", 75418));
    }

    public final boolean b() {
        if (Build.VERSION.SDK_INT >= 29) {
            Activity activity = this.f7624o;
            if (activity != null) {
                return androidx.core.content.a.a(activity, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0;
            }
            throw new ActivityNotFoundException();
        }
        a aVar = this.f7626q;
        if (aVar != null) {
            return aVar.h();
        }
        return false;
    }

    public final void c() {
        Log.d("FlutterLocationService", "Stop service in foreground.");
        if (Build.VERSION.SDK_INT >= 24) {
            stopForeground(1);
        } else {
            stopForeground(true);
        }
        this.f7623n = false;
    }

    public final void d() {
        if (this.f7623n) {
            Log.d("FlutterLocationService", "Service already in foreground mode.");
            return;
        }
        Log.d("FlutterLocationService", "Start service in foreground mode.");
        r6.a aVar = this.f7625p;
        l.b(aVar);
        startForeground(75418, aVar.a());
        this.f7623n = true;
    }

    public final a e() {
        return this.f7626q;
    }

    public final m f() {
        return this.f7626q;
    }

    public final p g() {
        return this.f7626q;
    }

    public final p h() {
        return this;
    }

    public final boolean i() {
        return this.f7623n;
    }

    public final void j() {
        s sVar = null;
        if (Build.VERSION.SDK_INT >= 29) {
            Activity activity = this.f7624o;
            if (activity != null) {
                androidx.core.app.b.s(activity, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_BACKGROUND_LOCATION"}, 641);
                sVar = s.f8976a;
            }
            if (sVar == null) {
                throw new ActivityNotFoundException();
            }
            return;
        }
        a aVar = this.f7626q;
        if (aVar != null) {
            aVar.f7642z = this.f7627r;
        }
        if (aVar != null) {
            aVar.r();
        }
        this.f7627r = null;
    }

    public final void k(Activity activity) {
        this.f7624o = activity;
        a aVar = this.f7626q;
        if (aVar != null) {
            aVar.u(activity);
        }
    }

    public final void l(k.d dVar) {
        this.f7627r = dVar;
    }

    public IBinder onBind(Intent intent) {
        Log.d("FlutterLocationService", "Binding to location service.");
        return this.f7622m;
    }

    public void onCreate() {
        super.onCreate();
        Log.d("FlutterLocationService", "Creating service.");
        this.f7626q = new a(getApplicationContext(), (Activity) null);
        Context applicationContext = getApplicationContext();
        l.d(applicationContext, "getApplicationContext(...)");
        this.f7625p = new r6.a(applicationContext, "flutter_location_channel_01", 75418);
    }

    public void onDestroy() {
        Log.d("FlutterLocationService", "Destroying service.");
        this.f7626q = null;
        this.f7625p = null;
        super.onDestroy();
    }

    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        String str;
        String str2;
        k.d dVar;
        l.e(strArr, "permissions");
        l.e(iArr, "grantResults");
        if (Build.VERSION.SDK_INT >= 29 && i10 == 641 && strArr.length == 2 && l.a(strArr[0], "android.permission.ACCESS_FINE_LOCATION") && l.a(strArr[1], "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            if (iArr[0] == 0 && iArr[1] == 0) {
                d();
                k.d dVar2 = this.f7627r;
                if (dVar2 != null) {
                    dVar2.a(1);
                }
            } else {
                if (!m()) {
                    dVar = this.f7627r;
                    if (dVar != null) {
                        str2 = "PERMISSION_DENIED_NEVER_ASK";
                        str = "Background location permission denied forever - please open app settings";
                    }
                } else {
                    dVar = this.f7627r;
                    if (dVar != null) {
                        str2 = "PERMISSION_DENIED";
                        str = "Background location permission denied";
                    }
                }
                dVar.b(str2, str, (Object) null);
            }
            this.f7627r = null;
        }
        return false;
    }

    public boolean onUnbind(Intent intent) {
        Log.d("FlutterLocationService", "Unbinding from location service.");
        return super.onUnbind(intent);
    }
}
