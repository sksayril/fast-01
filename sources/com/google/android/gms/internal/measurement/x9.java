package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class x9<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: n  reason: collision with root package name */
    private static final x9<?, ?> f5697n;

    /* renamed from: m  reason: collision with root package name */
    private boolean f5698m = true;

    static {
        x9<?, ?> x9Var = new x9<>();
        f5697n = x9Var;
        x9Var.f5698m = false;
    }

    private x9() {
    }

    private x9(Map<K, V> map) {
        super(map);
    }

    private static int b(Object obj) {
        if (obj instanceof byte[]) {
            return r8.d((byte[]) obj);
        }
        if (!(obj instanceof v8)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public static <K, V> x9<K, V> d() {
        return f5697n;
    }

    private final void k() {
        if (!this.f5698m) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        k();
        super.clear();
    }

    public final void e(x9<K, V> x9Var) {
        k();
        if (!x9Var.isEmpty()) {
            putAll(x9Var);
        }
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L_0x005d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L_0x0059
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L_0x0016
        L_0x0014:
            r7 = 0
            goto L_0x005a
        L_0x0016:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x001e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L_0x0035
            goto L_0x0014
        L_0x0035:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L_0x0052
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x0056
        L_0x0052:
            boolean r3 = r4.equals(r3)
        L_0x0056:
            if (r3 != 0) goto L_0x001e
            goto L_0x0014
        L_0x0059:
            r7 = 1
        L_0x005a:
            if (r7 == 0) goto L_0x005d
            return r0
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.x9.equals(java.lang.Object):boolean");
    }

    public final x9<K, V> f() {
        return isEmpty() ? new x9<>() : new x9<>(this);
    }

    public final void h() {
        this.f5698m = false;
    }

    public final int hashCode() {
        int i10 = 0;
        for (Map.Entry entry : entrySet()) {
            i10 += b(entry.getValue()) ^ b(entry.getKey());
        }
        return i10;
    }

    public final boolean i() {
        return this.f5698m;
    }

    public final V put(K k10, V v9) {
        k();
        r8.e(k10);
        r8.e(v9);
        return super.put(k10, v9);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        k();
        for (Object next : map.keySet()) {
            r8.e(next);
            r8.e(map.get(next));
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        k();
        return super.remove(obj);
    }
}
