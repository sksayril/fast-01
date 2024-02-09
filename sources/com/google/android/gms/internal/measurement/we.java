package com.google.android.gms.internal.measurement;

import java.util.List;

final class we extends m {

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ vd f5684o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    we(tb tbVar, String str, vd vdVar) {
        super(str);
        this.f5684o = vdVar;
    }

    public final r a(s6 s6Var, List<r> list) {
        r5.g("getValue", 2, list);
        r b10 = s6Var.b(list.get(0));
        r b11 = s6Var.b(list.get(1));
        String i10 = this.f5684o.i(b10.f());
        return i10 != null ? new t(i10) : b11;
    }
}
