package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.TreeMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final TreeMap<Integer, s> f5112a = new TreeMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final TreeMap<Integer, s> f5113b = new TreeMap<>();

    private static int a(s6 s6Var, s sVar, r rVar) {
        r a10 = sVar.a(s6Var, Collections.singletonList(rVar));
        if (a10 instanceof j) {
            return r5.i(a10.d().doubleValue());
        }
        return -1;
    }

    public final void b(s6 s6Var, d dVar) {
        uc ucVar = new uc(dVar);
        for (Integer num : this.f5112a.keySet()) {
            e eVar = (e) dVar.d().clone();
            int a10 = a(s6Var, this.f5112a.get(num), ucVar);
            if (a10 == 2 || a10 == -1) {
                dVar.e(eVar);
            }
        }
        for (Integer num2 : this.f5113b.keySet()) {
            a(s6Var, this.f5113b.get(num2), ucVar);
        }
    }

    public final void c(String str, int i10, s sVar, String str2) {
        TreeMap<Integer, s> treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f5113b;
        } else if ("edit".equals(str2)) {
            treeMap = this.f5112a;
        } else {
            throw new IllegalStateException("Unknown callback type: " + str2);
        }
        if (treeMap.containsKey(Integer.valueOf(i10))) {
            i10 = treeMap.lastKey().intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i10), sVar);
    }
}
