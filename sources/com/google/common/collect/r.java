package com.google.common.collect;

import com.google.common.collect.o;
import com.google.common.collect.p;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

public class r<K, V> extends p<K, V> {

    /* renamed from: o  reason: collision with root package name */
    private final transient q<V> f7179o;

    public static final class a<K, V> extends p.a<K, V> {
        public r<K, V> a() {
            Collection entrySet = this.f7175a.entrySet();
            Comparator comparator = this.f7176b;
            if (comparator != null) {
                entrySet = f0.a(comparator).d().b(entrySet);
            }
            return r.e(entrySet, this.f7177c);
        }
    }

    r(o<K, q<V>> oVar, int i10, Comparator<? super V> comparator) {
        super(oVar, i10);
        this.f7179o = d(comparator);
    }

    private static <V> q<V> d(Comparator<? super V> comparator) {
        return comparator == null ? q.C() : s.N(comparator);
    }

    static <K, V> r<K, V> e(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return f();
        }
        o.a aVar = new o.a(collection.size());
        int i10 = 0;
        for (Map.Entry entry : collection) {
            Object key = entry.getKey();
            q<V> g10 = g(comparator, (Collection) entry.getValue());
            if (!g10.isEmpty()) {
                aVar.e(key, g10);
                i10 += g10.size();
            }
        }
        return new r<>(aVar.b(), i10, comparator);
    }

    public static <K, V> r<K, V> f() {
        return k.f7147p;
    }

    private static <V> q<V> g(Comparator<? super V> comparator, Collection<? extends V> collection) {
        return comparator == null ? q.z(collection) : s.J(comparator, collection);
    }
}
