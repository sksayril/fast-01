package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.List;
import z3.f;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f7264a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7265b;

    /* renamed from: c  reason: collision with root package name */
    public final List<f> f7266c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7267d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7268e;

    /* renamed from: f  reason: collision with root package name */
    public final String f7269f;

    /* renamed from: g  reason: collision with root package name */
    public final String f7270g;

    /* renamed from: h  reason: collision with root package name */
    public final f f7271h;

    public a(String str, String str2, List<f> list, String str3, String str4, String str5, String str6, f fVar) {
        this.f7264a = str;
        this.f7265b = str2;
        this.f7266c = list;
        this.f7267d = str3;
        this.f7268e = str4;
        this.f7269f = str5;
        this.f7270g = str6;
        this.f7271h = fVar;
    }

    public static a a(Context context, b0 b0Var, String str, String str2, List<f> list, f fVar) {
        String packageName = context.getPackageName();
        String g10 = b0Var.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String b10 = b(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new a(str, str2, list, g10, packageName, b10, str3, fVar);
    }

    private static String b(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }
}
