package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class w implements Iterator<r> {

    /* renamed from: m  reason: collision with root package name */
    private int f5674m = 0;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ t f5675n;

    w(t tVar) {
        this.f5675n = tVar;
    }

    public final boolean hasNext() {
        return this.f5674m < this.f5675n.f5612m.length();
    }

    public final /* synthetic */ Object next() {
        if (this.f5674m < this.f5675n.f5612m.length()) {
            int i10 = this.f5674m;
            this.f5674m = i10 + 1;
            return new t(String.valueOf(i10));
        }
        throw new NoSuchElementException();
    }
}
