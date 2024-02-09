package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class k0 extends z {
    protected k0() {
        this.f5734a.add(x0.FOR_IN);
        this.f5734a.add(x0.FOR_IN_CONST);
        this.f5734a.add(x0.FOR_IN_LET);
        this.f5734a.add(x0.FOR_LET);
        this.f5734a.add(x0.FOR_OF);
        this.f5734a.add(x0.FOR_OF_CONST);
        this.f5734a.add(x0.FOR_OF_LET);
        this.f5734a.add(x0.WHILE);
    }

    private static r c(o0 o0Var, r rVar, r rVar2) {
        return d(o0Var, rVar.g(), rVar2);
    }

    private static r d(o0 o0Var, Iterator<r> it, r rVar) {
        if (it != null) {
            while (it.hasNext()) {
                r a10 = o0Var.a(it.next()).a((g) rVar);
                if (a10 instanceof k) {
                    k kVar = (k) a10;
                    if ("break".equals(kVar.e())) {
                        return r.f5547d;
                    }
                    if ("return".equals(kVar.e())) {
                        return kVar;
                    }
                }
            }
        }
        return r.f5547d;
    }

    private static r e(o0 o0Var, r rVar, r rVar2) {
        if (rVar instanceof Iterable) {
            return d(o0Var, ((Iterable) rVar).iterator(), rVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    public final r b(String str, s6 s6Var, List<r> list) {
        switch (n0.f5458a[r5.c(str).ordinal()]) {
            case 1:
                r5.f(x0.FOR_IN, 3, list);
                if (list.get(0) instanceof t) {
                    String f10 = list.get(0).f();
                    return c(new r0(s6Var, f10), s6Var.b(list.get(1)), s6Var.b(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
            case 2:
                r5.f(x0.FOR_IN_CONST, 3, list);
                if (list.get(0) instanceof t) {
                    String f11 = list.get(0).f();
                    return c(new m0(s6Var, f11), s6Var.b(list.get(1)), s6Var.b(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
            case 3:
                r5.f(x0.FOR_IN_LET, 3, list);
                if (list.get(0) instanceof t) {
                    String f12 = list.get(0).f();
                    return c(new p0(s6Var, f12), s6Var.b(list.get(1)), s6Var.b(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
            case 4:
                r5.f(x0.FOR_LET, 4, list);
                r b10 = s6Var.b(list.get(0));
                if (b10 instanceof g) {
                    g gVar = (g) b10;
                    r rVar = list.get(1);
                    r rVar2 = list.get(2);
                    r b11 = s6Var.b(list.get(3));
                    s6 d10 = s6Var.d();
                    for (int i10 = 0; i10 < gVar.C(); i10++) {
                        String f13 = gVar.z(i10).f();
                        d10.h(f13, s6Var.c(f13));
                    }
                    while (s6Var.b(rVar).c().booleanValue()) {
                        r a10 = s6Var.a((g) b11);
                        if (a10 instanceof k) {
                            k kVar = (k) a10;
                            if ("break".equals(kVar.e())) {
                                return r.f5547d;
                            }
                            if ("return".equals(kVar.e())) {
                                return kVar;
                            }
                        }
                        s6 d11 = s6Var.d();
                        for (int i11 = 0; i11 < gVar.C(); i11++) {
                            String f14 = gVar.z(i11).f();
                            d11.h(f14, d10.c(f14));
                        }
                        d11.b(rVar2);
                        d10 = d11;
                    }
                    return r.f5547d;
                }
                throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
            case 5:
                r5.f(x0.FOR_OF, 3, list);
                if (list.get(0) instanceof t) {
                    String f15 = list.get(0).f();
                    return e(new r0(s6Var, f15), s6Var.b(list.get(1)), s6Var.b(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
            case 6:
                r5.f(x0.FOR_OF_CONST, 3, list);
                if (list.get(0) instanceof t) {
                    String f16 = list.get(0).f();
                    return e(new m0(s6Var, f16), s6Var.b(list.get(1)), s6Var.b(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
            case 7:
                r5.f(x0.FOR_OF_LET, 3, list);
                if (list.get(0) instanceof t) {
                    String f17 = list.get(0).f();
                    return e(new p0(s6Var, f17), s6Var.b(list.get(1)), s6Var.b(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
            case 8:
                r5.f(x0.WHILE, 4, list);
                r rVar3 = list.get(0);
                r rVar4 = list.get(1);
                r b12 = s6Var.b(list.get(3));
                if (s6Var.b(list.get(2)).c().booleanValue()) {
                    r a11 = s6Var.a((g) b12);
                    if (a11 instanceof k) {
                        k kVar2 = (k) a11;
                        if (!"break".equals(kVar2.e())) {
                            if ("return".equals(kVar2.e())) {
                                return kVar2;
                            }
                        }
                        return r.f5547d;
                    }
                }
                while (s6Var.b(rVar3).c().booleanValue()) {
                    r a12 = s6Var.a((g) b12);
                    if (a12 instanceof k) {
                        k kVar3 = (k) a12;
                        if ("break".equals(kVar3.e())) {
                            return r.f5547d;
                        }
                        if ("return".equals(kVar3.e())) {
                            return kVar3;
                        }
                    }
                    s6Var.b(rVar4);
                }
                return r.f5547d;
            default:
                return super.a(str);
        }
    }
}
