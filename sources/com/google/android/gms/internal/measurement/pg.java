package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class pg extends m {

    /* renamed from: o  reason: collision with root package name */
    private boolean f5526o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f5527p;

    /* renamed from: q  reason: collision with root package name */
    private final /* synthetic */ mg f5528q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pg(mg mgVar, boolean z9, boolean z10) {
        super("log");
        this.f5528q = mgVar;
        this.f5526o = z9;
        this.f5527p = z10;
    }

    public final r a(s6 s6Var, List<r> list) {
        List arrayList;
        qg h10;
        r5.k("log", 1, list);
        if (list.size() == 1) {
            this.f5528q.f5456o.a(ng.INFO, s6Var.b(list.get(0)).f(), Collections.emptyList(), this.f5526o, this.f5527p);
        } else {
            ng zza = ng.zza(r5.i(s6Var.b(list.get(0)).d().doubleValue()));
            String f10 = s6Var.b(list.get(1)).f();
            if (list.size() == 2) {
                h10 = this.f5528q.f5456o;
                arrayList = Collections.emptyList();
            } else {
                arrayList = new ArrayList();
                for (int i10 = 2; i10 < Math.min(list.size(), 5); i10++) {
                    arrayList.add(s6Var.b(list.get(i10)).f());
                }
                h10 = this.f5528q.f5456o;
            }
            h10.a(zza, f10, arrayList, this.f5526o, this.f5527p);
        }
        return r.f5547d;
    }
}
