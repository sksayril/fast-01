package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import h2.p;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import l2.d;

public final class q9 extends e3 {

    /* renamed from: c  reason: collision with root package name */
    private volatile r9 f6471c;

    /* renamed from: d  reason: collision with root package name */
    private volatile r9 f6472d;

    /* renamed from: e  reason: collision with root package name */
    protected r9 f6473e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<Activity, r9> f6474f = new ConcurrentHashMap();

    /* renamed from: g  reason: collision with root package name */
    private Activity f6475g;

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f6476h;

    /* renamed from: i  reason: collision with root package name */
    private volatile r9 f6477i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public r9 f6478j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f6479k;

    /* renamed from: l  reason: collision with root package name */
    private final Object f6480l = new Object();

    public q9(m6 m6Var) {
        super(m6Var);
    }

    private final String C(Class<?> cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return str;
        }
        String[] split = canonicalName.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > d().s((String) null) ? str2.substring(0, d().s((String) null)) : str2;
    }

    private final void F(Activity activity, r9 r9Var, boolean z9) {
        r9 r9Var2;
        r9 r9Var3 = r9Var;
        r9 r9Var4 = this.f6471c == null ? this.f6472d : this.f6471c;
        if (r9Var3.f6517b == null) {
            r9Var2 = new r9(r9Var3.f6516a, activity != null ? C(activity.getClass(), "Activity") : null, r9Var3.f6518c, r9Var3.f6520e, r9Var3.f6521f);
        } else {
            r9Var2 = r9Var3;
        }
        this.f6472d = this.f6471c;
        this.f6471c = r9Var2;
        i().C(new v9(this, r9Var2, r9Var4, a().b(), z9));
    }

    static /* synthetic */ void I(q9 q9Var, Bundle bundle, r9 r9Var, r9 r9Var2, long j10) {
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        q9Var.M(r9Var, r9Var2, j10, true, q9Var.h().D((String) null, "screen_view", bundle, (List<String>) null, false));
    }

    /* access modifiers changed from: private */
    public final void M(r9 r9Var, r9 r9Var2, long j10, boolean z9, Bundle bundle) {
        Bundle bundle2;
        long j11;
        r9 r9Var3 = r9Var;
        r9 r9Var4 = r9Var2;
        long j12 = j10;
        Bundle bundle3 = bundle;
        m();
        boolean z10 = false;
        boolean z11 = r9Var4 == null || r9Var4.f6518c != r9Var3.f6518c || !t9.a(r9Var4.f6517b, r9Var3.f6517b) || !t9.a(r9Var4.f6516a, r9Var3.f6516a);
        if (z9 && this.f6473e != null) {
            z10 = true;
        }
        if (z11) {
            if (bundle3 == null) {
                bundle2 = new Bundle();
            }
            Bundle bundle4 = bundle2;
            oc.V(r9Var3, bundle4, true);
            if (r9Var4 != null) {
                String str = r9Var4.f6516a;
                if (str != null) {
                    bundle4.putString("_pn", str);
                }
                String str2 = r9Var4.f6517b;
                if (str2 != null) {
                    bundle4.putString("_pc", str2);
                }
                bundle4.putLong("_pi", r9Var4.f6518c);
            }
            if (z10) {
                long a10 = t().f6068f.a(j12);
                if (a10 > 0) {
                    h().K(bundle4, a10);
                }
            }
            if (!d().P()) {
                bundle4.putLong("_mst", 1);
            }
            String str3 = r9Var3.f6520e ? "app" : "auto";
            long a11 = a().a();
            if (r9Var3.f6520e) {
                long j13 = r9Var3.f6521f;
                if (j13 != 0) {
                    j11 = j13;
                    q().T(str3, "_vs", j11, bundle4);
                }
            }
            j11 = a11;
            q().T(str3, "_vs", j11, bundle4);
        }
        if (z10) {
            N(this.f6473e, true, j12);
        }
        this.f6473e = r9Var3;
        if (r9Var3.f6520e) {
            this.f6478j = r9Var3;
        }
        s().K(r9Var3);
    }

    /* access modifiers changed from: private */
    public final void N(r9 r9Var, boolean z9, long j10) {
        n().u(a().b());
        if (t().D(r9Var != null && r9Var.f6519d, z9, j10) && r9Var != null) {
            r9Var.f6519d = false;
        }
    }

    private final r9 S(Activity activity) {
        p.j(activity);
        r9 r9Var = this.f6474f.get(activity);
        if (r9Var == null) {
            r9 r9Var2 = new r9((String) null, C(activity.getClass(), "Activity"), h().O0());
            this.f6474f.put(activity, r9Var2);
            r9Var = r9Var2;
        }
        return this.f6477i != null ? this.f6477i : r9Var;
    }

    public final r9 B(boolean z9) {
        u();
        m();
        if (!z9) {
            return this.f6473e;
        }
        r9 r9Var = this.f6473e;
        return r9Var != null ? r9Var : this.f6478j;
    }

    public final void D(Activity activity) {
        synchronized (this.f6480l) {
            if (activity == this.f6475g) {
                this.f6475g = null;
            }
        }
        if (d().P()) {
            this.f6474f.remove(activity);
        }
    }

    public final void E(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (d().P() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f6474f.put(activity, new r9(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    @Deprecated
    public final void G(Activity activity, String str, String str2) {
        if (!d().P()) {
            k().L().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        r9 r9Var = this.f6471c;
        if (r9Var == null) {
            k().L().a("setCurrentScreen cannot be called while no activity active");
        } else if (this.f6474f.get(activity) == null) {
            k().L().a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = C(activity.getClass(), "Activity");
            }
            boolean a10 = t9.a(r9Var.f6517b, str2);
            boolean a11 = t9.a(r9Var.f6516a, str);
            if (a10 && a11) {
                k().L().a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > d().s((String) null))) {
                k().L().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= d().s((String) null))) {
                k().J().c("Setting current screen to name, class", str == null ? "null" : str, str2);
                r9 r9Var2 = new r9(str, str2, h().O0());
                this.f6474f.put(activity, r9Var2);
                F(activity, r9Var2, true);
            } else {
                k().L().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c2, code lost:
        r0 = k().J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cc, code lost:
        if (r3 != null) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ce, code lost:
        r2 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d1, code lost:
        r2 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d2, code lost:
        if (r4 != null) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d4, code lost:
        r5 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d7, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d8, code lost:
        r0.c("Logging screen view with name, class", r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00dd, code lost:
        if (r12.f6471c != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00df, code lost:
        r0 = r12.f6472d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e2, code lost:
        r0 = r12.f6471c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e4, code lost:
        r2 = new com.google.android.gms.measurement.internal.r9(r3, r4, h().O0(), true, r14);
        r12.f6471c = r2;
        r12.f6472d = r0;
        r12.f6477i = r2;
        i().C(new com.google.android.gms.measurement.internal.s9(r12, r13, r2, r0, a().b()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0113, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void H(android.os.Bundle r13, long r14) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f6480l
            monitor-enter(r0)
            boolean r1 = r12.f6479k     // Catch:{ all -> 0x0114 }
            if (r1 != 0) goto L_0x0016
            com.google.android.gms.measurement.internal.x4 r13 = r12.k()     // Catch:{ all -> 0x0114 }
            com.google.android.gms.measurement.internal.z4 r13 = r13.L()     // Catch:{ all -> 0x0114 }
            java.lang.String r14 = "Cannot log screen view event when the app is in the background."
            r13.a(r14)     // Catch:{ all -> 0x0114 }
            monitor-exit(r0)     // Catch:{ all -> 0x0114 }
            return
        L_0x0016:
            r1 = 0
            if (r13 == 0) goto L_0x0082
            java.lang.String r2 = "screen_name"
            java.lang.String r2 = r13.getString(r2)     // Catch:{ all -> 0x0114 }
            if (r2 == 0) goto L_0x004c
            int r3 = r2.length()     // Catch:{ all -> 0x0114 }
            if (r3 <= 0) goto L_0x0035
            int r3 = r2.length()     // Catch:{ all -> 0x0114 }
            com.google.android.gms.measurement.internal.g r4 = r12.d()     // Catch:{ all -> 0x0114 }
            int r4 = r4.s(r1)     // Catch:{ all -> 0x0114 }
            if (r3 <= r4) goto L_0x004c
        L_0x0035:
            com.google.android.gms.measurement.internal.x4 r13 = r12.k()     // Catch:{ all -> 0x0114 }
            com.google.android.gms.measurement.internal.z4 r13 = r13.L()     // Catch:{ all -> 0x0114 }
            java.lang.String r14 = "Invalid screen name length for screen view. Length"
            int r15 = r2.length()     // Catch:{ all -> 0x0114 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0114 }
            r13.b(r14, r15)     // Catch:{ all -> 0x0114 }
            monitor-exit(r0)     // Catch:{ all -> 0x0114 }
            return
        L_0x004c:
            java.lang.String r3 = "screen_class"
            java.lang.String r3 = r13.getString(r3)     // Catch:{ all -> 0x0114 }
            if (r3 == 0) goto L_0x007f
            int r4 = r3.length()     // Catch:{ all -> 0x0114 }
            if (r4 <= 0) goto L_0x0068
            int r4 = r3.length()     // Catch:{ all -> 0x0114 }
            com.google.android.gms.measurement.internal.g r5 = r12.d()     // Catch:{ all -> 0x0114 }
            int r1 = r5.s(r1)     // Catch:{ all -> 0x0114 }
            if (r4 <= r1) goto L_0x007f
        L_0x0068:
            com.google.android.gms.measurement.internal.x4 r13 = r12.k()     // Catch:{ all -> 0x0114 }
            com.google.android.gms.measurement.internal.z4 r13 = r13.L()     // Catch:{ all -> 0x0114 }
            java.lang.String r14 = "Invalid screen class length for screen view. Length"
            int r15 = r3.length()     // Catch:{ all -> 0x0114 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0114 }
            r13.b(r14, r15)     // Catch:{ all -> 0x0114 }
            monitor-exit(r0)     // Catch:{ all -> 0x0114 }
            return
        L_0x007f:
            r1 = r3
            r3 = r2
            goto L_0x0083
        L_0x0082:
            r3 = r1
        L_0x0083:
            if (r1 != 0) goto L_0x0096
            android.app.Activity r1 = r12.f6475g     // Catch:{ all -> 0x0114 }
            if (r1 == 0) goto L_0x0094
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0114 }
            java.lang.String r2 = "Activity"
            java.lang.String r1 = r12.C(r1, r2)     // Catch:{ all -> 0x0114 }
            goto L_0x0096
        L_0x0094:
            java.lang.String r1 = "Activity"
        L_0x0096:
            r4 = r1
            com.google.android.gms.measurement.internal.r9 r1 = r12.f6471c     // Catch:{ all -> 0x0114 }
            boolean r2 = r12.f6476h     // Catch:{ all -> 0x0114 }
            if (r2 == 0) goto L_0x00c1
            if (r1 == 0) goto L_0x00c1
            r2 = 0
            r12.f6476h = r2     // Catch:{ all -> 0x0114 }
            java.lang.String r2 = r1.f6517b     // Catch:{ all -> 0x0114 }
            boolean r2 = com.google.android.gms.measurement.internal.t9.a(r2, r4)     // Catch:{ all -> 0x0114 }
            java.lang.String r1 = r1.f6516a     // Catch:{ all -> 0x0114 }
            boolean r1 = com.google.android.gms.measurement.internal.t9.a(r1, r3)     // Catch:{ all -> 0x0114 }
            if (r2 == 0) goto L_0x00c1
            if (r1 == 0) goto L_0x00c1
            com.google.android.gms.measurement.internal.x4 r13 = r12.k()     // Catch:{ all -> 0x0114 }
            com.google.android.gms.measurement.internal.z4 r13 = r13.L()     // Catch:{ all -> 0x0114 }
            java.lang.String r14 = "Ignoring call to log screen view event with duplicate parameters."
            r13.a(r14)     // Catch:{ all -> 0x0114 }
            monitor-exit(r0)     // Catch:{ all -> 0x0114 }
            return
        L_0x00c1:
            monitor-exit(r0)     // Catch:{ all -> 0x0114 }
            com.google.android.gms.measurement.internal.x4 r0 = r12.k()
            com.google.android.gms.measurement.internal.z4 r0 = r0.J()
            java.lang.String r1 = "Logging screen view with name, class"
            if (r3 != 0) goto L_0x00d1
            java.lang.String r2 = "null"
            goto L_0x00d2
        L_0x00d1:
            r2 = r3
        L_0x00d2:
            if (r4 != 0) goto L_0x00d7
            java.lang.String r5 = "null"
            goto L_0x00d8
        L_0x00d7:
            r5 = r4
        L_0x00d8:
            r0.c(r1, r2, r5)
            com.google.android.gms.measurement.internal.r9 r0 = r12.f6471c
            if (r0 != 0) goto L_0x00e2
            com.google.android.gms.measurement.internal.r9 r0 = r12.f6472d
            goto L_0x00e4
        L_0x00e2:
            com.google.android.gms.measurement.internal.r9 r0 = r12.f6471c
        L_0x00e4:
            com.google.android.gms.measurement.internal.r9 r1 = new com.google.android.gms.measurement.internal.r9
            com.google.android.gms.measurement.internal.oc r2 = r12.h()
            long r5 = r2.O0()
            r7 = 1
            r2 = r1
            r8 = r14
            r2.<init>(r3, r4, r5, r7, r8)
            r12.f6471c = r1
            r12.f6472d = r0
            r12.f6477i = r1
            l2.d r14 = r12.a()
            long r10 = r14.b()
            com.google.android.gms.measurement.internal.f6 r14 = r12.i()
            com.google.android.gms.measurement.internal.s9 r15 = new com.google.android.gms.measurement.internal.s9
            r5 = r15
            r6 = r12
            r7 = r13
            r8 = r1
            r9 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            r14.C(r15)
            return
        L_0x0114:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0114 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q9.H(android.os.Bundle, long):void");
    }

    public final r9 O() {
        return this.f6471c;
    }

    public final void P(Activity activity) {
        synchronized (this.f6480l) {
            this.f6479k = false;
            this.f6476h = true;
        }
        long b10 = a().b();
        if (!d().P()) {
            this.f6471c = null;
            i().C(new x9(this, b10));
            return;
        }
        r9 S = S(activity);
        this.f6472d = this.f6471c;
        this.f6471c = null;
        i().C(new w9(this, S, b10));
    }

    public final void Q(Activity activity, Bundle bundle) {
        r9 r9Var;
        if (d().P() && bundle != null && (r9Var = this.f6474f.get(activity)) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", r9Var.f6518c);
            bundle2.putString("name", r9Var.f6516a);
            bundle2.putString("referrer_name", r9Var.f6517b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    public final void R(Activity activity) {
        synchronized (this.f6480l) {
            this.f6479k = true;
            if (activity != this.f6475g) {
                synchronized (this.f6480l) {
                    this.f6475g = activity;
                    this.f6476h = false;
                }
                if (d().P()) {
                    this.f6477i = null;
                    i().C(new z9(this));
                }
            }
        }
        if (!d().P()) {
            this.f6471c = this.f6477i;
            i().C(new u9(this));
            return;
        }
        F(activity, S(activity), false);
        b0 n10 = n();
        n10.i().C(new c1(n10, n10.a().b()));
    }

    public final /* bridge */ /* synthetic */ d a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ f c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ g d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ c0 e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ w4 f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ k5 g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ oc h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ f6 i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    public final /* bridge */ /* synthetic */ x4 k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    public final /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    public final /* bridge */ /* synthetic */ b0 n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ r4 o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ u4 p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ y7 q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ q9 r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ y9 s() {
        return super.s();
    }

    public final /* bridge */ /* synthetic */ gb t() {
        return super.t();
    }

    /* access modifiers changed from: protected */
    public final boolean z() {
        return false;
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
