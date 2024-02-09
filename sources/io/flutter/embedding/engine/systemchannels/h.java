package io.flutter.embedding.engine.systemchannels;

import java.util.HashMap;
import k7.j;
import k7.k;
import k7.s;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public final k f9890a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public b f9891b;

    /* renamed from: c  reason: collision with root package name */
    private final k.c f9892c;

    class a implements k.c {
        a() {
        }

        public void onMethodCall(j jVar, k.d dVar) {
            if (h.this.f9891b != null) {
                String str = jVar.f10996a;
                x6.b.f("MouseCursorChannel", "Received '" + str + "' message.");
                char c10 = 65535;
                try {
                    if (str.hashCode() == -1307105544) {
                        if (str.equals("activateSystemCursor")) {
                            c10 = 0;
                        }
                    }
                    if (c10 == 0) {
                        try {
                            h.this.f9891b.a((String) ((HashMap) jVar.f10997b).get("kind"));
                            dVar.a(Boolean.TRUE);
                        } catch (Exception e10) {
                            dVar.b("error", "Error when setting cursors: " + e10.getMessage(), (Object) null);
                        }
                    }
                } catch (Exception e11) {
                    dVar.b("error", "Unhandled error: " + e11.getMessage(), (Object) null);
                }
            }
        }
    }

    public interface b {
        void a(String str);
    }

    public h(y6.a aVar) {
        a aVar2 = new a();
        this.f9892c = aVar2;
        k kVar = new k(aVar, "flutter/mousecursor", s.f11011b);
        this.f9890a = kVar;
        kVar.e(aVar2);
    }

    public void b(b bVar) {
        this.f9891b = bVar;
    }
}
