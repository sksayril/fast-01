package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.kd;
import com.google.android.gms.internal.measurement.n4;
import com.google.android.gms.internal.measurement.o4;
import com.google.android.gms.internal.measurement.p4;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.pf;
import com.google.android.gms.internal.measurement.r4;
import com.google.android.gms.internal.measurement.s4;
import com.google.android.gms.internal.measurement.t4;
import com.google.android.gms.internal.measurement.w4;
import h2.p;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class p9 extends yb {
    public p9(zb zbVar) {
        super(zbVar);
    }

    private static String b(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    /* access modifiers changed from: protected */
    public final boolean w() {
        return false;
    }

    public final byte[] x(i0 i0Var, String str) {
        pc pcVar;
        r4.a aVar;
        Bundle bundle;
        s4.a aVar2;
        h6 h6Var;
        byte[] bArr;
        e0 e0Var;
        long j10;
        i0 i0Var2 = i0Var;
        String str2 = str;
        m();
        this.f6276a.P();
        p.j(i0Var);
        p.f(str);
        if (!d().A(str2, k0.f6186f0)) {
            k().E().b("Generating ScionPayload disabled. packageName", str2);
            return new byte[0];
        } else if ("_iap".equals(i0Var2.f6112m) || "_iapx".equals(i0Var2.f6112m)) {
            r4.a M = r4.M();
            p().P0();
            h6 C0 = p().C0(str2);
            if (C0 == null) {
                k().E().b("Log and bundle not available. package_name", str2);
                byte[] bArr2 = new byte[0];
                p().Q0();
                return bArr2;
            } else if (!C0.r()) {
                k().E().b("Log and bundle disabled. package_name", str2);
                byte[] bArr3 = new byte[0];
                p().Q0();
                return bArr3;
            } else {
                s4.a P0 = s4.D3().n0(1).P0("android");
                if (!TextUtils.isEmpty(C0.t0())) {
                    P0.P(C0.t0());
                }
                if (!TextUtils.isEmpty(C0.v0())) {
                    P0.b0((String) p.j(C0.v0()));
                }
                if (!TextUtils.isEmpty(C0.h())) {
                    P0.h0((String) p.j(C0.h()));
                }
                if (C0.z() != -2147483648L) {
                    P0.e0((int) C0.z());
                }
                P0.k0(C0.g0()).Z(C0.c0());
                String j11 = C0.j();
                String r02 = C0.r0();
                if (!TextUtils.isEmpty(j11)) {
                    P0.J0(j11);
                } else if (!TextUtils.isEmpty(r02)) {
                    P0.J(r02);
                }
                P0.z0(C0.p0());
                p7 P = this.f6637b.P(str2);
                P0.T(C0.a0());
                if (this.f6276a.o() && d().J(P0.T0()) && P.x() && !TextUtils.isEmpty((CharSequence) null)) {
                    P0.A0((String) null);
                }
                P0.p0(P.v());
                if (P.x() && C0.q()) {
                    Pair<String, Boolean> y9 = r().y(C0.t0(), P);
                    if (C0.q() && y9 != null && !TextUtils.isEmpty((CharSequence) y9.first)) {
                        try {
                            P0.R0(b((String) y9.first, Long.toString(i0Var2.f6115p)));
                            Object obj = y9.second;
                            if (obj != null) {
                                P0.W(((Boolean) obj).booleanValue());
                            }
                        } catch (SecurityException e10) {
                            k().E().b("Resettable device id encryption failed", e10.getMessage());
                            return new byte[0];
                        } finally {
                            p().Q0();
                        }
                    }
                }
                e().n();
                s4.a x02 = P0.x0(Build.MODEL);
                e().n();
                x02.N0(Build.VERSION.RELEASE).v0((int) e().u()).U0(e().v());
                try {
                    if (P.y() && C0.u0() != null) {
                        P0.V(b((String) p.j(C0.u0()), Long.toString(i0Var2.f6115p)));
                    }
                    if (!TextUtils.isEmpty(C0.i())) {
                        P0.H0((String) p.j(C0.i()));
                    }
                    String t02 = C0.t0();
                    List<pc> L0 = p().L0(t02);
                    Iterator<pc> it = L0.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            pcVar = null;
                            break;
                        }
                        pcVar = it.next();
                        if ("_lte".equals(pcVar.f6446c)) {
                            break;
                        }
                    }
                    if (pcVar == null || pcVar.f6448e == null) {
                        pc pcVar2 = new pc(t02, "auto", "_lte", a().a(), 0L);
                        L0.add(pcVar2);
                        p().d0(pcVar2);
                    }
                    w4[] w4VarArr = new w4[L0.size()];
                    for (int i10 = 0; i10 < L0.size(); i10++) {
                        w4.a C = w4.a0().A(L0.get(i10).f6446c).C(L0.get(i10).f6447d);
                        n().T(C, L0.get(i10).f6448e);
                        w4VarArr[i10] = (w4) ((p8) C.l());
                    }
                    P0.g0(Arrays.asList(w4VarArr));
                    n().S(P0);
                    if (kd.a() && d().r(k0.T0)) {
                        this.f6637b.u(C0, P0);
                    }
                    b5 b10 = b5.b(i0Var);
                    h().L(b10.f5887d, p().z0(str2));
                    h().U(b10, d().x(str2));
                    Bundle bundle2 = b10.f5887d;
                    bundle2.putLong("_c", 1);
                    k().E().a("Marking in-app purchase as real-time");
                    bundle2.putLong("_r", 1);
                    bundle2.putString("_o", i0Var2.f6114o);
                    if (h().E0(P0.T0())) {
                        h().M(bundle2, "_dbg", 1L);
                        h().M(bundle2, "_r", 1L);
                    }
                    e0 B0 = p().B0(str2, i0Var2.f6112m);
                    if (B0 == null) {
                        aVar2 = P0;
                        bundle = bundle2;
                        h6Var = C0;
                        aVar = M;
                        bArr = null;
                        e0Var = new e0(str, i0Var2.f6112m, 0, 0, i0Var2.f6115p, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
                        j10 = 0;
                    } else {
                        aVar2 = P0;
                        bundle = bundle2;
                        h6Var = C0;
                        aVar = M;
                        bArr = null;
                        j10 = B0.f5985f;
                        e0Var = B0.a(i0Var2.f6115p);
                    }
                    p().T(e0Var);
                    a0 a0Var = new a0(this.f6276a, i0Var2.f6114o, str, i0Var2.f6112m, i0Var2.f6115p, j10, bundle);
                    n4.a B = n4.c0().H(a0Var.f5842d).F(a0Var.f5840b).B(a0Var.f5843e);
                    Iterator<String> it2 = a0Var.f5844f.iterator();
                    while (it2.hasNext()) {
                        String next = it2.next();
                        p4.a C2 = p4.c0().C(next);
                        Object l10 = a0Var.f5844f.l(next);
                        if (l10 != null) {
                            n().R(C2, l10);
                            B.C(C2);
                        }
                    }
                    s4.a aVar3 = aVar2;
                    aVar3.E(B).F(t4.J().x(o4.J().x(e0Var.f5982c).y(i0Var2.f6112m)));
                    aVar3.I(o().y(h6Var.t0(), Collections.emptyList(), aVar3.a1(), Long.valueOf(B.J()), Long.valueOf(B.J())));
                    if (B.N()) {
                        aVar3.w0(B.J()).f0(B.J());
                    }
                    long i02 = h6Var.i0();
                    int i11 = (i02 > 0 ? 1 : (i02 == 0 ? 0 : -1));
                    if (i11 != 0) {
                        aVar3.o0(i02);
                    }
                    long m02 = h6Var.m0();
                    if (m02 != 0) {
                        aVar3.s0(m02);
                    } else if (i11 != 0) {
                        aVar3.s0(i02);
                    }
                    String m10 = h6Var.m();
                    if (pf.a()) {
                        if (d().A(str, k0.f6224y0) && m10 != null) {
                            aVar3.S0(m10);
                        }
                    } else {
                        String str3 = str;
                    }
                    h6Var.p();
                    aVar3.j0((int) h6Var.k0()).G0(82001).D0(a().a()).c0(true);
                    if (d().r(k0.C0)) {
                        this.f6637b.z(aVar3.T0(), aVar3);
                    }
                    r4.a aVar4 = aVar;
                    aVar4.y(aVar3);
                    h6 h6Var2 = h6Var;
                    h6Var2.j0(aVar3.X());
                    h6Var2.f0(aVar3.R());
                    p().U(h6Var2);
                    p().S0();
                    try {
                        return n().f0(((r4) ((p8) aVar4.l())).n());
                    } catch (IOException e11) {
                        k().F().c("Data loss. Failed to bundle and serialize. appId", x4.u(str), e11);
                        return bArr;
                    }
                } catch (SecurityException e12) {
                    k().E().b("app instance id encryption failed", e12.getMessage());
                    byte[] bArr4 = new byte[0];
                    p().Q0();
                    return bArr4;
                }
            }
        } else {
            k().E().c("Generating a payload for this event is not available. package_name, event_name", str2, i0Var2.f6112m);
            return null;
        }
    }
}
