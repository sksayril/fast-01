package io.flutter.plugins.googlemaps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k7.k;
import x2.c;
import z2.e;
import z2.f;

class d {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, b> f10452a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f10453b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final k f10454c;

    /* renamed from: d  reason: collision with root package name */
    private final float f10455d;

    /* renamed from: e  reason: collision with root package name */
    private c f10456e;

    d(k kVar, float f10) {
        this.f10454c = kVar;
        this.f10455d = f10;
    }

    private void a(Object obj) {
        if (obj != null) {
            a aVar = new a(this.f10455d);
            b(e.d(obj, aVar), aVar.d(), aVar.i());
        }
    }

    private void b(String str, f fVar, boolean z9) {
        e a10 = this.f10456e.a(fVar);
        this.f10452a.put(str, new b(a10, z9, this.f10455d));
        this.f10453b.put(a10.a(), str);
    }

    private void d(Object obj) {
        b bVar;
        if (obj != null && (bVar = this.f10452a.get(f(obj))) != null) {
            e.d(obj, bVar);
        }
    }

    private static String f(Object obj) {
        return (String) ((Map) obj).get("circleId");
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
        String str2 = this.f10453b.get(str);
        if (str2 == null) {
            return false;
        }
        this.f10454c.c("circle#onTap", e.b(str2));
        b bVar = this.f10452a.get(str2);
        if (bVar != null) {
            return bVar.d();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void h(List<Object> list) {
        b remove;
        if (list != null) {
            for (Object next : list) {
                if (!(next == null || (remove = this.f10452a.remove((String) next)) == null)) {
                    remove.j();
                    this.f10453b.remove(remove.i());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void i(c cVar) {
        this.f10456e = cVar;
    }
}
