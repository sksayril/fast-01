package io.flutter.embedding.engine;

import java.util.HashMap;
import java.util.Map;

public class b {

    /* renamed from: b  reason: collision with root package name */
    private static b f9819b;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, a> f9820a = new HashMap();

    b() {
    }

    public static b b() {
        if (f9819b == null) {
            f9819b = new b();
        }
        return f9819b;
    }

    public a a(String str) {
        return this.f9820a.get(str);
    }

    public void c(String str, a aVar) {
        if (aVar != null) {
            this.f9820a.put(str, aVar);
        } else {
            this.f9820a.remove(str);
        }
    }

    public void d(String str) {
        c(str, (a) null);
    }
}
