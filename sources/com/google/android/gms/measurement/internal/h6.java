package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import h2.p;
import java.util.ArrayList;
import java.util.List;

final class h6 {
    private long A;
    private long B;
    private long C;
    private long D;
    private long E;
    private long F;
    private long G;
    private String H;
    private boolean I;
    private long J;
    private long K;

    /* renamed from: a  reason: collision with root package name */
    private final m6 f6081a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6082b;

    /* renamed from: c  reason: collision with root package name */
    private String f6083c;

    /* renamed from: d  reason: collision with root package name */
    private String f6084d;

    /* renamed from: e  reason: collision with root package name */
    private String f6085e;

    /* renamed from: f  reason: collision with root package name */
    private String f6086f;

    /* renamed from: g  reason: collision with root package name */
    private long f6087g;

    /* renamed from: h  reason: collision with root package name */
    private long f6088h;

    /* renamed from: i  reason: collision with root package name */
    private long f6089i;

    /* renamed from: j  reason: collision with root package name */
    private String f6090j;

    /* renamed from: k  reason: collision with root package name */
    private long f6091k;

    /* renamed from: l  reason: collision with root package name */
    private String f6092l;

    /* renamed from: m  reason: collision with root package name */
    private long f6093m;

    /* renamed from: n  reason: collision with root package name */
    private long f6094n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f6095o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f6096p;

    /* renamed from: q  reason: collision with root package name */
    private String f6097q;

    /* renamed from: r  reason: collision with root package name */
    private Boolean f6098r;

    /* renamed from: s  reason: collision with root package name */
    private long f6099s;

    /* renamed from: t  reason: collision with root package name */
    private List<String> f6100t;

    /* renamed from: u  reason: collision with root package name */
    private String f6101u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f6102v;

    /* renamed from: w  reason: collision with root package name */
    private long f6103w;

    /* renamed from: x  reason: collision with root package name */
    private long f6104x;

    /* renamed from: y  reason: collision with root package name */
    private int f6105y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f6106z;

    h6(m6 m6Var, String str) {
        p.j(m6Var);
        p.f(str);
        this.f6081a = m6Var;
        this.f6082b = str;
        m6Var.i().m();
    }

    public final void A(long j10) {
        this.f6081a.i().m();
        this.I |= this.J != j10;
        this.J = j10;
    }

    public final void B(String str) {
        this.f6081a.i().m();
        this.I |= !g5.a(this.f6092l, str);
        this.f6092l = str;
    }

    public final void C(boolean z9) {
        this.f6081a.i().m();
        this.I |= this.f6102v != z9;
        this.f6102v = z9;
    }

    public final long D() {
        this.f6081a.i().m();
        return this.A;
    }

    public final void E(long j10) {
        this.f6081a.i().m();
        this.I |= this.E != j10;
        this.E = j10;
    }

    public final void F(String str) {
        this.f6081a.i().m();
        this.I |= !g5.a(this.f6090j, str);
        this.f6090j = str;
    }

    public final void G(boolean z9) {
        this.f6081a.i().m();
        this.I |= this.f6106z != z9;
        this.f6106z = z9;
    }

    public final long H() {
        this.f6081a.i().m();
        return this.J;
    }

    public final void I(long j10) {
        this.f6081a.i().m();
        this.I |= this.F != j10;
        this.F = j10;
    }

    public final void J(String str) {
        this.f6081a.i().m();
        this.I |= !g5.a(this.f6086f, str);
        this.f6086f = str;
    }

    public final long K() {
        this.f6081a.i().m();
        return this.E;
    }

    public final void L(long j10) {
        this.f6081a.i().m();
        this.I |= this.D != j10;
        this.D = j10;
    }

    public final void M(String str) {
        this.f6081a.i().m();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.I |= !g5.a(this.f6084d, str);
        this.f6084d = str;
    }

    public final long N() {
        this.f6081a.i().m();
        return this.F;
    }

    public final void O(long j10) {
        this.f6081a.i().m();
        this.I |= this.C != j10;
        this.C = j10;
    }

    public final void P(String str) {
        this.f6081a.i().m();
        this.I |= !g5.a(this.H, str);
        this.H = str;
    }

    public final long Q() {
        this.f6081a.i().m();
        return this.D;
    }

    public final void R(long j10) {
        this.f6081a.i().m();
        this.I |= this.G != j10;
        this.G = j10;
    }

    public final void S(String str) {
        this.f6081a.i().m();
        this.I |= !g5.a(this.f6085e, str);
        this.f6085e = str;
    }

    public final long T() {
        this.f6081a.i().m();
        return this.C;
    }

    public final void U(long j10) {
        this.f6081a.i().m();
        this.I |= this.B != j10;
        this.B = j10;
    }

    public final void V(String str) {
        this.f6081a.i().m();
        this.I |= !g5.a(this.f6101u, str);
        this.f6101u = str;
    }

    public final long W() {
        this.f6081a.i().m();
        return this.G;
    }

    public final void X(long j10) {
        this.f6081a.i().m();
        this.I |= this.f6094n != j10;
        this.f6094n = j10;
    }

    public final long Y() {
        this.f6081a.i().m();
        return this.B;
    }

    public final void Z(long j10) {
        this.f6081a.i().m();
        this.I |= this.f6099s != j10;
        this.f6099s = j10;
    }

    public final int a() {
        this.f6081a.i().m();
        return this.f6105y;
    }

    public final long a0() {
        this.f6081a.i().m();
        return this.f6094n;
    }

    public final void b(int i10) {
        this.f6081a.i().m();
        this.I |= this.f6105y != i10;
        this.f6105y = i10;
    }

    public final void b0(long j10) {
        this.f6081a.i().m();
        this.I |= this.K != j10;
        this.K = j10;
    }

    public final void c(long j10) {
        this.f6081a.i().m();
        this.I |= this.f6091k != j10;
        this.f6091k = j10;
    }

    public final long c0() {
        this.f6081a.i().m();
        return this.f6099s;
    }

    public final void d(Boolean bool) {
        this.f6081a.i().m();
        this.I |= !g5.a(this.f6098r, bool);
        this.f6098r = bool;
    }

    public final void d0(long j10) {
        this.f6081a.i().m();
        this.I |= this.f6093m != j10;
        this.f6093m = j10;
    }

    public final void e(String str) {
        this.f6081a.i().m();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.I |= !g5.a(this.f6097q, str);
        this.f6097q = str;
    }

    public final long e0() {
        this.f6081a.i().m();
        return this.K;
    }

    public final void f(List<String> list) {
        this.f6081a.i().m();
        if (!g5.a(this.f6100t, list)) {
            this.I = true;
            this.f6100t = list != null ? new ArrayList(list) : null;
        }
    }

    public final void f0(long j10) {
        this.f6081a.i().m();
        this.I |= this.f6089i != j10;
        this.f6089i = j10;
    }

    public final void g(boolean z9) {
        this.f6081a.i().m();
        this.I |= this.f6096p != z9;
        this.f6096p = z9;
    }

    public final long g0() {
        this.f6081a.i().m();
        return this.f6093m;
    }

    public final String h() {
        this.f6081a.i().m();
        return this.f6090j;
    }

    public final void h0(long j10) {
        boolean z9 = true;
        p.a(j10 >= 0);
        this.f6081a.i().m();
        boolean z10 = this.I;
        if (this.f6087g == j10) {
            z9 = false;
        }
        this.I = z9 | z10;
        this.f6087g = j10;
    }

    public final String i() {
        this.f6081a.i().m();
        return this.f6086f;
    }

    public final long i0() {
        this.f6081a.i().m();
        return this.f6089i;
    }

    public final String j() {
        this.f6081a.i().m();
        return this.f6084d;
    }

    public final void j0(long j10) {
        this.f6081a.i().m();
        this.I |= this.f6088h != j10;
        this.f6088h = j10;
    }

    public final String k() {
        this.f6081a.i().m();
        return this.H;
    }

    public final long k0() {
        this.f6081a.i().m();
        return this.f6087g;
    }

    public final String l() {
        this.f6081a.i().m();
        return this.f6085e;
    }

    public final void l0(long j10) {
        this.f6081a.i().m();
        this.I |= this.f6104x != j10;
        this.f6104x = j10;
    }

    public final String m() {
        this.f6081a.i().m();
        return this.f6101u;
    }

    public final long m0() {
        this.f6081a.i().m();
        return this.f6088h;
    }

    public final List<String> n() {
        this.f6081a.i().m();
        return this.f6100t;
    }

    public final void n0(long j10) {
        this.f6081a.i().m();
        this.I |= this.f6103w != j10;
        this.f6103w = j10;
    }

    public final void o() {
        this.f6081a.i().m();
        this.I = false;
    }

    public final long o0() {
        this.f6081a.i().m();
        return this.f6104x;
    }

    public final void p() {
        this.f6081a.i().m();
        long j10 = this.f6087g + 1;
        if (j10 > 2147483647L) {
            this.f6081a.k().K().b("Bundle index overflow. appId", x4.u(this.f6082b));
            j10 = 0;
        }
        this.I = true;
        this.f6087g = j10;
    }

    public final long p0() {
        this.f6081a.i().m();
        return this.f6103w;
    }

    public final boolean q() {
        this.f6081a.i().m();
        return this.f6096p;
    }

    public final Boolean q0() {
        this.f6081a.i().m();
        return this.f6098r;
    }

    public final boolean r() {
        this.f6081a.i().m();
        return this.f6095o;
    }

    public final String r0() {
        this.f6081a.i().m();
        return this.f6097q;
    }

    public final boolean s() {
        this.f6081a.i().m();
        return this.I;
    }

    public final String s0() {
        this.f6081a.i().m();
        String str = this.H;
        P((String) null);
        return str;
    }

    public final boolean t() {
        this.f6081a.i().m();
        return this.f6102v;
    }

    public final String t0() {
        this.f6081a.i().m();
        return this.f6082b;
    }

    public final boolean u() {
        this.f6081a.i().m();
        return this.f6106z;
    }

    public final String u0() {
        this.f6081a.i().m();
        return this.f6083c;
    }

    public final long v() {
        this.f6081a.i().m();
        return 0;
    }

    public final String v0() {
        this.f6081a.i().m();
        return this.f6092l;
    }

    public final void w(long j10) {
        this.f6081a.i().m();
        this.I |= this.A != j10;
        this.A = j10;
    }

    public final void x(String str) {
        this.f6081a.i().m();
        this.I |= !g5.a(this.f6083c, str);
        this.f6083c = str;
    }

    public final void y(boolean z9) {
        this.f6081a.i().m();
        this.I |= this.f6095o != z9;
        this.f6095o = z9;
    }

    public final long z() {
        this.f6081a.i().m();
        return this.f6091k;
    }
}
