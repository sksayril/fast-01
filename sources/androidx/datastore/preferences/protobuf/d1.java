package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.RandomAccess;

final class d1<E> extends c<E> implements RandomAccess {

    /* renamed from: p  reason: collision with root package name */
    private static final d1<Object> f1900p;

    /* renamed from: n  reason: collision with root package name */
    private E[] f1901n;

    /* renamed from: o  reason: collision with root package name */
    private int f1902o;

    static {
        d1<Object> d1Var = new d1<>(new Object[0], 0);
        f1900p = d1Var;
        d1Var.m();
    }

    private d1(E[] eArr, int i10) {
        this.f1901n = eArr;
        this.f1902o = i10;
    }

    private static <E> E[] d(int i10) {
        return new Object[i10];
    }

    public static <E> d1<E> f() {
        return f1900p;
    }

    private void g(int i10) {
        if (i10 < 0 || i10 >= this.f1902o) {
            throw new IndexOutOfBoundsException(i(i10));
        }
    }

    private String i(int i10) {
        return "Index:" + i10 + ", Size:" + this.f1902o;
    }

    public void add(int i10, E e10) {
        int i11;
        c();
        if (i10 < 0 || i10 > (i11 = this.f1902o)) {
            throw new IndexOutOfBoundsException(i(i10));
        }
        E[] eArr = this.f1901n;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] d10 = d(((i11 * 3) / 2) + 1);
            System.arraycopy(this.f1901n, 0, d10, 0, i10);
            System.arraycopy(this.f1901n, i10, d10, i10 + 1, this.f1902o - i10);
            this.f1901n = d10;
        }
        this.f1901n[i10] = e10;
        this.f1902o++;
        this.modCount++;
    }

    public boolean add(E e10) {
        c();
        int i10 = this.f1902o;
        E[] eArr = this.f1901n;
        if (i10 == eArr.length) {
            this.f1901n = Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f1901n;
        int i11 = this.f1902o;
        this.f1902o = i11 + 1;
        eArr2[i11] = e10;
        this.modCount++;
        return true;
    }

    public E get(int i10) {
        g(i10);
        return this.f1901n[i10];
    }

    /* renamed from: k */
    public d1<E> q(int i10) {
        if (i10 >= this.f1902o) {
            return new d1<>(Arrays.copyOf(this.f1901n, i10), this.f1902o);
        }
        throw new IllegalArgumentException();
    }

    public E remove(int i10) {
        c();
        g(i10);
        E[] eArr = this.f1901n;
        E e10 = eArr[i10];
        int i11 = this.f1902o;
        if (i10 < i11 - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (i11 - i10) - 1);
        }
        this.f1902o--;
        this.modCount++;
        return e10;
    }

    public E set(int i10, E e10) {
        c();
        g(i10);
        E[] eArr = this.f1901n;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        this.modCount++;
        return e11;
    }

    public int size() {
        return this.f1902o;
    }
}
