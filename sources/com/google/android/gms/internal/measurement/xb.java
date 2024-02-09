package com.google.android.gms.internal.measurement;

import java.util.Iterator;

final class xb implements Iterator<String> {

    /* renamed from: m  reason: collision with root package name */
    private Iterator<String> f5699m;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ vb f5700n;

    xb(vb vbVar) {
        this.f5700n = vbVar;
        this.f5699m = vbVar.f5668m.iterator();
    }

    public final boolean hasNext() {
        return this.f5699m.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.f5699m.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
