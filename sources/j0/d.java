package j0;

import j0.a;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

public final class d extends a {
    public d() {
        this((a) null, 1, (g) null);
    }

    public d(a aVar) {
        l.e(aVar, "initialExtras");
        a().putAll(aVar.a());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(a aVar, int i10, g gVar) {
        this((i10 & 1) != 0 ? a.C0161a.f10788b : aVar);
    }

    public final <T> void b(a.b<T> bVar, T t9) {
        l.e(bVar, "key");
        a().put(bVar, t9);
    }
}
