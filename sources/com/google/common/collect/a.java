package com.google.common.collect;

import java.util.NoSuchElementException;
import p3.h;

abstract class a<E> extends r0<E> {

    /* renamed from: m  reason: collision with root package name */
    private final int f7094m;

    /* renamed from: n  reason: collision with root package name */
    private int f7095n;

    protected a(int i10, int i11) {
        h.k(i11, i10);
        this.f7094m = i10;
        this.f7095n = i11;
    }

    /* access modifiers changed from: protected */
    public abstract E b(int i10);

    public final boolean hasNext() {
        return this.f7095n < this.f7094m;
    }

    public final boolean hasPrevious() {
        return this.f7095n > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i10 = this.f7095n;
            this.f7095n = i10 + 1;
            return b(i10);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f7095n;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i10 = this.f7095n - 1;
            this.f7095n = i10;
            return b(i10);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f7095n - 1;
    }
}
