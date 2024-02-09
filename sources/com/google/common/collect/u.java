package com.google.common.collect;

import java.util.Collection;

public final class u {
    private static <E> Collection<E> a(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : w.g(iterable.iterator());
    }

    public static <T> T b(Iterable<? extends T> iterable, T t9) {
        return v.c(iterable.iterator(), t9);
    }

    static Object[] c(Iterable<?> iterable) {
        return a(iterable).toArray();
    }
}
