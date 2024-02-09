package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class h implements r {

    /* renamed from: m  reason: collision with root package name */
    private final boolean f5286m;

    public h(Boolean bool) {
        this.f5286m = bool == null ? false : bool.booleanValue();
    }

    public final r b() {
        return new h(Boolean.valueOf(this.f5286m));
    }

    public final Boolean c() {
        return Boolean.valueOf(this.f5286m);
    }

    public final Double d() {
        return Double.valueOf(this.f5286m ? 1.0d : 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f5286m == ((h) obj).f5286m;
    }

    public final String f() {
        return Boolean.toString(this.f5286m);
    }

    public final Iterator<r> g() {
        return null;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f5286m).hashCode();
    }

    public final r l(String str, s6 s6Var, List<r> list) {
        if ("toString".equals(str)) {
            return new t(Boolean.toString(this.f5286m));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{Boolean.toString(this.f5286m), str}));
    }

    public final String toString() {
        return String.valueOf(this.f5286m);
    }
}
