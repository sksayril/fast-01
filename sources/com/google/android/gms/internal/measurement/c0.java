package com.google.android.gms.internal.measurement;

import java.util.List;

public final class c0 extends z {
    public c0() {
        this.f5734a.add(x0.EQUALS);
        this.f5734a.add(x0.GREATER_THAN);
        this.f5734a.add(x0.GREATER_THAN_EQUALS);
        this.f5734a.add(x0.IDENTITY_EQUALS);
        this.f5734a.add(x0.IDENTITY_NOT_EQUALS);
        this.f5734a.add(x0.LESS_THAN);
        this.f5734a.add(x0.LESS_THAN_EQUALS);
        this.f5734a.add(x0.NOT_EQUALS);
    }

    private static boolean c(r rVar, r rVar2) {
        r rVar3;
        r tVar;
        while (!rVar.getClass().equals(rVar2.getClass())) {
            if (((rVar instanceof y) || (rVar instanceof p)) && ((rVar2 instanceof y) || (rVar2 instanceof p))) {
                return true;
            }
            boolean z9 = rVar instanceof j;
            if (!z9 || !(rVar2 instanceof t)) {
                boolean z10 = rVar instanceof t;
                if (z10 && (rVar2 instanceof j)) {
                    rVar3 = new j(rVar.d());
                } else if (rVar instanceof h) {
                    rVar3 = new j(rVar.d());
                } else if (rVar2 instanceof h) {
                    tVar = new j(rVar2.d());
                } else if ((z10 || z9) && (rVar2 instanceof l)) {
                    tVar = new t(rVar2.f());
                } else if (!(rVar instanceof l) || (!(rVar2 instanceof t) && !(rVar2 instanceof j))) {
                    return false;
                } else {
                    rVar3 = new t(rVar.f());
                }
                rVar = rVar3;
            } else {
                tVar = new j(rVar2.d());
            }
            rVar2 = tVar;
        }
        if ((rVar instanceof y) || (rVar instanceof p)) {
            return true;
        }
        return rVar instanceof j ? !Double.isNaN(rVar.d().doubleValue()) && !Double.isNaN(rVar2.d().doubleValue()) && rVar.d().doubleValue() == rVar2.d().doubleValue() : rVar instanceof t ? rVar.f().equals(rVar2.f()) : rVar instanceof h ? rVar.c().equals(rVar2.c()) : rVar == rVar2;
    }

    private static boolean d(r rVar, r rVar2) {
        if (rVar instanceof l) {
            rVar = new t(rVar.f());
        }
        if (rVar2 instanceof l) {
            rVar2 = new t(rVar2.f());
        }
        if ((rVar instanceof t) && (rVar2 instanceof t)) {
            return rVar.f().compareTo(rVar2.f()) < 0;
        }
        double doubleValue = rVar.d().doubleValue();
        double doubleValue2 = rVar2.d().doubleValue();
        return !Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && !(doubleValue == 0.0d && doubleValue2 == -0.0d) && (!(doubleValue == -0.0d && doubleValue2 == 0.0d) && Double.compare(doubleValue, doubleValue2) < 0);
    }

    private static boolean e(r rVar, r rVar2) {
        if (rVar instanceof l) {
            rVar = new t(rVar.f());
        }
        if (rVar2 instanceof l) {
            rVar2 = new t(rVar2.f());
        }
        return (((rVar instanceof t) && (rVar2 instanceof t)) || (!Double.isNaN(rVar.d().doubleValue()) && !Double.isNaN(rVar2.d().doubleValue()))) && !d(rVar2, rVar);
    }

    public final r b(String str, s6 s6Var, List<r> list) {
        boolean z9;
        boolean z10;
        r5.f(r5.c(str), 2, list);
        r b10 = s6Var.b(list.get(0));
        r b11 = s6Var.b(list.get(1));
        switch (f0.f5219a[r5.c(str).ordinal()]) {
            case 1:
                z9 = c(b10, b11);
                break;
            case 2:
                z9 = d(b11, b10);
                break;
            case 3:
                z9 = e(b11, b10);
                break;
            case 4:
                z9 = r5.h(b10, b11);
                break;
            case 5:
                z10 = r5.h(b10, b11);
                break;
            case 6:
                z9 = d(b10, b11);
                break;
            case 7:
                z9 = e(b10, b11);
                break;
            case 8:
                z10 = c(b10, b11);
                break;
            default:
                return super.a(str);
        }
        z9 = !z10;
        return z9 ? r.f5552i : r.f5553j;
    }
}
