package y4;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import q4.c;
import t3.b;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f13240a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f13241b;

    /* renamed from: c  reason: collision with root package name */
    private final c f13242c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f13243d = c();

    public a(Context context, String str, c cVar) {
        Context a10 = a(context);
        this.f13240a = a10;
        this.f13241b = a10.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f13242c = cVar;
    }

    private static Context a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : androidx.core.content.a.b(context);
    }

    private boolean c() {
        return this.f13241b.contains("firebase_data_collection_default_enabled") ? this.f13241b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f13240a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f13240a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private synchronized void f(boolean z9) {
        if (this.f13243d != z9) {
            this.f13243d = z9;
            this.f13242c.b(new q4.a(b.class, new b(z9)));
        }
    }

    public synchronized boolean b() {
        return this.f13243d;
    }

    public synchronized void e(Boolean bool) {
        boolean equals;
        if (bool == null) {
            this.f13241b.edit().remove("firebase_data_collection_default_enabled").apply();
            equals = d();
        } else {
            equals = Boolean.TRUE.equals(bool);
            this.f13241b.edit().putBoolean("firebase_data_collection_default_enabled", equals).apply();
        }
        f(equals);
    }
}
