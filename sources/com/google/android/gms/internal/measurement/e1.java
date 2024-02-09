package com.google.android.gms.internal.measurement;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

public final class e1 {

    /* renamed from: a  reason: collision with root package name */
    private static final int f5202a;

    /* renamed from: b  reason: collision with root package name */
    public static final int f5203b;

    static {
        int i10 = Build.VERSION.SDK_INT;
        int i11 = 0;
        f5202a = i10 >= 23 ? 67108864 : 0;
        if (i10 >= 31) {
            i11 = 33554432;
        }
        f5203b = i11;
    }

    public static PendingIntent a(Context context, int i10, Intent intent, int i11) {
        return PendingIntent.getBroadcast(context, 0, intent, i11);
    }
}
