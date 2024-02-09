package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p.a;
import p3.h;

public final class p5 implements t5 {

    /* renamed from: h  reason: collision with root package name */
    private static final Map<Uri, p5> f5501h = new a();

    /* renamed from: i  reason: collision with root package name */
    private static final String[] f5502i = {"key", "value"};

    /* renamed from: a  reason: collision with root package name */
    private final ContentResolver f5503a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f5504b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f5505c;

    /* renamed from: d  reason: collision with root package name */
    private final ContentObserver f5506d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f5507e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private volatile Map<String, String> f5508f;

    /* renamed from: g  reason: collision with root package name */
    private final List<q5> f5509g = new ArrayList();

    private p5(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        s5 s5Var = new s5(this, (Handler) null);
        this.f5506d = s5Var;
        h.i(contentResolver);
        h.i(uri);
        this.f5503a = contentResolver;
        this.f5504b = uri;
        this.f5505c = runnable;
        contentResolver.registerContentObserver(uri, false, s5Var);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0016 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.measurement.p5 a(android.content.ContentResolver r4, android.net.Uri r5, java.lang.Runnable r6) {
        /*
            java.lang.Class<com.google.android.gms.internal.measurement.p5> r0 = com.google.android.gms.internal.measurement.p5.class
            monitor-enter(r0)
            java.util.Map<android.net.Uri, com.google.android.gms.internal.measurement.p5> r1 = f5501h     // Catch:{ all -> 0x0018 }
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0018 }
            com.google.android.gms.internal.measurement.p5 r2 = (com.google.android.gms.internal.measurement.p5) r2     // Catch:{ all -> 0x0018 }
            if (r2 != 0) goto L_0x0016
            com.google.android.gms.internal.measurement.p5 r3 = new com.google.android.gms.internal.measurement.p5     // Catch:{ SecurityException -> 0x0016 }
            r3.<init>(r4, r5, r6)     // Catch:{ SecurityException -> 0x0016 }
            r1.put(r5, r3)     // Catch:{ SecurityException -> 0x0015 }
        L_0x0015:
            r2 = r3
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            return r2
        L_0x0018:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.p5.a(android.content.ContentResolver, android.net.Uri, java.lang.Runnable):com.google.android.gms.internal.measurement.p5");
    }

    static synchronized void d() {
        synchronized (p5.class) {
            for (p5 next : f5501h.values()) {
                next.f5503a.unregisterContentObserver(next.f5506d);
            }
            f5501h.clear();
        }
    }

    /* JADX INFO: finally extract failed */
    private final Map<String, String> f() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Map<String, String> map = (Map) w5.a(new o5(this));
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return map;
        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
            Log.e("ConfigurationContentLdr", "PhenotypeFlag unable to load ContentProvider, using default values");
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return null;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    public final Map<String, String> b() {
        Map<String, String> map = this.f5508f;
        if (map == null) {
            synchronized (this.f5507e) {
                map = this.f5508f;
                if (map == null) {
                    map = f();
                    this.f5508f = map;
                }
            }
        }
        return map != null ? map : Collections.emptyMap();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Map c() {
        Cursor query = this.f5503a.query(this.f5504b, f5502i, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map aVar = count <= 256 ? new a(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                aVar.put(query.getString(0), query.getString(1));
            }
            query.close();
            return aVar;
        } finally {
            query.close();
        }
    }

    public final void e() {
        synchronized (this.f5507e) {
            this.f5508f = null;
            this.f5505c.run();
        }
        synchronized (this) {
            for (q5 zza : this.f5509g) {
                zza.zza();
            }
        }
    }

    public final /* synthetic */ Object i(String str) {
        return b().get(str);
    }
}
