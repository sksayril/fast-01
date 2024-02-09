package com.google.common.collect;

import java.io.Serializable;
import java.util.Comparator;
import p3.h;

final class j<T> extends f0<T> implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    final Comparator<T> f7139m;

    j(Comparator<T> comparator) {
        this.f7139m = (Comparator) h.i(comparator);
    }

    public int compare(T t9, T t10) {
        return this.f7139m.compare(t9, t10);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f7139m.equals(((j) obj).f7139m);
        }
        return false;
    }

    public int hashCode() {
        return this.f7139m.hashCode();
    }

    public String toString() {
        return this.f7139m.toString();
    }
}
