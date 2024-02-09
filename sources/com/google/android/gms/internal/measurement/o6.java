package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p.a;

public final class o6 implements t5 {

    /* renamed from: g  reason: collision with root package name */
    private static final Map<String, o6> f5482g = new a();

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f5483a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f5484b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedPreferences.OnSharedPreferenceChangeListener f5485c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f5486d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private volatile Map<String, ?> f5487e;

    /* renamed from: f  reason: collision with root package name */
    private final List<q5> f5488f = new ArrayList();

    private o6(SharedPreferences sharedPreferences, Runnable runnable) {
        r6 r6Var = new r6(this);
        this.f5485c = r6Var;
        this.f5483a = sharedPreferences;
        this.f5484b = runnable;
        sharedPreferences.registerOnSharedPreferenceChangeListener(r6Var);
    }

    private static SharedPreferences a(Context context, String str) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (str.startsWith("direct_boot:")) {
                if (n5.a()) {
                    context = context.createDeviceProtectedStorageContext();
                }
                return context.getSharedPreferences(str.substring(12), 0);
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return sharedPreferences;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    static o6 b(Context context, String str, Runnable runnable) {
        o6 o6Var;
        if (!((!n5.a() || str.startsWith("direct_boot:")) ? true : n5.c(context))) {
            return null;
        }
        synchronized (o6.class) {
            Map<String, o6> map = f5482g;
            o6Var = map.get(str);
            if (o6Var == null) {
                o6Var = new o6(a(context, str), runnable);
                map.put(str, o6Var);
            }
        }
        return o6Var;
    }

    static synchronized void c() {
        synchronized (o6.class) {
            for (o6 next : f5482g.values()) {
                next.f5483a.unregisterOnSharedPreferenceChangeListener(next.f5485c);
            }
            f5482g.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f5486d) {
            this.f5487e = null;
            this.f5484b.run();
        }
        synchronized (this) {
            for (q5 zza : this.f5488f) {
                zza.zza();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final Object i(String str) {
        Map<String, ?> map = this.f5487e;
        if (map == null) {
            synchronized (this.f5486d) {
                map = this.f5487e;
                if (map == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        Map<String, ?> all = this.f5483a.getAll();
                        this.f5487e = all;
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = all;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        throw th;
                    }
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
