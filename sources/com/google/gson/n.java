package com.google.gson;

import h5.h;
import java.util.Map;
import java.util.Set;

public final class n extends k {

    /* renamed from: a  reason: collision with root package name */
    private final h<String, k> f7530a = new h<>();

    public Set<Map.Entry<String, k>> A() {
        return this.f7530a.entrySet();
    }

    public boolean B(String str) {
        return this.f7530a.containsKey(str);
    }

    public k C(String str) {
        return this.f7530a.remove(str);
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof n) && ((n) obj).f7530a.equals(this.f7530a));
    }

    public int hashCode() {
        return this.f7530a.hashCode();
    }

    public void z(String str, k kVar) {
        h<String, k> hVar = this.f7530a;
        if (kVar == null) {
            kVar = m.f7529a;
        }
        hVar.put(str, kVar);
    }
}
