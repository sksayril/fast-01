package com.lyokone.location;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.location.Location;
import android.location.LocationManager;
import android.location.OnNmeaMessageListener;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import f2.i;
import java.util.HashMap;
import k7.d;
import k7.k;
import k7.m;
import k7.p;
import r6.c;
import w2.e;
import w2.f;
import w2.g;
import w2.h;
import w2.l;

public class a implements p, m {
    private k.d A;
    public k.d B;
    private final LocationManager C;
    public SparseArray<Integer> D = new C0103a();

    /* renamed from: m  reason: collision with root package name */
    public Activity f7629m;

    /* renamed from: n  reason: collision with root package name */
    public w2.b f7630n;

    /* renamed from: o  reason: collision with root package name */
    private l f7631o;

    /* renamed from: p  reason: collision with root package name */
    private LocationRequest f7632p;

    /* renamed from: q  reason: collision with root package name */
    private g f7633q;

    /* renamed from: r  reason: collision with root package name */
    public e f7634r;
    @TargetApi(24)

    /* renamed from: s  reason: collision with root package name */
    private OnNmeaMessageListener f7635s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public Double f7636t;

    /* renamed from: u  reason: collision with root package name */
    private long f7637u = 5000;

    /* renamed from: v  reason: collision with root package name */
    private long f7638v = (5000 / 2);

    /* renamed from: w  reason: collision with root package name */
    private Integer f7639w = 100;

    /* renamed from: x  reason: collision with root package name */
    private float f7640x = 0.0f;

    /* renamed from: y  reason: collision with root package name */
    public d.b f7641y;

    /* renamed from: z  reason: collision with root package name */
    public k.d f7642z;

    /* renamed from: com.lyokone.location.a$a  reason: collision with other inner class name */
    class C0103a extends SparseArray<Integer> {
        C0103a() {
            put(0, 105);
            put(1, 104);
            put(2, 102);
            put(3, 100);
            put(4, 100);
            put(5, 104);
        }
    }

    class b extends e {
        b() {
        }

        public void b(LocationResult locationResult) {
            super.b(locationResult);
            Location d10 = locationResult.d();
            HashMap hashMap = new HashMap();
            hashMap.put("latitude", Double.valueOf(d10.getLatitude()));
            hashMap.put("longitude", Double.valueOf(d10.getLongitude()));
            hashMap.put("accuracy", Double.valueOf((double) d10.getAccuracy()));
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                hashMap.put("verticalAccuracy", Double.valueOf((double) d10.getVerticalAccuracyMeters()));
                hashMap.put("headingAccuracy", Double.valueOf((double) d10.getBearingAccuracyDegrees()));
            }
            if (i10 >= 29) {
                hashMap.put("elapsedRealtimeUncertaintyNanos", Double.valueOf(d10.getElapsedRealtimeUncertaintyNanos()));
            }
            hashMap.put("provider", d10.getProvider());
            if (d10.getExtras() != null) {
                hashMap.put("satelliteNumber", Integer.valueOf(d10.getExtras().getInt("satellites")));
            }
            hashMap.put("elapsedRealtimeNanos", Double.valueOf((double) d10.getElapsedRealtimeNanos()));
            if (d10.isFromMockProvider()) {
                hashMap.put("isMock", Double.valueOf(1.0d));
            }
            hashMap.put("altitude", (a.this.f7636t == null || i10 < 24) ? Double.valueOf(d10.getAltitude()) : a.this.f7636t);
            hashMap.put("speed", Double.valueOf((double) d10.getSpeed()));
            if (i10 >= 26) {
                hashMap.put("speed_accuracy", Double.valueOf((double) d10.getSpeedAccuracyMetersPerSecond()));
            }
            hashMap.put("heading", Double.valueOf((double) d10.getBearing()));
            hashMap.put("time", Double.valueOf((double) d10.getTime()));
            k.d dVar = a.this.B;
            if (dVar != null) {
                dVar.a(hashMap);
                a.this.B = null;
            }
            a aVar = a.this;
            d.b bVar = aVar.f7641y;
            if (bVar != null) {
                bVar.a(hashMap);
                return;
            }
            w2.b bVar2 = aVar.f7630n;
            if (bVar2 != null) {
                bVar2.b(aVar.f7634r);
            }
        }
    }

    a(Context context, Activity activity) {
        this.f7629m = activity;
        this.C = (LocationManager) context.getSystemService("location");
    }

    private void f() {
        g.a aVar = new g.a();
        aVar.a(this.f7632p);
        this.f7633q = aVar.b();
    }

    private void j() {
        e eVar = this.f7634r;
        if (eVar != null) {
            this.f7630n.b(eVar);
            this.f7634r = null;
        }
        this.f7634r = new b();
        if (Build.VERSION.SDK_INT >= 24) {
            this.f7635s = new r6.b(this);
        }
    }

    private void k() {
        LocationRequest d10 = LocationRequest.d();
        this.f7632p = d10;
        d10.F(this.f7637u);
        this.f7632p.E(this.f7638v);
        this.f7632p.G(this.f7639w.intValue());
        this.f7632p.H(this.f7640x);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void l(String str, long j10) {
        if (str.startsWith("$")) {
            String[] split = str.split(",");
            if (split[0].startsWith("$GPGGA") && split.length > 9 && !split[9].isEmpty()) {
                this.f7636t = Double.valueOf(Double.parseDouble(split[9]));
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void n(k.d dVar, Exception exc) {
        String str;
        if (exc instanceof i) {
            i iVar = (i) exc;
            int b10 = iVar.b();
            if (b10 == 6) {
                try {
                    iVar.c(this.f7629m, 4097);
                } catch (IntentSender.SendIntentException unused) {
                    str = "Could not resolve location request";
                }
            } else if (b10 == 8502) {
                dVar.b("SERVICE_STATUS_DISABLED", "Failed to get location. Location services disabled", (Object) null);
            }
        } else {
            str = "Unexpected error type received";
            dVar.b("SERVICE_STATUS_ERROR", str, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void o(h hVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.C.addNmeaListener(this.f7635s, (Handler) null);
        }
        w2.b bVar = this.f7630n;
        if (bVar != null) {
            bVar.a(this.f7632p, this.f7634r, Looper.myLooper());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void p(Exception exc) {
        if (exc instanceof i) {
            i iVar = (i) exc;
            if (iVar.b() == 6) {
                try {
                    iVar.c(this.f7629m, 1);
                } catch (IntentSender.SendIntentException unused) {
                    Log.i("FlutterLocation", "PendingIntent unable to execute request.");
                }
            }
        } else if (((f2.b) exc).b() == 8502) {
            if (Build.VERSION.SDK_INT >= 24) {
                this.C.addNmeaListener(this.f7635s, (Handler) null);
            }
            this.f7630n.a(this.f7632p, this.f7634r, Looper.myLooper());
        } else {
            t("UNEXPECTED_ERROR", exc.getMessage(), (Object) null);
        }
    }

    private void t(String str, String str2, Object obj) {
        k.d dVar = this.B;
        if (dVar != null) {
            dVar.b(str, str2, obj);
            this.B = null;
        }
        d.b bVar = this.f7641y;
        if (bVar != null) {
            bVar.b(str, str2, obj);
            this.f7641y = null;
        }
    }

    public void g(Integer num, Long l10, Long l11, Float f10) {
        this.f7639w = num;
        this.f7637u = l10.longValue();
        this.f7638v = l11.longValue();
        this.f7640x = f10.floatValue();
        j();
        k();
        f();
        w();
    }

    public boolean h() {
        Activity activity = this.f7629m;
        if (activity != null) {
            return androidx.core.content.a.a(activity, "android.permission.ACCESS_FINE_LOCATION") == 0;
        }
        this.f7642z.b("MISSING_ACTIVITY", "You should not checkPermissions activation outside of an activity.", (Object) null);
        throw new ActivityNotFoundException();
    }

    public boolean i() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.C.isLocationEnabled();
        }
        return this.C.isProviderEnabled("gps") || this.C.isProviderEnabled("network");
    }

    public boolean m(int i10, int i11, Intent intent) {
        k.d dVar;
        if (i10 == 1) {
            k.d dVar2 = this.f7642z;
            if (dVar2 == null) {
                return false;
            }
            if (i11 == -1) {
                w();
                return true;
            }
            dVar2.b("SERVICE_STATUS_DISABLED", "Failed to get location. Location services disabled", (Object) null);
            this.f7642z = null;
            return true;
        } else if (i10 != 4097 || (dVar = this.A) == null) {
            return false;
        } else {
            dVar.a(i11 == -1 ? 1 : 0);
            this.A = null;
            return true;
        }
    }

    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        return q(i10, strArr, iArr);
    }

    public boolean q(int i10, String[] strArr, int[] iArr) {
        int i11;
        k.d dVar;
        if (i10 != 34 || strArr.length != 1 || !strArr[0].equals("android.permission.ACCESS_FINE_LOCATION")) {
            return false;
        }
        if (iArr[0] == 0) {
            if (!(this.B == null && this.f7641y == null)) {
                w();
            }
            dVar = this.f7642z;
            if (dVar != null) {
                i11 = 1;
            }
            return true;
        } else if (!v()) {
            t("PERMISSION_DENIED_NEVER_ASK", "Location permission denied forever - please open app settings", (Object) null);
            dVar = this.f7642z;
            if (dVar != null) {
                i11 = 2;
            }
            return true;
        } else {
            t("PERMISSION_DENIED", "Location permission denied", (Object) null);
            dVar = this.f7642z;
            if (dVar != null) {
                i11 = 0;
            }
            return true;
        }
        dVar.a(i11);
        this.f7642z = null;
        return true;
    }

    public void r() {
        if (this.f7629m == null) {
            this.f7642z.b("MISSING_ACTIVITY", "You should not requestPermissions activation outside of an activity.", (Object) null);
            throw new ActivityNotFoundException();
        } else if (h()) {
            this.f7642z.a(1);
        } else {
            androidx.core.app.b.s(this.f7629m, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 34);
        }
    }

    public void s(k.d dVar) {
        if (this.f7629m != null) {
            try {
                if (i()) {
                    dVar.a(1);
                    return;
                }
                this.A = dVar;
                this.f7631o.d(this.f7633q).d(this.f7629m, new r6.d(this, dVar));
            } catch (Exception unused) {
                dVar.b("SERVICE_STATUS_ERROR", "Location service status couldn't be determined", (Object) null);
            }
        } else {
            dVar.b("MISSING_ACTIVITY", "You should not requestService activation outside of an activity.", (Object) null);
            throw new ActivityNotFoundException();
        }
    }

    /* access modifiers changed from: package-private */
    public void u(Activity activity) {
        LocationManager locationManager;
        this.f7629m = activity;
        if (activity != null) {
            this.f7630n = f.a(activity);
            this.f7631o = f.c(activity);
            j();
            k();
            f();
            return;
        }
        w2.b bVar = this.f7630n;
        if (bVar != null) {
            bVar.b(this.f7634r);
        }
        this.f7630n = null;
        this.f7631o = null;
        if (Build.VERSION.SDK_INT >= 24 && (locationManager = this.C) != null) {
            locationManager.removeNmeaListener(this.f7635s);
            this.f7635s = null;
        }
    }

    public boolean v() {
        Activity activity = this.f7629m;
        if (activity == null) {
            return false;
        }
        return androidx.core.app.b.t(activity, "android.permission.ACCESS_FINE_LOCATION");
    }

    public void w() {
        if (this.f7629m != null) {
            this.f7631o.d(this.f7633q).g(this.f7629m, new r6.e(this)).d(this.f7629m, new c(this));
        } else {
            this.f7642z.b("MISSING_ACTIVITY", "You should not requestLocation activation outside of an activity.", (Object) null);
            throw new ActivityNotFoundException();
        }
    }
}
