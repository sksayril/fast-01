package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import h2.o;
import h2.p;
import i2.a;
import i2.c;
import z2.k0;

public final class LatLngBounds extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new k0();

    /* renamed from: m  reason: collision with root package name */
    public final LatLng f5820m;

    /* renamed from: n  reason: collision with root package name */
    public final LatLng f5821n;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        p.k(latLng, "southwest must not be null.");
        p.k(latLng2, "northeast must not be null.");
        double d10 = latLng2.f5818m;
        double d11 = latLng.f5818m;
        p.c(d10 >= d11, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d11), Double.valueOf(latLng2.f5818m));
        this.f5820m = latLng;
        this.f5821n = latLng2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f5820m.equals(latLngBounds.f5820m) && this.f5821n.equals(latLngBounds.f5821n);
    }

    public int hashCode() {
        return o.b(this.f5820m, this.f5821n);
    }

    public String toString() {
        return o.c(this).a("southwest", this.f5820m).a("northeast", this.f5821n).toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.s(parcel, 2, this.f5820m, i10, false);
        c.s(parcel, 3, this.f5821n, i10, false);
        c.b(parcel, a10);
    }
}
