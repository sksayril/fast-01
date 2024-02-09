package io.flutter.embedding.engine.systemchannels;

import java.util.HashMap;
import k7.a;
import k7.f;
import x6.b;

public class p {

    /* renamed from: a  reason: collision with root package name */
    public final a<Object> f9965a;

    public p(y6.a aVar) {
        this.f9965a = new a<>(aVar, "flutter/system", f.f10994a);
    }

    public void a() {
        b.f("SystemChannel", "Sending memory pressure warning to Flutter.");
        HashMap hashMap = new HashMap(1);
        hashMap.put("type", "memoryPressure");
        this.f9965a.c(hashMap);
    }
}
