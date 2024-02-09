package io.flutter.plugins.googlemaps;

import com.google.android.gms.maps.model.LatLng;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k7.k;
import x2.c;
import z2.l;
import z2.m;

class s {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, q> f10501a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f10502b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final k f10503c;

    /* renamed from: d  reason: collision with root package name */
    private c f10504d;

    s(k kVar) {
        this.f10503c = kVar;
    }

    private void a(Object obj) {
        if (obj != null) {
            p pVar = new p();
            b(e.g(obj, pVar), pVar.l(), pVar.m());
        }
    }

    private void b(String str, m mVar, boolean z9) {
        l b10 = this.f10504d.b(mVar);
        this.f10501a.put(str, new q(b10, z9));
        this.f10502b.put(b10.a(), str);
    }

    private void d(Object obj) {
        q qVar;
        if (obj != null && (qVar = this.f10501a.get(f(obj))) != null) {
            e.g(obj, qVar);
        }
    }

    private static String f(Object obj) {
        return (String) ((Map) obj).get("markerId");
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
    public void g(String str, k.d dVar) {
        q qVar = this.f10501a.get(str);
        if (qVar != null) {
            qVar.n();
            dVar.a((Object) null);
            return;
        }
        dVar.b("Invalid markerId", "hideInfoWindow called with invalid markerId", (Object) null);
    }

    /* access modifiers changed from: package-private */
    public void h(String str, k.d dVar) {
        q qVar = this.f10501a.get(str);
        if (qVar != null) {
            dVar.a(Boolean.valueOf(qVar.o()));
        } else {
            dVar.b("Invalid markerId", "isInfoWindowShown called with invalid markerId", (Object) null);
        }
    }

    /* access modifiers changed from: package-private */
    public void i(String str) {
        String str2 = this.f10502b.get(str);
        if (str2 != null) {
            this.f10503c.c("infoWindow#onTap", e.n(str2));
        }
    }

    /* access modifiers changed from: package-private */
    public void j(String str, LatLng latLng) {
        String str2 = this.f10502b.get(str);
        if (str2 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("markerId", str2);
            hashMap.put("position", e.l(latLng));
            this.f10503c.c("marker#onDrag", hashMap);
        }
    }

    /* access modifiers changed from: package-private */
    public void k(String str, LatLng latLng) {
        String str2 = this.f10502b.get(str);
        if (str2 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("markerId", str2);
            hashMap.put("position", e.l(latLng));
            this.f10503c.c("marker#onDragEnd", hashMap);
        }
    }

    /* access modifiers changed from: package-private */
    public void l(String str, LatLng latLng) {
        String str2 = this.f10502b.get(str);
        if (str2 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("markerId", str2);
            hashMap.put("position", e.l(latLng));
            this.f10503c.c("marker#onDragStart", hashMap);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean m(String str) {
        String str2 = this.f10502b.get(str);
        if (str2 == null) {
            return false;
        }
        this.f10503c.c("marker#onTap", e.n(str2));
        q qVar = this.f10501a.get(str2);
        if (qVar != null) {
            return qVar.l();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void n(List<Object> list) {
        q remove;
        if (list != null) {
            for (Object next : list) {
                if (!(next == null || (remove = this.f10501a.remove((String) next)) == null)) {
                    remove.p();
                    this.f10502b.remove(remove.m());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void o(c cVar) {
        this.f10504d = cVar;
    }

    /* access modifiers changed from: package-private */
    public void p(String str, k.d dVar) {
        q qVar = this.f10501a.get(str);
        if (qVar != null) {
            qVar.q();
            dVar.a((Object) null);
            return;
        }
        dVar.b("Invalid markerId", "showInfoWindow called with invalid markerId", (Object) null);
    }
}
