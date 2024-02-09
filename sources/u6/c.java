package u6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k7.k;

public class c extends a {

    /* renamed from: a  reason: collision with root package name */
    final Map<String, Object> f12523a;

    /* renamed from: b  reason: collision with root package name */
    final a f12524b = new a();

    /* renamed from: c  reason: collision with root package name */
    final boolean f12525c;

    public class a implements f {

        /* renamed from: a  reason: collision with root package name */
        Object f12526a;

        /* renamed from: b  reason: collision with root package name */
        String f12527b;

        /* renamed from: c  reason: collision with root package name */
        String f12528c;

        /* renamed from: d  reason: collision with root package name */
        Object f12529d;

        public a() {
        }

        public void a(Object obj) {
            this.f12526a = obj;
        }

        public void b(String str, String str2, Object obj) {
            this.f12527b = str;
            this.f12528c = str2;
            this.f12529d = obj;
        }
    }

    public c(Map<String, Object> map, boolean z9) {
        this.f12523a = map;
        this.f12525c = z9;
    }

    public <T> T c(String str) {
        return this.f12523a.get(str);
    }

    public boolean e() {
        return this.f12525c;
    }

    public String i() {
        return (String) this.f12523a.get("method");
    }

    public boolean j(String str) {
        return this.f12523a.containsKey(str);
    }

    public f o() {
        return this.f12524b;
    }

    public Map<String, Object> p() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("code", this.f12524b.f12527b);
        hashMap2.put("message", this.f12524b.f12528c);
        hashMap2.put("data", this.f12524b.f12529d);
        hashMap.put("error", hashMap2);
        return hashMap;
    }

    public Map<String, Object> q() {
        HashMap hashMap = new HashMap();
        hashMap.put("result", this.f12524b.f12526a);
        return hashMap;
    }

    public void r(k.d dVar) {
        a aVar = this.f12524b;
        dVar.b(aVar.f12527b, aVar.f12528c, aVar.f12529d);
    }

    public void s(List<Map<String, Object>> list) {
        if (!e()) {
            list.add(p());
        }
    }

    public void t(List<Map<String, Object>> list) {
        if (!e()) {
            list.add(q());
        }
    }
}
