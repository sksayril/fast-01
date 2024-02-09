package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class f implements Iterator<r> {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ Iterator f5217m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ Iterator f5218n;

    f(g gVar, Iterator it, Iterator it2) {
        this.f5217m = it;
        this.f5218n = it2;
    }

    public final boolean hasNext() {
        if (this.f5217m.hasNext()) {
            return true;
        }
        return this.f5218n.hasNext();
    }

    public final /* synthetic */ Object next() {
        if (this.f5217m.hasNext()) {
            return new t(((Integer) this.f5217m.next()).toString());
        }
        if (this.f5218n.hasNext()) {
            return new t((String) this.f5218n.next());
        }
        throw new NoSuchElementException();
    }
}
