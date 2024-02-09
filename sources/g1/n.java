package g1;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import androidx.core.app.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k7.m;
import k7.p;

final class n implements m, p {

    /* renamed from: m  reason: collision with root package name */
    private b f8852m;

    /* renamed from: n  reason: collision with root package name */
    private Activity f8853n;

    /* renamed from: o  reason: collision with root package name */
    private int f8854o;

    /* renamed from: p  reason: collision with root package name */
    private Map<Integer, Integer> f8855p;

    @FunctionalInterface
    interface a {
        void a(int i10);
    }

    @FunctionalInterface
    interface b {
        void a(Map<Integer, Integer> map);
    }

    @FunctionalInterface
    interface c {
        void a(boolean z9);
    }

    n() {
    }

    private int a(Context context) {
        List<String> b10 = o.b(context, 21);
        if (!(b10 == null || b10.isEmpty())) {
            return 1;
        }
        Log.d("permissions_handler", "Bluetooth permission missing in manifest");
        return 0;
    }

    private int b(Context context) {
        return Build.VERSION.SDK_INT < 33 ? o.f(context).a() ? 1 : 0 : context.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0 ? 1 : 0;
    }

    private int d(int i10, Context context) {
        if (i10 == 17) {
            return b(context);
        }
        if (i10 == 21) {
            return a(context);
        }
        if ((i10 == 30 || i10 == 28 || i10 == 29) && Build.VERSION.SDK_INT < 31) {
            return a(context);
        }
        List<String> b10 = o.b(context, i10);
        if (b10 == null) {
            Log.d("permissions_handler", "No android specific permissions needed for: " + i10);
            return 1;
        } else if (b10.size() == 0) {
            Log.d("permissions_handler", "No permissions found in manifest for: " + b10 + i10);
            if (i10 == 16 && Build.VERSION.SDK_INT < 23) {
                return 2;
            }
            if (i10 != 22 || Build.VERSION.SDK_INT >= 30) {
                return Build.VERSION.SDK_INT < 23 ? 1 : 0;
            }
            return 2;
        } else {
            boolean z9 = context.getApplicationInfo().targetSdkVersion >= 23;
            for (String next : b10) {
                if (z9) {
                    if (i10 == 16) {
                        String packageName = context.getPackageName();
                        PowerManager powerManager = (PowerManager) context.getSystemService("power");
                        if (Build.VERSION.SDK_INT >= 23) {
                            return (powerManager == null || !powerManager.isIgnoringBatteryOptimizations(packageName)) ? 0 : 1;
                        }
                        return 2;
                    } else if (i10 == 22) {
                        if (Build.VERSION.SDK_INT < 30) {
                            return 2;
                        }
                        return Environment.isExternalStorageManager() ? 1 : 0;
                    } else if (i10 == 23 && Build.VERSION.SDK_INT >= 23) {
                        return Settings.canDrawOverlays(context) ? 1 : 0;
                    } else {
                        if (i10 == 24 && Build.VERSION.SDK_INT >= 26) {
                            return context.getPackageManager().canRequestPackageInstalls() ? 1 : 0;
                        }
                        if (i10 == 27 && Build.VERSION.SDK_INT >= 23) {
                            return ((NotificationManager) context.getSystemService("notification")).isNotificationPolicyAccessGranted() ? 1 : 0;
                        }
                        if (i10 == 34) {
                            if (Build.VERSION.SDK_INT >= 31) {
                                return ((AlarmManager) context.getSystemService("alarm")).canScheduleExactAlarms() ? 1 : 0;
                            }
                            return 1;
                        } else if (androidx.core.content.a.a(context, next) != 0) {
                            return 0;
                        }
                    }
                }
            }
            return 1;
        }
    }

    private void e(String str, int i10) {
        Intent intent = new Intent(str);
        if (!str.equals("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS")) {
            intent.setData(Uri.parse("package:" + this.f8853n.getPackageName()));
        }
        this.f8853n.startActivityForResult(intent, i10);
        this.f8854o++;
    }

    /* access modifiers changed from: package-private */
    public void c(int i10, Context context, a aVar) {
        aVar.a(d(i10, context));
    }

    /* access modifiers changed from: package-private */
    public void f(List<Integer> list, Activity activity, b bVar, b bVar2) {
        int i10;
        Map<Integer, Integer> map;
        Map<Integer, Integer> map2;
        int i11;
        int i12;
        String str;
        String str2;
        if (this.f8854o > 0) {
            str2 = "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time).";
        } else if (activity == null) {
            Log.d("permissions_handler", "Unable to detect current Activity.");
            str2 = "Unable to detect current Android Activity.";
        } else {
            this.f8852m = bVar;
            this.f8853n = activity;
            this.f8855p = new HashMap();
            this.f8854o = 0;
            ArrayList arrayList = new ArrayList();
            for (Integer next : list) {
                if (d(next.intValue(), activity) != 1) {
                    List<String> b10 = o.b(activity, next.intValue());
                    if (b10 != null && !b10.isEmpty()) {
                        int i13 = Build.VERSION.SDK_INT;
                        if (i13 >= 23 && next.intValue() == 16) {
                            i12 = 209;
                            str = "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS";
                        } else if (i13 >= 30 && next.intValue() == 22) {
                            i12 = 210;
                            str = "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION";
                        } else if (i13 >= 23 && next.intValue() == 23) {
                            i12 = 211;
                            str = "android.settings.action.MANAGE_OVERLAY_PERMISSION";
                        } else if (i13 >= 26 && next.intValue() == 24) {
                            i12 = 212;
                            str = "android.settings.MANAGE_UNKNOWN_APP_SOURCES";
                        } else if (i13 >= 23 && next.intValue() == 27) {
                            i12 = 213;
                            str = "android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS";
                        } else if (i13 < 31 || next.intValue() != 34) {
                            arrayList.addAll(b10);
                            this.f8854o += b10.size();
                        } else {
                            i12 = 214;
                            str = "android.settings.REQUEST_SCHEDULE_EXACT_ALARM";
                        }
                        e(str, i12);
                    } else if (!this.f8855p.containsKey(next)) {
                        if (next.intValue() != 16 || Build.VERSION.SDK_INT >= 23) {
                            map = this.f8855p;
                            i10 = 0;
                        } else {
                            map = this.f8855p;
                            i10 = 2;
                        }
                        map.put(next, i10);
                        if (next.intValue() != 22 || Build.VERSION.SDK_INT >= 30) {
                            map2 = this.f8855p;
                            i11 = 0;
                        } else {
                            map2 = this.f8855p;
                            i11 = 2;
                        }
                    }
                } else if (!this.f8855p.containsKey(next)) {
                    map2 = this.f8855p;
                    i11 = 1;
                }
                map2.put(next, i11);
            }
            if (arrayList.size() > 0) {
                androidx.core.app.b.s(activity, (String[]) arrayList.toArray(new String[0]), 24);
            }
            if (this.f8854o == 0) {
                this.f8852m.a(this.f8855p);
                return;
            }
            return;
        }
        bVar2.a("PermissionHandler.PermissionManager", str2);
    }

    /* access modifiers changed from: package-private */
    public void g(int i10, Activity activity, c cVar, b bVar) {
        if (activity == null) {
            Log.d("permissions_handler", "Unable to detect current Activity.");
            bVar.a("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.");
            return;
        }
        List<String> b10 = o.b(activity, i10);
        if (b10 == null) {
            Log.d("permissions_handler", "No android specific permissions needed for: " + i10);
            cVar.a(false);
        } else if (b10.isEmpty()) {
            Log.d("permissions_handler", "No permissions found in manifest for: " + i10 + " no need to show request rationale");
            cVar.a(false);
        } else {
            cVar.a(androidx.core.app.b.t(activity, b10.get(0)));
        }
    }

    public boolean m(int i10, int i11, Intent intent) {
        if (i10 != 209 && i10 != 210 && i10 != 211 && i10 != 212 && i10 != 213 && i10 != 214) {
            return false;
        }
        boolean z9 = i11 == -1;
        int i12 = 23;
        if (i10 == 209) {
            i12 = 16;
        } else if (i10 == 210) {
            if (Build.VERSION.SDK_INT < 30) {
                return false;
            }
            z9 = Environment.isExternalStorageManager();
            i12 = 22;
        } else if (i10 == 211) {
            if (Build.VERSION.SDK_INT < 23) {
                return false;
            }
            z9 = Settings.canDrawOverlays(this.f8853n);
        } else if (i10 == 212) {
            if (Build.VERSION.SDK_INT < 26) {
                return false;
            }
            z9 = this.f8853n.getPackageManager().canRequestPackageInstalls();
            i12 = 24;
        } else if (i10 == 213) {
            if (Build.VERSION.SDK_INT < 23) {
                return false;
            }
            z9 = ((NotificationManager) this.f8853n.getSystemService("notification")).isNotificationPolicyAccessGranted();
            i12 = 27;
        } else if (i10 != 214 || Build.VERSION.SDK_INT < 31) {
            return false;
        } else {
            z9 = ((AlarmManager) this.f8853n.getSystemService("alarm")).canScheduleExactAlarms();
            i12 = 34;
        }
        this.f8855p.put(Integer.valueOf(i12), Integer.valueOf(z9 ? 1 : 0));
        int i13 = this.f8854o - 1;
        this.f8854o = i13;
        if (i13 == 0) {
            this.f8852m.a(this.f8855p);
        }
        return true;
    }

    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        int i11;
        int i12;
        Map<Integer, Integer> map;
        Map<Integer, Integer> map2;
        int valueOf;
        if (i10 != 24) {
            this.f8854o = 0;
            return false;
        } else if (this.f8855p == null) {
            return false;
        } else {
            for (int i13 = 0; i13 < strArr.length; i13++) {
                String str = strArr[i13];
                int f10 = o.f(str);
                if (f10 != 20) {
                    int i14 = iArr[i13];
                    if (f10 == 7) {
                        if (!this.f8855p.containsKey(7)) {
                            this.f8855p.put(7, Integer.valueOf(o.h(this.f8853n, str, i14)));
                        }
                        if (!this.f8855p.containsKey(14)) {
                            map2 = this.f8855p;
                            valueOf = 14;
                        }
                        o.i(this.f8853n, f10);
                    } else {
                        if (f10 == 4) {
                            i11 = o.h(this.f8853n, str, i14);
                            if (!this.f8855p.containsKey(4)) {
                                map = this.f8855p;
                                i12 = 4;
                            }
                            o.i(this.f8853n, f10);
                        } else if (f10 == 3) {
                            i11 = o.h(this.f8853n, str, i14);
                            if (Build.VERSION.SDK_INT < 29 && !this.f8855p.containsKey(4)) {
                                this.f8855p.put(4, Integer.valueOf(i11));
                            }
                            if (!this.f8855p.containsKey(5)) {
                                this.f8855p.put(5, Integer.valueOf(i11));
                            }
                            map = this.f8855p;
                            i12 = Integer.valueOf(f10);
                        } else {
                            if (!this.f8855p.containsKey(Integer.valueOf(f10))) {
                                map2 = this.f8855p;
                                valueOf = Integer.valueOf(f10);
                            }
                            o.i(this.f8853n, f10);
                        }
                        map.put(i12, Integer.valueOf(i11));
                        o.i(this.f8853n, f10);
                    }
                    map2.put(valueOf, Integer.valueOf(o.h(this.f8853n, str, i14)));
                    o.i(this.f8853n, f10);
                }
            }
            int length = this.f8854o - iArr.length;
            this.f8854o = length;
            if (length != 0) {
                return true;
            }
            this.f8852m.a(this.f8855p);
            return true;
        }
    }
}
