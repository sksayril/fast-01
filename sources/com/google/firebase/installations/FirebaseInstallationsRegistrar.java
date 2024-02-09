package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import r4.h;
import r4.i;
import t3.f;
import t4.d;
import v3.a;
import v3.b;
import w3.c;
import w3.e;
import w3.f0;
import w3.r;

@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* access modifiers changed from: private */
    public static /* synthetic */ d lambda$getComponents$0(e eVar) {
        return new b((f) eVar.a(f.class), eVar.e(i.class), (ExecutorService) eVar.g(f0.a(a.class, ExecutorService.class)), x3.i.a((Executor) eVar.g(f0.a(b.class, Executor.class))));
    }

    public List<c<?>> getComponents() {
        return Arrays.asList(new c[]{c.c(d.class).g(LIBRARY_NAME).b(r.i(f.class)).b(r.h(i.class)).b(r.j(f0.a(a.class, ExecutorService.class))).b(r.j(f0.a(b.class, Executor.class))).e(t4.e.f12444a).c(), h.a(), z4.h.b(LIBRARY_NAME, "17.2.0")});
    }
}
