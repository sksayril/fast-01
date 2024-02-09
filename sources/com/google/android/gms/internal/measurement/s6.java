package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class s6 {

    /* renamed from: a  reason: collision with root package name */
    private final s6 f5589a;

    /* renamed from: b  reason: collision with root package name */
    private d0 f5590b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, r> f5591c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private Map<String, Boolean> f5592d = new HashMap();

    public s6(s6 s6Var, d0 d0Var) {
        this.f5589a = s6Var;
        this.f5590b = d0Var;
    }

    public final r a(g gVar) {
        r rVar = r.f5547d;
        Iterator<Integer> H = gVar.H();
        while (H.hasNext()) {
            rVar = this.f5590b.a(this, gVar.z(H.next().intValue()));
            if (rVar instanceof k) {
                break;
            }
        }
        return rVar;
    }

    public final r b(r rVar) {
        return this.f5590b.a(this, rVar);
    }

    public final r c(String str) {
        s6 s6Var = this;
        while (!s6Var.f5591c.containsKey(str)) {
            s6Var = s6Var.f5589a;
            if (s6Var == null) {
                throw new IllegalArgumentException(String.format("%s is not defined", new Object[]{str}));
            }
        }
        return s6Var.f5591c.get(str);
    }

    public final s6 d() {
        return new s6(this, this.f5590b);
    }

    public final void e(String str, r rVar) {
        if (this.f5592d.containsKey(str)) {
            return;
        }
        if (rVar == null) {
            this.f5591c.remove(str);
        } else {
            this.f5591c.put(str, rVar);
        }
    }

    public final void f(String str, r rVar) {
        e(str, rVar);
        this.f5592d.put(str, Boolean.TRUE);
    }

    public final boolean g(String str) {
        s6 s6Var = this;
        while (!s6Var.f5591c.containsKey(str)) {
            s6Var = s6Var.f5589a;
            if (s6Var == null) {
                return false;
            }
        }
        return true;
    }

    public final void h(String str, r rVar) {
        s6 s6Var = this;
        while (!s6Var.f5591c.containsKey(str) && (r1 = s6Var.f5589a) != null && r1.g(str)) {
            s6Var = s6Var.f5589a;
        }
        if (s6Var.f5592d.containsKey(str)) {
            return;
        }
        if (rVar == null) {
            s6Var.f5591c.remove(str);
        } else {
            s6Var.f5591c.put(str, rVar);
        }
    }
}
