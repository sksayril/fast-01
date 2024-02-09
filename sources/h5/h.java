package h5;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

public final class h<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: t  reason: collision with root package name */
    private static final Comparator<Comparable> f9346t = new a();

    /* renamed from: m  reason: collision with root package name */
    Comparator<? super K> f9347m;

    /* renamed from: n  reason: collision with root package name */
    e<K, V> f9348n;

    /* renamed from: o  reason: collision with root package name */
    int f9349o;

    /* renamed from: p  reason: collision with root package name */
    int f9350p;

    /* renamed from: q  reason: collision with root package name */
    final e<K, V> f9351q;

    /* renamed from: r  reason: collision with root package name */
    private h<K, V>.b f9352r;

    /* renamed from: s  reason: collision with root package name */
    private h<K, V>.c f9353s;

    class a implements Comparator<Comparable> {
        a() {
        }

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    class b extends AbstractSet<Map.Entry<K, V>> {

        class a extends h<K, V>.d<Map.Entry<K, V>> {
            a() {
                super();
            }

            /* renamed from: c */
            public Map.Entry<K, V> next() {
                return b();
            }
        }

        b() {
        }

        public void clear() {
            h.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && h.this.c((Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        public boolean remove(Object obj) {
            e c10;
            if (!(obj instanceof Map.Entry) || (c10 = h.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            h.this.f(c10, true);
            return true;
        }

        public int size() {
            return h.this.f9349o;
        }
    }

    final class c extends AbstractSet<K> {

        class a extends h<K, V>.d<K> {
            a() {
                super();
            }

            public K next() {
                return b().f9367r;
            }
        }

        c() {
        }

        public void clear() {
            h.this.clear();
        }

        public boolean contains(Object obj) {
            return h.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new a();
        }

        public boolean remove(Object obj) {
            return h.this.g(obj) != null;
        }

        public int size() {
            return h.this.f9349o;
        }
    }

    private abstract class d<T> implements Iterator<T> {

        /* renamed from: m  reason: collision with root package name */
        e<K, V> f9358m;

        /* renamed from: n  reason: collision with root package name */
        e<K, V> f9359n = null;

        /* renamed from: o  reason: collision with root package name */
        int f9360o;

        d() {
            this.f9358m = h.this.f9351q.f9365p;
            this.f9360o = h.this.f9350p;
        }

        /* access modifiers changed from: package-private */
        public final e<K, V> b() {
            e<K, V> eVar = this.f9358m;
            h hVar = h.this;
            if (eVar == hVar.f9351q) {
                throw new NoSuchElementException();
            } else if (hVar.f9350p == this.f9360o) {
                this.f9358m = eVar.f9365p;
                this.f9359n = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f9358m != h.this.f9351q;
        }

        public final void remove() {
            e<K, V> eVar = this.f9359n;
            if (eVar != null) {
                h.this.f(eVar, true);
                this.f9359n = null;
                this.f9360o = h.this.f9350p;
                return;
            }
            throw new IllegalStateException();
        }
    }

    static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: m  reason: collision with root package name */
        e<K, V> f9362m;

        /* renamed from: n  reason: collision with root package name */
        e<K, V> f9363n;

        /* renamed from: o  reason: collision with root package name */
        e<K, V> f9364o;

        /* renamed from: p  reason: collision with root package name */
        e<K, V> f9365p;

        /* renamed from: q  reason: collision with root package name */
        e<K, V> f9366q;

        /* renamed from: r  reason: collision with root package name */
        final K f9367r;

        /* renamed from: s  reason: collision with root package name */
        V f9368s;

        /* renamed from: t  reason: collision with root package name */
        int f9369t;

        e() {
            this.f9367r = null;
            this.f9366q = this;
            this.f9365p = this;
        }

        e(e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.f9362m = eVar;
            this.f9367r = k10;
            this.f9369t = 1;
            this.f9365p = eVar2;
            this.f9366q = eVar3;
            eVar3.f9365p = this;
            eVar2.f9366q = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f9363n; eVar2 != null; eVar2 = eVar2.f9363n) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f9364o; eVar2 != null; eVar2 = eVar2.f9364o) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x002e
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f9367r
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x002e
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x002e
            L_0x001c:
                V r0 = r3.f9368s
                java.lang.Object r4 = r4.getValue()
                if (r0 != 0) goto L_0x0027
                if (r4 != 0) goto L_0x002e
                goto L_0x002d
            L_0x0027:
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x002e
            L_0x002d:
                r1 = 1
            L_0x002e:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: h5.h.e.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f9367r;
        }

        public V getValue() {
            return this.f9368s;
        }

        public int hashCode() {
            K k10 = this.f9367r;
            int i10 = 0;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v9 = this.f9368s;
            if (v9 != null) {
                i10 = v9.hashCode();
            }
            return hashCode ^ i10;
        }

        public V setValue(V v9) {
            V v10 = this.f9368s;
            this.f9368s = v9;
            return v10;
        }

        public String toString() {
            return this.f9367r + "=" + this.f9368s;
        }
    }

    static {
        Class<h> cls = h.class;
    }

    public h() {
        this(f9346t);
    }

    public h(Comparator<? super K> comparator) {
        this.f9349o = 0;
        this.f9350p = 0;
        this.f9351q = new e<>();
        this.f9347m = comparator == null ? f9346t : comparator;
    }

    private boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void e(e<K, V> eVar, boolean z9) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f9363n;
            e<K, V> eVar3 = eVar.f9364o;
            int i10 = 0;
            int i11 = eVar2 != null ? eVar2.f9369t : 0;
            int i12 = eVar3 != null ? eVar3.f9369t : 0;
            int i13 = i11 - i12;
            if (i13 == -2) {
                e<K, V> eVar4 = eVar3.f9363n;
                e<K, V> eVar5 = eVar3.f9364o;
                int i14 = eVar5 != null ? eVar5.f9369t : 0;
                if (eVar4 != null) {
                    i10 = eVar4.f9369t;
                }
                int i15 = i10 - i14;
                if (i15 != -1 && (i15 != 0 || z9)) {
                    j(eVar3);
                }
                i(eVar);
                if (z9) {
                    return;
                }
            } else if (i13 == 2) {
                e<K, V> eVar6 = eVar2.f9363n;
                e<K, V> eVar7 = eVar2.f9364o;
                int i16 = eVar7 != null ? eVar7.f9369t : 0;
                if (eVar6 != null) {
                    i10 = eVar6.f9369t;
                }
                int i17 = i10 - i16;
                if (i17 != 1 && (i17 != 0 || z9)) {
                    i(eVar2);
                }
                j(eVar);
                if (z9) {
                    return;
                }
            } else if (i13 == 0) {
                eVar.f9369t = i11 + 1;
                if (z9) {
                    return;
                }
            } else {
                eVar.f9369t = Math.max(i11, i12) + 1;
                if (!z9) {
                    return;
                }
            }
            eVar = eVar.f9362m;
        }
    }

    private void h(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f9362m;
        eVar.f9362m = null;
        if (eVar2 != null) {
            eVar2.f9362m = eVar3;
        }
        if (eVar3 == null) {
            this.f9348n = eVar2;
        } else if (eVar3.f9363n == eVar) {
            eVar3.f9363n = eVar2;
        } else {
            eVar3.f9364o = eVar2;
        }
    }

    private void i(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f9363n;
        e<K, V> eVar3 = eVar.f9364o;
        e<K, V> eVar4 = eVar3.f9363n;
        e<K, V> eVar5 = eVar3.f9364o;
        eVar.f9364o = eVar4;
        if (eVar4 != null) {
            eVar4.f9362m = eVar;
        }
        h(eVar, eVar3);
        eVar3.f9363n = eVar;
        eVar.f9362m = eVar3;
        int i10 = 0;
        int max = Math.max(eVar2 != null ? eVar2.f9369t : 0, eVar4 != null ? eVar4.f9369t : 0) + 1;
        eVar.f9369t = max;
        if (eVar5 != null) {
            i10 = eVar5.f9369t;
        }
        eVar3.f9369t = Math.max(max, i10) + 1;
    }

    private void j(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f9363n;
        e<K, V> eVar3 = eVar.f9364o;
        e<K, V> eVar4 = eVar2.f9363n;
        e<K, V> eVar5 = eVar2.f9364o;
        eVar.f9363n = eVar5;
        if (eVar5 != null) {
            eVar5.f9362m = eVar;
        }
        h(eVar, eVar2);
        eVar2.f9364o = eVar;
        eVar.f9362m = eVar2;
        int i10 = 0;
        int max = Math.max(eVar3 != null ? eVar3.f9369t : 0, eVar5 != null ? eVar5.f9369t : 0) + 1;
        eVar.f9369t = max;
        if (eVar4 != null) {
            i10 = eVar4.f9369t;
        }
        eVar2.f9369t = Math.max(max, i10) + 1;
    }

    /* access modifiers changed from: package-private */
    public e<K, V> b(K k10, boolean z9) {
        int i10;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f9347m;
        e<K, V> eVar2 = this.f9348n;
        if (eVar2 != null) {
            Comparable comparable = comparator == f9346t ? (Comparable) k10 : null;
            while (true) {
                K k11 = eVar2.f9367r;
                i10 = comparable != null ? comparable.compareTo(k11) : comparator.compare(k10, k11);
                if (i10 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i10 < 0 ? eVar2.f9363n : eVar2.f9364o;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i10 = 0;
        }
        if (!z9) {
            return null;
        }
        e<K, V> eVar4 = this.f9351q;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k10, eVar4, eVar4.f9366q);
            if (i10 < 0) {
                eVar2.f9363n = eVar;
            } else {
                eVar2.f9364o = eVar;
            }
            e(eVar2, true);
        } else if (comparator != f9346t || (k10 instanceof Comparable)) {
            eVar = new e<>(eVar2, k10, eVar4, eVar4.f9366q);
            this.f9348n = eVar;
        } else {
            throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
        }
        this.f9349o++;
        this.f9350p++;
        return eVar;
    }

    /* access modifiers changed from: package-private */
    public e<K, V> c(Map.Entry<?, ?> entry) {
        e<K, V> d10 = d(entry.getKey());
        if (d10 != null && a(d10.f9368s, entry.getValue())) {
            return d10;
        }
        return null;
    }

    public void clear() {
        this.f9348n = null;
        this.f9349o = 0;
        this.f9350p++;
        e<K, V> eVar = this.f9351q;
        eVar.f9366q = eVar;
        eVar.f9365p = eVar;
    }

    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    /* access modifiers changed from: package-private */
    public e<K, V> d(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        h<K, V>.b bVar = this.f9352r;
        if (bVar != null) {
            return bVar;
        }
        h<K, V>.b bVar2 = new b();
        this.f9352r = bVar2;
        return bVar2;
    }

    /* access modifiers changed from: package-private */
    public void f(e<K, V> eVar, boolean z9) {
        int i10;
        if (z9) {
            e<K, V> eVar2 = eVar.f9366q;
            eVar2.f9365p = eVar.f9365p;
            eVar.f9365p.f9366q = eVar2;
        }
        e<K, V> eVar3 = eVar.f9363n;
        e<K, V> eVar4 = eVar.f9364o;
        e<K, V> eVar5 = eVar.f9362m;
        int i11 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                h(eVar, eVar3);
                eVar.f9363n = null;
            } else if (eVar4 != null) {
                h(eVar, eVar4);
                eVar.f9364o = null;
            } else {
                h(eVar, (e<K, V>) null);
            }
            e(eVar5, false);
            this.f9349o--;
            this.f9350p++;
            return;
        }
        e<K, V> b10 = eVar3.f9369t > eVar4.f9369t ? eVar3.b() : eVar4.a();
        f(b10, false);
        e<K, V> eVar6 = eVar.f9363n;
        if (eVar6 != null) {
            i10 = eVar6.f9369t;
            b10.f9363n = eVar6;
            eVar6.f9362m = b10;
            eVar.f9363n = null;
        } else {
            i10 = 0;
        }
        e<K, V> eVar7 = eVar.f9364o;
        if (eVar7 != null) {
            i11 = eVar7.f9369t;
            b10.f9364o = eVar7;
            eVar7.f9362m = b10;
            eVar.f9364o = null;
        }
        b10.f9369t = Math.max(i10, i11) + 1;
        h(eVar, b10);
    }

    /* access modifiers changed from: package-private */
    public e<K, V> g(Object obj) {
        e<K, V> d10 = d(obj);
        if (d10 != null) {
            f(d10, true);
        }
        return d10;
    }

    public V get(Object obj) {
        e d10 = d(obj);
        if (d10 != null) {
            return d10.f9368s;
        }
        return null;
    }

    public Set<K> keySet() {
        h<K, V>.c cVar = this.f9353s;
        if (cVar != null) {
            return cVar;
        }
        h<K, V>.c cVar2 = new c();
        this.f9353s = cVar2;
        return cVar2;
    }

    public V put(K k10, V v9) {
        Objects.requireNonNull(k10, "key == null");
        e b10 = b(k10, true);
        V v10 = b10.f9368s;
        b10.f9368s = v9;
        return v10;
    }

    public V remove(Object obj) {
        e g10 = g(obj);
        if (g10 != null) {
            return g10.f9368s;
        }
        return null;
    }

    public int size() {
        return this.f9349o;
    }
}
