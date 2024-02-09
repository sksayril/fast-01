package l2;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import e2.i;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f11113a;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f11114b;

    /* renamed from: c  reason: collision with root package name */
    private static Boolean f11115c;

    /* renamed from: d  reason: collision with root package name */
    private static Boolean f11116d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f11116d == null) {
            boolean z9 = false;
            if (k.h() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z9 = true;
            }
            f11116d = Boolean.valueOf(z9);
        }
        return f11116d.booleanValue();
    }

    public static boolean b() {
        int i10 = i.f8355a;
        return "user".equals(Build.TYPE);
    }

    @TargetApi(20)
    public static boolean c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f11113a == null) {
            boolean z9 = false;
            if (k.e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z9 = true;
            }
            f11113a = Boolean.valueOf(z9);
        }
        return f11113a.booleanValue();
    }

    @TargetApi(26)
    public static boolean d(Context context) {
        if (c(context) && !k.g()) {
            return true;
        }
        if (e(context)) {
            return !k.h() || k.k();
        }
        return false;
    }

    @TargetApi(21)
    public static boolean e(Context context) {
        if (f11114b == null) {
            boolean z9 = false;
            if (k.f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z9 = true;
            }
            f11114b = Boolean.valueOf(z9);
        }
        return f11114b.booleanValue();
    }

    public static boolean f(Context context) {
        if (f11115c == null) {
            boolean z9 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z9 = false;
            }
            f11115c = Boolean.valueOf(z9);
        }
        return f11115c.booleanValue();
    }
}
