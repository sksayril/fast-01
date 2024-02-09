package h8;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.b;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import s8.a;

final class d<T> implements Collection<T>, a {

    /* renamed from: m  reason: collision with root package name */
    private final T[] f9419m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f9420n;

    public d(T[] tArr, boolean z9) {
        l.e(tArr, "values");
        this.f9419m = tArr;
        this.f9420n = z9;
    }

    public boolean add(T t9) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int c() {
        return this.f9419m.length;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return j.h(this.f9419m, obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        l.e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return this.f9419m.length == 0;
    }

    public Iterator<T> iterator() {
        return b.a(this.f9419m);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return c();
    }

    public final Object[] toArray() {
        return m.a(this.f9419m, this.f9420n);
    }

    public <T> T[] toArray(T[] tArr) {
        l.e(tArr, "array");
        return f.b(this, tArr);
    }
}
