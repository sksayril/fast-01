package h2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import e2.b;
import h2.j;
import i2.a;
import i2.c;

public final class m0 extends a {
    public static final Parcelable.Creator<m0> CREATOR = new n0();

    /* renamed from: m  reason: collision with root package name */
    final int f9220m;

    /* renamed from: n  reason: collision with root package name */
    final IBinder f9221n;

    /* renamed from: o  reason: collision with root package name */
    private final b f9222o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f9223p;

    /* renamed from: q  reason: collision with root package name */
    private final boolean f9224q;

    m0(int i10, IBinder iBinder, b bVar, boolean z9, boolean z10) {
        this.f9220m = i10;
        this.f9221n = iBinder;
        this.f9222o = bVar;
        this.f9223p = z9;
        this.f9224q = z10;
    }

    public final b d() {
        return this.f9222o;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f9222o.equals(m0Var.f9222o) && o.a(f(), m0Var.f());
    }

    public final j f() {
        IBinder iBinder = this.f9221n;
        if (iBinder == null) {
            return null;
        }
        return j.a.J(iBinder);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.m(parcel, 1, this.f9220m);
        c.l(parcel, 2, this.f9221n, false);
        c.s(parcel, 3, this.f9222o, i10, false);
        c.c(parcel, 4, this.f9223p);
        c.c(parcel, 5, this.f9224q);
        c.b(parcel, a10);
    }
}
