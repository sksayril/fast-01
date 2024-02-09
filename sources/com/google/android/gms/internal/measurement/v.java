package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class v implements Iterator<r> {

    /* renamed from: m  reason: collision with root package name */
    private int f5656m = 0;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ t f5657n;

    v(t tVar) {
        this.f5657n = tVar;
    }

    public final boolean hasNext() {
        return this.f5656m < this.f5657n.f5612m.length();
    }

    public final /* synthetic */ Object next() {
        if (this.f5656m < this.f5657n.f5612m.length()) {
            String i10 = this.f5657n.f5612m;
            int i11 = this.f5656m;
            this.f5656m = i11 + 1;
            return new t(String.valueOf(i10.charAt(i11)));
        }
        throw new NoSuchElementException();
    }
}
