package com.google.android.gms.internal.measurement;

import com.google.common.collect.q;
import java.util.HashMap;
import java.util.Map;

public final class e {

    /* renamed from: d  reason: collision with root package name */
    private static final q<String> f5198d = q.E("_syn", "_err", "_el");

    /* renamed from: a  reason: collision with root package name */
    private String f5199a;

    /* renamed from: b  reason: collision with root package name */
    private long f5200b;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, Object> f5201c;

    public e(String str, long j10, Map<String, Object> map) {
        this.f5199a = str;
        this.f5200b = j10;
        HashMap hashMap = new HashMap();
        this.f5201c = hashMap;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    public static Object c(String str, Object obj, Object obj2) {
        if (!f5198d.contains(str) || !(obj2 instanceof Double)) {
            if (str.startsWith("_")) {
                return (!(obj instanceof String) && obj != null) ? obj : obj2;
            }
            if (obj instanceof Double) {
                return obj2;
            }
            if (!(obj instanceof Long)) {
                return obj instanceof String ? obj2.toString() : obj2;
            }
        }
        return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
    }

    public final long a() {
        return this.f5200b;
    }

    public final Object b(String str) {
        if (this.f5201c.containsKey(str)) {
            return this.f5201c.get(str);
        }
        return null;
    }

    public final /* synthetic */ Object clone() {
        return new e(this.f5199a, this.f5200b, new HashMap(this.f5201c));
    }

    public final void d(String str, Object obj) {
        if (obj == null) {
            this.f5201c.remove(str);
            return;
        }
        this.f5201c.put(str, c(str, this.f5201c.get(str), obj));
    }

    public final String e() {
        return this.f5199a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f5200b == eVar.f5200b && this.f5199a.equals(eVar.f5199a)) {
            return this.f5201c.equals(eVar.f5201c);
        }
        return false;
    }

    public final void f(String str) {
        this.f5199a = str;
    }

    public final Map<String, Object> g() {
        return this.f5201c;
    }

    public final int hashCode() {
        long j10 = this.f5200b;
        return (((this.f5199a.hashCode() * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f5201c.hashCode();
    }

    public final String toString() {
        String str = this.f5199a;
        long j10 = this.f5200b;
        String valueOf = String.valueOf(this.f5201c);
        return "Event{name='" + str + "', timestamp=" + j10 + ", params=" + valueOf + "}";
    }
}
