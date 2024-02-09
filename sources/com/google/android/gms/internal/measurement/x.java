package com.google.android.gms.internal.measurement;

import java.util.List;

public final class x extends z {
    public x() {
        this.f5734a.add(x0.BITWISE_AND);
        this.f5734a.add(x0.BITWISE_LEFT_SHIFT);
        this.f5734a.add(x0.BITWISE_NOT);
        this.f5734a.add(x0.BITWISE_OR);
        this.f5734a.add(x0.BITWISE_RIGHT_SHIFT);
        this.f5734a.add(x0.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f5734a.add(x0.BITWISE_XOR);
    }

    public final r b(String str, s6 s6Var, List<r> list) {
        switch (a0.f5078a[r5.c(str).ordinal()]) {
            case 1:
                r5.f(x0.BITWISE_AND, 2, list);
                return new j(Double.valueOf((double) (r5.i(s6Var.b(list.get(0)).d().doubleValue()) & r5.i(s6Var.b(list.get(1)).d().doubleValue()))));
            case 2:
                r5.f(x0.BITWISE_LEFT_SHIFT, 2, list);
                return new j(Double.valueOf((double) (r5.i(s6Var.b(list.get(0)).d().doubleValue()) << ((int) (r5.m(s6Var.b(list.get(1)).d().doubleValue()) & 31)))));
            case 3:
                r5.f(x0.BITWISE_NOT, 1, list);
                return new j(Double.valueOf((double) (~r5.i(s6Var.b(list.get(0)).d().doubleValue()))));
            case 4:
                r5.f(x0.BITWISE_OR, 2, list);
                return new j(Double.valueOf((double) (r5.i(s6Var.b(list.get(0)).d().doubleValue()) | r5.i(s6Var.b(list.get(1)).d().doubleValue()))));
            case 5:
                r5.f(x0.BITWISE_RIGHT_SHIFT, 2, list);
                return new j(Double.valueOf((double) (r5.i(s6Var.b(list.get(0)).d().doubleValue()) >> ((int) (r5.m(s6Var.b(list.get(1)).d().doubleValue()) & 31)))));
            case 6:
                r5.f(x0.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, list);
                return new j(Double.valueOf((double) (r5.m(s6Var.b(list.get(0)).d().doubleValue()) >>> ((int) (r5.m(s6Var.b(list.get(1)).d().doubleValue()) & 31)))));
            case 7:
                r5.f(x0.BITWISE_XOR, 2, list);
                return new j(Double.valueOf((double) (r5.i(s6Var.b(list.get(0)).d().doubleValue()) ^ r5.i(s6Var.b(list.get(1)).d().doubleValue()))));
            default:
                return super.a(str);
        }
    }
}
