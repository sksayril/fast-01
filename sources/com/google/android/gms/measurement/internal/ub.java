package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import i2.b;

public final class ub implements Parcelable.Creator<rb> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = b.A(parcel);
        String str = null;
        long j10 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            int j11 = b.j(r9);
            if (j11 == 1) {
                str = b.e(parcel, r9);
            } else if (j11 == 2) {
                j10 = b.w(parcel, r9);
            } else if (j11 != 3) {
                b.z(parcel, r9);
            } else {
                i10 = b.t(parcel, r9);
            }
        }
        b.i(parcel, A);
        return new rb(str, j10, i10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new rb[i10];
    }
}
