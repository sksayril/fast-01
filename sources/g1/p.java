package g1;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.util.List;

final class p {

    @FunctionalInterface
    interface a {
        void a(int i10);
    }

    p() {
    }

    private List<ResolveInfo> b(PackageManager packageManager) {
        Intent intent = new Intent("android.intent.action.CALL");
        intent.setData(Uri.parse("tel:123123"));
        return Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0)) : packageManager.queryIntentActivities(intent, 0);
    }

    private boolean c(Context context) {
        return ((BluetoothManager) context.getSystemService("bluetooth")).getAdapter().isEnabled();
    }

    private boolean d(Context context) {
        if (Build.VERSION.SDK_INT < 28) {
            return e(context);
        }
        LocationManager locationManager = (LocationManager) context.getSystemService(LocationManager.class);
        if (locationManager == null) {
            return false;
        }
        return locationManager.isLocationEnabled();
    }

    private static boolean e(Context context) {
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0;
        } catch (Settings.SettingNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(int i10, Context context, a aVar, b bVar) {
        if (context == null) {
            Log.d("permissions_handler", "Context cannot be null.");
            bVar.a("PermissionHandler.ServiceManager", "Android context cannot be null.");
        } else if (i10 == 3 || i10 == 4 || i10 == 5) {
            aVar.a(d(context) ? 1 : 0);
        } else if (i10 == 21) {
            aVar.a(c(context) ? 1 : 0);
        } else {
            int i11 = 1;
            if (i10 == 8) {
                PackageManager packageManager = context.getPackageManager();
                if (!packageManager.hasSystemFeature("android.hardware.telephony")) {
                    aVar.a(2);
                    return;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager == null || telephonyManager.getPhoneType() == 0) {
                    aVar.a(2);
                } else if (b(packageManager).isEmpty()) {
                    aVar.a(2);
                } else if (telephonyManager.getSimState() != 5) {
                    aVar.a(0);
                } else {
                    aVar.a(1);
                }
            } else if (i10 == 16) {
                if (Build.VERSION.SDK_INT < 23) {
                    i11 = 2;
                }
                aVar.a(i11);
            } else {
                aVar.a(2);
            }
        }
    }
}
