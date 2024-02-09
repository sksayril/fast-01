package io.flutter.embedding.engine.systemchannels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k7.j;
import k7.k;
import k7.s;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final k f9867a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public z6.a f9868b = x6.a.e().a();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Map<String, List<k.d>> f9869c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    final k.c f9870d;

    class a implements k.c {
        a() {
        }

        public void onMethodCall(j jVar, k.d dVar) {
            String str;
            if (b.this.f9868b != null) {
                String str2 = jVar.f10996a;
                Map map = (Map) jVar.b();
                x6.b.f("DeferredComponentChannel", "Received '" + str2 + "' message.");
                int intValue = ((Integer) map.get("loadingUnitId")).intValue();
                String str3 = (String) map.get("componentName");
                str2.hashCode();
                char c10 = 65535;
                switch (str2.hashCode()) {
                    case -1004447972:
                        if (str2.equals("uninstallDeferredComponent")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case 399701758:
                        if (str2.equals("getDeferredComponentInstallState")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 520962947:
                        if (str2.equals("installDeferredComponent")) {
                            c10 = 2;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        b.this.f9868b.b(intValue, str3);
                        str = null;
                        break;
                    case 1:
                        str = b.this.f9868b.a(intValue, str3);
                        break;
                    case 2:
                        b.this.f9868b.e(intValue, str3);
                        if (!b.this.f9869c.containsKey(str3)) {
                            b.this.f9869c.put(str3, new ArrayList());
                        }
                        ((List) b.this.f9869c.get(str3)).add(dVar);
                        return;
                    default:
                        dVar.c();
                        return;
                }
                dVar.a(str);
            }
        }
    }

    public b(y6.a aVar) {
        a aVar2 = new a();
        this.f9870d = aVar2;
        k kVar = new k(aVar, "flutter/deferredcomponent", s.f11011b);
        this.f9867a = kVar;
        kVar.e(aVar2);
    }

    public void c(z6.a aVar) {
        this.f9868b = aVar;
    }
}
