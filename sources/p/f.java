package p;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

abstract class f<K, V> {

    /* renamed from: a  reason: collision with root package name */
    f<K, V>.b f11722a;

    /* renamed from: b  reason: collision with root package name */
    f<K, V>.c f11723b;

    /* renamed from: c  reason: collision with root package name */
    f<K, V>.e f11724c;

    final class a<T> implements Iterator<T> {

        /* renamed from: m  reason: collision with root package name */
        final int f11725m;

        /* renamed from: n  reason: collision with root package name */
        int f11726n;

        /* renamed from: o  reason: collision with root package name */
        int f11727o;

        /* renamed from: p  reason: collision with root package name */
        boolean f11728p = false;

        a(int i10) {
            this.f11725m = i10;
            this.f11726n = f.this.d();
        }

        public boolean hasNext() {
            return this.f11727o < this.f11726n;
        }

        public T next() {
            if (hasNext()) {
                T b10 = f.this.b(this.f11727o, this.f11725m);
                this.f11727o++;
                this.f11728p = true;
                return b10;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f11728p) {
                int i10 = this.f11727o - 1;
                this.f11727o = i10;
                this.f11726n--;
                this.f11728p = false;
                f.this.h(i10);
                return;
            }
            throw new IllegalStateException();
        }
    }

    final class b implements Set<Map.Entry<K, V>> {
        b() {
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d10 = f.this.d();
            for (Map.Entry entry : collection) {
                f.this.g(entry.getKey(), entry.getValue());
            }
            return d10 != f.this.d();
        }

        /* renamed from: c */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            f.this.a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e10 = f.this.e(entry.getKey());
            if (e10 < 0) {
                return false;
            }
            return c.c(f.this.b(e10, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return f.k(this, obj);
        }

        public int hashCode() {
            int i10 = 0;
            for (int d10 = f.this.d() - 1; d10 >= 0; d10--) {
                Object b10 = f.this.b(d10, 0);
                Object b11 = f.this.b(d10, 1);
                i10 += (b10 == null ? 0 : b10.hashCode()) ^ (b11 == null ? 0 : b11.hashCode());
            }
            return i10;
        }

        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return f.this.d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    final class c implements Set<K> {
        c() {
        }

        public boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            f.this.a();
        }

        public boolean contains(Object obj) {
            return f.this.e(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return f.j(f.this.c(), collection);
        }

        public boolean equals(Object obj) {
            return f.k(this, obj);
        }

        public int hashCode() {
            int i10 = 0;
            for (int d10 = f.this.d() - 1; d10 >= 0; d10--) {
                Object b10 = f.this.b(d10, 0);
                i10 += b10 == null ? 0 : b10.hashCode();
            }
            return i10;
        }

        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        public Iterator<K> iterator() {
            return new a(0);
        }

        public boolean remove(Object obj) {
            int e10 = f.this.e(obj);
            if (e10 < 0) {
                return false;
            }
            f.this.h(e10);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            return f.o(f.this.c(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return f.p(f.this.c(), collection);
        }

        public int size() {
            return f.this.d();
        }

        public Object[] toArray() {
            return f.this.q(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return f.this.r(tArr, 0);
        }
    }

    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: m  reason: collision with root package name */
        int f11732m;

        /* renamed from: n  reason: collision with root package name */
        int f11733n;

        /* renamed from: o  reason: collision with root package name */
        boolean f11734o = false;

        d() {
            this.f11732m = f.this.d() - 1;
            this.f11733n = -1;
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (hasNext()) {
                this.f11733n++;
                this.f11734o = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public boolean equals(Object obj) {
            if (!this.f11734o) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                return c.c(entry.getKey(), f.this.b(this.f11733n, 0)) && c.c(entry.getValue(), f.this.b(this.f11733n, 1));
            }
        }

        public K getKey() {
            if (this.f11734o) {
                return f.this.b(this.f11733n, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f11734o) {
                return f.this.b(this.f11733n, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f11733n < this.f11732m;
        }

        public int hashCode() {
            if (this.f11734o) {
                int i10 = 0;
                Object b10 = f.this.b(this.f11733n, 0);
                Object b11 = f.this.b(this.f11733n, 1);
                int hashCode = b10 == null ? 0 : b10.hashCode();
                if (b11 != null) {
                    i10 = b11.hashCode();
                }
                return hashCode ^ i10;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.f11734o) {
                f.this.h(this.f11733n);
                this.f11733n--;
                this.f11732m--;
                this.f11734o = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v9) {
            if (this.f11734o) {
                return f.this.i(this.f11733n, v9);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    final class e implements Collection<V> {
        e() {
        }

        public boolean add(V v9) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            f.this.a();
        }

        public boolean contains(Object obj) {
            return f.this.f(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        public Iterator<V> iterator() {
            return new a(1);
        }

        public boolean remove(Object obj) {
            int f10 = f.this.f(obj);
            if (f10 < 0) {
                return false;
            }
            f.this.h(f10);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int d10 = f.this.d();
            int i10 = 0;
            boolean z9 = false;
            while (i10 < d10) {
                if (collection.contains(f.this.b(i10, 1))) {
                    f.this.h(i10);
                    i10--;
                    d10--;
                    z9 = true;
                }
                i10++;
            }
            return z9;
        }

        public boolean retainAll(Collection<?> collection) {
            int d10 = f.this.d();
            int i10 = 0;
            boolean z9 = false;
            while (i10 < d10) {
                if (!collection.contains(f.this.b(i10, 1))) {
                    f.this.h(i10);
                    i10--;
                    d10--;
                    z9 = true;
                }
                i10++;
            }
            return z9;
        }

        public int size() {
            return f.this.d();
        }

        public Object[] toArray() {
            return f.this.q(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return f.this.r(tArr, 1);
        }
    }

    f() {
    }

    public static <K, V> boolean j(Map<K, V> map, Collection<?> collection) {
        for (Object containsKey : collection) {
            if (!map.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        for (Object remove : collection) {
            map.remove(remove);
        }
        return size != map.size();
    }

    public static <K, V> boolean p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract Object b(int i10, int i11);

    /* access modifiers changed from: protected */
    public abstract Map<K, V> c();

    /* access modifiers changed from: protected */
    public abstract int d();

    /* access modifiers changed from: protected */
    public abstract int e(Object obj);

    /* access modifiers changed from: protected */
    public abstract int f(Object obj);

    /* access modifiers changed from: protected */
    public abstract void g(K k10, V v9);

    /* access modifiers changed from: protected */
    public abstract void h(int i10);

    /* access modifiers changed from: protected */
    public abstract V i(int i10, V v9);

    public Set<Map.Entry<K, V>> l() {
        if (this.f11722a == null) {
            this.f11722a = new b();
        }
        return this.f11722a;
    }

    public Set<K> m() {
        if (this.f11723b == null) {
            this.f11723b = new c();
        }
        return this.f11723b;
    }

    public Collection<V> n() {
        if (this.f11724c == null) {
            this.f11724c = new e();
        }
        return this.f11724c;
    }

    public Object[] q(int i10) {
        int d10 = d();
        Object[] objArr = new Object[d10];
        for (int i11 = 0; i11 < d10; i11++) {
            objArr[i11] = b(i11, i10);
        }
        return objArr;
    }

    public <T> T[] r(T[] tArr, int i10) {
        int d10 = d();
        if (tArr.length < d10) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), d10);
        }
        for (int i11 = 0; i11 < d10; i11++) {
            tArr[i11] = b(i11, i10);
        }
        if (tArr.length > d10) {
            tArr[d10] = null;
        }
        return tArr;
    }
}
