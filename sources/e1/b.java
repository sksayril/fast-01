package e1;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import c1.a;
import c1.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import k7.p;

public class b implements p {

    /* renamed from: m  reason: collision with root package name */
    private Activity f8317m;

    /* renamed from: n  reason: collision with root package name */
    private a f8318n;

    /* renamed from: o  reason: collision with root package name */
    private c f8319o;

    private static List<String> b(Context context) {
        boolean b10 = d.b(context, "android.permission.ACCESS_FINE_LOCATION");
        boolean b11 = d.b(context, "android.permission.ACCESS_COARSE_LOCATION");
        if (b10 || b11) {
            ArrayList arrayList = new ArrayList();
            if (b10) {
                arrayList.add("android.permission.ACCESS_FINE_LOCATION");
            }
            if (b11) {
                arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
            }
            return arrayList;
        }
        throw new c();
    }

    private boolean c(String[] strArr, int[] iArr) {
        int e10 = e(strArr, "android.permission.ACCESS_BACKGROUND_LOCATION");
        return e10 >= 0 && iArr[e10] == 0;
    }

    private static <T> int e(T[] tArr, T t9) {
        return Arrays.asList(tArr).indexOf(t9);
    }

    public a a(Context context) {
        char c10;
        List<String> b10 = b(context);
        if (Build.VERSION.SDK_INT < 23) {
            return a.always;
        }
        Iterator<String> it = b10.iterator();
        while (true) {
            if (it.hasNext()) {
                if (androidx.core.content.a.a(context, it.next()) == 0) {
                    c10 = 0;
                    break;
                }
            } else {
                c10 = 65535;
                break;
            }
        }
        return c10 == 65535 ? a.denied : Build.VERSION.SDK_INT < 29 ? a.always : !d.b(context, "android.permission.ACCESS_BACKGROUND_LOCATION") ? a.whileInUse : androidx.core.content.a.a(context, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0 ? a.always : a.whileInUse;
    }

    public boolean d(Context context) {
        a a10 = a(context);
        return a10 == a.whileInUse || a10 == a.always;
    }

    public void f(Activity activity, c cVar, a aVar) {
        if (activity == null) {
            aVar.a(c1.b.activityMissing);
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23) {
            cVar.a(a.always);
            return;
        }
        List<String> b10 = b(activity);
        if (i10 >= 29 && d.b(activity, "android.permission.ACCESS_BACKGROUND_LOCATION") && a(activity) == a.whileInUse) {
            b10.add("android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        this.f8318n = aVar;
        this.f8319o = cVar;
        this.f8317m = activity;
        androidx.core.app.b.s(activity, (String[]) b10.toArray(new String[0]), 109);
    }

    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 != 109) {
            return false;
        }
        Activity activity = this.f8317m;
        if (activity == null) {
            Log.e("Geolocator", "Trying to process permission result without an valid Activity instance");
            a aVar = this.f8318n;
            if (aVar != null) {
                aVar.a(c1.b.activityMissing);
            }
            return false;
        }
        try {
            List<String> b10 = b(activity);
            if (iArr.length == 0) {
                Log.i("Geolocator", "The grantResults array is empty. This can happen when the user cancels the permission request");
                return false;
            }
            a aVar2 = a.denied;
            char c10 = 65535;
            boolean z9 = false;
            boolean z10 = false;
            for (String next : b10) {
                int e10 = e(strArr, next);
                if (e10 >= 0) {
                    z9 = true;
                }
                if (iArr[e10] == 0) {
                    c10 = 0;
                }
                if (androidx.core.app.b.t(this.f8317m, next)) {
                    z10 = true;
                }
            }
            if (!z9) {
                Log.w("Geolocator", "Location permissions not part of permissions send to onRequestPermissionsResult method.");
                return false;
            }
            if (c10 == 0) {
                aVar2 = (Build.VERSION.SDK_INT < 29 || c(strArr, iArr)) ? a.always : a.whileInUse;
            } else if (!z10) {
                aVar2 = a.deniedForever;
            }
            c cVar = this.f8319o;
            if (cVar != null) {
                cVar.a(aVar2);
            }
            return true;
        } catch (c unused) {
            a aVar3 = this.f8318n;
            if (aVar3 != null) {
                aVar3.a(c1.b.permissionDefinitionsNotFound);
            }
            return false;
        }
    }
}
