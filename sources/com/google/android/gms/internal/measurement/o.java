package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final /* synthetic */ class o {
    public static r a(l lVar, r rVar, s6 s6Var, List<r> list) {
        if (lVar.k(rVar.f())) {
            r i10 = lVar.i(rVar.f());
            if (i10 instanceof m) {
                return ((m) i10).a(s6Var, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", new Object[]{rVar.f()}));
        } else if ("hasOwnProperty".equals(rVar.f())) {
            r5.g("hasOwnProperty", 1, list);
            return lVar.k(s6Var.b(list.get(0)).f()) ? r.f5552i : r.f5553j;
        } else {
            throw new IllegalArgumentException(String.format("Object has no function %s", new Object[]{rVar.f()}));
        }
    }

    public static Iterator<r> b(Map<String, r> map) {
        return new n(map.keySet().iterator());
    }
}
