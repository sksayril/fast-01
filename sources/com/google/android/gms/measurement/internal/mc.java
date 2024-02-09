package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import i2.b;

public final class mc implements Parcelable.Creator<nc> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = b.A(parcel);
        String str = null;
        Long l10 = null;
        Float f10 = null;
        String str2 = null;
        String str3 = null;
        Double d10 = null;
        long j10 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            switch (b.j(r9)) {
                case 1:
                    i10 = b.t(parcel2, r9);
                    break;
                case 2:
                    str = b.e(parcel2, r9);
                    break;
                case 3:
                    j10 = b.w(parcel2, r9);
                    break;
                case 4:
                    l10 = b.x(parcel2, r9);
                    break;
                case 5:
                    f10 = b.q(parcel2, r9);
                    break;
                case 6:
                    str2 = b.e(parcel2, r9);
                    break;
                case 7:
                    str3 = b.e(parcel2, r9);
                    break;
                case 8:
                    d10 = b.o(parcel2, r9);
                    break;
                default:
                    b.z(parcel2, r9);
                    break;
            }
        }
        b.i(parcel2, A);
        return new nc(i10, str, j10, l10, f10, str2, str3, d10);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new nc[i10];
    }
}
