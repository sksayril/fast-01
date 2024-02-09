package io.flutter.plugins.googlemaps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k7.k;
import x2.c;
import z2.q;
import z2.r;

class a0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, y> f10441a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f10442b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final k f10443c;

    /* renamed from: d  reason: collision with root package name */
    private c f10444d;

    /* renamed from: e  reason: collision with root package name */
    private final float f10445e;

    a0(k kVar, float f10) {
        this.f10443c = kVar;
        this.f10445e = f10;
    }

    private void a(Object obj) {
        if (obj != null) {
            x xVar = new x(this.f10445e);
            b(e.i(obj, xVar), xVar.k(), xVar.l());
        }
    }

    private void b(String str, r rVar, boolean z9) {
        q d10 = this.f10444d.d(rVar);
        this.f10441a.put(str, new y(d10, z9, this.f10445e));
        this.f10442b.put(d10.a(), str);
    }

    private void d(Object obj) {
        y yVar;
        if (obj != null && (yVar = this.f10441a.get(f(obj))) != null) {
            e.i(obj, yVar);
        }
    }

    private static String f(Object obj) {
        return (String) ((Map) obj).get("polylineId");
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
        String str2 = this.f10442b.get(str);
        if (str2 == null) {
            return false;
        }
        this.f10443c.c("polyline#onTap", e.q(str2));
        y yVar = this.f10441a.get(str2);
        if (yVar != null) {
            return yVar.k();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void h(List<Object> list) {
        y remove;
        if (list != null) {
            for (Object next : list) {
                if (!(next == null || (remove = this.f10441a.remove((String) next)) == null)) {
                    remove.m();
                    this.f10442b.remove(remove.l());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void i(c cVar) {
        this.f10444d = cVar;
    }
}
