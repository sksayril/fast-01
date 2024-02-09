package io.flutter.plugins.googlemaps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k7.k;
import x2.c;

class e0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, c0> f10457a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final k f10458b;

    /* renamed from: c  reason: collision with root package name */
    private c f10459c;

    e0(k kVar) {
        this.f10458b = kVar;
    }

    private void a(Map<String, ?> map) {
        if (map != null) {
            b0 b0Var = new b0();
            String k10 = e.k(map, b0Var);
            b0Var.e(new g0(this.f10458b, k10));
            this.f10457a.put(k10, new c0(this.f10459c.e(b0Var.d())));
        }
    }

    private void c(Map<String, ?> map) {
        c0 c0Var;
        if (map != null && (c0Var = this.f10457a.get(f(map))) != null) {
            e.k(map, c0Var);
        }
    }

    private static String f(Map<String, ?> map) {
        return (String) map.get("tileOverlayId");
    }

    private void h(String str) {
        c0 c0Var = this.f10457a.get(str);
        if (c0Var != null) {
            c0Var.f();
            this.f10457a.remove(str);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(List<Map<String, ?>> list) {
        if (list != null) {
            for (Map<String, ?> a10 : list) {
                a(a10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d(List<Map<String, ?>> list) {
        if (list != null) {
            for (Map<String, ?> c10 : list) {
                c(c10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(String str) {
        c0 c0Var;
        if (str != null && (c0Var = this.f10457a.get(str)) != null) {
            c0Var.d();
        }
    }

    /* access modifiers changed from: package-private */
    public Map<String, Object> g(String str) {
        c0 c0Var;
        if (str == null || (c0Var = this.f10457a.get(str)) == null) {
            return null;
        }
        return c0Var.e();
    }

    /* access modifiers changed from: package-private */
    public void i(List<String> list) {
        if (list != null) {
            for (String next : list) {
                if (next != null) {
                    h(next);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void j(c cVar) {
        this.f10459c = cVar;
    }
}
