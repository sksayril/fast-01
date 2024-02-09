package com.google.common.collect;

import java.util.Comparator;
import java.util.Map;
import p3.c;

public abstract class f0<T> implements Comparator<T> {
    protected f0() {
    }

    public static <T> f0<T> a(Comparator<T> comparator) {
        return comparator instanceof f0 ? (f0) comparator : new j(comparator);
    }

    public static <C extends Comparable> f0<C> c() {
        return c0.f7096m;
    }

    public <E extends T> n<E> b(Iterable<E> iterable) {
        return n.G(this, iterable);
    }

    public abstract int compare(T t9, T t10);

    /* access modifiers changed from: package-private */
    public <T2 extends T> f0<Map.Entry<T2, ?>> d() {
        return e(y.b());
    }

    public <F> f0<F> e(c<F, ? extends T> cVar) {
        return new e(cVar, this);
    }
}
