package com.google.common.collect;

import com.google.common.collect.m;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p3.h;

public abstract class n<E> extends m<E> implements List<E>, RandomAccess {

    /* renamed from: n  reason: collision with root package name */
    private static final r0<Object> f7155n = new b(h0.f7122q, 0);

    public static final class a<E> extends m.a<E> {
        public a() {
            this(4);
        }

        a(int i10) {
            super(i10);
        }

        public a<E> e(E... eArr) {
            super.b(eArr);
            return this;
        }

        public n<E> f() {
            this.f7153c = true;
            return n.o(this.f7151a, this.f7152b);
        }
    }

    static class b<E> extends a<E> {

        /* renamed from: o  reason: collision with root package name */
        private final n<E> f7156o;

        b(n<E> nVar, int i10) {
            super(nVar.size(), i10);
            this.f7156o = nVar;
        }

        /* access modifiers changed from: protected */
        public E b(int i10) {
            return this.f7156o.get(i10);
        }
    }

    private static class c<E> extends n<E> {

        /* renamed from: o  reason: collision with root package name */
        private final transient n<E> f7157o;

        c(n<E> nVar) {
            this.f7157o = nVar;
        }

        private int J(int i10) {
            return (size() - 1) - i10;
        }

        private int K(int i10) {
            return size() - i10;
        }

        public n<E> F() {
            return this.f7157o;
        }

        /* renamed from: H */
        public n<E> subList(int i10, int i11) {
            h.m(i10, i11, size());
            return this.f7157o.subList(K(i11), K(i10)).F();
        }

        public boolean contains(Object obj) {
            return this.f7157o.contains(obj);
        }

        public E get(int i10) {
            h.g(i10, size());
            return this.f7157o.get(J(i10));
        }

        /* access modifiers changed from: package-private */
        public boolean i() {
            return this.f7157o.i();
        }

        public int indexOf(Object obj) {
            int lastIndexOf = this.f7157o.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return J(lastIndexOf);
            }
            return -1;
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return n.super.iterator();
        }

        public int lastIndexOf(Object obj) {
            int indexOf = this.f7157o.indexOf(obj);
            if (indexOf >= 0) {
                return J(indexOf);
            }
            return -1;
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return n.super.listIterator();
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return n.super.listIterator(i10);
        }

        public int size() {
            return this.f7157o.size();
        }
    }

    class d extends n<E> {

        /* renamed from: o  reason: collision with root package name */
        final transient int f7158o;

        /* renamed from: p  reason: collision with root package name */
        final transient int f7159p;

        d(int i10, int i11) {
            this.f7158o = i10;
            this.f7159p = i11;
        }

        /* renamed from: H */
        public n<E> subList(int i10, int i11) {
            h.m(i10, i11, this.f7159p);
            n nVar = n.this;
            int i12 = this.f7158o;
            return nVar.subList(i10 + i12, i11 + i12);
        }

        /* access modifiers changed from: package-private */
        public Object[] d() {
            return n.this.d();
        }

        /* access modifiers changed from: package-private */
        public int f() {
            return n.this.g() + this.f7158o + this.f7159p;
        }

        /* access modifiers changed from: package-private */
        public int g() {
            return n.this.g() + this.f7158o;
        }

        public E get(int i10) {
            h.g(i10, this.f7159p);
            return n.this.get(i10 + this.f7158o);
        }

        /* access modifiers changed from: package-private */
        public boolean i() {
            return true;
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return n.super.iterator();
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return n.super.listIterator();
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return n.super.listIterator(i10);
        }

        public int size() {
            return this.f7159p;
        }
    }

    n() {
    }

    public static <E> n<E> B() {
        return h0.f7122q;
    }

    public static <E> n<E> C(E e10, E e11) {
        return y(e10, e11);
    }

    public static <E> n<E> D(E e10, E e11, E e12) {
        return y(e10, e11, e12);
    }

    public static <E> n<E> E(E e10, E e11, E e12, E e13, E e14, E e15, E e16) {
        return y(e10, e11, e12, e13, e14, e15, e16);
    }

    public static <E> n<E> G(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        h.i(comparator);
        Object[] c10 = u.c(iterable);
        e0.b(c10);
        Arrays.sort(c10, comparator);
        return l(c10);
    }

    static <E> n<E> l(Object[] objArr) {
        return o(objArr, objArr.length);
    }

    static <E> n<E> o(Object[] objArr, int i10) {
        return i10 == 0 ? B() : new h0(objArr, i10);
    }

    private static <E> n<E> y(Object... objArr) {
        return l(e0.b(objArr));
    }

    /* renamed from: A */
    public r0<E> listIterator(int i10) {
        h.k(i10, size());
        return isEmpty() ? f7155n : new b(this, i10);
    }

    public n<E> F() {
        return size() <= 1 ? this : new c(this);
    }

    /* renamed from: H */
    public n<E> subList(int i10, int i11) {
        h.m(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? B() : I(i10, i11);
    }

    /* access modifiers changed from: package-private */
    public n<E> I(int i10, int i11) {
        return new d(i10, i11 - i10);
    }

    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int c(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean equals(Object obj) {
        return w.a(this, obj);
    }

    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return w.b(this, obj);
    }

    /* renamed from: k */
    public q0<E> iterator() {
        return listIterator();
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return w.d(this, obj);
    }

    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: z */
    public r0<E> listIterator() {
        return listIterator(0);
    }
}
