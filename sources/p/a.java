package p;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class a<K, V> extends g<K, V> implements Map<K, V> {

    /* renamed from: t  reason: collision with root package name */
    f<K, V> f11693t;

    /* renamed from: p.a$a  reason: collision with other inner class name */
    class C0194a extends f<K, V> {
        C0194a() {
        }

        /* access modifiers changed from: protected */
        public void a() {
            a.this.clear();
        }

        /* access modifiers changed from: protected */
        public Object b(int i10, int i11) {
            return a.this.f11742n[(i10 << 1) + i11];
        }

        /* access modifiers changed from: protected */
        public Map<K, V> c() {
            return a.this;
        }

        /* access modifiers changed from: protected */
        public int d() {
            return a.this.f11743o;
        }

        /* access modifiers changed from: protected */
        public int e(Object obj) {
            return a.this.f(obj);
        }

        /* access modifiers changed from: protected */
        public int f(Object obj) {
            return a.this.h(obj);
        }

        /* access modifiers changed from: protected */
        public void g(K k10, V v9) {
            a.this.put(k10, v9);
        }

        /* access modifiers changed from: protected */
        public void h(int i10) {
            a.this.k(i10);
        }

        /* access modifiers changed from: protected */
        public V i(int i10, V v9) {
            return a.this.l(i10, v9);
        }
    }

    public a() {
    }

    public a(int i10) {
        super(i10);
    }

    public a(g gVar) {
        super(gVar);
    }

    private f<K, V> n() {
        if (this.f11693t == null) {
            this.f11693t = new C0194a();
        }
        return this.f11693t;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return n().l();
    }

    public Set<K> keySet() {
        return n().m();
    }

    public boolean o(Collection<?> collection) {
        return f.p(this, collection);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        c(this.f11743o + map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Collection<V> values() {
        return n().n();
    }
}
