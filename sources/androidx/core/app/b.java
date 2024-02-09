package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;

public class b extends androidx.core.content.a {

    /* renamed from: c  reason: collision with root package name */
    private static g f1214c;

    class a implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String[] f1215m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ Activity f1216n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ int f1217o;

        a(String[] strArr, Activity activity, int i10) {
            this.f1215m = strArr;
            this.f1216n = activity;
            this.f1217o = i10;
        }

        public void run() {
            int[] iArr = new int[this.f1215m.length];
            PackageManager packageManager = this.f1216n.getPackageManager();
            String packageName = this.f1216n.getPackageName();
            int length = this.f1215m.length;
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = packageManager.checkPermission(this.f1215m[i10], packageName);
            }
            ((f) this.f1216n).onRequestPermissionsResult(this.f1217o, this.f1215m, iArr);
        }
    }

    /* renamed from: androidx.core.app.b$b  reason: collision with other inner class name */
    static class C0015b {
        static void a(Activity activity) {
            activity.finishAffinity();
        }

        static void b(Activity activity, Intent intent, int i10, Bundle bundle) {
            activity.startActivityForResult(intent, i10, bundle);
        }

        static void c(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
            activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    static class c {
        static void a(Object obj) {
            ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
        }

        static void b(Activity activity, String[] strArr, int i10) {
            activity.requestPermissions(strArr, i10);
        }

        static boolean c(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    static class d {
        static boolean a(Activity activity) {
            return activity.isLaunchedFromBubble();
        }

        @SuppressLint({"BanUncheckedReflection"})
        static boolean b(Activity activity, String str) {
            try {
                PackageManager packageManager = activity.getApplication().getPackageManager();
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", new Class[]{String.class}).invoke(packageManager, new Object[]{str})).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return activity.shouldShowRequestPermissionRationale(str);
            }
        }
    }

    static class e {
        static boolean a(Activity activity, String str) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
    }

    public interface f {
        void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr);
    }

    public interface g {
        boolean a(Activity activity, String[] strArr, int i10);
    }

    public interface h {
        void b(int i10);
    }

    public static void p(Activity activity) {
        C0015b.a(activity);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void q(Activity activity) {
        if (!activity.isFinishing() && !d.i(activity)) {
            activity.recreate();
        }
    }

    public static void r(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new a(activity));
        }
    }

    public static void s(Activity activity, String[] strArr, int i10) {
        g gVar = f1214c;
        if (gVar == null || !gVar.a(activity, strArr, i10)) {
            HashSet hashSet = new HashSet();
            int i11 = 0;
            while (i11 < strArr.length) {
                if (!TextUtils.isEmpty(strArr[i11])) {
                    if (!androidx.core.os.a.c() && TextUtils.equals(strArr[i11], "android.permission.POST_NOTIFICATIONS")) {
                        hashSet.add(Integer.valueOf(i11));
                    }
                    i11++;
                } else {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            int size = hashSet.size();
            String[] strArr2 = size > 0 ? new String[(strArr.length - size)] : strArr;
            if (size > 0) {
                if (size != strArr.length) {
                    int i12 = 0;
                    for (int i13 = 0; i13 < strArr.length; i13++) {
                        if (!hashSet.contains(Integer.valueOf(i13))) {
                            strArr2[i12] = strArr[i13];
                            i12++;
                        }
                    }
                } else {
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof h) {
                    ((h) activity).b(i10);
                }
                c.b(activity, strArr, i10);
            } else if (activity instanceof f) {
                new Handler(Looper.getMainLooper()).post(new a(strArr2, activity, i10));
            }
        }
    }

    public static boolean t(Activity activity, String str) {
        if (!androidx.core.os.a.c() && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 32) {
            return e.a(activity, str);
        }
        if (i10 == 31) {
            return d.b(activity, str);
        }
        if (i10 >= 23) {
            return c.c(activity, str);
        }
        return false;
    }

    public static void u(Activity activity, Intent intent, int i10, Bundle bundle) {
        C0015b.b(activity, intent, i10, bundle);
    }

    public static void v(Activity activity, IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        C0015b.c(activity, intentSender, i10, intent, i11, i12, i13, bundle);
    }
}
