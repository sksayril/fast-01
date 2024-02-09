package com.google.android.gms.internal.measurement;

import java.util.List;

public final class q0 extends z {
    protected q0() {
        this.f5734a.add(x0.ADD);
        this.f5734a.add(x0.DIVIDE);
        this.f5734a.add(x0.MODULUS);
        this.f5734a.add(x0.MULTIPLY);
        this.f5734a.add(x0.NEGATE);
        this.f5734a.add(x0.POST_DECREMENT);
        this.f5734a.add(x0.POST_INCREMENT);
        this.f5734a.add(x0.PRE_DECREMENT);
        this.f5734a.add(x0.PRE_INCREMENT);
        this.f5734a.add(x0.SUBTRACT);
    }

    public final r b(String str, s6 s6Var, List<r> list) {
        switch (t0.f5613a[r5.c(str).ordinal()]) {
            case 1:
                r5.f(x0.ADD, 2, list);
                r b10 = s6Var.b(list.get(0));
                r b11 = s6Var.b(list.get(1));
                if (!(b10 instanceof l) && !(b10 instanceof t) && !(b11 instanceof l) && !(b11 instanceof t)) {
                    return new j(Double.valueOf(b10.d().doubleValue() + b11.d().doubleValue()));
                }
                String f10 = b10.f();
                String f11 = b11.f();
                return new t(f10 + f11);
            case 2:
                r5.f(x0.DIVIDE, 2, list);
                return new j(Double.valueOf(s6Var.b(list.get(0)).d().doubleValue() / s6Var.b(list.get(1)).d().doubleValue()));
            case 3:
                r5.f(x0.MODULUS, 2, list);
                return new j(Double.valueOf(s6Var.b(list.get(0)).d().doubleValue() % s6Var.b(list.get(1)).d().doubleValue()));
            case 4:
                r5.f(x0.MULTIPLY, 2, list);
                return new j(Double.valueOf(s6Var.b(list.get(0)).d().doubleValue() * s6Var.b(list.get(1)).d().doubleValue()));
            case 5:
                r5.f(x0.NEGATE, 1, list);
                return new j(Double.valueOf(s6Var.b(list.get(0)).d().doubleValue() * -1.0d));
            case 6:
            case 7:
                r5.g(str, 2, list);
                r b12 = s6Var.b(list.get(0));
                s6Var.b(list.get(1));
                return b12;
            case 8:
            case 9:
                r5.g(str, 1, list);
                return s6Var.b(list.get(0));
            case 10:
                r5.f(x0.SUBTRACT, 2, list);
                return new j(Double.valueOf(s6Var.b(list.get(0)).d().doubleValue() + new j(Double.valueOf(s6Var.b(list.get(1)).d().doubleValue() * -1.0d)).d().doubleValue()));
            default:
                return super.a(str);
        }
    }
}
