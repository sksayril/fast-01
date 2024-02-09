package io.flutter.embedding.engine.systemchannels;

import java.util.HashMap;
import java.util.Map;
import k7.c;
import k7.j;
import k7.k;
import k7.s;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public final k f9876a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public b f9877b;

    /* renamed from: c  reason: collision with root package name */
    public final k.c f9878c;

    class a implements k.c {

        /* renamed from: m  reason: collision with root package name */
        Map<Long, Long> f9879m = new HashMap();

        a() {
        }

        public void onMethodCall(j jVar, k.d dVar) {
            if (e.this.f9877b != null) {
                String str = jVar.f10996a;
                str.hashCode();
                if (!str.equals("getKeyboardState")) {
                    dVar.c();
                    return;
                }
                try {
                    this.f9879m = e.this.f9877b.a();
                } catch (IllegalStateException e10) {
                    dVar.b("error", e10.getMessage(), (Object) null);
                }
            }
            dVar.a(this.f9879m);
        }
    }

    public interface b {
        Map<Long, Long> a();
    }

    public e(c cVar) {
        a aVar = new a();
        this.f9878c = aVar;
        k kVar = new k(cVar, "flutter/keyboard", s.f11011b);
        this.f9876a = kVar;
        kVar.e(aVar);
    }

    public void b(b bVar) {
        this.f9877b = bVar;
    }
}
