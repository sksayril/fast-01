package n9;

import java.util.HashMap;
import java.util.Map;
import k7.d;
import kotlin.jvm.internal.l;

public final class p implements d.C0170d {

    /* renamed from: m  reason: collision with root package name */
    private final d f11455m;

    /* renamed from: n  reason: collision with root package name */
    private d.b f11456n;

    public p(d dVar) {
        l.e(dVar, "eventChannel");
        this.f11455m = dVar;
        dVar.d(this);
    }

    public static /* synthetic */ void f(p pVar, String str, Map map, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = new HashMap();
        }
        pVar.e(str, map);
    }

    public void a(Object obj, d.b bVar) {
        this.f11456n = bVar;
    }

    public void b(Object obj) {
        this.f11456n = null;
    }

    public final void c() {
        d.b bVar = this.f11456n;
        if (bVar != null) {
            bVar.c();
            b((Object) null);
        }
        this.f11455m.d((d.C0170d) null);
    }

    public final void d(String str, String str2, Object obj) {
        d.b bVar = this.f11456n;
        if (bVar != null) {
            bVar.b(str, str2, obj);
        }
    }

    public final void e(String str, Map<String, ? extends Object> map) {
        l.e(str, "method");
        l.e(map, "arguments");
        d.b bVar = this.f11456n;
        if (bVar != null) {
            bVar.a(f0.h(map, new g8.l("event", str)));
        }
    }
}
