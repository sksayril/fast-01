package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

final class b8 implements qc {

    /* renamed from: a  reason: collision with root package name */
    private final y7 f5122a;

    private b8(y7 y7Var) {
        y7 y7Var2 = (y7) r8.f(y7Var, "output");
        this.f5122a = y7Var2;
        y7Var2.f5717a = this;
    }

    public static b8 O(y7 y7Var) {
        b8 b8Var = y7Var.f5717a;
        return b8Var != null ? b8Var : new b8(y7Var);
    }

    public final void A(int i10, List<Double> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.f5122a.Z(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += y7.c(list.get(i13).doubleValue());
            }
            this.f5122a.Y(i12);
            while (i11 < list.size()) {
                this.f5122a.J(list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f5122a.M(i10, list.get(i11).doubleValue());
            i11++;
        }
    }

    public final void B(int i10, Object obj, va vaVar) {
        y7 y7Var = this.f5122a;
        y7Var.Z(i10, 3);
        vaVar.h((da) obj, y7Var.f5717a);
        y7Var.Z(i10, 4);
    }

    public final void C(int i10, List<Float> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.f5122a.Z(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += y7.d(list.get(i13).floatValue());
            }
            this.f5122a.Y(i12);
            while (i11 < list.size()) {
                this.f5122a.K(list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f5122a.N(i10, list.get(i11).floatValue());
            i11++;
        }
    }

    public final void D(int i10, String str) {
        this.f5122a.s(i10, str);
    }

    public final void E(int i10, List<Long> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.f5122a.Z(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += y7.j0(list.get(i13).longValue());
            }
            this.f5122a.Y(i12);
            while (i11 < list.size()) {
                this.f5122a.u(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f5122a.o(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void F(int i10, int i11) {
        this.f5122a.C0(i10, i11);
    }

    public final void G(int i10, List<Integer> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.f5122a.Z(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += y7.s0(list.get(i13).intValue());
            }
            this.f5122a.Y(i12);
            while (i11 < list.size()) {
                this.f5122a.B0(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f5122a.C0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void H(int i10, long j10) {
        this.f5122a.P(i10, j10);
    }

    public final void I(int i10, List<f7> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f5122a.p(i10, list.get(i11));
        }
    }

    public final void J(int i10, int i11) {
        this.f5122a.O(i10, i11);
    }

    public final void K(int i10, List<?> list, va vaVar) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            B(i10, list.get(i11), vaVar);
        }
    }

    public final void L(int i10, long j10) {
        this.f5122a.o(i10, j10);
    }

    public final void M(int i10, double d10) {
        this.f5122a.M(i10, d10);
    }

    public final void N(int i10, float f10) {
        this.f5122a.N(i10, f10);
    }

    public final void a(int i10, List<Long> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.f5122a.Z(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += y7.W(list.get(i13).longValue());
            }
            this.f5122a.Y(i12);
            while (i11 < list.size()) {
                this.f5122a.u(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f5122a.o(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void b(int i10, boolean z9) {
        this.f5122a.t(i10, z9);
    }

    public final void c(int i10, Object obj, va vaVar) {
        this.f5122a.r(i10, (da) obj, vaVar);
    }

    public final void d(int i10, f7 f7Var) {
        this.f5122a.p(i10, f7Var);
    }

    @Deprecated
    public final void e(int i10) {
        this.f5122a.Z(i10, 4);
    }

    public final void f(int i10, List<Integer> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.f5122a.Z(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += y7.o0(list.get(i13).intValue());
            }
            this.f5122a.Y(i12);
            while (i11 < list.size()) {
                this.f5122a.m(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f5122a.n(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void g(int i10, int i11) {
        this.f5122a.f0(i10, i11);
    }

    public final void h(int i10, List<Long> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.f5122a.Z(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += y7.r0(list.get(i13).longValue());
            }
            this.f5122a.Y(i12);
            while (i11 < list.size()) {
                this.f5122a.R(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f5122a.P(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void i(int i10, long j10) {
        this.f5122a.P(i10, j10);
    }

    @Deprecated
    public final void j(int i10) {
        this.f5122a.Z(i10, 3);
    }

    public final void k(int i10, int i11) {
        this.f5122a.n(i10, i11);
    }

    public final void l(int i10, List<Boolean> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.f5122a.Z(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += y7.j(list.get(i13).booleanValue());
            }
            this.f5122a.Y(i12);
            while (i11 < list.size()) {
                this.f5122a.S(list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f5122a.t(i10, list.get(i11).booleanValue());
            i11++;
        }
    }

    public final void m(int i10, List<Integer> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.f5122a.Z(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += y7.g0(list.get(i13).intValue());
            }
            this.f5122a.Y(i12);
            while (i11 < list.size()) {
                this.f5122a.m(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f5122a.n(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final <K, V> void n(int i10, y9<K, V> y9Var, Map<K, V> map) {
        for (Map.Entry next : map.entrySet()) {
            this.f5122a.Z(i10, 2);
            this.f5122a.Y(v9.a(y9Var, next.getKey(), next.getValue()));
            v9.b(this.f5122a, y9Var, next.getKey(), next.getValue());
        }
    }

    public final void o(int i10, List<Long> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.f5122a.Z(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += y7.e0(list.get(i13).longValue());
            }
            this.f5122a.Y(i12);
            while (i11 < list.size()) {
                this.f5122a.R(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f5122a.P(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void p(int i10, List<Integer> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.f5122a.Z(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += y7.z0(list.get(i13).intValue());
            }
            this.f5122a.Y(i12);
            while (i11 < list.size()) {
                this.f5122a.Y(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f5122a.f0(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void q(int i10, int i11) {
        this.f5122a.O(i10, i11);
    }

    public final void r(int i10, long j10) {
        this.f5122a.o(i10, j10);
    }

    public final void s(int i10, Object obj) {
        if (obj instanceof f7) {
            this.f5122a.Q(i10, (f7) obj);
        } else {
            this.f5122a.q(i10, (da) obj);
        }
    }

    public final void t(int i10, List<Integer> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.f5122a.Z(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += y7.b0(list.get(i13).intValue());
            }
            this.f5122a.Y(i12);
            while (i11 < list.size()) {
                this.f5122a.L(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f5122a.O(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void u(int i10, List<Integer> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.f5122a.Z(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += y7.k0(list.get(i13).intValue());
            }
            this.f5122a.Y(i12);
            while (i11 < list.size()) {
                this.f5122a.L(list.get(i11).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f5122a.O(i10, list.get(i11).intValue());
            i11++;
        }
    }

    public final void v(int i10, List<String> list) {
        int i11 = 0;
        if (list instanceof i9) {
            i9 i9Var = (i9) list;
            while (i11 < list.size()) {
                Object j10 = i9Var.j(i11);
                if (j10 instanceof String) {
                    this.f5122a.s(i10, (String) j10);
                } else {
                    this.f5122a.p(i10, (f7) j10);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f5122a.s(i10, list.get(i11));
            i11++;
        }
    }

    public final void w(int i10, int i11) {
        this.f5122a.n(i10, i11);
    }

    public final void x(int i10, List<Long> list, boolean z9) {
        int i11 = 0;
        if (z9) {
            this.f5122a.Z(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += y7.n0(list.get(i13).longValue());
            }
            this.f5122a.Y(i12);
            while (i11 < list.size()) {
                this.f5122a.v0(list.get(i11).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.f5122a.u0(i10, list.get(i11).longValue());
            i11++;
        }
    }

    public final void y(int i10, List<?> list, va vaVar) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            c(i10, list.get(i11), vaVar);
        }
    }

    public final void z(int i10, long j10) {
        this.f5122a.u0(i10, j10);
    }

    public final int zza() {
        return tc.f5627a;
    }
}
