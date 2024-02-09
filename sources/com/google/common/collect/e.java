package com.google.common.collect;

import java.io.Serializable;
import p3.c;
import p3.f;
import p3.h;

final class e<F, T> extends f0<F> implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    final c<F, ? extends T> f7097m;

    /* renamed from: n  reason: collision with root package name */
    final f0<T> f7098n;

    e(c<F, ? extends T> cVar, f0<T> f0Var) {
        this.f7097m = (c) h.i(cVar);
        this.f7098n = (f0) h.i(f0Var);
    }

    public int compare(F f10, F f11) {
        return this.f7098n.compare(this.f7097m.apply(f10), this.f7097m.apply(f11));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f7097m.equals(eVar.f7097m) && this.f7098n.equals(eVar.f7098n);
    }

    public int hashCode() {
        return f.b(this.f7097m, this.f7098n);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f7098n);
        String valueOf2 = String.valueOf(this.f7097m);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13 + valueOf2.length());
        sb.append(valueOf);
        sb.append(".onResultOf(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
