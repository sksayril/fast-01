package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ug extends m {

    /* renamed from: o  reason: collision with root package name */
    private final ta f5654o;

    /* renamed from: p  reason: collision with root package name */
    private final Map<String, m> f5655p = new HashMap();

    public ug(ta taVar) {
        super("require");
        this.f5654o = taVar;
    }

    public final r a(s6 s6Var, List<r> list) {
        r5.g("require", 1, list);
        String f10 = s6Var.b(list.get(0)).f();
        if (this.f5655p.containsKey(f10)) {
            return this.f5655p.get(f10);
        }
        r a10 = this.f5654o.a(f10);
        if (a10 instanceof m) {
            this.f5655p.put(f10, (m) a10);
        }
        return a10;
    }
}
