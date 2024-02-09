package com.google.android.gms.internal.measurement;

import java.util.List;

public final class mg extends m {
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final qg f5456o;

    public mg(qg qgVar) {
        super("internal.logger");
        this.f5456o = qgVar;
        this.f5436n.put("log", new pg(this, false, true));
        this.f5436n.put("silent", new xf(this, "silent"));
        ((m) this.f5436n.get("silent")).o("log", new pg(this, true, true));
        this.f5436n.put("unmonitored", new og(this, "unmonitored"));
        ((m) this.f5436n.get("unmonitored")).o("log", new pg(this, false, false));
    }

    public final r a(s6 s6Var, List<r> list) {
        return r.f5547d;
    }
}
