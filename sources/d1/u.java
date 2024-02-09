package d1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import k7.d;

public class u extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final d.b f7710a;

    /* renamed from: b  reason: collision with root package name */
    private y f7711b;

    public u(d.b bVar) {
        this.f7710a = bVar;
    }

    public void onReceive(Context context, Intent intent) {
        y yVar;
        if ("android.location.PROVIDERS_CHANGED".equals(intent.getAction())) {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            boolean isProviderEnabled = locationManager.isProviderEnabled("gps");
            boolean isProviderEnabled2 = locationManager.isProviderEnabled("network");
            if (isProviderEnabled || isProviderEnabled2) {
                y yVar2 = this.f7711b;
                if (yVar2 == null || yVar2 == y.disabled) {
                    yVar = y.enabled;
                } else {
                    return;
                }
            } else {
                y yVar3 = this.f7711b;
                if (yVar3 == null || yVar3 == y.enabled) {
                    yVar = y.disabled;
                } else {
                    return;
                }
            }
            this.f7711b = yVar;
            this.f7710a.a(Integer.valueOf(yVar.ordinal()));
        }
    }
}
