package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

public class d0 extends e0 {

    /* renamed from: f  reason: collision with root package name */
    private final r0 f1897f;

    static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: m  reason: collision with root package name */
        private Map.Entry<K, d0> f1898m;

        private b(Map.Entry<K, d0> entry) {
            this.f1898m = entry;
        }

        public d0 a() {
            return this.f1898m.getValue();
        }

        public K getKey() {
            return this.f1898m.getKey();
        }

        public Object getValue() {
            d0 value = this.f1898m.getValue();
            if (value == null) {
                return null;
            }
            return value.f();
        }

        public Object setValue(Object obj) {
            if (obj instanceof r0) {
                return this.f1898m.getValue().d((r0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: m  reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f1899m;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f1899m = it;
        }

        /* renamed from: b */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f1899m.next();
            return next.getValue() instanceof d0 ? new b(next) : next;
        }

        public boolean hasNext() {
            return this.f1899m.hasNext();
        }

        public void remove() {
            this.f1899m.remove();
        }
    }

    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    public r0 f() {
        return c(this.f1897f);
    }

    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
