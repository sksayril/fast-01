package com.google.firebase.crashlytics;

import com.google.firebase.components.ComponentRegistrar;
import d5.a;
import d5.b;
import java.util.Arrays;
import java.util.List;
import t3.f;
import t4.d;
import w3.c;
import w3.e;
import w3.r;
import z4.h;

public class CrashlyticsRegistrar implements ComponentRegistrar {
    static {
        a.f8184a.a(b.a.CRASHLYTICS);
    }

    /* access modifiers changed from: private */
    public a b(e eVar) {
        return a.e((f) eVar.a(f.class), (d) eVar.a(d.class), eVar.i(z3.a.class), eVar.i(u3.a.class), eVar.i(a5.a.class));
    }

    public List<c<?>> getComponents() {
        return Arrays.asList(new c[]{c.c(a.class).g("fire-cls").b(r.i(f.class)).b(r.i(d.class)).b(r.a(z3.a.class)).b(r.a(u3.a.class)).b(r.a(a5.a.class)).e(new y3.f(this)).d().c(), h.b("fire-cls", "18.6.0")});
    }
}
