package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, z> f5181a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private s0 f5182b = new s0();

    public d0() {
        b(new x());
        b(new c0());
        b(new e0());
        b(new i0());
        b(new k0());
        b(new q0());
        b(new v0());
    }

    private final void b(z zVar) {
        for (x0 x0Var : zVar.f5734a) {
            this.f5181a.put(x0Var.toString(), zVar);
        }
    }

    public final r a(s6 s6Var, r rVar) {
        r5.b(s6Var);
        if (!(rVar instanceof u)) {
            return rVar;
        }
        u uVar = (u) rVar;
        ArrayList<r> e10 = uVar.e();
        String a10 = uVar.a();
        return (this.f5181a.containsKey(a10) ? this.f5181a.get(a10) : this.f5182b).b(a10, s6Var, e10);
    }
}
