package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.r1;
import l2.d;

public final class gb extends e3 {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Handler f6065c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6066d = true;

    /* renamed from: e  reason: collision with root package name */
    protected final pb f6067e = new pb(this);

    /* renamed from: f  reason: collision with root package name */
    protected final nb f6068f = new nb(this);

    /* renamed from: g  reason: collision with root package name */
    private final mb f6069g = new mb(this);

    gb(m6 m6Var) {
        super(m6Var);
    }

    static /* synthetic */ void B(gb gbVar, long j10) {
        gbVar.m();
        gbVar.F();
        gbVar.k().J().b("Activity paused, time", Long.valueOf(j10));
        gbVar.f6069g.b(j10);
        if (gbVar.d().P()) {
            gbVar.f6068f.e(j10);
        }
    }

    /* access modifiers changed from: private */
    public final void F() {
        m();
        if (this.f6065c == null) {
            this.f6065c = new r1(Looper.getMainLooper());
        }
    }

    static /* synthetic */ void H(gb gbVar, long j10) {
        gbVar.m();
        gbVar.F();
        gbVar.k().J().b("Activity resumed, time", Long.valueOf(j10));
        if (!gbVar.d().r(k0.Q0) ? gbVar.d().P() || gbVar.g().f6248s.b() : gbVar.d().P() || gbVar.f6066d) {
            gbVar.f6068f.f(j10);
        }
        gbVar.f6069g.a();
        pb pbVar = gbVar.f6067e;
        pbVar.f6443a.m();
        if (pbVar.f6443a.f6276a.o()) {
            pbVar.b(pbVar.f6443a.a().a(), false);
        }
    }

    /* access modifiers changed from: package-private */
    public final void C(boolean z9) {
        m();
        this.f6066d = z9;
    }

    public final boolean D(boolean z9, boolean z10, long j10) {
        return this.f6068f.d(z9, z10, j10);
    }

    /* access modifiers changed from: package-private */
    public final boolean E() {
        m();
        return this.f6066d;
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
