package g1;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.core.app.b;
import f.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class o {
    private static String a(Context context, String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && d(context, (ArrayList<String>) null, str)) {
            return str;
        }
        if (i10 < 29) {
            if (d(context, (ArrayList<String>) null, "android.permission.ACCESS_FINE_LOCATION")) {
                return "android.permission.ACCESS_FINE_LOCATION";
            }
            if (d(context, (ArrayList<String>) null, "android.permission.ACCESS_COARSE_LOCATION")) {
                return "android.permission.ACCESS_COARSE_LOCATION";
            }
            return null;
        } else if (i10 < 29 || !d(context, (ArrayList<String>) null, "android.permission.ACCESS_FINE_LOCATION")) {
            return null;
        } else {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x016e, code lost:
        if (d(r5, r0, r6) != false) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01f4, code lost:
        if (d(r5, r0, r6) != false) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x024a, code lost:
        if (d(r5, r0, r6) != false) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x024c, code lost:
        r0.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0261, code lost:
        if (d(r5, r0, r6) != false) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0064, code lost:
        if (r5 != null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006d, code lost:
        if (r5 != null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0076, code lost:
        if (r5 != null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0078, code lost:
        r0.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a1, code lost:
        if (d(r5, r0, r6) != false) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00bc, code lost:
        if (d(r5, r0, r6) != false) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00db, code lost:
        if (d(r5, r0, r6) != false) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00e9, code lost:
        if (d(r5, r0, r6) != false) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f7, code lost:
        if (d(r5, r0, r6) != false) goto L_0x024c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0160, code lost:
        if (d(r5, r0, r6) != false) goto L_0x024c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.List<java.lang.String> b(android.content.Context r5, int r6) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 23
            r2 = 0
            r3 = 33
            r4 = 29
            switch(r6) {
                case 0: goto L_0x0250;
                case 1: goto L_0x0244;
                case 2: goto L_0x0222;
                case 3: goto L_0x01f8;
                case 4: goto L_0x01f8;
                case 5: goto L_0x01f8;
                case 6: goto L_0x01f7;
                case 7: goto L_0x01ee;
                case 8: goto L_0x0172;
                case 9: goto L_0x0164;
                case 10: goto L_0x000f;
                case 11: goto L_0x01f7;
                case 12: goto L_0x015a;
                case 13: goto L_0x011e;
                case 14: goto L_0x01ee;
                case 15: goto L_0x00fb;
                case 16: goto L_0x00ed;
                case 17: goto L_0x00df;
                case 18: goto L_0x00d0;
                case 19: goto L_0x00c0;
                case 20: goto L_0x01f7;
                case 21: goto L_0x00b6;
                case 22: goto L_0x00a5;
                case 23: goto L_0x009b;
                case 24: goto L_0x008c;
                case 25: goto L_0x000f;
                case 26: goto L_0x000f;
                case 27: goto L_0x007d;
                case 28: goto L_0x0070;
                case 29: goto L_0x0067;
                case 30: goto L_0x005e;
                case 31: goto L_0x004f;
                case 32: goto L_0x0040;
                case 33: goto L_0x0031;
                case 34: goto L_0x0020;
                case 35: goto L_0x0011;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x0264
        L_0x0011:
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r3) goto L_0x0264
            java.lang.String r6 = "android.permission.BODY_SENSORS_BACKGROUND"
            boolean r5 = d(r5, r0, r6)
            if (r5 == 0) goto L_0x0264
            java.lang.String r5 = "android.permission.BODY_SENSORS_BACKGROUND"
            goto L_0x0078
        L_0x0020:
            int r6 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r6 < r1) goto L_0x0264
            java.lang.String r6 = "android.permission.SCHEDULE_EXACT_ALARM"
            boolean r5 = d(r5, r0, r6)
            if (r5 == 0) goto L_0x0264
            java.lang.String r5 = "android.permission.SCHEDULE_EXACT_ALARM"
            goto L_0x0078
        L_0x0031:
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r3) goto L_0x0264
            java.lang.String r6 = "android.permission.READ_MEDIA_AUDIO"
            boolean r5 = d(r5, r0, r6)
            if (r5 == 0) goto L_0x0264
            java.lang.String r5 = "android.permission.READ_MEDIA_AUDIO"
            goto L_0x0078
        L_0x0040:
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r3) goto L_0x0264
            java.lang.String r6 = "android.permission.READ_MEDIA_VIDEO"
            boolean r5 = d(r5, r0, r6)
            if (r5 == 0) goto L_0x0264
            java.lang.String r5 = "android.permission.READ_MEDIA_VIDEO"
            goto L_0x0078
        L_0x004f:
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r3) goto L_0x0264
            java.lang.String r6 = "android.permission.NEARBY_WIFI_DEVICES"
            boolean r5 = d(r5, r0, r6)
            if (r5 == 0) goto L_0x0264
            java.lang.String r5 = "android.permission.NEARBY_WIFI_DEVICES"
            goto L_0x0078
        L_0x005e:
            java.lang.String r6 = "android.permission.BLUETOOTH_CONNECT"
            java.lang.String r5 = a(r5, r6)
            if (r5 == 0) goto L_0x0264
            goto L_0x006f
        L_0x0067:
            java.lang.String r6 = "android.permission.BLUETOOTH_ADVERTISE"
            java.lang.String r5 = a(r5, r6)
            if (r5 == 0) goto L_0x0264
        L_0x006f:
            goto L_0x0078
        L_0x0070:
            java.lang.String r6 = "android.permission.BLUETOOTH_SCAN"
            java.lang.String r5 = a(r5, r6)
            if (r5 == 0) goto L_0x0264
        L_0x0078:
            r0.add(r5)
            goto L_0x0264
        L_0x007d:
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r1) goto L_0x0264
            java.lang.String r6 = "android.permission.ACCESS_NOTIFICATION_POLICY"
            boolean r5 = d(r5, r0, r6)
            if (r5 == 0) goto L_0x0264
            java.lang.String r5 = "android.permission.ACCESS_NOTIFICATION_POLICY"
            goto L_0x0078
        L_0x008c:
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r1) goto L_0x0264
            java.lang.String r6 = "android.permission.REQUEST_INSTALL_PACKAGES"
            boolean r5 = d(r5, r0, r6)
            if (r5 == 0) goto L_0x0264
            java.lang.String r5 = "android.permission.REQUEST_INSTALL_PACKAGES"
            goto L_0x0078
        L_0x009b:
            java.lang.String r6 = "android.permission.SYSTEM_ALERT_WINDOW"
            boolean r5 = d(r5, r0, r6)
            if (r5 == 0) goto L_0x0264
            goto L_0x024c
        L_0x00a5:
            int r6 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r6 < r1) goto L_0x0264
            java.lang.String r6 = "android.permission.MANAGE_EXTERNAL_STORAGE"
            boolean r5 = d(r5, r0, r6)
            if (r5 == 0) goto L_0x0264
            java.lang.String r5 = "android.permission.MANAGE_EXTERNAL_STORAGE"
            goto L_0x0078
        L_0x00b6:
            java.lang.String r6 = "android.permission.BLUETOOTH"
            boolean r5 = d(r5, r0, r6)
            if (r5 == 0) goto L_0x0264
            goto L_0x024c
        L_0x00c0:
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 >= r4) goto L_0x00c5
            return r2
        L_0x00c5:
            java.lang.String r6 = "android.permission.ACTIVITY_RECOGNITION"
            boolean r5 = d(r5, r0, r6)
            if (r5 == 0) goto L_0x0264
            java.lang.String r5 = "android.permission.ACTIVITY_RECOGNITION"
            goto L_0x0078
        L_0x00d0:
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 >= r4) goto L_0x00d5
            return r2
        L_0x00d5:
            java.lang.String r6 = "android.permission.ACCESS_MEDIA_LOCATION"
            boolean r5 = d(r5, r0, r6)
            if (r5 == 0) goto L_0x0264
            goto L_0x024c
        L_0x00df:
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r3) goto L_0x0264
            java.lang.String r6 = "android.permission.POST_NOTIFICATIONS"
            boolean r5 = d(r5, r0, r6)
            if (r5 == 0) goto L_0x0264
            goto L_0x024c
        L_0x00ed:
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r1) goto L_0x0264
            java.lang.String r6 = "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS"
            boolean r5 = d(r5, r0, r6)
            if (r5 == 0) goto L_0x0264
            goto L_0x024c
        L_0x00fb:
            java.lang.String r6 = "android.permission.READ_EXTERNAL_STORAGE"
            boolean r1 = d(r5, r0, r6)
            if (r1 == 0) goto L_0x0106
            r0.add(r6)
        L_0x0106:
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r4) goto L_0x0112
            if (r6 != r4) goto L_0x0264
            boolean r6 = android.os.Environment.isExternalStorageLegacy()
            if (r6 == 0) goto L_0x0264
        L_0x0112:
            java.lang.String r6 = "android.permission.WRITE_EXTERNAL_STORAGE"
            boolean r5 = d(r5, r0, r6)
            if (r5 == 0) goto L_0x0264
            java.lang.String r5 = "android.permission.WRITE_EXTERNAL_STORAGE"
            goto L_0x0078
        L_0x011e:
            java.lang.String r6 = "android.permission.SEND_SMS"
            boolean r1 = d(r5, r0, r6)
            if (r1 == 0) goto L_0x0129
            r0.add(r6)
        L_0x0129:
            java.lang.String r6 = "android.permission.RECEIVE_SMS"
            boolean r1 = d(r5, r0, r6)
            if (r1 == 0) goto L_0x0134
            r0.add(r6)
        L_0x0134:
            java.lang.String r6 = "android.permission.READ_SMS"
            boolean r6 = d(r5, r0, r6)
            if (r6 == 0) goto L_0x0141
            java.lang.String r6 = "android.permission.READ_SMS"
            r0.add(r6)
        L_0x0141:
            java.lang.String r6 = "android.permission.RECEIVE_WAP_PUSH"
            boolean r6 = d(r5, r0, r6)
            if (r6 == 0) goto L_0x014e
            java.lang.String r6 = "android.permission.RECEIVE_WAP_PUSH"
            r0.add(r6)
        L_0x014e:
            java.lang.String r6 = "android.permission.RECEIVE_MMS"
            boolean r5 = d(r5, r0, r6)
            if (r5 == 0) goto L_0x0264
            java.lang.String r5 = "android.permission.RECEIVE_MMS"
            goto L_0x0078
        L_0x015a:
            java.lang.String r6 = "android.permission.BODY_SENSORS"
            boolean r5 = d(r5, r0, r6)
            if (r5 == 0) goto L_0x0264
            goto L_0x024c
        L_0x0164:
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r3) goto L_0x0264
            java.lang.String r6 = "android.permission.READ_MEDIA_IMAGES"
            boolean r5 = d(r5, r0, r6)
            if (r5 == 0) goto L_0x0264
            goto L_0x024c
        L_0x0172:
            java.lang.String r6 = "android.permission.READ_PHONE_STATE"
            boolean r1 = d(r5, r0, r6)
            if (r1 == 0) goto L_0x017d
            r0.add(r6)
        L_0x017d:
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 <= r4) goto L_0x018e
            java.lang.String r1 = "android.permission.READ_PHONE_NUMBERS"
            boolean r1 = d(r5, r0, r1)
            if (r1 == 0) goto L_0x018e
            java.lang.String r1 = "android.permission.READ_PHONE_NUMBERS"
            r0.add(r1)
        L_0x018e:
            java.lang.String r1 = "android.permission.CALL_PHONE"
            boolean r1 = d(r5, r0, r1)
            if (r1 == 0) goto L_0x019b
            java.lang.String r1 = "android.permission.CALL_PHONE"
            r0.add(r1)
        L_0x019b:
            java.lang.String r1 = "android.permission.READ_CALL_LOG"
            boolean r1 = d(r5, r0, r1)
            if (r1 == 0) goto L_0x01a8
            java.lang.String r1 = "android.permission.READ_CALL_LOG"
            r0.add(r1)
        L_0x01a8:
            java.lang.String r1 = "android.permission.WRITE_CALL_LOG"
            boolean r1 = d(r5, r0, r1)
            if (r1 == 0) goto L_0x01b5
            java.lang.String r1 = "android.permission.WRITE_CALL_LOG"
            r0.add(r1)
        L_0x01b5:
            java.lang.String r1 = "com.android.voicemail.permission.ADD_VOICEMAIL"
            boolean r1 = d(r5, r0, r1)
            if (r1 == 0) goto L_0x01c2
            java.lang.String r1 = "com.android.voicemail.permission.ADD_VOICEMAIL"
            r0.add(r1)
        L_0x01c2:
            java.lang.String r1 = "android.permission.USE_SIP"
            boolean r1 = d(r5, r0, r1)
            if (r1 == 0) goto L_0x01cf
            java.lang.String r1 = "android.permission.USE_SIP"
            r0.add(r1)
        L_0x01cf:
            if (r6 < r4) goto L_0x01de
            java.lang.String r1 = "android.permission.BIND_CALL_REDIRECTION_SERVICE"
            boolean r1 = d(r5, r0, r1)
            if (r1 == 0) goto L_0x01de
            java.lang.String r1 = "android.permission.BIND_CALL_REDIRECTION_SERVICE"
            r0.add(r1)
        L_0x01de:
            r1 = 26
            if (r6 < r1) goto L_0x0264
            java.lang.String r6 = "android.permission.ANSWER_PHONE_CALLS"
            boolean r5 = d(r5, r0, r6)
            if (r5 == 0) goto L_0x0264
            java.lang.String r5 = "android.permission.ANSWER_PHONE_CALLS"
            goto L_0x0078
        L_0x01ee:
            java.lang.String r6 = "android.permission.RECORD_AUDIO"
            boolean r5 = d(r5, r0, r6)
            if (r5 == 0) goto L_0x0264
            goto L_0x024c
        L_0x01f7:
            return r2
        L_0x01f8:
            r1 = 4
            if (r6 != r1) goto L_0x020b
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r4) goto L_0x020b
            java.lang.String r6 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            boolean r5 = d(r5, r0, r6)
            if (r5 == 0) goto L_0x0264
            java.lang.String r5 = "android.permission.ACCESS_BACKGROUND_LOCATION"
            goto L_0x0078
        L_0x020b:
            java.lang.String r6 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r1 = d(r5, r0, r6)
            if (r1 == 0) goto L_0x0216
            r0.add(r6)
        L_0x0216:
            java.lang.String r6 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r5 = d(r5, r0, r6)
            if (r5 == 0) goto L_0x0264
            java.lang.String r5 = "android.permission.ACCESS_FINE_LOCATION"
            goto L_0x0078
        L_0x0222:
            java.lang.String r6 = "android.permission.READ_CONTACTS"
            boolean r1 = d(r5, r0, r6)
            if (r1 == 0) goto L_0x022d
            r0.add(r6)
        L_0x022d:
            java.lang.String r6 = "android.permission.WRITE_CONTACTS"
            boolean r1 = d(r5, r0, r6)
            if (r1 == 0) goto L_0x0238
            r0.add(r6)
        L_0x0238:
            java.lang.String r6 = "android.permission.GET_ACCOUNTS"
            boolean r5 = d(r5, r0, r6)
            if (r5 == 0) goto L_0x0264
            java.lang.String r5 = "android.permission.GET_ACCOUNTS"
            goto L_0x0078
        L_0x0244:
            java.lang.String r6 = "android.permission.CAMERA"
            boolean r5 = d(r5, r0, r6)
            if (r5 == 0) goto L_0x0264
        L_0x024c:
            r0.add(r6)
            goto L_0x0264
        L_0x0250:
            java.lang.String r6 = "android.permission.READ_CALENDAR"
            boolean r1 = d(r5, r0, r6)
            if (r1 == 0) goto L_0x025b
            r0.add(r6)
        L_0x025b:
            java.lang.String r6 = "android.permission.WRITE_CALENDAR"
            boolean r5 = d(r5, r0, r6)
            if (r5 == 0) goto L_0x0264
            goto L_0x024c
        L_0x0264:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g1.o.b(android.content.Context, int):java.util.List");
    }

    private static PackageInfo c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        int i10 = Build.VERSION.SDK_INT;
        String packageName = context.getPackageName();
        return i10 >= 33 ? packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(4096)) : packageManager.getPackageInfo(packageName, 4096);
    }

    private static boolean d(Context context, ArrayList<String> arrayList, String str) {
        if (arrayList != null) {
            try {
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().equals(str)) {
                        return true;
                    }
                }
            } catch (Exception e10) {
                Log.d("permissions_handler", "Unable to check manifest for permission: ", e10);
            }
        }
        if (context == null) {
            Log.d("permissions_handler", "Unable to detect current Activity or App Context.");
            return false;
        }
        PackageInfo c10 = c(context);
        if (c10 == null) {
            Log.d("permissions_handler", "Unable to get Package info, will not be able to determine permissions to request.");
            return false;
        }
        Iterator it2 = new ArrayList(Arrays.asList(c10.requestedPermissions)).iterator();
        while (it2.hasNext()) {
            if (((String) it2.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }

    static boolean e(Activity activity, String str) {
        if (activity == null) {
            return false;
        }
        return !b.t(activity, str);
    }

    static int f(String str) {
        String str2 = str;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2062386608:
                if (str2.equals("android.permission.READ_SMS")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1928411001:
                if (str2.equals("android.permission.READ_CALENDAR")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1925850455:
                if (str2.equals("android.permission.POST_NOTIFICATIONS")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1921431796:
                if (str2.equals("android.permission.READ_CALL_LOG")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1888586689:
                if (str2.equals("android.permission.ACCESS_FINE_LOCATION")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1813079487:
                if (str2.equals("android.permission.MANAGE_EXTERNAL_STORAGE")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1783097621:
                if (str2.equals("android.permission.ACCESS_NOTIFICATION_POLICY")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1561629405:
                if (str2.equals("android.permission.SYSTEM_ALERT_WINDOW")) {
                    c10 = 7;
                    break;
                }
                break;
            case -1479758289:
                if (str2.equals("android.permission.RECEIVE_WAP_PUSH")) {
                    c10 = 8;
                    break;
                }
                break;
            case -1238066820:
                if (str2.equals("android.permission.BODY_SENSORS")) {
                    c10 = 9;
                    break;
                }
                break;
            case -1164582768:
                if (str2.equals("android.permission.READ_PHONE_NUMBERS")) {
                    c10 = 10;
                    break;
                }
                break;
            case -909527021:
                if (str2.equals("android.permission.NEARBY_WIFI_DEVICES")) {
                    c10 = 11;
                    break;
                }
                break;
            case -901151997:
                if (str2.equals("android.permission.BIND_CALL_REDIRECTION_SERVICE")) {
                    c10 = 12;
                    break;
                }
                break;
            case -895679497:
                if (str2.equals("android.permission.RECEIVE_MMS")) {
                    c10 = 13;
                    break;
                }
                break;
            case -895673731:
                if (str2.equals("android.permission.RECEIVE_SMS")) {
                    c10 = 14;
                    break;
                }
                break;
            case -798669607:
                if (str2.equals("android.permission.BLUETOOTH_CONNECT")) {
                    c10 = 15;
                    break;
                }
                break;
            case -406040016:
                if (str2.equals("android.permission.READ_EXTERNAL_STORAGE")) {
                    c10 = 16;
                    break;
                }
                break;
            case -63024214:
                if (str2.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                    c10 = 17;
                    break;
                }
                break;
            case -5573545:
                if (str2.equals("android.permission.READ_PHONE_STATE")) {
                    c10 = 18;
                    break;
                }
                break;
            case 52602690:
                if (str2.equals("android.permission.SEND_SMS")) {
                    c10 = 19;
                    break;
                }
                break;
            case 112197485:
                if (str2.equals("android.permission.CALL_PHONE")) {
                    c10 = 20;
                    break;
                }
                break;
            case 175802396:
                if (str2.equals("android.permission.READ_MEDIA_IMAGES")) {
                    c10 = 21;
                    break;
                }
                break;
            case 214526995:
                if (str2.equals("android.permission.WRITE_CONTACTS")) {
                    c10 = 22;
                    break;
                }
                break;
            case 361658321:
                if (str2.equals("android.permission.BODY_SENSORS_BACKGROUND")) {
                    c10 = 23;
                    break;
                }
                break;
            case 463403621:
                if (str2.equals("android.permission.CAMERA")) {
                    c10 = 24;
                    break;
                }
                break;
            case 603653886:
                if (str2.equals("android.permission.WRITE_CALENDAR")) {
                    c10 = 25;
                    break;
                }
                break;
            case 610633091:
                if (str2.equals("android.permission.WRITE_CALL_LOG")) {
                    c10 = 26;
                    break;
                }
                break;
            case 691260818:
                if (str2.equals("android.permission.READ_MEDIA_AUDIO")) {
                    c10 = 27;
                    break;
                }
                break;
            case 710297143:
                if (str2.equals("android.permission.READ_MEDIA_VIDEO")) {
                    c10 = 28;
                    break;
                }
                break;
            case 784519842:
                if (str2.equals("android.permission.USE_SIP")) {
                    c10 = 29;
                    break;
                }
                break;
            case 970694249:
                if (str2.equals("android.permission.SCHEDULE_EXACT_ALARM")) {
                    c10 = 30;
                    break;
                }
                break;
            case 1166454870:
                if (str2.equals("android.permission.BLUETOOTH_ADVERTISE")) {
                    c10 = 31;
                    break;
                }
                break;
            case 1271781903:
                if (str2.equals("android.permission.GET_ACCOUNTS")) {
                    c10 = ' ';
                    break;
                }
                break;
            case 1365911975:
                if (str2.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    c10 = '!';
                    break;
                }
                break;
            case 1777263169:
                if (str2.equals("android.permission.REQUEST_INSTALL_PACKAGES")) {
                    c10 = '\"';
                    break;
                }
                break;
            case 1780337063:
                if (str2.equals("android.permission.ACTIVITY_RECOGNITION")) {
                    c10 = '#';
                    break;
                }
                break;
            case 1831139720:
                if (str2.equals("android.permission.RECORD_AUDIO")) {
                    c10 = '$';
                    break;
                }
                break;
            case 1977429404:
                if (str2.equals("android.permission.READ_CONTACTS")) {
                    c10 = '%';
                    break;
                }
                break;
            case 2024715147:
                if (str2.equals("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    c10 = '&';
                    break;
                }
                break;
            case 2062356686:
                if (str2.equals("android.permission.BLUETOOTH_SCAN")) {
                    c10 = '\'';
                    break;
                }
                break;
            case 2114579147:
                if (str2.equals("android.permission.ACCESS_MEDIA_LOCATION")) {
                    c10 = '(';
                    break;
                }
                break;
            case 2133799037:
                if (str2.equals("com.android.voicemail.permission.ADD_VOICEMAIL")) {
                    c10 = ')';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 8:
            case 13:
            case 14:
            case 19:
                return 13;
            case 1:
            case 25:
                return 0;
            case 2:
                return 17;
            case 3:
            case 10:
            case 12:
            case 18:
            case 20:
            case 26:
            case j.f8692u3:
            case ')':
                return 8;
            case 4:
            case 17:
                return 3;
            case 5:
                return 22;
            case 6:
                return 27;
            case 7:
                return 23;
            case 9:
                return 12;
            case 11:
                return 31;
            case 15:
                return 30;
            case 16:
            case '!':
                return 15;
            case 21:
                return 9;
            case 22:
            case ' ':
            case '%':
                return 2;
            case j.f8662o3:
                return 35;
            case j.f8667p3:
                return 1;
            case 27:
                return 33;
            case 28:
                return 32;
            case 30:
                return 34;
            case 31:
                return 29;
            case '\"':
                return 24;
            case '#':
                return 19;
            case '$':
                return 7;
            case '&':
                return 4;
            case '\'':
                return 28;
            case '(':
                return 18;
            default:
                return 20;
        }
    }

    private static void g(Context context, String str) {
        context.getSharedPreferences(str, 0).edit().putBoolean("sp_permission_handler_permission_was_denied_before", true).apply();
    }

    static int h(Activity activity, String str, int i10) {
        boolean z9 = true;
        if (i10 != -1) {
            return 1;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return 0;
        }
        boolean j10 = j(activity, str);
        boolean z10 = !e(activity, str);
        if (!j10) {
            z9 = z10;
        } else if (z10) {
            z9 = false;
        }
        if (!j10 && z9) {
            g(activity, str);
        }
        return (!j10 || !z9) ? 0 : 4;
    }

    static void i(Activity activity, int i10) {
        List<String> b10;
        if (activity != null && (b10 = b(activity, i10)) != null) {
            b10.isEmpty();
        }
    }

    private static boolean j(Context context, String str) {
        return context.getSharedPreferences(str, 0).getBoolean("sp_permission_handler_permission_was_denied_before", false);
    }
}
