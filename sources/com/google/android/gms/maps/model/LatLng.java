package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i2.a;
import i2.c;
import z2.l0;

public final class LatLng extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new l0();

    /* renamed from: m  reason: collision with root package name */
    public final double f5818m;

    /* renamed from: n  reason: collision with root package name */
    public final double f5819n;

    public LatLng(double d10, double d11) {
        this.f5819n = (d11 < -180.0d || d11 >= 180.0d) ? ((((d11 - 0.02490234375d) % 360.0d) + 360.0d) % 360.0d) - 0.02490234375d : d11;
        this.f5818m = Math.max(-90.0d, Math.min(90.0d, d10));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f5818m) == Double.doubleToLongBits(latLng.f5818m) && Double.doubleToLongBits(this.f5819n) == Double.doubleToLongBits(latLng.f5819n);
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f5818m);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f5819n);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        double d10 = this.f5818m;
        double d11 = this.f5819n;
        return "lat/lng: (" + d10 + "," + d11 + ")";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.h(parcel, 2, this.f5818m);
        c.h(parcel, 3, this.f5819n);
        c.b(parcel, a10);
    }
}
