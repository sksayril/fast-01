package z2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.a;
import i2.c;

public final class x extends a {
    public static final Parcelable.Creator<x> CREATOR = new t0();

    /* renamed from: m  reason: collision with root package name */
    private final w f13560m;

    /* renamed from: n  reason: collision with root package name */
    private final double f13561n;

    public x(w wVar, double d10) {
        if (d10 > 0.0d) {
            this.f13560m = wVar;
            this.f13561n = d10;
            return;
        }
        throw new IllegalArgumentException("A style must be applied to some segments on a polyline.");
    }

    public double d() {
        return this.f13561n;
    }

    public w f() {
        return this.f13560m;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.s(parcel, 2, f(), i10, false);
        c.h(parcel, 3, d());
        c.b(parcel, a10);
    }
}
