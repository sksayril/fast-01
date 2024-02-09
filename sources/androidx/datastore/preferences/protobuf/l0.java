package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a0;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class l0<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: n  reason: collision with root package name */
    private static final l0 f2027n;

    /* renamed from: m  reason: collision with root package name */
    private boolean f2028m = true;

    static {
        l0 l0Var = new l0();
        f2027n = l0Var;
        l0Var.p();
    }

    private l0() {
    }

    private l0(Map<K, V> map) {
        super(map);
    }

    static <K, V> int b(Map<K, V> map) {
        int i10 = 0;
        for (Map.Entry next : map.entrySet()) {
            i10 += d(next.getValue()) ^ d(next.getKey());
        }
        return i10;
    }

    private static int d(Object obj) {
        if (obj instanceof byte[]) {
            return a0.d((byte[]) obj);
        }
        if (!(obj instanceof a0.c)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    private static void e(Map<?, ?> map) {
        for (Object next : map.keySet()) {
            a0.a(next);
            a0.a(map.get(next));
        }
    }

    public static <K, V> l0<K, V> f() {
        return f2027n;
    }

    private void h() {
        if (!n()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean i(Object obj, Object obj2) {
        return (!(obj instanceof byte[]) || !(obj2 instanceof byte[])) ? obj.equals(obj2) : Arrays.equals((byte[]) obj, (byte[]) obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <K, V> boolean k(java.util.Map<K, V> r4, java.util.Map<K, V> r5) {
        /*
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r4.size()
            int r2 = r5.size()
            r3 = 0
            if (r1 == r2) goto L_0x0010
            return r3
        L_0x0010:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0018:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0042
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r2 = r5.containsKey(r2)
            if (r2 != 0) goto L_0x002f
            return r3
        L_0x002f:
            java.lang.Object r2 = r1.getValue()
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r1 = r5.get(r1)
            boolean r1 = i(r2, r1)
            if (r1 != 0) goto L_0x0018
            return r3
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.l0.k(java.util.Map, java.util.Map):boolean");
    }

    public void clear() {
        h();
        super.clear();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && k(this, (Map) obj);
    }

    public int hashCode() {
        return b(this);
    }

    public boolean n() {
        return this.f2028m;
    }

    public void p() {
        this.f2028m = false;
    }

    public V put(K k10, V v9) {
        h();
        a0.a(k10);
        a0.a(v9);
        return super.put(k10, v9);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        h();
        e(map);
        super.putAll(map);
    }

    public void q(l0<K, V> l0Var) {
        h();
        if (!l0Var.isEmpty()) {
            putAll(l0Var);
        }
    }

    public l0<K, V> r() {
        return isEmpty() ? new l0<>() : new l0<>(this);
    }

    public V remove(Object obj) {
        h();
        return super.remove(obj);
    }
}
