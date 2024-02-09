package d1;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import androidx.core.location.b;
import androidx.core.location.c;
import androidx.core.location.j;
import java.util.List;

class q implements p, b {

    /* renamed from: a  reason: collision with root package name */
    private final LocationManager f7696a;

    /* renamed from: b  reason: collision with root package name */
    private final w f7697b;

    /* renamed from: c  reason: collision with root package name */
    private final s f7698c;

    /* renamed from: d  reason: collision with root package name */
    public Context f7699d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7700e = false;

    /* renamed from: f  reason: collision with root package name */
    private Location f7701f;

    /* renamed from: g  reason: collision with root package name */
    private String f7702g;

    /* renamed from: h  reason: collision with root package name */
    private x f7703h;

    /* renamed from: i  reason: collision with root package name */
    private c1.a f7704i;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7705a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                d1.l[] r0 = d1.l.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7705a = r0
                d1.l r1 = d1.l.lowest     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7705a     // Catch:{ NoSuchFieldError -> 0x001d }
                d1.l r1 = d1.l.low     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7705a     // Catch:{ NoSuchFieldError -> 0x0028 }
                d1.l r1 = d1.l.high     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f7705a     // Catch:{ NoSuchFieldError -> 0x0033 }
                d1.l r1 = d1.l.best     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f7705a     // Catch:{ NoSuchFieldError -> 0x003e }
                d1.l r1 = d1.l.bestForNavigation     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f7705a     // Catch:{ NoSuchFieldError -> 0x0049 }
                d1.l r1 = d1.l.medium     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: d1.q.a.<clinit>():void");
        }
    }

    public q(Context context, s sVar) {
        this.f7696a = (LocationManager) context.getSystemService("location");
        this.f7698c = sVar;
        this.f7699d = context;
        this.f7697b = new w(context, sVar);
    }

    private static int f(l lVar) {
        int i10 = a.f7705a[lVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return 104;
        }
        return (i10 == 3 || i10 == 4 || i10 == 5) ? 100 : 102;
    }

    private static String h(LocationManager locationManager, l lVar) {
        List<String> providers = locationManager.getProviders(true);
        if (lVar == l.lowest) {
            return "passive";
        }
        if (providers.contains("fused") && Build.VERSION.SDK_INT >= 31) {
            return "fused";
        }
        if (providers.contains("gps")) {
            return "gps";
        }
        if (providers.contains("network")) {
            return "network";
        }
        if (!providers.isEmpty()) {
            return providers.get(0);
        }
        return null;
    }

    static boolean i(Location location, Location location2) {
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        boolean z9 = time > 120000;
        boolean z10 = time < -120000;
        boolean z11 = time > 0;
        if (z9) {
            return true;
        }
        if (z10) {
            return false;
        }
        float accuracy = (float) ((int) (location.getAccuracy() - location2.getAccuracy()));
        boolean z12 = accuracy > 0.0f;
        boolean z13 = accuracy < 0.0f;
        boolean z14 = accuracy > 200.0f;
        boolean equals = location.getProvider() != null ? location.getProvider().equals(location2.getProvider()) : false;
        if (z13) {
            return true;
        }
        if (!z11 || z12) {
            return z11 && !z14 && equals;
        }
        return true;
    }

    public boolean a(int i10, int i11) {
        return false;
    }

    @SuppressLint({"MissingPermission"})
    public void b(Activity activity, x xVar, c1.a aVar) {
        if (!g(this.f7699d)) {
            aVar.a(c1.b.locationServicesDisabled);
            return;
        }
        this.f7703h = xVar;
        this.f7704i = aVar;
        l lVar = l.best;
        long j10 = 0;
        float f10 = 0.0f;
        int i10 = 102;
        s sVar = this.f7698c;
        if (sVar != null) {
            f10 = (float) sVar.b();
            lVar = this.f7698c.a();
            j10 = lVar == l.lowest ? Long.MAX_VALUE : this.f7698c.c();
            i10 = f(lVar);
        }
        String h10 = h(this.f7696a, lVar);
        this.f7702g = h10;
        if (h10 == null) {
            aVar.a(c1.b.locationServicesDisabled);
            return;
        }
        j a10 = new j.c(j10).c(f10).d(i10).a();
        this.f7700e = true;
        this.f7697b.d();
        c.b(this.f7696a, this.f7702g, a10, this, Looper.getMainLooper());
    }

    public void c(x xVar, c1.a aVar) {
        Location location = null;
        for (String lastKnownLocation : this.f7696a.getProviders(true)) {
            Location lastKnownLocation2 = this.f7696a.getLastKnownLocation(lastKnownLocation);
            if (lastKnownLocation2 != null && i(lastKnownLocation2, location)) {
                location = lastKnownLocation2;
            }
        }
        xVar.a(location);
    }

    public void d(t tVar) {
        tVar.b(this.f7696a == null ? false : g(this.f7699d));
    }

    @SuppressLint({"MissingPermission"})
    public void e() {
        this.f7700e = false;
        this.f7697b.e();
        this.f7696a.removeUpdates(this);
    }

    public /* synthetic */ boolean g(Context context) {
        return o.a(this, context);
    }

    public /* synthetic */ void onFlushComplete(int i10) {
        androidx.core.location.a.a(this, i10);
    }

    public synchronized void onLocationChanged(Location location) {
        if (i(location, this.f7701f)) {
            this.f7701f = location;
            if (this.f7703h != null) {
                this.f7697b.b(location);
                this.f7703h.a(this.f7701f);
            }
        }
    }

    public /* synthetic */ void onLocationChanged(List list) {
        androidx.core.location.a.b(this, list);
    }

    @SuppressLint({"MissingPermission"})
    public void onProviderDisabled(String str) {
        if (str.equals(this.f7702g)) {
            if (this.f7700e) {
                this.f7696a.removeUpdates(this);
            }
            c1.a aVar = this.f7704i;
            if (aVar != null) {
                aVar.a(c1.b.locationServicesDisabled);
            }
            this.f7702g = null;
        }
    }

    public void onProviderEnabled(String str) {
    }

    @TargetApi(28)
    public void onStatusChanged(String str, int i10, Bundle bundle) {
        if (i10 == 2) {
            onProviderEnabled(str);
        } else if (i10 == 0) {
            onProviderDisabled(str);
        }
    }
}
