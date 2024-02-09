package io.flutter.embedding.engine.systemchannels;

import java.util.ArrayList;
import k7.j;
import k7.k;
import k7.s;

public class o {

    /* renamed from: a  reason: collision with root package name */
    public final k f9961a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public b f9962b;

    /* renamed from: c  reason: collision with root package name */
    public final k.c f9963c;

    class a implements k.c {
        a() {
        }

        public void onMethodCall(j jVar, k.d dVar) {
            if (o.this.f9962b == null) {
                x6.b.f("SpellCheckChannel", "No SpellCheckeMethodHandler registered, call not forwarded to spell check API.");
                return;
            }
            String str = jVar.f10996a;
            Object obj = jVar.f10997b;
            x6.b.f("SpellCheckChannel", "Received '" + str + "' message.");
            str.hashCode();
            if (!str.equals("SpellCheck.initiateSpellCheck")) {
                dVar.c();
                return;
            }
            try {
                ArrayList arrayList = (ArrayList) obj;
                o.this.f9962b.a((String) arrayList.get(0), (String) arrayList.get(1), dVar);
            } catch (IllegalStateException e10) {
                dVar.b("error", e10.getMessage(), (Object) null);
            }
        }
    }

    public interface b {
        void a(String str, String str2, k.d dVar);
    }

    public o(y6.a aVar) {
        a aVar2 = new a();
        this.f9963c = aVar2;
        k kVar = new k(aVar, "flutter/spellcheck", s.f11011b);
        this.f9961a = kVar;
        kVar.e(aVar2);
    }

    public void b(b bVar) {
        this.f9962b = bVar;
    }
}
