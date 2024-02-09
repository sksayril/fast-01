package com.google.common.collect;

import java.io.Serializable;
import p3.h;

final class c0 extends f0<Comparable<?>> implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    static final c0 f7096m = new c0();

    private c0() {
    }

    /* renamed from: f */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        h.i(comparable);
        h.i(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
