package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

public final class e0 extends z {
    protected e0() {
        this.f5734a.add(x0.APPLY);
        this.f5734a.add(x0.BLOCK);
        this.f5734a.add(x0.BREAK);
        this.f5734a.add(x0.CASE);
        this.f5734a.add(x0.DEFAULT);
        this.f5734a.add(x0.CONTINUE);
        this.f5734a.add(x0.DEFINE_FUNCTION);
        this.f5734a.add(x0.FN);
        this.f5734a.add(x0.IF);
        this.f5734a.add(x0.QUOTE);
        this.f5734a.add(x0.RETURN);
        this.f5734a.add(x0.SWITCH);
        this.f5734a.add(x0.TERNARY);
    }

    private static r c(s6 s6Var, List<r> list) {
        r5.j(x0.FN, 2, list);
        r b10 = s6Var.b(list.get(0));
        r b11 = s6Var.b(list.get(1));
        if (b11 instanceof g) {
            List<r> I = ((g) b11).I();
            List<r> arrayList = new ArrayList<>();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new s(b10.f(), I, arrayList, s6Var);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", new Object[]{b11.getClass().getCanonicalName()}));
    }

    public final r b(String str, s6 s6Var, List<r> list) {
        int i10 = 0;
        switch (h0.f5287a[r5.c(str).ordinal()]) {
            case 1:
                r5.f(x0.APPLY, 3, list);
                r b10 = s6Var.b(list.get(0));
                String f10 = s6Var.b(list.get(1)).f();
                r b11 = s6Var.b(list.get(2));
                if (!(b11 instanceof g)) {
                    throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", new Object[]{b11.getClass().getCanonicalName()}));
                } else if (!f10.isEmpty()) {
                    return b10.l(f10, s6Var, ((g) b11).I());
                } else {
                    throw new IllegalArgumentException("Function name for apply is undefined");
                }
            case 2:
                return s6Var.d().a(new g(list));
            case 3:
                r5.f(x0.BREAK, 0, list);
                return r.f5550g;
            case 4:
            case 5:
                if (!list.isEmpty()) {
                    r b12 = s6Var.b(list.get(0));
                    if (b12 instanceof g) {
                        return s6Var.a((g) b12);
                    }
                }
                return r.f5547d;
            case 6:
                r5.f(x0.BREAK, 0, list);
                return r.f5549f;
            case 7:
                r5.j(x0.DEFINE_FUNCTION, 2, list);
                s sVar = (s) c(s6Var, list);
                s6Var.h(sVar.e() == null ? "" : sVar.e(), sVar);
                return sVar;
            case 8:
                return c(s6Var, list);
            case 9:
                r5.j(x0.IF, 2, list);
                r b13 = s6Var.b(list.get(0));
                r b14 = s6Var.b(list.get(1));
                r rVar = null;
                if (list.size() > 2) {
                    rVar = s6Var.b(list.get(2));
                }
                r rVar2 = r.f5547d;
                r a10 = b13.c().booleanValue() ? s6Var.a((g) b14) : rVar != null ? s6Var.a((g) rVar) : rVar2;
                return a10 instanceof k ? a10 : rVar2;
            case 10:
                return new g(list);
            case 11:
                if (list.isEmpty()) {
                    return r.f5551h;
                }
                r5.f(x0.RETURN, 1, list);
                return new k("return", s6Var.b(list.get(0)));
            case 12:
                r5.f(x0.SWITCH, 3, list);
                r b15 = s6Var.b(list.get(0));
                r b16 = s6Var.b(list.get(1));
                r b17 = s6Var.b(list.get(2));
                if (!(b16 instanceof g)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                } else if (b17 instanceof g) {
                    g gVar = (g) b16;
                    g gVar2 = (g) b17;
                    boolean z9 = false;
                    while (true) {
                        if (i10 < gVar.C()) {
                            if (z9 || b15.equals(s6Var.b(gVar.z(i10)))) {
                                r b18 = s6Var.b(gVar2.z(i10));
                                if (!(b18 instanceof k)) {
                                    z9 = true;
                                } else if (!((k) b18).e().equals("break")) {
                                    return b18;
                                }
                            }
                            i10++;
                        } else if (gVar.C() + 1 == gVar2.C()) {
                            r b19 = s6Var.b(gVar2.z(gVar.C()));
                            if (b19 instanceof k) {
                                String e10 = ((k) b19).e();
                                if (e10.equals("return") || e10.equals("continue")) {
                                    return b19;
                                }
                            }
                        }
                    }
                    return r.f5547d;
                } else {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
            case 13:
                r5.f(x0.TERNARY, 3, list);
                return s6Var.b(list.get(0)).c().booleanValue() ? s6Var.b(list.get(1)) : s6Var.b(list.get(2));
            default:
                return super.a(str);
        }
    }
}
