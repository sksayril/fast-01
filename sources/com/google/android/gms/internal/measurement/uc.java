package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

public final class uc extends q {

    /* renamed from: n  reason: collision with root package name */
    private final d f5651n;

    public uc(d dVar) {
        this.f5651n = dVar;
    }

    public final r l(String str, s6 s6Var, List<r> list) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c10 = 0;
                    break;
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    c10 = 1;
                    break;
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    c10 = 2;
                    break;
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    c10 = 3;
                    break;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                r5.g("getEventName", 0, list);
                return new t(this.f5651n.d().e());
            case 1:
                r5.g("getTimestamp", 0, list);
                return new j(Double.valueOf((double) this.f5651n.d().a()));
            case 2:
                r5.g("getParamValue", 1, list);
                return s8.b(this.f5651n.d().b(s6Var.b(list.get(0)).f()));
            case 3:
                r5.g("getParams", 0, list);
                Map<String, Object> g10 = this.f5651n.d().g();
                q qVar = new q();
                for (String next : g10.keySet()) {
                    qVar.o(next, s8.b(g10.get(next)));
                }
                return qVar;
            case 4:
                r5.g("setParamValue", 2, list);
                String f10 = s6Var.b(list.get(0)).f();
                r b10 = s6Var.b(list.get(1));
                this.f5651n.d().d(f10, r5.d(b10));
                return b10;
            case 5:
                r5.g("setEventName", 1, list);
                r b11 = s6Var.b(list.get(0));
                if (r.f5547d.equals(b11) || r.f5548e.equals(b11)) {
                    throw new IllegalArgumentException("Illegal event name");
                }
                this.f5651n.d().f(b11.f());
                return new t(b11.f());
            default:
                return super.l(str, s6Var, list);
        }
    }
}
