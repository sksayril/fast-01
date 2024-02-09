package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p3.h;

final class k0<E> extends s<E> {

    /* renamed from: r  reason: collision with root package name */
    static final k0<Comparable> f7148r = new k0<>(n.B(), f0.c());

    /* renamed from: q  reason: collision with root package name */
    final transient n<E> f7149q;

    k0(n<E> nVar, Comparator<? super E> comparator) {
        super(comparator);
        this.f7149q = nVar;
    }

    private int c0(Object obj) {
        return Collections.binarySearch(this.f7149q, obj, d0());
    }

    /* access modifiers changed from: package-private */
    public s<E> K() {
        Comparator<? super E> reverseOrder = Collections.reverseOrder(this.f7180o);
        return isEmpty() ? s.N(reverseOrder) : new k0(this.f7149q.F(), reverseOrder);
    }

    /* renamed from: L */
    public q0<E> descendingIterator() {
        return this.f7149q.F().iterator();
    }

    /* access modifiers changed from: package-private */
    public s<E> Q(E e10, boolean z9) {
        return Z(0, a0(e10, z9));
    }

    /* access modifiers changed from: package-private */
    public s<E> T(E e10, boolean z9, E e11, boolean z10) {
        return W(e10, z9).Q(e11, z10);
    }

    /* access modifiers changed from: package-private */
    public s<E> W(E e10, boolean z9) {
        return Z(b0(e10, z9), size());
    }

    /* access modifiers changed from: package-private */
    public k0<E> Z(int i10, int i11) {
        return (i10 == 0 && i11 == size()) ? this : i10 < i11 ? new k0<>(this.f7149q.subList(i10, i11), this.f7180o) : s.N(this.f7180o);
    }

    /* access modifiers changed from: package-private */
    public int a0(E e10, boolean z9) {
        int binarySearch = Collections.binarySearch(this.f7149q, h.i(e10), comparator());
        return binarySearch >= 0 ? z9 ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    /* access modifiers changed from: package-private */
    public int b0(E e10, boolean z9) {
        int binarySearch = Collections.binarySearch(this.f7149q, h.i(e10), comparator());
        return binarySearch >= 0 ? z9 ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    /* access modifiers changed from: package-private */
    public int c(Object[] objArr, int i10) {
        return this.f7149q.c(objArr, i10);
    }

    public E ceiling(E e10) {
        int b02 = b0(e10, true);
        if (b02 == size()) {
            return null;
        }
        return this.f7149q.get(b02);
    }

    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return c0(obj) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof b0) {
            collection = ((b0) collection).n();
        }
        if (!o0.b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        q0 k10 = iterator();
        Iterator<?> it = collection.iterator();
        if (!k10.hasNext()) {
            return false;
        }
        Object next = it.next();
        Object next2 = k10.next();
        while (true) {
            try {
                int X = X(next2, next);
                if (X < 0) {
                    if (!k10.hasNext()) {
                        return false;
                    }
                    next2 = k10.next();
                } else if (X == 0) {
                    if (!it.hasNext()) {
                        return true;
                    }
                    next = it.next();
                } else if (X > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public Object[] d() {
        return this.f7149q.d();
    }

    /* access modifiers changed from: package-private */
    public Comparator<Object> d0() {
        return this.f7180o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034 A[Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof java.util.Set
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            java.util.Set r6 = (java.util.Set) r6
            int r1 = r5.size()
            int r3 = r6.size()
            if (r1 == r3) goto L_0x0017
            return r2
        L_0x0017:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L_0x001e
            return r0
        L_0x001e:
            java.util.Comparator<? super E> r1 = r5.f7180o
            boolean r1 = com.google.common.collect.o0.b(r1, r6)
            if (r1 == 0) goto L_0x0047
            java.util.Iterator r6 = r6.iterator()
            com.google.common.collect.q0 r1 = r5.iterator()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
        L_0x002e:
            boolean r3 = r1.hasNext()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            if (r3 == 0) goto L_0x0045
            java.lang.Object r3 = r1.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            java.lang.Object r4 = r6.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            if (r4 == 0) goto L_0x0044
            int r3 = r5.X(r3, r4)     // Catch:{ ClassCastException | NoSuchElementException -> 0x0046 }
            if (r3 == 0) goto L_0x002e
        L_0x0044:
            return r2
        L_0x0045:
            return r0
        L_0x0046:
            return r2
        L_0x0047:
            boolean r6 = r5.containsAll(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.k0.equals(java.lang.Object):boolean");
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f7149q.f();
    }

    public E first() {
        if (!isEmpty()) {
            return this.f7149q.get(0);
        }
        throw new NoSuchElementException();
    }

    public E floor(E e10) {
        int a02 = a0(e10, true) - 1;
        if (a02 == -1) {
            return null;
        }
        return this.f7149q.get(a02);
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f7149q.g();
    }

    public E higher(E e10) {
        int b02 = b0(e10, false);
        if (b02 == size()) {
            return null;
        }
        return this.f7149q.get(b02);
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return this.f7149q.i();
    }

    /* renamed from: k */
    public q0<E> iterator() {
        return this.f7149q.iterator();
    }

    public E last() {
        if (!isEmpty()) {
            return this.f7149q.get(size() - 1);
        }
        throw new NoSuchElementException();
    }

    public E lower(E e10) {
        int a02 = a0(e10, false) - 1;
        if (a02 == -1) {
            return null;
        }
        return this.f7149q.get(a02);
    }

    public int size() {
        return this.f7149q.size();
    }
}
