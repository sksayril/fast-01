package com.google.android.gms.internal.measurement;

import java.util.List;

public final class rg extends m {

    /* renamed from: o  reason: collision with root package name */
    private b f5579o;

    public rg(b bVar) {
        super("internal.registerCallback");
        this.f5579o = bVar;
    }

    public final r a(s6 s6Var, List<r> list) {
        r5.g(this.f5435m, 3, list);
        String f10 = s6Var.b(list.get(0)).f();
        r b10 = s6Var.b(list.get(1));
        if (b10 instanceof s) {
            r b11 = s6Var.b(list.get(2));
            if (b11 instanceof q) {
                q qVar = (q) b11;
                if (qVar.k("type")) {
                    String f11 = qVar.i("type").f();
                    int i10 = 1000;
                    if (qVar.k("priority")) {
                        i10 = r5.i(qVar.i("priority").d().doubleValue());
                    }
                    this.f5579o.c(f10, i10, (s) b10, f11);
                    return r.f5547d;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
