package com.google.android.gms.internal.measurement;

import java.util.List;

public final class i0 extends z {
    protected i0() {
        this.f5734a.add(x0.AND);
        this.f5734a.add(x0.NOT);
        this.f5734a.add(x0.OR);
    }

    public final r b(String str, s6 s6Var, List<r> list) {
        int i10 = l0.f5422a[r5.c(str).ordinal()];
        if (i10 == 1) {
            r5.f(x0.AND, 2, list);
            r b10 = s6Var.b(list.get(0));
            if (!b10.c().booleanValue()) {
                return b10;
            }
        } else if (i10 == 2) {
            r5.f(x0.NOT, 1, list);
            return new h(Boolean.valueOf(!s6Var.b(list.get(0)).c().booleanValue()));
        } else if (i10 != 3) {
            return super.a(str);
        } else {
            r5.f(x0.OR, 2, list);
            r b11 = s6Var.b(list.get(0));
            if (b11.c().booleanValue()) {
                return b11;
            }
        }
        return s6Var.b(list.get(1));
    }
}
