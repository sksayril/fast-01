package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import p3.g;

public final class d6 {

    /* renamed from: a  reason: collision with root package name */
    private static volatile g<Boolean> f5186a = g.a();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f5187b = new Object();

    private static boolean a(Context context) {
        try {
            return (context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean b(Context context, Uri uri) {
        boolean z9;
        String authority = uri.getAuthority();
        boolean z10 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", authority + " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            return false;
        }
        if (!f5186a.c()) {
            synchronized (f5187b) {
                if (f5186a.c()) {
                    boolean booleanValue = f5186a.b().booleanValue();
                    return booleanValue;
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                    if (resolveContentProvider == null || !"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        z9 = false;
                        if (z9 && a(context)) {
                            z10 = true;
                        }
                        f5186a = g.d(Boolean.valueOf(z10));
                    }
                }
                z9 = true;
                z10 = true;
                f5186a = g.d(Boolean.valueOf(z10));
            }
        }
        return f5186a.b().booleanValue();
    }
}
