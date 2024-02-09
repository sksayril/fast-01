package com.google.common.collect;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import p3.h;

public abstract class q<E> extends m<E> implements Set<E> {

    /* renamed from: n  reason: collision with root package name */
    private transient n<E> f7178n;

    q() {
    }

    public static <E> q<E> C() {
        return j0.f7141u;
    }

    public static <E> q<E> D(E e10) {
        return new m0(e10);
    }

    public static <E> q<E> E(E e10, E e11, E e12) {
        return y(3, e10, e11, e12);
    }

    @SafeVarargs
    public static <E> q<E> F(E e10, E e11, E e12, E e13, E e14, E e15, E... eArr) {
        h.e(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        objArr[5] = e15;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return y(length, objArr);
    }

    private static boolean G(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    static int o(int i10) {
        int max = Math.max(i10, 2);
        boolean z9 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (((double) highestOneBit) * 0.7d < ((double) max)) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z9 = false;
        }
        h.e(z9, "collection too large");
        return 1073741824;
    }

    private static <E> q<E> y(int i10, Object... objArr) {
        if (i10 == 0) {
            return C();
        }
        if (i10 != 1) {
            int o10 = o(i10);
            Object[] objArr2 = new Object[o10];
            int i11 = o10 - 1;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                Object a10 = e0.a(objArr[i14], i14);
                int hashCode = a10.hashCode();
                int b10 = l.b(hashCode);
                while (true) {
                    int i15 = b10 & i11;
                    Object obj = objArr2[i15];
                    if (obj == null) {
                        objArr[i13] = a10;
                        objArr2[i15] = a10;
                        i12 += hashCode;
                        i13++;
                        break;
                    } else if (obj.equals(a10)) {
                        break;
                    } else {
                        b10++;
                    }
                }
            }
            Arrays.fill(objArr, i13, i10, (Object) null);
            if (i13 == 1) {
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                return new m0(obj2);
            } else if (o(i13) < o10 / 2) {
                return y(i13, objArr);
            } else {
                if (G(i13, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i13);
                }
                return new j0(objArr, i12, objArr2, i11, i13);
            }
        } else {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return D(obj3);
        }
    }

    public static <E> q<E> z(Collection<? extends E> collection) {
        if ((collection instanceof q) && !(collection instanceof SortedSet)) {
            q<E> qVar = (q) collection;
            if (!qVar.i()) {
                return qVar;
            }
        }
        Object[] array = collection.toArray();
        return y(array.length, array);
    }

    /* access modifiers changed from: package-private */
    public n<E> A() {
        return n.l(toArray());
    }

    /* access modifiers changed from: package-private */
    public boolean B() {
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q) || !B() || !((q) obj).B() || hashCode() == obj.hashCode()) {
            return l0.a(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return l0.b(this);
    }

    /* renamed from: k */
    public abstract q0<E> iterator();

    public n<E> l() {
        n<E> nVar = this.f7178n;
        if (nVar != null) {
            return nVar;
        }
        n<E> A = A();
        this.f7178n = A;
        return A;
    }
}
