package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class i implements Iterator<r> {

    /* renamed from: m  reason: collision with root package name */
    private int f5333m = 0;

    /* renamed from: n  reason: collision with root package name */
    private final /* synthetic */ g f5334n;

    i(g gVar) {
        this.f5334n = gVar;
    }

    public final boolean hasNext() {
        return this.f5333m < this.f5334n.C();
    }

    public final /* synthetic */ Object next() {
        if (this.f5333m < this.f5334n.C()) {
            g gVar = this.f5334n;
            int i10 = this.f5333m;
            this.f5333m = i10 + 1;
            return gVar.z(i10);
        }
        int i11 = this.f5333m;
        throw new NoSuchElementException("Out of bounds index: " + i11);
    }
}
