package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.c;
import java.util.Calendar;

class l {

    /* renamed from: d  reason: collision with root package name */
    private static l f405d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f406a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationManager f407b;

    /* renamed from: c  reason: collision with root package name */
    private final a f408c = new a();

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f409a;

        /* renamed from: b  reason: collision with root package name */
        long f410b;

        /* renamed from: c  reason: collision with root package name */
        long f411c;

        /* renamed from: d  reason: collision with root package name */
        long f412d;

        /* renamed from: e  reason: collision with root package name */
        long f413e;

        /* renamed from: f  reason: collision with root package name */
        long f414f;

        a() {
        }
    }

    l(Context context, LocationManager locationManager) {
        this.f406a = context;
        this.f407b = locationManager;
    }

    static l a(Context context) {
        if (f405d == null) {
            Context applicationContext = context.getApplicationContext();
            f405d = new l(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f405d;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location location = null;
        Location c10 = c.b(this.f406a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        if (c.b(this.f406a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = c("gps");
        }
        return (location == null || c10 == null) ? location != null ? location : c10 : location.getTime() > c10.getTime() ? location : c10;
    }

    private Location c(String str) {
        try {
            if (this.f407b.isProviderEnabled(str)) {
                return this.f407b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    private boolean e() {
        return this.f408c.f414f > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j10;
        a aVar = this.f408c;
        long currentTimeMillis = System.currentTimeMillis();
        k b10 = k.b();
        k kVar = b10;
        kVar.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j11 = b10.f402a;
        kVar.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z9 = b10.f404c == 1;
        long j12 = b10.f403b;
        long j13 = j11;
        long j14 = b10.f402a;
        long j15 = j12;
        boolean z10 = z9;
        b10.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j16 = b10.f403b;
        if (j15 == -1 || j14 == -1) {
            j10 = 43200000 + currentTimeMillis;
        } else {
            j10 = (currentTimeMillis > j14 ? 0 + j16 : currentTimeMillis > j15 ? 0 + j14 : 0 + j15) + 60000;
        }
        aVar.f409a = z10;
        aVar.f410b = j13;
        aVar.f411c = j15;
        aVar.f412d = j14;
        aVar.f413e = j16;
        aVar.f414f = j10;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        a aVar = this.f408c;
        if (e()) {
            return aVar.f409a;
        }
        Location b10 = b();
        if (b10 != null) {
            f(b10);
            return aVar.f409a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }
}
