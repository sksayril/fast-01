package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

final class h9<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: m  reason: collision with root package name */
    private Iterator<Map.Entry<K, Object>> f5309m;

    public h9(Iterator<Map.Entry<K, Object>> it) {
        this.f5309m = it;
    }

    public final boolean hasNext() {
        return this.f5309m.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.f5309m.next();
        return next.getValue() instanceof c9 ? new f9(next) : next;
    }

    public final void remove() {
        this.f5309m.remove();
    }
}
