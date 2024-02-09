package c3;

import android.os.Parcel;
import android.os.Parcelable;
import h2.k0;
import i2.a;
import i2.c;

public final class j extends a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: m  reason: collision with root package name */
    final int f3565m;

    /* renamed from: n  reason: collision with root package name */
    final k0 f3566n;

    j(int i10, k0 k0Var) {
        this.f3565m = i10;
        this.f3566n = k0Var;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.m(parcel, 1, this.f3565m);
        c.s(parcel, 2, this.f3566n, i10, false);
        c.b(parcel, a10);
    }
}
