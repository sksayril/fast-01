package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import i2.b;

public final class i2 implements Parcelable.Creator<f2> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int A = b.A(parcel);
        long j10 = 0;
        long j11 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z9 = false;
        while (parcel.dataPosition() < A) {
            int r9 = b.r(parcel);
            switch (b.j(r9)) {
                case 1:
                    j10 = b.w(parcel2, r9);
                    break;
                case 2:
                    j11 = b.w(parcel2, r9);
                    break;
                case 3:
                    z9 = b.k(parcel2, r9);
                    break;
                case 4:
                    str = b.e(parcel2, r9);
                    break;
                case 5:
                    str2 = b.e(parcel2, r9);
                    break;
                case 6:
                    str3 = b.e(parcel2, r9);
                    break;
                case 7:
                    bundle = b.a(parcel2, r9);
                    break;
                case 8:
                    str4 = b.e(parcel2, r9);
                    break;
                default:
                    b.z(parcel2, r9);
                    break;
            }
        }
        b.i(parcel2, A);
        return new f2(j10, j11, z9, str, str2, str3, bundle, str4);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new f2[i10];
    }
}
