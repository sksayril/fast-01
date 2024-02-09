package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.internal.g6;
import com.google.android.gms.measurement.internal.t7;
import h2.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import l2.d;
import l2.g;

public class h2 {

    /* renamed from: j  reason: collision with root package name */
    private static volatile h2 f5288j;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final String f5289a;

    /* renamed from: b  reason: collision with root package name */
    protected final d f5290b;

    /* renamed from: c  reason: collision with root package name */
    private final ExecutorService f5291c;

    /* renamed from: d  reason: collision with root package name */
    private final a3.a f5292d;

    /* renamed from: e  reason: collision with root package name */
    private final List<Pair<t7, b>> f5293e;

    /* renamed from: f  reason: collision with root package name */
    private int f5294f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f5295g;

    /* renamed from: h  reason: collision with root package name */
    private String f5296h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public volatile v1 f5297i;

    abstract class a implements Runnable {

        /* renamed from: m  reason: collision with root package name */
        final long f5298m;

        /* renamed from: n  reason: collision with root package name */
        final long f5299n;

        /* renamed from: o  reason: collision with root package name */
        private final boolean f5300o;

        a(h2 h2Var) {
            this(true);
        }

        a(boolean z9) {
            this.f5298m = h2.this.f5290b.a();
            this.f5299n = h2.this.f5290b.b();
            this.f5300o = z9;
        }

        /* access modifiers changed from: package-private */
        public abstract void a();

        /* access modifiers changed from: protected */
        public void b() {
        }

        public void run() {
            if (h2.this.f5295g) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e10) {
                h2.this.q(e10, false, this.f5300o);
                b();
            }
        }
    }

    static class b extends a2 {

        /* renamed from: c  reason: collision with root package name */
        private final t7 f5302c;

        b(t7 t7Var) {
            this.f5302c = t7Var;
        }

        public final void y0(String str, String str2, Bundle bundle, long j10) {
            this.f5302c.a(str, str2, bundle, j10);
        }

        public final int zza() {
            return System.identityHashCode(this.f5302c);
        }
    }

    class c implements Application.ActivityLifecycleCallbacks {
        c() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            h2.this.l(new d3(this, bundle, activity));
        }

        public final void onActivityDestroyed(Activity activity) {
            h2.this.l(new i3(this, activity));
        }

        public final void onActivityPaused(Activity activity) {
            h2.this.l(new h3(this, activity));
        }

        public final void onActivityResumed(Activity activity) {
            h2.this.l(new e3(this, activity));
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            t1 t1Var = new t1();
            h2.this.l(new j3(this, activity, t1Var));
            Bundle J = t1Var.J(50);
            if (J != null) {
                bundle.putAll(J);
            }
        }

        public final void onActivityStarted(Activity activity) {
            h2.this.l(new f3(this, activity));
        }

        public final void onActivityStopped(Activity activity) {
            h2.this.l(new g3(this, activity));
        }
    }

    private h2(Context context, String str, String str2, String str3, Bundle bundle) {
        this.f5289a = (str == null || !C(str2, str3)) ? "FA" : str;
        this.f5290b = g.d();
        this.f5291c = j1.a().a(new o2(this), s1.f5583a);
        this.f5292d = new a3.a(this);
        this.f5293e = new ArrayList();
        boolean z9 = false;
        if (!(!z(context) || H())) {
            this.f5296h = null;
            this.f5295g = true;
            Log.w(this.f5289a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (!C(str2, str3)) {
            this.f5296h = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null ? true : z9)) {
                    Log.w(this.f5289a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f5289a, "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics");
            }
        } else {
            this.f5296h = str2;
        }
        l(new k2(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f5289a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new c());
        }
    }

    /* access modifiers changed from: private */
    public final boolean C(String str, String str2) {
        return (str2 == null || str == null || H()) ? false : true;
    }

    private final boolean H() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static h2 e(Context context) {
        return f(context, (String) null, (String) null, (String) null, (Bundle) null);
    }

    public static h2 f(Context context, String str, String str2, String str3, Bundle bundle) {
        p.j(context);
        if (f5288j == null) {
            synchronized (h2.class) {
                if (f5288j == null) {
                    f5288j = new h2(context, str, str2, str3, bundle);
                }
            }
        }
        return f5288j;
    }

    /* access modifiers changed from: private */
    public final void l(a aVar) {
        this.f5291c.execute(aVar);
    }

    /* access modifiers changed from: private */
    public final void q(Exception exc, boolean z9, boolean z10) {
        this.f5295g |= z9;
        if (z9) {
            Log.w(this.f5289a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z10) {
            i(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
        Log.w(this.f5289a, "Error with data collection. Data lost.", exc);
    }

    private final void s(String str, String str2, Bundle bundle, boolean z9, boolean z10, Long l10) {
        l(new c3(this, l10, str, str2, bundle, z9, z10));
    }

    private static boolean z(Context context) {
        try {
            return new g6(context, g6.a(context)).b("google_app_id") != null;
        } catch (IllegalStateException unused) {
        }
    }

    public final void A(String str) {
        l(new p2(this, str));
    }

    public final String D() {
        t1 t1Var = new t1();
        l(new r2(this, t1Var));
        return t1Var.f3(50);
    }

    public final String E() {
        t1 t1Var = new t1();
        l(new x2(this, t1Var));
        return t1Var.f3(500);
    }

    public final String F() {
        t1 t1Var = new t1();
        l(new t2(this, t1Var));
        return t1Var.f3(500);
    }

    public final String G() {
        t1 t1Var = new t1();
        l(new s2(this, t1Var));
        return t1Var.f3(500);
    }

    public final int a(String str) {
        t1 t1Var = new t1();
        l(new z2(this, str, t1Var));
        Integer num = (Integer) t1.Y(t1Var.J(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long b() {
        t1 t1Var = new t1();
        l(new u2(this, t1Var));
        Long e32 = t1Var.e3(500);
        if (e32 != null) {
            return e32.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f5290b.a()).nextLong();
        int i10 = this.f5294f + 1;
        this.f5294f = i10;
        return nextLong + ((long) i10);
    }

    /* access modifiers changed from: protected */
    public final v1 c(Context context, boolean z9) {
        try {
            return u1.asInterface(DynamiteModule.e(context, DynamiteModule.f5057e, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e10) {
            q(e10, true, false);
            return null;
        }
    }

    public final List<Bundle> g(String str, String str2) {
        t1 t1Var = new t1();
        l(new l2(this, str, str2, t1Var));
        List<Bundle> list = (List) t1.Y(t1Var.J(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map<String, Object> h(String str, String str2, boolean z9) {
        t1 t1Var = new t1();
        l(new v2(this, str, str2, z9, t1Var));
        Bundle J = t1Var.J(5000);
        if (J == null || J.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(J.size());
        for (String str3 : J.keySet()) {
            Object obj = J.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void i(int i10, String str, Object obj, Object obj2, Object obj3) {
        l(new y2(this, false, 5, str, obj, (Object) null, (Object) null));
    }

    public final void j(Activity activity, String str, String str2) {
        l(new n2(this, activity, str, str2));
    }

    public final void k(Bundle bundle) {
        l(new j2(this, bundle));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r4.f5297i == null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.f5297i.registerOnMeasurementEventListener(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        android.util.Log.w(r4.f5289a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        l(new com.google.android.gms.internal.measurement.b3(r4, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p(com.google.android.gms.measurement.internal.t7 r5) {
        /*
            r4 = this;
            h2.p.j(r5)
            java.util.List<android.util.Pair<com.google.android.gms.measurement.internal.t7, com.google.android.gms.internal.measurement.h2$b>> r0 = r4.f5293e
            monitor-enter(r0)
            r1 = 0
        L_0x0007:
            java.util.List<android.util.Pair<com.google.android.gms.measurement.internal.t7, com.google.android.gms.internal.measurement.h2$b>> r2 = r4.f5293e     // Catch:{ all -> 0x0055 }
            int r2 = r2.size()     // Catch:{ all -> 0x0055 }
            if (r1 >= r2) goto L_0x002b
            java.util.List<android.util.Pair<com.google.android.gms.measurement.internal.t7, com.google.android.gms.internal.measurement.h2$b>> r2 = r4.f5293e     // Catch:{ all -> 0x0055 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0055 }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ all -> 0x0055 }
            java.lang.Object r2 = r2.first     // Catch:{ all -> 0x0055 }
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0055 }
            if (r2 == 0) goto L_0x0028
            java.lang.String r5 = r4.f5289a     // Catch:{ all -> 0x0055 }
            java.lang.String r1 = "OnEventListener already registered."
            android.util.Log.w(r5, r1)     // Catch:{ all -> 0x0055 }
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            return
        L_0x0028:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x002b:
            com.google.android.gms.internal.measurement.h2$b r1 = new com.google.android.gms.internal.measurement.h2$b     // Catch:{ all -> 0x0055 }
            r1.<init>(r5)     // Catch:{ all -> 0x0055 }
            java.util.List<android.util.Pair<com.google.android.gms.measurement.internal.t7, com.google.android.gms.internal.measurement.h2$b>> r2 = r4.f5293e     // Catch:{ all -> 0x0055 }
            android.util.Pair r3 = new android.util.Pair     // Catch:{ all -> 0x0055 }
            r3.<init>(r5, r1)     // Catch:{ all -> 0x0055 }
            r2.add(r3)     // Catch:{ all -> 0x0055 }
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            com.google.android.gms.internal.measurement.v1 r5 = r4.f5297i
            if (r5 == 0) goto L_0x004c
            com.google.android.gms.internal.measurement.v1 r5 = r4.f5297i     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0045 }
            r5.registerOnMeasurementEventListener(r1)     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0045 }
            return
        L_0x0045:
            java.lang.String r5 = r4.f5289a
            java.lang.String r0 = "Failed to register event listener on calling thread. Trying again on the dynamite thread."
            android.util.Log.w(r5, r0)
        L_0x004c:
            com.google.android.gms.internal.measurement.b3 r5 = new com.google.android.gms.internal.measurement.b3
            r5.<init>(r4, r1)
            r4.l(r5)
            return
        L_0x0055:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.h2.p(com.google.android.gms.measurement.internal.t7):void");
    }

    public final void r(String str, String str2, Bundle bundle) {
        l(new m2(this, str, str2, bundle));
    }

    public final void t(boolean z9) {
        l(new a3(this, z9));
    }

    public final a3.a v() {
        return this.f5292d;
    }

    public final void x(String str) {
        l(new q2(this, str));
    }

    public final void y(String str, String str2, Bundle bundle) {
        s(str, str2, bundle, true, true, (Long) null);
    }
}
