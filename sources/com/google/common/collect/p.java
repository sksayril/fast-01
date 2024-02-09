package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

public abstract class p<K, V> extends d<K, V> implements Serializable {

    /* renamed from: m  reason: collision with root package name */
    final transient o<K, ? extends m<V>> f7173m;

    /* renamed from: n  reason: collision with root package name */
    final transient int f7174n;

    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final Map<K, Collection<V>> f7175a = g0.c();

        /* renamed from: b  reason: collision with root package name */
        Comparator<? super K> f7176b;

        /* renamed from: c  reason: collision with root package name */
        Comparator<? super V> f7177c;
    }

    p(o<K, ? extends m<V>> oVar, int i10) {
        this.f7173m = oVar;
        this.f7174n = i10;
    }

    public boolean b(Object obj) {
        return obj != null && super.b(obj);
    }

    /* renamed from: c */
    public o<K, Collection<V>> a() {
        return this.f7173m;
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
