package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.l4;
import com.google.android.gms.internal.measurement.m4;
import com.google.android.gms.internal.measurement.p8;
import com.google.android.gms.internal.measurement.u4;
import com.google.android.gms.internal.measurement.v4;
import com.google.android.gms.internal.measurement.xd;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p.a;

final class zc {

    /* renamed from: a  reason: collision with root package name */
    private String f6814a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6815b;

    /* renamed from: c  reason: collision with root package name */
    private u4 f6816c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public BitSet f6817d;

    /* renamed from: e  reason: collision with root package name */
    private BitSet f6818e;

    /* renamed from: f  reason: collision with root package name */
    private Map<Integer, Long> f6819f;

    /* renamed from: g  reason: collision with root package name */
    private Map<Integer, List<Long>> f6820g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ xc f6821h;

    private zc(xc xcVar, String str) {
        this.f6821h = xcVar;
        this.f6814a = str;
        this.f6815b = true;
        this.f6817d = new BitSet();
        this.f6818e = new BitSet();
        this.f6819f = new a();
        this.f6820g = new a();
    }

    private zc(xc xcVar, String str, u4 u4Var, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.f6821h = xcVar;
        this.f6814a = str;
        this.f6817d = bitSet;
        this.f6818e = bitSet2;
        this.f6819f = map;
        this.f6820g = new a();
        if (map2 != null) {
            for (Integer next : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(next));
                this.f6820g.put(next, arrayList);
            }
        }
        this.f6815b = false;
        this.f6816c = u4Var;
    }

    /* access modifiers changed from: package-private */
    public final l4 a(int i10) {
        ArrayList arrayList;
        List list;
        l4.a P = l4.P();
        P.x(i10);
        P.A(this.f6815b);
        u4 u4Var = this.f6816c;
        if (u4Var != null) {
            P.z(u4Var);
        }
        u4.a E = u4.Y().A(jc.L(this.f6817d)).E(jc.L(this.f6818e));
        if (this.f6819f == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.f6819f.size());
            for (Integer intValue : this.f6819f.keySet()) {
                int intValue2 = intValue.intValue();
                Long l10 = this.f6819f.get(Integer.valueOf(intValue2));
                if (l10 != null) {
                    arrayList.add((m4) ((p8) m4.O().x(intValue2).y(l10.longValue()).l()));
                }
            }
        }
        if (arrayList != null) {
            E.y(arrayList);
        }
        if (this.f6820g == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(this.f6820g.size());
            for (Integer next : this.f6820g.keySet()) {
                v4.a x9 = v4.P().x(next.intValue());
                List list2 = this.f6820g.get(next);
                if (list2 != null) {
                    Collections.sort(list2);
                    x9.y(list2);
                }
                arrayList2.add((v4) ((p8) x9.l()));
            }
            list = arrayList2;
        }
        E.C(list);
        P.y(E);
        return (l4) ((p8) P.l());
    }

    /* access modifiers changed from: package-private */
    public final void c(d dVar) {
        int a10 = dVar.a();
        Boolean bool = dVar.f5939c;
        if (bool != null) {
            this.f6818e.set(a10, bool.booleanValue());
        }
        Boolean bool2 = dVar.f5940d;
        if (bool2 != null) {
            this.f6817d.set(a10, bool2.booleanValue());
        }
        if (dVar.f5941e != null) {
            Long l10 = this.f6819f.get(Integer.valueOf(a10));
            long longValue = dVar.f5941e.longValue() / 1000;
            if (l10 == null || longValue > l10.longValue()) {
                this.f6819f.put(Integer.valueOf(a10), Long.valueOf(longValue));
            }
        }
        if (dVar.f5942f != null) {
            List list = this.f6820g.get(Integer.valueOf(a10));
            if (list == null) {
                list = new ArrayList();
                this.f6820g.put(Integer.valueOf(a10), list);
            }
            if (dVar.j()) {
                list.clear();
            }
            if (xd.a() && this.f6821h.d().C(this.f6814a, k0.f6194j0) && dVar.i()) {
                list.clear();
            }
            if (!xd.a() || !this.f6821h.d().C(this.f6814a, k0.f6194j0)) {
                list.add(Long.valueOf(dVar.f5942f.longValue() / 1000));
                return;
            }
            long longValue2 = dVar.f5942f.longValue() / 1000;
            if (!list.contains(Long.valueOf(longValue2))) {
                list.add(Long.valueOf(longValue2));
            }
        }
    }
}
