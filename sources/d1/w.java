package d1;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.location.OnNmeaMessageListener;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import java.util.Calendar;

public class w {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7713a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationManager f7714b;

    /* renamed from: c  reason: collision with root package name */
    private final s f7715c;
    @TargetApi(24)

    /* renamed from: d  reason: collision with root package name */
    private OnNmeaMessageListener f7716d;

    /* renamed from: e  reason: collision with root package name */
    private String f7717e;

    /* renamed from: f  reason: collision with root package name */
    private Calendar f7718f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f7719g = false;

    public w(Context context, s sVar) {
        this.f7713a = context;
        this.f7715c = sVar;
        this.f7714b = (LocationManager) context.getSystemService("location");
        if (Build.VERSION.SDK_INT >= 24) {
            this.f7716d = new v(this);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(String str, long j10) {
        if (str.startsWith("$GPGGA")) {
            this.f7717e = str;
            this.f7718f = Calendar.getInstance();
        }
    }

    public void b(Location location) {
        if (location != null && this.f7717e != null && this.f7715c != null && this.f7719g) {
            Calendar instance = Calendar.getInstance();
            instance.add(13, -5);
            Calendar calendar = this.f7718f;
            if ((calendar == null || !calendar.before(instance)) && this.f7715c.d()) {
                String[] split = this.f7717e.split(",");
                if (split[0].startsWith("$GPGGA") && split.length > 9 && !split[9].isEmpty()) {
                    double parseDouble = Double.parseDouble(split[9]);
                    if (location.getExtras() == null) {
                        location.setExtras(Bundle.EMPTY);
                    }
                    location.getExtras().putDouble("geolocator_mslAltitude", parseDouble);
                }
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    public void d() {
        s sVar;
        LocationManager locationManager;
        if (!this.f7719g && (sVar = this.f7715c) != null && sVar.d() && Build.VERSION.SDK_INT >= 24 && (locationManager = this.f7714b) != null) {
            locationManager.addNmeaListener(this.f7716d, (Handler) null);
            this.f7719g = true;
        }
    }

    public void e() {
        LocationManager locationManager;
        s sVar = this.f7715c;
        if (sVar != null && sVar.d() && Build.VERSION.SDK_INT >= 24 && (locationManager = this.f7714b) != null) {
            locationManager.removeNmeaListener(this.f7716d);
            this.f7719g = false;
        }
    }
}
