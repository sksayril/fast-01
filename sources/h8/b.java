package h8;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

public abstract class b<E> extends a<E> implements List<E> {

    /* renamed from: m  reason: collision with root package name */
    public static final a f9412m = new a((g) null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void a(int i10, int i11) {
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void b(int i10, int i11) {
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        public final void c(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
            } else if (i10 > i11) {
                throw new IllegalArgumentException("fromIndex: " + i10 + " > toIndex: " + i11);
            }
        }

        public final boolean d(Collection<?> collection, Collection<?> collection2) {
            l.e(collection, "c");
            l.e(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            for (Object a10 : collection) {
                if (!l.a(a10, it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int e(Collection<?> collection) {
            l.e(collection, "c");
            Iterator<?> it = collection.iterator();
            int i10 = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i10 = (i10 * 31) + (next != null ? next.hashCode() : 0);
            }
            return i10;
        }
    }

    /* renamed from: h8.b$b  reason: collision with other inner class name */
    private class C0147b implements Iterator<E>, s8.a {

        /* renamed from: m  reason: collision with root package name */
        private int f9413m;

        public C0147b() {
        }

        /* access modifiers changed from: protected */
        public final int b() {
            return this.f9413m;
        }

        /* access modifiers changed from: protected */
        public final void c(int i10) {
            this.f9413m = i10;
        }

        public boolean hasNext() {
            return this.f9413m < b.this.size();
        }

        public E next() {
            if (hasNext()) {
                b<E> bVar = b.this;
                int i10 = this.f9413m;
                this.f9413m = i10 + 1;
                return bVar.get(i10);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private class c extends b<E>.b implements ListIterator<E> {
        public c(int i10) {
            super();
            b.f9412m.b(i10, b.this.size());
            c(i10);
        }

        public void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            return b() > 0;
        }

        public int nextIndex() {
            return b();
        }

        public E previous() {
            if (hasPrevious()) {
                b<E> bVar = b.this;
                c(b() - 1);
                return bVar.get(b());
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return b() - 1;
        }

        public void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private static final class d<E> extends b<E> implements RandomAccess {

        /* renamed from: n  reason: collision with root package name */
        private final b<E> f9416n;

        /* renamed from: o  reason: collision with root package name */
        private final int f9417o;

        /* renamed from: p  reason: collision with root package name */
        private int f9418p;

        public d(b<? extends E> bVar, int i10, int i11) {
            l.e(bVar, "list");
            this.f9416n = bVar;
            this.f9417o = i10;
            b.f9412m.c(i10, i11, bVar.size());
            this.f9418p = i11 - i10;
        }

        public int c() {
            return this.f9418p;
        }

        public E get(int i10) {
            b.f9412m.a(i10, this.f9418p);
            return this.f9416n.get(this.f9417o + i10);
        }
    }

    protected b() {
    }

    public void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return f9412m.d(this, (Collection) obj);
    }

    public abstract E get(int i10);

    public int hashCode() {
        return f9412m.e(this);
    }

    public int indexOf(E e10) {
        int i10 = 0;
        for (Object a10 : this) {
            if (l.a(a10, e10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public Iterator<E> iterator() {
        return new C0147b();
    }

    public int lastIndexOf(E e10) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (l.a(listIterator.previous(), e10)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new c(0);
    }

    public ListIterator<E> listIterator(int i10) {
        return new c(i10);
    }

    public E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i10, int i11) {
        return new d(this, i10, i11);
    }
}
