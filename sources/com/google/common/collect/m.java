package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import p3.h;

public abstract class m<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    private static final Object[] f7150m = new Object[0];

    static abstract class a<E> extends b<E> {

        /* renamed from: a  reason: collision with root package name */
        Object[] f7151a;

        /* renamed from: b  reason: collision with root package name */
        int f7152b = 0;

        /* renamed from: c  reason: collision with root package name */
        boolean f7153c;

        a(int i10) {
            f.b(i10, "initialCapacity");
            this.f7151a = new Object[i10];
        }

        private void d(int i10) {
            Object[] objArr = this.f7151a;
            if (objArr.length < i10) {
                this.f7151a = Arrays.copyOf(objArr, b.a(objArr.length, i10));
            } else if (this.f7153c) {
                this.f7151a = (Object[]) objArr.clone();
            } else {
                return;
            }
            this.f7153c = false;
        }

        public b<E> b(E... eArr) {
            c(eArr, eArr.length);
            return this;
        }

        /* access modifiers changed from: package-private */
        public final void c(Object[] objArr, int i10) {
            e0.c(objArr, i10);
            d(this.f7152b + i10);
            System.arraycopy(objArr, 0, this.f7151a, this.f7152b, i10);
            this.f7152b += i10;
        }
    }

    public static abstract class b<E> {
        b() {
        }

        static int a(int i10, int i11) {
            if (i11 >= 0) {
                int i12 = i10 + (i10 >> 1) + 1;
                if (i12 < i11) {
                    i12 = Integer.highestOneBit(i11 - 1) << 1;
                }
                if (i12 < 0) {
                    return Integer.MAX_VALUE;
                }
                return i12;
            }
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
    }

    m() {
    }

    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int c(Object[] objArr, int i10) {
        q0 k10 = k();
        while (k10.hasNext()) {
            objArr[i10] = k10.next();
            i10++;
        }
        return i10;
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    /* access modifiers changed from: package-private */
    public Object[] d() {
        return null;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int g() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public abstract boolean i();

    public abstract q0<E> k();

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f7150m);
    }

    public final <T> T[] toArray(T[] tArr) {
        h.i(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] d10 = d();
            if (d10 != null) {
                return g0.a(d10, g(), f(), tArr);
            }
            tArr = e0.d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        c(tArr, 0);
        return tArr;
    }
}
