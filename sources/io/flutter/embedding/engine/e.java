package io.flutter.embedding.engine;

import java.util.HashMap;
import java.util.Map;

public class e {

    /* renamed from: b  reason: collision with root package name */
    private static volatile e f9853b;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, d> f9854a = new HashMap();

    e() {
    }

    public static e b() {
        if (f9853b == null) {
            synchronized (e.class) {
                if (f9853b == null) {
                    f9853b = new e();
                }
            }
        }
        return f9853b;
    }

    public d a(String str) {
        return this.f9854a.get(str);
    }
}
