package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import i2.b;
import w2.o;

public final class a implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = b.A(parcel);
        long j10 = 0;
        o[] oVarArr = null;
        int i10 = 1000;
        int i11 = 1;
        int i12 = 1;
        boolean z9 = false;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            switch (b.j(r9)) {
                case 1:
                    i11 = b.t(parcel2, r9);
                    break;
                case 2:
                    i12 = b.t(parcel2, r9);
                    break;
                case 3:
                    j10 = b.w(parcel2, r9);
                    break;
                case 4:
                    i10 = b.t(parcel2, r9);
                    break;
                case 5:
                    oVarArr = (o[]) b.g(parcel2, r9, o.CREATOR);
                    break;
                case 6:
                    z9 = b.k(parcel2, r9);
                    break;
                default:
                    b.z(parcel2, r9);
                    break;
            }
        }
        b.i(parcel2, A);
        return new LocationAvailability(i10, i11, i12, j10, oVarArr, z9);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new LocationAvailability[i10];
    }
}
