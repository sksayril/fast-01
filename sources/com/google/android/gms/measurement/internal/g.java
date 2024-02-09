package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.ke;
import com.google.android.gms.internal.measurement.pe;
import h2.p;
import java.lang.reflect.InvocationTargetException;
import l2.d;
import l2.l;
import n2.c;

public final class g extends l7 {

    /* renamed from: b  reason: collision with root package name */
    private Boolean f6041b;

    /* renamed from: c  reason: collision with root package name */
    private i f6042c = j.f6143a;

    /* renamed from: d  reason: collision with root package name */
    private Boolean f6043d;

    g(m6 m6Var) {
        super(m6Var);
    }

    public static long F() {
        return k0.f6185f.a(null).longValue();
    }

    public static long L() {
        return k0.F.a(null).longValue();
    }

    private final Bundle T() {
        try {
            if (zza().getPackageManager() == null) {
                k().F().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo b10 = c.a(zza()).b(zza().getPackageName(), 128);
            if (b10 != null) {
                return b10.metaData;
            }
            k().F().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            k().F().b("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    private final String b(String str, String str2) {
        String str3;
        z4 z4Var;
        Class<String> cls = String.class;
        try {
            String str4 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, str2});
            p.j(str4);
            return str4;
        } catch (ClassNotFoundException e10) {
            e = e10;
            z4Var = k().F();
            str3 = "Could not find SystemProperties class";
            z4Var.b(str3, e);
            return str2;
        } catch (NoSuchMethodException e11) {
            e = e11;
            z4Var = k().F();
            str3 = "Could not find SystemProperties.get() method";
            z4Var.b(str3, e);
            return str2;
        } catch (IllegalAccessException e12) {
            e = e12;
            z4Var = k().F();
            str3 = "Could not access SystemProperties.get()";
            z4Var.b(str3, e);
            return str2;
        } catch (InvocationTargetException e13) {
            e = e13;
            z4Var = k().F();
            str3 = "SystemProperties.get() threw an exception";
            z4Var.b(str3, e);
            return str2;
        }
    }

    public final boolean A(String str, o4<Boolean> o4Var) {
        return C(str, o4Var);
    }

    /* access modifiers changed from: package-private */
    public final long B(String str) {
        return w(str, k0.f6179c);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.google.android.gms.measurement.internal.o4<java.lang.Boolean>, com.google.android.gms.measurement.internal.o4] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean C(java.lang.String r4, com.google.android.gms.measurement.internal.o4<java.lang.Boolean> r5) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x000e
        L_0x0003:
            java.lang.Object r4 = r5.a(r0)
        L_0x0007:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        L_0x000e:
            com.google.android.gms.measurement.internal.i r1 = r3.f6042c
            java.lang.String r2 = r5.b()
            java.lang.String r4 = r1.b(r4, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L_0x001f
            goto L_0x0003
        L_0x001f:
            java.lang.String r0 = "1"
            boolean r4 = r0.equals(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r4 = r5.a(r4)
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.g.C(java.lang.String, com.google.android.gms.measurement.internal.o4):boolean");
    }

    public final int D() {
        return h().a0(201500000, true) ? 100 : 25;
    }

    /* access modifiers changed from: package-private */
    public final Boolean E(String str) {
        p.f(str);
        Bundle T = T();
        if (T == null) {
            k().F().a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!T.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(T.getBoolean(str));
        }
    }

    /* access modifiers changed from: package-private */
    public final String G(String str) {
        return y(str, k0.N);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b A[SYNTHETIC, Splitter:B:9:0x002b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> H(java.lang.String r4) {
        /*
            r3 = this;
            h2.p.f(r4)
            android.os.Bundle r0 = r3.T()
            r1 = 0
            if (r0 != 0) goto L_0x0019
            com.google.android.gms.measurement.internal.x4 r4 = r3.k()
            com.google.android.gms.measurement.internal.z4 r4 = r4.F()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L_0x0017:
            r4 = r1
            goto L_0x0028
        L_0x0019:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L_0x0020
            goto L_0x0017
        L_0x0020:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x0028:
            if (r4 != 0) goto L_0x002b
            return r1
        L_0x002b:
            android.content.Context r0 = r3.zza()     // Catch:{ NotFoundException -> 0x0043 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x0043 }
            int r4 = r4.intValue()     // Catch:{ NotFoundException -> 0x0043 }
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch:{ NotFoundException -> 0x0043 }
            if (r4 != 0) goto L_0x003e
            return r1
        L_0x003e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ NotFoundException -> 0x0043 }
            return r4
        L_0x0043:
            r4 = move-exception
            com.google.android.gms.measurement.internal.x4 r0 = r3.k()
            com.google.android.gms.measurement.internal.z4 r0 = r0.F()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.g.H(java.lang.String):java.util.List");
    }

    /* access modifiers changed from: package-private */
    public final boolean I(String str) {
        return C(str, k0.M);
    }

    public final boolean J(String str) {
        return "1".equals(this.f6042c.b(str, "gaia_collection_enabled"));
    }

    public final boolean K(String str) {
        return "1".equals(this.f6042c.b(str, "measurement.event_sampling_enabled"));
    }

    public final String M() {
        return b("debug.firebase.analytics.app", "");
    }

    public final String N() {
        return b("debug.deferred.deeplink", "");
    }

    public final boolean O() {
        Boolean E = E("google_analytics_adid_collection_enabled");
        return E == null || E.booleanValue();
    }

    public final boolean P() {
        Boolean E = E("google_analytics_automatic_screen_reporting_enabled");
        return E == null || E.booleanValue();
    }

    public final boolean Q() {
        Boolean E = E("firebase_analytics_collection_deactivated");
        return E != null && E.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final boolean R() {
        if (this.f6041b == null) {
            Boolean E = E("app_measurement_lite");
            this.f6041b = E;
            if (E == null) {
                this.f6041b = Boolean.FALSE;
            }
        }
        return this.f6041b.booleanValue() || !this.f6276a.s();
    }

    public final boolean S() {
        if (this.f6043d == null) {
            synchronized (this) {
                if (this.f6043d == null) {
                    ApplicationInfo applicationInfo = zza().getApplicationInfo();
                    String a10 = l.a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f6043d = Boolean.valueOf(str != null && str.equals(a10));
                    }
                    if (this.f6043d == null) {
                        this.f6043d = Boolean.TRUE;
                        k().F().a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f6043d.booleanValue();
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

    public final double n(String str, o4<Double> o4Var) {
        if (str != null) {
            String b10 = this.f6042c.b(str, o4Var.b());
            if (!TextUtils.isEmpty(b10)) {
                try {
                    return o4Var.a(Double.valueOf(Double.parseDouble(b10))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return o4Var.a(null).doubleValue();
    }

    /* access modifiers changed from: package-private */
    public final int o(String str) {
        return p(str, k0.J, 500, 2000);
    }

    public final int p(String str, o4<Integer> o4Var, int i10, int i11) {
        return Math.max(Math.min(t(str, o4Var), i11), i10);
    }

    /* access modifiers changed from: package-private */
    public final void q(i iVar) {
        this.f6042c = iVar;
    }

    public final boolean r(o4<Boolean> o4Var) {
        return C((String) null, o4Var);
    }

    /* access modifiers changed from: package-private */
    public final int s(String str) {
        return (!ke.a() || !d().C((String) null, k0.f6178b1)) ? 100 : 500;
    }

    public final int t(String str, o4<Integer> o4Var) {
        if (str != null) {
            String b10 = this.f6042c.b(str, o4Var.b());
            if (!TextUtils.isEmpty(b10)) {
                try {
                    return o4Var.a(Integer.valueOf(Integer.parseInt(b10))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return o4Var.a(null).intValue();
    }

    /* access modifiers changed from: package-private */
    public final int u() {
        return (!pe.a() || !d().C((String) null, k0.I0) || !h().a0(231100000, true)) ? 0 : 35;
    }

    /* access modifiers changed from: package-private */
    public final int v(String str) {
        return Math.max(s(str), 256);
    }

    public final long w(String str, o4<Long> o4Var) {
        if (str != null) {
            String b10 = this.f6042c.b(str, o4Var.b());
            if (!TextUtils.isEmpty(b10)) {
                try {
                    return o4Var.a(Long.valueOf(Long.parseLong(b10))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return o4Var.a(null).longValue();
    }

    public final int x(String str) {
        return p(str, k0.K, 25, 100);
    }

    public final String y(String str, o4<String> o4Var) {
        return o4Var.a(str == null ? null : this.f6042c.b(str, o4Var.b()));
    }

    public final int z(String str) {
        return t(str, k0.f6207q);
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
