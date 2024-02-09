package com.google.android.gms.internal.measurement;

import java.util.Map;

final class f9<K> implements Map.Entry<K, Object> {

    /* renamed from: m  reason: collision with root package name */
    private Map.Entry<K, c9> f5249m;

    private f9(Map.Entry<K, c9> entry) {
        this.f5249m = entry;
    }

    public final c9 a() {
        return this.f5249m.getValue();
    }

    public final K getKey() {
        return this.f5249m.getKey();
    }

    public final Object getValue() {
        if (this.f5249m.getValue() == null) {
            return null;
        }
        return c9.e();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof da) {
            return this.f5249m.getValue().a((da) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
