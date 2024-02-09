package com.almoullim.background_location;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.location.Location;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;
import com.almoullim.background_location.LocationUpdatesService;
import java.util.HashMap;
import k7.k;
import k7.p;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import y0.d;

public final class b implements k.c, p {

    /* renamed from: u  reason: collision with root package name */
    public static final a f3904u = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public static b f3905v;

    /* renamed from: m  reason: collision with root package name */
    private Context f3906m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public k f3907n;

    /* renamed from: o  reason: collision with root package name */
    private Activity f3908o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f3909p;

    /* renamed from: q  reason: collision with root package name */
    private C0085b f3910q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public LocationUpdatesService f3911r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public boolean f3912s;

    /* renamed from: t  reason: collision with root package name */
    private final c f3913t = new c(this);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final b a() {
            if (b.f3905v == null) {
                b.f3905v = new b();
            }
            b b10 = b.f3905v;
            l.b(b10);
            return b10;
        }
    }

    /* renamed from: com.almoullim.background_location.b$b  reason: collision with other inner class name */
    private final class C0085b extends BroadcastReceiver {
        public C0085b() {
        }

        public void onReceive(Context context, Intent intent) {
            l.e(context, "context");
            l.e(intent, "intent");
            Location location = (Location) intent.getParcelableExtra("com.google.android.gms.location.sample.locationupdatesforegroundservice.location");
            if (location != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("latitude", Double.valueOf(location.getLatitude()));
                hashMap.put("longitude", Double.valueOf(location.getLongitude()));
                hashMap.put("altitude", Double.valueOf(location.getAltitude()));
                hashMap.put("accuracy", Double.valueOf((double) location.getAccuracy()));
                hashMap.put("bearing", Double.valueOf((double) location.getBearing()));
                hashMap.put("speed", Double.valueOf((double) location.getSpeed()));
                hashMap.put("time", Double.valueOf((double) location.getTime()));
                hashMap.put("is_mock", Boolean.valueOf(location.isFromMockProvider()));
                k a10 = b.this.f3907n;
                if (a10 == null) {
                    l.p("channel");
                    a10 = null;
                }
                a10.d("location", hashMap, (k.d) null);
            }
        }
    }

    public static final class c implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f3915a;

        c(b bVar) {
            this.f3915a = bVar;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            l.e(componentName, "name");
            l.e(iBinder, "service");
            this.f3915a.f3912s = true;
            this.f3915a.f3911r = ((LocationUpdatesService.b) iBinder).a();
            this.f3915a.j();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            l.e(componentName, "name");
            this.f3915a.f3911r = null;
        }
    }

    private final boolean g() {
        Context context = this.f3906m;
        l.b(context);
        return androidx.core.content.a.a(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    /* access modifiers changed from: private */
    public final void j() {
        if (!g()) {
            k();
            return;
        }
        LocationUpdatesService locationUpdatesService = this.f3911r;
        if (locationUpdatesService != null) {
            locationUpdatesService.q();
        }
    }

    private final void k() {
        Activity activity = this.f3908o;
        if (activity != null) {
            l.b(activity);
            if (androidx.core.app.b.t(activity, "android.permission.ACCESS_FINE_LOCATION")) {
                Log.i("com.almoullim.Log.Tag", "Displaying permission rationale to provide additional context.");
                Toast.makeText(this.f3906m, y0.c.permission_rationale, 1).show();
                return;
            }
            Log.i("com.almoullim.Log.Tag", "Requesting permission");
            Activity activity2 = this.f3908o;
            l.b(activity2);
            androidx.core.app.b.s(activity2, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 34);
        }
    }

    private final int m(String str, String str2, String str3) {
        if (str != null) {
            LocationUpdatesService.f3886y.d(str);
        }
        if (str2 != null) {
            LocationUpdatesService.f3886y.c(str2);
        }
        if (str3 != null) {
            LocationUpdatesService.f3886y.b(str3);
        }
        LocationUpdatesService locationUpdatesService = this.f3911r;
        if (locationUpdatesService == null || locationUpdatesService == null) {
            return 0;
        }
        locationUpdatesService.r();
        return 0;
    }

    private final int n(Long l10) {
        if (l10 == null) {
            return 0;
        }
        LocationUpdatesService.a aVar = LocationUpdatesService.f3886y;
        aVar.e(l10.longValue());
        aVar.a(l10.longValue() / ((long) 2));
        return 0;
    }

    private final int o(Double d10, Boolean bool) {
        Context context = this.f3906m;
        l.b(context);
        l0.a b10 = l0.a.b(context);
        C0085b bVar = this.f3910q;
        l.b(bVar);
        b10.c(bVar, new IntentFilter("com.google.android.gms.location.sample.locationupdatesforegroundservice.broadcast"));
        if (this.f3912s) {
            return 0;
        }
        Intent intent = new Intent(this.f3906m, LocationUpdatesService.class);
        intent.putExtra("distance_filter", d10);
        intent.putExtra("force_location_manager", bool);
        Context context2 = this.f3906m;
        l.b(context2);
        context2.bindService(intent, this.f3913t, 1);
        return 0;
    }

    private final int p() {
        LocationUpdatesService locationUpdatesService = this.f3911r;
        if (locationUpdatesService != null) {
            locationUpdatesService.p();
        }
        Context context = this.f3906m;
        l.b(context);
        l0.a b10 = l0.a.b(context);
        C0085b bVar = this.f3910q;
        l.b(bVar);
        b10.e(bVar);
        if (this.f3912s) {
            Context context2 = this.f3906m;
            l.b(context2);
            context2.unbindService(this.f3913t);
            this.f3912s = false;
        }
        return 0;
    }

    public final void h(Context context, k7.c cVar) {
        l.e(context, "context");
        l.e(cVar, "messenger");
        this.f3906m = context;
        this.f3909p = true;
        k kVar = new k(cVar, "com.almoullim.background_location/methods");
        this.f3907n = kVar;
        kVar.e(this);
        this.f3910q = new C0085b();
        l0.a b10 = l0.a.b(context);
        C0085b bVar = this.f3910q;
        l.b(bVar);
        b10.c(bVar, new IntentFilter("com.google.android.gms.location.sample.locationupdatesforegroundservice.broadcast"));
    }

    public final void i() {
        k kVar = this.f3907n;
        if (kVar == null) {
            l.p("channel");
            kVar = null;
        }
        kVar.e((k.c) null);
        this.f3906m = null;
        this.f3909p = false;
    }

    public final void l(d7.c cVar) {
        Activity d10 = cVar != null ? cVar.d() : null;
        this.f3908o = d10;
        if (d10 != null) {
            d dVar = d.f13226a;
            Context context = this.f3906m;
            l.b(context);
            if (dVar.a(context) && !g()) {
                k();
                return;
            }
            return;
        }
        p();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0087, code lost:
        r5.a(java.lang.Integer.valueOf(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(k7.j r4, k7.k.d r5) {
        /*
            r3 = this;
            java.lang.String r0 = "call"
            kotlin.jvm.internal.l.e(r4, r0)
            java.lang.String r0 = "result"
            kotlin.jvm.internal.l.e(r5, r0)
            java.lang.String r0 = r4.f10996a
            if (r0 == 0) goto L_0x008f
            int r1 = r0.hashCode()
            switch(r1) {
                case -1993460120: goto L_0x006a;
                case -1002527032: goto L_0x005c;
                case 919121881: goto L_0x003e;
                case 2110011512: goto L_0x0017;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x008f
        L_0x0017:
            java.lang.String r1 = "set_android_notification"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0021
            goto L_0x008f
        L_0x0021:
            java.lang.String r0 = "title"
            java.lang.Object r0 = r4.a(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "message"
            java.lang.Object r1 = r4.a(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "icon"
            java.lang.Object r4 = r4.a(r2)
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r3.m(r0, r1, r4)
            goto L_0x0087
        L_0x003e:
            java.lang.String r1 = "set_configuration"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0047
            goto L_0x008f
        L_0x0047:
            java.lang.String r0 = "interval"
            java.lang.Object r4 = r4.a(r0)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0056
            java.lang.Long r4 = z8.n.f(r4)
            goto L_0x0057
        L_0x0056:
            r4 = 0
        L_0x0057:
            int r4 = r3.n(r4)
            goto L_0x0087
        L_0x005c:
            java.lang.String r4 = "stop_location_service"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x0065
            goto L_0x008f
        L_0x0065:
            int r4 = r3.p()
            goto L_0x0087
        L_0x006a:
            java.lang.String r1 = "start_location_service"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0073
            goto L_0x008f
        L_0x0073:
            java.lang.String r0 = "distance_filter"
            java.lang.Object r0 = r4.a(r0)
            java.lang.Double r0 = (java.lang.Double) r0
            java.lang.String r1 = "force_location_manager"
            java.lang.Object r4 = r4.a(r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            int r4 = r3.o(r0, r4)
        L_0x0087:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5.a(r4)
            goto L_0x0092
        L_0x008f:
            r5.c()
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.almoullim.background_location.b.onMethodCall(k7.j, k7.k$d):void");
    }

    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        l.e(strArr, "permissions");
        l.e(iArr, "grantResults");
        Log.i("com.almoullim.Log.Tag", "onRequestPermissionResult");
        if (i10 == 34) {
            if (iArr.length == 0) {
                Log.i("com.almoullim.Log.Tag", "User interaction was cancelled.");
            } else if (iArr[0] == 0) {
                LocationUpdatesService locationUpdatesService = this.f3911r;
                if (locationUpdatesService != null) {
                    locationUpdatesService.q();
                }
            } else {
                Toast.makeText(this.f3906m, y0.c.permission_denied_explanation, 1).show();
            }
        }
        return true;
    }
}
