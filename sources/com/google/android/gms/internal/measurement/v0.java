package com.google.android.gms.internal.measurement;

import java.util.List;

public final class v0 extends z {
    protected v0() {
        this.f5734a.add(x0.ASSIGN);
        this.f5734a.add(x0.CONST);
        this.f5734a.add(x0.CREATE_ARRAY);
        this.f5734a.add(x0.CREATE_OBJECT);
        this.f5734a.add(x0.EXPRESSION_LIST);
        this.f5734a.add(x0.GET);
        this.f5734a.add(x0.GET_INDEX);
        this.f5734a.add(x0.GET_PROPERTY);
        this.f5734a.add(x0.NULL);
        this.f5734a.add(x0.SET_PROPERTY);
        this.f5734a.add(x0.TYPEOF);
        this.f5734a.add(x0.UNDEFINED);
        this.f5734a.add(x0.VAR);
    }

    public final r b(String str, s6 s6Var, List<r> list) {
        String str2;
        int i10 = 0;
        switch (u0.f5633a[r5.c(str).ordinal()]) {
            case 1:
                r5.f(x0.ASSIGN, 2, list);
                r b10 = s6Var.b(list.get(0));
                if (!(b10 instanceof t)) {
                    throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", new Object[]{b10.getClass().getCanonicalName()}));
                } else if (s6Var.g(b10.f())) {
                    r b11 = s6Var.b(list.get(1));
                    s6Var.h(b10.f(), b11);
                    return b11;
                } else {
                    throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", new Object[]{b10.f()}));
                }
            case 2:
                r5.j(x0.CONST, 2, list);
                if (list.size() % 2 == 0) {
                    int i11 = 0;
                    while (i11 < list.size() - 1) {
                        r b12 = s6Var.b(list.get(i11));
                        if (b12 instanceof t) {
                            s6Var.f(b12.f(), s6Var.b(list.get(i11 + 1)));
                            i11 += 2;
                        } else {
                            throw new IllegalArgumentException(String.format("Expected string for const name. got %s", new Object[]{b12.getClass().getCanonicalName()}));
                        }
                    }
                    return r.f5547d;
                }
                throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
            case 3:
                if (list.isEmpty()) {
                    return new g();
                }
                g gVar = new g();
                for (r b13 : list) {
                    r b14 = s6Var.b(b13);
                    if (!(b14 instanceof k)) {
                        gVar.F(i10, b14);
                        i10++;
                    } else {
                        throw new IllegalStateException("Failed to evaluate array element");
                    }
                }
                return gVar;
            case 4:
                if (list.isEmpty()) {
                    return new q();
                }
                if (list.size() % 2 == 0) {
                    q qVar = new q();
                    while (i10 < list.size() - 1) {
                        r b15 = s6Var.b(list.get(i10));
                        r b16 = s6Var.b(list.get(i10 + 1));
                        if ((b15 instanceof k) || (b16 instanceof k)) {
                            throw new IllegalStateException("Failed to evaluate map entry");
                        }
                        qVar.o(b15.f(), b16);
                        i10 += 2;
                    }
                    return qVar;
                }
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
            case 5:
                r5.j(x0.EXPRESSION_LIST, 1, list);
                r rVar = r.f5547d;
                while (i10 < list.size()) {
                    rVar = s6Var.b(list.get(i10));
                    if (!(rVar instanceof k)) {
                        i10++;
                    } else {
                        throw new IllegalStateException("ControlValue cannot be in an expression list");
                    }
                }
                return rVar;
            case 6:
                r5.f(x0.GET, 1, list);
                r b17 = s6Var.b(list.get(0));
                if (b17 instanceof t) {
                    return s6Var.c(b17.f());
                }
                throw new IllegalArgumentException(String.format("Expected string for get var. got %s", new Object[]{b17.getClass().getCanonicalName()}));
            case 7:
            case 8:
                r5.f(x0.GET_PROPERTY, 2, list);
                r b18 = s6Var.b(list.get(0));
                r b19 = s6Var.b(list.get(1));
                if ((b18 instanceof g) && r5.l(b19)) {
                    return ((g) b18).z(b19.d().intValue());
                }
                if (b18 instanceof l) {
                    return ((l) b18).i(b19.f());
                }
                if (b18 instanceof t) {
                    if ("length".equals(b19.f())) {
                        return new j(Double.valueOf((double) b18.f().length()));
                    }
                    if (r5.l(b19) && b19.d().doubleValue() < ((double) b18.f().length())) {
                        return new t(String.valueOf(b18.f().charAt(b19.d().intValue())));
                    }
                }
                return r.f5547d;
            case 9:
                r5.f(x0.NULL, 0, list);
                return r.f5548e;
            case 10:
                r5.f(x0.SET_PROPERTY, 3, list);
                r b20 = s6Var.b(list.get(0));
                r b21 = s6Var.b(list.get(1));
                r b22 = s6Var.b(list.get(2));
                if (b20 == r.f5547d || b20 == r.f5548e) {
                    throw new IllegalStateException(String.format("Can't set property %s of %s", new Object[]{b21.f(), b20.f()}));
                }
                if ((b20 instanceof g) && (b21 instanceof j)) {
                    ((g) b20).F(b21.d().intValue(), b22);
                } else if (b20 instanceof l) {
                    ((l) b20).o(b21.f(), b22);
                }
                return b22;
            case 11:
                r5.f(x0.TYPEOF, 1, list);
                r b23 = s6Var.b(list.get(0));
                if (b23 instanceof y) {
                    str2 = "undefined";
                } else if (b23 instanceof h) {
                    str2 = "boolean";
                } else if (b23 instanceof j) {
                    str2 = "number";
                } else if (b23 instanceof t) {
                    str2 = "string";
                } else if (b23 instanceof s) {
                    str2 = "function";
                } else if ((b23 instanceof u) || (b23 instanceof k)) {
                    throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", new Object[]{b23}));
                } else {
                    str2 = "object";
                }
                return new t(str2);
            case 12:
                r5.f(x0.UNDEFINED, 0, list);
                return r.f5547d;
            case 13:
                r5.j(x0.VAR, 1, list);
                for (r b24 : list) {
                    r b25 = s6Var.b(b24);
                    if (b25 instanceof t) {
                        s6Var.e(b25.f(), r.f5547d);
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", new Object[]{b25.getClass().getCanonicalName()}));
                    }
                }
                return r.f5547d;
            default:
                return super.a(str);
        }
    }
}
