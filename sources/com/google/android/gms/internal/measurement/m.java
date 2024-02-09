package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class m implements l, r {

    /* renamed from: m  reason: collision with root package name */
    protected final String f5435m;

    /* renamed from: n  reason: collision with root package name */
    protected final Map<String, r> f5436n = new HashMap();

    public m(String str) {
        this.f5435m = str;
    }

    public abstract r a(s6 s6Var, List<r> list);

    public r b() {
        return this;
    }

    public final Boolean c() {
        return Boolean.TRUE;
    }

    public final Double d() {
        return Double.valueOf(Double.NaN);
    }

    public final String e() {
        return this.f5435m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        String str = this.f5435m;
        if (str != null) {
            return str.equals(mVar.f5435m);
        }
        return false;
    }

    public final String f() {
        return this.f5435m;
    }

    public final Iterator<r> g() {
        return o.b(this.f5436n);
    }

    public int hashCode() {
        String str = this.f5435m;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final r i(String str) {
        return this.f5436n.containsKey(str) ? this.f5436n.get(str) : r.f5547d;
    }

    public final boolean k(String str) {
        return this.f5436n.containsKey(str);
    }

    public final r l(String str, s6 s6Var, List<r> list) {
        return "toString".equals(str) ? new t(this.f5435m) : o.a(this, new t(str), s6Var, list);
    }

    public final void o(String str, r rVar) {
        if (rVar == null) {
            this.f5436n.remove(str);
        } else {
            this.f5436n.put(str, rVar);
        }
    }
}
