package h8;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.l;

class f0 extends e0 {
    public static <K, V> Map<K, V> d() {
        y yVar = y.f9428m;
        l.c(yVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return yVar;
    }

    public static <K, V> HashMap<K, V> e(g8.l<? extends K, ? extends V>... lVarArr) {
        l.e(lVarArr, "pairs");
        HashMap<K, V> hashMap = new HashMap<>(e0.a(lVarArr.length));
        j(hashMap, lVarArr);
        return hashMap;
    }

    public static <K, V> Map<K, V> f(g8.l<? extends K, ? extends V>... lVarArr) {
        l.e(lVarArr, "pairs");
        return lVarArr.length > 0 ? n(lVarArr, new LinkedHashMap(e0.a(lVarArr.length))) : d();
    }

    public static final <K, V> Map<K, V> g(Map<K, ? extends V> map) {
        l.e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : e0.c(map) : d();
    }

    public static <K, V> Map<K, V> h(Map<? extends K, ? extends V> map, g8.l<? extends K, ? extends V> lVar) {
        l.e(map, "<this>");
        l.e(lVar, "pair");
        if (map.isEmpty()) {
            return e0.b(lVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(lVar.c(), lVar.d());
        return linkedHashMap;
    }

    public static final <K, V> void i(Map<? super K, ? super V> map, Iterable<? extends g8.l<? extends K, ? extends V>> iterable) {
        l.e(map, "<this>");
        l.e(iterable, "pairs");
        for (g8.l lVar : iterable) {
            map.put(lVar.a(), lVar.b());
        }
    }

    public static final <K, V> void j(Map<? super K, ? super V> map, g8.l<? extends K, ? extends V>[] lVarArr) {
        l.e(map, "<this>");
        l.e(lVarArr, "pairs");
        for (g8.l<? extends K, ? extends V> lVar : lVarArr) {
            map.put(lVar.a(), lVar.b());
        }
    }

    public static <K, V> Map<K, V> k(Iterable<? extends g8.l<? extends K, ? extends V>> iterable) {
        l.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return g(l(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return d();
        }
        if (size != 1) {
            return l(iterable, new LinkedHashMap(e0.a(collection.size())));
        }
        return e0.b((g8.l) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M l(Iterable<? extends g8.l<? extends K, ? extends V>> iterable, M m10) {
        l.e(iterable, "<this>");
        l.e(m10, "destination");
        i(m10, iterable);
        return m10;
    }

    public static <K, V> Map<K, V> m(Map<? extends K, ? extends V> map) {
        l.e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? o(map) : e0.c(map) : d();
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M n(g8.l<? extends K, ? extends V>[] lVarArr, M m10) {
        l.e(lVarArr, "<this>");
        l.e(m10, "destination");
        j(m10, lVarArr);
        return m10;
    }

    public static <K, V> Map<K, V> o(Map<? extends K, ? extends V> map) {
        l.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
