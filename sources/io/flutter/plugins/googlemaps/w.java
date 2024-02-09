package io.flutter.plugins.googlemaps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k7.k;
import x2.c;
import z2.o;
import z2.p;

class w {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, u> f10512a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f10513b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final k f10514c;

    /* renamed from: d  reason: collision with root package name */
    private final float f10515d;

    /* renamed from: e  reason: collision with root package name */
    private c f10516e;

    w(k kVar, float f10) {
        this.f10514c = kVar;
        this.f10515d = f10;
    }

    private void a(Object obj) {
        if (obj != null) {
            t tVar = new t(this.f10515d);
            b(e.h(obj, tVar), tVar.i(), tVar.j());
        }
    }

    private void b(String str, p pVar, boolean z9) {
        o c10 = this.f10516e.c(pVar);
        this.f10512a.put(str, new u(c10, z9, this.f10515d));
        this.f10513b.put(c10.a(), str);
    }

    private void d(Object obj) {
        u uVar;
        if (obj != null && (uVar = this.f10512a.get(f(obj))) != null) {
            e.h(obj, uVar);
        }
    }

    private static String f(Object obj) {
        return (String) ((Map) obj).get("polygonId");
    }

    /* access modifiers changed from: package-private */
    public void c(List<Object> list) {
        if (list != null) {
            for (Object a10 : list) {
                a(a10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(List<Object> list) {
        if (list != null) {
            for (Object d10 : list) {
                d(d10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean g(String str) {
        String str2 = this.f10513b.get(str);
        if (str2 == null) {
            return false;
        }
        this.f10514c.c("polygon#onTap", e.p(str2));
        u uVar = this.f10512a.get(str2);
        if (uVar != null) {
            return uVar.i();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void h(List<Object> list) {
        u remove;
        if (list != null) {
            for (Object next : list) {
                if (!(next == null || (remove = this.f10512a.remove((String) next)) == null)) {
                    remove.k();
                    this.f10513b.remove(remove.j());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void i(c cVar) {
        this.f10516e = cVar;
    }
}
