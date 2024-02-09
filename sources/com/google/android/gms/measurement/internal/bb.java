package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Pair;
import b2.a;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import l2.d;

public final class bb extends yb {

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, ab> f5896d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final p5 f5897e;

    /* renamed from: f  reason: collision with root package name */
    public final p5 f5898f;

    /* renamed from: g  reason: collision with root package name */
    public final p5 f5899g;

    /* renamed from: h  reason: collision with root package name */
    public final p5 f5900h;

    /* renamed from: i  reason: collision with root package name */
    public final p5 f5901i;

    bb(zb zbVar) {
        super(zbVar);
        k5 g10 = g();
        g10.getClass();
        this.f5897e = new p5(g10, "last_delete_stale", 0);
        k5 g11 = g();
        g11.getClass();
        this.f5898f = new p5(g11, "backoff", 0);
        k5 g12 = g();
        g12.getClass();
        this.f5899g = new p5(g12, "last_upload", 0);
        k5 g13 = g();
        g13.getClass();
        this.f5900h = new p5(g13, "last_upload_attempt", 0);
        k5 g14 = g();
        g14.getClass();
        this.f5901i = new p5(g14, "midnight_offset", 0);
    }

    @Deprecated
    private final Pair<String, Boolean> x(String str) {
        ab abVar;
        m();
        long b10 = a().b();
        ab abVar2 = this.f5896d.get(str);
        if (abVar2 != null && b10 < abVar2.f5872c) {
            return new Pair<>(abVar2.f5870a, Boolean.valueOf(abVar2.f5871b));
        }
        a.b(true);
        long B = d().B(str) + b10;
        a.C0069a aVar = null;
        try {
            long w9 = d().w(str, k0.f6181d);
            if (w9 > 0) {
                try {
                    aVar = a.a(zza());
                } catch (PackageManager.NameNotFoundException unused) {
                    if (abVar2 != null) {
                        if (b10 < abVar2.f5872c + w9) {
                            return new Pair<>(abVar2.f5870a, Boolean.valueOf(abVar2.f5871b));
                        }
                    }
                }
            } else {
                aVar = a.a(zza());
            }
            if (aVar == null) {
                return new Pair<>("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String a10 = aVar.a();
            abVar = a10 != null ? new ab(a10, aVar.b(), B) : new ab("", aVar.b(), B);
            this.f5896d.put(str, abVar);
            a.b(false);
            return new Pair<>(abVar.f5870a, Boolean.valueOf(abVar.f5871b));
        } catch (Exception e10) {
            k().E().b("Unable to get advertising id", e10);
            abVar = new ab("", false, B);
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

    public final /* bridge */ /* synthetic */ jc n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ xc o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ p p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ w5 q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ bb r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ xb s() {
        return super.s();
    }

    /* access modifiers changed from: protected */
    public final boolean w() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final Pair<String, Boolean> y(String str, p7 p7Var) {
        return p7Var.x() ? x(str) : new Pair<>("", Boolean.FALSE);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public final String z(String str, boolean z9) {
        m();
        String str2 = z9 ? (String) x(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest S0 = oc.S0();
        if (S0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, S0.digest(str2.getBytes()))});
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
