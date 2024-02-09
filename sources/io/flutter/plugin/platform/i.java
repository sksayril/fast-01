package io.flutter.plugin.platform;

import java.util.HashMap;
import java.util.Map;

class i implements h {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, g> f10089a = new HashMap();

    i() {
    }

    public boolean a(String str, g gVar) {
        if (this.f10089a.containsKey(str)) {
            return false;
        }
        this.f10089a.put(str, gVar);
        return true;
    }

    /* access modifiers changed from: package-private */
    public g b(String str) {
        return this.f10089a.get(str);
    }
}
