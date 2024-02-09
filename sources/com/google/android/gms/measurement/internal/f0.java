package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import i2.b;

public final class f0 implements Parcelable.Creator<d0> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            if (b.j(r9) != 2) {
                b.z(parcel, r9);
            } else {
                bundle = b.a(parcel, r9);
            }
        }
        b.i(parcel, A);
        return new d0(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new d0[i10];
    }
}
