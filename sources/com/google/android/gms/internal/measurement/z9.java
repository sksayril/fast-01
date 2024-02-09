package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

final class z9 implements aa {
    z9() {
    }

    public final y9<?, ?> a(Object obj) {
        v9 v9Var = (v9) obj;
        throw new NoSuchMethodError();
    }

    public final Map<?, ?> b(Object obj) {
        return (x9) obj;
    }

    public final Object c(Object obj, Object obj2) {
        x9 x9Var = (x9) obj;
        x9 x9Var2 = (x9) obj2;
        if (!x9Var2.isEmpty()) {
            if (!x9Var.i()) {
                x9Var = x9Var.f();
            }
            x9Var.e(x9Var2);
        }
        return x9Var;
    }

    public final Object d(Object obj) {
        ((x9) obj).h();
        return obj;
    }

    public final Object e(Object obj) {
        return x9.d().f();
    }

    public final boolean f(Object obj) {
        return !((x9) obj).i();
    }

    public final Map<?, ?> g(Object obj) {
        return (x9) obj;
    }

    public final int h(int i10, Object obj, Object obj2) {
        x9 x9Var = (x9) obj;
        v9 v9Var = (v9) obj2;
        if (x9Var.isEmpty()) {
            return 0;
        }
        Iterator it = x9Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
