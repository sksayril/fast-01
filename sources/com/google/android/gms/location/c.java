package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import i2.b;
import java.util.List;

public final class c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        List list = LocationResult.f5794n;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            if (b.j(r9) != 1) {
                b.z(parcel, r9);
            } else {
                list = b.h(parcel, r9, Location.CREATOR);
            }
        }
        b.i(parcel, A);
        return new LocationResult(list);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationResult[i10];
    }
}
