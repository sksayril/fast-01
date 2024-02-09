package com.google.android.gms.measurement.internal;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.b0;
import com.google.android.gms.internal.measurement.b1;
import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.internal.measurement.kd;
import e2.i;
import e2.j;
import h2.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l2.n;

public final class q6 extends p4 {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final zb f6463c;

    /* renamed from: d  reason: collision with root package name */
    private Boolean f6464d;

    /* renamed from: e  reason: collision with root package name */
    private String f6465e;

    public q6(zb zbVar) {
        this(zbVar, (String) null);
    }

    private q6(zb zbVar, String str) {
        p.j(zbVar);
        this.f6463c = zbVar;
        this.f6465e = null;
    }

    private final void Y(Runnable runnable) {
        p.j(runnable);
        if (this.f6463c.i().I()) {
            runnable.run();
        } else {
            this.f6463c.i().C(runnable);
        }
    }

    private final void f3(String str, boolean z9) {
        boolean z10;
        if (!TextUtils.isEmpty(str)) {
            if (z9) {
                try {
                    if (this.f6464d == null) {
                        if (!"com.google.android.gms".equals(this.f6465e) && !n.a(this.f6463c.zza(), Binder.getCallingUid())) {
                            if (!j.a(this.f6463c.zza()).c(Binder.getCallingUid())) {
                                z10 = false;
                                this.f6464d = Boolean.valueOf(z10);
                            }
                        }
                        z10 = true;
                        this.f6464d = Boolean.valueOf(z10);
                    }
                    if (this.f6464d.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e10) {
                    this.f6463c.k().F().b("Measurement Service called with invalid calling package. appId", x4.u(str));
                    throw e10;
                }
            }
            if (this.f6465e == null && i.j(this.f6463c.zza(), Binder.getCallingUid(), str)) {
                this.f6465e = str;
            }
            if (!str.equals(this.f6465e)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.f6463c.k().F().a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    private final void h3(sc scVar, boolean z9) {
        p.j(scVar);
        p.f(scVar.f6559m);
        f3(scVar.f6559m, false);
        this.f6463c.m0().i0(scVar.f6560n, scVar.C);
    }

    private final void j3(i0 i0Var, sc scVar) {
        this.f6463c.n0();
        this.f6463c.s(i0Var, scVar);
    }

    public final void G2(e eVar, sc scVar) {
        p.j(eVar);
        p.j(eVar.f5971o);
        h3(scVar, false);
        e eVar2 = new e(eVar);
        eVar2.f5969m = scVar.f6559m;
        Y(new t6(this, eVar2, scVar));
    }

    public final void I2(nc ncVar, sc scVar) {
        p.j(ncVar);
        h3(scVar, false);
        Y(new f7(this, ncVar, scVar));
    }

    public final String K1(sc scVar) {
        h3(scVar, false);
        return this.f6463c.Q(scVar);
    }

    public final void P1(i0 i0Var, String str, String str2) {
        p.j(i0Var);
        p.f(str);
        f3(str, true);
        Y(new d7(this, i0Var, str));
    }

    public final n T0(sc scVar) {
        h3(scVar, false);
        p.f(scVar.f6559m);
        if (!kd.a()) {
            return new n((Bundle) null);
        }
        try {
            return (n) this.f6463c.i().A(new b7(this, scVar)).get(10000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            this.f6463c.k().F().c("Failed to get consent. appId", x4.u(scVar.f6559m), e10);
            return new n((Bundle) null);
        }
    }

    public final List<nc> V0(String str, String str2, String str3, boolean z9) {
        f3(str, true);
        try {
            List<pc> list = (List) this.f6463c.i().v(new y6(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (pc pcVar : list) {
                if (z9 || !oc.G0(pcVar.f6446c)) {
                    arrayList.add(new nc(pcVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f6463c.k().F().c("Failed to get user properties as. appId", x4.u(str), e10);
            return Collections.emptyList();
        }
    }

    public final void a2(i0 i0Var, sc scVar) {
        p.j(i0Var);
        h3(scVar, false);
        Y(new e7(this, i0Var, scVar));
    }

    public final void b1(sc scVar) {
        p.f(scVar.f6559m);
        p.j(scVar.H);
        c7 c7Var = new c7(this, scVar);
        p.j(c7Var);
        if (this.f6463c.i().I()) {
            c7Var.run();
        } else {
            this.f6463c.i().F(c7Var);
        }
    }

    public final List<e> c0(String str, String str2, sc scVar) {
        h3(scVar, false);
        String str3 = scVar.f6559m;
        p.j(str3);
        try {
            return (List) this.f6463c.i().v(new x6(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f6463c.k().F().b("Failed to get conditional user properties", e10);
            return Collections.emptyList();
        }
    }

    public final void c1(Bundle bundle, sc scVar) {
        h3(scVar, false);
        String str = scVar.f6559m;
        p.j(str);
        Y(new p6(this, str, bundle));
    }

    public final void d1(sc scVar) {
        h3(scVar, false);
        Y(new s6(this, scVar));
    }

    public final List<rb> d2(sc scVar, Bundle bundle) {
        h3(scVar, false);
        p.j(scVar.f6559m);
        try {
            return (List) this.f6463c.i().v(new j7(this, scVar, bundle)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f6463c.k().F().c("Failed to get trigger URIs. appId", x4.u(scVar.f6559m), e10);
            return Collections.emptyList();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e3(String str, Bundle bundle) {
        this.f6463c.d0().g0(str, bundle);
    }

    /* access modifiers changed from: package-private */
    public final i0 g3(i0 i0Var, sc scVar) {
        d0 d0Var;
        boolean z9 = false;
        if (!(!"_cmp".equals(i0Var.f6112m) || (d0Var = i0Var.f6113n) == null || d0Var.d() == 0)) {
            String o10 = i0Var.f6113n.o("_cis");
            if ("referrer broadcast".equals(o10) || "referrer API".equals(o10)) {
                z9 = true;
            }
        }
        if (!z9) {
            return i0Var;
        }
        this.f6463c.k().I().b("Event has been filtered ", i0Var.toString());
        return new i0("_cmpx", i0Var.f6113n, i0Var.f6114o, i0Var.f6115p);
    }

    /* access modifiers changed from: package-private */
    public final void i3(i0 i0Var, sc scVar) {
        z4 J;
        String str;
        String str2;
        if (!this.f6463c.g0().V(scVar.f6559m)) {
            j3(i0Var, scVar);
            return;
        }
        this.f6463c.k().J().b("EES config found for", scVar.f6559m);
        w5 g02 = this.f6463c.g0();
        String str3 = scVar.f6559m;
        b0 c10 = TextUtils.isEmpty(str3) ? null : g02.f6655j.c(str3);
        if (c10 == null) {
            J = this.f6463c.k().J();
            str = scVar.f6559m;
            str2 = "EES not loaded for";
        } else {
            boolean z9 = false;
            try {
                Map<String, Object> N = this.f6463c.l0().N(i0Var.f6113n.i(), true);
                String a10 = q7.a(i0Var.f6112m);
                if (a10 == null) {
                    a10 = i0Var.f6112m;
                }
                z9 = c10.d(new e(a10, i0Var.f6115p, N));
            } catch (b1 unused) {
                this.f6463c.k().F().c("EES error. appId, eventName", scVar.f6560n, i0Var.f6112m);
            }
            if (!z9) {
                J = this.f6463c.k().J();
                str = i0Var.f6112m;
                str2 = "EES was not applied to event";
            } else {
                if (c10.g()) {
                    this.f6463c.k().J().b("EES edited event", i0Var.f6112m);
                    i0Var = this.f6463c.l0().F(c10.a().d());
                }
                j3(i0Var, scVar);
                if (c10.f()) {
                    for (e next : c10.a().f()) {
                        this.f6463c.k().J().b("EES logging created event", next.e());
                        j3(this.f6463c.l0().F(next), scVar);
                    }
                    return;
                }
                return;
            }
        }
        J.b(str2, str);
        j3(i0Var, scVar);
    }

    public final void l0(sc scVar) {
        p.f(scVar.f6559m);
        f3(scVar.f6559m, false);
        Y(new z6(this, scVar));
    }

    public final List<nc> m2(sc scVar, boolean z9) {
        h3(scVar, false);
        String str = scVar.f6559m;
        p.j(str);
        try {
            List<pc> list = (List) this.f6463c.i().v(new i7(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (pc pcVar : list) {
                if (z9 || !oc.G0(pcVar.f6446c)) {
                    arrayList.add(new nc(pcVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f6463c.k().F().c("Failed to get user properties. appId", x4.u(scVar.f6559m), e10);
            return null;
        }
    }

    public final void s2(long j10, String str, String str2, String str3) {
        Y(new u6(this, str2, str3, str, j10));
    }

    public final List<nc> u1(String str, String str2, boolean z9, sc scVar) {
        h3(scVar, false);
        String str3 = scVar.f6559m;
        p.j(str3);
        try {
            List<pc> list = (List) this.f6463c.i().v(new v6(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (pc pcVar : list) {
                if (z9 || !oc.G0(pcVar.f6446c)) {
                    arrayList.add(new nc(pcVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f6463c.k().F().c("Failed to query user properties. appId", x4.u(scVar.f6559m), e10);
            return Collections.emptyList();
        }
    }

    public final byte[] v2(i0 i0Var, String str) {
        p.f(str);
        p.j(i0Var);
        f3(str, true);
        this.f6463c.k().E().b("Log and bundle. event", this.f6463c.e0().c(i0Var.f6112m));
        long c10 = this.f6463c.a().c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f6463c.i().A(new g7(this, i0Var, str)).get();
            if (bArr == null) {
                this.f6463c.k().F().b("Log and bundle returned null. appId", x4.u(str));
                bArr = new byte[0];
            }
            this.f6463c.k().E().d("Log and bundle processed. event, size, time_ms", this.f6463c.e0().c(i0Var.f6112m), Integer.valueOf(bArr.length), Long.valueOf((this.f6463c.a().c() / 1000000) - c10));
            return bArr;
        } catch (InterruptedException | ExecutionException e10) {
            this.f6463c.k().F().d("Failed to log and bundle. appId, event, error", x4.u(str), this.f6463c.e0().c(i0Var.f6112m), e10);
            return null;
        }
    }

    public final void x0(e eVar) {
        p.j(eVar);
        p.j(eVar.f5971o);
        p.f(eVar.f5969m);
        f3(eVar.f5969m, true);
        Y(new w6(this, new e(eVar)));
    }

    public final void y2(sc scVar) {
        h3(scVar, false);
        Y(new r6(this, scVar));
    }

    public final List<e> z2(String str, String str2, String str3) {
        f3(str, true);
        try {
            return (List) this.f6463c.i().v(new a7(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f6463c.k().F().b("Failed to get conditional user properties as", e10);
            return Collections.emptyList();
        }
    }
}
