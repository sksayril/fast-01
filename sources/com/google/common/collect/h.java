package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

class h<K, V> extends AbstractMap<K, V> implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public static final Object f7099v = new Object();

    /* renamed from: m  reason: collision with root package name */
    private transient Object f7100m;

    /* renamed from: n  reason: collision with root package name */
    transient int[] f7101n;

    /* renamed from: o  reason: collision with root package name */
    transient Object[] f7102o;

    /* renamed from: p  reason: collision with root package name */
    transient Object[] f7103p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public transient int f7104q;

    /* renamed from: r  reason: collision with root package name */
    private transient int f7105r;

    /* renamed from: s  reason: collision with root package name */
    private transient Set<K> f7106s;

    /* renamed from: t  reason: collision with root package name */
    private transient Set<Map.Entry<K, V>> f7107t;

    /* renamed from: u  reason: collision with root package name */
    private transient Collection<V> f7108u;

    class a extends h<K, V>.e<K> {
        a() {
            super(h.this, (a) null);
        }

        /* access modifiers changed from: package-private */
        public K c(int i10) {
            return h.this.G(i10);
        }
    }

    class b extends h<K, V>.e<Map.Entry<K, V>> {
        b() {
            super(h.this, (a) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public Map.Entry<K, V> c(int i10) {
            return new g(i10);
        }
    }

    class c extends h<K, V>.e<V> {
        c() {
            super(h.this, (a) null);
        }

        /* access modifiers changed from: package-private */
        public V c(int i10) {
            return h.this.W(i10);
        }
    }

    class d extends AbstractSet<Map.Entry<K, V>> {
        d() {
        }

        public void clear() {
            h.this.clear();
        }

        public boolean contains(Object obj) {
            Map w9 = h.this.w();
            if (w9 != null) {
                return w9.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int i10 = h.this.D(entry.getKey());
            return i10 != -1 && p3.f.a(h.this.W(i10), entry.getValue());
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return h.this.y();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
            r0 = com.google.common.collect.h.k(r9.f7112m);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean remove(java.lang.Object r10) {
            /*
                r9 = this;
                com.google.common.collect.h r0 = com.google.common.collect.h.this
                java.util.Map r0 = r0.w()
                if (r0 == 0) goto L_0x0011
                java.util.Set r0 = r0.entrySet()
                boolean r10 = r0.remove(r10)
                return r10
            L_0x0011:
                boolean r0 = r10 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x0061
                java.util.Map$Entry r10 = (java.util.Map.Entry) r10
                com.google.common.collect.h r0 = com.google.common.collect.h.this
                boolean r0 = r0.J()
                if (r0 == 0) goto L_0x0021
                return r1
            L_0x0021:
                com.google.common.collect.h r0 = com.google.common.collect.h.this
                int r0 = r0.B()
                java.lang.Object r2 = r10.getKey()
                java.lang.Object r3 = r10.getValue()
                com.google.common.collect.h r10 = com.google.common.collect.h.this
                java.lang.Object r5 = r10.N()
                com.google.common.collect.h r10 = com.google.common.collect.h.this
                int[] r6 = r10.L()
                com.google.common.collect.h r10 = com.google.common.collect.h.this
                java.lang.Object[] r7 = r10.M()
                com.google.common.collect.h r10 = com.google.common.collect.h.this
                java.lang.Object[] r8 = r10.O()
                r4 = r0
                int r10 = com.google.common.collect.i.f(r2, r3, r4, r5, r6, r7, r8)
                r2 = -1
                if (r10 != r2) goto L_0x0050
                return r1
            L_0x0050:
                com.google.common.collect.h r1 = com.google.common.collect.h.this
                r1.I(r10, r0)
                com.google.common.collect.h r10 = com.google.common.collect.h.this
                com.google.common.collect.h.e(r10)
                com.google.common.collect.h r10 = com.google.common.collect.h.this
                r10.C()
                r10 = 1
                return r10
            L_0x0061:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.h.d.remove(java.lang.Object):boolean");
        }

        public int size() {
            return h.this.size();
        }
    }

    private abstract class e<T> implements Iterator<T> {

        /* renamed from: m  reason: collision with root package name */
        int f7113m;

        /* renamed from: n  reason: collision with root package name */
        int f7114n;

        /* renamed from: o  reason: collision with root package name */
        int f7115o;

        private e() {
            this.f7113m = h.this.f7104q;
            this.f7114n = h.this.z();
            this.f7115o = -1;
        }

        /* synthetic */ e(h hVar, a aVar) {
            this();
        }

        private void b() {
            if (h.this.f7104q != this.f7113m) {
                throw new ConcurrentModificationException();
            }
        }

        /* access modifiers changed from: package-private */
        public abstract T c(int i10);

        /* access modifiers changed from: package-private */
        public void d() {
            this.f7113m += 32;
        }

        public boolean hasNext() {
            return this.f7114n >= 0;
        }

        public T next() {
            b();
            if (hasNext()) {
                int i10 = this.f7114n;
                this.f7115o = i10;
                T c10 = c(i10);
                this.f7114n = h.this.A(this.f7114n);
                return c10;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            b();
            f.c(this.f7115o >= 0);
            d();
            h hVar = h.this;
            hVar.remove(hVar.G(this.f7115o));
            this.f7114n = h.this.o(this.f7114n, this.f7115o);
            this.f7115o = -1;
        }
    }

    class f extends AbstractSet<K> {
        f() {
        }

        public void clear() {
            h.this.clear();
        }

        public boolean contains(Object obj) {
            return h.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return h.this.H();
        }

        public boolean remove(Object obj) {
            Map w9 = h.this.w();
            return w9 != null ? w9.keySet().remove(obj) : h.this.K(obj) != h.f7099v;
        }

        public int size() {
            return h.this.size();
        }
    }

    final class g extends b<K, V> {

        /* renamed from: m  reason: collision with root package name */
        private final K f7118m;

        /* renamed from: n  reason: collision with root package name */
        private int f7119n;

        g(int i10) {
            this.f7118m = h.this.G(i10);
            this.f7119n = i10;
        }

        private void a() {
            int i10 = this.f7119n;
            if (i10 == -1 || i10 >= h.this.size() || !p3.f.a(this.f7118m, h.this.G(this.f7119n))) {
                this.f7119n = h.this.D(this.f7118m);
            }
        }

        public K getKey() {
            return this.f7118m;
        }

        public V getValue() {
            Map w9 = h.this.w();
            if (w9 != null) {
                return d0.a(w9.get(this.f7118m));
            }
            a();
            int i10 = this.f7119n;
            return i10 == -1 ? d0.b() : h.this.W(i10);
        }

        public V setValue(V v9) {
            Map w9 = h.this.w();
            if (w9 != null) {
                return d0.a(w9.put(this.f7118m, v9));
            }
            a();
            int i10 = this.f7119n;
            if (i10 == -1) {
                h.this.put(this.f7118m, v9);
                return d0.b();
            }
            V j10 = h.this.W(i10);
            h.this.V(this.f7119n, v9);
            return j10;
        }
    }

    /* renamed from: com.google.common.collect.h$h  reason: collision with other inner class name */
    class C0091h extends AbstractCollection<V> {
        C0091h() {
        }

        public void clear() {
            h.this.clear();
        }

        public Iterator<V> iterator() {
            return h.this.X();
        }

        public int size() {
            return h.this.size();
        }
    }

    h() {
        E(3);
    }

    /* access modifiers changed from: private */
    public int B() {
        return (1 << (this.f7104q & 31)) - 1;
    }

    /* access modifiers changed from: private */
    public int D(Object obj) {
        if (J()) {
            return -1;
        }
        int c10 = l.c(obj);
        int B = B();
        int h10 = i.h(N(), c10 & B);
        if (h10 == 0) {
            return -1;
        }
        int b10 = i.b(c10, B);
        do {
            int i10 = h10 - 1;
            int x9 = x(i10);
            if (i.b(x9, B) == b10 && p3.f.a(obj, G(i10))) {
                return i10;
            }
            h10 = i.c(x9, B);
        } while (h10 != 0);
        return -1;
    }

    /* access modifiers changed from: private */
    public K G(int i10) {
        return M()[i10];
    }

    /* access modifiers changed from: private */
    public Object K(Object obj) {
        if (J()) {
            return f7099v;
        }
        int B = B();
        int f10 = i.f(obj, (Object) null, B, N(), L(), M(), (Object[]) null);
        if (f10 == -1) {
            return f7099v;
        }
        Object W = W(f10);
        I(f10, B);
        this.f7105r--;
        C();
        return W;
    }

    /* access modifiers changed from: private */
    public int[] L() {
        int[] iArr = this.f7101n;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* access modifiers changed from: private */
    public Object[] M() {
        Object[] objArr = this.f7102o;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* access modifiers changed from: private */
    public Object N() {
        Object obj = this.f7100m;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* access modifiers changed from: private */
    public Object[] O() {
        Object[] objArr = this.f7103p;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private void Q(int i10) {
        int min;
        int length = L().length;
        if (i10 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            P(min);
        }
    }

    private int R(int i10, int i11, int i12, int i13) {
        Object a10 = i.a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            i.i(a10, i12 & i14, i13 + 1);
        }
        Object N = N();
        int[] L = L();
        for (int i15 = 0; i15 <= i10; i15++) {
            int h10 = i.h(N, i15);
            while (h10 != 0) {
                int i16 = h10 - 1;
                int i17 = L[i16];
                int b10 = i.b(i17, i10) | i15;
                int i18 = b10 & i14;
                int h11 = i.h(a10, i18);
                i.i(a10, i18, h10);
                L[i16] = i.d(b10, h11, i14);
                h10 = i.c(i17, i10);
            }
        }
        this.f7100m = a10;
        T(i14);
        return i14;
    }

    private void S(int i10, int i11) {
        L()[i10] = i11;
    }

    private void T(int i10) {
        this.f7104q = i.d(this.f7104q, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    private void U(int i10, K k10) {
        M()[i10] = k10;
    }

    /* access modifiers changed from: private */
    public void V(int i10, V v9) {
        O()[i10] = v9;
    }

    /* access modifiers changed from: private */
    public V W(int i10) {
        return O()[i10];
    }

    static /* synthetic */ int e(h hVar) {
        int i10 = hVar.f7105r;
        hVar.f7105r = i10 - 1;
        return i10;
    }

    public static <K, V> h<K, V> r() {
        return new h<>();
    }

    private int x(int i10) {
        return L()[i10];
    }

    /* access modifiers changed from: package-private */
    public int A(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f7105r) {
            return i11;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public void C() {
        this.f7104q += 32;
    }

    /* access modifiers changed from: package-private */
    public void E(int i10) {
        p3.h.e(i10 >= 0, "Expected size must be >= 0");
        this.f7104q = q3.a.a(i10, 1, 1073741823);
    }

    /* access modifiers changed from: package-private */
    public void F(int i10, K k10, V v9, int i11, int i12) {
        S(i10, i.d(i11, 0, i12));
        U(i10, k10);
        V(i10, v9);
    }

    /* access modifiers changed from: package-private */
    public Iterator<K> H() {
        Map w9 = w();
        return w9 != null ? w9.keySet().iterator() : new a();
    }

    /* access modifiers changed from: package-private */
    public void I(int i10, int i11) {
        Object N = N();
        int[] L = L();
        Object[] M = M();
        Object[] O = O();
        int size = size() - 1;
        if (i10 < size) {
            Object obj = M[size];
            M[i10] = obj;
            O[i10] = O[size];
            M[size] = null;
            O[size] = null;
            L[i10] = L[size];
            L[size] = 0;
            int c10 = l.c(obj) & i11;
            int h10 = i.h(N, c10);
            int i12 = size + 1;
            if (h10 == i12) {
                i.i(N, c10, i10 + 1);
                return;
            }
            while (true) {
                int i13 = h10 - 1;
                int i14 = L[i13];
                int c11 = i.c(i14, i11);
                if (c11 == i12) {
                    L[i13] = i.d(i14, i10 + 1, i11);
                    return;
                }
                h10 = c11;
            }
        } else {
            M[i10] = null;
            O[i10] = null;
            L[i10] = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean J() {
        return this.f7100m == null;
    }

    /* access modifiers changed from: package-private */
    public void P(int i10) {
        this.f7101n = Arrays.copyOf(L(), i10);
        this.f7102o = Arrays.copyOf(M(), i10);
        this.f7103p = Arrays.copyOf(O(), i10);
    }

    /* access modifiers changed from: package-private */
    public Iterator<V> X() {
        Map w9 = w();
        return w9 != null ? w9.values().iterator() : new c();
    }

    public void clear() {
        if (!J()) {
            C();
            Map w9 = w();
            if (w9 != null) {
                this.f7104q = q3.a.a(size(), 3, 1073741823);
                w9.clear();
                this.f7100m = null;
            } else {
                Arrays.fill(M(), 0, this.f7105r, (Object) null);
                Arrays.fill(O(), 0, this.f7105r, (Object) null);
                i.g(N());
                Arrays.fill(L(), 0, this.f7105r, 0);
            }
            this.f7105r = 0;
        }
    }

    public boolean containsKey(Object obj) {
        Map w9 = w();
        return w9 != null ? w9.containsKey(obj) : D(obj) != -1;
    }

    public boolean containsValue(Object obj) {
        Map w9 = w();
        if (w9 != null) {
            return w9.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f7105r; i10++) {
            if (p3.f.a(obj, W(i10))) {
                return true;
            }
        }
        return false;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f7107t;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> s9 = s();
        this.f7107t = s9;
        return s9;
    }

    public V get(Object obj) {
        Map w9 = w();
        if (w9 != null) {
            return w9.get(obj);
        }
        int D = D(obj);
        if (D == -1) {
            return null;
        }
        n(D);
        return W(D);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Set<K> keySet() {
        Set<K> set = this.f7106s;
        if (set != null) {
            return set;
        }
        Set<K> u9 = u();
        this.f7106s = u9;
        return u9;
    }

    /* access modifiers changed from: package-private */
    public void n(int i10) {
    }

    /* access modifiers changed from: package-private */
    public int o(int i10, int i11) {
        return i10 - 1;
    }

    /* access modifiers changed from: package-private */
    public int p() {
        p3.h.n(J(), "Arrays already allocated");
        int i10 = this.f7104q;
        int j10 = i.j(i10);
        this.f7100m = i.a(j10);
        T(j10 - 1);
        this.f7101n = new int[i10];
        this.f7102o = new Object[i10];
        this.f7103p = new Object[i10];
        return i10;
    }

    public V put(K k10, V v9) {
        int i10;
        if (J()) {
            p();
        }
        Map w9 = w();
        if (w9 != null) {
            return w9.put(k10, v9);
        }
        int[] L = L();
        Object[] M = M();
        V[] O = O();
        int i11 = this.f7105r;
        int i12 = i11 + 1;
        int c10 = l.c(k10);
        int B = B();
        int i13 = c10 & B;
        int h10 = i.h(N(), i13);
        if (h10 != 0) {
            int b10 = i.b(c10, B);
            int i14 = 0;
            while (true) {
                int i15 = h10 - 1;
                int i16 = L[i15];
                if (i.b(i16, B) != b10 || !p3.f.a(k10, M[i15])) {
                    int c11 = i.c(i16, B);
                    i14++;
                    if (c11 != 0) {
                        h10 = c11;
                    } else if (i14 >= 9) {
                        return q().put(k10, v9);
                    } else {
                        if (i12 <= B) {
                            L[i15] = i.d(i16, i12, B);
                        }
                    }
                } else {
                    V v10 = O[i15];
                    O[i15] = v9;
                    n(i15);
                    return v10;
                }
            }
            i10 = B;
            Q(i12);
            F(i11, k10, v9, c10, i10);
            this.f7105r = i12;
            C();
            return null;
        } else if (i12 <= B) {
            i.i(N(), i13, i12);
            i10 = B;
            Q(i12);
            F(i11, k10, v9, c10, i10);
            this.f7105r = i12;
            C();
            return null;
        }
        i10 = R(B, i.e(B), c10, i11);
        Q(i12);
        F(i11, k10, v9, c10, i10);
        this.f7105r = i12;
        C();
        return null;
    }

    /* access modifiers changed from: package-private */
    public Map<K, V> q() {
        Map<K, V> t9 = t(B() + 1);
        int z9 = z();
        while (z9 >= 0) {
            t9.put(G(z9), W(z9));
            z9 = A(z9);
        }
        this.f7100m = t9;
        this.f7101n = null;
        this.f7102o = null;
        this.f7103p = null;
        C();
        return t9;
    }

    public V remove(Object obj) {
        Map w9 = w();
        if (w9 != null) {
            return w9.remove(obj);
        }
        V K = K(obj);
        if (K == f7099v) {
            return null;
        }
        return K;
    }

    /* access modifiers changed from: package-private */
    public Set<Map.Entry<K, V>> s() {
        return new d();
    }

    public int size() {
        Map w9 = w();
        return w9 != null ? w9.size() : this.f7105r;
    }

    /* access modifiers changed from: package-private */
    public Map<K, V> t(int i10) {
        return new LinkedHashMap(i10, 1.0f);
    }

    /* access modifiers changed from: package-private */
    public Set<K> u() {
        return new f();
    }

    /* access modifiers changed from: package-private */
    public Collection<V> v() {
        return new C0091h();
    }

    public Collection<V> values() {
        Collection<V> collection = this.f7108u;
        if (collection != null) {
            return collection;
        }
        Collection<V> v9 = v();
        this.f7108u = v9;
        return v9;
    }

    /* access modifiers changed from: package-private */
    public Map<K, V> w() {
        Object obj = this.f7100m;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public Iterator<Map.Entry<K, V>> y() {
        Map w9 = w();
        return w9 != null ? w9.entrySet().iterator() : new b();
    }

    /* access modifiers changed from: package-private */
    public int z() {
        return isEmpty() ? -1 : 0;
    }
}
