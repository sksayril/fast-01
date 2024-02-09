package e8;

import android.content.Context;
import c7.a;
import k7.c;
import k7.k;
import kotlin.jvm.internal.l;

public final class a implements c7.a {

    /* renamed from: m  reason: collision with root package name */
    private k f8525m;

    private final void a(c cVar, Context context) {
        this.f8525m = new k(cVar, "PonnamKarthik/fluttertoast");
        c cVar2 = new c(context);
        k kVar = this.f8525m;
        if (kVar != null) {
            kVar.e(cVar2);
        }
    }

    private final void b() {
        k kVar = this.f8525m;
        if (kVar != null) {
            kVar.e((k.c) null);
        }
        this.f8525m = null;
    }

    public void onAttachedToEngine(a.b bVar) {
        l.e(bVar, "binding");
        c b10 = bVar.b();
        l.d(b10, "getBinaryMessenger(...)");
        Context a10 = bVar.a();
        l.d(a10, "getApplicationContext(...)");
        a(b10, a10);
    }

    public void onDetachedFromEngine(a.b bVar) {
        l.e(bVar, "p0");
        b();
    }
}
