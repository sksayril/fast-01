package v6;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final ConnectivityManager f12736a;

    public a(ConnectivityManager connectivityManager) {
        this.f12736a = connectivityManager;
    }

    private String c() {
        NetworkInfo activeNetworkInfo = this.f12736a.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return "none";
        }
        int type = activeNetworkInfo.getType();
        return type != 0 ? type != 1 ? (type == 4 || type == 5) ? "mobile" : type != 6 ? type != 7 ? type != 9 ? type != 17 ? "none" : "vpn" : "ethernet" : "bluetooth" : "wifi" : "wifi" : "mobile";
    }

    public ConnectivityManager a() {
        return this.f12736a;
    }

    /* access modifiers changed from: package-private */
    public String b() {
        if (Build.VERSION.SDK_INT >= 23) {
            NetworkCapabilities networkCapabilities = this.f12736a.getNetworkCapabilities(this.f12736a.getActiveNetwork());
            if (networkCapabilities == null) {
                return "none";
            }
            if (networkCapabilities.hasTransport(1)) {
                return "wifi";
            }
            if (networkCapabilities.hasTransport(3)) {
                return "ethernet";
            }
            if (networkCapabilities.hasTransport(4)) {
                return "vpn";
            }
            if (networkCapabilities.hasTransport(0)) {
                return "mobile";
            }
            if (networkCapabilities.hasTransport(2)) {
                return "bluetooth";
            }
        }
        return c();
    }
}
