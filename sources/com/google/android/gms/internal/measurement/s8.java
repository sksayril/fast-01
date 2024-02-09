package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class s8 {
    public static r a(g5 g5Var) {
        if (g5Var == null) {
            return r.f5547d;
        }
        int i10 = t7.f5620a[g5Var.K().ordinal()];
        if (i10 == 1) {
            return g5Var.S() ? new t(g5Var.N()) : r.f5554k;
        }
        if (i10 == 2) {
            return g5Var.R() ? new j(Double.valueOf(g5Var.J())) : new j((Double) null);
        }
        if (i10 == 3) {
            return g5Var.Q() ? new h(Boolean.valueOf(g5Var.P())) : new h((Boolean) null);
        }
        if (i10 == 4) {
            List<g5> O = g5Var.O();
            ArrayList arrayList = new ArrayList();
            for (g5 a10 : O) {
                arrayList.add(a(a10));
            }
            return new u(g5Var.M(), arrayList);
        } else if (i10 != 5) {
            String valueOf = String.valueOf(g5Var);
            throw new IllegalStateException("Invalid entity: " + valueOf);
        } else {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
    }

    public static r b(Object obj) {
        if (obj == null) {
            return r.f5548e;
        }
        if (obj instanceof String) {
            return new t((String) obj);
        }
        if (obj instanceof Double) {
            return new j((Double) obj);
        }
        if (obj instanceof Long) {
            return new j(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new j(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new h((Boolean) obj);
        }
        if (obj instanceof Map) {
            q qVar = new q();
            Map map = (Map) obj;
            for (Object next : map.keySet()) {
                r b10 = b(map.get(next));
                if (next != null) {
                    if (!(next instanceof String)) {
                        next = next.toString();
                    }
                    qVar.o((String) next, b10);
                }
            }
            return qVar;
        } else if (obj instanceof List) {
            g gVar = new g();
            for (Object b11 : (List) obj) {
                gVar.B(b(b11));
            }
            return gVar;
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }
}
