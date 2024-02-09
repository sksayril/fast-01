package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.internal.measurement.cg;
import com.google.android.gms.measurement.internal.p7;
import h2.p;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;
import l2.d;

public final class r4 extends e3 {

    /* renamed from: c  reason: collision with root package name */
    private String f6495c;

    /* renamed from: d  reason: collision with root package name */
    private String f6496d;

    /* renamed from: e  reason: collision with root package name */
    private int f6497e;

    /* renamed from: f  reason: collision with root package name */
    private String f6498f;

    /* renamed from: g  reason: collision with root package name */
    private String f6499g;

    /* renamed from: h  reason: collision with root package name */
    private long f6500h;

    /* renamed from: i  reason: collision with root package name */
    private long f6501i;

    /* renamed from: j  reason: collision with root package name */
    private List<String> f6502j;

    /* renamed from: k  reason: collision with root package name */
    private String f6503k;

    /* renamed from: l  reason: collision with root package name */
    private int f6504l;

    /* renamed from: m  reason: collision with root package name */
    private String f6505m;

    /* renamed from: n  reason: collision with root package name */
    private String f6506n;

    /* renamed from: o  reason: collision with root package name */
    private String f6507o;

    /* renamed from: p  reason: collision with root package name */
    private long f6508p = 0;

    /* renamed from: q  reason: collision with root package name */
    private String f6509q = null;

    r4(m6 m6Var, long j10) {
        super(m6Var);
        this.f6501i = j10;
    }

    private final String I() {
        z4 M;
        String str;
        if (!cg.a() || !d().r(k0.f6202n0)) {
            try {
                Class<?> loadClass = zza().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (loadClass == null) {
                    return null;
                }
                try {
                    Object invoke = loadClass.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{zza()});
                    if (invoke == null) {
                        return null;
                    }
                    try {
                        return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                    } catch (Exception unused) {
                        M = k().L();
                        str = "Failed to retrieve Firebase Instance Id";
                    }
                } catch (Exception unused2) {
                    M = k().M();
                    str = "Failed to obtain Firebase Analytics instance";
                }
            } catch (ClassNotFoundException unused3) {
                return null;
            }
        } else {
            M = k().J();
            str = "Disabled IID for tests.";
            M.a(str);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.sc A(java.lang.String r47) {
        /*
            r46 = this;
            r0 = r46
            r46.m()
            com.google.android.gms.measurement.internal.k5 r1 = r46.g()
            com.google.android.gms.measurement.internal.p7 r1 = r1.I()
            boolean r2 = com.google.android.gms.internal.measurement.kd.a()
            if (r2 == 0) goto L_0x0034
            com.google.android.gms.measurement.internal.g r2 = r46.d()
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.k0.S0
            boolean r2 = r2.r(r3)
            if (r2 == 0) goto L_0x0034
            com.google.android.gms.measurement.internal.k5 r2 = r46.g()
            com.google.android.gms.measurement.internal.z r2 = r2.H()
            java.lang.String r2 = r2.i()
            int r3 = r1.b()
            r39 = r2
            r38 = r3
            goto L_0x003c
        L_0x0034:
            java.lang.String r2 = ""
            r3 = 100
            r39 = r2
            r38 = 100
        L_0x003c:
            com.google.android.gms.measurement.internal.sc r2 = new com.google.android.gms.measurement.internal.sc
            java.lang.String r5 = r46.E()
            java.lang.String r6 = r46.F()
            r46.u()
            java.lang.String r7 = r0.f6496d
            int r3 = r46.C()
            long r8 = (long) r3
            r46.u()
            java.lang.String r3 = r0.f6498f
            h2.p.j(r3)
            java.lang.String r10 = r0.f6498f
            r46.u()
            r46.m()
            long r3 = r0.f6500h
            r13 = 0
            int r15 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x0080
            com.google.android.gms.measurement.internal.m6 r3 = r0.f6276a
            com.google.android.gms.measurement.internal.oc r3 = r3.K()
            android.content.Context r4 = r46.zza()
            android.content.Context r15 = r46.zza()
            java.lang.String r15 = r15.getPackageName()
            long r3 = r3.y(r4, r15)
            r0.f6500h = r3
        L_0x0080:
            long r3 = r0.f6500h
            com.google.android.gms.measurement.internal.m6 r15 = r0.f6276a
            boolean r16 = r15.o()
            com.google.android.gms.measurement.internal.k5 r15 = r46.g()
            boolean r15 = r15.f6247r
            r17 = r15 ^ 1
            r46.m()
            com.google.android.gms.measurement.internal.m6 r15 = r0.f6276a
            boolean r15 = r15.o()
            r18 = 0
            if (r15 != 0) goto L_0x00a0
            r19 = r18
            goto L_0x00a6
        L_0x00a0:
            java.lang.String r15 = r46.I()
            r19 = r15
        L_0x00a6:
            r20 = 0
            com.google.android.gms.measurement.internal.m6 r15 = r0.f6276a
            com.google.android.gms.measurement.internal.k5 r11 = r15.E()
            com.google.android.gms.measurement.internal.p5 r11 = r11.f6234e
            long r11 = r11.a()
            int r24 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r24 != 0) goto L_0x00bb
            long r11 = r15.H
            goto L_0x00c1
        L_0x00bb:
            long r13 = r15.H
            long r11 = java.lang.Math.min(r13, r11)
        L_0x00c1:
            r26 = r11
            int r28 = r46.B()
            com.google.android.gms.measurement.internal.g r11 = r46.d()
            boolean r29 = r11.O()
            com.google.android.gms.measurement.internal.k5 r11 = r46.g()
            r11.m()
            android.content.SharedPreferences r11 = r11.E()
            java.lang.String r12 = "deferred_analytics_collection"
            r13 = 0
            boolean r30 = r11.getBoolean(r12, r13)
            java.lang.String r31 = r46.D()
            com.google.android.gms.measurement.internal.g r11 = r46.d()
            java.lang.String r12 = "google_analytics_default_allow_ad_personalization_signals"
            java.lang.Boolean r11 = r11.E(r12)
            if (r11 != 0) goto L_0x00f4
            r32 = r18
            goto L_0x0100
        L_0x00f4:
            boolean r11 = r11.booleanValue()
            r11 = r11 ^ 1
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r32 = r11
        L_0x0100:
            long r14 = r0.f6501i
            java.util.List<java.lang.String> r11 = r0.f6502j
            r33 = 0
            java.lang.String r1 = r1.v()
            java.lang.String r12 = r0.f6503k
            if (r12 != 0) goto L_0x0118
            com.google.android.gms.measurement.internal.oc r12 = r46.h()
            java.lang.String r12 = r12.R0()
            r0.f6503k = r12
        L_0x0118:
            java.lang.String r12 = r0.f6503k
            boolean r34 = com.google.android.gms.internal.measurement.pf.a()
            if (r34 == 0) goto L_0x0167
            com.google.android.gms.measurement.internal.g r13 = r46.d()
            r35 = r3
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.k0.f6222x0
            boolean r3 = r13.r(r3)
            if (r3 == 0) goto L_0x0169
            r46.m()
            long r3 = r0.f6508p
            r24 = 0
            int r13 = (r3 > r24 ? 1 : (r3 == r24 ? 0 : -1))
            if (r13 == 0) goto L_0x015a
            l2.d r3 = r46.a()
            long r3 = r3.a()
            r13 = r11
            r37 = r12
            long r11 = r0.f6508p
            long r3 = r3 - r11
            java.lang.String r11 = r0.f6507o
            if (r11 == 0) goto L_0x015d
            r11 = 86400000(0x5265c00, double:4.2687272E-316)
            int r18 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r18 <= 0) goto L_0x015d
            java.lang.String r3 = r0.f6509q
            if (r3 != 0) goto L_0x015d
            r46.H()
            goto L_0x015d
        L_0x015a:
            r13 = r11
            r37 = r12
        L_0x015d:
            java.lang.String r3 = r0.f6507o
            if (r3 != 0) goto L_0x0164
            r46.H()
        L_0x0164:
            java.lang.String r3 = r0.f6507o
            goto L_0x0170
        L_0x0167:
            r35 = r3
        L_0x0169:
            r13 = r11
            r37 = r12
            r24 = 0
            r3 = r18
        L_0x0170:
            com.google.android.gms.measurement.internal.g r4 = r46.d()
            java.lang.String r11 = "google_analytics_sgtm_upload_enabled"
            java.lang.Boolean r4 = r4.E(r11)
            if (r4 != 0) goto L_0x017f
            r40 = 0
            goto L_0x0185
        L_0x017f:
            boolean r4 = r4.booleanValue()
            r40 = r4
        L_0x0185:
            com.google.android.gms.measurement.internal.oc r4 = r46.h()
            java.lang.String r11 = r46.E()
            long r41 = r4.y0(r11)
            boolean r4 = com.google.android.gms.internal.measurement.df.a()
            if (r4 == 0) goto L_0x01ad
            com.google.android.gms.measurement.internal.g r4 = r46.d()
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.k0.M0
            boolean r4 = r4.r(r11)
            if (r4 == 0) goto L_0x01ad
            r46.h()
            int r4 = com.google.android.gms.measurement.internal.oc.x0()
            r43 = r4
            goto L_0x01af
        L_0x01ad:
            r43 = 0
        L_0x01af:
            boolean r4 = com.google.android.gms.internal.measurement.df.a()
            if (r4 == 0) goto L_0x01cc
            com.google.android.gms.measurement.internal.g r4 = r46.d()
            com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r11 = com.google.android.gms.measurement.internal.k0.M0
            boolean r4 = r4.r(r11)
            if (r4 == 0) goto L_0x01cc
            com.google.android.gms.measurement.internal.oc r4 = r46.h()
            long r11 = r4.H0()
            r44 = r11
            goto L_0x01ce
        L_0x01cc:
            r44 = r24
        L_0x01ce:
            r24 = r35
            r4 = r2
            r34 = r13
            r35 = r37
            r11 = 82001(0x14051, double:4.0514E-319)
            r36 = r14
            r13 = r24
            r15 = r47
            r18 = r19
            r19 = r20
            r21 = r26
            r23 = r28
            r24 = r29
            r25 = r30
            r26 = r31
            r27 = r32
            r28 = r36
            r30 = r34
            r31 = r33
            r32 = r1
            r33 = r35
            r34 = r3
            r35 = r40
            r36 = r41
            r40 = r43
            r41 = r44
            r4.<init>((java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7, (long) r8, (java.lang.String) r10, (long) r11, (long) r13, (java.lang.String) r15, (boolean) r16, (boolean) r17, (java.lang.String) r18, (long) r19, (long) r21, (int) r23, (boolean) r24, (boolean) r25, (java.lang.String) r26, (java.lang.Boolean) r27, (long) r28, (java.util.List<java.lang.String>) r30, (java.lang.String) r31, (java.lang.String) r32, (java.lang.String) r33, (java.lang.String) r34, (boolean) r35, (long) r36, (int) r38, (java.lang.String) r39, (int) r40, (long) r41)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.r4.A(java.lang.String):com.google.android.gms.measurement.internal.sc");
    }

    /* access modifiers changed from: package-private */
    public final int B() {
        u();
        return this.f6504l;
    }

    /* access modifiers changed from: package-private */
    public final int C() {
        u();
        return this.f6497e;
    }

    /* access modifiers changed from: package-private */
    public final String D() {
        u();
        return this.f6506n;
    }

    /* access modifiers changed from: package-private */
    public final String E() {
        u();
        p.j(this.f6495c);
        return this.f6495c;
    }

    /* access modifiers changed from: package-private */
    public final String F() {
        m();
        u();
        p.j(this.f6505m);
        return this.f6505m;
    }

    /* access modifiers changed from: package-private */
    public final List<String> G() {
        return this.f6502j;
    }

    /* access modifiers changed from: package-private */
    public final void H() {
        String str;
        m();
        if (!g().I().l(p7.a.ANALYTICS_STORAGE)) {
            k().E().a("Analytics Storage consent is not granted");
            str = null;
        } else {
            byte[] bArr = new byte[16];
            h().T0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
        }
        z4 E = k().E();
        Object[] objArr = new Object[1];
        objArr[0] = str == null ? "null" : "not null";
        E.a(String.format("Resetting session stitching token to %s", objArr));
        this.f6507o = str;
        this.f6508p = a().a();
    }

    /* access modifiers changed from: package-private */
    public final boolean J(String str) {
        String str2 = this.f6509q;
        boolean z9 = str2 != null && !str2.equals(str);
        this.f6509q = str;
        return z9;
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
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x014a A[Catch:{ IllegalStateException -> 0x018a }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x014b A[Catch:{ IllegalStateException -> 0x018a }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0154 A[Catch:{ IllegalStateException -> 0x018a }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x016d A[Catch:{ IllegalStateException -> 0x018a }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x() {
        /*
            r11 = this;
            android.content.Context r0 = r11.zza()
            java.lang.String r0 = r0.getPackageName()
            android.content.Context r1 = r11.zza()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "Unknown"
            java.lang.String r3 = ""
            r4 = 0
            java.lang.String r5 = "unknown"
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L_0x002e
            com.google.android.gms.measurement.internal.x4 r7 = r11.k()
            com.google.android.gms.measurement.internal.z4 r7 = r7.F()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.x4.u(r0)
            java.lang.String r9 = "PackageManager is null, app identity information might be inaccurate. appId"
            r7.b(r9, r8)
        L_0x002c:
            r8 = r2
            goto L_0x008e
        L_0x002e:
            java.lang.String r5 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x0033 }
            goto L_0x0044
        L_0x0033:
            com.google.android.gms.measurement.internal.x4 r7 = r11.k()
            com.google.android.gms.measurement.internal.z4 r7 = r7.F()
            java.lang.Object r8 = com.google.android.gms.measurement.internal.x4.u(r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.b(r9, r8)
        L_0x0044:
            if (r5 != 0) goto L_0x0049
            java.lang.String r5 = "manual_install"
            goto L_0x0052
        L_0x0049:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x0052
            r5 = r3
        L_0x0052:
            android.content.Context r7 = r11.zza()     // Catch:{ NameNotFoundException -> 0x007a }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x007a }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r4)     // Catch:{ NameNotFoundException -> 0x007a }
            if (r7 == 0) goto L_0x002c
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x007a }
            java.lang.CharSequence r8 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x007a }
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NameNotFoundException -> 0x007a }
            if (r9 != 0) goto L_0x0071
            java.lang.String r8 = r8.toString()     // Catch:{ NameNotFoundException -> 0x007a }
            goto L_0x0072
        L_0x0071:
            r8 = r2
        L_0x0072:
            java.lang.String r2 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0077 }
            int r6 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0077 }
            goto L_0x008e
        L_0x0077:
            r7 = r2
            r2 = r8
            goto L_0x007b
        L_0x007a:
            r7 = r2
        L_0x007b:
            com.google.android.gms.measurement.internal.x4 r8 = r11.k()
            com.google.android.gms.measurement.internal.z4 r8 = r8.F()
            java.lang.Object r9 = com.google.android.gms.measurement.internal.x4.u(r0)
            java.lang.String r10 = "Error retrieving package info. appId, appName"
            r8.c(r10, r9, r2)
            r8 = r2
            r2 = r7
        L_0x008e:
            r11.f6495c = r0
            r11.f6498f = r5
            r11.f6496d = r2
            r11.f6497e = r6
            r11.f6499g = r8
            r5 = 0
            r11.f6500h = r5
            com.google.android.gms.measurement.internal.m6 r2 = r11.f6276a
            java.lang.String r2 = r2.L()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r5 = 1
            if (r2 != 0) goto L_0x00b9
            com.google.android.gms.measurement.internal.m6 r2 = r11.f6276a
            java.lang.String r2 = r2.M()
            java.lang.String r6 = "am"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x00b9
            r2 = 1
            goto L_0x00ba
        L_0x00b9:
            r2 = 0
        L_0x00ba:
            com.google.android.gms.measurement.internal.m6 r6 = r11.f6276a
            int r6 = r6.w()
            com.google.android.gms.measurement.internal.x4 r7 = r11.k()
            switch(r6) {
                case 0: goto L_0x0113;
                case 1: goto L_0x010c;
                case 2: goto L_0x0105;
                case 3: goto L_0x00fe;
                case 4: goto L_0x00f7;
                case 5: goto L_0x00f0;
                case 6: goto L_0x00e9;
                case 7: goto L_0x00e2;
                case 8: goto L_0x00db;
                default: goto L_0x00c7;
            }
        L_0x00c7:
            com.google.android.gms.measurement.internal.z4 r7 = r7.I()
            java.lang.String r8 = "App measurement disabled"
            r7.a(r8)
            com.google.android.gms.measurement.internal.x4 r7 = r11.k()
            com.google.android.gms.measurement.internal.z4 r7 = r7.H()
            java.lang.String r8 = "Invalid scion state in identity"
            goto L_0x0119
        L_0x00db:
            com.google.android.gms.measurement.internal.z4 r7 = r7.I()
            java.lang.String r8 = "App measurement disabled due to denied storage consent"
            goto L_0x0119
        L_0x00e2:
            com.google.android.gms.measurement.internal.z4 r7 = r7.I()
            java.lang.String r8 = "App measurement disabled via the global data collection setting"
            goto L_0x0119
        L_0x00e9:
            com.google.android.gms.measurement.internal.z4 r7 = r7.L()
            java.lang.String r8 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            goto L_0x0119
        L_0x00f0:
            com.google.android.gms.measurement.internal.z4 r7 = r7.J()
            java.lang.String r8 = "App measurement disabled via the init parameters"
            goto L_0x0119
        L_0x00f7:
            com.google.android.gms.measurement.internal.z4 r7 = r7.I()
            java.lang.String r8 = "App measurement disabled via the manifest"
            goto L_0x0119
        L_0x00fe:
            com.google.android.gms.measurement.internal.z4 r7 = r7.I()
            java.lang.String r8 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            goto L_0x0119
        L_0x0105:
            com.google.android.gms.measurement.internal.z4 r7 = r7.J()
            java.lang.String r8 = "App measurement deactivated via the init parameters"
            goto L_0x0119
        L_0x010c:
            com.google.android.gms.measurement.internal.z4 r7 = r7.I()
            java.lang.String r8 = "App measurement deactivated via the manifest"
            goto L_0x0119
        L_0x0113:
            com.google.android.gms.measurement.internal.z4 r7 = r7.J()
            java.lang.String r8 = "App measurement collection enabled"
        L_0x0119:
            r7.a(r8)
            if (r6 != 0) goto L_0x0120
            r6 = 1
            goto L_0x0121
        L_0x0120:
            r6 = 0
        L_0x0121:
            r11.f6505m = r3
            r11.f6506n = r3
            if (r2 == 0) goto L_0x012f
            com.google.android.gms.measurement.internal.m6 r2 = r11.f6276a
            java.lang.String r2 = r2.L()
            r11.f6506n = r2
        L_0x012f:
            android.content.Context r2 = r11.zza()     // Catch:{ IllegalStateException -> 0x018a }
            com.google.android.gms.measurement.internal.m6 r7 = r11.f6276a     // Catch:{ IllegalStateException -> 0x018a }
            java.lang.String r7 = r7.O()     // Catch:{ IllegalStateException -> 0x018a }
            java.lang.String r8 = "google_app_id"
            com.google.android.gms.measurement.internal.g6 r9 = new com.google.android.gms.measurement.internal.g6     // Catch:{ IllegalStateException -> 0x018a }
            r9.<init>(r2, r7)     // Catch:{ IllegalStateException -> 0x018a }
            java.lang.String r2 = r9.b(r8)     // Catch:{ IllegalStateException -> 0x018a }
            boolean r7 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IllegalStateException -> 0x018a }
            if (r7 == 0) goto L_0x014b
            goto L_0x014c
        L_0x014b:
            r3 = r2
        L_0x014c:
            r11.f6505m = r3     // Catch:{ IllegalStateException -> 0x018a }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ IllegalStateException -> 0x018a }
            if (r2 != 0) goto L_0x016b
            com.google.android.gms.measurement.internal.g6 r2 = new com.google.android.gms.measurement.internal.g6     // Catch:{ IllegalStateException -> 0x018a }
            android.content.Context r3 = r11.zza()     // Catch:{ IllegalStateException -> 0x018a }
            com.google.android.gms.measurement.internal.m6 r7 = r11.f6276a     // Catch:{ IllegalStateException -> 0x018a }
            java.lang.String r7 = r7.O()     // Catch:{ IllegalStateException -> 0x018a }
            r2.<init>(r3, r7)     // Catch:{ IllegalStateException -> 0x018a }
            java.lang.String r3 = "admob_app_id"
            java.lang.String r2 = r2.b(r3)     // Catch:{ IllegalStateException -> 0x018a }
            r11.f6506n = r2     // Catch:{ IllegalStateException -> 0x018a }
        L_0x016b:
            if (r6 == 0) goto L_0x019c
            com.google.android.gms.measurement.internal.x4 r2 = r11.k()     // Catch:{ IllegalStateException -> 0x018a }
            com.google.android.gms.measurement.internal.z4 r2 = r2.J()     // Catch:{ IllegalStateException -> 0x018a }
            java.lang.String r3 = "App measurement enabled for app package, google app id"
            java.lang.String r6 = r11.f6495c     // Catch:{ IllegalStateException -> 0x018a }
            java.lang.String r7 = r11.f6505m     // Catch:{ IllegalStateException -> 0x018a }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ IllegalStateException -> 0x018a }
            if (r7 == 0) goto L_0x0184
            java.lang.String r7 = r11.f6506n     // Catch:{ IllegalStateException -> 0x018a }
            goto L_0x0186
        L_0x0184:
            java.lang.String r7 = r11.f6505m     // Catch:{ IllegalStateException -> 0x018a }
        L_0x0186:
            r2.c(r3, r6, r7)     // Catch:{ IllegalStateException -> 0x018a }
            goto L_0x019c
        L_0x018a:
            r2 = move-exception
            com.google.android.gms.measurement.internal.x4 r3 = r11.k()
            com.google.android.gms.measurement.internal.z4 r3 = r3.F()
            java.lang.Object r0 = com.google.android.gms.measurement.internal.x4.u(r0)
            java.lang.String r6 = "Fetching Google App Id failed with exception. appId"
            r3.c(r6, r0, r2)
        L_0x019c:
            r0 = 0
            r11.f6502j = r0
            com.google.android.gms.measurement.internal.g r0 = r11.d()
            java.lang.String r2 = "analytics.safelisted_events"
            java.util.List r0 = r0.H(r2)
            if (r0 == 0) goto L_0x01dd
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x01c0
            com.google.android.gms.measurement.internal.x4 r2 = r11.k()
            com.google.android.gms.measurement.internal.z4 r2 = r2.L()
            java.lang.String r3 = "Safelisted event list is empty. Ignoring"
            r2.a(r3)
        L_0x01be:
            r5 = 0
            goto L_0x01dd
        L_0x01c0:
            java.util.Iterator r2 = r0.iterator()
        L_0x01c4:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01dd
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            com.google.android.gms.measurement.internal.oc r6 = r11.h()
            java.lang.String r7 = "safelisted event"
            boolean r3 = r6.v0(r7, r3)
            if (r3 != 0) goto L_0x01c4
            goto L_0x01be
        L_0x01dd:
            if (r5 == 0) goto L_0x01e1
            r11.f6502j = r0
        L_0x01e1:
            if (r1 == 0) goto L_0x01ee
            android.content.Context r0 = r11.zza()
            boolean r0 = n2.a.a(r0)
            r11.f6504l = r0
            return
        L_0x01ee:
            r11.f6504l = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.r4.x():void");
    }

    /* access modifiers changed from: protected */
    public final boolean z() {
        return true;
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
