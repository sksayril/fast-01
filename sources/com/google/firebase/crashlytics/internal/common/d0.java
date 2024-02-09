package com.google.firebase.crashlytics.internal.common;

import android.content.Context;

class d0 {

    /* renamed from: a  reason: collision with root package name */
    private String f7288a;

    d0() {
    }

    private static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    /* access modifiers changed from: package-private */
    public synchronized String a(Context context) {
        if (this.f7288a == null) {
            this.f7288a = b(context);
        }
        return "".equals(this.f7288a) ? null : this.f7288a;
    }
}
