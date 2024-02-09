package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.RandomAccess;

final class ua<E> extends z6<E> implements RandomAccess {

    /* renamed from: p  reason: collision with root package name */
    private static final ua<Object> f5648p = new ua<>(new Object[0], 0, false);

    /* renamed from: n  reason: collision with root package name */
    private E[] f5649n;

    /* renamed from: o  reason: collision with root package name */
    private int f5650o;

    private ua(E[] eArr, int i10, boolean z9) {
        super(z9);
        this.f5649n = eArr;
        this.f5650o = i10;
    }

    private final String d(int i10) {
        int i11 = this.f5650o;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void f(int i10) {
        if (i10 < 0 || i10 >= this.f5650o) {
            throw new IndexOutOfBoundsException(d(i10));
        }
    }

    public static <E> ua<E> g() {
        return f5648p;
    }

    public final void add(int i10, E e10) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f5650o)) {
            throw new IndexOutOfBoundsException(d(i10));
        }
        E[] eArr = this.f5649n;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = new Object[(((i11 * 3) / 2) + 1)];
            System.arraycopy(eArr, 0, eArr2, 0, i10);
            System.arraycopy(this.f5649n, i10, eArr2, i10 + 1, this.f5650o - i10);
            this.f5649n = eArr2;
        }
        this.f5649n[i10] = e10;
        this.f5650o++;
        this.modCount++;
    }

    public final boolean add(E e10) {
        c();
        int i10 = this.f5650o;
        E[] eArr = this.f5649n;
        if (i10 == eArr.length) {
            this.f5649n = Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f5649n;
        int i11 = this.f5650o;
        this.f5650o = i11 + 1;
        eArr2[i11] = e10;
        this.modCount++;
        return true;
    }

    public final /* synthetic */ y8 e(int i10) {
        if (i10 >= this.f5650o) {
            return new ua(Arrays.copyOf(this.f5649n, i10), this.f5650o, true);
        }
        throw new IllegalArgumentException();
    }

    public final E get(int i10) {
        f(i10);
        return this.f5649n[i10];
    }

    public final E remove(int i10) {
        c();
        f(i10);
        E[] eArr = this.f5649n;
        E e10 = eArr[i10];
        int i11 = this.f5650o;
        if (i10 < i11 - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f5650o--;
        this.modCount++;
        return e10;
    }

    public final E set(int i10, E e10) {
        c();
        f(i10);
        E[] eArr = this.f5649n;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        this.modCount++;
        return e11;
    }

    public final int size() {
        return this.f5650o;
    }
}
