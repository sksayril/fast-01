package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.util.Log;
import androidx.core.content.c;

final class y5 implements t5 {

    /* renamed from: c  reason: collision with root package name */
    private static y5 f5712c;

    /* renamed from: a  reason: collision with root package name */
    private final Context f5713a;

    /* renamed from: b  reason: collision with root package name */
    private final ContentObserver f5714b;

    private y5() {
        this.f5713a = null;
        this.f5714b = null;
    }

    private y5(Context context) {
        this.f5713a = context;
        a6 a6Var = new a6(this, (Handler) null);
        this.f5714b = a6Var;
        context.getContentResolver().registerContentObserver(i5.f5338a, true, a6Var);
    }

    static y5 a(Context context) {
        y5 y5Var;
        synchronized (y5.class) {
            if (f5712c == null) {
                f5712c = c.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new y5(context) : new y5();
            }
            y5Var = f5712c;
        }
        return y5Var;
    }

    static synchronized void b() {
        Context context;
        synchronized (y5.class) {
            y5 y5Var = f5712c;
            if (!(y5Var == null || (context = y5Var.f5713a) == null || y5Var.f5714b == null)) {
                context.getContentResolver().unregisterContentObserver(f5712c.f5714b);
            }
            f5712c = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final String i(String str) {
        Context context = this.f5713a;
        if (context != null && !n5.b(context)) {
            try {
                return (String) w5.a(new x5(this, str));
            } catch (IllegalStateException | NullPointerException | SecurityException e10) {
                Log.e("GservicesLoader", "Unable to read GServices for: " + str, e10);
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String c(String str) {
        return i5.a(this.f5713a.getContentResolver(), str, (String) null);
    }
}
