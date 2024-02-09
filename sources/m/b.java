package m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: m  reason: collision with root package name */
    c<K, V> f11184m;

    /* renamed from: n  reason: collision with root package name */
    private c<K, V> f11185n;

    /* renamed from: o  reason: collision with root package name */
    private final WeakHashMap<f<K, V>, Boolean> f11186o = new WeakHashMap<>();

    /* renamed from: p  reason: collision with root package name */
    private int f11187p = 0;

    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f11191p;
        }

        /* access modifiers changed from: package-private */
        public c<K, V> d(c<K, V> cVar) {
            return cVar.f11190o;
        }
    }

    /* renamed from: m.b$b  reason: collision with other inner class name */
    private static class C0180b<K, V> extends e<K, V> {
        C0180b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* access modifiers changed from: package-private */
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f11190o;
        }

        /* access modifiers changed from: package-private */
        public c<K, V> d(c<K, V> cVar) {
            return cVar.f11191p;
        }
    }

    static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: m  reason: collision with root package name */
        final K f11188m;

        /* renamed from: n  reason: collision with root package name */
        final V f11189n;

        /* renamed from: o  reason: collision with root package name */
        c<K, V> f11190o;

        /* renamed from: p  reason: collision with root package name */
        c<K, V> f11191p;

        c(K k10, V v9) {
            this.f11188m = k10;
            this.f11189n = v9;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f11188m.equals(cVar.f11188m) && this.f11189n.equals(cVar.f11189n);
        }

        public K getKey() {
            return this.f11188m;
        }

        public V getValue() {
            return this.f11189n;
        }

        public int hashCode() {
            return this.f11188m.hashCode() ^ this.f11189n.hashCode();
        }

        public V setValue(V v9) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f11188m + "=" + this.f11189n;
        }
    }

    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: m  reason: collision with root package name */
        private c<K, V> f11192m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f11193n = true;

        d() {
        }

        /* access modifiers changed from: package-private */
        public void b(c<K, V> cVar) {
            c<K, V> cVar2 = this.f11192m;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f11191p;
                this.f11192m = cVar3;
                this.f11193n = cVar3 == null;
            }
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f11193n) {
                this.f11193n = false;
                cVar = b.this.f11184m;
            } else {
                c<K, V> cVar2 = this.f11192m;
                cVar = cVar2 != null ? cVar2.f11190o : null;
            }
            this.f11192m = cVar;
            return this.f11192m;
        }

        public boolean hasNext() {
            if (this.f11193n) {
                return b.this.f11184m != null;
            }
            c<K, V> cVar = this.f11192m;
            return (cVar == null || cVar.f11190o == null) ? false : true;
        }
    }

    private static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: m  reason: collision with root package name */
        c<K, V> f11195m;

        /* renamed from: n  reason: collision with root package name */
        c<K, V> f11196n;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f11195m = cVar2;
            this.f11196n = cVar;
        }

        private c<K, V> f() {
            c<K, V> cVar = this.f11196n;
            c<K, V> cVar2 = this.f11195m;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        public void b(c<K, V> cVar) {
            if (this.f11195m == cVar && cVar == this.f11196n) {
                this.f11196n = null;
                this.f11195m = null;
            }
            c<K, V> cVar2 = this.f11195m;
            if (cVar2 == cVar) {
                this.f11195m = c(cVar2);
            }
            if (this.f11196n == cVar) {
                this.f11196n = f();
            }
        }

        /* access modifiers changed from: package-private */
        public abstract c<K, V> c(c<K, V> cVar);

        /* access modifiers changed from: package-private */
        public abstract c<K, V> d(c<K, V> cVar);

        /* renamed from: e */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f11196n;
            this.f11196n = f();
            return cVar;
        }

        public boolean hasNext() {
            return this.f11196n != null;
        }
    }

    public static abstract class f<K, V> {
        /* access modifiers changed from: package-private */
        public abstract void b(c<K, V> cVar);
    }

    public Map.Entry<K, V> c() {
        return this.f11184m;
    }

    /* access modifiers changed from: protected */
    public c<K, V> d(K k10) {
        c<K, V> cVar = this.f11184m;
        while (cVar != null && !cVar.f11188m.equals(k10)) {
            cVar = cVar.f11190o;
        }
        return cVar;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0180b bVar = new C0180b(this.f11185n, this.f11184m);
        this.f11186o.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    public b<K, V>.d f() {
        b<K, V>.d dVar = new d();
        this.f11186o.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> g() {
        return this.f11185n;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((Map.Entry) it.next()).hashCode();
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public c<K, V> i(K k10, V v9) {
        c<K, V> cVar = new c<>(k10, v9);
        this.f11187p++;
        c<K, V> cVar2 = this.f11185n;
        if (cVar2 == null) {
            this.f11184m = cVar;
        } else {
            cVar2.f11190o = cVar;
            cVar.f11191p = cVar2;
        }
        this.f11185n = cVar;
        return cVar;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f11184m, this.f11185n);
        this.f11186o.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public V k(K k10, V v9) {
        c d10 = d(k10);
        if (d10 != null) {
            return d10.f11189n;
        }
        i(k10, v9);
        return null;
    }

    public V l(K k10) {
        c d10 = d(k10);
        if (d10 == null) {
            return null;
        }
        this.f11187p--;
        if (!this.f11186o.isEmpty()) {
            for (f<K, V> b10 : this.f11186o.keySet()) {
                b10.b(d10);
            }
        }
        c<K, V> cVar = d10.f11191p;
        c<K, V> cVar2 = d10.f11190o;
        if (cVar != null) {
            cVar.f11190o = cVar2;
        } else {
            this.f11184m = cVar2;
        }
        c<K, V> cVar3 = d10.f11190o;
        if (cVar3 != null) {
            cVar3.f11191p = cVar;
        } else {
            this.f11185n = cVar;
        }
        d10.f11190o = null;
        d10.f11191p = null;
        return d10.f11189n;
    }

    public int size() {
        return this.f11187p;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
