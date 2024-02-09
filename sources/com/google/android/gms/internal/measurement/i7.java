package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

final class i7 extends k7 {

    /* renamed from: m  reason: collision with root package name */
    private int f5353m = 0;

    /* renamed from: n  reason: collision with root package name */
    private final int f5354n;

    /* renamed from: o  reason: collision with root package name */
    private final /* synthetic */ f7 f5355o;

    i7(f7 f7Var) {
        this.f5355o = f7Var;
        this.f5354n = f7Var.A();
    }

    public final boolean hasNext() {
        return this.f5353m < this.f5354n;
    }

    public final byte zza() {
        int i10 = this.f5353m;
        if (i10 < this.f5354n) {
            this.f5353m = i10 + 1;
            return this.f5355o.z(i10);
        }
        throw new NoSuchElementException();
    }
}
