package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class qa {

    /* renamed from: c  reason: collision with root package name */
    private static final qa f5538c = new qa();

    /* renamed from: a  reason: collision with root package name */
    private final xa f5539a = new q9();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap<Class<?>, va<?>> f5540b = new ConcurrentHashMap();

    private qa() {
    }

    public static qa a() {
        return f5538c;
    }

    public final <T> va<T> b(Class<T> cls) {
        r8.f(cls, "messageType");
        va<T> vaVar = (va) this.f5540b.get(cls);
        if (vaVar != null) {
            return vaVar;
        }
        va<T> a10 = this.f5539a.a(cls);
        r8.f(cls, "messageType");
        r8.f(a10, "schema");
        va<T> putIfAbsent = this.f5540b.putIfAbsent(cls, a10);
        return putIfAbsent != null ? putIfAbsent : a10;
    }

    public final <T> va<T> c(T t9) {
        return b(t9.getClass());
    }
}
