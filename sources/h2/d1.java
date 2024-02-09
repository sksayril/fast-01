package h2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import e2.d;
import i2.a;
import i2.c;

public final class d1 extends a {
    public static final Parcelable.Creator<d1> CREATOR = new e1();

    /* renamed from: m  reason: collision with root package name */
    Bundle f9145m;

    /* renamed from: n  reason: collision with root package name */
    d[] f9146n;

    /* renamed from: o  reason: collision with root package name */
    int f9147o;

    /* renamed from: p  reason: collision with root package name */
    f f9148p;

    public d1() {
    }

    d1(Bundle bundle, d[] dVarArr, int i10, f fVar) {
        this.f9145m = bundle;
        this.f9146n = dVarArr;
        this.f9147o = i10;
        this.f9148p = fVar;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.e(parcel, 1, this.f9145m, false);
        c.v(parcel, 2, this.f9146n, i10, false);
        c.m(parcel, 3, this.f9147o);
        c.s(parcel, 4, this.f9148p, i10, false);
        c.b(parcel, a10);
    }
}
