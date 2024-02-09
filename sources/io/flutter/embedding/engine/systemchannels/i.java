package io.flutter.embedding.engine.systemchannels;

import java.util.HashMap;
import k7.g;
import k7.j;
import k7.k;
import x6.b;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public final k f9894a;

    /* renamed from: b  reason: collision with root package name */
    private final k.c f9895b;

    class a implements k.c {
        a() {
        }

        public void onMethodCall(j jVar, k.d dVar) {
            dVar.a((Object) null);
        }
    }

    public i(y6.a aVar) {
        a aVar2 = new a();
        this.f9895b = aVar2;
        k kVar = new k(aVar, "flutter/navigation", g.f10995a);
        this.f9894a = kVar;
        kVar.e(aVar2);
    }

    public void a() {
        b.f("NavigationChannel", "Sending message to pop route.");
        this.f9894a.c("popRoute", (Object) null);
    }

    public void b(String str) {
        b.f("NavigationChannel", "Sending message to push route information '" + str + "'");
        HashMap hashMap = new HashMap();
        hashMap.put("location", str);
        this.f9894a.c("pushRouteInformation", hashMap);
    }

    public void c(String str) {
        b.f("NavigationChannel", "Sending message to set initial route to '" + str + "'");
        this.f9894a.c("setInitialRoute", str);
    }
}
