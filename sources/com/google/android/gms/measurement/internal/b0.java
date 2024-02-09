package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import h2.p;
import java.util.Map;
import l2.d;
import p.a;

public final class b0 extends f4 {

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Long> f5877b = new a();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Integer> f5878c = new a();

    /* renamed from: d  reason: collision with root package name */
    private long f5879d;

    public b0(m6 m6Var) {
        super(m6Var);
    }

    /* access modifiers changed from: private */
    public final void A(long j10) {
        for (String put : this.f5877b.keySet()) {
            this.f5877b.put(put, Long.valueOf(j10));
        }
        if (!this.f5877b.isEmpty()) {
            this.f5879d = j10;
        }
    }

    static /* synthetic */ void B(b0 b0Var, String str, long j10) {
        b0Var.m();
        p.f(str);
        Integer num = b0Var.f5878c.get(str);
        if (num != null) {
            r9 B = b0Var.r().B(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                b0Var.f5878c.remove(str);
                Long l10 = b0Var.f5877b.get(str);
                if (l10 == null) {
                    b0Var.k().F().a("First ad unit exposure time was never set");
                } else {
                    b0Var.f5877b.remove(str);
                    b0Var.z(str, j10 - l10.longValue(), B);
                }
                if (b0Var.f5878c.isEmpty()) {
                    long j11 = b0Var.f5879d;
                    if (j11 == 0) {
                        b0Var.k().F().a("First ad exposure time was never set");
                        return;
                    }
                    b0Var.v(j10 - j11, B);
                    b0Var.f5879d = 0;
                    return;
                }
                return;
            }
            b0Var.f5878c.put(str, Integer.valueOf(intValue));
            return;
        }
        b0Var.k().F().b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    private final void v(long j10, r9 r9Var) {
        if (r9Var == null) {
            k().J().a("Not logging ad exposure. No active activity");
        } else if (j10 < 1000) {
            k().J().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j10);
            oc.V(r9Var, bundle, true);
            q().y0("am", "_xa", bundle);
        }
    }

    static /* synthetic */ void x(b0 b0Var, String str, long j10) {
        b0Var.m();
        p.f(str);
        if (b0Var.f5878c.isEmpty()) {
            b0Var.f5879d = j10;
        }
        Integer num = b0Var.f5878c.get(str);
        if (num != null) {
            b0Var.f5878c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (b0Var.f5878c.size() >= 100) {
            b0Var.k().K().a("Too many ads visible");
        } else {
            b0Var.f5878c.put(str, 1);
            b0Var.f5877b.put(str, Long.valueOf(j10));
        }
    }

    private final void z(String str, long j10, r9 r9Var) {
        if (r9Var == null) {
            k().J().a("Not logging ad unit exposure. No active activity");
        } else if (j10 < 1000) {
            k().J().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j10);
            oc.V(r9Var, bundle, true);
            q().y0("am", "_xu", bundle);
        }
    }

    public final void C(String str, long j10) {
        if (str == null || str.length() == 0) {
            k().F().a("Ad unit id must be a non-empty string");
        } else {
            i().C(new d2(this, str, j10));
        }
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

    public final void u(long j10) {
        r9 B = r().B(false);
        for (String next : this.f5877b.keySet()) {
            z(next, j10 - this.f5877b.get(next).longValue(), B);
        }
        if (!this.f5877b.isEmpty()) {
            v(j10 - this.f5879d, B);
        }
        A(j10);
    }

    public final void y(String str, long j10) {
        if (str == null || str.length() == 0) {
            k().F().a("Ad unit id must be a non-empty string");
        } else {
            i().C(new a(this, str, j10));
        }
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
