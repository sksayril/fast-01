package com.google.firebase.crashlytics.internal.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import d3.j;
import d3.k;
import java.util.concurrent.Executor;
import t3.f;
import z3.g;

public class x {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f7426a;

    /* renamed from: b  reason: collision with root package name */
    private final f f7427b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f7428c;

    /* renamed from: d  reason: collision with root package name */
    k<Void> f7429d = new k<>();

    /* renamed from: e  reason: collision with root package name */
    boolean f7430e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7431f = false;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f7432g;

    /* renamed from: h  reason: collision with root package name */
    private final k<Void> f7433h = new k<>();

    public x(f fVar) {
        Object obj = new Object();
        this.f7428c = obj;
        Context m10 = fVar.m();
        this.f7427b = fVar;
        this.f7426a = i.q(m10);
        Boolean b10 = b();
        this.f7432g = b10 == null ? a(m10) : b10;
        synchronized (obj) {
            if (d()) {
                this.f7429d.e(null);
                this.f7430e = true;
            }
        }
    }

    private Boolean a(Context context) {
        Boolean g10 = g(context);
        if (g10 == null) {
            this.f7431f = false;
            return null;
        }
        this.f7431f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(g10));
    }

    private Boolean b() {
        if (!this.f7426a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f7431f = false;
        return Boolean.valueOf(this.f7426a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    private boolean e() {
        try {
            return this.f7427b.x();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    private void f(boolean z9) {
        g.f().b(String.format("Crashlytics automatic data collection %s by %s.", new Object[]{z9 ? "ENABLED" : "DISABLED", this.f7432g == null ? "global Firebase setting" : this.f7431f ? "firebase_crashlytics_collection_enabled manifest flag" : "API"}));
    }

    private static Boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e10) {
            g.f().e("Could not read data collection permission from manifest", e10);
            return null;
        }
    }

    @SuppressLint({"ApplySharedPref"})
    private static void i(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (bool != null) {
            edit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            edit.remove("firebase_crashlytics_collection_enabled");
        }
        edit.apply();
    }

    public void c(boolean z9) {
        if (z9) {
            this.f7433h.e(null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    public synchronized boolean d() {
        boolean booleanValue;
        Boolean bool = this.f7432g;
        booleanValue = bool != null ? bool.booleanValue() : e();
        f(booleanValue);
        return booleanValue;
    }

    public synchronized void h(Boolean bool) {
        if (bool != null) {
            try {
                this.f7431f = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f7432g = bool != null ? bool : a(this.f7427b.m());
        i(this.f7426a, bool);
        synchronized (this.f7428c) {
            if (d()) {
                if (!this.f7430e) {
                    this.f7429d.e(null);
                    this.f7430e = true;
                }
            } else if (this.f7430e) {
                this.f7429d = new k<>();
                this.f7430e = false;
            }
        }
    }

    public j<Void> j() {
        j<Void> a10;
        synchronized (this.f7428c) {
            a10 = this.f7429d.a();
        }
        return a10;
    }

    public j<Void> k(Executor executor) {
        return q0.o(executor, this.f7433h.a(), j());
    }
}
