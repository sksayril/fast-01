package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

public final class t9 extends m {

    /* renamed from: o  reason: collision with root package name */
    private final d f5624o;

    public t9(d dVar) {
        super("internal.eventLogger");
        this.f5624o = dVar;
    }

    public final r a(s6 s6Var, List<r> list) {
        r5.g(this.f5435m, 3, list);
        String f10 = s6Var.b(list.get(0)).f();
        long a10 = (long) r5.a(s6Var.b(list.get(1)).d().doubleValue());
        r b10 = s6Var.b(list.get(2));
        this.f5624o.c(f10, a10, b10 instanceof q ? r5.e((q) b10) : new HashMap());
        return r.f5547d;
    }
}
