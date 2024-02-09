package com.google.firebase.crashlytics.internal.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import z3.g;

class e {

    /* renamed from: a  reason: collision with root package name */
    private final Float f7289a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f7290b;

    private e(Float f10, boolean z9) {
        this.f7290b = z9;
        this.f7289a = f10;
    }

    public static e a(Context context) {
        Float f10 = null;
        boolean z9 = false;
        try {
            Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z9 = e(registerReceiver);
                f10 = d(registerReceiver);
            }
        } catch (IllegalStateException e10) {
            g.f().e("An error occurred getting battery state.", e10);
        }
        return new e(f10, z9);
    }

    private static Float d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(((float) intExtra) / ((float) intExtra2));
    }

    private static boolean e(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    public Float b() {
        return this.f7289a;
    }

    public int c() {
        Float f10;
        if (!this.f7290b || (f10 = this.f7289a) == null) {
            return 1;
        }
        return ((double) f10.floatValue()) < 0.99d ? 2 : 3;
    }
}
