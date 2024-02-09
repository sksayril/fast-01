package com.google.android.gms.internal.measurement;

import java.util.Iterator;

final class n implements Iterator<r> {

    /* renamed from: m  reason: collision with root package name */
    private final /* synthetic */ Iterator f5457m;

    n(Iterator it) {
        this.f5457m = it;
    }

    public final boolean hasNext() {
        return this.f5457m.hasNext();
    }

    public final /* synthetic */ Object next() {
        return new t((String) this.f5457m.next());
    }
}
