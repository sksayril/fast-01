package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import e2.k;
import h2.p;

public final class g6 {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f6050a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6051b;

    public g6(Context context, String str) {
        p.j(context);
        this.f6050a = context.getResources();
        if (!TextUtils.isEmpty(str)) {
            this.f6051b = str;
        } else {
            this.f6051b = a(context);
        }
    }

    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(k.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public final String b(String str) {
        int identifier = this.f6050a.getIdentifier(str, "string", this.f6051b);
        if (identifier == 0) {
            return null;
        }
        try {
            return this.f6050a.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
