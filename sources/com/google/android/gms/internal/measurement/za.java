package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class za<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: m  reason: collision with root package name */
    private final int f5740m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public List<gb> f5741n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public Map<K, V> f5742o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f5743p;

    /* renamed from: q  reason: collision with root package name */
    private volatile lb f5744q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public Map<K, V> f5745r;

    /* renamed from: s  reason: collision with root package name */
    private volatile db f5746s;

    private za(int i10) {
        this.f5740m = i10;
        this.f5741n = Collections.emptyList();
        this.f5742o = Collections.emptyMap();
        this.f5745r = Collections.emptyMap();
    }

    private final int a(K k10) {
        int size = this.f5741n.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo((Comparable) this.f5741n.get(size).getKey());
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
            int compareTo2 = k10.compareTo((Comparable) this.f5741n.get(i11).getKey());
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

    static <FieldDescriptorType extends k8<FieldDescriptorType>> za<FieldDescriptorType, Object> b(int i10) {
        return new ya(i10);
    }

    /* access modifiers changed from: private */
    public final V k(int i10) {
        q();
        V value = this.f5741n.remove(i10).getValue();
        if (!this.f5742o.isEmpty()) {
            Iterator it = p().entrySet().iterator();
            this.f5741n.add(new gb(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    private final SortedMap<K, V> p() {
        q();
        if (this.f5742o.isEmpty() && !(this.f5742o instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f5742o = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f5745r = treeMap.descendingMap();
        }
        return (SortedMap) this.f5742o;
    }

    /* access modifiers changed from: private */
    public final void q() {
        if (this.f5743p) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        q();
        if (!this.f5741n.isEmpty()) {
            this.f5741n.clear();
        }
        if (!this.f5742o.isEmpty()) {
            this.f5742o.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f5742o.containsKey(comparable);
    }

    /* renamed from: d */
    public final V put(K k10, V v9) {
        q();
        int a10 = a(k10);
        if (a10 >= 0) {
            return this.f5741n.get(a10).setValue(v9);
        }
        q();
        if (this.f5741n.isEmpty() && !(this.f5741n instanceof ArrayList)) {
            this.f5741n = new ArrayList(this.f5740m);
        }
        int i10 = -(a10 + 1);
        if (i10 >= this.f5740m) {
            return p().put(k10, v9);
        }
        int size = this.f5741n.size();
        int i11 = this.f5740m;
        if (size == i11) {
            gb remove = this.f5741n.remove(i11 - 1);
            p().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.f5741n.add(i10, new gb(this, k10, v9));
        return null;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f5744q == null) {
            this.f5744q = new lb(this);
        }
        return this.f5744q;
    }

    public boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za)) {
            return super.equals(obj);
        }
        za zaVar = (za) obj;
        int size = size();
        if (size != zaVar.size()) {
            return false;
        }
        int g10 = g();
        if (g10 != zaVar.g()) {
            obj2 = entrySet();
            obj3 = zaVar.entrySet();
        } else {
            for (int i10 = 0; i10 < g10; i10++) {
                if (!h(i10).equals(zaVar.h(i10))) {
                    return false;
                }
            }
            if (g10 == size) {
                return true;
            }
            obj2 = this.f5742o;
            obj3 = zaVar.f5742o;
        }
        return obj2.equals(obj3);
    }

    public void f() {
        if (!this.f5743p) {
            this.f5742o = this.f5742o.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f5742o);
            this.f5745r = this.f5745r.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f5745r);
            this.f5743p = true;
        }
    }

    public final int g() {
        return this.f5741n.size();
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        return a10 >= 0 ? this.f5741n.get(a10).getValue() : this.f5742o.get(comparable);
    }

    public final Map.Entry<K, V> h(int i10) {
        return this.f5741n.get(i10);
    }

    public int hashCode() {
        int g10 = g();
        int i10 = 0;
        for (int i11 = 0; i11 < g10; i11++) {
            i10 += this.f5741n.get(i11).hashCode();
        }
        return this.f5742o.size() > 0 ? i10 + this.f5742o.hashCode() : i10;
    }

    public final Iterable<Map.Entry<K, V>> j() {
        return this.f5742o.isEmpty() ? fb.a() : this.f5742o.entrySet();
    }

    /* access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> m() {
        if (this.f5746s == null) {
            this.f5746s = new db(this);
        }
        return this.f5746s;
    }

    public final boolean o() {
        return this.f5743p;
    }

    public V remove(Object obj) {
        q();
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        if (a10 >= 0) {
            return k(a10);
        }
        if (this.f5742o.isEmpty()) {
            return null;
        }
        return this.f5742o.remove(comparable);
    }

    public int size() {
        return this.f5741n.size() + this.f5742o.size();
    }
}
