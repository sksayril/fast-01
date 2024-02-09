package com.google.common.collect;

import java.util.Iterator;

public abstract class q0<E> implements Iterator<E> {
    protected q0() {
    }

    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
