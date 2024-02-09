package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;

public class a {
    @SuppressLint({"CompileTimeConstant"})

    /* renamed from: a  reason: collision with root package name */
    public static final int f1550a;
    @SuppressLint({"CompileTimeConstant"})

    /* renamed from: b  reason: collision with root package name */
    public static final int f1551b;
    @SuppressLint({"CompileTimeConstant"})

    /* renamed from: c  reason: collision with root package name */
    public static final int f1552c;
    @SuppressLint({"CompileTimeConstant"})

    /* renamed from: d  reason: collision with root package name */
    public static final int f1553d;

    /* renamed from: androidx.core.os.a$a  reason: collision with other inner class name */
    private static final class C0025a {

        /* renamed from: a  reason: collision with root package name */
        static final int f1554a = SdkExtensions.getExtensionVersion(30);

        /* renamed from: b  reason: collision with root package name */
        static final int f1555b = SdkExtensions.getExtensionVersion(31);

        /* renamed from: c  reason: collision with root package name */
        static final int f1556c = SdkExtensions.getExtensionVersion(33);

        /* renamed from: d  reason: collision with root package name */
        static final int f1557d = SdkExtensions.getExtensionVersion(1000000);
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        int i11 = 0;
        f1550a = i10 >= 30 ? C0025a.f1554a : 0;
        f1551b = i10 >= 30 ? C0025a.f1555b : 0;
        f1552c = i10 >= 30 ? C0025a.f1556c : 0;
        if (i10 >= 30) {
            i11 = C0025a.f1557d;
        }
        f1553d = i11;
    }

    protected static boolean a(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    @Deprecated
    public static boolean b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean c() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 33 || (i10 >= 32 && a("Tiramisu", Build.VERSION.CODENAME));
    }
}
