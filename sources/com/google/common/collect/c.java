package com.google.common.collect;

import java.util.Collection;
import java.util.Map;

abstract class c<K, V> implements z<K, V> {
    c() {
    }

    public abstract Map<K, Collection<V>> a();

    public boolean b(Object obj) {
        for (Collection contains : a().values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        return a0.a(this, obj);
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString();
    }
}
