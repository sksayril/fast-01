package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

public final class b implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A = i2.b.A(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        e2.b bVar = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < A) {
            int r9 = i2.b.r(parcel);
            int j10 = i2.b.j(r9);
            if (j10 == 1) {
                i11 = i2.b.t(parcel, r9);
            } else if (j10 == 2) {
                str = i2.b.e(parcel, r9);
            } else if (j10 == 3) {
                pendingIntent = (PendingIntent) i2.b.d(parcel, r9, PendingIntent.CREATOR);
            } else if (j10 == 4) {
                bVar = (e2.b) i2.b.d(parcel, r9, e2.b.CREATOR);
            } else if (j10 != 1000) {
                i2.b.z(parcel, r9);
            } else {
                i10 = i2.b.t(parcel, r9);
            }
        }
        i2.b.i(parcel, A);
        return new Status(i10, i11, str, pendingIntent, bVar);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
