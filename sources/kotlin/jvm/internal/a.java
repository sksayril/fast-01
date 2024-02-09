package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class a<T> implements Iterator<T>, s8.a {

    /* renamed from: m  reason: collision with root package name */
    private final T[] f11063m;

    /* renamed from: n  reason: collision with root package name */
    private int f11064n;

    public a(T[] tArr) {
        l.e(tArr, "array");
        this.f11063m = tArr;
    }

    public boolean hasNext() {
        return this.f11064n < this.f11063m.length;
    }

    public T next() {
        try {
            T[] tArr = this.f11063m;
            int i10 = this.f11064n;
            this.f11064n = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f11064n--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
