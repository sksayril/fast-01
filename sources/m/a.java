package m;

import java.util.HashMap;
import java.util.Map;
import m.b;

public class a<K, V> extends b<K, V> {

    /* renamed from: q  reason: collision with root package name */
    private final HashMap<K, b.c<K, V>> f11183q = new HashMap<>();

    public boolean contains(K k10) {
        return this.f11183q.containsKey(k10);
    }

    /* access modifiers changed from: protected */
    public b.c<K, V> d(K k10) {
        return this.f11183q.get(k10);
    }

    public V k(K k10, V v9) {
        b.c d10 = d(k10);
        if (d10 != null) {
            return d10.f11189n;
        }
        this.f11183q.put(k10, i(k10, v9));
        return null;
    }

    public V l(K k10) {
        V l10 = super.l(k10);
        this.f11183q.remove(k10);
        return l10;
    }

    public Map.Entry<K, V> o(K k10) {
        if (contains(k10)) {
            return this.f11183q.get(k10).f11191p;
        }
        return null;
    }
}
