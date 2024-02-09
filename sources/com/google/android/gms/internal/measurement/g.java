package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public final class g implements l, r, Iterable<r> {

    /* renamed from: m  reason: collision with root package name */
    private final SortedMap<Integer, r> f5263m;

    /* renamed from: n  reason: collision with root package name */
    private final Map<String, r> f5264n;

    public g() {
        this.f5263m = new TreeMap();
        this.f5264n = new TreeMap();
    }

    public g(List<r> list) {
        this();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                F(i10, list.get(i10));
            }
        }
    }

    public g(r... rVarArr) {
        this((List<r>) Arrays.asList(rVarArr));
    }

    public final void A(int i10, r rVar) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Invalid value index: " + i10);
        } else if (i10 >= C()) {
            F(i10, rVar);
        } else {
            for (int intValue = this.f5263m.lastKey().intValue(); intValue >= i10; intValue--) {
                r rVar2 = (r) this.f5263m.get(Integer.valueOf(intValue));
                if (rVar2 != null) {
                    F(intValue + 1, rVar2);
                    this.f5263m.remove(Integer.valueOf(intValue));
                }
            }
            F(i10, rVar);
        }
    }

    public final void B(r rVar) {
        F(C(), rVar);
    }

    public final int C() {
        if (this.f5263m.isEmpty()) {
            return 0;
        }
        return this.f5263m.lastKey().intValue() + 1;
    }

    public final String D(String str) {
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.f5263m.isEmpty()) {
            for (int i10 = 0; i10 < C(); i10++) {
                r z9 = z(i10);
                sb.append(str);
                if (!(z9 instanceof y) && !(z9 instanceof p)) {
                    sb.append(z9.f());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }

    public final void E(int i10) {
        int intValue = this.f5263m.lastKey().intValue();
        if (i10 <= intValue && i10 >= 0) {
            this.f5263m.remove(Integer.valueOf(i10));
            if (i10 == intValue) {
                int i11 = i10 - 1;
                if (!this.f5263m.containsKey(Integer.valueOf(i11)) && i11 >= 0) {
                    this.f5263m.put(Integer.valueOf(i11), r.f5547d);
                    return;
                }
                return;
            }
            while (true) {
                i10++;
                if (i10 <= this.f5263m.lastKey().intValue()) {
                    r rVar = (r) this.f5263m.get(Integer.valueOf(i10));
                    if (rVar != null) {
                        this.f5263m.put(Integer.valueOf(i10 - 1), rVar);
                        this.f5263m.remove(Integer.valueOf(i10));
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void F(int i10, r rVar) {
        if (i10 > 32468) {
            throw new IllegalStateException("Array too large");
        } else if (i10 < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i10);
        } else if (rVar == null) {
            this.f5263m.remove(Integer.valueOf(i10));
        } else {
            this.f5263m.put(Integer.valueOf(i10), rVar);
        }
    }

    public final boolean G(int i10) {
        if (i10 >= 0 && i10 <= this.f5263m.lastKey().intValue()) {
            return this.f5263m.containsKey(Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i10);
    }

    public final Iterator<Integer> H() {
        return this.f5263m.keySet().iterator();
    }

    public final List<r> I() {
        ArrayList arrayList = new ArrayList(C());
        for (int i10 = 0; i10 < C(); i10++) {
            arrayList.add(z(i10));
        }
        return arrayList;
    }

    public final void J() {
        this.f5263m.clear();
    }

    public final r b() {
        Integer num;
        SortedMap<Integer, r> sortedMap;
        r rVar;
        g gVar = new g();
        for (Map.Entry next : this.f5263m.entrySet()) {
            if (next.getValue() instanceof l) {
                sortedMap = gVar.f5263m;
                num = (Integer) next.getKey();
                rVar = (r) next.getValue();
            } else {
                sortedMap = gVar.f5263m;
                num = (Integer) next.getKey();
                rVar = ((r) next.getValue()).b();
            }
            sortedMap.put(num, rVar);
        }
        return gVar;
    }

    public final Boolean c() {
        return Boolean.TRUE;
    }

    public final Double d() {
        return this.f5263m.size() == 1 ? z(0).d() : this.f5263m.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (C() != gVar.C()) {
            return false;
        }
        if (this.f5263m.isEmpty()) {
            return gVar.f5263m.isEmpty();
        }
        for (int intValue = this.f5263m.firstKey().intValue(); intValue <= this.f5263m.lastKey().intValue(); intValue++) {
            if (!z(intValue).equals(gVar.z(intValue))) {
                return false;
            }
        }
        return true;
    }

    public final String f() {
        return toString();
    }

    public final Iterator<r> g() {
        return new f(this, this.f5263m.keySet().iterator(), this.f5264n.keySet().iterator());
    }

    public final int hashCode() {
        return this.f5263m.hashCode() * 31;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        r3 = r2.f5264n.get(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.r i(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "length"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0017
            com.google.android.gms.internal.measurement.j r3 = new com.google.android.gms.internal.measurement.j
            int r0 = r2.C()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r3.<init>(r0)
            return r3
        L_0x0017:
            boolean r0 = r2.k(r3)
            if (r0 == 0) goto L_0x0028
            java.util.Map<java.lang.String, com.google.android.gms.internal.measurement.r> r0 = r2.f5264n
            java.lang.Object r3 = r0.get(r3)
            com.google.android.gms.internal.measurement.r r3 = (com.google.android.gms.internal.measurement.r) r3
            if (r3 == 0) goto L_0x0028
            return r3
        L_0x0028:
            com.google.android.gms.internal.measurement.r r3 = com.google.android.gms.internal.measurement.r.f5547d
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.g.i(java.lang.String):com.google.android.gms.internal.measurement.r");
    }

    public final Iterator<r> iterator() {
        return new i(this);
    }

    public final boolean k(String str) {
        return "length".equals(str) || this.f5264n.containsKey(str);
    }

    public final r l(String str, s6 s6Var, List<r> list) {
        return "concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str) ? g0.d(str, this, s6Var, list) : o.a(this, new t(str), s6Var, list);
    }

    public final void o(String str, r rVar) {
        if (rVar == null) {
            this.f5264n.remove(str);
        } else {
            this.f5264n.put(str, rVar);
        }
    }

    public final String toString() {
        return D(",");
    }

    public final int y() {
        return this.f5263m.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r2 = (com.google.android.gms.internal.measurement.r) r1.f5263m.get(java.lang.Integer.valueOf(r2));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.r z(int r2) {
        /*
            r1 = this;
            int r0 = r1.C()
            if (r2 >= r0) goto L_0x001e
            boolean r0 = r1.G(r2)
            if (r0 == 0) goto L_0x001b
            java.util.SortedMap<java.lang.Integer, com.google.android.gms.internal.measurement.r> r0 = r1.f5263m
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            com.google.android.gms.internal.measurement.r r2 = (com.google.android.gms.internal.measurement.r) r2
            if (r2 == 0) goto L_0x001b
            return r2
        L_0x001b:
            com.google.android.gms.internal.measurement.r r2 = com.google.android.gms.internal.measurement.r.f5547d
            return r2
        L_0x001e:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "Attempting to get element outside of current array"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.g.z(int):com.google.android.gms.internal.measurement.r");
    }
}
