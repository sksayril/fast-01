package u6;

import java.util.HashMap;
import java.util.Map;
import s6.d0;

public class h {
    public static Map<String, Object> a(e eVar) {
        d0 d10 = eVar.d();
        if (d10 == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sql", d10.c());
        hashMap.put("arguments", d10.b());
        return hashMap;
    }
}
