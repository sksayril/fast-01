package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i2.a;
import i2.c;
import java.util.Arrays;
import w2.o;

public final class LocationAvailability extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new a();

    /* renamed from: r  reason: collision with root package name */
    public static final LocationAvailability f5758r = new LocationAvailability(0, 1, 1, 0, (o[]) null, true);

    /* renamed from: s  reason: collision with root package name */
    public static final LocationAvailability f5759s = new LocationAvailability(1000, 1, 1, 0, (o[]) null, false);

    /* renamed from: m  reason: collision with root package name */
    private final int f5760m;

    /* renamed from: n  reason: collision with root package name */
    private final int f5761n;

    /* renamed from: o  reason: collision with root package name */
    private final long f5762o;

    /* renamed from: p  reason: collision with root package name */
    int f5763p;

    /* renamed from: q  reason: collision with root package name */
    private final o[] f5764q;

    LocationAvailability(int i10, int i11, int i12, long j10, o[] oVarArr, boolean z9) {
        this.f5763p = i10 < 1000 ? 0 : 1000;
        this.f5760m = i11;
        this.f5761n = i12;
        this.f5762o = j10;
        this.f5764q = oVarArr;
    }

    public boolean d() {
        return this.f5763p < 1000;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            return this.f5760m == locationAvailability.f5760m && this.f5761n == locationAvailability.f5761n && this.f5762o == locationAvailability.f5762o && this.f5763p == locationAvailability.f5763p && Arrays.equals(this.f5764q, locationAvailability.f5764q);
        }
    }

    public int hashCode() {
        return h2.o.b(Integer.valueOf(this.f5763p));
    }

    public String toString() {
        boolean d10 = d();
        return "LocationAvailability[" + d10 + "]";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.m(parcel, 1, this.f5760m);
        c.m(parcel, 2, this.f5761n);
        c.q(parcel, 3, this.f5762o);
        c.m(parcel, 4, this.f5763p);
        c.v(parcel, 5, this.f5764q, i10, false);
        c.c(parcel, 6, d());
        c.b(parcel, a10);
    }
}
