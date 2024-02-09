package com.google.common.collect;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import p3.h;

public abstract class s<E> extends t<E> implements NavigableSet<E>, n0<E> {

    /* renamed from: o  reason: collision with root package name */
    final transient Comparator<? super E> f7180o;

    /* renamed from: p  reason: collision with root package name */
    transient s<E> f7181p;

    s(Comparator<? super E> comparator) {
        this.f7180o = comparator;
    }

    static <E> s<E> H(Comparator<? super E> comparator, int i10, E... eArr) {
        if (i10 == 0) {
            return N(comparator);
        }
        e0.c(eArr, i10);
        Arrays.sort(eArr, 0, i10, comparator);
        int i11 = 1;
        for (int i12 = 1; i12 < i10; i12++) {
            E e10 = eArr[i12];
            if (comparator.compare(e10, eArr[i11 - 1]) != 0) {
                eArr[i11] = e10;
                i11++;
            }
        }
        Arrays.fill(eArr, i11, i10, (Object) null);
        if (i11 < eArr.length / 2) {
            eArr = Arrays.copyOf(eArr, i11);
        }
        return new k0(n.o(eArr, i11), comparator);
    }

    public static <E> s<E> I(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        h.i(comparator);
        if (o0.b(comparator, iterable) && (iterable instanceof s)) {
            s<E> sVar = (s) iterable;
            if (!sVar.i()) {
                return sVar;
            }
        }
        Object[] c10 = u.c(iterable);
        return H(comparator, c10.length, c10);
    }

    public static <E> s<E> J(Comparator<? super E> comparator, Collection<? extends E> collection) {
        return I(comparator, collection);
    }

    static <E> k0<E> N(Comparator<? super E> comparator) {
        return f0.c().equals(comparator) ? k0.f7148r : new k0<>(n.B(), comparator);
    }

    static int Y(Comparator<?> comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    /* access modifiers changed from: package-private */
    public abstract s<E> K();

    /* renamed from: L */
    public abstract q0<E> descendingIterator();

    /* renamed from: M */
    public s<E> descendingSet() {
        s<E> sVar = this.f7181p;
        if (sVar != null) {
            return sVar;
        }
        s<E> K = K();
        this.f7181p = K;
        K.f7181p = this;
        return K;
    }

    /* renamed from: O */
    public s<E> headSet(E e10) {
        return headSet(e10, false);
    }

    /* renamed from: P */
    public s<E> headSet(E e10, boolean z9) {
        return Q(h.i(e10), z9);
    }

    /* access modifiers changed from: package-private */
    public abstract s<E> Q(E e10, boolean z9);

    /* renamed from: R */
    public s<E> subSet(E e10, E e11) {
        return subSet(e10, true, e11, false);
    }

    /* renamed from: S */
    public s<E> subSet(E e10, boolean z9, E e11, boolean z10) {
        h.i(e10);
        h.i(e11);
        h.d(this.f7180o.compare(e10, e11) <= 0);
        return T(e10, z9, e11, z10);
    }

    /* access modifiers changed from: package-private */
    public abstract s<E> T(E e10, boolean z9, E e11, boolean z10);

    /* renamed from: U */
    public s<E> tailSet(E e10) {
        return tailSet(e10, true);
    }

    /* renamed from: V */
    public s<E> tailSet(E e10, boolean z9) {
        return W(h.i(e10), z9);
    }

    /* access modifiers changed from: package-private */
    public abstract s<E> W(E e10, boolean z9);

    /* access modifiers changed from: package-private */
    public int X(Object obj, Object obj2) {
        return Y(this.f7180o, obj, obj2);
    }

    public E ceiling(E e10) {
        return u.b(tailSet(e10, true), null);
    }

    public Comparator<? super E> comparator() {
        return this.f7180o;
    }

    public E first() {
        return iterator().next();
    }

    public E floor(E e10) {
        return v.c(headSet(e10, true).descendingIterator(), null);
    }

    public E higher(E e10) {
        return u.b(tailSet(e10, false), null);
    }

    /* renamed from: k */
    public abstract q0<E> iterator();

    public E last() {
        return descendingIterator().next();
    }

    public E lower(E e10) {
        return v.c(headSet(e10, false).descendingIterator(), null);
    }

    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }
}
