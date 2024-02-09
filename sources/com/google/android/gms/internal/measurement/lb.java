package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

class lb extends AbstractSet {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ za f5429m;

    private lb(za zaVar) {
        this.f5429m = zaVar;
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f5429m.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.f5429m.clear();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f5429m.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public Iterator iterator() {
        return new jb(this.f5429m);
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f5429m.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.f5429m.size();
    }
}
