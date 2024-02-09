package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.ng;
import com.google.android.gms.internal.measurement.qg;
import java.util.List;

final class b6 implements qg {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ w5 f5888a;

    b6(w5 w5Var) {
        this.f5888a = w5Var;
    }

    public final void a(ng ngVar, String str, List<String> list, boolean z9, boolean z10) {
        z4 z4Var;
        int i10 = d6.f5950a[ngVar.ordinal()];
        if (i10 == 1) {
            z4Var = this.f5888a.k().E();
        } else if (i10 == 2) {
            x4 k10 = this.f5888a.k();
            z4Var = z9 ? k10.H() : !z10 ? k10.G() : k10.F();
        } else if (i10 != 3) {
            z4Var = i10 != 4 ? this.f5888a.k().I() : this.f5888a.k().J();
        } else {
            x4 k11 = this.f5888a.k();
            z4Var = z9 ? k11.M() : !z10 ? k11.L() : k11.K();
        }
        int size = list.size();
        if (size == 1) {
            z4Var.b(str, list.get(0));
        } else if (size == 2) {
            z4Var.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            z4Var.a(str);
        } else {
            z4Var.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
