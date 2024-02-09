package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;
import p3.h;

final class o0 {
    public static <E> Comparator<? super E> a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? f0.c() : comparator;
    }

    public static boolean b(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        h.i(comparator);
        h.i(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = a((SortedSet) iterable);
        } else if (!(iterable instanceof n0)) {
            return false;
        } else {
            comparator2 = ((n0) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
