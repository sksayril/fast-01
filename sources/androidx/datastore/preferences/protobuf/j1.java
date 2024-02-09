package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.u;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class j1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: m  reason: collision with root package name */
    private final int f1979m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public List<j1<K, V>.e> f1980n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public Map<K, V> f1981o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f1982p;

    /* renamed from: q  reason: collision with root package name */
    private volatile j1<K, V>.g f1983q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public Map<K, V> f1984r;

    /* renamed from: s  reason: collision with root package name */
    private volatile j1<K, V>.c f1985s;

    static class a extends j1<FieldDescriptorType, Object> {
        a(int i10) {
            super(i10, (a) null);
        }

        public void p() {
            if (!o()) {
                for (int i10 = 0; i10 < k(); i10++) {
                    Map.Entry j10 = j(i10);
                    if (((u.b) j10.getKey()).f()) {
                        j10.setValue(Collections.unmodifiableList((List) j10.getValue()));
                    }
                }
                for (Map.Entry entry : m()) {
                    if (((u.b) entry.getKey()).f()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            j1.super.p();
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return j1.super.put((u.b) obj, obj2);
        }
    }

    private class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: m  reason: collision with root package name */
        private int f1986m;

        /* renamed from: n  reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f1987n;

        private b() {
            this.f1986m = j1.this.f1980n.size();
        }

        /* synthetic */ b(j1 j1Var, a aVar) {
            this();
        }

        private Iterator<Map.Entry<K, V>> b() {
            if (this.f1987n == null) {
                this.f1987n = j1.this.f1984r.entrySet().iterator();
            }
            return this.f1987n;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            Object obj;
            if (b().hasNext()) {
                obj = b().next();
            } else {
                List b10 = j1.this.f1980n;
                int i10 = this.f1986m - 1;
                this.f1986m = i10;
                obj = b10.get(i10);
            }
            return (Map.Entry) obj;
        }

        public boolean hasNext() {
            int i10 = this.f1986m;
            return (i10 > 0 && i10 <= j1.this.f1980n.size()) || b().hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private class c extends j1<K, V>.g {
        private c() {
            super(j1.this, (a) null);
        }

        /* synthetic */ c(j1 j1Var, a aVar) {
            this();
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(j1.this, (a) null);
        }
    }

    private static class d {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final Iterator<Object> f1990a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final Iterable<Object> f1991b = new b();

        static class a implements Iterator<Object> {
            a() {
            }

            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        static class b implements Iterable<Object> {
            b() {
            }

            public Iterator<Object> iterator() {
                return d.f1990a;
            }
        }

        static <T> Iterable<T> b() {
            return f1991b;
        }
    }

    private class e implements Map.Entry<K, V>, Comparable<j1<K, V>.e> {

        /* renamed from: m  reason: collision with root package name */
        private final K f1992m;

        /* renamed from: n  reason: collision with root package name */
        private V f1993n;

        e(K k10, V v9) {
            this.f1992m = k10;
            this.f1993n = v9;
        }

        e(j1 j1Var, Map.Entry<K, V> entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        private boolean g(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        /* renamed from: e */
        public int compareTo(j1<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return g(this.f1992m, entry.getKey()) && g(this.f1993n, entry.getValue());
        }

        public V getValue() {
            return this.f1993n;
        }

        public int hashCode() {
            K k10 = this.f1992m;
            int i10 = 0;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v9 = this.f1993n;
            if (v9 != null) {
                i10 = v9.hashCode();
            }
            return hashCode ^ i10;
        }

        /* renamed from: i */
        public K getKey() {
            return this.f1992m;
        }

        public V setValue(V v9) {
            j1.this.g();
            V v10 = this.f1993n;
            this.f1993n = v9;
            return v10;
        }

        public String toString() {
            return this.f1992m + "=" + this.f1993n;
        }
    }

    private class f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: m  reason: collision with root package name */
        private int f1995m;

        /* renamed from: n  reason: collision with root package name */
        private boolean f1996n;

        /* renamed from: o  reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f1997o;

        private f() {
            this.f1995m = -1;
        }

        /* synthetic */ f(j1 j1Var, a aVar) {
            this();
        }

        private Iterator<Map.Entry<K, V>> b() {
            if (this.f1997o == null) {
                this.f1997o = j1.this.f1981o.entrySet().iterator();
            }
            return this.f1997o;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            this.f1996n = true;
            int i10 = this.f1995m + 1;
            this.f1995m = i10;
            return (Map.Entry) (i10 < j1.this.f1980n.size() ? j1.this.f1980n.get(this.f1995m) : b().next());
        }

        public boolean hasNext() {
            if (this.f1995m + 1 >= j1.this.f1980n.size()) {
                return !j1.this.f1981o.isEmpty() && b().hasNext();
            }
            return true;
        }

        public void remove() {
            if (this.f1996n) {
                this.f1996n = false;
                j1.this.g();
                if (this.f1995m < j1.this.f1980n.size()) {
                    j1 j1Var = j1.this;
                    int i10 = this.f1995m;
                    this.f1995m = i10 - 1;
                    Object unused = j1Var.s(i10);
                    return;
                }
                b().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    private class g extends AbstractSet<Map.Entry<K, V>> {
        private g() {
        }

        /* synthetic */ g(j1 j1Var, a aVar) {
            this();
        }

        /* renamed from: c */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            j1.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            j1.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = j1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(j1.this, (a) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            j1.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return j1.this.size();
        }
    }

    private j1(int i10) {
        this.f1979m = i10;
        this.f1980n = Collections.emptyList();
        this.f1981o = Collections.emptyMap();
        this.f1984r = Collections.emptyMap();
    }

    /* synthetic */ j1(int i10, a aVar) {
        this(i10);
    }

    private int f(K k10) {
        int size = this.f1980n.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f1980n.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = k10.compareTo(this.f1980n.get(i11).getKey());
            if (compareTo2 < 0) {
                size = i11 - 1;
            } else if (compareTo2 <= 0) {
                return i11;
            } else {
                i10 = i11 + 1;
            }
        }
        return -(i10 + 1);
    }

    /* access modifiers changed from: private */
    public void g() {
        if (this.f1982p) {
            throw new UnsupportedOperationException();
        }
    }

    private void i() {
        g();
        if (this.f1980n.isEmpty() && !(this.f1980n instanceof ArrayList)) {
            this.f1980n = new ArrayList(this.f1979m);
        }
    }

    private SortedMap<K, V> n() {
        g();
        if (this.f1981o.isEmpty() && !(this.f1981o instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f1981o = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f1984r = treeMap.descendingMap();
        }
        return (SortedMap) this.f1981o;
    }

    static <FieldDescriptorType extends u.b<FieldDescriptorType>> j1<FieldDescriptorType, Object> q(int i10) {
        return new a(i10);
    }

    /* access modifiers changed from: private */
    public V s(int i10) {
        g();
        V value = this.f1980n.remove(i10).getValue();
        if (!this.f1981o.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            this.f1980n.add(new e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public void clear() {
        g();
        if (!this.f1980n.isEmpty()) {
            this.f1980n.clear();
        }
        if (!this.f1981o.isEmpty()) {
            this.f1981o.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f1981o.containsKey(comparable);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f1983q == null) {
            this.f1983q = new g(this, (a) null);
        }
        return this.f1983q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return super.equals(obj);
        }
        j1 j1Var = (j1) obj;
        int size = size();
        if (size != j1Var.size()) {
            return false;
        }
        int k10 = k();
        if (k10 != j1Var.k()) {
            return entrySet().equals(j1Var.entrySet());
        }
        for (int i10 = 0; i10 < k10; i10++) {
            if (!j(i10).equals(j1Var.j(i10))) {
                return false;
            }
        }
        if (k10 != size) {
            return this.f1981o.equals(j1Var.f1981o);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f10 = f(comparable);
        return f10 >= 0 ? this.f1980n.get(f10).getValue() : this.f1981o.get(comparable);
    }

    /* access modifiers changed from: package-private */
    public Set<Map.Entry<K, V>> h() {
        if (this.f1985s == null) {
            this.f1985s = new c(this, (a) null);
        }
        return this.f1985s;
    }

    public int hashCode() {
        int k10 = k();
        int i10 = 0;
        for (int i11 = 0; i11 < k10; i11++) {
            i10 += this.f1980n.get(i11).hashCode();
        }
        return l() > 0 ? i10 + this.f1981o.hashCode() : i10;
    }

    public Map.Entry<K, V> j(int i10) {
        return this.f1980n.get(i10);
    }

    public int k() {
        return this.f1980n.size();
    }

    public int l() {
        return this.f1981o.size();
    }

    public Iterable<Map.Entry<K, V>> m() {
        return this.f1981o.isEmpty() ? d.b() : this.f1981o.entrySet();
    }

    public boolean o() {
        return this.f1982p;
    }

    public void p() {
        if (!this.f1982p) {
            this.f1981o = this.f1981o.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f1981o);
            this.f1984r = this.f1984r.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f1984r);
            this.f1982p = true;
        }
    }

    /* renamed from: r */
    public V put(K k10, V v9) {
        g();
        int f10 = f(k10);
        if (f10 >= 0) {
            return this.f1980n.get(f10).setValue(v9);
        }
        i();
        int i10 = -(f10 + 1);
        if (i10 >= this.f1979m) {
            return n().put(k10, v9);
        }
        int size = this.f1980n.size();
        int i11 = this.f1979m;
        if (size == i11) {
            e remove = this.f1980n.remove(i11 - 1);
            n().put(remove.getKey(), remove.getValue());
        }
        this.f1980n.add(i10, new e(k10, v9));
        return null;
    }

    public V remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int f10 = f(comparable);
        if (f10 >= 0) {
            return s(f10);
        }
        if (this.f1981o.isEmpty()) {
            return null;
        }
        return this.f1981o.remove(comparable);
    }

    public int size() {
        return this.f1980n.size() + this.f1981o.size();
    }
}
