package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

public final class s extends m {

    /* renamed from: o  reason: collision with root package name */
    private final List<String> f5580o;

    /* renamed from: p  reason: collision with root package name */
    private final List<r> f5581p;

    /* renamed from: q  reason: collision with root package name */
    private s6 f5582q;

    private s(s sVar) {
        super(sVar.f5435m);
        ArrayList arrayList = new ArrayList(sVar.f5580o.size());
        this.f5580o = arrayList;
        arrayList.addAll(sVar.f5580o);
        ArrayList arrayList2 = new ArrayList(sVar.f5581p.size());
        this.f5581p = arrayList2;
        arrayList2.addAll(sVar.f5581p);
        this.f5582q = sVar.f5582q;
    }

    public s(String str, List<r> list, List<r> list2, s6 s6Var) {
        super(str);
        this.f5580o = new ArrayList();
        this.f5582q = s6Var;
        if (!list.isEmpty()) {
            for (r f10 : list) {
                this.f5580o.add(f10.f());
            }
        }
        this.f5581p = new ArrayList(list2);
    }

    public final r a(s6 s6Var, List<r> list) {
        r rVar;
        String str;
        s6 d10 = this.f5582q.d();
        for (int i10 = 0; i10 < this.f5580o.size(); i10++) {
            if (i10 < list.size()) {
                str = this.f5580o.get(i10);
                rVar = s6Var.b(list.get(i10));
            } else {
                str = this.f5580o.get(i10);
                rVar = r.f5547d;
            }
            d10.e(str, rVar);
        }
        for (r next : this.f5581p) {
            r b10 = d10.b(next);
            if (b10 instanceof u) {
                b10 = d10.b(next);
            }
            if (b10 instanceof k) {
                return ((k) b10).a();
            }
        }
        return r.f5547d;
    }

    public final r b() {
        return new s(this);
    }
}
