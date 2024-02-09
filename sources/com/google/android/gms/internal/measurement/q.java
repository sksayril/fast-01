package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class q implements l, r {

    /* renamed from: m  reason: collision with root package name */
    private final Map<String, r> f5529m = new HashMap();

    public final List<String> a() {
        return new ArrayList(this.f5529m.keySet());
    }

    public final r b() {
        String str;
        Map<String, r> map;
        r rVar;
        q qVar = new q();
        for (Map.Entry next : this.f5529m.entrySet()) {
            if (next.getValue() instanceof l) {
                map = qVar.f5529m;
                str = (String) next.getKey();
                rVar = (r) next.getValue();
            } else {
                map = qVar.f5529m;
                str = (String) next.getKey();
                rVar = ((r) next.getValue()).b();
            }
            map.put(str, rVar);
        }
        return qVar;
    }

    public final Boolean c() {
        return Boolean.TRUE;
    }

    public final Double d() {
        return Double.valueOf(Double.NaN);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        return this.f5529m.equals(((q) obj).f5529m);
    }

    public final String f() {
        return "[object Object]";
    }

    public final Iterator<r> g() {
        return o.b(this.f5529m);
    }

    public int hashCode() {
        return this.f5529m.hashCode();
    }

    public final r i(String str) {
        return this.f5529m.containsKey(str) ? this.f5529m.get(str) : r.f5547d;
    }

    public final boolean k(String str) {
        return this.f5529m.containsKey(str);
    }

    public r l(String str, s6 s6Var, List<r> list) {
        return "toString".equals(str) ? new t(toString()) : o.a(this, new t(str), s6Var, list);
    }

    public final void o(String str, r rVar) {
        if (rVar == null) {
            this.f5529m.remove(str);
        } else {
            this.f5529m.put(str, rVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!this.f5529m.isEmpty()) {
            for (String next : this.f5529m.keySet()) {
                sb.append(String.format("%s: %s,", new Object[]{next, this.f5529m.get(next)}));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
