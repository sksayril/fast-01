package com.almoullim.background_location;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import androidx.core.app.l;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import d3.j;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import w2.e;
import w2.f;

public final class LocationUpdatesService extends Service {
    /* access modifiers changed from: private */
    public static String A = "Background service is running";
    /* access modifiers changed from: private */
    public static String B = "@mipmap/ic_launcher";
    private static final String C = LocationUpdatesService.class.getSimpleName();
    /* access modifiers changed from: private */
    public static long D = 1000;
    /* access modifiers changed from: private */
    public static long E = (1000 / ((long) 2));
    private static BroadcastReceiver F;

    /* renamed from: y  reason: collision with root package name */
    public static final a f3886y = new a((g) null);
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public static String f3887z = "Background service is running";

    /* renamed from: m  reason: collision with root package name */
    private boolean f3888m;

    /* renamed from: n  reason: collision with root package name */
    private final b f3889n = new b();

    /* renamed from: o  reason: collision with root package name */
    private NotificationManager f3890o;

    /* renamed from: p  reason: collision with root package name */
    private LocationRequest f3891p;

    /* renamed from: q  reason: collision with root package name */
    private w2.b f3892q;

    /* renamed from: r  reason: collision with root package name */
    private LocationManager f3893r;

    /* renamed from: s  reason: collision with root package name */
    private e f3894s;

    /* renamed from: t  reason: collision with root package name */
    private LocationListener f3895t;

    /* renamed from: u  reason: collision with root package name */
    private Location f3896u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f3897v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f3898w;

    /* renamed from: x  reason: collision with root package name */
    private Handler f3899x;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void a(long j10) {
            LocationUpdatesService.E = j10;
        }

        public final void b(String str) {
            l.e(str, "<set-?>");
            LocationUpdatesService.B = str;
        }

        public final void c(String str) {
            l.e(str, "<set-?>");
            LocationUpdatesService.A = str;
        }

        public final void d(String str) {
            l.e(str, "<set-?>");
            LocationUpdatesService.f3887z = str;
        }

        public final void e(long j10) {
            LocationUpdatesService.D = j10;
        }
    }

    public final class b extends Binder {
        public b() {
        }

        public final LocationUpdatesService a() {
            return LocationUpdatesService.this;
        }
    }

    public static final class c extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LocationUpdatesService f3901a;

        c(LocationUpdatesService locationUpdatesService) {
            this.f3901a = locationUpdatesService;
        }

        public void b(LocationResult locationResult) {
            l.e(locationResult, "locationResult");
            Location d10 = locationResult.d();
            if (d10 != null) {
                super.b(locationResult);
                this.f3901a.o(d10);
            }
        }
    }

    public static final class d extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LocationUpdatesService f3902a;

        d(LocationUpdatesService locationUpdatesService) {
            this.f3902a = locationUpdatesService;
        }

        public void onReceive(Context context, Intent intent) {
            if (l.a(intent != null ? intent.getAction() : null, "stop_service")) {
                this.f3902a.p();
            }
        }
    }

    private final void i(double d10) {
        LocationRequest locationRequest = new LocationRequest();
        this.f3891p = locationRequest;
        l.b(locationRequest);
        locationRequest.F(D);
        LocationRequest locationRequest2 = this.f3891p;
        l.b(locationRequest2);
        locationRequest2.E(E);
        LocationRequest locationRequest3 = this.f3891p;
        l.b(locationRequest3);
        locationRequest3.G(100);
        LocationRequest locationRequest4 = this.f3891p;
        l.b(locationRequest4);
        locationRequest4.H((float) d10);
    }

    private final void j() {
        try {
            if (!this.f3897v || this.f3888m) {
                LocationManager locationManager = this.f3893r;
                l.b(locationManager);
                this.f3896u = locationManager.getLastKnownLocation("gps");
                return;
            }
            w2.b bVar = this.f3892q;
            l.b(bVar);
            bVar.c().b(new y0.b(this));
        } catch (SecurityException unused) {
        }
    }

    /* access modifiers changed from: private */
    public static final void k(LocationUpdatesService locationUpdatesService, j jVar) {
        l.e(locationUpdatesService, "this$0");
        l.e(jVar, "task");
        if (jVar.q() && jVar.n() != null) {
            locationUpdatesService.f3896u = (Location) jVar.n();
        }
    }

    private final Class<?> l(Context context) {
        ComponentName component;
        String className;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null || (component = launchIntentForPackage.getComponent()) == null || (className = component.getClassName()) == null) {
            return null;
        }
        try {
            return Class.forName(className);
        } catch (ClassNotFoundException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @SuppressLint({"UnspecifiedImmutableFlag"})
    private final l.e m() {
        Intent intent = new Intent(this, l(this));
        intent.putExtra("com.google.android.gms.location.sample.locationupdatesforegroundservice.started_from_notification", true);
        intent.setAction("Localisation");
        int i10 = Build.VERSION.SDK_INT;
        l.e s9 = new l.e(this, "BackgroundLocation").u(f3887z).E(true).L((Uri) null).G(1).K(getResources().getIdentifier(B, "mipmap", getPackageName())).T(System.currentTimeMillis()).M(new l.c().w(A)).s(PendingIntent.getActivity(this, 1, intent, i10 >= 23 ? 201326592 : 134217728));
        kotlin.jvm.internal.l.d(s9, "setContentIntent(...)");
        if (i10 >= 26) {
            s9.o("channel_01");
        }
        return s9;
    }

    /* access modifiers changed from: private */
    public static final void n(LocationUpdatesService locationUpdatesService, Location location) {
        kotlin.jvm.internal.l.e(locationUpdatesService, "this$0");
        kotlin.jvm.internal.l.e(location, "location");
        System.out.println(location.toString());
        locationUpdatesService.o(location);
    }

    /* access modifiers changed from: private */
    public final void o(Location location) {
        this.f3896u = location;
        Intent intent = new Intent("com.google.android.gms.location.sample.locationupdatesforegroundservice.broadcast");
        intent.putExtra("com.google.android.gms.location.sample.locationupdatesforegroundservice.location", location);
        l0.a.b(getApplicationContext()).d(intent);
    }

    public IBinder onBind(Intent intent) {
        double d10 = 0.0d;
        Double valueOf = intent != null ? Double.valueOf(intent.getDoubleExtra("distance_filter", 0.0d)) : null;
        if (intent != null) {
            this.f3888m = intent.getBooleanExtra("force_location_manager", false);
        }
        if (valueOf != null) {
            d10 = valueOf.doubleValue();
        }
        i(d10);
        return this.f3889n;
    }

    public void onCreate() {
        boolean z9 = e2.e.m().g(getApplicationContext()) == 0;
        this.f3897v = z9;
        if (!z9 || this.f3888m) {
            this.f3893r = (LocationManager) getSystemService("location");
            this.f3895t = new y0.a(this);
        } else {
            this.f3892q = f.b(this);
            this.f3894s = new c(this);
        }
        j();
        HandlerThread handlerThread = new HandlerThread(C);
        handlerThread.start();
        this.f3899x = new Handler(handlerThread.getLooper());
        Object systemService = getSystemService("notification");
        kotlin.jvm.internal.l.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        this.f3890o = (NotificationManager) systemService;
        BroadcastReceiver broadcastReceiver = null;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("channel_01", "Application Name", 2);
            notificationChannel.setSound((Uri) null, (AudioAttributes) null);
            NotificationManager notificationManager = this.f3890o;
            kotlin.jvm.internal.l.b(notificationManager);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        F = new d(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("stop_service");
        BroadcastReceiver broadcastReceiver2 = F;
        if (broadcastReceiver2 == null) {
            kotlin.jvm.internal.l.p("broadcastReceiver");
        } else {
            broadcastReceiver = broadcastReceiver2;
        }
        registerReceiver(broadcastReceiver, intentFilter);
        r();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f3898w = false;
        BroadcastReceiver broadcastReceiver = F;
        if (broadcastReceiver == null) {
            kotlin.jvm.internal.l.p("broadcastReceiver");
            broadcastReceiver = null;
        }
        unregisterReceiver(broadcastReceiver);
        try {
            if (!this.f3897v || this.f3888m) {
                LocationManager locationManager = this.f3893r;
                kotlin.jvm.internal.l.b(locationManager);
                LocationListener locationListener = this.f3895t;
                kotlin.jvm.internal.l.b(locationListener);
                locationManager.removeUpdates(locationListener);
            } else {
                w2.b bVar = this.f3892q;
                kotlin.jvm.internal.l.b(bVar);
                e eVar = this.f3894s;
                kotlin.jvm.internal.l.b(eVar);
                bVar.b(eVar);
            }
            y0.d.f13226a.b(this, false);
            NotificationManager notificationManager = this.f3890o;
            kotlin.jvm.internal.l.b(notificationManager);
            notificationManager.cancel(12345678);
        } catch (SecurityException unused) {
            y0.d.f13226a.b(this, true);
        }
    }

    public final void p() {
        stopForeground(true);
        stopSelf();
    }

    public final void q() {
        y0.d.f13226a.b(this, true);
        try {
            if (!this.f3897v || this.f3888m) {
                LocationManager locationManager = this.f3893r;
                if (locationManager != null) {
                    LocationListener locationListener = this.f3895t;
                    kotlin.jvm.internal.l.b(locationListener);
                    locationManager.requestLocationUpdates("gps", 0, 0.0f, locationListener);
                    return;
                }
                return;
            }
            w2.b bVar = this.f3892q;
            kotlin.jvm.internal.l.b(bVar);
            LocationRequest locationRequest = this.f3891p;
            kotlin.jvm.internal.l.b(locationRequest);
            e eVar = this.f3894s;
            kotlin.jvm.internal.l.b(eVar);
            bVar.a(locationRequest, eVar, Looper.myLooper());
        } catch (SecurityException unused) {
            y0.d.f13226a.b(this, false);
        }
    }

    public final void r() {
        if (!this.f3898w) {
            this.f3898w = true;
            startForeground(12345678, m().c());
            return;
        }
        Object systemService = getSystemService("notification");
        kotlin.jvm.internal.l.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).notify(12345678, m().c());
    }
}
