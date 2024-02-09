package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.w1;
import e2.i;
import h2.p;
import i2.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import l2.d;

public final class y9 extends e3 {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final va f6748c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public q4 f6749d;

    /* renamed from: e  reason: collision with root package name */
    private volatile Boolean f6750e;

    /* renamed from: f  reason: collision with root package name */
    private final x f6751f;

    /* renamed from: g  reason: collision with root package name */
    private final sb f6752g;

    /* renamed from: h  reason: collision with root package name */
    private final List<Runnable> f6753h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    private final x f6754i;

    protected y9(m6 m6Var) {
        super(m6Var);
        this.f6752g = new sb(m6Var.a());
        this.f6748c = new va(this);
        this.f6751f = new ba(this, m6Var);
        this.f6754i = new ka(this, m6Var);
    }

    static /* synthetic */ void L(y9 y9Var, ComponentName componentName) {
        y9Var.m();
        if (y9Var.f6749d != null) {
            y9Var.f6749d = null;
            y9Var.k().J().b("Disconnected from device MeasurementService", componentName);
            y9Var.m();
            y9Var.X();
        }
    }

    private final void O(Runnable runnable) {
        m();
        if (b0()) {
            runnable.run();
        } else if (((long) this.f6753h.size()) >= 1000) {
            k().F().a("Discarding data. Max runnable queue size reached");
        } else {
            this.f6753h.add(runnable);
            this.f6754i.b(60000);
            X();
        }
    }

    /* access modifiers changed from: private */
    public final void e0() {
        m();
        k().J().b("Processing queued up service tasks", Integer.valueOf(this.f6753h.size()));
        for (Runnable run : this.f6753h) {
            try {
                run.run();
            } catch (RuntimeException e10) {
                k().F().b("Task exception while flushing queue", e10);
            }
        }
        this.f6753h.clear();
        this.f6754i.a();
    }

    /* access modifiers changed from: private */
    public final void f0() {
        m();
        this.f6752g.c();
        this.f6751f.b(k0.L.a(null).longValue());
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean g0() {
        /*
            r5 = this;
            r5.m()
            r5.u()
            java.lang.Boolean r0 = r5.f6750e
            if (r0 != 0) goto L_0x00fb
            r5.m()
            r5.u()
            com.google.android.gms.measurement.internal.k5 r0 = r5.g()
            java.lang.Boolean r0 = r0.J()
            r1 = 1
            if (r0 == 0) goto L_0x0023
            boolean r2 = r0.booleanValue()
            if (r2 == 0) goto L_0x0023
            goto L_0x00f5
        L_0x0023:
            com.google.android.gms.measurement.internal.r4 r2 = r5.o()
            int r2 = r2.B()
            r3 = 0
            if (r2 != r1) goto L_0x0031
        L_0x002e:
            r0 = 1
            goto L_0x00d1
        L_0x0031:
            com.google.android.gms.measurement.internal.x4 r2 = r5.k()
            com.google.android.gms.measurement.internal.z4 r2 = r2.J()
            java.lang.String r4 = "Checking service availability"
            r2.a(r4)
            com.google.android.gms.measurement.internal.oc r2 = r5.h()
            r4 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r2 = r2.t(r4)
            if (r2 == 0) goto L_0x00c2
            if (r2 == r1) goto L_0x00b2
            r4 = 2
            if (r2 == r4) goto L_0x0092
            r0 = 3
            if (r2 == r0) goto L_0x0083
            r0 = 9
            if (r2 == r0) goto L_0x0078
            r0 = 18
            if (r2 == r0) goto L_0x006d
            com.google.android.gms.measurement.internal.x4 r0 = r5.k()
            com.google.android.gms.measurement.internal.z4 r0 = r0.K()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = "Unexpected service status"
            r0.b(r2, r1)
            goto L_0x0090
        L_0x006d:
            com.google.android.gms.measurement.internal.x4 r0 = r5.k()
            com.google.android.gms.measurement.internal.z4 r0 = r0.K()
            java.lang.String r2 = "Service updating"
            goto L_0x00cc
        L_0x0078:
            com.google.android.gms.measurement.internal.x4 r0 = r5.k()
            com.google.android.gms.measurement.internal.z4 r0 = r0.K()
            java.lang.String r1 = "Service invalid"
            goto L_0x008d
        L_0x0083:
            com.google.android.gms.measurement.internal.x4 r0 = r5.k()
            com.google.android.gms.measurement.internal.z4 r0 = r0.K()
            java.lang.String r1 = "Service disabled"
        L_0x008d:
            r0.a(r1)
        L_0x0090:
            r0 = 0
            goto L_0x00c0
        L_0x0092:
            com.google.android.gms.measurement.internal.x4 r2 = r5.k()
            com.google.android.gms.measurement.internal.z4 r2 = r2.E()
            java.lang.String r4 = "Service container out of date"
            r2.a(r4)
            com.google.android.gms.measurement.internal.oc r2 = r5.h()
            int r2 = r2.F0()
            r4 = 17443(0x4423, float:2.4443E-41)
            if (r2 >= r4) goto L_0x00ac
            goto L_0x00bf
        L_0x00ac:
            if (r0 != 0) goto L_0x00af
            goto L_0x00b0
        L_0x00af:
            r1 = 0
        L_0x00b0:
            r0 = 0
            goto L_0x00d1
        L_0x00b2:
            com.google.android.gms.measurement.internal.x4 r0 = r5.k()
            com.google.android.gms.measurement.internal.z4 r0 = r0.J()
            java.lang.String r2 = "Service missing"
            r0.a(r2)
        L_0x00bf:
            r0 = 1
        L_0x00c0:
            r1 = 0
            goto L_0x00d1
        L_0x00c2:
            com.google.android.gms.measurement.internal.x4 r0 = r5.k()
            com.google.android.gms.measurement.internal.z4 r0 = r0.J()
            java.lang.String r2 = "Service available"
        L_0x00cc:
            r0.a(r2)
            goto L_0x002e
        L_0x00d1:
            if (r1 != 0) goto L_0x00eb
            com.google.android.gms.measurement.internal.g r2 = r5.d()
            boolean r2 = r2.R()
            if (r2 == 0) goto L_0x00eb
            com.google.android.gms.measurement.internal.x4 r0 = r5.k()
            com.google.android.gms.measurement.internal.z4 r0 = r0.F()
            java.lang.String r2 = "No way to upload. Consider using the full version of Analytics"
            r0.a(r2)
            goto L_0x00ec
        L_0x00eb:
            r3 = r0
        L_0x00ec:
            if (r3 == 0) goto L_0x00f5
            com.google.android.gms.measurement.internal.k5 r0 = r5.g()
            r0.v(r1)
        L_0x00f5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r5.f6750e = r0
        L_0x00fb:
            java.lang.Boolean r0 = r5.f6750e
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.y9.g0():boolean");
    }

    private final sc i0(boolean z9) {
        return o().A(z9 ? k().N() : null);
    }

    static /* synthetic */ void k0(y9 y9Var) {
        y9Var.m();
        if (y9Var.b0()) {
            y9Var.k().J().a("Inactivity, disconnecting from the service");
            y9Var.Y();
        }
    }

    public final void B(Bundle bundle) {
        m();
        u();
        O(new la(this, i0(false), bundle));
    }

    public final void C(w1 w1Var) {
        m();
        u();
        O(new fa(this, i0(false), w1Var));
    }

    public final void D(w1 w1Var, i0 i0Var, String str) {
        m();
        u();
        if (h().t(i.f8355a) != 0) {
            k().K().a("Not bundling data. Service unavailable or out of date");
            h().T(w1Var, new byte[0]);
            return;
        }
        O(new na(this, i0Var, str, w1Var));
    }

    /* access modifiers changed from: protected */
    public final void E(w1 w1Var, String str, String str2) {
        m();
        u();
        O(new ta(this, str, str2, i0(false), w1Var));
    }

    /* access modifiers changed from: protected */
    public final void F(w1 w1Var, String str, String str2, boolean z9) {
        m();
        u();
        O(new aa(this, str, str2, i0(false), z9, w1Var));
    }

    /* access modifiers changed from: protected */
    public final void G(e eVar) {
        p.j(eVar);
        m();
        u();
        O(new ra(this, true, i0(true), p().D(eVar), new e(eVar), eVar));
    }

    /* access modifiers changed from: protected */
    public final void H(i0 i0Var, String str) {
        p.j(i0Var);
        m();
        u();
        O(new oa(this, true, i0(true), p().E(i0Var), i0Var, str));
    }

    /* access modifiers changed from: protected */
    public final void I(q4 q4Var) {
        m();
        p.j(q4Var);
        this.f6749d = q4Var;
        f0();
        e0();
    }

    /* access modifiers changed from: package-private */
    public final void J(q4 q4Var, a aVar, sc scVar) {
        int i10;
        z4 F;
        String str;
        m();
        u();
        int i11 = 0;
        int i12 = 100;
        while (i11 < 1001 && i12 == 100) {
            ArrayList arrayList = new ArrayList();
            List<a> B = p().B(100);
            if (B != null) {
                arrayList.addAll(B);
                i10 = B.size();
            } else {
                i10 = 0;
            }
            if (aVar != null && i10 < 100) {
                arrayList.add(aVar);
            }
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                a aVar2 = (a) obj;
                if (aVar2 instanceof i0) {
                    try {
                        q4Var.a2((i0) aVar2, scVar);
                    } catch (RemoteException e10) {
                        e = e10;
                        F = k().F();
                        str = "Failed to send event to the service";
                    }
                } else if (aVar2 instanceof nc) {
                    try {
                        q4Var.I2((nc) aVar2, scVar);
                    } catch (RemoteException e11) {
                        e = e11;
                        F = k().F();
                        str = "Failed to send user property to the service";
                    }
                } else if (aVar2 instanceof e) {
                    try {
                        q4Var.G2((e) aVar2, scVar);
                    } catch (RemoteException e12) {
                        e = e12;
                        F = k().F();
                        str = "Failed to send conditional user property to the service";
                    }
                } else {
                    k().F().a("Discarding data. Unrecognized parcel type.");
                }
            }
            i11++;
            i12 = i10;
        }
        return;
        F.b(str, e);
    }

    /* access modifiers changed from: protected */
    public final void K(r9 r9Var) {
        m();
        u();
        O(new ha(this, r9Var));
    }

    /* access modifiers changed from: protected */
    public final void N(nc ncVar) {
        m();
        u();
        O(new ea(this, i0(true), p().F(ncVar), ncVar));
    }

    public final void P(AtomicReference<String> atomicReference) {
        m();
        u();
        O(new ga(this, atomicReference, i0(false)));
    }

    /* access modifiers changed from: protected */
    public final void Q(AtomicReference<List<rb>> atomicReference, Bundle bundle) {
        m();
        u();
        O(new ca(this, atomicReference, i0(false), bundle));
    }

    /* access modifiers changed from: protected */
    public final void R(AtomicReference<List<e>> atomicReference, String str, String str2, String str3) {
        m();
        u();
        O(new qa(this, atomicReference, str, str2, str3, i0(false)));
    }

    /* access modifiers changed from: protected */
    public final void S(AtomicReference<List<nc>> atomicReference, String str, String str2, String str3, boolean z9) {
        m();
        u();
        O(new sa(this, atomicReference, str, str2, str3, i0(false), z9));
    }

    /* access modifiers changed from: protected */
    public final void T(boolean z9) {
        m();
        u();
        if (z9) {
            p().G();
        }
        if (d0()) {
            O(new pa(this, i0(false)));
        }
    }

    /* access modifiers changed from: protected */
    public final n U() {
        m();
        u();
        q4 q4Var = this.f6749d;
        if (q4Var == null) {
            X();
            k().E().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        sc i02 = i0(false);
        p.j(i02);
        try {
            n T0 = q4Var.T0(i02);
            f0();
            return T0;
        } catch (RemoteException e10) {
            k().F().b("Failed to get consents; remote exception", e10);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final Boolean V() {
        return this.f6750e;
    }

    /* access modifiers changed from: protected */
    public final void W() {
        m();
        u();
        sc i02 = i0(true);
        p().H();
        O(new ja(this, i02));
    }

    /* access modifiers changed from: package-private */
    public final void X() {
        m();
        u();
        if (!b0()) {
            if (g0()) {
                this.f6748c.a();
            } else if (!d().R()) {
                List<ResolveInfo> queryIntentServices = zza().getPackageManager().queryIntentServices(new Intent().setClassName(zza(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    Intent intent = new Intent("com.google.android.gms.measurement.START");
                    intent.setComponent(new ComponentName(zza(), "com.google.android.gms.measurement.AppMeasurementService"));
                    this.f6748c.b(intent);
                    return;
                }
                k().F().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            }
        }
    }

    public final void Y() {
        m();
        u();
        this.f6748c.d();
        try {
            k2.a.b().c(zza(), this.f6748c);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f6749d = null;
    }

    /* access modifiers changed from: protected */
    public final void Z() {
        m();
        u();
        sc i02 = i0(false);
        p().G();
        O(new da(this, i02));
    }

    public final /* bridge */ /* synthetic */ d a() {
        return super.a();
    }

    /* access modifiers changed from: protected */
    public final void a0() {
        m();
        u();
        O(new ma(this, i0(true)));
    }

    public final boolean b0() {
        m();
        u();
        return this.f6749d != null;
    }

    public final /* bridge */ /* synthetic */ f c() {
        return super.c();
    }

    /* access modifiers changed from: package-private */
    public final boolean c0() {
        m();
        u();
        return !g0() || h().F0() >= 200900;
    }

    public final /* bridge */ /* synthetic */ g d() {
        return super.d();
    }

    /* access modifiers changed from: package-private */
    public final boolean d0() {
        m();
        u();
        return !g0() || h().F0() >= k0.f6210r0.a(null).intValue();
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
