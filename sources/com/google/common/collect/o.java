package com.google.common.collect;

import com.google.common.collect.m;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

public abstract class o<K, V> implements Map<K, V>, Serializable {

    /* renamed from: p  reason: collision with root package name */
    static final Map.Entry<?, ?>[] f7161p = new Map.Entry[0];

    /* renamed from: m  reason: collision with root package name */
    private transient q<Map.Entry<K, V>> f7162m;

    /* renamed from: n  reason: collision with root package name */
    private transient q<K> f7163n;

    /* renamed from: o  reason: collision with root package name */
    private transient m<V> f7164o;

    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        Comparator<? super V> f7165a;

        /* renamed from: b  reason: collision with root package name */
        Object[] f7166b;

        /* renamed from: c  reason: collision with root package name */
        int f7167c = 0;

        /* renamed from: d  reason: collision with root package name */
        boolean f7168d = false;

        /* renamed from: e  reason: collision with root package name */
        C0093a f7169e;

        /* renamed from: com.google.common.collect.o$a$a  reason: collision with other inner class name */
        static final class C0093a {

            /* renamed from: a  reason: collision with root package name */
            private final Object f7170a;

            /* renamed from: b  reason: collision with root package name */
            private final Object f7171b;

            /* renamed from: c  reason: collision with root package name */
            private final Object f7172c;

            C0093a(Object obj, Object obj2, Object obj3) {
                this.f7170a = obj;
                this.f7171b = obj2;
                this.f7172c = obj3;
            }

            /* access modifiers changed from: package-private */
            public IllegalArgumentException a() {
                String valueOf = String.valueOf(this.f7170a);
                String valueOf2 = String.valueOf(this.f7171b);
                String valueOf3 = String.valueOf(this.f7170a);
                String valueOf4 = String.valueOf(this.f7172c);
                StringBuilder sb = new StringBuilder(valueOf.length() + 39 + valueOf2.length() + valueOf3.length() + valueOf4.length());
                sb.append("Multiple entries with same key: ");
                sb.append(valueOf);
                sb.append("=");
                sb.append(valueOf2);
                sb.append(" and ");
                sb.append(valueOf3);
                sb.append("=");
                sb.append(valueOf4);
                return new IllegalArgumentException(sb.toString());
            }
        }

        a(int i10) {
            this.f7166b = new Object[(i10 * 2)];
        }

        private o<K, V> a(boolean z9) {
            Object[] objArr;
            C0093a aVar;
            C0093a aVar2;
            if (!z9 || (aVar2 = this.f7169e) == null) {
                int i10 = this.f7167c;
                if (this.f7165a == null) {
                    objArr = this.f7166b;
                } else {
                    if (this.f7168d) {
                        this.f7166b = Arrays.copyOf(this.f7166b, i10 * 2);
                    }
                    objArr = this.f7166b;
                    if (!z9) {
                        objArr = d(objArr, this.f7167c);
                        if (objArr.length < this.f7166b.length) {
                            i10 = objArr.length >>> 1;
                        }
                    }
                    f(objArr, i10, this.f7165a);
                }
                this.f7168d = true;
                i0 h10 = i0.h(i10, objArr, this);
                if (!z9 || (aVar = this.f7169e) == null) {
                    return h10;
                }
                throw aVar.a();
            }
            throw aVar2.a();
        }

        private void c(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f7166b;
            if (i11 > objArr.length) {
                this.f7166b = Arrays.copyOf(objArr, m.b.a(objArr.length, i11));
                this.f7168d = false;
            }
        }

        private Object[] d(Object[] objArr, int i10) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                Object obj = objArr[i11 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i11);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[((i10 - bitSet.cardinality()) * 2)];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10 * 2) {
                if (bitSet.get(i12 >>> 1)) {
                    i12 += 2;
                } else {
                    int i14 = i13 + 1;
                    int i15 = i12 + 1;
                    Object obj2 = objArr[i12];
                    Objects.requireNonNull(obj2);
                    objArr2[i13] = obj2;
                    i13 = i14 + 1;
                    i12 = i15 + 1;
                    Object obj3 = objArr[i15];
                    Objects.requireNonNull(obj3);
                    objArr2[i14] = obj3;
                }
            }
            return objArr2;
        }

        static <V> void f(Object[] objArr, int i10, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * 2;
                Object obj = objArr[i12];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i12 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i10, f0.a(comparator).e(y.d()));
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 2;
                objArr[i14] = entryArr[i13].getKey();
                objArr[i14 + 1] = entryArr[i13].getValue();
            }
        }

        public o<K, V> b() {
            return a(true);
        }

        public a<K, V> e(K k10, V v9) {
            c(this.f7167c + 1);
            f.a(k10, v9);
            Object[] objArr = this.f7166b;
            int i10 = this.f7167c;
            objArr[i10 * 2] = k10;
            objArr[(i10 * 2) + 1] = v9;
            this.f7167c = i10 + 1;
            return this;
        }
    }

    o() {
    }

    public static <K, V> o<K, V> f() {
        return i0.f7125t;
    }

    /* access modifiers changed from: package-private */
    public abstract q<Map.Entry<K, V>> a();

    /* access modifiers changed from: package-private */
    public abstract q<K> b();

    /* access modifiers changed from: package-private */
    public abstract m<V> c();

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* renamed from: d */
    public q<Map.Entry<K, V>> entrySet() {
        q<Map.Entry<K, V>> qVar = this.f7162m;
        if (qVar != null) {
            return qVar;
        }
        q<Map.Entry<K, V>> a10 = a();
        this.f7162m = a10;
        return a10;
    }

    /* renamed from: e */
    public q<K> keySet() {
        q<K> qVar = this.f7163n;
        if (qVar != null) {
            return qVar;
        }
        q<K> b10 = b();
        this.f7163n = b10;
        return b10;
    }

    public boolean equals(Object obj) {
        return y.a(this, obj);
    }

    /* renamed from: g */
    public m<V> values() {
        m<V> mVar = this.f7164o;
        if (mVar != null) {
            return mVar;
        }
        m<V> c10 = c();
        this.f7164o = c10;
        return c10;
    }

    public abstract V get(Object obj);

    public final V getOrDefault(Object obj, V v9) {
        V v10 = get(obj);
        return v10 != null ? v10 : v9;
    }

    public int hashCode() {
        return l0.b(entrySet());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    @Deprecated
    public final V put(K k10, V v9) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return y.c(this);
    }
}
