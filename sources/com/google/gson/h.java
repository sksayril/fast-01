package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class h extends k implements Iterable<k> {

    /* renamed from: m  reason: collision with root package name */
    private final List<k> f7528m = new ArrayList();

    public boolean c() {
        if (this.f7528m.size() == 1) {
            return this.f7528m.get(0).c();
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof h) && ((h) obj).f7528m.equals(this.f7528m));
    }

    public int hashCode() {
        return this.f7528m.hashCode();
    }

    public String i() {
        if (this.f7528m.size() == 1) {
            return this.f7528m.get(0).i();
        }
        throw new IllegalStateException();
    }

    public Iterator<k> iterator() {
        return this.f7528m.iterator();
    }

    public void z(k kVar) {
        if (kVar == null) {
            kVar = m.f7529a;
        }
        this.f7528m.add(kVar);
    }
}
