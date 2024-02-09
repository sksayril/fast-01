package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class k implements r {

    /* renamed from: m  reason: collision with root package name */
    private final r f5394m;

    /* renamed from: n  reason: collision with root package name */
    private final String f5395n;

    public k() {
        this.f5394m = r.f5547d;
        this.f5395n = "return";
    }

    public k(String str) {
        this.f5394m = r.f5547d;
        this.f5395n = str;
    }

    public k(String str, r rVar) {
        this.f5394m = rVar;
        this.f5395n = str;
    }

    public final r a() {
        return this.f5394m;
    }

    public final r b() {
        return new k(this.f5395n, this.f5394m.b());
    }

    public final Boolean c() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final Double d() {
        throw new IllegalStateException("Control is not a double");
    }

    public final String e() {
        return this.f5395n;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f5395n.equals(kVar.f5395n) && this.f5394m.equals(kVar.f5394m);
    }

    public final String f() {
        throw new IllegalStateException("Control is not a String");
    }

    public final Iterator<r> g() {
        return null;
    }

    public final int hashCode() {
        return (this.f5395n.hashCode() * 31) + this.f5394m.hashCode();
    }

    public final r l(String str, s6 s6Var, List<r> list) {
        throw new IllegalStateException("Control does not have functions");
    }
}
